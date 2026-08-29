package a4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import f5.d0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements n {
    public final MediaCodec a;
    public final h b;
    public final f c;
    public boolean d;
    public int e = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.a = mediaCodec;
        this.b = new h(handlerThread);
        this.c = new f(mediaCodec, handlerThread2);
    }

    public static void i(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        h hVar = cVar.b;
        MediaCodec mediaCodec = cVar.a;
        hVar.b(mediaCodec);
        f5.a.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        f5.a.q();
        f fVar = cVar.c;
        HandlerThread handlerThread = fVar.b;
        if (!fVar.f) {
            handlerThread.start();
            fVar.c = new d(fVar, handlerThread.getLooper());
            fVar.f = true;
        }
        f5.a.c("startCodec");
        mediaCodec.start();
        f5.a.q();
        cVar.e = 1;
    }

    public static String j(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // a4.n
    public final void a(g5.i iVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, iVar, 0), handler);
    }

    @Override // a4.n
    public final void b(int i10, m3.d dVar, long j10) {
        this.c.c(i10, dVar, j10);
    }

    @Override // a4.n
    public final void c(long j10, int i10, int i11, int i12) {
        f fVar = this.c;
        RuntimeException runtimeException = (RuntimeException) fVar.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        e b10 = f.b();
        b10.a = i10;
        b10.b = i11;
        b10.d = j10;
        b10.e = i12;
        d dVar = fVar.c;
        int i13 = d0.a;
        dVar.obtainMessage(0, b10).sendToTarget();
    }

    @Override // a4.n
    public final void d(int i10, long j10) {
        this.a.releaseOutputBuffer(i10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[Catch: all -> 0x001c, DONT_GENERATE, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0005, B:6:0x000f, B:12:0x001a, B:15:0x001e, B:17:0x0023, B:19:0x0027, B:24:0x0036, B:26:0x0032, B:28:0x0038, B:29:0x003a, B:30:0x003b, B:31:0x003d), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0005, B:6:0x000f, B:12:0x001a, B:15:0x001e, B:17:0x0023, B:19:0x0027, B:24:0x0036, B:26:0x0032, B:28:0x0038, B:29:0x003a, B:30:0x003b, B:31:0x003d), top: B:3:0x0005 }] */
    @Override // a4.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e() {
        boolean z10;
        h hVar = this.b;
        synchronized (hVar.a) {
            try {
                boolean z11 = true;
                if (hVar.k <= 0 && !hVar.l) {
                    z10 = false;
                    int i10 = -1;
                    if (!z10) {
                        return -1;
                    }
                    IllegalStateException illegalStateException = hVar.m;
                    if (illegalStateException != null) {
                        hVar.m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = hVar.j;
                    if (codecException != null) {
                        hVar.j = null;
                        throw codecException;
                    }
                    k kVar = hVar.d;
                    if (kVar.c != 0) {
                        z11 = false;
                    }
                    if (!z11) {
                        i10 = kVar.e();
                    }
                    return i10;
                }
                z10 = true;
                int i102 = -1;
                if (!z10) {
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[Catch: all -> 0x001c, DONT_GENERATE, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0005, B:6:0x000f, B:12:0x001a, B:15:0x001f, B:17:0x0024, B:19:0x0028, B:23:0x0032, B:25:0x0034, B:27:0x003a, B:28:0x0061, B:32:0x0057, B:34:0x0063, B:35:0x0065, B:36:0x0066, B:37:0x0068), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0005, B:6:0x000f, B:12:0x001a, B:15:0x001f, B:17:0x0024, B:19:0x0028, B:23:0x0032, B:25:0x0034, B:27:0x003a, B:28:0x0061, B:32:0x0057, B:34:0x0063, B:35:0x0065, B:36:0x0066, B:37:0x0068), top: B:3:0x0005 }] */
    @Override // a4.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(MediaCodec.BufferInfo bufferInfo) {
        boolean z10;
        h hVar = this.b;
        synchronized (hVar.a) {
            try {
                boolean z11 = true;
                if (hVar.k <= 0 && !hVar.l) {
                    z10 = false;
                    if (!z10) {
                        return -1;
                    }
                    IllegalStateException illegalStateException = hVar.m;
                    if (illegalStateException != null) {
                        hVar.m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = hVar.j;
                    if (codecException != null) {
                        hVar.j = null;
                        throw codecException;
                    }
                    k kVar = hVar.e;
                    if (kVar.c != 0) {
                        z11 = false;
                    }
                    if (z11) {
                        return -1;
                    }
                    int e10 = kVar.e();
                    if (e10 >= 0) {
                        f5.a.j(hVar.h);
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) hVar.f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (e10 == -2) {
                        hVar.h = (MediaFormat) hVar.g.remove();
                    }
                    return e10;
                }
                z10 = true;
                if (!z10) {
                }
            } finally {
            }
        }
    }

    @Override // a4.n
    public final void flush() {
        this.c.a();
        this.a.flush();
        h hVar = this.b;
        synchronized (hVar.a) {
            hVar.k++;
            Handler handler = hVar.c;
            int i10 = d0.a;
            handler.post(new g(hVar, 0));
        }
        this.a.start();
    }

    @Override // a4.n
    public final void g(int i10) {
        this.a.setVideoScalingMode(i10);
    }

    @Override // a4.n
    public final ByteBuffer getInputBuffer(int i10) {
        return this.a.getInputBuffer(i10);
    }

    @Override // a4.n
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.a.getOutputBuffer(i10);
    }

    @Override // a4.n
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        h hVar = this.b;
        synchronized (hVar.a) {
            try {
                mediaFormat = hVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // a4.n
    public final void h(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // a4.n
    public final void release() {
        try {
            if (this.e == 1) {
                f fVar = this.c;
                if (fVar.f) {
                    fVar.a();
                    fVar.b.quit();
                }
                fVar.f = false;
                h hVar = this.b;
                synchronized (hVar.a) {
                    hVar.l = true;
                    hVar.b.quit();
                    hVar.a();
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

    @Override // a4.n
    public final void releaseOutputBuffer(int i10, boolean z10) {
        this.a.releaseOutputBuffer(i10, z10);
    }

    @Override // a4.n
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }
}
