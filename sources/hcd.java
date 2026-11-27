// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hcd extends v3d {
    public final ycd Z(ld1 ld1Var, al5 al5Var, kad kadVar) {
        ycd ncdVar;
        Parcel R = R();
        ald.c(R, ld1Var);
        ald.d(R, al5Var);
        ald.d(R, kadVar);
        Parcel T = T(R, 3);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = scd.b;
        if (readStrongBinder == null) {
            ncdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            ncdVar = queryLocalInterface instanceof ycd ? (ycd) queryLocalInterface : new ncd(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", (byte) 3);
        }
        T.recycle();
        return ncdVar;
    }

    public final ged a0(br7 br7Var, al5 al5Var, al5 al5Var2) {
        ged vddVar;
        Parcel R = R();
        ald.d(R, br7Var);
        ald.d(R, al5Var);
        ald.d(R, al5Var2);
        Parcel T = T(R, 5);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = xdd.b;
        if (readStrongBinder == null) {
            vddVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            vddVar = queryLocalInterface instanceof ged ? (ged) queryLocalInterface : new vdd(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", (byte) 3);
        }
        T.recycle();
        return vddVar;
    }

    public final zed b0(String str, String str2, kad kadVar) {
        zed medVar;
        Parcel R = R();
        R.writeString(str);
        R.writeString(str2);
        ald.d(R, kadVar);
        Parcel T = T(R, 2);
        IBinder readStrongBinder = T.readStrongBinder();
        int i = ved.b;
        if (readStrongBinder == null) {
            medVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            medVar = queryLocalInterface instanceof zed ? (zed) queryLocalInterface : new med(readStrongBinder, "com.google.android.gms.cast.framework.ISession", (byte) 3);
        }
        T.recycle();
        return medVar;
    }

    public final ome c0(br7 br7Var, kad kadVar, int i, int i2) {
        ome raeVar;
        Parcel R = R();
        ald.d(R, br7Var);
        ald.d(R, kadVar);
        R.writeInt(i);
        R.writeInt(i2);
        R.writeInt(0);
        R.writeLong(2097152L);
        R.writeInt(5);
        R.writeInt(jn7.D5);
        R.writeInt(10000);
        Parcel T = T(R, 6);
        IBinder readStrongBinder = T.readStrongBinder();
        int i3 = zge.b;
        if (readStrongBinder == null) {
            raeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            raeVar = queryLocalInterface instanceof ome ? (ome) queryLocalInterface : new rae(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", (byte) 3);
        }
        T.recycle();
        return raeVar;
    }

    public final ome d0(br7 br7Var, br7 br7Var2, kad kadVar, int i, int i2) {
        ome raeVar;
        Parcel R = R();
        ald.d(R, br7Var);
        ald.d(R, br7Var2);
        ald.d(R, kadVar);
        R.writeInt(i);
        R.writeInt(i2);
        R.writeInt(0);
        R.writeLong(2097152L);
        R.writeInt(5);
        R.writeInt(jn7.D5);
        R.writeInt(10000);
        Parcel T = T(R, 7);
        IBinder readStrongBinder = T.readStrongBinder();
        int i3 = zge.b;
        if (readStrongBinder == null) {
            raeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            raeVar = queryLocalInterface instanceof ome ? (ome) queryLocalInterface : new rae(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", (byte) 3);
        }
        T.recycle();
        return raeVar;
    }
}
