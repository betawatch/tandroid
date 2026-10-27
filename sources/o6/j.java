package o6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j extends p6.a {
    public static final Parcelable.Creator<j> CREATOR = new n4.x(12);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String h;
    public final int n;
    public final int r;

    public j(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
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
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        df.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        df.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        df.l(parcel, 6, this.f);
        df.l(parcel, 7, this.h);
        df.s(parcel, 8, 4);
        parcel.writeInt(this.n);
        df.s(parcel, 9, 4);
        parcel.writeInt(this.r);
        df.r(parcel, q5);
    }
}
