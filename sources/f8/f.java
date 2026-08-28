package f8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends y5.a {
    public static final Parcelable.Creator<f> CREATOR = new r(11);
    public String A;
    public String B;
    public ArrayList C;
    public boolean D;
    public ArrayList E;
    public ArrayList F;
    public ArrayList G;
    public g8.c H;
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
    public g8.f x;
    public ArrayList y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.l(parcel, 3, this.b);
        p8.l(parcel, 4, this.c);
        p8.l(parcel, 5, this.d);
        p8.l(parcel, 6, this.e);
        p8.l(parcel, 7, this.f);
        p8.l(parcel, 8, this.h);
        p8.l(parcel, 9, this.n);
        p8.l(parcel, 10, this.r);
        p8.l(parcel, 11, this.s);
        int i10 = this.v;
        p8.s(parcel, 12, 4);
        parcel.writeInt(i10);
        p8.p(parcel, 13, this.w);
        p8.k(parcel, 14, this.x, i9);
        p8.p(parcel, 15, this.y);
        p8.l(parcel, 16, this.A);
        p8.l(parcel, 17, this.B);
        p8.p(parcel, 18, this.C);
        boolean z10 = this.D;
        p8.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p8.p(parcel, 20, this.E);
        p8.p(parcel, 21, this.F);
        p8.p(parcel, 22, this.G);
        p8.k(parcel, 23, this.H, i9);
        p8.r(parcel, q10);
    }
}
