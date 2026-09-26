package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.s71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
import org.telegram.ui.il0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class v implements d81 {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public v(PhotoViewer photoViewer) {
        this.d = photoViewer;
    }

    public e1 a() {
        n6.l.a("execute parameter required", ((s) this.c) != null);
        return new e1(this, (k6.c[]) this.d, this.b, this.a);
    }

    public m4.f1 b(Object obj) {
        m4.f1 f1Var;
        synchronized (this.c) {
            try {
                int e = e();
                f1Var = new m4.f1(e, obj);
                if (this.b) {
                    f1Var.o();
                } else {
                    ((a0.f) this.d).put(Integer.valueOf(e), f1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f1Var;
    }

    public void c(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = e81.f0;
        if (i10 == 2) {
            Drawable[] drawableArr = PhotoViewer.U8;
            photoViewer.u0();
            boolean z10 = true;
            if (photoViewer.c2 == 1) {
                photoViewer.s0();
                photoViewer.V7 = -1L;
            }
            au0 au0Var = photoViewer.f0;
            if (au0Var == null || !au0Var.x) {
                s71 s71Var = photoViewer.F2;
                if (s71Var == null || !s71Var.y()) {
                    z10 = false;
                }
            } else {
                z10 = au0Var.G;
            }
            this.b = z10;
            if (z10) {
                photoViewer.H2 = false;
                photoViewer.g2();
                photoViewer.e0.invalidate();
            }
        }
    }

    public void d(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        il0 il0Var = (il0) this.c;
        if (il0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(il0Var);
            ((il0) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.u0();
        int i11 = photoViewer.c2;
        if (i11 == 1 && photoViewer.z2 != null) {
            Object obj = e81.f0;
            if (i10 == 2) {
                photoViewer.s0();
                photoViewer.V7 = photoViewer.v8;
                if (photoViewer.W7 == this.a) {
                    PhotoViewer.V(photoViewer);
                    return;
                }
                return;
            }
        }
        if (i11 == 1 || this.b) {
            photoViewer.H2 = false;
            photoViewer.i2();
        }
    }

    public int e() {
        int i10;
        synchronized (this.c) {
            i10 = this.a;
            this.a = i10 + 1;
        }
        return i10;
    }

    public void f(float f7) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        s71 s71Var = photoViewer.F2;
        if (s71Var == null) {
            return;
        }
        if (s71Var.y()) {
            photoViewer.H2 = false;
            photoViewer.F2.B();
            photoViewer.e0.invalidate();
        }
        j(2);
        h(f7);
        photoViewer.q3.h(1.0f, false);
        photoViewer.S7.setProgress(f7);
        photoViewer.A3();
    }

    public void g() {
        ArrayList arrayList;
        synchronized (this.c) {
            this.b = true;
            arrayList = new ArrayList(((a0.f) this.d).values());
            ((a0.f) this.d).clear();
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m4.f1) obj).o();
        }
    }

    public void h(float f7) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.i8 * f7);
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            if (((il0) this.c) == null) {
                il0 il0Var = new il0(this, 14);
                this.c = il0Var;
                AndroidUtilities.runOnUIThread(il0Var, 100L);
                return;
            }
            return;
        }
        photoViewer.s2(this.a);
        if (photoViewer.c2 == 1) {
            long j3 = this.a;
            photoViewer.X7 = j3;
            if (photoViewer.W7 != j3) {
                photoViewer.W7 = -1L;
            }
        }
        this.c = null;
    }

    public void i(int i10, m4.k1 k1Var) {
        synchronized (this.c) {
            try {
                m4.f1 f1Var = (m4.f1) ((a0.f) this.d).remove(Integer.valueOf(i10));
                if (f1Var != null) {
                    if (f1Var.r.getClass() == m4.k1.class) {
                        f1Var.m(k1Var);
                    } else {
                        e2.a.n("SequencedFutureManager", "Type mismatch, expected " + f1Var.r.getClass() + ", but was " + m4.k1.class);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        if (photoViewer.c2 != 1) {
            return;
        }
        if (i10 == 0) {
            float progress = photoViewer.S7.getProgress();
            photoViewer.w8 = progress;
            photoViewer.v8 = (long) (photoViewer.i8 * 1000.0f * progress);
        } else if (photoViewer.C1 != null) {
            if (photoViewer.S7.getLeftProgress() > photoViewer.w8 || photoViewer.S7.getRightProgress() < photoViewer.w8) {
                photoViewer.C1.setVideoThumbVisible(false);
                if (i10 == 1) {
                    photoViewer.v8 = (long) (photoViewer.S7.getLeftProgress() * photoViewer.i8 * 1000.0f);
                } else {
                    photoViewer.v8 = (long) (photoViewer.S7.getRightProgress() * photoViewer.i8 * 1000.0f);
                }
                photoViewer.V7 = -1L;
            }
        }
    }
}
