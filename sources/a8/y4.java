package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.b);
        xb.q(parcel, 3, 4);
        parcel.writeFloat(this.c);
        xb.l(parcel, 4, this.a);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        xb.s(parcel, r10);
    }
}
