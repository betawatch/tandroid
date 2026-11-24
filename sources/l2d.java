// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class l2d extends b4 {
    public static final Parcelable.Creator<l2d> CREATOR = new hx6((byte) 25);
    public final String a;

    public l2d(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
