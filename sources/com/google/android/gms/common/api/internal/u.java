package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import m4.t1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.s81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.lj0;
import org.telegram.ui.vt0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u implements c91 {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public u(PhotoViewer photoViewer) {
        this.d = photoViewer;
    }

    public d1 a() {
        o6.l.a("execute parameter required", ((r) this.c) != null);
        return new d1(this, (l6.c[]) this.d, this.b, this.a);
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
        Object obj = d91.f0;
        if (i10 == 2) {
            Drawable[] drawableArr = PhotoViewer.U8;
            photoViewer.v0();
            boolean z10 = true;
            if (photoViewer.c2 == 1) {
                photoViewer.t0();
                photoViewer.V7 = -1L;
            }
            vt0 vt0Var = photoViewer.f0;
            if (vt0Var == null || !vt0Var.x) {
                s81 s81Var = photoViewer.F2;
                if (s81Var == null || !s81Var.y()) {
                    z10 = false;
                }
            } else {
                z10 = vt0Var.G;
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
        lj0 lj0Var = (lj0) this.c;
        if (lj0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lj0Var);
            ((lj0) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        photoViewer.v0();
        int i11 = photoViewer.c2;
        if (i11 == 1 && photoViewer.z2 != null) {
            Object obj = d91.f0;
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
        s81 s81Var = photoViewer.F2;
        if (s81Var == null) {
            return;
        }
        if (s81Var.y()) {
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
            ((m4.o1) obj).p();
        }
    }

    public void h(float f7) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.i8 * f7);
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            if (((lj0) this.c) == null) {
                lj0 lj0Var = new lj0(this, 17);
                this.c = lj0Var;
                AndroidUtilities.runOnUIThread(lj0Var, 100L);
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
