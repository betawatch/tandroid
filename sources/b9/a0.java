package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class a0 extends r6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(24);
    public final int a;
    public final m0 b;

    public a0(int i7, m0 m0Var) {
        this.a = i7;
        this.b = m0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bc.k(parcel, 3, this.b, i7);
        bc.s(parcel, r10);
    }
}
