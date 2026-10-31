package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import m4.t1;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.mg0;
import org.telegram.ui.mr0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v implements e71 {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public v(PhotoViewer photoViewer) {
        this.d = photoViewer;
    }

    public f1 a() {
        n6.l.a("execute parameter required", ((s) this.c) != null);
        return new f1(this, (k6.c[]) this.d, this.b, this.a);
    }

    public m4.o1 b(Object obj) {
        m4.o1 o1Var;
        synchronized (this.c) {
            try {
                int e = e();
                o1Var = new m4.o1(e, obj);
                if (this.b) {
                    o1Var.p();
                } else {
                    ((a0.f) this.d).put(Integer.valueOf(e), o1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o1Var;
    }

    public void c(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = f71.f0;
        if (i10 == 2) {
            Drawable[] drawableArr = PhotoViewer.U8;
            photoViewer.v0();
            boolean z10 = true;
            if (photoViewer.c2 == 1) {
                photoViewer.t0();
                photoViewer.V7 = -1L;
            }
            mr0 mr0Var = photoViewer.f0;
            if (mr0Var == null || !mr0Var.y) {
                u61 u61Var = photoViewer.F2;
                if (u61Var == null || !u61Var.d0()) {
                    z10 = false;
                }
            } else {
                z10 = mr0Var.G;
            }
            this.b = z10;
            if (z10) {
                photoViewer.H2 = false;
                photoViewer.k2();
                photoViewer.e0.invalidate();
            }
        }
    }

    public void d(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        mg0 mg0Var = (mg0) this.c;
        if (mg0Var != null) {
            org.telegram.messenger.i0.r(mg0Var);
            ((mg0) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.v0();
        int i11 = photoViewer.c2;
        if (i11 == 1 && photoViewer.z2 != null) {
            Object obj = f71.f0;
            if (i10 == 2) {
                photoViewer.t0();
                photoViewer.V7 = photoViewer.v8;
                if (photoViewer.W7 == this.a) {
                    PhotoViewer.W(photoViewer);
                    return;
                }
                return;
            }
        }
        if (i11 == 1 || this.b) {
            photoViewer.H2 = false;
            photoViewer.m2();
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
        u61 u61Var = photoViewer.F2;
        if (u61Var == null) {
            return;
        }
        if (u61Var.d0()) {
            photoViewer.H2 = false;
            photoViewer.F2.g0();
            photoViewer.e0.invalidate();
        }
        j(2);
        h(f7);
        photoViewer.q3.h(false, 1.0f);
        photoViewer.S7.setProgress(f7);
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m4.o1) obj).p();
        }
    }

    public void h(float f7) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.i8 * f7);
        if (tz.o() != 2) {
            if (((mg0) this.c) == null) {
                mg0 mg0Var = new mg0(this, 18);
                this.c = mg0Var;
                org.telegram.messenger.i0.h3(mg0Var, 100L);
                return;
            }
            return;
        }
        photoViewer.w2(this.a);
        if (photoViewer.c2 == 1) {
            long j10 = this.a;
            photoViewer.X7 = j10;
            if (photoViewer.W7 != j10) {
                photoViewer.W7 = -1L;
            }
        }
        this.c = null;
    }

    public void i(int i10, t1 t1Var) {
        synchronized (this.c) {
            try {
                m4.o1 o1Var = (m4.o1) ((a0.f) this.d).remove(Integer.valueOf(i10));
                if (o1Var != null) {
                    if (o1Var.r.getClass() == t1.class) {
                        o1Var.m(t1Var);
                    } else {
                        e2.a.l("SequencedFutureManager", "Type mismatch, expected " + o1Var.r.getClass() + ", but was " + t1.class);
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
