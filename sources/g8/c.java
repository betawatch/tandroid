package g8;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends y5.a {
    public static final Parcelable.Creator<c> CREATOR = new r(24);
    public String a;
    public d b;
    public f c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.k(parcel, 3, this.b, i9);
        p8.k(parcel, 5, this.c, i9);
        p8.r(parcel, q10);
    }
}
