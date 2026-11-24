// default package

import android.os.Parcel;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
