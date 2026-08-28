package o5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new p(1);
    public final String a;
    public final int b;
    public final String c;

    public d(String str, int i9, String str2) {
        this.a = str;
        this.b = i9;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        p8.l(parcel, 4, this.c);
        p8.r(parcel, q10);
    }
}
