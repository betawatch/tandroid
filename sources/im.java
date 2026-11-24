// default package

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.ui.Components.AnimatedFileNative;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class im implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ km b;

    public /* synthetic */ im(km kmVar, byte b) {
        this.a = b;
        this.b = kmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr;
        boolean z;
        byte b = 1;
        Object[] objArr2 = 0;
        switch (this.a) {
            case 0:
                this.b.i();
                return;
            case 1:
                km kmVar = this.b;
                if (kmVar.E0 != null) {
                    dk0.c();
                    kmVar.E0 = null;
                }
                kmVar.D0 = false;
                kmVar.k();
                kmVar.x(false);
                return;
            case 2:
                this.b.t();
                return;
            case 3:
                return;
            case 4:
                km kmVar2 = this.b;
                kmVar2.k();
                kmVar2.e = null;
                if (kmVar2.N >= 0 && kmVar2.M == -1) {
                    kmVar2.N = -1L;
                }
                kmVar2.x(false);
                kmVar2.t();
                return;
            case 5:
                km kmVar3 = this.b;
                if (kmVar3.d0 || kmVar3.x || kmVar3.D0 || kmVar3.E0 != null) {
                    return;
                }
                kmVar3.h0 = System.currentTimeMillis();
                if (oy8.U0 == null) {
                    oy8.U0 = new do3("cache generator queue", true);
                }
                kmVar3.D0 = true;
                kmVar3.e = null;
                dk0.A++;
                do3 do3Var = oy8.U0;
                im imVar = new im(kmVar3, (byte) 9);
                kmVar3.E0 = imVar;
                do3Var.postRunnable(imVar);
                return;
            case 6:
                km kmVar4 = this.b;
                kmVar4.k();
                if (kmVar4.v0 != null && kmVar4.O) {
                    ba4.G(kmVar4.K).Z(kmVar4.v0.c, false, false);
                }
                int i = kmVar4.P;
                if (i <= 0) {
                    kmVar4.O = true;
                } else {
                    kmVar4.P = i - 1;
                }
                if (kmVar4.G) {
                    kmVar4.G = false;
                } else {
                    kmVar4.F = true;
                }
                kmVar4.e = null;
                if (kmVar4.N >= 0) {
                    kmVar4.r = kmVar4.w;
                    kmVar4.s = null;
                } else if (!kmVar4.b) {
                    kmVar4.r = kmVar4.w;
                } else if (kmVar4.r == null) {
                    hm hmVar = kmVar4.s;
                    if (hmVar == null) {
                        kmVar4.r = kmVar4.w;
                    } else {
                        kmVar4.r = hmVar;
                        kmVar4.s = kmVar4.w;
                    }
                } else {
                    kmVar4.s = kmVar4.w;
                }
                kmVar4.w = null;
                if (kmVar4.Q) {
                    kmVar4.Q = false;
                    kmVar4.z0++;
                    kmVar4.j();
                }
                if (kmVar4.d[3] < kmVar4.c) {
                    float f = kmVar4.h0;
                    kmVar4.c = f > 0.0f ? (int) (f * 1000.0f) : 0;
                }
                if (kmVar4.N >= 0 && kmVar4.M == -1) {
                    kmVar4.N = -1L;
                }
                kmVar4.c = kmVar4.d[3];
                Iterator it = kmVar4.t0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!kmVar4.c0 && kmVar4.E) || (kmVar4.n == null && kmVar4.r != null)) {
                    kmVar4.t();
                }
                kmVar4.x(false);
                return;
            case 7:
                km kmVar5 = this.b;
                if (kmVar5.d0) {
                    gl.c3(kmVar5.G0);
                    return;
                }
                if (!kmVar5.y && kmVar5.e0 == null) {
                    kmVar5.e0 = AnimatedFileNative.a(kmVar5.H.getAbsolutePath(), kmVar5.d, kmVar5.K, kmVar5.I, kmVar5.v0, false);
                    kmVar5.f0 = kmVar5.e0 == null && (!kmVar5.o0 || kmVar5.H0 > 15);
                    if (kmVar5.e0 != null) {
                        int[] iArr = kmVar5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            kmVar5.e0.f();
                            kmVar5.e0 = null;
                        }
                    }
                    kmVar5.d();
                    kmVar5.E();
                    if (kmVar5.o0 && kmVar5.e0 == null) {
                        int i2 = kmVar5.H0;
                        kmVar5.H0 = i2 + 1;
                        if (i2 <= 15) {
                            z = false;
                            kmVar5.y = z;
                            gl.c3(new im(kmVar5, objArr2 == true ? 1 : 0));
                        }
                    }
                    z = true;
                    kmVar5.y = z;
                    gl.c3(new im(kmVar5, objArr2 == true ? 1 : 0));
                }
                try {
                } catch (Throwable th) {
                    fa4.g(th, true);
                }
                if (kmVar5.A0 != null) {
                    if (kmVar5.w == null) {
                        if (kmVar5.h.isEmpty()) {
                            kmVar5.w = new hm(Bitmap.createBitmap(kmVar5.k0, kmVar5.j0, Bitmap.Config.ARGB_8888));
                        } else {
                            kmVar5.w = (hm) kmVar5.h.remove(0);
                        }
                    }
                    if (kmVar5.B0 == null) {
                        kmVar5.B0 = new g30();
                    }
                    System.currentTimeMillis();
                    g30 g30Var = kmVar5.B0;
                    int i3 = g30Var.a;
                    dk0 dk0Var = kmVar5.A0;
                    int f2 = dk0Var.f(dk0Var.i, kmVar5.w.b);
                    g30Var.a = dk0Var.i;
                    if (dk0Var.q && !dk0Var.e.isEmpty()) {
                        int i4 = dk0Var.i + 1;
                        dk0Var.i = i4;
                        if (i4 >= dk0Var.e.size()) {
                            dk0Var.i = 0;
                        }
                    }
                    if (f2 != -1 && kmVar5.B0.a < i3) {
                        kmVar5.Q = true;
                    }
                    int[] iArr2 = kmVar5.d;
                    hm hmVar2 = kmVar5.w;
                    int max = kmVar5.B0.a * Math.max(16, iArr2[4] / Math.max(1, kmVar5.A0.e.size()));
                    hmVar2.e = max;
                    iArr2[3] = max;
                    kmVar5.w.f = false;
                    if (kmVar5.A0.g()) {
                        gl.c3(kmVar5.F0);
                    }
                    if (f2 == -1) {
                        gl.c3(kmVar5.C0);
                        return;
                    } else {
                        gl.c3(kmVar5.G0);
                        return;
                    }
                }
                if (kmVar5.e0 == null) {
                    int[] iArr3 = kmVar5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        gl.c3(kmVar5.C0);
                        return;
                    }
                }
                if (kmVar5.w == null) {
                    int[] iArr4 = kmVar5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (kmVar5.h.isEmpty()) {
                                float f3 = kmVar5.d[0];
                                float f4 = kmVar5.n0;
                                kmVar5.w = new hm(Bitmap.createBitmap((int) (f3 * f4), (int) (r0[1] * f4), Bitmap.Config.ARGB_8888));
                            } else {
                                kmVar5.w = (hm) kmVar5.h.remove(0);
                            }
                        } catch (Throwable th2) {
                            fa4.g(th2, true);
                        }
                    }
                }
                if (kmVar5.M >= 0) {
                    kmVar5.d[3] = (int) kmVar5.M;
                    long j = kmVar5.M;
                    synchronized (kmVar5.R) {
                        try {
                            kmVar5.M = -1L;
                        } finally {
                        }
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = kmVar5.v0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    kmVar5.e0.g(j, true);
                    objArr = true;
                } else {
                    objArr = false;
                }
                if (kmVar5.w != null) {
                    System.currentTimeMillis();
                    if (kmVar5.e0.c(kmVar5.w.b, false, kmVar5.h0, kmVar5.i0, kmVar5.l0) == 0) {
                        gl.c3(kmVar5.C0);
                        return;
                    }
                    if (!kmVar5.f) {
                        kmVar5.f = kmVar5.e0.a[7] == 1;
                    }
                    int i5 = kmVar5.d[3];
                    if (i5 < kmVar5.c) {
                        kmVar5.Q = true;
                    }
                    if (objArr != false) {
                        kmVar5.c = i5;
                    }
                    hm hmVar3 = kmVar5.w;
                    hmVar3.e = i5;
                    hmVar3.f = kmVar5.e0.a[6] == 1;
                }
                gl.c3(kmVar5.G0);
                return;
            case 8:
                km kmVar6 = this.b;
                e59 e59Var = kmVar6.t0;
                Iterator it2 = e59Var.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = kmVar6.s0;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if ((e59Var.isEmpty() || kmVar6.S) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                km kmVar7 = this.b;
                kmVar7.A0.b();
                gl.c3(new im(kmVar7, b));
                return;
        }
    }

    private final void a() {
    }
}
