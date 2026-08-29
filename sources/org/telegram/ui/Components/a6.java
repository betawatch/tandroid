package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                jf.g gVar = this.b.v0;
                return;
            case 2:
                c6 c6Var = this.b;
                c6Var.k();
                c6Var.e = null;
                if (c6Var.I >= 0 && c6Var.H == -1) {
                    c6Var.I = -1L;
                }
                c6Var.x(false);
                c6Var.t();
                return;
            case 3:
                c6 c6Var2 = this.b;
                if (c6Var2.Y || c6Var2.w || c6Var2.y0 || c6Var2.z0 != null) {
                    return;
                }
                c6Var2.c0 = System.currentTimeMillis();
                if (xi0.P0 == null) {
                    xi0.P0 = new DispatchQueue("cache generator queue");
                }
                c6Var2.y0 = true;
                c6Var2.e = null;
                jf.g.A++;
                DispatchQueue dispatchQueue = xi0.P0;
                a6 a6Var = new a6(c6Var2, 7);
                c6Var2.z0 = a6Var;
                dispatchQueue.postRunnable(a6Var);
                return;
            case 4:
                c6 c6Var3 = this.b;
                c6Var3.k();
                if (c6Var3.q0 != null && c6Var3.J) {
                    FileLoader.getInstance(c6Var3.F).removeLoadingVideo(c6Var3.q0.getDocument(), false, false);
                }
                int i10 = c6Var3.K;
                if (i10 <= 0) {
                    c6Var3.J = true;
                } else {
                    c6Var3.K = i10 - 1;
                }
                if (c6Var3.B) {
                    c6Var3.B = false;
                } else {
                    c6Var3.A = true;
                }
                c6Var3.e = null;
                if (c6Var3.I >= 0) {
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
                if (c6Var3.L) {
                    c6Var3.L = false;
                    c6Var3.u0++;
                    c6Var3.j();
                }
                if (c6Var3.d[3] < c6Var3.c) {
                    float f9 = c6Var3.c0;
                    c6Var3.c = f9 > 0.0f ? (int) (f9 * 1000.0f) : 0;
                }
                if (c6Var3.I >= 0 && c6Var3.H == -1) {
                    c6Var3.I = -1L;
                }
                c6Var3.c = c6Var3.d[3];
                int size = c6Var3.o0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((View) c6Var3.o0.get(i11)).invalidate();
                }
                if ((!c6Var3.X && c6Var3.y) || (c6Var3.n == null && c6Var3.r != null)) {
                    c6Var3.t();
                }
                c6Var3.x(false);
                return;
            case 5:
                c6 c6Var4 = this.b;
                if (c6Var4.Y) {
                    AndroidUtilities.runOnUIThread(c6Var4.B0);
                    return;
                }
                if (!c6Var4.x && c6Var4.Z == null) {
                    c6Var4.Z = AnimatedFileNative.a(c6Var4.C.getAbsolutePath(), c6Var4.d, c6Var4.F, c6Var4.D, c6Var4.q0, false);
                    c6Var4.a0 = c6Var4.Z == null && (!c6Var4.j0 || c6Var4.C0 > 15);
                    if (c6Var4.Z != null) {
                        int[] iArr = c6Var4.d;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            c6Var4.Z.f();
                            c6Var4.Z = null;
                        }
                    }
                    c6Var4.d();
                    c6Var4.E();
                    if (c6Var4.j0 && c6Var4.Z == null) {
                        int i12 = c6Var4.C0;
                        c6Var4.C0 = i12 + 1;
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
                if (c6Var4.v0 != null) {
                    if (c6Var4.v == null) {
                        if (c6Var4.h.isEmpty()) {
                            c6Var4.v = new z5(Bitmap.createBitmap(c6Var4.f0, c6Var4.e0, Bitmap.Config.ARGB_8888));
                        } else {
                            c6Var4.v = (z5) c6Var4.h.remove(0);
                        }
                    }
                    if (c6Var4.w0 == null) {
                        c6Var4.w0 = new a5.c();
                    }
                    System.currentTimeMillis();
                    a5.c cVar = c6Var4.w0;
                    int i13 = cVar.a;
                    jf.g gVar2 = c6Var4.v0;
                    int f10 = gVar2.f(c6Var4.v.b, gVar2.i);
                    cVar.a = gVar2.i;
                    if (gVar2.q && !gVar2.e.isEmpty()) {
                        int i14 = gVar2.i + 1;
                        gVar2.i = i14;
                        if (i14 >= gVar2.e.size()) {
                            gVar2.i = 0;
                        }
                    }
                    if (f10 != -1 && c6Var4.w0.a < i13) {
                        c6Var4.L = true;
                    }
                    int[] iArr2 = c6Var4.d;
                    z5 z5Var2 = c6Var4.v;
                    int max = c6Var4.w0.a * Math.max(16, iArr2[4] / Math.max(1, c6Var4.v0.e.size()));
                    z5Var2.e = max;
                    iArr2[3] = max;
                    c6Var4.v.f = false;
                    if (c6Var4.v0.g()) {
                        AndroidUtilities.runOnUIThread(c6Var4.A0);
                    }
                    if (f10 == -1) {
                        AndroidUtilities.runOnUIThread(c6Var4.x0);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(c6Var4.B0);
                        return;
                    }
                }
                if (c6Var4.Z == null) {
                    int[] iArr3 = c6Var4.d;
                    if (iArr3[0] != 0 && iArr3[1] != 0) {
                        AndroidUtilities.runOnUIThread(c6Var4.x0);
                        return;
                    }
                }
                if (c6Var4.v == null) {
                    int[] iArr4 = c6Var4.d;
                    if (iArr4[0] > 0 && iArr4[1] > 0) {
                        try {
                            if (c6Var4.h.isEmpty()) {
                                float f11 = c6Var4.d[0];
                                float f12 = c6Var4.i0;
                                c6Var4.v = new z5(Bitmap.createBitmap((int) (f11 * f12), (int) (r0[1] * f12), Bitmap.Config.ARGB_8888));
                            } else {
                                c6Var4.v = (z5) c6Var4.h.remove(0);
                            }
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                }
                if (c6Var4.H >= 0) {
                    c6Var4.d[3] = (int) c6Var4.H;
                    long j10 = c6Var4.H;
                    synchronized (c6Var4.M) {
                        c6Var4.H = -1L;
                    }
                    AnimatedFileDrawableStream animatedFileDrawableStream = c6Var4.q0;
                    if (animatedFileDrawableStream != null) {
                        animatedFileDrawableStream.reset();
                    }
                    c6Var4.Z.g(j10, true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c6Var4.v != null) {
                    System.currentTimeMillis();
                    if (c6Var4.Z.c(c6Var4.v.b, false, c6Var4.c0, c6Var4.d0, c6Var4.g0) == 0) {
                        AndroidUtilities.runOnUIThread(c6Var4.x0);
                        return;
                    }
                    if (!c6Var4.f) {
                        c6Var4.f = c6Var4.Z.a[7] == 1;
                    }
                    int i15 = c6Var4.d[3];
                    if (i15 < c6Var4.c) {
                        c6Var4.L = true;
                    }
                    if (z10) {
                        c6Var4.c = i15;
                    }
                    z5 z5Var3 = c6Var4.v;
                    z5Var3.e = i15;
                    z5Var3.f = c6Var4.Z.a[6] == 1;
                }
                AndroidUtilities.runOnUIThread(c6Var4.B0);
                return;
            case 6:
                c6 c6Var5 = this.b;
                ArrayList arrayList = c6Var5.o0;
                int size2 = arrayList.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    ((View) arrayList.get(i16)).invalidate();
                }
                if ((arrayList.isEmpty() || c6Var5.N) && (view = c6Var5.n0) != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                c6 c6Var6 = this.b;
                c6Var6.v0.b();
                AndroidUtilities.runOnUIThread(new a6(c6Var6, 8));
                return;
            default:
                c6 c6Var7 = this.b;
                if (c6Var7.z0 != null) {
                    jf.g.c();
                    c6Var7.z0 = null;
                }
                c6Var7.y0 = false;
                c6Var7.k();
                c6Var7.x(false);
                return;
        }
    }
}
