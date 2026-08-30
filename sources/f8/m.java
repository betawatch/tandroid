package f8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new b9.e(21);
    public byte[] B;
    public boolean C;
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
        int q10 = f5.q(parcel, 20293);
        int i11 = this.a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 3, this.b);
        f5.l(parcel, 4, this.c);
        int i12 = this.d;
        f5.s(parcel, 5, 4);
        parcel.writeInt(i12);
        f5.o(parcel, 6, this.e, i10);
        f5.k(parcel, 7, this.f, i10);
        f5.k(parcel, 8, this.h, i10);
        f5.k(parcel, 9, this.n, i10);
        f5.k(parcel, 10, this.r, i10);
        f5.k(parcel, 11, this.s, i10);
        f5.k(parcel, 12, this.v, i10);
        f5.k(parcel, 13, this.w, i10);
        f5.k(parcel, 14, this.x, i10);
        f5.k(parcel, 15, this.y, i10);
        f5.c(parcel, 16, this.B);
        boolean z4 = this.C;
        f5.s(parcel, 17, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.r(parcel, q10);
    }
}
