// default package

import android.os.Parcel;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
