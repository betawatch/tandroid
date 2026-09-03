package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new b9.e(24);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public b f;
    public b h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.l(parcel, 3, this.b);
        f5.l(parcel, 4, this.c);
        f5.l(parcel, 5, this.d);
        f5.l(parcel, 6, this.e);
        f5.k(parcel, 7, this.f, i10);
        f5.k(parcel, 8, this.h, i10);
        f5.r(parcel, q10);
    }
}
