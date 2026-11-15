package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeFloat(this.a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        yb.s(parcel, r10);
    }
}
