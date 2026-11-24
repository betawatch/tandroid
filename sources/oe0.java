// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class oe0 extends b4 {
    public static final Parcelable.Creator<oe0> CREATOR = new rpd((byte) 16);
    public se0 a;
    public String b;
    public String c;
    public te0[] d;
    public qe0[] e;
    public String[] f;
    public le0[] h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        jte.l(parcel, 3, this.b);
        jte.l(parcel, 4, this.c);
        jte.o(parcel, 5, this.d, i);
        jte.o(parcel, 6, this.e, i);
        jte.m(parcel, 7, this.f);
        jte.o(parcel, 8, this.h, i);
        jte.s(parcel, r);
    }
}
