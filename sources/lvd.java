// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lvd extends f1d {
    public final jdd Z() {
        jdd jddVar;
        Parcel Q = Q(R(), 4);
        IBinder readStrongBinder = Q.readStrongBinder();
        if (readStrongBinder == null) {
            jddVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            jddVar = queryLocalInterface instanceof jdd ? (jdd) queryLocalInterface : new jdd(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", (byte) 6);
        }
        Q.recycle();
        return jddVar;
    }

    public final mye a0(eq7 eq7Var) {
        mye myeVar;
        Parcel R = R();
        tid.c(R, eq7Var);
        R.writeInt(0);
        Parcel Q = Q(R, 3);
        IBinder readStrongBinder = Q.readStrongBinder();
        if (readStrongBinder == null) {
            myeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            myeVar = queryLocalInterface instanceof mye ? (mye) queryLocalInterface : new mye(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", (byte) 6);
        }
        Q.recycle();
        return myeVar;
    }

    public final qje b0() {
        qje a8eVar;
        Parcel Q = Q(R(), 5);
        IBinder readStrongBinder = Q.readStrongBinder();
        int i = dee.b;
        if (readStrongBinder == null) {
            a8eVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            a8eVar = queryLocalInterface instanceof qje ? (qje) queryLocalInterface : new a8e(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", (byte) 6);
        }
        Q.recycle();
        return a8eVar;
    }
}
