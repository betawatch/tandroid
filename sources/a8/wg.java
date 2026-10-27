package a8;

import android.os.Parcel;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class wg extends a {
    public final bh V0(y6.b bVar, tg tgVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i10 = a0.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        tgVar.writeToParcel(obtain, 0);
        Parcel P0 = P0(obtain, 3);
        bh createFromParcel = P0.readInt() == 0 ? null : bh.CREATOR.createFromParcel(P0);
        P0.recycle();
        return createFromParcel;
    }
}
