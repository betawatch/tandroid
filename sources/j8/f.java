package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.l(parcel, 3, this.b);
        g5.l(parcel, 4, this.c);
        g5.l(parcel, 5, this.d);
        g5.l(parcel, 6, this.e);
        g5.l(parcel, 7, this.f);
        g5.l(parcel, 8, this.h);
        g5.l(parcel, 9, this.n);
        g5.l(parcel, 10, this.r);
        g5.l(parcel, 11, this.s);
        int i11 = this.v;
        g5.s(parcel, 12, 4);
        parcel.writeInt(i11);
        g5.p(parcel, 13, this.w);
        g5.k(parcel, 14, this.x, i10);
        g5.p(parcel, 15, this.y);
        g5.l(parcel, 16, this.B);
        g5.l(parcel, 17, this.C);
        g5.p(parcel, 18, this.D);
        boolean z4 = this.E;
        g5.s(parcel, 19, 4);
        parcel.writeInt(z4 ? 1 : 0);
        g5.p(parcel, 20, this.F);
        g5.p(parcel, 21, this.G);
        g5.p(parcel, 22, this.H);
        g5.k(parcel, 23, this.I, i10);
        g5.r(parcel, q10);
    }
}
