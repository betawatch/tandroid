package c8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class yf extends r6.a {
    public static final Parcelable.Creator<yf> CREATOR = new ag(0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public yf(int i7, int i10, int i11, long j3, int i12) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 8);
        parcel.writeLong(this.e);
        xb.s(parcel, r10);
    }
}
