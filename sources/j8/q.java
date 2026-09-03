package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        boolean z4 = this.s;
        f5.s(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.l(parcel, 12, this.v);
        f5.r(parcel, q10);
    }
}
