package li;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;
    public final /* synthetic */ Size c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ RuntimeException[] f;
    public final /* synthetic */ CountDownLatch h;

    public /* synthetic */ r(v vVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i11) {
        this.a = i11;
        this.b = vVar;
        this.c = size;
        this.d = i10;
        this.e = z10;
        this.f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        switch (this.a) {
            case 0:
                Size size = this.c;
                int i10 = this.d;
                boolean z10 = this.e;
                RuntimeException[] runtimeExceptionArr = this.f;
                countDownLatch = this.h;
                v vVar = this.b;
                vVar.getClass();
                try {
                    try {
                        vVar.c = size;
                        vVar.l = i10;
                        vVar.o = z10;
                        SurfaceTexture surfaceTexture = vVar.x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i11 = vVar.E;
                        if (i11 != 0) {
                            vVar.k(i11, i10);
                        }
                        p pVar = vVar.i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i10);
                        sb2.append(", filter=");
                        sb2.append(i10 == vVar.g ? "NEAREST" : "LINEAR");
                        sb2.append(", timestampRealtime=");
                        sb2.append(z10);
                        pVar.b(sb2.toString());
                    } catch (RuntimeException e) {
                        runtimeExceptionArr[0] = e;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
            default:
                v vVar2 = this.b;
                Size size2 = this.c;
                int i12 = this.d;
                boolean z11 = this.e;
                RuntimeException[] runtimeExceptionArr2 = this.f;
                countDownLatch = this.h;
                try {
                    try {
                        vVar2.a = size2;
                        vVar2.b = size2;
                        vVar2.c = size2;
                        vVar2.j = i12;
                        vVar2.k = i12;
                        vVar2.l = i12;
                        vVar2.m = z11;
                        vVar2.n = z11;
                        vVar2.o = z11;
                        SurfaceTexture surfaceTexture2 = vVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = vVar2.x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        vVar2.k(vVar2.D, vVar2.k);
                        int i13 = vVar2.E;
                        if (i13 != 0) {
                            vVar2.k(i13, vVar2.l);
                        }
                        g0 g0Var = vVar2.N;
                        if (g0Var != null) {
                            g0Var.c = size2;
                            g0Var.d = i12;
                            g0Var.q = g0.j(size2, i12, false);
                            g0Var.r = g0.j(size2, i12, true);
                            g0Var.A = false;
                            g0Var.z = 0L;
                        }
                        p pVar2 = vVar2.i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i12);
                        sb3.append(", filter=");
                        sb3.append(vVar2.j == vVar2.g ? "NEAREST" : "LINEAR");
                        pVar2.b(sb3.toString());
                    } catch (RuntimeException e7) {
                        runtimeExceptionArr2[0] = e7;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
        }
    }
}
