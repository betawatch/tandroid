package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends b7.a {
    public final n5.q U0(n5.b bVar, h6.a aVar, n5.j jVar) {
        n5.q oVar;
        Parcel M0 = M0();
        u.c(M0, bVar);
        u.d(M0, aVar);
        u.d(M0, jVar);
        Parcel O0 = O0(M0, 3);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i9 = n5.p.b;
        if (readStrongBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            oVar = queryLocalInterface instanceof n5.q ? (n5.q) queryLocalInterface : new n5.o(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", 2);
        }
        O0.recycle();
        return oVar;
    }

    public final n5.u V0(h6.b bVar, h6.a aVar, h6.a aVar2) {
        n5.u sVar;
        Parcel M0 = M0();
        u.d(M0, bVar);
        u.d(M0, aVar);
        u.d(M0, aVar2);
        Parcel O0 = O0(M0, 5);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i9 = n5.t.b;
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            sVar = queryLocalInterface instanceof n5.u ? (n5.u) queryLocalInterface : new n5.s(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 2);
        }
        O0.recycle();
        return sVar;
    }

    public final n5.x W0(String str, String str2, n5.j jVar) {
        n5.x vVar;
        Parcel M0 = M0();
        M0.writeString(str);
        M0.writeString(str2);
        u.d(M0, jVar);
        Parcel O0 = O0(M0, 2);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i9 = n5.w.b;
        if (readStrongBinder == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            vVar = queryLocalInterface instanceof n5.x ? (n5.x) queryLocalInterface : new n5.v(readStrongBinder, "com.google.android.gms.cast.framework.ISession", 2);
        }
        O0.recycle();
        return vVar;
    }

    public final p5.e X0(h6.b bVar, n5.j jVar, int i9, int i10) {
        p5.e cVar;
        Parcel M0 = M0();
        u.d(M0, bVar);
        u.d(M0, jVar);
        M0.writeInt(i9);
        M0.writeInt(i10);
        M0.writeInt(0);
        M0.writeLong(2097152L);
        M0.writeInt(5);
        M0.writeInt(333);
        M0.writeInt(10000);
        Parcel O0 = O0(M0, 6);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i11 = p5.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof p5.e ? (p5.e) queryLocalInterface : new p5.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 2);
        }
        O0.recycle();
        return cVar;
    }

    public final p5.e Y0(h6.b bVar, h6.b bVar2, n5.j jVar, int i9, int i10) {
        p5.e cVar;
        Parcel M0 = M0();
        u.d(M0, bVar);
        u.d(M0, bVar2);
        u.d(M0, jVar);
        M0.writeInt(i9);
        M0.writeInt(i10);
        M0.writeInt(0);
        M0.writeLong(2097152L);
        M0.writeInt(5);
        M0.writeInt(333);
        M0.writeInt(10000);
        Parcel O0 = O0(M0, 7);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i11 = p5.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof p5.e ? (p5.e) queryLocalInterface : new p5.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 2);
        }
        O0.recycle();
        return cVar;
    }
}
