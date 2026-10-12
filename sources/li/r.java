package li;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;
    public final /* synthetic */ Size c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ RuntimeException[] f;
    public final /* synthetic */ CountDownLatch h;

    public /* synthetic */ r(u uVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i11) {
        this.a = i11;
        this.b = uVar;
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
                u uVar = this.b;
                Size size = this.c;
                int i10 = this.d;
                boolean z10 = this.e;
                RuntimeException[] runtimeExceptionArr = this.f;
                countDownLatch = this.h;
                try {
                    try {
                        uVar.a = size;
                        uVar.b = size;
                        uVar.c = size;
                        uVar.j = i10;
                        uVar.k = i10;
                        uVar.l = i10;
                        uVar.m = z10;
                        uVar.n = z10;
                        uVar.o = z10;
                        SurfaceTexture surfaceTexture = uVar.v;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        SurfaceTexture surfaceTexture2 = uVar.x;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        uVar.k(uVar.D, uVar.k);
                        int i11 = uVar.E;
                        if (i11 != 0) {
                            uVar.k(i11, uVar.l);
                        }
                        e0 e0Var = uVar.N;
                        if (e0Var != null) {
                            e0Var.c = size;
                            e0Var.d = i10;
                            e0Var.q = e0.j(size, i10, false);
                            e0Var.r = e0.j(size, i10, true);
                            e0Var.A = false;
                            e0Var.z = 0L;
                        }
                        p pVar = uVar.i;
                        StringBuilder sb2 = new StringBuilder("GL input updated: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i10);
                        sb2.append(", filter=");
                        sb2.append(uVar.j == uVar.g ? "NEAREST" : "LINEAR");
                        pVar.b(sb2.toString());
                    } finally {
                    }
                } catch (RuntimeException e) {
                    runtimeExceptionArr[0] = e;
                }
                countDownLatch.countDown();
                return;
            default:
                Size size2 = this.c;
                int i12 = this.d;
                boolean z11 = this.e;
                RuntimeException[] runtimeExceptionArr2 = this.f;
                countDownLatch = this.h;
                u uVar2 = this.b;
                uVar2.getClass();
                try {
                    try {
                        uVar2.c = size2;
                        uVar2.l = i12;
                        uVar2.o = z11;
                        SurfaceTexture surfaceTexture3 = uVar2.x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        int i13 = uVar2.E;
                        if (i13 != 0) {
                            uVar2.k(i13, i12);
                        }
                        p pVar2 = uVar2.i;
                        StringBuilder sb3 = new StringBuilder("GL secondary input configured: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i12);
                        sb3.append(", filter=");
                        sb3.append(i12 == uVar2.g ? "NEAREST" : "LINEAR");
                        sb3.append(", timestampRealtime=");
                        sb3.append(z11);
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
