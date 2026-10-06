package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.o81;
import org.telegram.ui.Components.p81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.du0;
import org.telegram.ui.nl0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class v implements o81 {
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
                int e7 = e();
                f1Var = new m4.f1(e7, obj);
                if (this.b) {
                    f1Var.o();
                } else {
                    ((a0.f) this.d).put(Integer.valueOf(e7), f1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f1Var;
    }

    public void c(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = p81.f0;
        if (i10 == 2) {
            Drawable[] drawableArr = PhotoViewer.U8;
            photoViewer.u0();
            boolean z10 = true;
            if (photoViewer.c2 == 1) {
                photoViewer.s0();
                photoViewer.V7 = -1L;
            }
            du0 du0Var = photoViewer.f0;
            if (du0Var == null || !du0Var.x) {
                e81 e81Var = photoViewer.F2;
                if (e81Var == null || !e81Var.y()) {
                    z10 = false;
                }
            } else {
                z10 = du0Var.G;
            }
            this.b = z10;
            if (z10) {
                photoViewer.H2 = false;
                photoViewer.h2();
                photoViewer.e0.invalidate();
            }
        }
    }

    public void d(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        nl0 nl0Var = (nl0) this.c;
        if (nl0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(nl0Var);
            ((nl0) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.u0();
        int i11 = photoViewer.c2;
        if (i11 == 1 && photoViewer.z2 != null) {
            Object obj = p81.f0;
            if (i10 == 2) {
                photoViewer.s0();
                photoViewer.V7 = photoViewer.v8;
                if (photoViewer.W7 == this.a) {
                    PhotoViewer.T(photoViewer);
                    return;
                }
                return;
            }
        }
        if (i11 == 1 || this.b) {
            photoViewer.H2 = false;
            photoViewer.j2();
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
        e81 e81Var = photoViewer.F2;
        if (e81Var == null) {
            return;
        }
        if (e81Var.y()) {
            photoViewer.H2 = false;
            photoViewer.F2.B();
            photoViewer.e0.invalidate();
        }
        j(2);
        h(f7);
        photoViewer.q3.h(1.0f, false);
        photoViewer.S7.setProgress(f7);
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
            ((m4.f1) obj).o();
        }
    }

    public void h(float f7) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.i8 * f7);
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            if (((nl0) this.c) == null) {
                nl0 nl0Var = new nl0(this, 15);
                this.c = nl0Var;
                AndroidUtilities.runOnUIThread(nl0Var, 100L);
                return;
            }
            return;
        }
        photoViewer.t2(this.a);
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
