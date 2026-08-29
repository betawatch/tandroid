package a4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import f5.d0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c0 implements n {
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    public c0(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (d0.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // a4.n
    public final void a(g5.i iVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, iVar, 1), handler);
    }

    @Override // a4.n
    public final void b(int i10, m3.d dVar, long j10) {
        this.a.queueSecureInputBuffer(i10, 0, dVar.i, j10, 0);
    }

    @Override // a4.n
    public final void c(long j10, int i10, int i11, int i12) {
        this.a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // a4.n
    public final void d(int i10, long j10) {
        this.a.releaseOutputBuffer(i10, j10);
    }

    @Override // a4.n
    public final int e() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // a4.n
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

    @Override // a4.n
    public final void flush() {
        this.a.flush();
    }

    @Override // a4.n
    public final void g(int i10) {
        this.a.setVideoScalingMode(i10);
    }

    @Override // a4.n
    public final ByteBuffer getInputBuffer(int i10) {
        return d0.a >= 21 ? this.a.getInputBuffer(i10) : this.b[i10];
    }

    @Override // a4.n
    public final ByteBuffer getOutputBuffer(int i10) {
        return d0.a >= 21 ? this.a.getOutputBuffer(i10) : this.c[i10];
    }

    @Override // a4.n
    public final MediaFormat getOutputFormat() {
        return this.a.getOutputFormat();
    }

    @Override // a4.n
    public final void h(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // a4.n
    public final void release() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    @Override // a4.n
    public final void releaseOutputBuffer(int i10, boolean z10) {
        this.a.releaseOutputBuffer(i10, z10);
    }

    @Override // a4.n
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }
}
