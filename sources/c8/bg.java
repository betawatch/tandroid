package c8;

import android.os.Parcel;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class bg extends a8.a {
    public final gg X0(a7.b bVar, yf yfVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i7 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        yfVar.writeToParcel(obtain, 0);
        Parcel R0 = R0(obtain, 3);
        gg createFromParcel = R0.readInt() == 0 ? null : gg.CREATOR.createFromParcel(R0);
        R0.recycle();
        return createFromParcel;
    }
}
