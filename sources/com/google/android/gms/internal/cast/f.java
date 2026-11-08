package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class f extends a8.a {
    public final i6.e A1(a7.b bVar, g6.j jVar, int i7, int i10) {
        i6.e cVar;
        Parcel p12 = p1();
        t.d(p12, bVar);
        t.d(p12, jVar);
        p12.writeInt(i7);
        p12.writeInt(i10);
        p12.writeInt(0);
        p12.writeLong(2097152L);
        p12.writeInt(5);
        p12.writeInt(qs.E5);
        p12.writeInt(10000);
        Parcel r12 = r1(p12, 6);
        IBinder readStrongBinder = r12.readStrongBinder();
        int i11 = i6.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof i6.e ? (i6.e) queryLocalInterface : new i6.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 2);
        }
        r12.recycle();
        return cVar;
    }

    public final i6.e B1(a7.b bVar, a7.b bVar2, g6.j jVar, int i7, int i10) {
        i6.e cVar;
        Parcel p12 = p1();
        t.d(p12, bVar);
        t.d(p12, bVar2);
        t.d(p12, jVar);
        p12.writeInt(i7);
        p12.writeInt(i10);
        p12.writeInt(0);
        p12.writeLong(2097152L);
        p12.writeInt(5);
        p12.writeInt(qs.E5);
        p12.writeInt(10000);
        Parcel r12 = r1(p12, 7);
        IBinder readStrongBinder = r12.readStrongBinder();
        int i11 = i6.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof i6.e ? (i6.e) queryLocalInterface : new i6.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 2);
        }
        r12.recycle();
        return cVar;
    }

    public final g6.q x1(g6.b bVar, a7.a aVar, g6.j jVar) {
        g6.q oVar;
        Parcel p12 = p1();
        t.c(p12, bVar);
        t.d(p12, aVar);
        t.d(p12, jVar);
        Parcel r12 = r1(p12, 3);
        IBinder readStrongBinder = r12.readStrongBinder();
        int i7 = g6.p.b;
        if (readStrongBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            oVar = queryLocalInterface instanceof g6.q ? (g6.q) queryLocalInterface : new g6.o(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", 2);
        }
        r12.recycle();
        return oVar;
    }

    public final g6.u y1(a7.b bVar, a7.a aVar, a7.a aVar2) {
        g6.u sVar;
        Parcel p12 = p1();
        t.d(p12, bVar);
        t.d(p12, aVar);
        t.d(p12, aVar2);
        Parcel r12 = r1(p12, 5);
        IBinder readStrongBinder = r12.readStrongBinder();
        int i7 = g6.t.b;
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            sVar = queryLocalInterface instanceof g6.u ? (g6.u) queryLocalInterface : new g6.s(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 2);
        }
        r12.recycle();
        return sVar;
    }

    public final g6.x z1(String str, String str2, g6.j jVar) {
        g6.x vVar;
        Parcel p12 = p1();
        p12.writeString(str);
        p12.writeString(str2);
        t.d(p12, jVar);
        Parcel r12 = r1(p12, 2);
        IBinder readStrongBinder = r12.readStrongBinder();
        int i7 = g6.w.b;
        if (readStrongBinder == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            vVar = queryLocalInterface instanceof g6.x ? (g6.x) queryLocalInterface : new g6.v(readStrongBinder, "com.google.android.gms.cast.framework.ISession", 2);
        }
        r12.recycle();
        return vVar;
    }
}
