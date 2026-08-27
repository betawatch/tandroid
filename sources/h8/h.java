package h8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new h5.h(14);
    public String a;
    public String b;
    public f c;
    public g d;
    public g e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.a);
        r8.l(parcel, 3, this.b);
        r8.k(parcel, 4, this.c, i10);
        r8.k(parcel, 5, this.d, i10);
        r8.k(parcel, 6, this.e, i10);
        r8.r(parcel, q6);
    }
}
