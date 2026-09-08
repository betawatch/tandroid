package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hu0;
import org.telegram.ui.rl0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class v implements q71 {
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

    public m4.k1 b(Object obj) {
        m4.k1 k1Var;
        synchronized (this.c) {
            try {
                int e7 = e();
                k1Var = new m4.k1(e7, obj);
                if (this.b) {
                    k1Var.o();
                } else {
                    ((a0.f) this.d).put(Integer.valueOf(e7), k1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k1Var;
    }

    public void c(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = r71.f0;
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
                g71 g71Var = photoViewer.F2;
                if (g71Var == null || !g71Var.y()) {
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
        rl0 rl0Var = (rl0) this.c;
        if (rl0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rl0Var);
            ((rl0) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.T8;
        photoViewer.u0();
        int i11 = photoViewer.c2;
        if (i11 == 1 && photoViewer.z2 != null) {
            Object obj = r71.f0;
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
        g71 g71Var = photoViewer.F2;
        if (g71Var == null) {
            return;
        }
        if (g71Var.y()) {
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
            ((m4.k1) obj).o();
        }
    }

    public void h(float f7) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.h8 * f7);
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            if (((rl0) this.c) == null) {
                rl0 rl0Var = new rl0(this, 14);
                this.c = rl0Var;
                AndroidUtilities.runOnUIThread(rl0Var, 100L);
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

    public void i(int i10, m4.p1 p1Var) {
        synchronized (this.c) {
            try {
                m4.k1 k1Var = (m4.k1) ((a0.f) this.d).remove(Integer.valueOf(i10));
                if (k1Var != null) {
                    if (k1Var.r.getClass() == m4.p1.class) {
                        k1Var.m(p1Var);
                    } else {
                        e2.a.n("SequencedFutureManager", "Type mismatch, expected " + k1Var.r.getClass() + ", but was " + m4.p1.class);
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
