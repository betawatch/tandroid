package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new b9.e(23);
    public h a;
    public String b;
    public String c;
    public i[] d;
    public f[] e;
    public String[] f;
    public a[] h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.a, i10);
        g5.l(parcel, 3, this.b);
        g5.l(parcel, 4, this.c);
        g5.o(parcel, 5, this.d, i10);
        g5.o(parcel, 6, this.e, i10);
        g5.m(parcel, 7, this.f);
        g5.o(parcel, 8, this.h, i10);
        g5.r(parcel, q10);
    }
}
