package b8;

import android.os.Parcel;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class tg extends a {
    public final yg X0(z6.b bVar, qg qgVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i3 = a0.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        qgVar.writeToParcel(obtain, 0);
        Parcel R0 = R0(obtain, 3);
        yg createFromParcel = R0.readInt() == 0 ? null : yg.CREATOR.createFromParcel(R0);
        R0.recycle();
        return createFromParcel;
    }
}
