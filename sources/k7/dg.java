package k7;

import android.os.Parcel;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class dg extends c7.a {
    public final ig U0(i6.b bVar, ag agVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i10 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        agVar.writeToParcel(obtain, 0);
        Parcel O0 = O0(obtain, 3);
        ig createFromParcel = O0.readInt() == 0 ? null : ig.CREATOR.createFromParcel(O0);
        O0.recycle();
        return createFromParcel;
    }
}
