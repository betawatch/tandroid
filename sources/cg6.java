// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class cg6 extends b4 {
    public static final Parcelable.Creator<cg6> CREATOR = new rhe((byte) 10);
    public String a;
    public dg6 b;
    public pnb c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.k(parcel, 3, this.b, i);
        jte.k(parcel, 5, this.c, i);
        jte.s(parcel, r);
    }
}
