package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bq0;
import org.telegram.ui.ef0;
import p4.m1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class t implements d61 {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public t(PhotoViewer photoViewer) {
        this.d = photoViewer;
    }

    public y0 a() {
        q6.m.a("execute parameter required", ((q) this.c) != null);
        return new y0(this, (n6.c[]) this.d, this.b, this.a);
    }

    public p4.h1 b(Object obj) {
        p4.h1 h1Var;
        synchronized (this.c) {
            try {
                int e10 = e();
                h1Var = new p4.h1(e10, obj);
                if (this.b) {
                    h1Var.p();
                } else {
                    ((a0.f) this.d).put(Integer.valueOf(e10), h1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public void c(int i7) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = e61.g0;
        if (i7 == 2) {
            Drawable[] drawableArr = PhotoViewer.Z8;
            photoViewer.n0();
            boolean z10 = true;
            if (photoViewer.d2 == 1) {
                photoViewer.l0();
                photoViewer.V7 = -1L;
            }
            bq0 bq0Var = photoViewer.g0;
            if (bq0Var == null || !bq0Var.y) {
                u51 u51Var = photoViewer.G2;
                if (u51Var == null || !u51Var.d0()) {
                    z10 = false;
                }
            } else {
                z10 = bq0Var.H;
            }
            this.b = z10;
            if (z10) {
                photoViewer.H2 = false;
                photoViewer.g2();
                photoViewer.f0.invalidate();
            }
        }
    }

    public void d(int i7) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        ef0 ef0Var = (ef0) this.c;
        if (ef0Var != null) {
            org.telegram.messenger.g0.r(ef0Var);
            ((ef0) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.Z8;
        photoViewer.n0();
        int i10 = photoViewer.d2;
        if (i10 == 1 && photoViewer.A2 != null) {
            Object obj = e61.g0;
            if (i7 == 2) {
                photoViewer.l0();
                photoViewer.V7 = photoViewer.v8;
                if (photoViewer.W7 == this.a) {
                    PhotoViewer.O(photoViewer);
                    return;
                }
                return;
            }
        }
        if (i10 == 1 || this.b) {
            photoViewer.H2 = false;
            photoViewer.h2();
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
        u51 u51Var = photoViewer.G2;
        if (u51Var == null) {
            return;
        }
        if (u51Var.d0()) {
            photoViewer.H2 = false;
            photoViewer.G2.g0();
            photoViewer.f0.invalidate();
        }
        j(2);
        h(f10);
        photoViewer.q3.h(false, 1.0f);
        photoViewer.S7.setProgress(f10);
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
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((p4.h1) obj).p();
        }
    }

    public void h(float f10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.i8 * f10);
        if (gz.o() != 2) {
            if (((ef0) this.c) == null) {
                ef0 ef0Var = new ef0(this, 18);
                this.c = ef0Var;
                org.telegram.messenger.g0.i3(ef0Var, 100L);
                return;
            }
            return;
        }
        photoViewer.r2(this.a);
        if (photoViewer.d2 == 1) {
            long j3 = this.a;
            photoViewer.X7 = j3;
            if (photoViewer.W7 != j3) {
                photoViewer.W7 = -1L;
            }
        }
        this.c = null;
    }

    public void i(int i7, m1 m1Var) {
        synchronized (this.c) {
            try {
                p4.h1 h1Var = (p4.h1) ((a0.f) this.d).remove(Integer.valueOf(i7));
                if (h1Var != null) {
                    if (h1Var.r.getClass() == m1.class) {
                        h1Var.m(m1Var);
                    } else {
                        h2.a.l("SequencedFutureManager", "Type mismatch, expected " + h1Var.r.getClass() + ", but was " + m1.class);
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
            float progress = photoViewer.S7.getProgress();
            photoViewer.w8 = progress;
            photoViewer.v8 = (long) (photoViewer.i8 * 1000.0f * progress);
        } else if (photoViewer.D1 != null) {
            if (photoViewer.S7.getLeftProgress() > photoViewer.w8 || photoViewer.S7.getRightProgress() < photoViewer.w8) {
                photoViewer.D1.setVideoThumbVisible(false);
                if (i7 == 1) {
                    photoViewer.v8 = (long) (photoViewer.S7.getLeftProgress() * photoViewer.i8 * 1000.0f);
                } else {
                    photoViewer.v8 = (long) (photoViewer.S7.getRightProgress() * photoViewer.i8 * 1000.0f);
                }
                photoViewer.V7 = -1L;
            }
        }
    }
}
