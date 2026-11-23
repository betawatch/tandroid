package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.bz;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dq0;
import org.telegram.ui.gf0;
import p4.n1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class t implements s61 {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public t(PhotoViewer photoViewer) {
        this.d = photoViewer;
    }

    public x0 a() {
        q6.m.a("execute parameter required", ((q) this.c) != null);
        return new x0(this, (n6.c[]) this.d, this.b, this.a);
    }

    public p4.i1 b(Object obj) {
        p4.i1 i1Var;
        synchronized (this.c) {
            try {
                int e10 = e();
                i1Var = new p4.i1(e10, obj);
                if (this.b) {
                    i1Var.p();
                } else {
                    ((a0.f) this.d).put(Integer.valueOf(e10), i1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i1Var;
    }

    public void c(int i7) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = t61.g0;
        if (i7 == 2) {
            Drawable[] drawableArr = PhotoViewer.f9;
            photoViewer.n0();
            boolean z10 = true;
            if (photoViewer.d2 == 1) {
                photoViewer.l0();
                photoViewer.b8 = -1L;
            }
            dq0 dq0Var = photoViewer.g0;
            if (dq0Var == null || !dq0Var.y) {
                h61 h61Var = photoViewer.G2;
                if (h61Var == null || !h61Var.d0()) {
                    z10 = false;
                }
            } else {
                z10 = dq0Var.H;
            }
            this.b = z10;
            if (z10) {
                photoViewer.H2 = false;
                photoViewer.h2();
                photoViewer.f0.invalidate();
            }
        }
    }

    public void d(int i7) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        gf0 gf0Var = (gf0) this.c;
        if (gf0Var != null) {
            org.telegram.messenger.g0.r(gf0Var);
            ((gf0) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.f9;
        photoViewer.n0();
        int i10 = photoViewer.d2;
        if (i10 == 1 && photoViewer.A2 != null) {
            Object obj = t61.g0;
            if (i7 == 2) {
                photoViewer.l0();
                photoViewer.b8 = photoViewer.B8;
                if (photoViewer.c8 == this.a) {
                    PhotoViewer.O(photoViewer);
                    return;
                }
                return;
            }
        }
        if (i10 == 1 || this.b) {
            photoViewer.H2 = false;
            photoViewer.i2();
        }
    }

    public int e() {
        int i7;
        synchronized (this.c) {
            i7 = this.a;
            this.a = i7 + 1;
        }
        return i7;
    }

    public void f(float f10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        h61 h61Var = photoViewer.G2;
        if (h61Var == null) {
            return;
        }
        if (h61Var.d0()) {
            photoViewer.H2 = false;
            photoViewer.G2.g0();
            photoViewer.f0.invalidate();
        }
        j(2);
        h(f10);
        photoViewer.q3.h(false, 1.0f);
        photoViewer.Y7.setProgress(f10);
        photoViewer.C3();
    }

    public void g() {
        ArrayList arrayList;
        synchronized (this.c) {
            this.b = true;
            arrayList = new ArrayList(((a0.f) this.d).values());
            ((a0.f) this.d).clear();
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((p4.i1) obj).p();
        }
    }

    public void h(float f10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.o8 * f10);
        if (bz.o() != 2) {
            if (((gf0) this.c) == null) {
                gf0 gf0Var = new gf0(this, 18);
                this.c = gf0Var;
                org.telegram.messenger.g0.h3(gf0Var, 100L);
                return;
            }
            return;
        }
        photoViewer.s2(this.a);
        if (photoViewer.d2 == 1) {
            long j3 = this.a;
            photoViewer.d8 = j3;
            if (photoViewer.c8 != j3) {
                photoViewer.c8 = -1L;
            }
        }
        this.c = null;
    }

    public void i(int i7, n1 n1Var) {
        synchronized (this.c) {
            try {
                p4.i1 i1Var = (p4.i1) ((a0.f) this.d).remove(Integer.valueOf(i7));
                if (i1Var != null) {
                    if (i1Var.r.getClass() == n1.class) {
                        i1Var.m(n1Var);
                    } else {
                        h2.a.l("SequencedFutureManager", "Type mismatch, expected " + i1Var.r.getClass() + ", but was " + n1.class);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(int i7) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        if (photoViewer.d2 != 1) {
            return;
        }
        if (i7 == 0) {
            float progress = photoViewer.Y7.getProgress();
            photoViewer.C8 = progress;
            photoViewer.B8 = (long) (photoViewer.o8 * 1000.0f * progress);
        } else if (photoViewer.D1 != null) {
            if (photoViewer.Y7.getLeftProgress() > photoViewer.C8 || photoViewer.Y7.getRightProgress() < photoViewer.C8) {
                photoViewer.D1.setVideoThumbVisible(false);
                if (i7 == 1) {
                    photoViewer.B8 = (long) (photoViewer.Y7.getLeftProgress() * photoViewer.o8 * 1000.0f);
                } else {
                    photoViewer.B8 = (long) (photoViewer.Y7.getRightProgress() * photoViewer.o8 * 1000.0f);
                }
                photoViewer.b8 = -1L;
            }
        }
    }
}
