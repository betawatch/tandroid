// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n9d extends b4 {
    public static final Parcelable.Creator<n9d> CREATOR = new v6d(20);
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public n9d(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        mve.s(parcel, r);
    }
}
