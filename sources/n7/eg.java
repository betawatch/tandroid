package n7;

import android.os.Parcel;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
