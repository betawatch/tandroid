package h7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r4 extends y5.a {
    public static final Parcelable.Creator<r4> CREATOR = new s5(0);
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public r4(float f10, int i9, String str, String str2) {
        this.b = str2;
        this.c = f10;
        this.a = str;
        this.d = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = g7.p8.q(parcel, 20293);
        g7.p8.l(parcel, 2, this.b);
        g7.p8.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        g7.p8.l(parcel, 4, this.a);
        g7.p8.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        g7.p8.r(parcel, q10);
    }
}
