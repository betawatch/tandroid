package b8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m extends y5.a {
    public static final Parcelable.Creator<m> CREATOR = new w.a(18);
    public byte[] A;
    public boolean B;
    public int a;
    public String b;
    public String c;
    public int d;
    public Point[] e;
    public f f;
    public i h;
    public j n;
    public l r;
    public k s;
    public g v;
    public c w;
    public d x;
    public e y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        p8.l(parcel, 3, this.b);
        p8.l(parcel, 4, this.c);
        int i11 = this.d;
        p8.s(parcel, 5, 4);
        parcel.writeInt(i11);
        p8.o(parcel, 6, this.e, i9);
        p8.k(parcel, 7, this.f, i9);
        p8.k(parcel, 8, this.h, i9);
        p8.k(parcel, 9, this.n, i9);
        p8.k(parcel, 10, this.r, i9);
        p8.k(parcel, 11, this.s, i9);
        p8.k(parcel, 12, this.v, i9);
        p8.k(parcel, 13, this.w, i9);
        p8.k(parcel, 14, this.x, i9);
        p8.k(parcel, 15, this.y, i9);
        p8.c(parcel, 16, this.A);
        boolean z10 = this.B;
        p8.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p8.r(parcel, q10);
    }
}
