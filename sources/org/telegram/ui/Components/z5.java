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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ z5(b6 b6Var, int i10) {
        this.a = i10;
        this.b = b6Var;
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
                b6 b6Var = this.b;
                b6Var.k();
                b6Var.e = null;
                if (b6Var.M >= 0 && b6Var.L == -1) {
                    b6Var.M = -1L;
                }
                b6Var.x(false);
                b6Var.t();
                return;
            case 3:
                b6 b6Var2 = this.b;
                if (b6Var2.c0 || b6Var2.w || b6Var2.C0 || b6Var2.D0 != null) {
                    return;
                }
                b6Var2.g0 = System.currentTimeMillis();
                if (xi0.T0 == null) {
                    xi0.T0 = new DispatchQueue("cache generator queue");
                }
                b6Var2.C0 = true;
                b6Var2.e = null;
                yf.e.A++;
                DispatchQueue dispatchQueue = xi0.T0;
                z5 z5Var = new z5(b6Var2, 7);
                b6Var2.D0 = z5Var;
                dispatchQueue.postRunnable(z5Var);
                return;
            case 4:
                b6 b6Var3 = this.b;
                b6Var3.k();
                if (b6Var3.u0 != null && b6Var3.N) {
                    FileLoader.getInstance(b6Var3.J).removeLoadingVideo(b6Var3.u0.getDocument(), false, false);
                }
                int i10 = b6Var3.O;
                if (i10 <= 0) {
                    b6Var3.N = true;
                } else {
                    b6Var3.O = i10 - 1;
                }
                if (b6Var3.F) {
                    b6Var3.F = false;
                } else {
                    b6Var3.E = true;
                }
                b6Var3.e = null;
                if (b6Var3.M >= 0) {
                    b6Var3.r = b6Var3.v;
                    b6Var3.s = null;
                } else if (b6Var3.b) {
                    y5 y5Var = b6Var3.r;
                    if (y5Var == null && b6Var3.s == null) {
                        b6Var3.r = b6Var3.v;
                    } else if (y5Var == null) {
                        b6Var3.r = b6Var3.s;
                        b6Var3.s = b6Var3.v;
                    } else {
                        b6Var3.s = b6Var3.v;
                    }
                } else {
                    b6Var3.r = b6Var3.v;
                }
                b6Var3.v = null;
                if (b6Var3.P) {
                    b6Var3.P = false;
                    b6Var3.y0++;
                    b6Var3.j();
                }
                if (b6Var3.d[3] < b6Var3.c) {
                    float f7 = b6Var3.g0;
                    b6Var3.c = f7 > 0.0f ? (int) (f7 * 1000.0f) : 0;
                }
                if (b6Var3.M >= 0 && b6Var3.L == -1) {
                    b6Var3.M = -1L;
                }
                b6Var3.c = b6Var3.d[3];
                Iterator it = b6Var3.s0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                if ((!b6Var3.b0 && b6Var3.y) || (b6Var3.n == null && b6Var3.r != null)) {
                    b6Var3.t();
                }
                b6Var3.x(false);
                return;
            case 5:
                b6 b6Var4 = this.b;
                if (b6Var4.c0) {
                    AndroidUtilities.runOnUIThread(b6Var4.F0);
                    return;
                }
                if (!b6Var4.x && b6Var4.d0 == null) {
                    b6Var4.d0 = AnimatedFileNative.a(b6Var4.G.getAbsolutePath(), b6Var4.d, b6Var4.J, b6Var4.H, b6Var4.u0, false);
                    b6Var4.e0 = b6Var4.d0 == null && (!b6Var4.n0 || b6Var4.G0 > 15);
                    if (b6Var4.d0 != null) {
                        int[] iArr = b6Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            b6Var4.d0.f();
                            b6Var4.d0 = null;
                        }
                    }
                    b6Var4.d();
                    b6Var4.E();
                    if (b6Var4.n0 && b6Var4.d0 == null) {
                        int i11 = b6Var4.G0;
                        b6Var4.G0 = i11 + 1;
                        if (i11 <= 15) {
                            z11 = false;
                            b6Var4.x = z11;
                            AndroidUtilities.runOnUIThread(new z5(b6Var4, 0));
                        }
                    }
                    z11 = true;
                    b6Var4.x = z11;
                    AndroidUtilities.runOnUIThread(new z5(b6Var4, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (b6Var4.z0 != null) {
                    if (b6Var4.v == null) {
                        if (b6Var4.h.isEmpty()) {
                            b6Var4.v = new y5(Bitmap.createBitmap(b6Var4.j0, b6Var4.i0, Bitmap.Config.ARGB_8888));
                        } else {
                            b6Var4.v = (y5) b6Var4.h.remove(0);
                        }
                    }
                    if (b6Var4.A0 == null) {
                        b6Var4.A0 = new com.google.android.gms.internal.cast.a();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = b6Var4.A0;
                    int i12 = aVar.a;
                    yf.e eVar2 = b6Var4.z0;
                    int f10 = eVar2.f(b6Var4.v.b, eVar2.i);
                    aVar.a = eVar2.i;
                    if (eVar2.q && !eVar2.e.isEmpty()) {
                        int i13 = eVar2.i + 1;
                        eVar2.i = i13;
                        if (i13 >= eVar2.e.size()) {
                            eVar2.i = 0;
                        }
                    }
                    if (f10 != -1 && b6Var4.A0.a < i12) {
                        b6Var4.P = true;
                    }
                    int[] iArr2 = b6Var4.d;
                    y5 y5Var2 = b6Var4.v;
                    int max = b6Var4.A0.a * Math.max(16, iArr2[4] / Math.max(1, b6Var4.z0.e.size()));
                    y5Var2.e = max;
                    iArr2[3] = max;
                    b6Var4.v.f = false;
                    if (b6Var4.z0.g()) {
                        AndroidUtilities.runOnUIThread(b6Var4.E0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(b6Var4.B0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(b6Var4.F0);
                        return;
                    }
                }
                if (b6Var4.d0 == null) {
                    int[] iArr3 = b6Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(b6Var4.B0);
                        return;
                    }
                }
                if (b6Var4.v == null) {
                    int[] iArr4 = b6Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (b6Var4.h.isEmpty()) {
                                float f11 = b6Var4.d[0];
                                float f12 = b6Var4.m0;
                                b6Var4.v = new y5(Bitmap.createBitmap((int) (f11 * f12), (int) (r0[1] * f12), Bitmap.Config.ARGB_8888));
                            } else {
                                b6Var4.v = (y5) b6Var4.h.remove(0);
                            }
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                }
                if (b6Var4.L >= 0) {
                    b6Var4.d[3] = (int) b6Var4.L;
                    long j3 = b6Var4.L;
                    synchronized (b6Var4.Q) {
                        b6Var4.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = b6Var4.u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    b6Var4.d0.g(j3, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b6Var4.v != null) {
                    System.currentTimeMillis();
                    if (b6Var4.d0.c(b6Var4.v.b, false, b6Var4.g0, b6Var4.h0, b6Var4.k0) == 0) {
                        AndroidUtilities.runOnUIThread(b6Var4.B0);
                        return;
                    }
                    if (!b6Var4.f) {
                        b6Var4.f = b6Var4.d0.a[7] == 1;
                    }
                    int i14 = b6Var4.d[3];
                    if (i14 < b6Var4.c) {
                        b6Var4.P = true;
                    }
                    if (z10) {
                        b6Var4.c = i14;
                    }
                    y5 y5Var3 = b6Var4.v;
                    y5Var3.e = i14;
                    y5Var3.f = b6Var4.d0.a[6] == 1;
                }
                AndroidUtilities.runOnUIThread(b6Var4.F0);
                return;
            case 6:
                b6 b6Var5 = this.b;
                pe.b bVar = b6Var5.s0;
                Iterator it2 = bVar.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
                WeakReference weakReference = b6Var5.r0;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if ((bVar.isEmpty() || b6Var5.R) && view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                b6 b6Var6 = this.b;
                b6Var6.z0.b();
                AndroidUtilities.runOnUIThread(new z5(b6Var6, 8));
                return;
            default:
                b6 b6Var7 = this.b;
                if (b6Var7.D0 != null) {
                    yf.e.c();
                    b6Var7.D0 = null;
                }
                b6Var7.C0 = false;
                b6Var7.k();
                b6Var7.x(false);
                return;
        }
    }
}
