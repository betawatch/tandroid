package b8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new w.a(23);
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
    public String v;
    public String w;
    public String x;
    public String y;

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
        p8.l(parcel, 12, this.v);
        p8.l(parcel, 13, this.w);
        p8.l(parcel, 14, this.x);
        p8.l(parcel, 15, this.y);
        p8.r(parcel, q10);
    }
}
