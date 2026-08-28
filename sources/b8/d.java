package b8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new w.a(20);
    public h a;
    public String b;
    public String c;
    public i[] d;
    public f[] e;
    public String[] f;
    public a[] h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.a, i9);
        p8.l(parcel, 3, this.b);
        p8.l(parcel, 4, this.c);
        p8.o(parcel, 5, this.d, i9);
        p8.o(parcel, 6, this.e, i9);
        p8.m(parcel, 7, this.f);
        p8.o(parcel, 8, this.h, i9);
        p8.r(parcel, q10);
    }
}
