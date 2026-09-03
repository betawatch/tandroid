package n7;

import android.os.Parcel;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class eg extends a7.a {
    public final jg U0(l6.b bVar, bg bgVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i10 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        bgVar.writeToParcel(obtain, 0);
        Parcel O0 = O0(obtain, 3);
        jg createFromParcel = O0.readInt() == 0 ? null : jg.CREATOR.createFromParcel(O0);
        O0.recycle();
        return createFromParcel;
    }
}
