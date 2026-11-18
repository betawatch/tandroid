package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.a);
        bc.q(parcel, 2, 4);
        parcel.writeFloat(this.b);
        bc.l(parcel, 3, this.c);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bc.s(parcel, r10);
    }
}
