// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jvd extends f1d implements b8e {
    public final fpd Z(eq7 eq7Var, toe toeVar) {
        fpd fpdVar;
        Parcel R = R();
        int i = wid.a;
        R.writeStrongBinder(eq7Var);
        R.writeInt(1);
        toeVar.writeToParcel(R, 0);
        Parcel T = T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            fpdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            fpdVar = queryLocalInterface instanceof fpd ? (fpd) queryLocalInterface : new fpd(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", (byte) 7);
        }
        T.recycle();
        return fpdVar;
    }
}
