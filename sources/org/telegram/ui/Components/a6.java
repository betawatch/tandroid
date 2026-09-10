package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ a6(c6 c6Var, int i10) {
        this.a = i10;
        this.b = c6Var;
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
                xf.e eVar = this.b.z0;
                return;
            case 2:
                c6 c6Var = this.b;
                c6Var.k();
                c6Var.e = null;
                if (c6Var.M >= 0 && c6Var.L == -1) {
                    c6Var.M = -1L;
                }
                c6Var.x(false);
                c6Var.t();
                return;
            case 3:
                c6 c6Var2 = this.b;
                if (c6Var2.c0 || c6Var2.w || c6Var2.C0 || c6Var2.D0 != null) {
                    return;
                }
                c6Var2.g0 = System.currentTimeMillis();
                if (hj0.T0 == null) {
                    hj0.T0 = new DispatchQueue("cache generator queue");
                }
                c6Var2.C0 = true;
                c6Var2.e = null;
                xf.e.A++;
                DispatchQueue dispatchQueue = hj0.T0;
                a6 a6Var = new a6(c6Var2, 7);
                c6Var2.D0 = a6Var;
                dispatchQueue.postRunnable(a6Var);
                return;
            case 4:
                c6 c6Var3 = this.b;
                c6Var3.k();
                if (c6Var3.u0 != null && c6Var3.N) {
                    FileLoader.getInstance(c6Var3.J).removeLoadingVideo(c6Var3.u0.getDocument(), false, false);
                }
                int i10 = c6Var3.O;
                if (i10 <= 0) {
                    c6Var3.N = true;
                } else {
                    c6Var3.O = i10 - 1;
                }
                if (c6Var3.F) {
                    c6Var3.F = false;
                } else {
                    c6Var3.E = true;
                }
                c6Var3.e = null;
                if (c6Var3.M >= 0) {
                    c6Var3.r = c6Var3.v;
                    c6Var3.s = null;
                } else if (c6Var3.b) {
                    z5 z5Var = c6Var3.r;
                    if (z5Var == null && c6Var3.s == null) {
                        c6Var3.r = c6Var3.v;
                    } else if (z5Var == null) {
                        c6Var3.r = c6Var3.s;
                        c6Var3.s = c6Var3.v;
                    } else {
                        c6Var3.s = c6Var3.v;
                    }
                } else {
                    c6Var3.r = c6Var3.v;
                }
                c6Var3.v = null;
                if (c6Var3.P) {
                    c6Var3.P = false;
                    c6Var3.y0++;
                    c6Var3.j();
                }
                if (c6Var3.d[3] < c6Var3.c) {
                    float f7 = c6Var3.g0;
                    c6Var3.c = f7 > 0.0f ? (int) (f7 * 1000.0f) : 0;
                }
                if (c6Var3.M >= 0 && c6Var3.L == -1) {
                    c6Var3.M = -1L;
                }
                c6Var3.c = c6Var3.d[3];
                int size = c6Var3.s0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((View) c6Var3.s0.get(i11)).invalidate();
                }
                if ((!c6Var3.b0 && c6Var3.y) || (c6Var3.n == null && c6Var3.r != null)) {
                    c6Var3.t();
                }
                c6Var3.x(false);
                return;
            case 5:
                c6 c6Var4 = this.b;
                if (c6Var4.c0) {
                    AndroidUtilities.runOnUIThread(c6Var4.F0);
                    return;
                }
                if (!c6Var4.x && c6Var4.d0 == null) {
                    c6Var4.d0 = AnimatedFileNative.a(c6Var4.G.getAbsolutePath(), c6Var4.d, c6Var4.J, c6Var4.H, c6Var4.u0, false);
                    c6Var4.e0 = c6Var4.d0 == null && (!c6Var4.n0 || c6Var4.G0 > 15);
                    if (c6Var4.d0 != null) {
                        int[] iArr = c6Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            c6Var4.d0.f();
                            c6Var4.d0 = null;
                        }
                    }
                    c6Var4.d();
                    c6Var4.E();
                    if (c6Var4.n0 && c6Var4.d0 == null) {
                        int i12 = c6Var4.G0;
                        c6Var4.G0 = i12 + 1;
                        if (i12 <= 15) {
                            z11 = false;
                            c6Var4.x = z11;
                            AndroidUtilities.runOnUIThread(new a6(c6Var4, 0));
                        }
                    }
                    z11 = true;
                    c6Var4.x = z11;
                    AndroidUtilities.runOnUIThread(new a6(c6Var4, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (c6Var4.z0 != null) {
                    if (c6Var4.v == null) {
                        if (c6Var4.h.isEmpty()) {
                            c6Var4.v = new z5(Bitmap.createBitmap(c6Var4.j0, c6Var4.i0, Bitmap.Config.ARGB_8888));
                        } else {
                            c6Var4.v = (z5) c6Var4.h.remove(0);
                        }
                    }
                    if (c6Var4.A0 == null) {
                        c6Var4.A0 = new com.google.android.gms.internal.cast.a();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = c6Var4.A0;
                    int i13 = aVar.a;
                    xf.e eVar2 = c6Var4.z0;
                    int f10 = eVar2.f(c6Var4.v.b, eVar2.i);
                    aVar.a = eVar2.i;
                    if (eVar2.q && !eVar2.e.isEmpty()) {
                        int i14 = eVar2.i + 1;
                        eVar2.i = i14;
                        if (i14 >= eVar2.e.size()) {
                            eVar2.i = 0;
                        }
                    }
                    if (f10 != -1 && c6Var4.A0.a < i13) {
                        c6Var4.P = true;
                    }
                    int[] iArr2 = c6Var4.d;
                    z5 z5Var2 = c6Var4.v;
                    int max = c6Var4.A0.a * Math.max(16, iArr2[4] / Math.max(1, c6Var4.z0.e.size()));
                    z5Var2.e = max;
                    iArr2[3] = max;
                    c6Var4.v.f = false;
                    if (c6Var4.z0.g()) {
                        AndroidUtilities.runOnUIThread(c6Var4.E0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(c6Var4.B0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(c6Var4.F0);
                        return;
                    }
                }
                if (c6Var4.d0 == null) {
                    int[] iArr3 = c6Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(c6Var4.B0);
                        return;
                    }
                }
                if (c6Var4.v == null) {
                    int[] iArr4 = c6Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (c6Var4.h.isEmpty()) {
                                float f11 = c6Var4.d[0];
                                float f12 = c6Var4.m0;
                                c6Var4.v = new z5(Bitmap.createBitmap((int) (f11 * f12), (int) (r0[1] * f12), Bitmap.Config.ARGB_8888));
                            } else {
                                c6Var4.v = (z5) c6Var4.h.remove(0);
                            }
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                }
                if (c6Var4.L >= 0) {
                    c6Var4.d[3] = (int) c6Var4.L;
                    long j3 = c6Var4.L;
                    synchronized (c6Var4.Q) {
                        c6Var4.L = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = c6Var4.u0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    c6Var4.d0.g(j3, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c6Var4.v != null) {
                    System.currentTimeMillis();
                    if (c6Var4.d0.c(c6Var4.v.b, false, c6Var4.g0, c6Var4.h0, c6Var4.k0) == 0) {
                        AndroidUtilities.runOnUIThread(c6Var4.B0);
                        return;
                    }
                    if (!c6Var4.f) {
                        c6Var4.f = c6Var4.d0.a[7] == 1;
                    }
                    int i15 = c6Var4.d[3];
                    if (i15 < c6Var4.c) {
                        c6Var4.P = true;
                    }
                    if (z10) {
                        c6Var4.c = i15;
                    }
                    z5 z5Var3 = c6Var4.v;
                    z5Var3.e = i15;
                    z5Var3.f = c6Var4.d0.a[6] == 1;
                }
                AndroidUtilities.runOnUIThread(c6Var4.F0);
                return;
            case 6:
                c6 c6Var5 = this.b;
                ArrayList arrayList = c6Var5.s0;
                int size2 = arrayList.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    ((View) arrayList.get(i16)).invalidate();
                }
                if ((arrayList.isEmpty() || c6Var5.R) && (view = c6Var5.r0) != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                c6 c6Var6 = this.b;
                c6Var6.z0.b();
                AndroidUtilities.runOnUIThread(new a6(c6Var6, 8));
                return;
            default:
                c6 c6Var7 = this.b;
                if (c6Var7.D0 != null) {
                    xf.e.c();
                    c6Var7.D0 = null;
                }
                c6Var7.C0 = false;
                c6Var7.k();
                c6Var7.x(false);
                return;
        }
    }
}
