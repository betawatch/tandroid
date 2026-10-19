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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                zf.e eVar = this.b.z0;
                return;
            case 2:
                e6 e6Var = this.b;
                e6Var.k();
                e6Var.e = null;
                if (e6Var.M >= 0 && e6Var.L == -1) {
                    e6Var.M = -1L;
                }
                e6Var.x(false);
                e6Var.t();
                return;
            case 3:
                e6 e6Var2 = this.b;
                if (e6Var2.c0 || e6Var2.w || e6Var2.C0 || e6Var2.D0 != null) {
                    return;
                }
                e6Var2.g0 = System.currentTimeMillis();
                if (uj0.T0 == null) {
                    uj0.T0 = new DispatchQueue("cache generator queue");
                }
                e6Var2.C0 = true;
                e6Var2.e = null;
                zf.e.A++;
                DispatchQueue dispatchQueue = uj0.T0;
                c6 c6Var = new c6(e6Var2, 7);
                e6Var2.D0 = c6Var;
                dispatchQueue.postRunnable(c6Var);
                return;
            case 4:
                e6 e6Var3 = this.b;
                e6Var3.k();
                if (e6Var3.u0 != null && e6Var3.N) {
                    FileLoader.getInstance(e6Var3.J).removeLoadingVideo(e6Var3.u0.getDocument(), false, false);
                }
                int i10 = e6Var3.O;
                if (i10 <= 0) {
                    e6Var3.N = true;
                } else {
                    e6Var3.O = i10 - 1;
                }
                if (e6Var3.F) {
                    e6Var3.F = false;
                } else {
                    e6Var3.E = true;
                }
                e6Var3.e = null;
                if (e6Var3.M >= 0) {
                    e6Var3.r = e6Var3.v;
                    e6Var3.s = null;
                } else if (e6Var3.b) {
                    b6 b6Var = e6Var3.r;
                    if (b6Var == null && e6Var3.s == null) {
                        e6Var3.r = e6Var3.v;
                    } else if (b6Var == null) {
                        e6Var3.r = e6Var3.s;
                        e6Var3.s = e6Var3.v;
                    } else {
                        e6Var3.s = e6Var3.v;
                    }
                } else {
                    e6Var3.r = e6Var3.v;
                }
                e6Var3.v = null;
                if (e6Var3.P) {
                    e6Var3.P = false;
                    e6Var3.y0++;
                    e6Var3.j();
                }
                if (e6Var3.d[3] < e6Var3.c) {
                    float f7 = e6Var3.g0;
                    e6Var3.c = f7 > 0.0f ? (int) (f7 * 1000.0f) : 0;
                }
                if (e6Var3.M >= 0 && e6Var3.L == -1) {
                    e6Var3.M = -1L;
                }
                e6Var3.c = e6Var3.d[3];
                Iterator it = e6Var3.s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!e6Var3.b0 && e6Var3.y) || (e6Var3.n == null && e6Var3.r != null)) {
                    e6Var3.t();
                }
                e6Var3.x(false);
                return;
            case 5:
                e6 e6Var4 = this.b;
                if (e6Var4.c0) {
                    AndroidUtilities.runOnUIThread(e6Var4.F0);
                    return;
                }
                if (!e6Var4.x && e6Var4.d0 == null) {
                    e6Var4.d0 = AnimatedFileNative.a(e6Var4.G.getAbsolutePath(), e6Var4.d, e6Var4.J, e6Var4.H, e6Var4.u0, false);
                    e6Var4.e0 = e6Var4.d0 == null && (!e6Var4.n0 || e6Var4.G0 > 15);
                    if (e6Var4.d0 != null) {
                        int[] iArr = e6Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            e6Var4.d0.f();
                            e6Var4.d0 = null;
                        }
                    }
                    e6Var4.d();
                    e6Var4.E();
                    if (e6Var4.n0 && e6Var4.d0 == null) {
                        int i11 = e6Var4.G0;
                        e6Var4.G0 = i11 + 1;
                        if (i11 <= 15) {
                            z11 = false;
                            e6Var4.x = z11;
                            AndroidUtilities.runOnUIThread(new c6(e6Var4, 0));
                        }
                    }
                    z11 = true;
                    e6Var4.x = z11;
                    AndroidUtilities.runOnUIThread(new c6(e6Var4, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (e6Var4.z0 != null) {
                    if (e6Var4.v == null) {
                        if (e6Var4.h.isEmpty()) {
                            e6Var4.v = new b6(Bitmap.createBitmap(e6Var4.j0, e6Var4.i0, Bitmap.Config.ARGB_8888));
                        } else {
                            e6Var4.v = (b6) e6Var4.h.remove(0);
                        }
                    }
                    if (e6Var4.A0 == null) {
                        e6Var4.A0 = new com.google.android.gms.internal.cast.a();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = e6Var4.A0;
                    int i12 = aVar.a;
                    zf.e eVar2 = e6Var4.z0;
                    int f10 = eVar2.f(e6Var4.v.b, eVar2.i);
                    aVar.a = eVar2.i;
                    if (eVar2.q && !eVar2.e.isEmpty()) {
                        int i13 = eVar2.i + 1;
                        eVar2.i = i13;
                        if (i13 >= eVar2.e.size()) {
                            eVar2.i = 0;
                        }
                    }
                    if (f10 != -1 && e6Var4.A0.a < i12) {
                        e6Var4.P = true;
                    }
                    int[] iArr2 = e6Var4.d;
                    b6 b6Var2 = e6Var4.v;
                    int max = e6Var4.A0.a * Math.max(16, iArr2[4] / Math.max(1, e6Var4.z0.e.size()));
                    b6Var2.e = max;
                    iArr2[3] = max;
                    e6Var4.v.f = false;
                    if (e6Var4.z0.g()) {
                        AndroidUtilities.runOnUIThread(e6Var4.E0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(e6Var4.B0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(e6Var4.F0);
                        return;
                    }
                }
                if (e6Var4.d0 == null) {
                    int[] iArr3 = e6Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(e6Var4.B0);
                        return;
                    }
                }
                if (e6Var4.v == null) {
                    int[] iArr4 = e6Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (e6Var4.h.isEmpty()) {
                                float f11 = e6Var4.d[0];
                                float f12 = e6Var4.m0;
                                e6Var4.v = new b6(Bitmap.createBitmap((int) (f11 * f12), (int) (r0[1] * f12), Bitmap.Config.ARGB_8888));
                            } else {
                                e6Var4.v = (b6) e6Var4.h.remove(0);
                            }
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                }
                if (e6Var4.L >= 0) {
                    e6Var4.d[3] = (int) e6Var4.L;
                    long j10 = e6Var4.L;
                    synchronized (e6Var4.Q) {
                        e6Var4.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = e6Var4.u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    e6Var4.d0.g(j10, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (e6Var4.v != null) {
                    System.currentTimeMillis();
                    if (e6Var4.d0.c(e6Var4.v.b, false, e6Var4.g0, e6Var4.h0, e6Var4.k0) == 0) {
                        AndroidUtilities.runOnUIThread(e6Var4.B0);
                        return;
                    }
                    if (!e6Var4.f) {
                        e6Var4.f = e6Var4.d0.a[7] == 1;
                    }
                    int i14 = e6Var4.d[3];
                    if (i14 < e6Var4.c) {
                        e6Var4.P = true;
                    }
                    if (z10) {
                        e6Var4.c = i14;
                    }
                    b6 b6Var3 = e6Var4.v;
                    b6Var3.e = i14;
                    b6Var3.f = e6Var4.d0.a[6] == 1;
                }
                AndroidUtilities.runOnUIThread(e6Var4.F0);
                return;
            case 6:
                e6 e6Var5 = this.b;
                re.b bVar = e6Var5.s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = e6Var5.r0;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if ((bVar.isEmpty() || e6Var5.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                e6 e6Var6 = this.b;
                e6Var6.z0.b();
                AndroidUtilities.runOnUIThread(new c6(e6Var6, 8));
                return;
            default:
                e6 e6Var7 = this.b;
                if (e6Var7.D0 != null) {
                    zf.e.c();
                    e6Var7.D0 = null;
                }
                e6Var7.C0 = false;
                e6Var7.k();
                e6Var7.x(false);
                return;
        }
    }
}
