package j7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ag extends y5.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public ag(int i9, int i10, int i11, long j10, int i12) {
        this.a = i9;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = g7.p8.q(parcel, 20293);
        g7.p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        g7.p8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        g7.p8.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        g7.p8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g7.p8.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        g7.p8.r(parcel, q10);
    }
}
