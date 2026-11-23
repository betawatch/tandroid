package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.cz;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dq0;
import org.telegram.ui.hf0;
import p4.o1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class t implements r61 {
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

    public p4.j1 b(Object obj) {
        p4.j1 j1Var;
        synchronized (this.c) {
            try {
                int e10 = e();
                j1Var = new p4.j1(e10, obj);
                if (this.b) {
                    j1Var.p();
                } else {
                    ((a0.f) this.d).put(Integer.valueOf(e10), j1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j1Var;
    }

    public void c(int i7) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = s61.g0;
        if (i7 == 2) {
            Drawable[] drawableArr = PhotoViewer.Z8;
            photoViewer.n0();
            boolean z10 = true;
            if (photoViewer.d2 == 1) {
                photoViewer.l0();
                photoViewer.V7 = -1L;
            }
            dq0 dq0Var = photoViewer.g0;
            if (dq0Var == null || !dq0Var.y) {
                i61 i61Var = photoViewer.G2;
                if (i61Var == null || !i61Var.d0()) {
                    z10 = false;
                }
            } else {
                z10 = dq0Var.H;
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
        hf0 hf0Var = (hf0) this.c;
        if (hf0Var != null) {
            org.telegram.messenger.g0.r(hf0Var);
            ((hf0) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.Z8;
        photoViewer.n0();
        int i10 = photoViewer.d2;
        if (i10 == 1 && photoViewer.A2 != null) {
            Object obj = s61.g0;
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
        i61 i61Var = photoViewer.G2;
        if (i61Var == null) {
            return;
        }
        if (i61Var.d0()) {
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
            ((p4.j1) obj).p();
        }
    }

    public void h(float f10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.i8 * f10);
        if (cz.o() != 2) {
            if (((hf0) this.c) == null) {
                hf0 hf0Var = new hf0(this, 18);
                this.c = hf0Var;
                org.telegram.messenger.g0.h3(hf0Var, 100L);
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

    public void i(int i7, o1 o1Var) {
        synchronized (this.c) {
            try {
                p4.j1 j1Var = (p4.j1) ((a0.f) this.d).remove(Integer.valueOf(i7));
                if (j1Var != null) {
                    if (j1Var.r.getClass() == o1.class) {
                        j1Var.m(o1Var);
                    } else {
                        h2.a.l("SequencedFutureManager", "Type mismatch, expected " + j1Var.r.getClass() + ", but was " + o1.class);
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
