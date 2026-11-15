package c8;

import android.os.Parcel;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
