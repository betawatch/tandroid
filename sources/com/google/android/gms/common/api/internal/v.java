package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.x61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.et0;
import org.telegram.ui.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v implements g71, t4.g {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public v() {
        this.c = new t4.j();
        this.d = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ((ArrayDeque) this.d).addFirst(new t4.d(this, 0));
        }
        this.a = 0;
    }

    public e1 b() {
        z5.l.a("execute parameter required", ((s) this.c) != null);
        return new e1(this, (w5.c[]) this.d, this.b, this.a);
    }

    public void c(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = h71.b0;
        if (i10 == 2) {
            Drawable[] drawableArr = PhotoViewer.P8;
            photoViewer.u0();
            boolean z10 = true;
            if (photoViewer.Y1 == 1) {
                photoViewer.s0();
                photoViewer.Q7 = -1L;
            }
            et0 et0Var = photoViewer.b0;
            if (et0Var == null || !et0Var.x) {
                x61 x61Var = photoViewer.B2;
                if (x61Var == null || !x61Var.z()) {
                    z10 = false;
                }
            } else {
                z10 = et0Var.C;
            }
            this.b = z10;
            if (z10) {
                photoViewer.D2 = false;
                photoViewer.g2();
                photoViewer.a0.invalidate();
            }
        }
    }

    public void d(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        vk0 vk0Var = (vk0) this.c;
        if (vk0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(vk0Var);
            ((vk0) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.P8;
        photoViewer.u0();
        int i11 = photoViewer.Y1;
        if (i11 == 1 && photoViewer.v2 != null) {
            Object obj = h71.b0;
            if (i10 == 2) {
                photoViewer.s0();
                photoViewer.Q7 = photoViewer.q8;
                if (photoViewer.R7 == this.a) {
                    PhotoViewer.V(photoViewer);
                    return;
                }
                return;
            }
        }
        if (i11 == 1 || this.b) {
            photoViewer.D2 = false;
            photoViewer.i2();
        }
    }

    @Override // m3.e
    public Object dequeueInputBuffer() {
        f5.a.i(!this.b);
        if (this.a != 0) {
            return null;
        }
        this.a = 1;
        return (t4.j) this.c;
    }

    @Override // m3.e
    public Object dequeueOutputBuffer() {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        t4.j jVar = (t4.j) this.c;
        f5.a.i(!this.b);
        if (this.a != 2 || arrayDeque.isEmpty()) {
            return null;
        }
        t4.k kVar = (t4.k) arrayDeque.removeFirst();
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
            kVar.a(jVar.d, new f2.c(j10, f5.a.s(t4.b.V, parcelableArrayList), 12), 0L);
        }
        jVar.clear();
        this.a = 0;
        return kVar;
    }

    public void e(float f9) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        x61 x61Var = photoViewer.B2;
        if (x61Var == null) {
            return;
        }
        if (x61Var.z()) {
            photoViewer.D2 = false;
            photoViewer.B2.C();
            photoViewer.a0.invalidate();
        }
        g(2);
        f(f9);
        photoViewer.m3.h(1.0f, false);
        photoViewer.N7.setProgress(f9);
        photoViewer.B3();
    }

    public void f(float f9) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.d8 * f9);
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            if (((vk0) this.c) == null) {
                vk0 vk0Var = new vk0(this, 15);
                this.c = vk0Var;
                AndroidUtilities.runOnUIThread(vk0Var, 100L);
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

    @Override // m3.e
    public void flush() {
        f5.a.i(!this.b);
        ((t4.j) this.c).clear();
        this.a = 0;
    }

    public void g(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        if (photoViewer.Y1 != 1) {
            return;
        }
        if (i10 == 0) {
            float progress = photoViewer.N7.getProgress();
            photoViewer.r8 = progress;
            photoViewer.q8 = (long) (photoViewer.d8 * 1000.0f * progress);
        } else if (photoViewer.y1 != null) {
            if (photoViewer.N7.getLeftProgress() > photoViewer.r8 || photoViewer.N7.getRightProgress() < photoViewer.r8) {
                photoViewer.y1.setVideoThumbVisible(false);
                if (i10 == 1) {
                    photoViewer.q8 = (long) (photoViewer.N7.getLeftProgress() * photoViewer.d8 * 1000.0f);
                } else {
                    photoViewer.q8 = (long) (photoViewer.N7.getRightProgress() * photoViewer.d8 * 1000.0f);
                }
                photoViewer.Q7 = -1L;
            }
        }
    }

    @Override // m3.e
    public String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // m3.e
    public void queueInputBuffer(Object obj) {
        t4.j jVar = (t4.j) obj;
        f5.a.i(!this.b);
        f5.a.i(this.a == 1);
        f5.a.f(((t4.j) this.c) == jVar);
        this.a = 2;
    }

    @Override // m3.e
    public void release() {
        this.b = true;
    }

    public v(PhotoViewer photoViewer) {
        this.d = photoViewer;
    }

    @Override // t4.g
    public void a(long j10) {
    }
}
