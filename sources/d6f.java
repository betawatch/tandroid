// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class d6f extends b4 {
    public static final Parcelable.Creator<d6f> CREATOR = new c0f((byte) 10);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public d6f(float f, int i, String str, String str2) {
        this.a = str;
        this.b = f;
        this.c = str2;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.q(parcel, 2, 4);
        parcel.writeFloat(this.b);
        jte.l(parcel, 3, this.c);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        jte.s(parcel, r);
    }
}
