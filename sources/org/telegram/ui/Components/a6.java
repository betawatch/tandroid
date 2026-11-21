package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AnimatedFileDrawableStream;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ a6(c6 c6Var, int i7) {
        this.a = i7;
        this.b = c6Var;
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
                c6 c6Var = this.b;
                if (c6Var.E0 != null) {
                    bg.i.c();
                    c6Var.E0 = null;
                }
                c6Var.D0 = false;
                c6Var.k();
                c6Var.x(false);
                return;
            case 2:
                this.b.t();
                return;
            case 3:
                bg.i iVar = this.b.A0;
                return;
            case 4:
                c6 c6Var2 = this.b;
                c6Var2.k();
                c6Var2.e = null;
                if (c6Var2.N >= 0 && c6Var2.M == -1) {
                    c6Var2.N = -1L;
                }
                c6Var2.x(false);
                c6Var2.t();
                return;
            case 5:
                c6 c6Var3 = this.b;
                if (c6Var3.d0 || c6Var3.x || c6Var3.D0 || c6Var3.E0 != null) {
                    return;
                }
                c6Var3.h0 = System.currentTimeMillis();
                if (oh0.U0 == null) {
                    oh0.U0 = new org.telegram.messenger.r5("cache generator queue", true);
                }
                c6Var3.D0 = true;
                c6Var3.e = null;
                bg.i.A++;
                org.telegram.messenger.r5 r5Var = oh0.U0;
                a6 a6Var = new a6(c6Var3, 9);
                c6Var3.E0 = a6Var;
                r5Var.postRunnable(a6Var);
                return;
            case 6:
                c6 c6Var4 = this.b;
                c6Var4.k();
                if (c6Var4.v0 != null && c6Var4.O) {
                    org.telegram.messenger.w7.G(c6Var4.K).Z(c6Var4.v0.c, false, false);
                }
                int i7 = c6Var4.P;
                if (i7 <= 0) {
                    c6Var4.O = true;
                } else {
                    c6Var4.P = i7 - 1;
                }
                if (c6Var4.G) {
                    c6Var4.G = false;
                } else {
                    c6Var4.F = true;
                }
                c6Var4.e = null;
                if (c6Var4.N >= 0) {
                    c6Var4.r = c6Var4.w;
                    c6Var4.s = null;
                } else if (c6Var4.b) {
                    z5 z5Var = c6Var4.r;
                    if (z5Var == null && c6Var4.s == null) {
                        c6Var4.r = c6Var4.w;
                    } else if (z5Var == null) {
                        c6Var4.r = c6Var4.s;
                        c6Var4.s = c6Var4.w;
                    } else {
                        c6Var4.s = c6Var4.w;
                    }
                } else {
                    c6Var4.r = c6Var4.w;
                }
                c6Var4.w = null;
                if (c6Var4.Q) {
                    c6Var4.Q = false;
                    c6Var4.z0++;
                    c6Var4.j();
                }
                if (c6Var4.d[3] < c6Var4.c) {
                    float f10 = c6Var4.h0;
                    c6Var4.c = f10 > 0.0f ? (int) (f10 * 1000.0f) : 0;
                }
                if (c6Var4.N >= 0 && c6Var4.M == -1) {
                    c6Var4.N = -1L;
                }
                c6Var4.c = c6Var4.d[3];
                Iterator it = c6Var4.t0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!c6Var4.c0 && c6Var4.E) || (c6Var4.n == null && c6Var4.r != null)) {
                    c6Var4.t();
                }
                c6Var4.x(false);
                return;
            case 7:
                c6 c6Var5 = this.b;
                if (c6Var5.d0) {
                    org.telegram.messenger.g0.g3(c6Var5.G0);
                    return;
                }
                if (!c6Var5.y && c6Var5.e0 == null) {
                    c6Var5.e0 = AnimatedFileNative.a(c6Var5.H.getAbsolutePath(), c6Var5.d, c6Var5.K, c6Var5.I, c6Var5.v0, false);
                    c6Var5.f0 = c6Var5.e0 == null && (!c6Var5.o0 || c6Var5.H0 > 15);
                    if (c6Var5.e0 != null) {
                        int[] iArr = c6Var5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            c6Var5.e0.f();
                            c6Var5.e0 = null;
                        }
                    }
                    c6Var5.d();
                    c6Var5.E();
                    if (c6Var5.o0 && c6Var5.e0 == null) {
                        int i10 = c6Var5.H0;
                        c6Var5.H0 = i10 + 1;
                        if (i10 <= 15) {
                            z11 = false;
                            c6Var5.y = z11;
                            org.telegram.messenger.g0.g3(new a6(c6Var5, 0));
                        }
                    }
                    z11 = true;
                    c6Var5.y = z11;
                    org.telegram.messenger.g0.g3(new a6(c6Var5, 0));
                }
                try {
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                if (c6Var5.A0 != null) {
                    if (c6Var5.w == null) {
                        if (c6Var5.h.isEmpty()) {
                            c6Var5.w = new z5(Bitmap.createBitmap(c6Var5.k0, c6Var5.j0, Bitmap.Config.ARGB_8888));
                        } else {
                            c6Var5.w = (z5) c6Var5.h.remove(0);
                        }
                    }
                    if (c6Var5.B0 == null) {
                        c6Var5.B0 = new b7.l();
                    }
                    System.currentTimeMillis();
                    b7.l lVar = c6Var5.B0;
                    int i11 = lVar.a;
                    bg.i iVar2 = c6Var5.A0;
                    int f11 = iVar2.f(iVar2.i, c6Var5.w.b);
                    lVar.a = iVar2.i;
                    if (iVar2.q && !iVar2.e.isEmpty()) {
                        int i12 = iVar2.i + 1;
                        iVar2.i = i12;
                        if (i12 >= iVar2.e.size()) {
                            iVar2.i = 0;
                        }
                    }
                    if (f11 != -1 && c6Var5.B0.a < i11) {
                        c6Var5.Q = true;
                    }
                    int[] iArr2 = c6Var5.d;
                    z5 z5Var2 = c6Var5.w;
                    int max = c6Var5.B0.a * Math.max(16, iArr2[4] / Math.max(1, c6Var5.A0.e.size()));
                    z5Var2.e = max;
                    iArr2[3] = max;
                    c6Var5.w.f = false;
                    if (c6Var5.A0.g()) {
                        org.telegram.messenger.g0.g3(c6Var5.F0);
                    }
                    if (f11 == -1) {
                        org.telegram.messenger.g0.g3(c6Var5.C0);
                        return;
                    } else {
                        org.telegram.messenger.g0.g3(c6Var5.G0);
                        return;
                    }
                }
                if (c6Var5.e0 == null) {
                    int[] iArr3 = c6Var5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        org.telegram.messenger.g0.g3(c6Var5.C0);
                        return;
                    }
                }
                if (c6Var5.w == null) {
                    int[] iArr4 = c6Var5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (c6Var5.h.isEmpty()) {
                                float f12 = c6Var5.d[0];
                                float f13 = c6Var5.n0;
                                c6Var5.w = new z5(Bitmap.createBitmap((int) (f12 * f13), (int) (r0[1] * f13), Bitmap.Config.ARGB_8888));
                            } else {
                                c6Var5.w = (z5) c6Var5.h.remove(0);
                            }
                        } catch (Throwable th3) {
                            org.telegram.messenger.a8.g(th3, true);
                        }
                    }
                }
                if (c6Var5.M >= 0) {
                    c6Var5.d[3] = (int) c6Var5.M;
                    long j3 = c6Var5.M;
                    synchronized (c6Var5.R) {
                        c6Var5.M = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = c6Var5.v0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.d();
                    }
                    c6Var5.e0.g(j3, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c6Var5.w != null) {
                    System.currentTimeMillis();
                    if (c6Var5.e0.c(c6Var5.w.b, false, c6Var5.h0, c6Var5.i0, c6Var5.l0) == 0) {
                        org.telegram.messenger.g0.g3(c6Var5.C0);
                        return;
                    }
                    if (!c6Var5.f) {
                        c6Var5.f = c6Var5.e0.a[7] == 1;
                    }
                    int i13 = c6Var5.d[3];
                    if (i13 < c6Var5.c) {
                        c6Var5.Q = true;
                    }
                    if (z10) {
                        c6Var5.c = i13;
                    }
                    z5 z5Var3 = c6Var5.w;
                    z5Var3.e = i13;
                    z5Var3.f = c6Var5.e0.a[6] == 1;
                }
                org.telegram.messenger.g0.g3(c6Var5.G0);
                return;
            case 8:
                c6 c6Var6 = this.b;
                xe.b bVar = c6Var6.t0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = c6Var6.s0;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if ((bVar.isEmpty() || c6Var6.S) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                c6 c6Var7 = this.b;
                c6Var7.A0.b();
                org.telegram.messenger.g0.g3(new a6(c6Var7, 1));
                return;
        }
    }
}
