package b8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends y5.a {
    public static final Parcelable.Creator<g> CREATOR = new w.a(25);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        double d = this.a;
        p8.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d9 = this.b;
        p8.s(parcel, 3, 8);
        parcel.writeDouble(d9);
        p8.r(parcel, q10);
    }
}
