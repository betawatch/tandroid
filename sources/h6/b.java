package h6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import f7.t0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new t0(19);
    public final int a;
    public final int b;
    public final int c;

    public b(int i7, int i10, int i11) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        cc.s(parcel, r10);
    }
}
