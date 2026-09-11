package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6 b;

    public /* synthetic */ b6(d6 d6Var, int i10) {
        this.a = i10;
        this.b = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        View view;
        switch (this.a) {
            case 0:
                this.b.i();
                return;
            case 1:
                yf.e eVar = this.b.z0;
                return;
            case 2:
                d6 d6Var = this.b;
                d6Var.k();
                d6Var.e = null;
                if (d6Var.M >= 0 && d6Var.L == -1) {
                    d6Var.M = -1L;
                }
                d6Var.x(false);
                d6Var.t();
                return;
            case 3:
                d6 d6Var2 = this.b;
                if (d6Var2.c0 || d6Var2.w || d6Var2.C0 || d6Var2.D0 != null) {
                    return;
                }
                d6Var2.g0 = System.currentTimeMillis();
                if (xi0.T0 == null) {
                    xi0.T0 = new DispatchQueue("cache generator queue");
                }
                d6Var2.C0 = true;
                d6Var2.e = null;
                yf.e.A++;
                DispatchQueue dispatchQueue = xi0.T0;
                b6 b6Var = new b6(d6Var2, 7);
                d6Var2.D0 = b6Var;
                dispatchQueue.postRunnable(b6Var);
                return;
            case 4:
                d6 d6Var3 = this.b;
                d6Var3.k();
                if (d6Var3.u0 != null && d6Var3.N) {
                    FileLoader.getInstance(d6Var3.J).removeLoadingVideo(d6Var3.u0.getDocument(), false, false);
                }
                int i10 = d6Var3.O;
                if (i10 <= 0) {
                    d6Var3.N = true;
                } else {
                    d6Var3.O = i10 - 1;
                }
                if (d6Var3.F) {
                    d6Var3.F = false;
                } else {
                    d6Var3.E = true;
                }
                d6Var3.e = null;
                if (d6Var3.M >= 0) {
                    d6Var3.r = d6Var3.v;
                    d6Var3.s = null;
                } else if (d6Var3.b) {
                    a6 a6Var = d6Var3.r;
                    if (a6Var == null && d6Var3.s == null) {
                        d6Var3.r = d6Var3.v;
                    } else if (a6Var == null) {
                        d6Var3.r = d6Var3.s;
                        d6Var3.s = d6Var3.v;
                    } else {
                        d6Var3.s = d6Var3.v;
                    }
                } else {
                    d6Var3.r = d6Var3.v;
                }
                d6Var3.v = null;
                if (d6Var3.P) {
                    d6Var3.P = false;
                    d6Var3.y0++;
                    d6Var3.j();
                }
                if (d6Var3.d[3] < d6Var3.c) {
                    float f7 = d6Var3.g0;
                    d6Var3.c = f7 > 0.0f ? (int) (f7 * 1000.0f) : 0;
                }
                if (d6Var3.M >= 0 && d6Var3.L == -1) {
                    d6Var3.M = -1L;
                }
                d6Var3.c = d6Var3.d[3];
                int size = d6Var3.s0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((View) d6Var3.s0.get(i11)).invalidate();
                }
                if ((!d6Var3.b0 && d6Var3.y) || (d6Var3.n == null && d6Var3.r != null)) {
                    d6Var3.t();
                }
                d6Var3.x(false);
                return;
            case 5:
                d6 d6Var4 = this.b;
                if (d6Var4.c0) {
                    AndroidUtilities.runOnUIThread(d6Var4.F0);
                    return;
                }
                if (!d6Var4.x && d6Var4.d0 == null) {
                    d6Var4.d0 = AnimatedFileNative.a(d6Var4.G.getAbsolutePath(), d6Var4.d, d6Var4.J, d6Var4.H, d6Var4.u0, false);
                    d6Var4.e0 = d6Var4.d0 == null && (!d6Var4.n0 || d6Var4.G0 > 15);
                    if (d6Var4.d0 != null) {
                        int[] iArr = d6Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            d6Var4.d0.f();
                            d6Var4.d0 = null;
                        }
                    }
                    d6Var4.d();
                    d6Var4.E();
                    if (d6Var4.n0 && d6Var4.d0 == null) {
                        int i12 = d6Var4.G0;
                        d6Var4.G0 = i12 + 1;
                        if (i12 <= 15) {
                            z11 = false;
                            d6Var4.x = z11;
                            AndroidUtilities.runOnUIThread(new b6(d6Var4, 0));
                        }
                    }
                    z11 = true;
                    d6Var4.x = z11;
                    AndroidUtilities.runOnUIThread(new b6(d6Var4, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (d6Var4.z0 != null) {
                    if (d6Var4.v == null) {
                        if (d6Var4.h.isEmpty()) {
                            d6Var4.v = new a6(Bitmap.createBitmap(d6Var4.j0, d6Var4.i0, Bitmap.Config.ARGB_8888));
                        } else {
                            d6Var4.v = (a6) d6Var4.h.remove(0);
                        }
                    }
                    if (d6Var4.A0 == null) {
                        d6Var4.A0 = new com.google.android.gms.internal.cast.a();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = d6Var4.A0;
                    int i13 = aVar.a;
                    yf.e eVar2 = d6Var4.z0;
                    int f10 = eVar2.f(d6Var4.v.b, eVar2.i);
                    aVar.a = eVar2.i;
                    if (eVar2.q && !eVar2.e.isEmpty()) {
                        int i14 = eVar2.i + 1;
                        eVar2.i = i14;
                        if (i14 >= eVar2.e.size()) {
                            eVar2.i = 0;
                        }
                    }
                    if (f10 != -1 && d6Var4.A0.a < i13) {
                        d6Var4.P = true;
                    }
                    int[] iArr2 = d6Var4.d;
                    a6 a6Var2 = d6Var4.v;
                    int max = d6Var4.A0.a * Math.max(16, iArr2[4] / Math.max(1, d6Var4.z0.e.size()));
                    a6Var2.e = max;
                    iArr2[3] = max;
                    d6Var4.v.f = false;
                    if (d6Var4.z0.g()) {
                        AndroidUtilities.runOnUIThread(d6Var4.E0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(d6Var4.B0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(d6Var4.F0);
                        return;
                    }
                }
                if (d6Var4.d0 == null) {
                    int[] iArr3 = d6Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(d6Var4.B0);
                        return;
                    }
                }
                if (d6Var4.v == null) {
                    int[] iArr4 = d6Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (d6Var4.h.isEmpty()) {
                                float f11 = d6Var4.d[0];
                                float f12 = d6Var4.m0;
                                d6Var4.v = new a6(Bitmap.createBitmap((int) (f11 * f12), (int) (r0[1] * f12), Bitmap.Config.ARGB_8888));
                            } else {
                                d6Var4.v = (a6) d6Var4.h.remove(0);
                            }
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                }
                if (d6Var4.L >= 0) {
                    d6Var4.d[3] = (int) d6Var4.L;
                    long j3 = d6Var4.L;
                    synchronized (d6Var4.Q) {
                        d6Var4.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = d6Var4.u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    d6Var4.d0.g(j3, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (d6Var4.v != null) {
                    System.currentTimeMillis();
                    if (d6Var4.d0.c(d6Var4.v.b, false, d6Var4.g0, d6Var4.h0, d6Var4.k0) == 0) {
                        AndroidUtilities.runOnUIThread(d6Var4.B0);
                        return;
                    }
                    if (!d6Var4.f) {
                        d6Var4.f = d6Var4.d0.a[7] == 1;
                    }
                    int i15 = d6Var4.d[3];
                    if (i15 < d6Var4.c) {
                        d6Var4.P = true;
                    }
                    if (z10) {
                        d6Var4.c = i15;
                    }
                    a6 a6Var3 = d6Var4.v;
                    a6Var3.e = i15;
                    a6Var3.f = d6Var4.d0.a[6] == 1;
                }
                AndroidUtilities.runOnUIThread(d6Var4.F0);
                return;
            case 6:
                d6 d6Var5 = this.b;
                ArrayList arrayList = d6Var5.s0;
                int size2 = arrayList.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    ((View) arrayList.get(i16)).invalidate();
                }
                if ((arrayList.isEmpty() || d6Var5.R) && (view = d6Var5.r0) != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                d6 d6Var6 = this.b;
                d6Var6.z0.b();
                AndroidUtilities.runOnUIThread(new b6(d6Var6, 8));
                return;
            default:
                d6 d6Var7 = this.b;
                if (d6Var7.D0 != null) {
                    yf.e.c();
                    d6Var7.D0 = null;
                }
                d6Var7.C0 = false;
                d6Var7.k();
                d6Var7.x(false);
                return;
        }
    }
}
