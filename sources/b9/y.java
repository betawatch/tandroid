package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(22);
    public final int a;
    public final String b;

    public y(int i7, String str) {
        this.a = i7;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        xb.l(parcel, 3, this.b);
        xb.s(parcel, r10);
    }
}
