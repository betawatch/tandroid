package c8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        cc.q(parcel, 5, 8);
        parcel.writeLong(this.e);
        cc.s(parcel, r10);
    }
}
