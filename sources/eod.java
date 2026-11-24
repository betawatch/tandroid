// default package

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
