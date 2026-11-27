// default package

import android.os.Parcel;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class bkf extends v3d {
    public final jkf Z(br7 br7Var, vjf vjfVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i = nld.a;
        obtain.writeStrongBinder(br7Var);
        obtain.writeInt(1);
        vjfVar.writeToParcel(obtain, 0);
        Parcel T = T(obtain, 3);
        jkf createFromParcel = T.readInt() == 0 ? null : jkf.CREATOR.createFromParcel(T);
        T.recycle();
        return createFromParcel;
    }
}
