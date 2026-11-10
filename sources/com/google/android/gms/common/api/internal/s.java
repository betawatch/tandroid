package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.t51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fq0;
import org.telegram.ui.hf0;
import p4.m1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class s implements c61 {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public s(PhotoViewer photoViewer) {
        this.d = photoViewer;
    }

    public w0 a() {
        q6.m.a("execute parameter required", ((p) this.c) != null);
        return new w0(this, (n6.c[]) this.d, this.b, this.a);
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
        Object obj = d61.f0;
        if (i7 == 2) {
            Drawable[] drawableArr = PhotoViewer.Y8;
            photoViewer.n0();
            boolean z9 = true;
            if (photoViewer.c2 == 1) {
                photoViewer.l0();
                photoViewer.U7 = -1L;
            }
            fq0 fq0Var = photoViewer.f0;
            if (fq0Var == null || !fq0Var.y) {
                t51 t51Var = photoViewer.F2;
                if (t51Var == null || !t51Var.d0()) {
                    z9 = false;
                }
            } else {
                z9 = fq0Var.G;
            }
            this.b = z9;
            if (z9) {
                photoViewer.G2 = false;
                photoViewer.f2();
                photoViewer.e0.invalidate();
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
        Drawable[] drawableArr = PhotoViewer.Y8;
        photoViewer.n0();
        int i10 = photoViewer.c2;
        if (i10 == 1 && photoViewer.z2 != null) {
            Object obj = d61.f0;
            if (i7 == 2) {
                photoViewer.l0();
                photoViewer.U7 = photoViewer.u8;
                if (photoViewer.V7 == this.a) {
                    PhotoViewer.N(photoViewer);
                    return;
                }
                return;
            }
        }
        if (i10 == 1 || this.b) {
            photoViewer.G2 = false;
            photoViewer.g2();
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
        t51 t51Var = photoViewer.F2;
        if (t51Var == null) {
            return;
        }
        if (t51Var.d0()) {
            photoViewer.G2 = false;
            photoViewer.F2.g0();
            photoViewer.e0.invalidate();
        }
        j(2);
        h(f10);
        photoViewer.p3.h(false, 1.0f);
        photoViewer.R7.setProgress(f10);
        photoViewer.z3();
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
        this.a = (int) (photoViewer.h8 * f10);
        if (iz.o() != 2) {
            if (((hf0) this.c) == null) {
                hf0 hf0Var = new hf0(this, 18);
                this.c = hf0Var;
                org.telegram.messenger.g0.i3(hf0Var, 100L);
                return;
            }
            return;
        }
        photoViewer.q2(this.a);
        if (photoViewer.c2 == 1) {
            long j3 = this.a;
            photoViewer.W7 = j3;
            if (photoViewer.V7 != j3) {
                photoViewer.V7 = -1L;
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
        if (photoViewer.c2 != 1) {
            return;
        }
        if (i7 == 0) {
            float progress = photoViewer.R7.getProgress();
            photoViewer.v8 = progress;
            photoViewer.u8 = (long) (photoViewer.h8 * 1000.0f * progress);
        } else if (photoViewer.C1 != null) {
            if (photoViewer.R7.getLeftProgress() > photoViewer.v8 || photoViewer.R7.getRightProgress() < photoViewer.v8) {
                photoViewer.C1.setVideoThumbVisible(false);
                if (i7 == 1) {
                    photoViewer.u8 = (long) (photoViewer.R7.getLeftProgress() * photoViewer.h8 * 1000.0f);
                } else {
                    photoViewer.u8 = (long) (photoViewer.R7.getRightProgress() * photoViewer.h8 * 1000.0f);
                }
                photoViewer.U7 = -1L;
            }
        }
    }
}
