package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ w5(y5 y5Var, int i10) {
        this.a = i10;
        this.b = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        boolean z10;
        View view;
        switch (this.a) {
            case 0:
                this.b.i();
                return;
            case 1:
                lf.g gVar = this.b.w0;
                return;
            case 2:
                y5 y5Var = this.b;
                y5Var.k();
                y5Var.e = null;
                if (y5Var.J >= 0 && y5Var.I == -1) {
                    y5Var.J = -1L;
                }
                y5Var.x(false);
                y5Var.t();
                return;
            case 3:
                y5 y5Var2 = this.b;
                if (y5Var2.Z || y5Var2.w || y5Var2.z0 || y5Var2.A0 != null) {
                    return;
                }
                y5Var2.d0 = System.currentTimeMillis();
                if (gj0.Q0 == null) {
                    gj0.Q0 = new DispatchQueue("cache generator queue");
                }
                y5Var2.z0 = true;
                y5Var2.e = null;
                lf.g.A++;
                DispatchQueue dispatchQueue = gj0.Q0;
                w5 w5Var = new w5(y5Var2, 7);
                y5Var2.A0 = w5Var;
                dispatchQueue.postRunnable(w5Var);
                return;
            case 4:
                y5 y5Var3 = this.b;
                y5Var3.k();
                if (y5Var3.r0 != null && y5Var3.K) {
                    FileLoader.getInstance(y5Var3.G).removeLoadingVideo(y5Var3.r0.getDocument(), false, false);
                }
                int i10 = y5Var3.L;
                if (i10 <= 0) {
                    y5Var3.K = true;
                } else {
                    y5Var3.L = i10 - 1;
                }
                if (y5Var3.C) {
                    y5Var3.C = false;
                } else {
                    y5Var3.B = true;
                }
                y5Var3.e = null;
                if (y5Var3.J >= 0) {
                    y5Var3.r = y5Var3.v;
                    y5Var3.s = null;
                } else if (y5Var3.b) {
                    v5 v5Var = y5Var3.r;
                    if (v5Var == null && y5Var3.s == null) {
                        y5Var3.r = y5Var3.v;
                    } else if (v5Var == null) {
                        y5Var3.r = y5Var3.s;
                        y5Var3.s = y5Var3.v;
                    } else {
                        y5Var3.s = y5Var3.v;
                    }
                } else {
                    y5Var3.r = y5Var3.v;
                }
                y5Var3.v = null;
                if (y5Var3.M) {
                    y5Var3.M = false;
                    y5Var3.v0++;
                    y5Var3.j();
                }
                if (y5Var3.d[3] < y5Var3.c) {
                    float f10 = y5Var3.d0;
                    y5Var3.c = f10 > 0.0f ? (int) (f10 * 1000.0f) : 0;
                }
                if (y5Var3.J >= 0 && y5Var3.I == -1) {
                    y5Var3.J = -1L;
                }
                y5Var3.c = y5Var3.d[3];
                int size = y5Var3.p0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((View) y5Var3.p0.get(i11)).invalidate();
                }
                if ((!y5Var3.Y && y5Var3.y) || (y5Var3.n == null && y5Var3.r != null)) {
                    y5Var3.t();
                }
                y5Var3.x(false);
                return;
            case 5:
                y5 y5Var4 = this.b;
                if (y5Var4.Z) {
                    AndroidUtilities.runOnUIThread(y5Var4.C0);
                    return;
                }
                if (!y5Var4.x && y5Var4.a0 == null) {
                    y5Var4.a0 = AnimatedFileNative.a(y5Var4.D.getAbsolutePath(), y5Var4.d, y5Var4.G, y5Var4.E, y5Var4.r0, false);
                    y5Var4.b0 = y5Var4.a0 == null && (!y5Var4.k0 || y5Var4.D0 > 15);
                    if (y5Var4.a0 != null) {
                        int[] iArr = y5Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            y5Var4.a0.f();
                            y5Var4.a0 = null;
                        }
                    }
                    y5Var4.d();
                    y5Var4.E();
                    if (y5Var4.k0 && y5Var4.a0 == null) {
                        int i12 = y5Var4.D0;
                        y5Var4.D0 = i12 + 1;
                        if (i12 <= 15) {
                            z10 = false;
                            y5Var4.x = z10;
                            AndroidUtilities.runOnUIThread(new w5(y5Var4, 0));
                        }
                    }
                    z10 = true;
                    y5Var4.x = z10;
                    AndroidUtilities.runOnUIThread(new w5(y5Var4, 0));
                }
                try {
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                if (y5Var4.w0 != null) {
                    if (y5Var4.v == null) {
                        if (y5Var4.h.isEmpty()) {
                            y5Var4.v = new v5(Bitmap.createBitmap(y5Var4.g0, y5Var4.f0, Bitmap.Config.ARGB_8888));
                        } else {
                            y5Var4.v = (v5) y5Var4.h.remove(0);
                        }
                    }
                    if (y5Var4.x0 == null) {
                        y5Var4.x0 = new c5.c();
                    }
                    System.currentTimeMillis();
                    c5.c cVar = y5Var4.x0;
                    int i13 = cVar.a;
                    lf.g gVar2 = y5Var4.w0;
                    int f11 = gVar2.f(y5Var4.v.b, gVar2.i);
                    cVar.a = gVar2.i;
                    if (gVar2.q && !gVar2.e.isEmpty()) {
                        int i14 = gVar2.i + 1;
                        gVar2.i = i14;
                        if (i14 >= gVar2.e.size()) {
                            gVar2.i = 0;
                        }
                    }
                    if (f11 != -1 && y5Var4.x0.a < i13) {
                        y5Var4.M = true;
                    }
                    int[] iArr2 = y5Var4.d;
                    v5 v5Var2 = y5Var4.v;
                    int max = y5Var4.x0.a * Math.max(16, iArr2[4] / Math.max(1, y5Var4.w0.e.size()));
                    v5Var2.e = max;
                    iArr2[3] = max;
                    y5Var4.v.f = false;
                    if (y5Var4.w0.g()) {
                        AndroidUtilities.runOnUIThread(y5Var4.B0);
                    }
                    if (f11 == -1) {
                        AndroidUtilities.runOnUIThread(y5Var4.y0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(y5Var4.C0);
                        return;
                    }
                }
                if (y5Var4.a0 == null) {
                    int[] iArr3 = y5Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(y5Var4.y0);
                        return;
                    }
                }
                if (y5Var4.v == null) {
                    int[] iArr4 = y5Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (y5Var4.h.isEmpty()) {
                                float f12 = y5Var4.d[0];
                                float f13 = y5Var4.j0;
                                y5Var4.v = new v5(Bitmap.createBitmap((int) (f12 * f13), (int) (r0[1] * f13), Bitmap.Config.ARGB_8888));
                            } else {
                                y5Var4.v = (v5) y5Var4.h.remove(0);
                            }
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                }
                if (y5Var4.I >= 0) {
                    y5Var4.d[3] = (int) y5Var4.I;
                    long j10 = y5Var4.I;
                    synchronized (y5Var4.N) {
                        y5Var4.I = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = y5Var4.r0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    y5Var4.a0.g(j10, true);
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (y5Var4.v != null) {
                    System.currentTimeMillis();
                    if (y5Var4.a0.c(y5Var4.v.b, false, y5Var4.d0, y5Var4.e0, y5Var4.h0) == 0) {
                        AndroidUtilities.runOnUIThread(y5Var4.y0);
                        return;
                    }
                    if (!y5Var4.f) {
                        y5Var4.f = y5Var4.a0.a[7] == 1;
                    }
                    int i15 = y5Var4.d[3];
                    if (i15 < y5Var4.c) {
                        y5Var4.M = true;
                    }
                    if (z4) {
                        y5Var4.c = i15;
                    }
                    v5 v5Var3 = y5Var4.v;
                    v5Var3.e = i15;
                    v5Var3.f = y5Var4.a0.a[6] == 1;
                }
                AndroidUtilities.runOnUIThread(y5Var4.C0);
                return;
            case 6:
                y5 y5Var5 = this.b;
                ArrayList arrayList = y5Var5.p0;
                int size2 = arrayList.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    ((View) arrayList.get(i16)).invalidate();
                }
                if ((arrayList.isEmpty() || y5Var5.O) && (view = y5Var5.o0) != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                y5 y5Var6 = this.b;
                y5Var6.w0.b();
                AndroidUtilities.runOnUIThread(new w5(y5Var6, 8));
                return;
            default:
                y5 y5Var7 = this.b;
                if (y5Var7.A0 != null) {
                    lf.g.c();
                    y5Var7.A0 = null;
                }
                y5Var7.z0 = false;
                y5Var7.k();
                y5Var7.x(false);
                return;
        }
    }
}
