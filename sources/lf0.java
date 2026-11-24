// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lf0 extends b4 {
    public static final Parcelable.Creator<lf0> CREATOR = new v6d(0);
    public int a;
    public String[] b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i2);
        mve.m(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
