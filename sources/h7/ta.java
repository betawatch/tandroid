package h7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ta extends y5.a {
    public static final Parcelable.Creator<ta> CREATOR = new s5(3);
    public final float a;
    public final int b;

    public ta(float f10, int i9) {
        this.a = f10;
        this.b = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = g7.p8.q(parcel, 20293);
        g7.p8.s(parcel, 1, 4);
        parcel.writeFloat(this.a);
        g7.p8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        g7.p8.r(parcel, q10);
    }
}
