package o8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new m6.e(16);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        bc.s(parcel, bc.r(parcel, 20293));
    }
}
