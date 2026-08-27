package i7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class ta extends z5.a {
    public static final Parcelable.Creator<ta> CREATOR = new s5(3);
    public final float a;
    public final int b;

    public ta(float f10, int i10) {
        this.a = f10;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h7.r8.q(parcel, 20293);
        h7.r8.s(parcel, 1, 4);
        parcel.writeFloat(this.a);
        h7.r8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        h7.r8.r(parcel, q6);
    }
}
