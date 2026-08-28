package f8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s extends y5.a {
    public static final Parcelable.Creator<s> CREATOR = new r(1);
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public s(int i9, int i10, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i9;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.l(parcel, 3, this.b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        p8.r(parcel, q10);
    }
}
