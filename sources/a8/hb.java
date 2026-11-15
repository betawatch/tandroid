package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class hb extends r6.a {
    public static final Parcelable.Creator<hb> CREATOR = new z5(2);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public hb(float f10, int i7, String str, String str2) {
        this.a = str;
        this.b = f10;
        this.c = str2;
        this.d = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.a);
        yb.q(parcel, 2, 4);
        parcel.writeFloat(this.b);
        yb.l(parcel, 3, this.c);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        yb.s(parcel, r10);
    }
}
