package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ d6(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
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
                yf.e eVar = this.b.z0;
                return;
            case 2:
                f6 f6Var = this.b;
                f6Var.k();
                f6Var.e = null;
                if (f6Var.M >= 0 && f6Var.L == -1) {
                    f6Var.M = -1L;
                }
                f6Var.x(false);
                f6Var.t();
                return;
            case 3:
                f6 f6Var2 = this.b;
                if (f6Var2.c0 || f6Var2.w || f6Var2.C0 || f6Var2.D0 != null) {
                    return;
                }
                f6Var2.g0 = System.currentTimeMillis();
                if (ck0.T0 == null) {
                    ck0.T0 = new DispatchQueue("cache generator queue");
                }
                f6Var2.C0 = true;
                f6Var2.e = null;
                yf.e.A++;
                DispatchQueue dispatchQueue = ck0.T0;
                d6 d6Var = new d6(f6Var2, 7);
                f6Var2.D0 = d6Var;
                dispatchQueue.postRunnable(d6Var);
                return;
            case 4:
                f6 f6Var3 = this.b;
                f6Var3.k();
                if (f6Var3.u0 != null && f6Var3.N) {
                    FileLoader.getInstance(f6Var3.J).removeLoadingVideo(f6Var3.u0.getDocument(), false, false);
                }
                int i10 = f6Var3.O;
                if (i10 <= 0) {
                    f6Var3.N = true;
                } else {
                    f6Var3.O = i10 - 1;
                }
                if (f6Var3.F) {
                    f6Var3.F = false;
                } else {
                    f6Var3.E = true;
                }
                f6Var3.e = null;
                if (f6Var3.M >= 0) {
                    f6Var3.r = f6Var3.v;
                    f6Var3.s = null;
                } else if (f6Var3.b) {
                    c6 c6Var = f6Var3.r;
                    if (c6Var == null && f6Var3.s == null) {
                        f6Var3.r = f6Var3.v;
                    } else if (c6Var == null) {
                        f6Var3.r = f6Var3.s;
                        f6Var3.s = f6Var3.v;
                    } else {
                        f6Var3.s = f6Var3.v;
                    }
                } else {
                    f6Var3.r = f6Var3.v;
                }
                f6Var3.v = null;
                if (f6Var3.P) {
                    f6Var3.P = false;
                    f6Var3.y0++;
                    f6Var3.j();
                }
                if (f6Var3.d[3] < f6Var3.c) {
                    float f7 = f6Var3.g0;
                    f6Var3.c = f7 > 0.0f ? (int) (f7 * 1000.0f) : 0;
                }
                if (f6Var3.M >= 0 && f6Var3.L == -1) {
                    f6Var3.M = -1L;
                }
                f6Var3.c = f6Var3.d[3];
                Iterator it = f6Var3.s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!f6Var3.b0 && f6Var3.y) || (f6Var3.n == null && f6Var3.r != null)) {
                    f6Var3.t();
                }
                f6Var3.x(false);
                return;
            case 5:
                f6 f6Var4 = this.b;
                if (f6Var4.c0) {
                    AndroidUtilities.runOnUIThread(f6Var4.F0);
                    return;
                }
                if (!f6Var4.x && f6Var4.d0 == null) {
                    f6Var4.d0 = AnimatedFileNative.a(f6Var4.G.getAbsolutePath(), f6Var4.d, f6Var4.J, f6Var4.H, f6Var4.u0, false);
                    f6Var4.e0 = f6Var4.d0 == null && (!f6Var4.n0 || f6Var4.G0 > 15);
                    if (f6Var4.d0 != null) {
                        int[] iArr = f6Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            f6Var4.d0.f();
                            f6Var4.d0 = null;
                        }
                    }
                    f6Var4.d();
                    f6Var4.E();
                    if (f6Var4.n0 && f6Var4.d0 == null) {
                        int i11 = f6Var4.G0;
                        f6Var4.G0 = i11 + 1;
                        if (i11 <= 15) {
                            z11 = false;
                            f6Var4.x = z11;
                            AndroidUtilities.runOnUIThread(new d6(f6Var4, 0));
                        }
                    }
                    z11 = true;
                    f6Var4.x = z11;
                    AndroidUtilities.runOnUIThread(new d6(f6Var4, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (f6Var4.z0 != null) {
                    if (f6Var4.v == null) {
                        if (f6Var4.h.isEmpty()) {
                            f6Var4.v = new c6(Bitmap.createBitmap(f6Var4.j0, f6Var4.i0, Bitmap.Config.ARGB_8888));
                        } else {
                            f6Var4.v = (c6) f6Var4.h.remove(0);
                        }
                    }
                    if (f6Var4.A0 == null) {
                        f6Var4.A0 = new com.google.android.gms.internal.cast.a();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = f6Var4.A0;
                    int i12 = aVar.a;
                    yf.e eVar2 = f6Var4.z0;
                    int f10 = eVar2.f(f6Var4.v.b, eVar2.i);
                    aVar.a = eVar2.i;
                    if (eVar2.q && !eVar2.e.isEmpty()) {
                        int i13 = eVar2.i + 1;
                        eVar2.i = i13;
                        if (i13 >= eVar2.e.size()) {
                            eVar2.i = 0;
                        }
                    }
                    if (f10 != -1 && f6Var4.A0.a < i12) {
                        f6Var4.P = true;
                    }
                    int[] iArr2 = f6Var4.d;
                    c6 c6Var2 = f6Var4.v;
                    int max = f6Var4.A0.a * Math.max(16, iArr2[4] / Math.max(1, f6Var4.z0.e.size()));
                    c6Var2.e = max;
                    iArr2[3] = max;
                    f6Var4.v.f = false;
                    if (f6Var4.z0.g()) {
                        AndroidUtilities.runOnUIThread(f6Var4.E0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(f6Var4.B0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(f6Var4.F0);
                        return;
                    }
                }
                if (f6Var4.d0 == null) {
                    int[] iArr3 = f6Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(f6Var4.B0);
                        return;
                    }
                }
                if (f6Var4.v == null) {
                    int[] iArr4 = f6Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (f6Var4.h.isEmpty()) {
                                float f11 = f6Var4.d[0];
                                float f12 = f6Var4.m0;
                                f6Var4.v = new c6(Bitmap.createBitmap((int) (f11 * f12), (int) (r0[1] * f12), Bitmap.Config.ARGB_8888));
                            } else {
                                f6Var4.v = (c6) f6Var4.h.remove(0);
                            }
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                }
                if (f6Var4.L >= 0) {
                    f6Var4.d[3] = (int) f6Var4.L;
                    long j3 = f6Var4.L;
                    synchronized (f6Var4.Q) {
                        f6Var4.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = f6Var4.u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    f6Var4.d0.g(j3, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (f6Var4.v != null) {
                    System.currentTimeMillis();
                    if (f6Var4.d0.c(f6Var4.v.b, false, f6Var4.g0, f6Var4.h0, f6Var4.k0) == 0) {
                        AndroidUtilities.runOnUIThread(f6Var4.B0);
                        return;
                    }
                    if (!f6Var4.f) {
                        f6Var4.f = f6Var4.d0.a[7] == 1;
                    }
                    int i14 = f6Var4.d[3];
                    if (i14 < f6Var4.c) {
                        f6Var4.P = true;
                    }
                    if (z10) {
                        f6Var4.c = i14;
                    }
                    c6 c6Var3 = f6Var4.v;
                    c6Var3.e = i14;
                    c6Var3.f = f6Var4.d0.a[6] == 1;
                }
                AndroidUtilities.runOnUIThread(f6Var4.F0);
                return;
            case 6:
                f6 f6Var5 = this.b;
                qe.b bVar = f6Var5.s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = f6Var5.r0;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if ((bVar.isEmpty() || f6Var5.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                f6 f6Var6 = this.b;
                f6Var6.z0.b();
                AndroidUtilities.runOnUIThread(new d6(f6Var6, 8));
                return;
            default:
                f6 f6Var7 = this.b;
                if (f6Var7.D0 != null) {
                    yf.e.c();
                    f6Var7.D0 = null;
                }
                f6Var7.C0 = false;
                f6Var7.k();
                f6Var7.x(false);
                return;
        }
    }
}
