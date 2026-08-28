package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r0 extends y5.a {
    public static final Parcelable.Creator<r0> CREATOR = new p0(2);
    public final int a;
    public final String b;

    public r0(int i9, String str) {
        this.a = i9;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        p8.l(parcel, 3, this.b);
        p8.r(parcel, q10);
    }
}
