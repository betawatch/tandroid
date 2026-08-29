package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends a6.a {
    public static final Parcelable.Creator<d> CREATOR = new d6.d(4);
    public h a;
    public String b;
    public String c;
    public i[] d;
    public f[] e;
    public String[] f;
    public a[] h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.k(parcel, 2, this.a, i10);
        o.l(parcel, 3, this.b);
        o.l(parcel, 4, this.c);
        o.o(parcel, 5, this.d, i10);
        o.o(parcel, 6, this.e, i10);
        o.m(parcel, 7, this.f);
        o.o(parcel, 8, this.h, i10);
        o.r(parcel, q6);
    }
}
