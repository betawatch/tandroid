package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g extends a {
    public final p5.q U0(p5.b bVar, j6.a aVar, p5.j jVar) {
        p5.q oVar;
        Parcel M0 = M0();
        u.c(M0, bVar);
        u.d(M0, aVar);
        u.d(M0, jVar);
        Parcel O0 = O0(M0, 3);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i10 = p5.p.b;
        if (readStrongBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            oVar = queryLocalInterface instanceof p5.q ? (p5.q) queryLocalInterface : new p5.o(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", 0);
        }
        O0.recycle();
        return oVar;
    }

    public final p5.u V0(j6.b bVar, j6.a aVar, j6.a aVar2) {
        p5.u sVar;
        Parcel M0 = M0();
        u.d(M0, bVar);
        u.d(M0, aVar);
        u.d(M0, aVar2);
        Parcel O0 = O0(M0, 5);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i10 = p5.t.b;
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            sVar = queryLocalInterface instanceof p5.u ? (p5.u) queryLocalInterface : new p5.s(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 0);
        }
        O0.recycle();
        return sVar;
    }

    public final p5.x W0(String str, String str2, p5.j jVar) {
        p5.x vVar;
        Parcel M0 = M0();
        M0.writeString(str);
        M0.writeString(str2);
        u.d(M0, jVar);
        Parcel O0 = O0(M0, 2);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i10 = p5.w.b;
        if (readStrongBinder == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            vVar = queryLocalInterface instanceof p5.x ? (p5.x) queryLocalInterface : new p5.v(readStrongBinder, "com.google.android.gms.cast.framework.ISession", 0);
        }
        O0.recycle();
        return vVar;
    }

    public final r5.e X0(j6.b bVar, p5.j jVar, int i10, int i11) {
        r5.e cVar;
        Parcel M0 = M0();
        u.d(M0, bVar);
        u.d(M0, jVar);
        M0.writeInt(i10);
        M0.writeInt(i11);
        M0.writeInt(0);
        M0.writeLong(2097152L);
        M0.writeInt(5);
        M0.writeInt(333);
        M0.writeInt(10000);
        Parcel O0 = O0(M0, 6);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i12 = r5.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof r5.e ? (r5.e) queryLocalInterface : new r5.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 0);
        }
        O0.recycle();
        return cVar;
    }

    public final r5.e Y0(j6.b bVar, j6.b bVar2, p5.j jVar, int i10, int i11) {
        r5.e cVar;
        Parcel M0 = M0();
        u.d(M0, bVar);
        u.d(M0, bVar2);
        u.d(M0, jVar);
        M0.writeInt(i10);
        M0.writeInt(i11);
        M0.writeInt(0);
        M0.writeLong(2097152L);
        M0.writeInt(5);
        M0.writeInt(333);
        M0.writeInt(10000);
        Parcel O0 = O0(M0, 7);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i12 = r5.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof r5.e ? (r5.e) queryLocalInterface : new r5.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 0);
        }
        O0.recycle();
        return cVar;
    }
}
