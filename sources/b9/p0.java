package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class p0 extends r6.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0(1);
    public final String a;
    public final String b;
    public final long c;

    public p0(long j3, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.a);
        yb.l(parcel, 3, this.b);
        yb.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        yb.s(parcel, r10);
    }
}
