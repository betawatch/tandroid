package j7;

import android.os.Parcel;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class dg extends b7.a {
    public final ig U0(h6.b bVar, ag agVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i9 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        agVar.writeToParcel(obtain, 0);
        Parcel O0 = O0(obtain, 3);
        ig createFromParcel = O0.readInt() == 0 ? null : ig.CREATOR.createFromParcel(O0);
        O0.recycle();
        return createFromParcel;
    }
}
