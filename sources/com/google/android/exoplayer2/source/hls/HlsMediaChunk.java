package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.hls.HlsChunkSource;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.upstream.CmcdData$Factory;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.LiteMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class HlsMediaChunk extends MediaChunk {
    private static final AtomicInteger uidSource = new AtomicInteger();
    public final int discontinuitySequenceNumber;
    private final DrmInitData drmInitData;
    private HlsMediaChunkExtractor extractor;
    private final HlsExtractorFactory extractorFactory;
    private boolean extractorInvalidated;
    private final boolean hasGapTag;
    private final Id3Decoder id3Decoder;
    private boolean initDataLoadRequired;
    private final DataSource initDataSource;
    private final DataSpec initDataSpec;
    private final boolean initSegmentEncrypted;
    private final boolean isPrimaryTimestampSource;
    private boolean isPublished;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private final boolean mediaSegmentEncrypted;
    private final List muxedCaptionFormats;
    private int nextLoadPosition;
    private HlsSampleStreamWrapper output;
    public final int partIndex;
    private final PlayerId playerId;
    public final Uri playlistUrl;
    private final HlsMediaChunkExtractor previousExtractor;
    private ImmutableList sampleQueueFirstSampleIndices;
    private final ParsableByteArray scratchId3Data;
    public final boolean shouldSpliceIn;
    private final TimestampAdjuster timestampAdjuster;
    private final long timestampAdjusterInitializationTimeoutMs;
    public final int uid;

    private HlsMediaChunk(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, DataSpec dataSpec, Format format, boolean z, DataSource dataSource2, DataSpec dataSpec2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, TimestampAdjuster timestampAdjuster, long j4, DrmInitData drmInitData, HlsMediaChunkExtractor hlsMediaChunkExtractor, Id3Decoder id3Decoder, ParsableByteArray parsableByteArray, boolean z6, PlayerId playerId) {
        super(dataSource, dataSpec, format, i, obj, j, j2, j3);
        this.mediaSegmentEncrypted = z;
        this.partIndex = i2;
        this.isPublished = z3;
        this.discontinuitySequenceNumber = i3;
        this.initDataSpec = dataSpec2;
        this.initDataSource = dataSource2;
        this.initDataLoadRequired = dataSpec2 != null;
        this.initSegmentEncrypted = z2;
        this.playlistUrl = uri;
        this.isPrimaryTimestampSource = z5;
        this.timestampAdjuster = timestampAdjuster;
        this.timestampAdjusterInitializationTimeoutMs = j4;
        this.hasGapTag = z4;
        this.extractorFactory = hlsExtractorFactory;
        this.muxedCaptionFormats = list;
        this.drmInitData = drmInitData;
        this.previousExtractor = hlsMediaChunkExtractor;
        this.id3Decoder = id3Decoder;
        this.scratchId3Data = parsableByteArray;
        this.shouldSpliceIn = z6;
        this.playerId = playerId;
        this.sampleQueueFirstSampleIndices = ImmutableList.of();
        this.uid = uidSource.getAndIncrement();
    }

    private static DataSource buildDataSource(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return dataSource;
        }
        Assertions.checkNotNull(bArr2);
        return new Aes128DataSource(dataSource, bArr, bArr2);
    }

    public static HlsMediaChunk createInstance(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, Format format, long j, HlsMediaPlaylist hlsMediaPlaylist, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, Uri uri, List list, int i, Object obj, boolean z, TimestampAdjusterProvider timestampAdjusterProvider, long j2, HlsMediaChunk hlsMediaChunk, byte[] bArr, byte[] bArr2, boolean z2, PlayerId playerId, CmcdData$Factory cmcdData$Factory) {
        DataSpec dataSpec;
        DataSource dataSource2;
        boolean z3;
        Id3Decoder id3Decoder;
        ParsableByteArray parsableByteArray;
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        DataSpec build = new DataSpec.Builder().setUri(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segmentBase.url)).setPosition(segmentBase.byteRangeOffset).setLength(segmentBase.byteRangeLength).setFlags(segmentBaseHolder.isPreload ? 8 : 0).build();
        boolean z4 = bArr != null;
        DataSource buildDataSource = buildDataSource(dataSource, bArr, z4 ? getEncryptionIvArray((String) Assertions.checkNotNull(segmentBase.encryptionIV)) : null);
        HlsMediaPlaylist.Segment segment = segmentBase.initializationSegment;
        if (segment != null) {
            boolean z5 = bArr2 != null;
            byte[] encryptionIvArray = z5 ? getEncryptionIvArray((String) Assertions.checkNotNull(segment.encryptionIV)) : null;
            dataSpec = new DataSpec.Builder().setUri(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segment.url)).setPosition(segment.byteRangeOffset).setLength(segment.byteRangeLength).build();
            z3 = z5;
            dataSource2 = buildDataSource(dataSource, bArr2, encryptionIvArray);
        } else {
            dataSpec = null;
            dataSource2 = null;
            z3 = false;
        }
        long j3 = j + segmentBase.relativeStartTimeUs;
        long j4 = j3 + segmentBase.durationUs;
        int i2 = hlsMediaPlaylist.discontinuitySequence + segmentBase.relativeDiscontinuitySequence;
        if (hlsMediaChunk != null) {
            DataSpec dataSpec2 = hlsMediaChunk.initDataSpec;
            boolean z6 = dataSpec == dataSpec2 || (dataSpec != null && dataSpec2 != null && dataSpec.uri.equals(dataSpec2.uri) && dataSpec.position == hlsMediaChunk.initDataSpec.position);
            boolean z7 = uri.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted;
            Id3Decoder id3Decoder2 = hlsMediaChunk.id3Decoder;
            ParsableByteArray parsableByteArray2 = hlsMediaChunk.scratchId3Data;
            hlsMediaChunkExtractor = (z6 && z7 && !hlsMediaChunk.extractorInvalidated && hlsMediaChunk.discontinuitySequenceNumber == i2) ? hlsMediaChunk.extractor : null;
            id3Decoder = id3Decoder2;
            parsableByteArray = parsableByteArray2;
        } else {
            id3Decoder = new Id3Decoder();
            parsableByteArray = new ParsableByteArray(10);
            hlsMediaChunkExtractor = null;
        }
        return new HlsMediaChunk(hlsExtractorFactory, buildDataSource, build, format, z4, dataSource2, dataSpec, z3, uri, list, i, obj, j3, j4, segmentBaseHolder.mediaSequence, segmentBaseHolder.partIndex, !segmentBaseHolder.isPreload, i2, segmentBase.hasGapTag, z, timestampAdjusterProvider.getAdjuster(i2), j2, segmentBase.drmInitData, hlsMediaChunkExtractor, id3Decoder, parsableByteArray, z2, playerId);
    }

    private void feedDataToExtractor(DataSource dataSource, DataSpec dataSpec, boolean z, boolean z2) {
        DataSpec subrange;
        long position;
        if (z) {
            r0 = this.nextLoadPosition != 0;
            subrange = dataSpec;
        } else {
            subrange = dataSpec.subrange(this.nextLoadPosition);
        }
        try {
            DefaultExtractorInput prepareExtraction = prepareExtraction(dataSource, subrange, z2);
            if (r0) {
                prepareExtraction.skipFully(this.nextLoadPosition);
            }
            while (!this.loadCanceled && this.extractor.read(prepareExtraction)) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.trackFormat.roleFlags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) == 0) {
                            throw e;
                        }
                        this.extractor.onTruncatedSegmentParsed();
                        position = prepareExtraction.getPosition();
                    }
                } catch (Throwable th) {
                    this.nextLoadPosition = (int) (prepareExtraction.getPosition() - dataSpec.position);
                    throw th;
                }
            }
            position = prepareExtraction.getPosition();
            this.nextLoadPosition = (int) (position - dataSpec.position);
        } finally {
            DataSourceUtil.closeQuietly(dataSource);
        }
    }

    private static byte[] getEncryptionIvArray(String str) {
        if (Ascii.toLowerCase(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean isIndependent(HlsChunkSource.SegmentBaseHolder segmentBaseHolder, HlsMediaPlaylist hlsMediaPlaylist) {
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        return segmentBase instanceof HlsMediaPlaylist.Part ? ((HlsMediaPlaylist.Part) segmentBase).isIndependent || (segmentBaseHolder.partIndex == 0 && hlsMediaPlaylist.hasIndependentSegments) : hlsMediaPlaylist.hasIndependentSegments;
    }

    private void loadMedia() {
        feedDataToExtractor(this.dataSource, this.dataSpec, this.mediaSegmentEncrypted, true);
    }

    private void maybeLoadInitData() {
        if (this.initDataLoadRequired) {
            Assertions.checkNotNull(this.initDataSource);
            Assertions.checkNotNull(this.initDataSpec);
            feedDataToExtractor(this.initDataSource, this.initDataSpec, this.initSegmentEncrypted, false);
            this.nextLoadPosition = 0;
            this.initDataLoadRequired = false;
        }
    }

    private long peekId3PrivTimestamp(ExtractorInput extractorInput) {
        extractorInput.resetPeekPosition();
        try {
            this.scratchId3Data.reset(10);
            extractorInput.peekFully(this.scratchId3Data.getData(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.scratchId3Data.readUnsignedInt24() != 4801587) {
            return -9223372036854775807L;
        }
        this.scratchId3Data.skipBytes(3);
        int readSynchSafeInt = this.scratchId3Data.readSynchSafeInt();
        int i = readSynchSafeInt + 10;
        if (i > this.scratchId3Data.capacity()) {
            byte[] data = this.scratchId3Data.getData();
            this.scratchId3Data.reset(i);
            System.arraycopy(data, 0, this.scratchId3Data.getData(), 0, 10);
        }
        extractorInput.peekFully(this.scratchId3Data.getData(), 10, readSynchSafeInt);
        Metadata decode = this.id3Decoder.decode(this.scratchId3Data.getData(), readSynchSafeInt);
        if (decode == null) {
            return -9223372036854775807L;
        }
        int length = decode.length();
        for (int i2 = 0; i2 < length; i2++) {
            Metadata.Entry entry = decode.get(i2);
            if (entry instanceof PrivFrame) {
                PrivFrame privFrame = (PrivFrame) entry;
                if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.owner)) {
                    System.arraycopy(privFrame.privateData, 0, this.scratchId3Data.getData(), 0, 8);
                    this.scratchId3Data.setPosition(0);
                    this.scratchId3Data.setLimit(8);
                    return this.scratchId3Data.readLong() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private DefaultExtractorInput prepareExtraction(DataSource dataSource, DataSpec dataSpec, boolean z) {
        HlsSampleStreamWrapper hlsSampleStreamWrapper;
        long j;
        long open = dataSource.open(dataSpec);
        if (z) {
            try {
                this.timestampAdjuster.sharedInitializeOrWait(this.isPrimaryTimestampSource, this.startTimeUs, this.timestampAdjusterInitializationTimeoutMs);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, dataSpec.position, open);
        if (this.extractor == null) {
            long peekId3PrivTimestamp = peekId3PrivTimestamp(defaultExtractorInput);
            defaultExtractorInput.resetPeekPosition();
            HlsMediaChunkExtractor hlsMediaChunkExtractor = this.previousExtractor;
            HlsMediaChunkExtractor recreate = hlsMediaChunkExtractor != null ? hlsMediaChunkExtractor.recreate() : this.extractorFactory.createExtractor(dataSpec.uri, this.trackFormat, this.muxedCaptionFormats, this.timestampAdjuster, dataSource.getResponseHeaders(), defaultExtractorInput, this.playerId);
            this.extractor = recreate;
            if (recreate.isPackedAudioExtractor()) {
                hlsSampleStreamWrapper = this.output;
                j = peekId3PrivTimestamp != -9223372036854775807L ? this.timestampAdjuster.adjustTsTimestamp(peekId3PrivTimestamp) : this.startTimeUs;
            } else {
                hlsSampleStreamWrapper = this.output;
                j = 0;
            }
            hlsSampleStreamWrapper.setSampleOffsetUs(j);
            this.output.onNewExtractor();
            this.extractor.init(this.output);
        }
        this.output.setDrmInitData(this.drmInitData);
        return defaultExtractorInput;
    }

    public static boolean shouldSpliceIn(HlsMediaChunk hlsMediaChunk, Uri uri, HlsMediaPlaylist hlsMediaPlaylist, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, long j) {
        if (hlsMediaChunk == null) {
            return false;
        }
        if (uri.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted) {
            return false;
        }
        return !isIndependent(segmentBaseHolder, hlsMediaPlaylist) || j + segmentBaseHolder.segmentBase.relativeStartTimeUs < hlsMediaChunk.endTimeUs;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public int getFirstSampleIndex(int i) {
        Assertions.checkState(!this.shouldSpliceIn);
        if (i >= this.sampleQueueFirstSampleIndices.size()) {
            return 0;
        }
        return ((Integer) this.sampleQueueFirstSampleIndices.get(i)).intValue();
    }

    public void init(HlsSampleStreamWrapper hlsSampleStreamWrapper, ImmutableList immutableList) {
        this.output = hlsSampleStreamWrapper;
        this.sampleQueueFirstSampleIndices = immutableList;
    }

    public void invalidateExtractor() {
        this.extractorInvalidated = true;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    public boolean isPublished() {
        return this.isPublished;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() {
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        Assertions.checkNotNull(this.output);
        if (this.extractor == null && (hlsMediaChunkExtractor = this.previousExtractor) != null && hlsMediaChunkExtractor.isReusable()) {
            this.extractor = this.previousExtractor;
            this.initDataLoadRequired = false;
        }
        maybeLoadInitData();
        if (this.loadCanceled) {
            return;
        }
        if (!this.hasGapTag) {
            loadMedia();
        }
        this.loadCompleted = !this.loadCanceled;
    }

    public void publish() {
        this.isPublished = true;
    }
}
