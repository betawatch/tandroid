package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class p0 extends c6.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0(1);
    public final String a;
    public final String b;
    public final long c;

    public p0(long j10, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.l(parcel, 3, this.b);
        f5.s(parcel, 4, 8);
        parcel.writeLong(this.c);
        f5.r(parcel, q10);
    }
}
