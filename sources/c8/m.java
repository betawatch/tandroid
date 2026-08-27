package c8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m extends z5.a {
    public static final Parcelable.Creator<m> CREATOR = new w.a(29);
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        int i11 = this.a;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        r8.l(parcel, 3, this.b);
        r8.l(parcel, 4, this.c);
        int i12 = this.d;
        r8.s(parcel, 5, 4);
        parcel.writeInt(i12);
        r8.o(parcel, 6, this.e, i10);
        r8.k(parcel, 7, this.f, i10);
        r8.k(parcel, 8, this.h, i10);
        r8.k(parcel, 9, this.n, i10);
        r8.k(parcel, 10, this.r, i10);
        r8.k(parcel, 11, this.s, i10);
        r8.k(parcel, 12, this.v, i10);
        r8.k(parcel, 13, this.w, i10);
        r8.k(parcel, 14, this.x, i10);
        r8.k(parcel, 15, this.y, i10);
        r8.c(parcel, 16, this.A);
        boolean z10 = this.B;
        r8.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        r8.r(parcel, q6);
    }
}
