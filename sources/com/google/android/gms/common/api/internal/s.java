package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import o4.m1;
import o4.r1;
import org.telegram.messenger.az;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.sg0;
import org.telegram.ui.tp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s implements v51 {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public s(PhotoViewer photoViewer) {
        this.d = photoViewer;
    }

    public x0 a() {
        p6.m.a("execute parameter required", ((p) this.c) != null);
        return new x0(this, (m6.c[]) this.d, this.b, this.a);
    }

    public m1 b(Object obj) {
        m1 m1Var;
        synchronized (this.c) {
            try {
                int e10 = e();
                m1Var = new m1(e10, obj);
                if (this.b) {
                    m1Var.p();
                } else {
                    ((a0.f) this.d).put(Integer.valueOf(e10), m1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m1Var;
    }

    public void c(int i3) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = w51.g0;
        if (i3 == 2) {
            Drawable[] drawableArr = PhotoViewer.V8;
            photoViewer.v0();
            boolean z10 = true;
            if (photoViewer.d2 == 1) {
                photoViewer.t0();
                photoViewer.W7 = -1L;
            }
            tp0 tp0Var = photoViewer.g0;
            if (tp0Var == null || !tp0Var.y) {
                m51 m51Var = photoViewer.G2;
                if (m51Var == null || !m51Var.d0()) {
                    z10 = false;
                }
            } else {
                z10 = tp0Var.H;
            }
            this.b = z10;
            if (z10) {
                photoViewer.I2 = false;
                photoViewer.k2();
                photoViewer.f0.invalidate();
            }
        }
    }

    public void d(int i3) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        sg0 sg0Var = (sg0) this.c;
        if (sg0Var != null) {
            org.telegram.messenger.g0.r(sg0Var);
            ((sg0) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.V8;
        photoViewer.v0();
        int i10 = photoViewer.d2;
        if (i10 == 1 && photoViewer.A2 != null) {
            Object obj = w51.g0;
            if (i3 == 2) {
                photoViewer.t0();
                photoViewer.W7 = photoViewer.w8;
                if (photoViewer.X7 == this.a) {
                    PhotoViewer.V(photoViewer);
                    return;
                }
                return;
            }
        }
        if (i10 == 1 || this.b) {
            photoViewer.I2 = false;
            photoViewer.m2();
        }
    }

    public int e() {
        int i3;
        synchronized (this.c) {
            i3 = this.a;
            this.a = i3 + 1;
        }
        return i3;
    }

    public void f(float f10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        m51 m51Var = photoViewer.G2;
        if (m51Var == null) {
            return;
        }
        if (m51Var.d0()) {
            photoViewer.I2 = false;
            photoViewer.G2.g0();
            photoViewer.f0.invalidate();
        }
        j(2);
        h(f10);
        photoViewer.r3.h(false, 1.0f);
        photoViewer.T7.setProgress(f10);
        photoViewer.E3();
    }

    public void g() {
        ArrayList arrayList;
        synchronized (this.c) {
            this.b = true;
            arrayList = new ArrayList(((a0.f) this.d).values());
            ((a0.f) this.d).clear();
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((m1) obj).p();
        }
    }

    public void h(float f10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.j8 * f10);
        if (az.o() != 2) {
            if (((sg0) this.c) == null) {
                sg0 sg0Var = new sg0(this, 17);
                this.c = sg0Var;
                org.telegram.messenger.g0.i3(sg0Var, 100L);
                return;
            }
            return;
        }
        photoViewer.w2(this.a);
        if (photoViewer.d2 == 1) {
            long j10 = this.a;
            photoViewer.Y7 = j10;
            if (photoViewer.X7 != j10) {
                photoViewer.X7 = -1L;
            }
        }
        this.c = null;
    }

    public void i(int i3, r1 r1Var) {
        synchronized (this.c) {
            try {
                m1 m1Var = (m1) ((a0.f) this.d).remove(Integer.valueOf(i3));
                if (m1Var != null) {
                    if (m1Var.r.getClass() == r1.class) {
                        m1Var.m(r1Var);
                    } else {
                        g2.a.l("SequencedFutureManager", "Type mismatch, expected " + m1Var.r.getClass() + ", but was " + r1.class);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(int i3) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        if (photoViewer.d2 != 1) {
            return;
        }
        if (i3 == 0) {
            float progress = photoViewer.T7.getProgress();
            photoViewer.x8 = progress;
            photoViewer.w8 = (long) (photoViewer.j8 * 1000.0f * progress);
        } else if (photoViewer.D1 != null) {
            if (photoViewer.T7.getLeftProgress() > photoViewer.x8 || photoViewer.T7.getRightProgress() < photoViewer.x8) {
                photoViewer.D1.setVideoThumbVisible(false);
                if (i3 == 1) {
                    photoViewer.w8 = (long) (photoViewer.T7.getLeftProgress() * photoViewer.j8 * 1000.0f);
                } else {
                    photoViewer.w8 = (long) (photoViewer.T7.getRightProgress() * photoViewer.j8 * 1000.0f);
                }
                photoViewer.W7 = -1L;
            }
        }
    }
}
