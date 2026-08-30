package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new t(7);
    public String B;
    public String C;
    public ArrayList D;
    public boolean E;
    public ArrayList F;
    public ArrayList G;
    public ArrayList H;
    public k8.c I;
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
    public k8.f x;
    public ArrayList y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.l(parcel, 3, this.b);
        f5.l(parcel, 4, this.c);
        f5.l(parcel, 5, this.d);
        f5.l(parcel, 6, this.e);
        f5.l(parcel, 7, this.f);
        f5.l(parcel, 8, this.h);
        f5.l(parcel, 9, this.n);
        f5.l(parcel, 10, this.r);
        f5.l(parcel, 11, this.s);
        int i11 = this.v;
        f5.s(parcel, 12, 4);
        parcel.writeInt(i11);
        f5.p(parcel, 13, this.w);
        f5.k(parcel, 14, this.x, i10);
        f5.p(parcel, 15, this.y);
        f5.l(parcel, 16, this.B);
        f5.l(parcel, 17, this.C);
        f5.p(parcel, 18, this.D);
        boolean z4 = this.E;
        f5.s(parcel, 19, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.p(parcel, 20, this.F);
        f5.p(parcel, 21, this.G);
        f5.p(parcel, 22, this.H);
        f5.k(parcel, 23, this.I, i10);
        f5.r(parcel, q10);
    }
}
