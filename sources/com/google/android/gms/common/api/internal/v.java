package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gl0;
import org.telegram.ui.ut0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class v implements s71, v4.g {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public v() {
        this.c = new v4.j();
        this.d = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ((ArrayDeque) this.d).addFirst(new v4.d(this, 0));
        }
        this.a = 0;
    }

    @Override // n3.e
    public Object b() {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        v4.j jVar = (v4.j) this.c;
        h5.a.i(!this.b);
        if (this.a != 2 || arrayDeque.isEmpty()) {
            return null;
        }
        v4.k kVar = (v4.k) arrayDeque.removeFirst();
        if (jVar.d(4)) {
            kVar.a(4);
        } else {
            long j10 = jVar.f;
            ByteBuffer byteBuffer = jVar.d;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(array, 0, array.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
            obtain.recycle();
            ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            kVar.k(jVar.f, new f2.c(j10, h5.a.s(v4.b.W, parcelableArrayList), 9), 0L);
        }
        jVar.b();
        this.a = 0;
        return kVar;
    }

    @Override // n3.e
    public Object c() {
        h5.a.i(!this.b);
        if (this.a != 0) {
            return null;
        }
        this.a = 1;
        return (v4.j) this.c;
    }

    @Override // n3.e
    public void d(Object obj) {
        v4.j jVar = (v4.j) obj;
        h5.a.i(!this.b);
        h5.a.i(this.a == 1);
        h5.a.f(((v4.j) this.c) == jVar);
        this.a = 2;
    }

    public f1 e() {
        b6.m.a("execute parameter required", ((s) this.c) != null);
        return new f1(this, (y5.c[]) this.d, this.b, this.a);
    }

    public void f(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = t71.c0;
        if (i10 == 2) {
            Drawable[] drawableArr = PhotoViewer.Q8;
            photoViewer.u0();
            boolean z4 = true;
            if (photoViewer.Z1 == 1) {
                photoViewer.s0();
                photoViewer.R7 = -1L;
            }
            ut0 ut0Var = photoViewer.c0;
            if (ut0Var == null || !ut0Var.x) {
                i71 i71Var = photoViewer.C2;
                if (i71Var == null || !i71Var.y()) {
                    z4 = false;
                }
            } else {
                z4 = ut0Var.D;
            }
            this.b = z4;
            if (z4) {
                photoViewer.E2 = false;
                photoViewer.g2();
                photoViewer.b0.invalidate();
            }
        }
    }

    @Override // n3.e
    public void flush() {
        h5.a.i(!this.b);
        ((v4.j) this.c).b();
        this.a = 0;
    }

    public void g(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        gl0 gl0Var = (gl0) this.c;
        if (gl0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(gl0Var);
            ((gl0) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.Q8;
        photoViewer.u0();
        int i11 = photoViewer.Z1;
        if (i11 == 1 && photoViewer.w2 != null) {
            Object obj = t71.c0;
            if (i10 == 2) {
                photoViewer.s0();
                photoViewer.R7 = photoViewer.r8;
                if (photoViewer.S7 == this.a) {
                    PhotoViewer.V(photoViewer);
                    return;
                }
                return;
            }
        }
        if (i11 == 1 || this.b) {
            photoViewer.E2 = false;
            photoViewer.i2();
        }
    }

    public void h(float f10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        i71 i71Var = photoViewer.C2;
        if (i71Var == null) {
            return;
        }
        if (i71Var.y()) {
            photoViewer.E2 = false;
            photoViewer.C2.B();
            photoViewer.b0.invalidate();
        }
        j(2);
        i(f10);
        photoViewer.n3.h(1.0f, false);
        photoViewer.O7.setProgress(f10);
        photoViewer.B3();
    }

    public void i(float f10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.e8 * f10);
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            if (((gl0) this.c) == null) {
                gl0 gl0Var = new gl0(this, 14);
                this.c = gl0Var;
                AndroidUtilities.runOnUIThread(gl0Var, 100L);
                return;
            }
            return;
        }
        photoViewer.t2(this.a);
        if (photoViewer.Z1 == 1) {
            long j10 = this.a;
            photoViewer.T7 = j10;
            if (photoViewer.S7 != j10) {
                photoViewer.S7 = -1L;
            }
        }
        this.c = null;
    }

    public void j(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        if (photoViewer.Z1 != 1) {
            return;
        }
        if (i10 == 0) {
            float progress = photoViewer.O7.getProgress();
            photoViewer.s8 = progress;
            photoViewer.r8 = (long) (photoViewer.e8 * 1000.0f * progress);
        } else if (photoViewer.z1 != null) {
            if (photoViewer.O7.getLeftProgress() > photoViewer.s8 || photoViewer.O7.getRightProgress() < photoViewer.s8) {
                photoViewer.z1.setVideoThumbVisible(false);
                if (i10 == 1) {
                    photoViewer.r8 = (long) (photoViewer.O7.getLeftProgress() * photoViewer.e8 * 1000.0f);
                } else {
                    photoViewer.r8 = (long) (photoViewer.O7.getRightProgress() * photoViewer.e8 * 1000.0f);
                }
                photoViewer.R7 = -1L;
            }
        }
    }

    @Override // n3.e
    public void release() {
        this.b = true;
    }

    public v(PhotoViewer photoViewer) {
        this.d = photoViewer;
    }

    @Override // v4.g
    public void a(long j10) {
    }
}
