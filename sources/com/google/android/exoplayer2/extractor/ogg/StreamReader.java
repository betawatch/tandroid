package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class StreamReader {
    private long currentGranule;
    private ExtractorOutput extractorOutput;
    private boolean formatSet;
    private long lengthOfReadPacket;
    private OggSeeker oggSeeker;
    private long payloadStartPosition;
    private int sampleRate;
    private boolean seekMapSet;
    private int state;
    private long targetGranule;
    private TrackOutput trackOutput;
    private final OggPacket oggPacket = new OggPacket();
    private SetupData setupData = new SetupData();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SetupData {
        Format format;
        OggSeeker oggSeeker;

        SetupData() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class UnseekableOggSeeker implements OggSeeker {
        private UnseekableOggSeeker() {
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public SeekMap createSeekMap() {
            return new SeekMap.Unseekable(-9223372036854775807L);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public long read(ExtractorInput extractorInput) {
            return -1L;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public void startSeek(long j) {
        }
    }

    private void assertInitialized() {
        Assertions.checkStateNotNull(this.trackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    private boolean readHeaders(ExtractorInput extractorInput) {
        while (this.oggPacket.populate(extractorInput)) {
            this.lengthOfReadPacket = extractorInput.getPosition() - this.payloadStartPosition;
            if (!readHeaders(this.oggPacket.getPayload(), this.payloadStartPosition, this.setupData)) {
                return true;
            }
            this.payloadStartPosition = extractorInput.getPosition();
        }
        this.state = 3;
        return false;
    }

    private int readHeadersAndUpdateState(ExtractorInput extractorInput) {
        if (!readHeaders(extractorInput)) {
            return -1;
        }
        Format format = this.setupData.format;
        this.sampleRate = format.sampleRate;
        if (!this.formatSet) {
            this.trackOutput.format(format);
            this.formatSet = true;
        }
        OggSeeker oggSeeker = this.setupData.oggSeeker;
        if (oggSeeker == null) {
            if (extractorInput.getLength() != -1) {
                OggPageHeader pageHeader = this.oggPacket.getPageHeader();
                this.oggSeeker = new DefaultOggSeeker(this, this.payloadStartPosition, extractorInput.getLength(), pageHeader.headerSize + pageHeader.bodySize, pageHeader.granulePosition, (pageHeader.type & 4) != 0);
                this.state = 2;
                this.oggPacket.trimPayload();
                return 0;
            }
            oggSeeker = new UnseekableOggSeeker();
        }
        this.oggSeeker = oggSeeker;
        this.state = 2;
        this.oggPacket.trimPayload();
        return 0;
    }

    private int readPayload(ExtractorInput extractorInput, PositionHolder positionHolder) {
        long read = this.oggSeeker.read(extractorInput);
        if (read >= 0) {
            positionHolder.position = read;
            return 1;
        }
        if (read < -1) {
            onSeekEnd(-(read + 2));
        }
        if (!this.seekMapSet) {
            this.extractorOutput.seekMap((SeekMap) Assertions.checkStateNotNull(this.oggSeeker.createSeekMap()));
            this.seekMapSet = true;
        }
        if (this.lengthOfReadPacket <= 0 && !this.oggPacket.populate(extractorInput)) {
            this.state = 3;
            return -1;
        }
        this.lengthOfReadPacket = 0L;
        ParsableByteArray payload = this.oggPacket.getPayload();
        long preparePayload = preparePayload(payload);
        if (preparePayload >= 0) {
            long j = this.currentGranule;
            if (j + preparePayload >= this.targetGranule) {
                long convertGranuleToTime = convertGranuleToTime(j);
                this.trackOutput.sampleData(payload, payload.limit());
                this.trackOutput.sampleMetadata(convertGranuleToTime, 1, payload.limit(), 0, null);
                this.targetGranule = -1L;
            }
        }
        this.currentGranule += preparePayload;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long convertGranuleToTime(long j) {
        return (j * 1000000) / this.sampleRate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long convertTimeToGranule(long j) {
        return (this.sampleRate * j) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void init(ExtractorOutput extractorOutput, TrackOutput trackOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = trackOutput;
        reset(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onSeekEnd(long j) {
        this.currentGranule = j;
    }

    protected abstract long preparePayload(ParsableByteArray parsableByteArray);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        assertInitialized();
        int i = this.state;
        if (i == 0) {
            return readHeadersAndUpdateState(extractorInput);
        }
        if (i == 1) {
            extractorInput.skipFully((int) this.payloadStartPosition);
            this.state = 2;
            return 0;
        }
        if (i == 2) {
            Util.castNonNull(this.oggSeeker);
            return readPayload(extractorInput, positionHolder);
        }
        if (i == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    protected abstract boolean readHeaders(ParsableByteArray parsableByteArray, long j, SetupData setupData);

    /* JADX INFO: Access modifiers changed from: protected */
    public void reset(boolean z) {
        int i;
        if (z) {
            this.setupData = new SetupData();
            this.payloadStartPosition = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.state = i;
        this.targetGranule = -1L;
        this.currentGranule = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void seek(long j, long j2) {
        this.oggPacket.reset();
        if (j == 0) {
            reset(!this.seekMapSet);
        } else if (this.state != 0) {
            this.targetGranule = convertTimeToGranule(j2);
            ((OggSeeker) Util.castNonNull(this.oggSeeker)).startSeek(this.targetGranule);
            this.state = 2;
        }
    }
}
