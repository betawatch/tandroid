package n6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(14);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String h;
    public final int n;
    public final int r;

    public j(int i10, int i11, int i12, long j3, long j10, String str, String str2, int i13, int i14) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = j3;
        this.e = j10;
        this.f = str;
        this.h = str2;
        this.n = i13;
        this.r = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        w7.d0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.d0.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        w7.d0.l(parcel, 6, this.f);
        w7.d0.l(parcel, 7, this.h);
        w7.d0.s(parcel, 8, 4);
        parcel.writeInt(this.n);
        w7.d0.s(parcel, 9, 4);
        parcel.writeInt(this.r);
        w7.d0.r(parcel, q6);
    }
}
