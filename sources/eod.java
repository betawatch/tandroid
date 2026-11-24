// default package

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class eod {
    public static phe a;

    public static lj9 a(Bitmap bitmap) {
        try {
            phe pheVar = a;
            fre.i(pheVar, "IBitmapDescriptorFactory is not initialized");
            x5e x5eVar = (x5e) pheVar;
            Parcel R = x5eVar.R();
            sgd.b(R, bitmap);
            Parcel Q = x5eVar.Q(R, 6);
            yi5 T = bo7.T(Q.readStrongBinder());
            Q.recycle();
            return new lj9(T);
        } catch (RemoteException e) {
            fvc.g(e);
            return null;
        }
    }

    public static lj9 b(int i) {
        try {
            phe pheVar = a;
            fre.i(pheVar, "IBitmapDescriptorFactory is not initialized");
            x5e x5eVar = (x5e) pheVar;
            Parcel R = x5eVar.R();
            R.writeInt(i);
            Parcel Q = x5eVar.Q(R, 1);
            yi5 T = bo7.T(Q.readStrongBinder());
            Q.recycle();
            return new lj9(T);
        } catch (RemoteException e) {
            fvc.g(e);
            return null;
        }
    }
}
