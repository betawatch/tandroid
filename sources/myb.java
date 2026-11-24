// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class myb extends b4 {
    public static final Parcelable.Creator<myb> CREATOR = new t4d((byte) 25);
    public int a;
    public String b;
    public String c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 1, 4);
        parcel.writeInt(i2);
        jte.l(parcel, 2, this.b);
        jte.l(parcel, 3, this.c);
        jte.s(parcel, r);
    }
}
