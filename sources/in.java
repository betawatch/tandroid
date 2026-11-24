// default package

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.ui.Components.AnimatedFileNative;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class in implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kn b;

    public /* synthetic */ in(kn knVar, byte b) {
        this.a = b;
        this.b = knVar;
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
                kn knVar = this.b;
                if (knVar.E0 != null) {
                    dl0.c();
                    knVar.E0 = null;
                }
                knVar.D0 = false;
                knVar.k();
                knVar.x(false);
                return;
            case 2:
                this.b.t();
                return;
            case 3:
                return;
            case 4:
                kn knVar2 = this.b;
                knVar2.k();
                knVar2.e = null;
                if (knVar2.N >= 0 && knVar2.M == -1) {
                    knVar2.N = -1L;
                }
                knVar2.x(false);
                knVar2.t();
                return;
            case 5:
                kn knVar3 = this.b;
                if (knVar3.d0 || knVar3.x || knVar3.D0 || knVar3.E0 != null) {
                    return;
                }
                knVar3.h0 = System.currentTimeMillis();
                if (p09.U0 == null) {
                    p09.U0 = new np3("cache generator queue", true);
                }
                knVar3.D0 = true;
                knVar3.e = null;
                dl0.A++;
                np3 np3Var = p09.U0;
                in inVar = new in(knVar3, (byte) 9);
                knVar3.E0 = inVar;
                np3Var.postRunnable(inVar);
                return;
            case 6:
                kn knVar4 = this.b;
                knVar4.k();
                if (knVar4.v0 != null && knVar4.O) {
                    bc4.G(knVar4.K).Z(knVar4.v0.c, false, false);
                }
                int i = knVar4.P;
                if (i <= 0) {
                    knVar4.O = true;
                } else {
                    knVar4.P = i - 1;
                }
                if (knVar4.G) {
                    knVar4.G = false;
                } else {
                    knVar4.F = true;
                }
                knVar4.e = null;
                if (knVar4.N >= 0) {
                    knVar4.r = knVar4.w;
                    knVar4.s = null;
                } else if (!knVar4.b) {
                    knVar4.r = knVar4.w;
                } else if (knVar4.r == null) {
                    hn hnVar = knVar4.s;
                    if (hnVar == null) {
                        knVar4.r = knVar4.w;
                    } else {
                        knVar4.r = hnVar;
                        knVar4.s = knVar4.w;
                    }
                } else {
                    knVar4.s = knVar4.w;
                }
                knVar4.w = null;
                if (knVar4.Q) {
                    knVar4.Q = false;
                    knVar4.z0++;
                    knVar4.j();
                }
                if (knVar4.d[3] < knVar4.c) {
                    float f = knVar4.h0;
                    knVar4.c = f > 0.0f ? (int) (f * 1000.0f) : 0;
                }
                if (knVar4.N >= 0 && knVar4.M == -1) {
                    knVar4.N = -1L;
                }
                knVar4.c = knVar4.d[3];
                Iterator it = knVar4.t0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!knVar4.c0 && knVar4.E) || (knVar4.n == null && knVar4.r != null)) {
                    knVar4.t();
                }
                knVar4.x(false);
                return;
            case 7:
                kn knVar5 = this.b;
                if (knVar5.d0) {
                    gm.c3(knVar5.G0);
                    return;
                }
                if (!knVar5.y && knVar5.e0 == null) {
                    knVar5.e0 = AnimatedFileNative.a(knVar5.H.getAbsolutePath(), knVar5.d, knVar5.K, knVar5.I, knVar5.v0, false);
                    knVar5.f0 = knVar5.e0 == null && (!knVar5.o0 || knVar5.H0 > 15);
                    if (knVar5.e0 != null) {
                        int[] iArr = knVar5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            knVar5.e0.f();
                            knVar5.e0 = null;
                        }
                    }
                    knVar5.d();
                    knVar5.E();
                    if (knVar5.o0 && knVar5.e0 == null) {
                        int i2 = knVar5.H0;
                        knVar5.H0 = i2 + 1;
                        if (i2 <= 15) {
                            z = false;
                            knVar5.y = z;
                            gm.c3(new in(knVar5, objArr2 == true ? 1 : 0));
                        }
                    }
                    z = true;
                    knVar5.y = z;
                    gm.c3(new in(knVar5, objArr2 == true ? 1 : 0));
                }
                try {
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
                if (knVar5.A0 != null) {
                    if (knVar5.w == null) {
                        if (knVar5.h.isEmpty()) {
                            knVar5.w = new hn(Bitmap.createBitmap(knVar5.k0, knVar5.j0, Bitmap.Config.ARGB_8888));
                        } else {
                            knVar5.w = (hn) knVar5.h.remove(0);
                        }
                    }
                    if (knVar5.B0 == null) {
                        knVar5.B0 = new g40();
                    }
                    System.currentTimeMillis();
                    g40 g40Var = knVar5.B0;
                    int i3 = g40Var.a;
                    dl0 dl0Var = knVar5.A0;
                    int f2 = dl0Var.f(dl0Var.i, knVar5.w.b);
                    g40Var.a = dl0Var.i;
                    if (dl0Var.q && !dl0Var.e.isEmpty()) {
                        int i4 = dl0Var.i + 1;
                        dl0Var.i = i4;
                        if (i4 >= dl0Var.e.size()) {
                            dl0Var.i = 0;
                        }
                    }
                    if (f2 != -1 && knVar5.B0.a < i3) {
                        knVar5.Q = true;
                    }
                    int[] iArr2 = knVar5.d;
                    hn hnVar2 = knVar5.w;
                    int max = knVar5.B0.a * Math.max(16, iArr2[4] / Math.max(1, knVar5.A0.e.size()));
                    hnVar2.e = max;
                    iArr2[3] = max;
                    knVar5.w.f = false;
                    if (knVar5.A0.g()) {
                        gm.c3(knVar5.F0);
                    }
                    if (f2 == -1) {
                        gm.c3(knVar5.C0);
                        return;
                    } else {
                        gm.c3(knVar5.G0);
                        return;
                    }
                }
                if (knVar5.e0 == null) {
                    int[] iArr3 = knVar5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        gm.c3(knVar5.C0);
                        return;
                    }
                }
                if (knVar5.w == null) {
                    int[] iArr4 = knVar5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (knVar5.h.isEmpty()) {
                                float f3 = knVar5.d[0];
                                float f4 = knVar5.n0;
                                knVar5.w = new hn(Bitmap.createBitmap((int) (f3 * f4), (int) (r0[1] * f4), Bitmap.Config.ARGB_8888));
                            } else {
                                knVar5.w = (hn) knVar5.h.remove(0);
                            }
                        } catch (Throwable th2) {
                            fc4.g(th2, true);
                        }
                    }
                }
                if (knVar5.M >= 0) {
                    knVar5.d[3] = (int) knVar5.M;
                    long j = knVar5.M;
                    synchronized (knVar5.R) {
                        try {
                            knVar5.M = -1L;
                        } finally {
                        }
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = knVar5.v0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    knVar5.e0.g(j, true);
                    objArr = true;
                } else {
                    objArr = false;
                }
                if (knVar5.w != null) {
                    System.currentTimeMillis();
                    if (knVar5.e0.c(knVar5.w.b, false, knVar5.h0, knVar5.i0, knVar5.l0) == 0) {
                        gm.c3(knVar5.C0);
                        return;
                    }
                    if (!knVar5.f) {
                        knVar5.f = knVar5.e0.a[7] == 1;
                    }
                    int i5 = knVar5.d[3];
                    if (i5 < knVar5.c) {
                        knVar5.Q = true;
                    }
                    if (objArr != false) {
                        knVar5.c = i5;
                    }
                    hn hnVar3 = knVar5.w;
                    hnVar3.e = i5;
                    hnVar3.f = knVar5.e0.a[6] == 1;
                }
                gm.c3(knVar5.G0);
                return;
            case 8:
                kn knVar6 = this.b;
                g79 g79Var = knVar6.t0;
                Iterator it2 = g79Var.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = knVar6.s0;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if ((g79Var.isEmpty() || knVar6.S) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                kn knVar7 = this.b;
                knVar7.A0.b();
                gm.c3(new in(knVar7, b));
                return;
        }
    }

    private final void a() {
    }
}
