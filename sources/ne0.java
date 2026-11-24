// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ne0 extends b4 {
    public static final Parcelable.Creator<ne0> CREATOR = new qyd((byte) 1);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public me0 f;
    public me0 h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.l(parcel, 4, this.c);
        jte.l(parcel, 5, this.d);
        jte.l(parcel, 6, this.e);
        jte.k(parcel, 7, this.f, i);
        jte.k(parcel, 8, this.h, i);
        jte.s(parcel, r);
    }
}
