package d4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import c2.a1;
import h5.d0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c implements k {
    public final MediaCodec a;
    public final f b;
    public final e c;
    public boolean d;
    public int e = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.a = mediaCodec;
        this.b = new f(handlerThread);
        this.c = new e(mediaCodec, handlerThread2);
    }

    public static void i(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        f fVar = cVar.b;
        MediaCodec mediaCodec = cVar.a;
        fVar.b(mediaCodec);
        h5.a.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        h5.a.q();
        e eVar = cVar.c;
        HandlerThread handlerThread = eVar.b;
        if (!eVar.f) {
            handlerThread.start();
            eVar.c = new androidx.mediarouter.app.d(eVar, handlerThread.getLooper(), 5);
            eVar.f = true;
        }
        h5.a.c("startCodec");
        mediaCodec.start();
        h5.a.q();
        cVar.e = 1;
    }

    public static String j(int i10, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i10 == 1) {
            sb.append("Audio");
        } else if (i10 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i10);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // d4.k
    public final void a(long j10, int i10, int i11, int i12) {
        e eVar = this.c;
        RuntimeException runtimeException = (RuntimeException) eVar.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        d b10 = e.b();
        b10.a = i10;
        b10.b = i11;
        b10.d = j10;
        b10.e = i12;
        androidx.mediarouter.app.d dVar = eVar.c;
        int i13 = d0.a;
        dVar.obtainMessage(0, b10).sendToTarget();
    }

    @Override // d4.k
    public final void b(int i10, long j10) {
        this.a.releaseOutputBuffer(i10, j10);
    }

    @Override // d4.k
    public final void c(int i10, n3.d dVar, long j10) {
        this.c.c(i10, dVar, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[Catch: all -> 0x0031, DONT_GENERATE, TryCatch #0 {all -> 0x0031, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0024, B:18:0x002f, B:21:0x0033, B:26:0x0042, B:28:0x003e, B:31:0x0044, B:32:0x0046, B:33:0x0047, B:34:0x0049), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0024, B:18:0x002f, B:21:0x0033, B:26:0x0042, B:28:0x003e, B:31:0x0044, B:32:0x0046, B:33:0x0047, B:34:0x0049), top: B:5:0x0012 }] */
    @Override // d4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d() {
        boolean z4;
        RuntimeException runtimeException = (RuntimeException) this.c.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        f fVar = this.b;
        synchronized (fVar.a) {
            try {
                IllegalStateException illegalStateException = fVar.m;
                if (illegalStateException != null) {
                    fVar.m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.j;
                if (codecException != null) {
                    fVar.j = null;
                    throw codecException;
                }
                boolean z10 = true;
                if (fVar.k <= 0 && !fVar.l) {
                    z4 = false;
                    int i10 = -1;
                    if (!z4) {
                        return -1;
                    }
                    a1 a1Var = fVar.d;
                    if (a1Var.c != 0) {
                        z10 = false;
                    }
                    if (!z10) {
                        i10 = a1Var.e();
                    }
                    return i10;
                }
                z4 = true;
                int i102 = -1;
                if (!z4) {
                }
            } finally {
            }
        }
    }

    @Override // d4.k
    public final void e(i5.i iVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, iVar, 0), handler);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[Catch: all -> 0x0031, DONT_GENERATE, TryCatch #0 {all -> 0x0031, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0024, B:18:0x002f, B:21:0x0034, B:25:0x003e, B:27:0x0040, B:29:0x0046, B:30:0x006d, B:34:0x0063, B:37:0x006f, B:38:0x0071, B:39:0x0072, B:40:0x0074), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x001a, B:12:0x0024, B:18:0x002f, B:21:0x0034, B:25:0x003e, B:27:0x0040, B:29:0x0046, B:30:0x006d, B:34:0x0063, B:37:0x006f, B:38:0x0071, B:39:0x0072, B:40:0x0074), top: B:5:0x0012 }] */
    @Override // d4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(MediaCodec.BufferInfo bufferInfo) {
        boolean z4;
        RuntimeException runtimeException = (RuntimeException) this.c.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        f fVar = this.b;
        synchronized (fVar.a) {
            try {
                IllegalStateException illegalStateException = fVar.m;
                if (illegalStateException != null) {
                    fVar.m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.j;
                if (codecException != null) {
                    fVar.j = null;
                    throw codecException;
                }
                boolean z10 = true;
                if (fVar.k <= 0 && !fVar.l) {
                    z4 = false;
                    if (!z4) {
                        return -1;
                    }
                    a1 a1Var = fVar.e;
                    if (a1Var.c != 0) {
                        z10 = false;
                    }
                    if (z10) {
                        return -1;
                    }
                    int e6 = a1Var.e();
                    if (e6 >= 0) {
                        h5.a.j(fVar.h);
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) fVar.f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (e6 == -2) {
                        fVar.h = (MediaFormat) fVar.g.remove();
                    }
                    return e6;
                }
                z4 = true;
                if (!z4) {
                }
            } finally {
            }
        }
    }

    @Override // d4.k
    public final void flush() {
        this.c.a();
        this.a.flush();
        f fVar = this.b;
        synchronized (fVar.a) {
            fVar.k++;
            Handler handler = fVar.c;
            int i10 = d0.a;
            handler.post(new ag.e(fVar, 16));
        }
        this.a.start();
    }

    @Override // d4.k
    public final void g(int i10) {
        this.a.setVideoScalingMode(i10);
    }

    @Override // d4.k
    public final ByteBuffer getInputBuffer(int i10) {
        return this.a.getInputBuffer(i10);
    }

    @Override // d4.k
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.a.getOutputBuffer(i10);
    }

    @Override // d4.k
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.b;
        synchronized (fVar.a) {
            try {
                mediaFormat = fVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // d4.k
    public final void h(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // d4.k
    public final void release() {
        try {
            if (this.e == 1) {
                e eVar = this.c;
                if (eVar.f) {
                    eVar.a();
                    eVar.b.quit();
                }
                eVar.f = false;
                f fVar = this.b;
                synchronized (fVar.a) {
                    fVar.l = true;
                    fVar.b.quit();
                    fVar.a();
                }
            }
            this.e = 2;
            if (this.d) {
                return;
            }
            this.a.release();
            this.d = true;
        } catch (Throwable th2) {
            if (!this.d) {
                this.a.release();
                this.d = true;
            }
            throw th2;
        }
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
