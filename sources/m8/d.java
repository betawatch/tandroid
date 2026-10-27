package m8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import h8.j;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d extends p6.a {
    public static final Parcelable.Creator<d> CREATOR = new j(25);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        df.r(parcel, df.q(parcel, 20293));
    }
}
