// default package

import android.os.Parcel;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class lff extends ezc {
    public final tff Z(bo7 bo7Var, fff fffVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i = wgd.a;
        obtain.writeStrongBinder(bo7Var);
        obtain.writeInt(1);
        fffVar.writeToParcel(obtain, 0);
        Parcel T = T(obtain, 3);
        tff createFromParcel = T.readInt() == 0 ? null : tff.CREATOR.createFromParcel(T);
        T.recycle();
        return createFromParcel;
    }
}
