package c8;

import android.os.Parcel;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
