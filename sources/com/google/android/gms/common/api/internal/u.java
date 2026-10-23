package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import m4.s1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.oj0;
import org.telegram.ui.rt0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class u implements t81 {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public u(PhotoViewer photoViewer) {
        this.d = photoViewer;
    }

    public d1 a() {
        n6.l.a("execute parameter required", ((r) this.c) != null);
        return new d1(this, (k6.c[]) this.d, this.b, this.a);
    }

    public m4.n1 b(Object obj) {
        m4.n1 n1Var;
        synchronized (this.c) {
            try {
                int e = e();
                n1Var = new m4.n1(e, obj);
                if (this.b) {
                    n1Var.p();
                } else {
                    ((a0.f) this.d).put(Integer.valueOf(e), n1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n1Var;
    }

    public void c(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = u81.f0;
        if (i10 == 2) {
            Drawable[] drawableArr = PhotoViewer.U8;
            photoViewer.v0();
            boolean z10 = true;
            if (photoViewer.c2 == 1) {
                photoViewer.t0();
                photoViewer.V7 = -1L;
            }
            rt0 rt0Var = photoViewer.f0;
            if (rt0Var == null || !rt0Var.x) {
                j81 j81Var = photoViewer.F2;
                if (j81Var == null || !j81Var.y()) {
                    z10 = false;
                }
            } else {
                z10 = rt0Var.G;
            }
            this.b = z10;
            if (z10) {
                photoViewer.H2 = false;
                photoViewer.j2();
                photoViewer.e0.invalidate();
            }
        }
    }

    public void d(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        oj0 oj0Var = (oj0) this.c;
        if (oj0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(oj0Var);
            ((oj0) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.v0();
        int i11 = photoViewer.c2;
        if (i11 == 1 && photoViewer.z2 != null) {
            Object obj = u81.f0;
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
            photoViewer.l2();
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
        j81 j81Var = photoViewer.F2;
        if (j81Var == null) {
            return;
        }
        if (j81Var.y()) {
            photoViewer.H2 = false;
            photoViewer.F2.B();
            photoViewer.e0.invalidate();
        }
        j(2);
        h(f7);
        photoViewer.q3.h(1.0f, false);
        photoViewer.S7.setProgress(f7);
        photoViewer.D3();
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
            ((m4.n1) obj).p();
        }
    }

    public void h(float f7) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.i8 * f7);
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            if (((oj0) this.c) == null) {
                oj0 oj0Var = new oj0(this, 16);
                this.c = oj0Var;
                AndroidUtilities.runOnUIThread(oj0Var, 100L);
                return;
            }
            return;
        }
        photoViewer.v2(this.a);
        if (photoViewer.c2 == 1) {
            long j10 = this.a;
            photoViewer.X7 = j10;
            if (photoViewer.W7 != j10) {
                photoViewer.W7 = -1L;
            }
        }
        this.c = null;
    }

    public void i(int i10, s1 s1Var) {
        synchronized (this.c) {
            try {
                m4.n1 n1Var = (m4.n1) ((a0.f) this.d).remove(Integer.valueOf(i10));
                if (n1Var != null) {
                    if (n1Var.r.getClass() == s1.class) {
                        n1Var.m(s1Var);
                    } else {
                        e2.a.l("SequencedFutureManager", "Type mismatch, expected " + n1Var.r.getClass() + ", but was " + s1.class);
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
