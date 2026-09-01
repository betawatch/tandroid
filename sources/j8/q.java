package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q extends c6.a {
    public static final Parcelable.Creator<q> CREATOR = new t(1);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public String n;
    public String r;
    public boolean s;
    public String v;

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
        boolean z4 = this.s;
        g5.s(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        g5.l(parcel, 12, this.v);
        g5.r(parcel, q10);
    }
}
