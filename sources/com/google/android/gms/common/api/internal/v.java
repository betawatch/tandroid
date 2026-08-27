package com.google.android.gms.common.api.internal;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.x61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ht0;
import org.telegram.ui.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v implements w61, r4.h {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public v() {
        this.c = new r4.k();
        this.d = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ((ArrayDeque) this.d).addFirst(new r4.e(this, 0));
        }
        this.a = 0;
    }

    public e1 b() {
        y5.l.a("execute parameter required", ((s) this.c) != null);
        return new e1(this, (v5.c[]) this.d, this.b, this.a);
    }

    public void c(int i10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = x61.b0;
        if (i10 == 2) {
            Drawable[] drawableArr = PhotoViewer.P8;
            photoViewer.u0();
            boolean z10 = true;
            if (photoViewer.Y1 == 1) {
                photoViewer.s0();
                photoViewer.Q7 = -1L;
            }
            ht0 ht0Var = photoViewer.b0;
            if (ht0Var == null || !ht0Var.x) {
                m61 m61Var = photoViewer.B2;
                if (m61Var == null || !m61Var.z()) {
                    z10 = false;
                }
            } else {
                z10 = ht0Var.C;
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
        zk0 zk0Var = (zk0) this.c;
        if (zk0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zk0Var);
            ((zk0) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.P8;
        photoViewer.u0();
        int i11 = photoViewer.Y1;
        if (i11 == 1 && photoViewer.v2 != null) {
            Object obj = x61.b0;
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

    @Override // k3.e
    public Object dequeueInputBuffer() {
        d5.a.i(!this.b);
        if (this.a != 0) {
            return null;
        }
        this.a = 1;
        return (r4.k) this.c;
    }

    @Override // k3.e
    public Object dequeueOutputBuffer() {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        r4.k kVar = (r4.k) this.c;
        d5.a.i(!this.b);
        if (this.a != 2 || arrayDeque.isEmpty()) {
            return null;
        }
        r4.l lVar = (r4.l) arrayDeque.removeFirst();
        if (kVar.isEndOfStream()) {
            lVar.addFlag(4);
        } else {
            long j10 = kVar.d;
            ByteBuffer byteBuffer = kVar.b;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(array, 0, array.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
            obtain.recycle();
            ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            lVar.a(kVar.d, new f2.c(j10, d5.a.s(r4.c.V, parcelableArrayList), 12), 0L);
        }
        kVar.clear();
        this.a = 0;
        return lVar;
    }

    public void e(float f10) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        m61 m61Var = photoViewer.B2;
        if (m61Var == null) {
            return;
        }
        if (m61Var.z()) {
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
        ((r4.k) this.c).clear();
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

    @Override // k3.e
    public String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // k3.e
    public void queueInputBuffer(Object obj) {
        r4.k kVar = (r4.k) obj;
        d5.a.i(!this.b);
        d5.a.i(this.a == 1);
        d5.a.f(((r4.k) this.c) == kVar);
        this.a = 2;
    }

    @Override // k3.e
    public void release() {
        this.b = true;
    }

    public v(PhotoViewer photoViewer) {
        this.d = photoViewer;
    }

    @Override // r4.h
    public void a(long j10) {
    }
}
