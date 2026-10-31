package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5 b;

    public /* synthetic */ q5(s5 s5Var, int i10) {
        this.a = i10;
        this.b = s5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                this.b.i();
                return;
            case 1:
                s5 s5Var = this.b;
                if (s5Var.D0 != null) {
                    rf.e.c();
                    s5Var.D0 = null;
                }
                s5Var.C0 = false;
                s5Var.k();
                s5Var.x(false);
                return;
            case 2:
                this.b.t();
                return;
            case 3:
                rf.e eVar = this.b.z0;
                return;
            case 4:
                s5 s5Var2 = this.b;
                s5Var2.k();
                s5Var2.e = null;
                if (s5Var2.M >= 0 && s5Var2.L == -1) {
                    s5Var2.M = -1L;
                }
                s5Var2.x(false);
                s5Var2.t();
                return;
            case 5:
                s5 s5Var3 = this.b;
                if (s5Var3.c0 || s5Var3.x || s5Var3.C0 || s5Var3.D0 != null) {
                    return;
                }
                s5Var3.g0 = System.currentTimeMillis();
                if (bi0.T0 == null) {
                    bi0.T0 = new org.telegram.messenger.s5("cache generator queue", true);
                }
                s5Var3.C0 = true;
                s5Var3.e = null;
                rf.e.A++;
                org.telegram.messenger.s5 s5Var4 = bi0.T0;
                q5 q5Var = new q5(s5Var3, 9);
                s5Var3.D0 = q5Var;
                s5Var4.postRunnable(q5Var);
                return;
            case 6:
                s5 s5Var5 = this.b;
                s5Var5.k();
                if (s5Var5.u0 != null && s5Var5.N) {
                    org.telegram.messenger.b8.G(s5Var5.J).a0(s5Var5.u0.c, false, false);
                }
                int i10 = s5Var5.O;
                if (i10 <= 0) {
                    s5Var5.N = true;
                } else {
                    s5Var5.O = i10 - 1;
                }
                if (s5Var5.F) {
                    s5Var5.F = false;
                } else {
                    s5Var5.E = true;
                }
                s5Var5.e = null;
                if (s5Var5.M >= 0) {
                    s5Var5.r = s5Var5.w;
                    s5Var5.s = null;
                } else if (s5Var5.b) {
                    p5 p5Var = s5Var5.r;
                    if (p5Var == null && s5Var5.s == null) {
                        s5Var5.r = s5Var5.w;
                    } else if (p5Var == null) {
                        s5Var5.r = s5Var5.s;
                        s5Var5.s = s5Var5.w;
                    } else {
                        s5Var5.s = s5Var5.w;
                    }
                } else {
                    s5Var5.r = s5Var5.w;
                }
                s5Var5.w = null;
                if (s5Var5.P) {
                    s5Var5.P = false;
                    s5Var5.y0++;
                    s5Var5.j();
                }
                if (s5Var5.d[3] < s5Var5.c) {
                    float f7 = s5Var5.g0;
                    s5Var5.c = f7 > 0.0f ? (int) (f7 * 1000.0f) : 0;
                }
                if (s5Var5.M >= 0 && s5Var5.L == -1) {
                    s5Var5.M = -1L;
                }
                s5Var5.c = s5Var5.d[3];
                Iterator it = s5Var5.s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!s5Var5.b0 && s5Var5.D) || (s5Var5.n == null && s5Var5.r != null)) {
                    s5Var5.t();
                }
                s5Var5.x(false);
                return;
            case 7:
                s5 s5Var6 = this.b;
                if (s5Var6.c0) {
                    org.telegram.messenger.i0.g3(s5Var6.F0);
                    return;
                }
                if (!s5Var6.y && s5Var6.d0 == null) {
                    s5Var6.d0 = AnimatedFileNative.a(s5Var6.G.getAbsolutePath(), s5Var6.d, s5Var6.J, s5Var6.H, s5Var6.u0, false);
                    s5Var6.e0 = s5Var6.d0 == null && (!s5Var6.n0 || s5Var6.G0 > 15);
                    if (s5Var6.d0 != null) {
                        int[] iArr = s5Var6.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            s5Var6.d0.f();
                            s5Var6.d0 = null;
                        }
                    }
                    s5Var6.d();
                    s5Var6.E();
                    if (s5Var6.n0 && s5Var6.d0 == null) {
                        int i11 = s5Var6.G0;
                        s5Var6.G0 = i11 + 1;
                        if (i11 <= 15) {
                            z11 = false;
                            s5Var6.y = z11;
                            org.telegram.messenger.i0.g3(new q5(s5Var6, 0));
                        }
                    }
                    z11 = true;
                    s5Var6.y = z11;
                    org.telegram.messenger.i0.g3(new q5(s5Var6, 0));
                }
                try {
                } catch (Throwable th2) {
                    org.telegram.messenger.f8.g(th2, true);
                }
                if (s5Var6.z0 != null) {
                    if (s5Var6.w == null) {
                        if (s5Var6.h.isEmpty()) {
                            s5Var6.w = new p5(Bitmap.createBitmap(s5Var6.j0, s5Var6.i0, Bitmap.Config.ARGB_8888));
                        } else {
                            s5Var6.w = (p5) s5Var6.h.remove(0);
                        }
                    }
                    if (s5Var6.A0 == null) {
                        s5Var6.A0 = new ae.j();
                    }
                    System.currentTimeMillis();
                    ae.j jVar = s5Var6.A0;
                    int i12 = jVar.a;
                    rf.e eVar2 = s5Var6.z0;
                    int f10 = eVar2.f(s5Var6.w.b, eVar2.i);
                    jVar.a = eVar2.i;
                    if (eVar2.q && !eVar2.e.isEmpty()) {
                        int i13 = eVar2.i + 1;
                        eVar2.i = i13;
                        if (i13 >= eVar2.e.size()) {
                            eVar2.i = 0;
                        }
                    }
                    if (f10 != -1 && s5Var6.A0.a < i12) {
                        s5Var6.P = true;
                    }
                    int[] iArr2 = s5Var6.d;
                    p5 p5Var2 = s5Var6.w;
                    int max = s5Var6.A0.a * Math.max(16, iArr2[4] / Math.max(1, s5Var6.z0.e.size()));
                    p5Var2.e = max;
                    iArr2[3] = max;
                    s5Var6.w.f = false;
                    if (s5Var6.z0.g()) {
                        org.telegram.messenger.i0.g3(s5Var6.E0);
                    }
                    if (f10 == -1) {
                        org.telegram.messenger.i0.g3(s5Var6.B0);
                        return;
                    } else {
                        org.telegram.messenger.i0.g3(s5Var6.F0);
                        return;
                    }
                }
                if (s5Var6.d0 == null) {
                    int[] iArr3 = s5Var6.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        org.telegram.messenger.i0.g3(s5Var6.B0);
                        return;
                    }
                }
                if (s5Var6.w == null) {
                    int[] iArr4 = s5Var6.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (s5Var6.h.isEmpty()) {
                                float f11 = s5Var6.d[0];
                                float f12 = s5Var6.m0;
                                s5Var6.w = new p5(Bitmap.createBitmap((int) (f11 * f12), (int) (r0[1] * f12), Bitmap.Config.ARGB_8888));
                            } else {
                                s5Var6.w = (p5) s5Var6.h.remove(0);
                            }
                        } catch (Throwable th3) {
                            org.telegram.messenger.f8.g(th3, true);
                        }
                    }
                }
                if (s5Var6.L >= 0) {
                    s5Var6.d[3] = (int) s5Var6.L;
                    long j10 = s5Var6.L;
                    synchronized (s5Var6.Q) {
                        s5Var6.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = s5Var6.u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    s5Var6.d0.g(j10, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (s5Var6.w != null) {
                    System.currentTimeMillis();
                    if (s5Var6.d0.c(s5Var6.w.b, false, s5Var6.g0, s5Var6.h0, s5Var6.k0) == 0) {
                        org.telegram.messenger.i0.g3(s5Var6.B0);
                        return;
                    }
                    if (!s5Var6.f) {
                        s5Var6.f = s5Var6.d0.a[7] == 1;
                    }
                    int i14 = s5Var6.d[3];
                    if (i14 < s5Var6.c) {
                        s5Var6.P = true;
                    }
                    if (z10) {
                        s5Var6.c = i14;
                    }
                    p5 p5Var3 = s5Var6.w;
                    p5Var3.e = i14;
                    p5Var3.f = s5Var6.d0.a[6] == 1;
                }
                org.telegram.messenger.i0.g3(s5Var6.F0);
                return;
            case 8:
                s5 s5Var7 = this.b;
                je.b bVar = s5Var7.s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = s5Var7.r0;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if ((bVar.isEmpty() || s5Var7.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                s5 s5Var8 = this.b;
                s5Var8.z0.b();
                org.telegram.messenger.i0.g3(new q5(s5Var8, 1));
                return;
        }
    }
}
