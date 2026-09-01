package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.l(parcel, 3, this.b);
        g5.s(parcel, 4, 8);
        parcel.writeLong(this.c);
        g5.r(parcel, q10);
    }
}
