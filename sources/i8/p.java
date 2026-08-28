package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p extends y5.a {
    public static final Parcelable.Creator<p> CREATOR = new c(11);
    public final int a;
    public final b b;

    public p(int i9, b bVar) {
        this.a = i9;
        this.b = bVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        p8.k(parcel, 3, this.b, i9);
        p8.r(parcel, q10);
    }
}
