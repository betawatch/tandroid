package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.b);
        yb.q(parcel, 3, 4);
        parcel.writeFloat(this.c);
        yb.l(parcel, 4, this.a);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        yb.s(parcel, r10);
    }
}
