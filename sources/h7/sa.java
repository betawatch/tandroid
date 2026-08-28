package h7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class sa extends y5.a {
    public static final Parcelable.Creator<sa> CREATOR = new s5(2);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public sa(float f10, int i9, String str, String str2) {
        this.a = str;
        this.b = f10;
        this.c = str2;
        this.d = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = g7.p8.q(parcel, 20293);
        g7.p8.l(parcel, 1, this.a);
        g7.p8.s(parcel, 2, 4);
        parcel.writeFloat(this.b);
        g7.p8.l(parcel, 3, this.c);
        g7.p8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g7.p8.r(parcel, q10);
    }
}
