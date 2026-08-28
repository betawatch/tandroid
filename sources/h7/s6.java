package h7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s6 extends y5.a {
    public static final Parcelable.Creator<s6> CREATOR = new s5(1);
    public final int a;
    public final float b;
    public final int c;

    public s6(int i9, int i10, float f10, int i11) {
        if (i9 != 1) {
            throw new IllegalArgumentException("Unknown language.");
        }
        this.a = i10;
        this.b = f10;
        this.c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = g7.p8.q(parcel, 20293);
        g7.p8.s(parcel, 2, 4);
        parcel.writeInt(1);
        g7.p8.s(parcel, 3, 4);
        parcel.writeInt(this.a);
        g7.p8.s(parcel, 4, 4);
        parcel.writeFloat(this.b);
        g7.p8.s(parcel, 5, 4);
        parcel.writeInt(this.c);
        g7.p8.r(parcel, q10);
    }
}
