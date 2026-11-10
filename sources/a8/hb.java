package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class hb extends r6.a {
    public static final Parcelable.Creator<hb> CREATOR = new z5(3);
    public final float a;
    public final int b;

    public hb(float f10, int i7) {
        this.a = f10;
        this.b = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeFloat(this.a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        xb.s(parcel, r10);
    }
}
