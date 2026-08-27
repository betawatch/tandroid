package c8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new o(1);
    public h a;
    public String b;
    public String c;
    public i[] d;
    public f[] e;
    public String[] f;
    public a[] h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.a, i10);
        r8.l(parcel, 3, this.b);
        r8.l(parcel, 4, this.c);
        r8.o(parcel, 5, this.d, i10);
        r8.o(parcel, 6, this.e, i10);
        r8.m(parcel, 7, this.f);
        r8.o(parcel, 8, this.h, i10);
        r8.r(parcel, q6);
    }
}
