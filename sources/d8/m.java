package d8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m extends a6.a {
    public static final Parcelable.Creator<m> CREATOR = new d6.d(2);
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
        int q6 = o.q(parcel, 20293);
        int i11 = this.a;
        o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        o.l(parcel, 3, this.b);
        o.l(parcel, 4, this.c);
        int i12 = this.d;
        o.s(parcel, 5, 4);
        parcel.writeInt(i12);
        o.o(parcel, 6, this.e, i10);
        o.k(parcel, 7, this.f, i10);
        o.k(parcel, 8, this.h, i10);
        o.k(parcel, 9, this.n, i10);
        o.k(parcel, 10, this.r, i10);
        o.k(parcel, 11, this.s, i10);
        o.k(parcel, 12, this.v, i10);
        o.k(parcel, 13, this.w, i10);
        o.k(parcel, 14, this.x, i10);
        o.k(parcel, 15, this.y, i10);
        o.c(parcel, 16, this.A);
        boolean z10 = this.B;
        o.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        o.r(parcel, q6);
    }
}
