package g8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends z5.a {
    public static final Parcelable.Creator<f> CREATOR = new f4.e(24);
    public String A;
    public String B;
    public ArrayList C;
    public boolean D;
    public ArrayList E;
    public ArrayList F;
    public ArrayList G;
    public h8.c H;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public String n;
    public String r;
    public String s;
    public int v;
    public ArrayList w;
    public h8.f x;
    public ArrayList y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.a);
        r8.l(parcel, 3, this.b);
        r8.l(parcel, 4, this.c);
        r8.l(parcel, 5, this.d);
        r8.l(parcel, 6, this.e);
        r8.l(parcel, 7, this.f);
        r8.l(parcel, 8, this.h);
        r8.l(parcel, 9, this.n);
        r8.l(parcel, 10, this.r);
        r8.l(parcel, 11, this.s);
        int i11 = this.v;
        r8.s(parcel, 12, 4);
        parcel.writeInt(i11);
        r8.p(parcel, 13, this.w);
        r8.k(parcel, 14, this.x, i10);
        r8.p(parcel, 15, this.y);
        r8.l(parcel, 16, this.A);
        r8.l(parcel, 17, this.B);
        r8.p(parcel, 18, this.C);
        boolean z10 = this.D;
        r8.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        r8.p(parcel, 20, this.E);
        r8.p(parcel, 21, this.F);
        r8.p(parcel, 22, this.G);
        r8.k(parcel, 23, this.H, i10);
        r8.r(parcel, q6);
    }
}
