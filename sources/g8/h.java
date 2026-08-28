package g8;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new r(28);
    public String a;
    public String b;
    public f c;
    public g d;
    public g e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.l(parcel, 3, this.b);
        p8.k(parcel, 4, this.c, i9);
        p8.k(parcel, 5, this.d, i9);
        p8.k(parcel, 6, this.e, i9);
        p8.r(parcel, q10);
    }
}
