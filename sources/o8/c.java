package o8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new m6.e(15);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        yb.s(parcel, yb.r(parcel, 20293));
    }
}
