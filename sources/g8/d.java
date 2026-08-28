package g8;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new r(23);
    public int a;
    public String b;
    public double c;
    public String d;
    public long e;
    public int f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        p8.l(parcel, 3, this.b);
        double d = this.c;
        p8.s(parcel, 4, 8);
        parcel.writeDouble(d);
        p8.l(parcel, 5, this.d);
        long j10 = this.e;
        p8.s(parcel, 6, 8);
        parcel.writeLong(j10);
        int i11 = this.f;
        p8.s(parcel, 7, 4);
        parcel.writeInt(i11);
        p8.r(parcel, q10);
    }
}
