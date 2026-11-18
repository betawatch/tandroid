package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new c(21);
    public final int a;
    public final k b;

    public x(int i7, k kVar) {
        this.a = i7;
        this.b = kVar;
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
