package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class o0 extends r6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String a;
    public final String b;
    public final long c;

    public o0(long j3, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.a);
        cc.l(parcel, 3, this.b);
        cc.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        cc.s(parcel, r10);
    }
}
