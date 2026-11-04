package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ r5(t5 t5Var, int i3) {
        this.a = i3;
        this.b = t5Var;
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
                t5 t5Var = this.b;
                if (t5Var.E0 != null) {
                    cg.h.c();
                    t5Var.E0 = null;
                }
                t5Var.D0 = false;
                t5Var.k();
                t5Var.x(false);
                return;
            case 2:
                this.b.t();
                return;
            case 3:
                cg.h hVar = this.b.A0;
                return;
            case 4:
                t5 t5Var2 = this.b;
                t5Var2.k();
                t5Var2.e = null;
                if (t5Var2.N >= 0 && t5Var2.M == -1) {
                    t5Var2.N = -1L;
                }
                t5Var2.x(false);
                t5Var2.t();
                return;
            case 5:
                t5 t5Var3 = this.b;
                if (t5Var3.d0 || t5Var3.x || t5Var3.D0 || t5Var3.E0 != null) {
                    return;
                }
                t5Var3.h0 = System.currentTimeMillis();
                if (ch0.U0 == null) {
                    ch0.U0 = new org.telegram.messenger.q5("cache generator queue", true);
                }
                t5Var3.D0 = true;
                t5Var3.e = null;
                cg.h.A++;
                org.telegram.messenger.q5 q5Var = ch0.U0;
                r5 r5Var = new r5(t5Var3, 9);
                t5Var3.E0 = r5Var;
                q5Var.postRunnable(r5Var);
                return;
            case 6:
                t5 t5Var4 = this.b;
                t5Var4.k();
                if (t5Var4.v0 != null && t5Var4.O) {
                    org.telegram.messenger.w7.G(t5Var4.K).a0(t5Var4.v0.c, false, false);
                }
                int i3 = t5Var4.P;
                if (i3 <= 0) {
                    t5Var4.O = true;
                } else {
                    t5Var4.P = i3 - 1;
                }
                if (t5Var4.G) {
                    t5Var4.G = false;
                } else {
                    t5Var4.F = true;
                }
                t5Var4.e = null;
                if (t5Var4.N >= 0) {
                    t5Var4.r = t5Var4.w;
                    t5Var4.s = null;
                } else if (t5Var4.b) {
                    q5 q5Var2 = t5Var4.r;
                    if (q5Var2 == null && t5Var4.s == null) {
                        t5Var4.r = t5Var4.w;
                    } else if (q5Var2 == null) {
                        t5Var4.r = t5Var4.s;
                        t5Var4.s = t5Var4.w;
                    } else {
                        t5Var4.s = t5Var4.w;
                    }
                } else {
                    t5Var4.r = t5Var4.w;
                }
                t5Var4.w = null;
                if (t5Var4.Q) {
                    t5Var4.Q = false;
                    t5Var4.z0++;
                    t5Var4.j();
                }
                if (t5Var4.d[3] < t5Var4.c) {
                    float f10 = t5Var4.h0;
                    t5Var4.c = f10 > 0.0f ? (int) (f10 * 1000.0f) : 0;
                }
                if (t5Var4.N >= 0 && t5Var4.M == -1) {
                    t5Var4.N = -1L;
                }
                t5Var4.c = t5Var4.d[3];
                Iterator it = t5Var4.t0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!t5Var4.c0 && t5Var4.E) || (t5Var4.n == null && t5Var4.r != null)) {
                    t5Var4.t();
                }
                t5Var4.x(false);
                return;
            case 7:
                t5 t5Var5 = this.b;
                if (t5Var5.d0) {
                    org.telegram.messenger.g0.h3(t5Var5.G0);
                    return;
                }
                if (!t5Var5.y && t5Var5.e0 == null) {
                    t5Var5.e0 = AnimatedFileNative.a(t5Var5.H.getAbsolutePath(), t5Var5.d, t5Var5.K, t5Var5.I, t5Var5.v0, false);
                    t5Var5.f0 = t5Var5.e0 == null && (!t5Var5.o0 || t5Var5.H0 > 15);
                    if (t5Var5.e0 != null) {
                        int[] iArr = t5Var5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            t5Var5.e0.f();
                            t5Var5.e0 = null;
                        }
                    }
                    t5Var5.d();
                    t5Var5.E();
                    if (t5Var5.o0 && t5Var5.e0 == null) {
                        int i10 = t5Var5.H0;
                        t5Var5.H0 = i10 + 1;
                        if (i10 <= 15) {
                            z11 = false;
                            t5Var5.y = z11;
                            org.telegram.messenger.g0.h3(new r5(t5Var5, 0));
                        }
                    }
                    z11 = true;
                    t5Var5.y = z11;
                    org.telegram.messenger.g0.h3(new r5(t5Var5, 0));
                }
                try {
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                if (t5Var5.A0 != null) {
                    if (t5Var5.w == null) {
                        if (t5Var5.h.isEmpty()) {
                            t5Var5.w = new q5(Bitmap.createBitmap(t5Var5.k0, t5Var5.j0, Bitmap.Config.ARGB_8888));
                        } else {
                            t5Var5.w = (q5) t5Var5.h.remove(0);
                        }
                    }
                    if (t5Var5.B0 == null) {
                        t5Var5.B0 = new a7.l();
                    }
                    System.currentTimeMillis();
                    a7.l lVar = t5Var5.B0;
                    int i11 = lVar.a;
                    cg.h hVar2 = t5Var5.A0;
                    int f11 = hVar2.f(t5Var5.w.b, hVar2.i);
                    lVar.a = hVar2.i;
                    if (hVar2.q && !hVar2.e.isEmpty()) {
                        int i12 = hVar2.i + 1;
                        hVar2.i = i12;
                        if (i12 >= hVar2.e.size()) {
                            hVar2.i = 0;
                        }
                    }
                    if (f11 != -1 && t5Var5.B0.a < i11) {
                        t5Var5.Q = true;
                    }
                    int[] iArr2 = t5Var5.d;
                    q5 q5Var3 = t5Var5.w;
                    int max = t5Var5.B0.a * Math.max(16, iArr2[4] / Math.max(1, t5Var5.A0.e.size()));
                    q5Var3.e = max;
                    iArr2[3] = max;
                    t5Var5.w.f = false;
                    if (t5Var5.A0.g()) {
                        org.telegram.messenger.g0.h3(t5Var5.F0);
                    }
                    if (f11 == -1) {
                        org.telegram.messenger.g0.h3(t5Var5.C0);
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(t5Var5.G0);
                        return;
                    }
                }
                if (t5Var5.e0 == null) {
                    int[] iArr3 = t5Var5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        org.telegram.messenger.g0.h3(t5Var5.C0);
                        return;
                    }
                }
                if (t5Var5.w == null) {
                    int[] iArr4 = t5Var5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (t5Var5.h.isEmpty()) {
                                float f12 = t5Var5.d[0];
                                float f13 = t5Var5.n0;
                                t5Var5.w = new q5(Bitmap.createBitmap((int) (f12 * f13), (int) (r0[1] * f13), Bitmap.Config.ARGB_8888));
                            } else {
                                t5Var5.w = (q5) t5Var5.h.remove(0);
                            }
                        } catch (Throwable th3) {
                            org.telegram.messenger.a8.g(th3, true);
                        }
                    }
                }
                if (t5Var5.M >= 0) {
                    t5Var5.d[3] = (int) t5Var5.M;
                    long j10 = t5Var5.M;
                    synchronized (t5Var5.R) {
                        t5Var5.M = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = t5Var5.v0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    t5Var5.e0.g(j10, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (t5Var5.w != null) {
                    System.currentTimeMillis();
                    if (t5Var5.e0.c(t5Var5.w.b, false, t5Var5.h0, t5Var5.i0, t5Var5.l0) == 0) {
                        org.telegram.messenger.g0.h3(t5Var5.C0);
                        return;
                    }
                    if (!t5Var5.f) {
                        t5Var5.f = t5Var5.e0.a[7] == 1;
                    }
                    int i13 = t5Var5.d[3];
                    if (i13 < t5Var5.c) {
                        t5Var5.Q = true;
                    }
                    if (z10) {
                        t5Var5.c = i13;
                    }
                    q5 q5Var4 = t5Var5.w;
                    q5Var4.e = i13;
                    q5Var4.f = t5Var5.e0.a[6] == 1;
                }
                org.telegram.messenger.g0.h3(t5Var5.G0);
                return;
            case 8:
                t5 t5Var6 = this.b;
                ue.b bVar = t5Var6.t0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = t5Var6.s0;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if ((bVar.isEmpty() || t5Var6.S) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                t5 t5Var7 = this.b;
                t5Var7.A0.b();
                org.telegram.messenger.g0.h3(new r5(t5Var7, 1));
                return;
        }
    }
}
