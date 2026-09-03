package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import j8.t;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new t(19);
    public int a;
    public String b;
    public double c;
    public String d;
    public long e;
    public int f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g5.l(parcel, 3, this.b);
        double d = this.c;
        g5.s(parcel, 4, 8);
        parcel.writeDouble(d);
        g5.l(parcel, 5, this.d);
        long j10 = this.e;
        g5.s(parcel, 6, 8);
        parcel.writeLong(j10);
        int i12 = this.f;
        g5.s(parcel, 7, 4);
        parcel.writeInt(i12);
        g5.r(parcel, q10);
    }
}
