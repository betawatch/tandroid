package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        g5.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        g5.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        g5.l(parcel, 6, this.f);
        g5.l(parcel, 7, this.h);
        g5.s(parcel, 8, 4);
        parcel.writeInt(this.n);
        g5.s(parcel, 9, 4);
        parcel.writeInt(this.r);
        g5.r(parcel, q10);
    }
}
