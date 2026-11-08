package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ t5(v5 v5Var, int i7) {
        this.a = i7;
        this.b = v5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.i();
                return;
            case 1:
                v5 v5Var = this.b;
                if (v5Var.D0 != null) {
                    bg.i.c();
                    v5Var.D0 = null;
                }
                v5Var.C0 = false;
                v5Var.k();
                v5Var.x(false);
                return;
            case 2:
                this.b.t();
                return;
            case 3:
                bg.i iVar = this.b.z0;
                return;
            case 4:
                v5 v5Var2 = this.b;
                v5Var2.k();
                v5Var2.e = null;
                if (v5Var2.M >= 0 && v5Var2.L == -1) {
                    v5Var2.M = -1L;
                }
                v5Var2.x(false);
                v5Var2.t();
                return;
            case 5:
                v5 v5Var3 = this.b;
                if (v5Var3.c0 || v5Var3.x || v5Var3.C0 || v5Var3.D0 != null) {
                    return;
                }
                v5Var3.g0 = System.currentTimeMillis();
                if (zg0.T0 == null) {
                    zg0.T0 = new org.telegram.messenger.q5("cache generator queue", true);
                }
                v5Var3.C0 = true;
                v5Var3.e = null;
                bg.i.A++;
                org.telegram.messenger.q5 q5Var = zg0.T0;
                t5 t5Var = new t5(v5Var3, 9);
                v5Var3.D0 = t5Var;
                q5Var.postRunnable(t5Var);
                return;
            case 6:
                v5 v5Var4 = this.b;
                v5Var4.k();
                if (v5Var4.u0 != null && v5Var4.N) {
                    org.telegram.messenger.w7.G(v5Var4.J).Z(v5Var4.u0.c, false, false);
                }
                int i7 = v5Var4.O;
                if (i7 <= 0) {
                    v5Var4.N = true;
                } else {
                    v5Var4.O = i7 - 1;
                }
                if (v5Var4.F) {
                    v5Var4.F = false;
                } else {
                    v5Var4.E = true;
                }
                v5Var4.e = null;
                if (v5Var4.M >= 0) {
                    v5Var4.r = v5Var4.w;
                    v5Var4.s = null;
                } else if (v5Var4.b) {
                    s5 s5Var = v5Var4.r;
                    if (s5Var == null && v5Var4.s == null) {
                        v5Var4.r = v5Var4.w;
                    } else if (s5Var == null) {
                        v5Var4.r = v5Var4.s;
                        v5Var4.s = v5Var4.w;
                    } else {
                        v5Var4.s = v5Var4.w;
                    }
                } else {
                    v5Var4.r = v5Var4.w;
                }
                v5Var4.w = null;
                if (v5Var4.P) {
                    v5Var4.P = false;
                    v5Var4.y0++;
                    v5Var4.j();
                }
                if (v5Var4.d[3] < v5Var4.c) {
                    float f10 = v5Var4.g0;
                    v5Var4.c = f10 > 0.0f ? (int) (f10 * 1000.0f) : 0;
                }
                if (v5Var4.M >= 0 && v5Var4.L == -1) {
                    v5Var4.M = -1L;
                }
                v5Var4.c = v5Var4.d[3];
                Iterator it = v5Var4.s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!v5Var4.b0 && v5Var4.D) || (v5Var4.n == null && v5Var4.r != null)) {
                    v5Var4.t();
                }
                v5Var4.x(false);
                return;
            case 7:
                v5 v5Var5 = this.b;
                if (v5Var5.c0) {
                    org.telegram.messenger.g0.h3(v5Var5.F0);
                    return;
                }
                if (!v5Var5.y && v5Var5.d0 == null) {
                    v5Var5.d0 = AnimatedFileNative.a(v5Var5.G.getAbsolutePath(), v5Var5.d, v5Var5.J, v5Var5.H, v5Var5.u0, false);
                    v5Var5.e0 = v5Var5.d0 == null && (!v5Var5.n0 || v5Var5.G0 > 15);
                    if (v5Var5.d0 != null) {
                        int[] iArr = v5Var5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            v5Var5.d0.f();
                            v5Var5.d0 = null;
                        }
                    }
                    v5Var5.d();
                    v5Var5.E();
                    if (v5Var5.n0 && v5Var5.d0 == null) {
                        int i10 = v5Var5.G0;
                        v5Var5.G0 = i10 + 1;
                        if (i10 <= 15) {
                            z10 = false;
                            v5Var5.y = z10;
                            org.telegram.messenger.g0.h3(new t5(v5Var5, 0));
                        }
                    }
                    z10 = true;
                    v5Var5.y = z10;
                    org.telegram.messenger.g0.h3(new t5(v5Var5, 0));
                }
                try {
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                if (v5Var5.z0 != null) {
                    if (v5Var5.w == null) {
                        if (v5Var5.h.isEmpty()) {
                            v5Var5.w = new s5(Bitmap.createBitmap(v5Var5.j0, v5Var5.i0, Bitmap.Config.ARGB_8888));
                        } else {
                            v5Var5.w = (s5) v5Var5.h.remove(0);
                        }
                    }
                    if (v5Var5.A0 == null) {
                        v5Var5.A0 = new b7.l();
                    }
                    System.currentTimeMillis();
                    b7.l lVar = v5Var5.A0;
                    int i11 = lVar.a;
                    bg.i iVar2 = v5Var5.z0;
                    int f11 = iVar2.f(iVar2.i, v5Var5.w.b);
                    lVar.a = iVar2.i;
                    if (iVar2.q && !iVar2.e.isEmpty()) {
                        int i12 = iVar2.i + 1;
                        iVar2.i = i12;
                        if (i12 >= iVar2.e.size()) {
                            iVar2.i = 0;
                        }
                    }
                    if (f11 != -1 && v5Var5.A0.a < i11) {
                        v5Var5.P = true;
                    }
                    int[] iArr2 = v5Var5.d;
                    s5 s5Var2 = v5Var5.w;
                    int max = v5Var5.A0.a * Math.max(16, iArr2[4] / Math.max(1, v5Var5.z0.e.size()));
                    s5Var2.e = max;
                    iArr2[3] = max;
                    v5Var5.w.f = false;
                    if (v5Var5.z0.g()) {
                        org.telegram.messenger.g0.h3(v5Var5.E0);
                    }
                    if (f11 == -1) {
                        org.telegram.messenger.g0.h3(v5Var5.B0);
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(v5Var5.F0);
                        return;
                    }
                }
                if (v5Var5.d0 == null) {
                    int[] iArr3 = v5Var5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        org.telegram.messenger.g0.h3(v5Var5.B0);
                        return;
                    }
                }
                if (v5Var5.w == null) {
                    int[] iArr4 = v5Var5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (v5Var5.h.isEmpty()) {
                                float f12 = v5Var5.d[0];
                                float f13 = v5Var5.m0;
                                v5Var5.w = new s5(Bitmap.createBitmap((int) (f12 * f13), (int) (r0[1] * f13), Bitmap.Config.ARGB_8888));
                            } else {
                                v5Var5.w = (s5) v5Var5.h.remove(0);
                            }
                        } catch (Throwable th3) {
                            org.telegram.messenger.a8.g(th3, true);
                        }
                    }
                }
                if (v5Var5.L >= 0) {
                    v5Var5.d[3] = (int) v5Var5.L;
                    long j3 = v5Var5.L;
                    synchronized (v5Var5.Q) {
                        v5Var5.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = v5Var5.u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    v5Var5.d0.g(j3, true);
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (v5Var5.w != null) {
                    System.currentTimeMillis();
                    if (v5Var5.d0.c(v5Var5.w.b, false, v5Var5.g0, v5Var5.h0, v5Var5.k0) == 0) {
                        org.telegram.messenger.g0.h3(v5Var5.B0);
                        return;
                    }
                    if (!v5Var5.f) {
                        v5Var5.f = v5Var5.d0.a[7] == 1;
                    }
                    int i13 = v5Var5.d[3];
                    if (i13 < v5Var5.c) {
                        v5Var5.P = true;
                    }
                    if (z9) {
                        v5Var5.c = i13;
                    }
                    s5 s5Var3 = v5Var5.w;
                    s5Var3.e = i13;
                    s5Var3.f = v5Var5.d0.a[6] == 1;
                }
                org.telegram.messenger.g0.h3(v5Var5.F0);
                return;
            case 8:
                v5 v5Var6 = this.b;
                xe.b bVar = v5Var6.s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = v5Var6.r0;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if ((bVar.isEmpty() || v5Var6.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                v5 v5Var7 = this.b;
                v5Var7.z0.b();
                org.telegram.messenger.g0.h3(new t5(v5Var7, 1));
                return;
        }
    }
}
