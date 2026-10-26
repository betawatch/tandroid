package a8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class od {
    public static t7.e a;

    public static jg.i a(Bitmap bitmap) {
        o6.l.i(bitmap, "image must not be null");
        try {
            t7.e eVar = a;
            o6.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            t7.c cVar = (t7.c) eVar;
            Parcel N0 = cVar.N0();
            t7.b.b(N0, bitmap);
            Parcel M0 = cVar.M0(N0, 6);
            y6.a K0 = y6.b.K0(M0.readStrongBinder());
            M0.recycle();
            return new jg.i(K0);
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }

    public static jg.i b(int i10) {
        try {
            t7.e eVar = a;
            o6.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            t7.c cVar = (t7.c) eVar;
            Parcel N0 = cVar.N0();
            N0.writeInt(i10);
            Parcel M0 = cVar.M0(N0, 1);
            y6.a K0 = y6.b.K0(M0.readStrongBinder());
            M0.recycle();
            return new jg.i(K0);
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }
}
