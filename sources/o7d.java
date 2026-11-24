// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class o7d extends ezc {
    public final f8d Z(dd1 dd1Var, yi5 yi5Var, r5d r5dVar) {
        f8d u7dVar;
        Parcel R = R();
        jgd.c(R, dd1Var);
        jgd.d(R, yi5Var);
        jgd.d(R, r5dVar);
        Parcel T = T(R, 3);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = z7d.b;
        if (readStrongBinder == null) {
            u7dVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            u7dVar = queryLocalInterface instanceof f8d ? (f8d) queryLocalInterface : new u7d(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", (byte) 3);
        }
        T.recycle();
        return u7dVar;
    }

    public final n9d a0(bo7 bo7Var, yi5 yi5Var, yi5 yi5Var2) {
        n9d c9dVar;
        Parcel R = R();
        jgd.d(R, bo7Var);
        jgd.d(R, yi5Var);
        jgd.d(R, yi5Var2);
        Parcel T = T(R, 5);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = e9d.b;
        if (readStrongBinder == null) {
            c9dVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            c9dVar = queryLocalInterface instanceof n9d ? (n9d) queryLocalInterface : new c9d(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", (byte) 3);
        }
        T.recycle();
        return c9dVar;
    }

    public final gad b0(String str, String str2, r5d r5dVar) {
        gad t9dVar;
        Parcel R = R();
        R.writeString(str);
        R.writeString(str2);
        jgd.d(R, r5dVar);
        Parcel T = T(R, 2);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = cad.b;
        if (readStrongBinder == null) {
            t9dVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            t9dVar = queryLocalInterface instanceof gad ? (gad) queryLocalInterface : new t9d(readStrongBinder, "com.google.android.gms.cast.framework.ISession", (byte) 3);
        }
        T.recycle();
        return t9dVar;
    }

    public final xhe c0(bo7 bo7Var, r5d r5dVar, int i, int i2) {
        xhe b6eVar;
        Parcel R = R();
        jgd.d(R, bo7Var);
        jgd.d(R, r5dVar);
        R.writeInt(i);
        R.writeInt(i2);
        R.writeInt(0);
        R.writeLong(2097152L);
        R.writeInt(5);
        R.writeInt(kk7.D5);
        R.writeInt(10000);
        Parcel T = T(R, 6);
        IBinder readStrongBinder = T.readStrongBinder();
        int i3 = jce.b;
        if (readStrongBinder == null) {
            b6eVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            b6eVar = queryLocalInterface instanceof xhe ? (xhe) queryLocalInterface : new b6e(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", (byte) 3);
        }
        T.recycle();
        return b6eVar;
    }

    public final xhe d0(bo7 bo7Var, bo7 bo7Var2, r5d r5dVar, int i, int i2) {
        xhe b6eVar;
        Parcel R = R();
        jgd.d(R, bo7Var);
        jgd.d(R, bo7Var2);
        jgd.d(R, r5dVar);
        R.writeInt(i);
        R.writeInt(i2);
        R.writeInt(0);
        R.writeLong(2097152L);
        R.writeInt(5);
        R.writeInt(kk7.D5);
        R.writeInt(10000);
        Parcel T = T(R, 7);
        IBinder readStrongBinder = T.readStrongBinder();
        int i3 = jce.b;
        if (readStrongBinder == null) {
            b6eVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            b6eVar = queryLocalInterface instanceof xhe ? (xhe) queryLocalInterface : new b6e(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", (byte) 3);
        }
        T.recycle();
        return b6eVar;
    }
}
