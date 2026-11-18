package c8;

import android.os.Parcel;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class bg extends a8.a {
    public final gg x1(a7.b bVar, yf yfVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i7 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        yfVar.writeToParcel(obtain, 0);
        Parcel r12 = r1(obtain, 3);
        gg createFromParcel = r12.readInt() == 0 ? null : gg.CREATOR.createFromParcel(r12);
        r12.recycle();
        return createFromParcel;
    }
}
