package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class MediaCodecPlayer {
    private final MediaCodec codec;
    private boolean done;
    private final MediaExtractor extractor;
    private final int h;
    private final int o;
    private final Surface outputSurface;
    private final int w;
    private boolean first = true;
    private long lastPositionUs = 0;

    public MediaCodecPlayer(String str, Surface surface) {
        MediaFormat mediaFormat;
        this.outputSurface = surface;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.extractor = mediaExtractor;
        mediaExtractor.setDataSource(str);
        int i10 = 0;
        while (true) {
            if (i10 >= this.extractor.getTrackCount()) {
                mediaFormat = null;
                i10 = -1;
                break;
            } else {
                mediaFormat = this.extractor.getTrackFormat(i10);
                if (mediaFormat.getString("mime").startsWith("video/")) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (i10 == -1 || mediaFormat == null) {
            throw new IllegalArgumentException("No video track found in file.");
        }
        this.extractor.selectTrack(i10);
        this.w = mediaFormat.getInteger("width");
        this.h = mediaFormat.getInteger("height");
        if (mediaFormat.containsKey("rotation-degrees")) {
            this.o = mediaFormat.getInteger("rotation-degrees");
        } else {
            this.o = 0;
        }
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
        this.codec = createDecoderByType;
        createDecoderByType.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        createDecoderByType.start();
    }

    public boolean ensure(long j10) {
        ByteBuffer inputBuffer;
        if (this.done) {
            return false;
        }
        boolean z4 = this.first;
        this.first = false;
        long j11 = j10 * 1000;
        if (!z4 && j11 <= this.lastPositionUs) {
            return false;
        }
        if (this.extractor.getSampleTime() > j11 || (z4 && j11 > 1000000)) {
            this.extractor.seekTo(j11, 0);
        }
        while (true) {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(10000L);
            if (dequeueInputBuffer >= 0 && (inputBuffer = this.codec.getInputBuffer(dequeueInputBuffer)) != null) {
                int readSampleData = this.extractor.readSampleData(inputBuffer, 0);
                if (readSampleData <= 0) {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                    release();
                    return false;
                }
                this.codec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.extractor.getSampleTime(), this.extractor.getSampleFlags());
                this.extractor.advance();
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 10000L);
            if (dequeueOutputBuffer >= 0) {
                long j12 = bufferInfo.presentationTimeUs;
                if (j12 >= j11 - 16000) {
                    this.lastPositionUs = j12;
                    this.codec.releaseOutputBuffer(dequeueOutputBuffer, true);
                    return true;
                }
                this.codec.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
        }
    }

    public int getHeight() {
        return this.h;
    }

    public int getOrientation() {
        return this.o;
    }

    public int getOrientedHeight() {
        return (this.o / 90) % 2 == 1 ? this.w : this.h;
    }

    public int getOrientedWidth() {
        return (this.o / 90) % 2 == 1 ? this.h : this.w;
    }

    public int getWidth() {
        return this.w;
    }

    public void release() {
        if (this.done) {
            return;
        }
        this.done = true;
        MediaCodec mediaCodec = this.codec;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.codec.release();
        }
        MediaExtractor mediaExtractor = this.extractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
    }
}
