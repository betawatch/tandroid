package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.v;
import w7.f0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(25);
    public final int a;
    public final k6.a b;
    public final v c;

    public h(int i10, k6.a aVar, v vVar) {
        this.a = i10;
        this.b = aVar;
        this.c = vVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        f0.k(parcel, 2, this.b, i10);
        f0.k(parcel, 3, this.c, i10);
        f0.r(parcel, q6);
    }
}
