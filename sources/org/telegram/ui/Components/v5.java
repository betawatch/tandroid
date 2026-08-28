package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5 b;

    public /* synthetic */ v5(x5 x5Var, int i9) {
        this.a = i9;
        this.b = x5Var;
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
                ff.h hVar = this.b.v0;
                return;
            case 2:
                x5 x5Var = this.b;
                x5Var.k();
                x5Var.e = null;
                if (x5Var.I >= 0 && x5Var.H == -1) {
                    x5Var.I = -1L;
                }
                x5Var.x(false);
                x5Var.t();
                return;
            case 3:
                x5 x5Var2 = this.b;
                if (x5Var2.Y || x5Var2.w || x5Var2.y0 || x5Var2.z0 != null) {
                    return;
                }
                x5Var2.c0 = System.currentTimeMillis();
                if (mi0.P0 == null) {
                    mi0.P0 = new DispatchQueue("cache generator queue");
                }
                x5Var2.y0 = true;
                x5Var2.e = null;
                ff.h.A++;
                DispatchQueue dispatchQueue = mi0.P0;
                v5 v5Var = new v5(x5Var2, 7);
                x5Var2.z0 = v5Var;
                dispatchQueue.postRunnable(v5Var);
                return;
            case 4:
                x5 x5Var3 = this.b;
                x5Var3.k();
                if (x5Var3.q0 != null && x5Var3.J) {
                    FileLoader.getInstance(x5Var3.F).removeLoadingVideo(x5Var3.q0.getDocument(), false, false);
                }
                int i9 = x5Var3.K;
                if (i9 <= 0) {
                    x5Var3.J = true;
                } else {
                    x5Var3.K = i9 - 1;
                }
                if (x5Var3.B) {
                    x5Var3.B = false;
                } else {
                    x5Var3.A = true;
                }
                x5Var3.e = null;
                if (x5Var3.I >= 0) {
                    x5Var3.r = x5Var3.v;
                    x5Var3.s = null;
                } else if (x5Var3.b) {
                    u5 u5Var = x5Var3.r;
                    if (u5Var == null && x5Var3.s == null) {
                        x5Var3.r = x5Var3.v;
                    } else if (u5Var == null) {
                        x5Var3.r = x5Var3.s;
                        x5Var3.s = x5Var3.v;
                    } else {
                        x5Var3.s = x5Var3.v;
                    }
                } else {
                    x5Var3.r = x5Var3.v;
                }
                x5Var3.v = null;
                if (x5Var3.L) {
                    x5Var3.L = false;
                    x5Var3.u0++;
                    x5Var3.j();
                }
                if (x5Var3.d[3] < x5Var3.c) {
                    float f10 = x5Var3.c0;
                    x5Var3.c = f10 > 0.0f ? (int) (f10 * 1000.0f) : 0;
                }
                if (x5Var3.I >= 0 && x5Var3.H == -1) {
                    x5Var3.I = -1L;
                }
                x5Var3.c = x5Var3.d[3];
                int size = x5Var3.o0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((View) x5Var3.o0.get(i10)).invalidate();
                }
                if ((!x5Var3.X && x5Var3.y) || (x5Var3.n == null && x5Var3.r != null)) {
                    x5Var3.t();
                }
                x5Var3.x(false);
                return;
            case 5:
                x5 x5Var4 = this.b;
                if (x5Var4.Y) {
                    AndroidUtilities.runOnUIThread(x5Var4.B0);
                    return;
                }
                if (!x5Var4.x && x5Var4.Z == null) {
                    x5Var4.Z = AnimatedFileNative.a(x5Var4.C.getAbsolutePath(), x5Var4.d, x5Var4.F, x5Var4.D, x5Var4.q0, false);
                    x5Var4.a0 = x5Var4.Z == null && (!x5Var4.j0 || x5Var4.C0 > 15);
                    if (x5Var4.Z != null) {
                        int[] iArr = x5Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            x5Var4.Z.f();
                            x5Var4.Z = null;
                        }
                    }
                    x5Var4.d();
                    x5Var4.E();
                    if (x5Var4.j0 && x5Var4.Z == null) {
                        int i11 = x5Var4.C0;
                        x5Var4.C0 = i11 + 1;
                        if (i11 <= 15) {
                            z11 = false;
                            x5Var4.x = z11;
                            AndroidUtilities.runOnUIThread(new v5(x5Var4, 0));
                        }
                    }
                    z11 = true;
                    x5Var4.x = z11;
                    AndroidUtilities.runOnUIThread(new v5(x5Var4, 0));
                }
                try {
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                if (x5Var4.v0 != null) {
                    if (x5Var4.v == null) {
                        if (x5Var4.h.isEmpty()) {
                            x5Var4.v = new u5(Bitmap.createBitmap(x5Var4.f0, x5Var4.e0, Bitmap.Config.ARGB_8888));
                        } else {
                            x5Var4.v = (u5) x5Var4.h.remove(0);
                        }
                    }
                    if (x5Var4.w0 == null) {
                        x5Var4.w0 = new com.google.android.gms.internal.cast.a();
                    }
                    System.currentTimeMillis();
                    com.google.android.gms.internal.cast.a aVar = x5Var4.w0;
                    int i12 = aVar.a;
                    ff.h hVar2 = x5Var4.v0;
                    int f11 = hVar2.f(x5Var4.v.b, hVar2.i);
                    aVar.a = hVar2.i;
                    if (hVar2.q && !hVar2.e.isEmpty()) {
                        int i13 = hVar2.i + 1;
                        hVar2.i = i13;
                        if (i13 >= hVar2.e.size()) {
                            hVar2.i = 0;
                        }
                    }
                    if (f11 != -1 && x5Var4.w0.a < i12) {
                        x5Var4.L = true;
                    }
                    int[] iArr2 = x5Var4.d;
                    u5 u5Var2 = x5Var4.v;
                    int max = x5Var4.w0.a * Math.max(16, iArr2[4] / Math.max(1, x5Var4.v0.e.size()));
                    u5Var2.e = max;
                    iArr2[3] = max;
                    x5Var4.v.f = false;
                    if (x5Var4.v0.g()) {
                        AndroidUtilities.runOnUIThread(x5Var4.A0);
                    }
                    if (f11 == -1) {
                        AndroidUtilities.runOnUIThread(x5Var4.x0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(x5Var4.B0);
                        return;
                    }
                }
                if (x5Var4.Z == null) {
                    int[] iArr3 = x5Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(x5Var4.x0);
                        return;
                    }
                }
                if (x5Var4.v == null) {
                    int[] iArr4 = x5Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (x5Var4.h.isEmpty()) {
                                float f12 = x5Var4.d[0];
                                float f13 = x5Var4.i0;
                                x5Var4.v = new u5(Bitmap.createBitmap((int) (f12 * f13), (int) (r0[1] * f13), Bitmap.Config.ARGB_8888));
                            } else {
                                x5Var4.v = (u5) x5Var4.h.remove(0);
                            }
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                }
                if (x5Var4.H >= 0) {
                    x5Var4.d[3] = (int) x5Var4.H;
                    long j10 = x5Var4.H;
                    synchronized (x5Var4.M) {
                        x5Var4.H = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = x5Var4.q0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    x5Var4.Z.g(j10, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (x5Var4.v != null) {
                    System.currentTimeMillis();
                    if (x5Var4.Z.c(x5Var4.v.b, false, x5Var4.c0, x5Var4.d0, x5Var4.g0) == 0) {
                        AndroidUtilities.runOnUIThread(x5Var4.x0);
                        return;
                    }
                    if (!x5Var4.f) {
                        x5Var4.f = x5Var4.Z.a[7] == 1;
                    }
                    int i14 = x5Var4.d[3];
                    if (i14 < x5Var4.c) {
                        x5Var4.L = true;
                    }
                    if (z10) {
                        x5Var4.c = i14;
                    }
                    u5 u5Var3 = x5Var4.v;
                    u5Var3.e = i14;
                    u5Var3.f = x5Var4.Z.a[6] == 1;
                }
                AndroidUtilities.runOnUIThread(x5Var4.B0);
                return;
            case 6:
                x5 x5Var5 = this.b;
                ArrayList arrayList = x5Var5.o0;
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    ((View) arrayList.get(i15)).invalidate();
                }
                if ((arrayList.isEmpty() || x5Var5.N) && (view = x5Var5.n0) != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                x5 x5Var6 = this.b;
                x5Var6.v0.b();
                AndroidUtilities.runOnUIThread(new v5(x5Var6, 8));
                return;
            default:
                x5 x5Var7 = this.b;
                if (x5Var7.z0 != null) {
                    ff.h.c();
                    x5Var7.z0 = null;
                }
                x5Var7.y0 = false;
                x5Var7.k();
                x5Var7.x(false);
                return;
        }
    }
}
