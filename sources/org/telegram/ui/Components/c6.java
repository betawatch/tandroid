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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ c6(e6 e6Var, int i10) {
        this.a = i10;
        this.b = e6Var;
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
                e6 e6Var = this.b;
                if (e6Var.D0 != null) {
                    zf.e.c();
                    e6Var.D0 = null;
                }
                e6Var.C0 = false;
                e6Var.k();
                e6Var.x(false);
                return;
            case 2:
                this.b.t();
                return;
            case 3:
                zf.e eVar = this.b.z0;
                return;
            case 4:
                e6 e6Var2 = this.b;
                e6Var2.k();
                e6Var2.e = null;
                if (e6Var2.M >= 0 && e6Var2.L == -1) {
                    e6Var2.M = -1L;
                }
                e6Var2.x(false);
                e6Var2.t();
                return;
            case 5:
                e6 e6Var3 = this.b;
                if (e6Var3.c0 || e6Var3.w || e6Var3.C0 || e6Var3.D0 != null) {
                    return;
                }
                e6Var3.g0 = System.currentTimeMillis();
                if (yj0.T0 == null) {
                    yj0.T0 = new DispatchQueue("cache generator queue");
                }
                e6Var3.C0 = true;
                e6Var3.e = null;
                zf.e.A++;
                DispatchQueue dispatchQueue = yj0.T0;
                c6 c6Var = new c6(e6Var3, 9);
                e6Var3.D0 = c6Var;
                dispatchQueue.postRunnable(c6Var);
                return;
            case 6:
                e6 e6Var4 = this.b;
                e6Var4.k();
                if (e6Var4.u0 != null && e6Var4.N) {
                    FileLoader.getInstance(e6Var4.J).removeLoadingVideo(e6Var4.u0.getDocument(), false, false);
                }
                int i10 = e6Var4.O;
                if (i10 <= 0) {
                    e6Var4.N = true;
                } else {
                    e6Var4.O = i10 - 1;
                }
                if (e6Var4.F) {
                    e6Var4.F = false;
                } else {
                    e6Var4.E = true;
                }
                e6Var4.e = null;
                if (e6Var4.M >= 0) {
                    e6Var4.r = e6Var4.v;
                    e6Var4.s = null;
                } else if (e6Var4.b) {
                    b6 b6Var = e6Var4.r;
                    if (b6Var == null && e6Var4.s == null) {
                        e6Var4.r = e6Var4.v;
                    } else if (b6Var == null) {
                        e6Var4.r = e6Var4.s;
                        e6Var4.s = e6Var4.v;
                    } else {
                        e6Var4.s = e6Var4.v;
                    }
                } else {
                    e6Var4.r = e6Var4.v;
                }
                e6Var4.v = null;
                if (e6Var4.P) {
                    e6Var4.P = false;
                    e6Var4.y0++;
                    e6Var4.j();
                }
                if (e6Var4.d[3] < e6Var4.c) {
                    float f7 = e6Var4.g0;
                    e6Var4.c = f7 > 0.0f ? (int) (f7 * 1000.0f) : 0;
                }
                if (e6Var4.M >= 0 && e6Var4.L == -1) {
                    e6Var4.M = -1L;
                }
                e6Var4.c = e6Var4.d[3];
                Iterator it = e6Var4.s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!e6Var4.b0 && e6Var4.y) || (e6Var4.n == null && e6Var4.r != null)) {
                    e6Var4.t();
                }
                e6Var4.x(false);
                return;
            case 7:
                e6 e6Var5 = this.b;
                if (e6Var5.c0) {
                    AndroidUtilities.runOnUIThread(e6Var5.F0);
                    return;
                }
                if (!e6Var5.x && e6Var5.d0 == null) {
                    e6Var5.d0 = AnimatedFileNative.a(e6Var5.G.getAbsolutePath(), e6Var5.d, e6Var5.J, e6Var5.H, e6Var5.u0, false);
                    e6Var5.e0 = e6Var5.d0 == null && (!e6Var5.n0 || e6Var5.G0 > 15);
                    if (e6Var5.d0 != null) {
                        int[] iArr = e6Var5.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            e6Var5.d0.f();
                            e6Var5.d0 = null;
                        }
                    }
                    e6Var5.d();
                    e6Var5.E();
                    if (e6Var5.n0 && e6Var5.d0 == null) {
                        int i11 = e6Var5.G0;
                        e6Var5.G0 = i11 + 1;
                        if (i11 <= 15) {
                            z11 = false;
                            e6Var5.x = z11;
                            AndroidUtilities.runOnUIThread(new c6(e6Var5, 0));
                        }
                    }
                    z11 = true;
                    e6Var5.x = z11;
                    AndroidUtilities.runOnUIThread(new c6(e6Var5, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (e6Var5.z0 != null) {
                    if (e6Var5.v == null) {
                        if (e6Var5.h.isEmpty()) {
                            e6Var5.v = new b6(Bitmap.createBitmap(e6Var5.j0, e6Var5.i0, Bitmap.Config.ARGB_8888));
                        } else {
                            e6Var5.v = (b6) e6Var5.h.remove(0);
                        }
                    }
                    if (e6Var5.A0 == null) {
                        e6Var5.A0 = new com.google.android.gms.internal.cast.a();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = e6Var5.A0;
                    int i12 = aVar.a;
                    zf.e eVar2 = e6Var5.z0;
                    int f10 = eVar2.f(e6Var5.v.b, eVar2.i);
                    aVar.a = eVar2.i;
                    if (eVar2.q && !eVar2.e.isEmpty()) {
                        int i13 = eVar2.i + 1;
                        eVar2.i = i13;
                        if (i13 >= eVar2.e.size()) {
                            eVar2.i = 0;
                        }
                    }
                    if (f10 != -1 && e6Var5.A0.a < i12) {
                        e6Var5.P = true;
                    }
                    int[] iArr2 = e6Var5.d;
                    b6 b6Var2 = e6Var5.v;
                    int max = e6Var5.A0.a * Math.max(16, iArr2[4] / Math.max(1, e6Var5.z0.e.size()));
                    b6Var2.e = max;
                    iArr2[3] = max;
                    e6Var5.v.f = false;
                    if (e6Var5.z0.g()) {
                        AndroidUtilities.runOnUIThread(e6Var5.E0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(e6Var5.B0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(e6Var5.F0);
                        return;
                    }
                }
                if (e6Var5.d0 == null) {
                    int[] iArr3 = e6Var5.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(e6Var5.B0);
                        return;
                    }
                }
                if (e6Var5.v == null) {
                    int[] iArr4 = e6Var5.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (e6Var5.h.isEmpty()) {
                                float f11 = e6Var5.d[0];
                                float f12 = e6Var5.m0;
                                e6Var5.v = new b6(Bitmap.createBitmap((int) (f11 * f12), (int) (r0[1] * f12), Bitmap.Config.ARGB_8888));
                            } else {
                                e6Var5.v = (b6) e6Var5.h.remove(0);
                            }
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                }
                if (e6Var5.L >= 0) {
                    e6Var5.d[3] = (int) e6Var5.L;
                    long j10 = e6Var5.L;
                    synchronized (e6Var5.Q) {
                        e6Var5.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = e6Var5.u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    e6Var5.d0.g(j10, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (e6Var5.v != null) {
                    System.currentTimeMillis();
                    if (e6Var5.d0.c(e6Var5.v.b, false, e6Var5.g0, e6Var5.h0, e6Var5.k0) == 0) {
                        AndroidUtilities.runOnUIThread(e6Var5.B0);
                        return;
                    }
                    if (!e6Var5.f) {
                        e6Var5.f = e6Var5.d0.a[7] == 1;
                    }
                    int i14 = e6Var5.d[3];
                    if (i14 < e6Var5.c) {
                        e6Var5.P = true;
                    }
                    if (z10) {
                        e6Var5.c = i14;
                    }
                    b6 b6Var3 = e6Var5.v;
                    b6Var3.e = i14;
                    b6Var3.f = e6Var5.d0.a[6] == 1;
                }
                AndroidUtilities.runOnUIThread(e6Var5.F0);
                return;
            case 8:
                e6 e6Var6 = this.b;
                re.b bVar = e6Var6.s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = e6Var6.r0;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if ((bVar.isEmpty() || e6Var6.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                e6 e6Var7 = this.b;
                e6Var7.z0.b();
                AndroidUtilities.runOnUIThread(new c6(e6Var7, 1));
                return;
        }
    }
}
