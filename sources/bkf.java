// default package

import android.os.Parcel;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
