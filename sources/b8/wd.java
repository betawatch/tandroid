package b8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class wd {
    public static u7.e a;

    public static gi.v5 a(Bitmap bitmap) {
        try {
            u7.e eVar = a;
            p6.m.h(eVar, "IBitmapDescriptorFactory is not initialized");
            u7.c cVar = (u7.c) eVar;
            Parcel P0 = cVar.P0();
            u7.b.b(P0, bitmap);
            Parcel O0 = cVar.O0(P0, 6);
            z6.a M0 = z6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new gi.v5(M0);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public static gi.v5 b(int i3) {
        try {
            u7.e eVar = a;
            p6.m.h(eVar, "IBitmapDescriptorFactory is not initialized");
            u7.c cVar = (u7.c) eVar;
            Parcel P0 = cVar.P0();
            P0.writeInt(i3);
            Parcel O0 = cVar.O0(P0, 1);
            z6.a M0 = z6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new gi.v5(M0);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }
}
