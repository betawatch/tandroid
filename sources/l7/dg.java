package l7;

import android.os.Parcel;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class dg extends com.google.android.gms.internal.cast.a {
    public final ig U0(j6.b bVar, ag agVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i10 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        agVar.writeToParcel(obtain, 0);
        Parcel O0 = O0(obtain, 3);
        ig createFromParcel = O0.readInt() == 0 ? null : ig.CREATOR.createFromParcel(O0);
        O0.recycle();
        return createFromParcel;
    }
}
