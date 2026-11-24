// default package

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hk9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jk9 b;
    public final /* synthetic */ Size c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ RuntimeException[] f;
    public final /* synthetic */ CountDownLatch h;

    public /* synthetic */ hk9(jk9 jk9Var, Size size, int i, boolean z, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, byte b) {
        this.a = b;
        this.b = jk9Var;
        this.c = size;
        this.d = i;
        this.e = z;
        this.f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        CountDownLatch countDownLatch = this.h;
        RuntimeException[] runtimeExceptionArr = this.f;
        boolean z = this.e;
        int i = this.d;
        Size size = this.c;
        jk9 jk9Var = this.b;
        switch (b) {
            case 0:
                jk9Var.getClass();
                try {
                    try {
                        jk9Var.c = size;
                        jk9Var.l = i;
                        jk9Var.o = z;
                        SurfaceTexture surfaceTexture = jk9Var.x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i2 = jk9Var.E;
                        if (i2 != 0) {
                            jk9Var.k(i2, i);
                        }
                        ek9 ek9Var = jk9Var.i;
                        StringBuilder sb = new StringBuilder("GL secondary input configured: input=");
                        sb.append(size);
                        sb.append(", crop=");
                        sb.append(i);
                        sb.append(", filter=");
                        sb.append(i == jk9Var.g ? "NEAREST" : "LINEAR");
                        sb.append(", timestampRealtime=");
                        sb.append(z);
                        ek9Var.b(sb.toString());
                    } finally {
                    }
                } catch (RuntimeException e) {
                    runtimeExceptionArr[0] = e;
                }
                return;
            default:
                try {
                    try {
                        jk9Var.a = size;
                        jk9Var.b = size;
                        jk9Var.c = size;
                        jk9Var.j = i;
                        jk9Var.k = i;
                        jk9Var.l = i;
                        jk9Var.m = z;
                        jk9Var.n = z;
                        jk9Var.o = z;
                        SurfaceTexture surfaceTexture2 = jk9Var.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = jk9Var.x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        jk9Var.k(jk9Var.D, jk9Var.k);
                        int i3 = jk9Var.E;
                        if (i3 != 0) {
                            jk9Var.k(i3, jk9Var.l);
                        }
                        tk9 tk9Var = jk9Var.N;
                        if (tk9Var != null) {
                            tk9Var.c = size;
                            tk9Var.d = i;
                            tk9Var.v();
                            tk9Var.B = false;
                            tk9Var.A = 0L;
                        }
                        ek9 ek9Var2 = jk9Var.i;
                        StringBuilder sb2 = new StringBuilder("GL input updated: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i);
                        sb2.append(", filter=");
                        sb2.append(jk9Var.j == jk9Var.g ? "NEAREST" : "LINEAR");
                        ek9Var2.b(sb2.toString());
                    } catch (RuntimeException e2) {
                        runtimeExceptionArr[0] = e2;
                    }
                    return;
                } finally {
                }
        }
    }
}
