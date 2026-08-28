package b8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new w.a(19);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean h;
    public String n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        p8.s(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        p8.s(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.e;
        p8.s(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f;
        p8.s(parcel, 7, 4);
        parcel.writeInt(i15);
        boolean z10 = this.h;
        p8.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p8.l(parcel, 9, this.n);
        p8.r(parcel, q10);
    }
}
