package f8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new r(9);
    public String a;
    public String b;
    public int c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.l(parcel, 3, this.b);
        int i10 = this.c;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            i10 = 0;
        }
        p8.s(parcel, 4, 4);
        parcel.writeInt(i10);
        p8.r(parcel, q10);
    }
}
