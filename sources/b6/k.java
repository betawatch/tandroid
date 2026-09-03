package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new w.a(21);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String h;
    public final int n;
    public final int r;

    public k(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = j10;
        this.e = j11;
        this.f = str;
        this.h = str2;
        this.n = i13;
        this.r = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        f5.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        f5.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        f5.l(parcel, 6, this.f);
        f5.l(parcel, 7, this.h);
        f5.s(parcel, 8, 4);
        parcel.writeInt(this.n);
        f5.s(parcel, 9, 4);
        parcel.writeInt(this.r);
        f5.r(parcel, q10);
    }
}
