// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class l7d extends b4 {
    public static final Parcelable.Creator<l7d> CREATOR = new t4d(20);
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public l7d(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        jte.s(parcel, r);
    }
}
