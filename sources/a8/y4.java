package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class y4 extends r6.a {
    public static final Parcelable.Creator<y4> CREATOR = new z5(0);
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public y4(float f10, int i7, String str, String str2) {
        this.b = str2;
        this.c = f10;
        this.a = str;
        this.d = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.b);
        cc.q(parcel, 3, 4);
        parcel.writeFloat(this.c);
        cc.l(parcel, 4, this.a);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        cc.s(parcel, r10);
    }
}
