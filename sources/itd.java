// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class itd extends ezc {
    public final hbd Z() {
        hbd hbdVar;
        Parcel Q = Q(R(), 4);
        IBinder readStrongBinder = Q.readStrongBinder();
        if (readStrongBinder == null) {
            hbdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            hbdVar = queryLocalInterface instanceof hbd ? (hbd) queryLocalInterface : new hbd(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", (byte) 6);
        }
        Q.recycle();
        return hbdVar;
    }

    public final kwe a0(bo7 bo7Var) {
        kwe kweVar;
        Parcel R = R();
        sgd.c(R, bo7Var);
        R.writeInt(0);
        Parcel Q = Q(R, 3);
        IBinder readStrongBinder = Q.readStrongBinder();
        if (readStrongBinder == null) {
            kweVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            kweVar = queryLocalInterface instanceof kwe ? (kwe) queryLocalInterface : new kwe(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", (byte) 6);
        }
        Q.recycle();
        return kweVar;
    }

    public final phe b0() {
        phe x5eVar;
        Parcel Q = Q(R(), 5);
        IBinder readStrongBinder = Q.readStrongBinder();
        int i = cce.b;
        if (readStrongBinder == null) {
            x5eVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            x5eVar = queryLocalInterface instanceof phe ? (phe) queryLocalInterface : new x5e(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", (byte) 6);
        }
        Q.recycle();
        return x5eVar;
    }
}
