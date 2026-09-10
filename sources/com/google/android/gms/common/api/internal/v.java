package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.t71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hu0;
import org.telegram.ui.ql0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    public m4.m1 b(Object obj) {
        m4.m1 m1Var;
        synchronized (this.c) {
            try {
                int e = e();
                m1Var = new m4.m1(e, obj);
                if (this.b) {
                    m1Var.o();
                } else {
                    ((a0.f) this.d).put(Integer.valueOf(e), m1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m1Var;
    }

    public void c(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = e81.f0;
        if (i10 == 2) {
            Drawable[] drawableArr = PhotoViewer.T8;
            photoViewer.u0();
            boolean z10 = true;
            if (photoViewer.c2 == 1) {
                photoViewer.s0();
                photoViewer.U7 = -1L;
            }
            hu0 hu0Var = photoViewer.f0;
            if (hu0Var == null || !hu0Var.x) {
                t71 t71Var = photoViewer.F2;
                if (t71Var == null || !t71Var.y()) {
                    z10 = false;
                }
            } else {
                z10 = hu0Var.G;
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
        ql0 ql0Var = (ql0) this.c;
        if (ql0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ql0Var);
            ((ql0) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.T8;
        photoViewer.u0();
        int i11 = photoViewer.c2;
        if (i11 == 1 && photoViewer.z2 != null) {
            Object obj = e81.f0;
            if (i10 == 2) {
                photoViewer.s0();
                photoViewer.U7 = photoViewer.u8;
                if (photoViewer.V7 == this.a) {
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
        t71 t71Var = photoViewer.F2;
        if (t71Var == null) {
            return;
        }
        if (t71Var.y()) {
            photoViewer.H2 = false;
            photoViewer.F2.B();
            photoViewer.e0.invalidate();
        }
        j(2);
        h(f7);
        photoViewer.q3.h(1.0f, false);
        photoViewer.R7.setProgress(f7);
        photoViewer.B3();
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
            ((m4.m1) obj).o();
        }
    }

    public void h(float f7) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.h8 * f7);
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            if (((ql0) this.c) == null) {
                ql0 ql0Var = new ql0(this, 14);
                this.c = ql0Var;
                AndroidUtilities.runOnUIThread(ql0Var, 100L);
                return;
            }
            return;
        }
        photoViewer.t2(this.a);
        if (photoViewer.c2 == 1) {
            long j3 = this.a;
            photoViewer.W7 = j3;
            if (photoViewer.V7 != j3) {
                photoViewer.V7 = -1L;
            }
        }
        this.c = null;
    }

    public void i(int i10, m4.r1 r1Var) {
        synchronized (this.c) {
            try {
                m4.m1 m1Var = (m4.m1) ((a0.f) this.d).remove(Integer.valueOf(i10));
                if (m1Var != null) {
                    if (m1Var.r.getClass() == m4.r1.class) {
                        m1Var.m(r1Var);
                    } else {
                        e2.a.n("SequencedFutureManager", "Type mismatch, expected " + m1Var.r.getClass() + ", but was " + m4.r1.class);
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
            float progress = photoViewer.R7.getProgress();
            photoViewer.v8 = progress;
            photoViewer.u8 = (long) (photoViewer.h8 * 1000.0f * progress);
        } else if (photoViewer.C1 != null) {
            if (photoViewer.R7.getLeftProgress() > photoViewer.v8 || photoViewer.R7.getRightProgress() < photoViewer.v8) {
                photoViewer.C1.setVideoThumbVisible(false);
                if (i10 == 1) {
                    photoViewer.u8 = (long) (photoViewer.R7.getLeftProgress() * photoViewer.h8 * 1000.0f);
                } else {
                    photoViewer.u8 = (long) (photoViewer.R7.getRightProgress() * photoViewer.h8 * 1000.0f);
                }
                photoViewer.U7 = -1L;
            }
        }
    }
}
