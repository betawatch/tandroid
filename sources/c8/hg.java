package c8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class hg extends r6.a {
    public static final Parcelable.Creator<hg> CREATOR = new ag(3);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public hg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = z13;
        this.e = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        cc.s(parcel, r10);
    }
}
