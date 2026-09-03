package d4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import h5.d0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class z implements k {
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    public z(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (d0.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // d4.k
    public final void a(long j10, int i10, int i11, int i12) {
        this.a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // d4.k
    public final void b(int i10, long j10) {
        this.a.releaseOutputBuffer(i10, j10);
    }

    @Override // d4.k
    public final void c(int i10, n3.d dVar, long j10) {
        this.a.queueSecureInputBuffer(i10, 0, dVar.i, j10, 0);
    }

    @Override // d4.k
    public final int d() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // d4.k
    public final void e(i5.i iVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, iVar, 1), handler);
    }

    @Override // d4.k
    public final int f(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && d0.a < 21) {
                this.c = mediaCodec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // d4.k
    public final void flush() {
        this.a.flush();
    }

    @Override // d4.k
    public final void g(int i10) {
        this.a.setVideoScalingMode(i10);
    }

    @Override // d4.k
    public final ByteBuffer getInputBuffer(int i10) {
        return d0.a >= 21 ? this.a.getInputBuffer(i10) : this.b[i10];
    }

    @Override // d4.k
    public final ByteBuffer getOutputBuffer(int i10) {
        return d0.a >= 21 ? this.a.getOutputBuffer(i10) : this.c[i10];
    }

    @Override // d4.k
    public final MediaFormat getOutputFormat() {
        return this.a.getOutputFormat();
    }

    @Override // d4.k
    public final void h(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // d4.k
    public final void release() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    @Override // d4.k
    public final void releaseOutputBuffer(int i10, boolean z4) {
        this.a.releaseOutputBuffer(i10, z4);
    }

    @Override // d4.k
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }
}
