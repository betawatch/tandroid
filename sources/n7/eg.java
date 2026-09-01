package n7;

import android.os.Parcel;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
