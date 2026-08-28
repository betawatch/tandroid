package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gt0;
import org.telegram.ui.zk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v implements u61, r4.g {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public v() {
        this.c = new r4.j();
        this.d = new ArrayDeque();
        for (int i9 = 0; i9 < 2; i9++) {
            ((ArrayDeque) this.d).addFirst(new r4.d(this, 0));
        }
        this.a = 0;
    }

    public e1 b() {
        x5.l.a("execute parameter required", ((s) this.c) != null);
        return new e1(this, (u5.c[]) this.d, this.b, this.a);
    }

    public void c(int i9) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = v61.b0;
        if (i9 == 2) {
            Drawable[] drawableArr = PhotoViewer.P8;
            photoViewer.t0();
            boolean z10 = true;
            if (photoViewer.Y1 == 1) {
                photoViewer.r0();
                photoViewer.Q7 = -1L;
            }
            gt0 gt0Var = photoViewer.b0;
            if (gt0Var == null || !gt0Var.x) {
                k61 k61Var = photoViewer.B2;
                if (k61Var == null || !k61Var.z()) {
                    z10 = false;
                }
            } else {
                z10 = gt0Var.C;
            }
            this.b = z10;
            if (z10) {
                photoViewer.D2 = false;
                photoViewer.g2();
                photoViewer.a0.invalidate();
            }
        }
    }

    public void d(int i9) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        zk0 zk0Var = (zk0) this.c;
        if (zk0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zk0Var);
            ((zk0) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.P8;
        photoViewer.t0();
        int i10 = photoViewer.Y1;
        if (i10 == 1 && photoViewer.v2 != null) {
            Object obj = v61.b0;
            if (i9 == 2) {
                photoViewer.r0();
                photoViewer.Q7 = photoViewer.q8;
                if (photoViewer.R7 == this.a) {
                    PhotoViewer.U(photoViewer);
                    return;
                }
                return;
            }
        }
        if (i10 == 1 || this.b) {
            photoViewer.D2 = false;
            photoViewer.i2();
        }
    }

    @Override // k3.e
    public Object dequeueInputBuffer() {
        d5.a.i(!this.b);
        if (this.a != 0) {
            return null;
        }
        this.a = 1;
        return (r4.j) this.c;
    }

    @Override // k3.e
    public Object dequeueOutputBuffer() {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        r4.j jVar = (r4.j) this.c;
        d5.a.i(!this.b);
        if (this.a != 2 || arrayDeque.isEmpty()) {
            return null;
        }
        r4.k kVar = (r4.k) arrayDeque.removeFirst();
        if (jVar.isEndOfStream()) {
            kVar.addFlag(4);
        } else {
            long j10 = jVar.d;
            ByteBuffer byteBuffer = jVar.b;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(array, 0, array.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
            obtain.recycle();
            ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            kVar.a(jVar.d, new f2.d(j10, d5.a.s(r4.b.V, parcelableArrayList), 12), 0L);
        }
        jVar.clear();
        this.a = 0;
        return kVar;
    }

    public void e(float f10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        k61 k61Var = photoViewer.B2;
        if (k61Var == null) {
            return;
        }
        if (k61Var.z()) {
            photoViewer.D2 = false;
            photoViewer.B2.C();
            photoViewer.a0.invalidate();
        }
        g(2);
        f(f10);
        photoViewer.m3.h(1.0f, false);
        photoViewer.N7.setProgress(f10);
        photoViewer.B3();
    }

    public void f(float f10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.d8 * f10);
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            if (((zk0) this.c) == null) {
                zk0 zk0Var = new zk0(this, 15);
                this.c = zk0Var;
                AndroidUtilities.runOnUIThread(zk0Var, 100L);
                return;
            }
            return;
        }
        photoViewer.t2(this.a);
        if (photoViewer.Y1 == 1) {
            long j10 = this.a;
            photoViewer.S7 = j10;
            if (photoViewer.R7 != j10) {
                photoViewer.R7 = -1L;
            }
        }
        this.c = null;
    }

    @Override // k3.e
    public void flush() {
        d5.a.i(!this.b);
        ((r4.j) this.c).clear();
        this.a = 0;
    }

    public void g(int i9) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        if (photoViewer.Y1 != 1) {
            return;
        }
        if (i9 == 0) {
            float progress = photoViewer.N7.getProgress();
            photoViewer.r8 = progress;
            photoViewer.q8 = (long) (photoViewer.d8 * 1000.0f * progress);
        } else if (photoViewer.y1 != null) {
            if (photoViewer.N7.getLeftProgress() > photoViewer.r8 || photoViewer.N7.getRightProgress() < photoViewer.r8) {
                photoViewer.y1.setVideoThumbVisible(false);
                if (i9 == 1) {
                    photoViewer.q8 = (long) (photoViewer.N7.getLeftProgress() * photoViewer.d8 * 1000.0f);
                } else {
                    photoViewer.q8 = (long) (photoViewer.N7.getRightProgress() * photoViewer.d8 * 1000.0f);
                }
                photoViewer.Q7 = -1L;
            }
        }
    }

    @Override // k3.e
    public String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // k3.e
    public void queueInputBuffer(Object obj) {
        r4.j jVar = (r4.j) obj;
        d5.a.i(!this.b);
        d5.a.i(this.a == 1);
        d5.a.f(((r4.j) this.c) == jVar);
        this.a = 2;
    }

    @Override // k3.e
    public void release() {
        this.b = true;
    }

    public v(PhotoViewer photoViewer) {
        this.d = photoViewer;
    }

    @Override // r4.g
    public void a(long j10) {
    }
}
