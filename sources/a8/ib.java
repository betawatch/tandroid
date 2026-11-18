package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class ib extends r6.a {
    public static final Parcelable.Creator<ib> CREATOR = new z5(3);
    public final float a;
    public final int b;

    public ib(float f10, int i7) {
        this.a = f10;
        this.b = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeFloat(this.a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bc.s(parcel, r10);
    }
}
