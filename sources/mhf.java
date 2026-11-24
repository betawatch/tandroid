// default package

import android.os.Parcel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mhf extends f1d {
    public final uhf Z(eq7 eq7Var, ghf ghfVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i = xid.a;
        obtain.writeStrongBinder(eq7Var);
        obtain.writeInt(1);
        ghfVar.writeToParcel(obtain, 0);
        Parcel T = T(obtain, 3);
        uhf createFromParcel = T.readInt() == 0 ? null : uhf.CREATOR.createFromParcel(T);
        T.recycle();
        return createFromParcel;
    }
}
