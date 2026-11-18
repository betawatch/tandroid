package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.a);
        bc.l(parcel, 3, this.b);
        bc.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        bc.s(parcel, r10);
    }
}
