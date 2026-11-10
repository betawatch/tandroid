package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5 b;

    public /* synthetic */ s5(u5 u5Var, int i7) {
        this.a = i7;
        this.b = u5Var;
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
                u5 u5Var = this.b;
                if (u5Var.D0 != null) {
                    bg.i.c();
                    u5Var.D0 = null;
                }
                u5Var.C0 = false;
                u5Var.k();
                u5Var.x(false);
                return;
            case 2:
                this.b.t();
                return;
            case 3:
                bg.i iVar = this.b.z0;
                return;
            case 4:
                u5 u5Var2 = this.b;
                u5Var2.k();
                u5Var2.e = null;
                if (u5Var2.M >= 0 && u5Var2.L == -1) {
                    u5Var2.M = -1L;
                }
                u5Var2.x(false);
                u5Var2.t();
                return;
            case 5:
                u5 u5Var3 = this.b;
                if (u5Var3.c0 || u5Var3.x || u5Var3.C0 || u5Var3.D0 != null) {
                    return;
                }
                u5Var3.g0 = System.currentTimeMillis();
                if (zg0.T0 == null) {
                    zg0.T0 = new org.telegram.messenger.q5("cache generator queue", true);
                }
                u5Var3.C0 = true;
                u5Var3.e = null;
                bg.i.A++;
                org.telegram.messenger.q5 q5Var = zg0.T0;
                s5 s5Var = new s5(u5Var3, 9);
                u5Var3.D0 = s5Var;
                q5Var.postRunnable(s5Var);
                return;
            case 6:
                u5 u5Var4 = this.b;
                u5Var4.k();
                if (u5Var4.u0 != null && u5Var4.N) {
                    org.telegram.messenger.w7.G(u5Var4.J).Z(u5Var4.u0.c, false, false);
                }
                int i7 = u5Var4.O;
                if (i7 <= 0) {
                    u5Var4.N = true;
                } else {
                    u5Var4.O = i7 - 1;
                }
                if (u5Var4.F) {
                    u5Var4.F = false;
                } else {
                    u5Var4.E = true;
                }
                u5Var4.e = null;
                if (u5Var4.M >= 0) {
                    u5Var4.r = u5Var4.w;
                    u5Var4.s = null;
                } else if (u5Var4.b) {
                    r5 r5Var = u5Var4.r;
                    if (r5Var == null && u5Var4.s == null) {
                        u5Var4.r = u5Var4.w;
                    } else if (r5Var == null) {
                        u5Var4.r = u5Var4.s;
                        u5Var4.s = u5Var4.w;
                    } else {
                        u5Var4.s = u5Var4.w;
                    }
                } else {
                    u5Var4.r = u5Var4.w;
                }
                u5Var4.w = null;
                if (u5Var4.P) {
                    u5Var4.P = false;
                    u5Var4.y0++;
                    u5Var4.j();
                }
                if (u5Var4.d[3] < u5Var4.c) {
                    float f10 = u5Var4.g0;
                    u5Var4.c = f10 > 0.0f ? (int) (f10 * 1000.0f) : 0;
                }
                if (u5Var4.M >= 0 && u5Var4.L == -1) {
                    u5Var4.M = -1L;
                }
                u5Var4.c = u5Var4.d[3];
                Iterator it = u5Var4.s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!u5Var4.b0 && u5Var4.D) || (u5Var4.n == null && u5Var4.r != null)) {
                    u5Var4.t();
                }
                u5Var4.x(false);
                return;
            case 7:
                u5 u5Var5 = this.b;
                if (u5Var5.c0) {
                    org.telegram.messenger.g0.h3(u5Var5.F0);
                    return;
                }
                if (!u5Var5.y && u5Var5.d0 == null) {
                    u5Var5.d0 = AnimatedFileNative.a(u5Var5.G.getAbsolutePath(), u5Var5.d, u5Var5.J, u5Var5.H, u5Var5.u0, false);
                    u5Var5.e0 = u5Var5.d0 == null && (!u5Var5.n0 || u5Var5.G0 > 15);
                    if (u5Var5.d0 != null) {
                        int[] iArr = u5Var5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            u5Var5.d0.f();
                            u5Var5.d0 = null;
                        }
                    }
                    u5Var5.d();
                    u5Var5.E();
                    if (u5Var5.n0 && u5Var5.d0 == null) {
                        int i10 = u5Var5.G0;
                        u5Var5.G0 = i10 + 1;
                        if (i10 <= 15) {
                            z10 = false;
                            u5Var5.y = z10;
                            org.telegram.messenger.g0.h3(new s5(u5Var5, 0));
                        }
                    }
                    z10 = true;
                    u5Var5.y = z10;
                    org.telegram.messenger.g0.h3(new s5(u5Var5, 0));
                }
                try {
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                if (u5Var5.z0 != null) {
                    if (u5Var5.w == null) {
                        if (u5Var5.h.isEmpty()) {
                            u5Var5.w = new r5(Bitmap.createBitmap(u5Var5.j0, u5Var5.i0, Bitmap.Config.ARGB_8888));
                        } else {
                            u5Var5.w = (r5) u5Var5.h.remove(0);
                        }
                    }
                    if (u5Var5.A0 == null) {
                        u5Var5.A0 = new b7.l();
                    }
                    System.currentTimeMillis();
                    b7.l lVar = u5Var5.A0;
                    int i11 = lVar.a;
                    bg.i iVar2 = u5Var5.z0;
                    int f11 = iVar2.f(iVar2.i, u5Var5.w.b);
                    lVar.a = iVar2.i;
                    if (iVar2.q && !iVar2.e.isEmpty()) {
                        int i12 = iVar2.i + 1;
                        iVar2.i = i12;
                        if (i12 >= iVar2.e.size()) {
                            iVar2.i = 0;
                        }
                    }
                    if (f11 != -1 && u5Var5.A0.a < i11) {
                        u5Var5.P = true;
                    }
                    int[] iArr2 = u5Var5.d;
                    r5 r5Var2 = u5Var5.w;
                    int max = u5Var5.A0.a * Math.max(16, iArr2[4] / Math.max(1, u5Var5.z0.e.size()));
                    r5Var2.e = max;
                    iArr2[3] = max;
                    u5Var5.w.f = false;
                    if (u5Var5.z0.g()) {
                        org.telegram.messenger.g0.h3(u5Var5.E0);
                    }
                    if (f11 == -1) {
                        org.telegram.messenger.g0.h3(u5Var5.B0);
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(u5Var5.F0);
                        return;
                    }
                }
                if (u5Var5.d0 == null) {
                    int[] iArr3 = u5Var5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        org.telegram.messenger.g0.h3(u5Var5.B0);
                        return;
                    }
                }
                if (u5Var5.w == null) {
                    int[] iArr4 = u5Var5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (u5Var5.h.isEmpty()) {
                                float f12 = u5Var5.d[0];
                                float f13 = u5Var5.m0;
                                u5Var5.w = new r5(Bitmap.createBitmap((int) (f12 * f13), (int) (r0[1] * f13), Bitmap.Config.ARGB_8888));
                            } else {
                                u5Var5.w = (r5) u5Var5.h.remove(0);
                            }
                        } catch (Throwable th3) {
                            org.telegram.messenger.a8.g(th3, true);
                        }
                    }
                }
                if (u5Var5.L >= 0) {
                    u5Var5.d[3] = (int) u5Var5.L;
                    long j3 = u5Var5.L;
                    synchronized (u5Var5.Q) {
                        u5Var5.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = u5Var5.u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    u5Var5.d0.g(j3, true);
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (u5Var5.w != null) {
                    System.currentTimeMillis();
                    if (u5Var5.d0.c(u5Var5.w.b, false, u5Var5.g0, u5Var5.h0, u5Var5.k0) == 0) {
                        org.telegram.messenger.g0.h3(u5Var5.B0);
                        return;
                    }
                    if (!u5Var5.f) {
                        u5Var5.f = u5Var5.d0.a[7] == 1;
                    }
                    int i13 = u5Var5.d[3];
                    if (i13 < u5Var5.c) {
                        u5Var5.P = true;
                    }
                    if (z9) {
                        u5Var5.c = i13;
                    }
                    r5 r5Var3 = u5Var5.w;
                    r5Var3.e = i13;
                    r5Var3.f = u5Var5.d0.a[6] == 1;
                }
                org.telegram.messenger.g0.h3(u5Var5.F0);
                return;
            case 8:
                u5 u5Var6 = this.b;
                xe.b bVar = u5Var6.s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = u5Var6.r0;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if ((bVar.isEmpty() || u5Var6.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                u5 u5Var7 = this.b;
                u5Var7.z0.b();
                org.telegram.messenger.g0.h3(new s5(u5Var7, 1));
                return;
        }
    }
}
