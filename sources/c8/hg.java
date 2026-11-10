package c8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class hg extends r6.a {
    public static final Parcelable.Creator<hg> CREATOR = new ag(3);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public hg(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = z9;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.e = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        xb.s(parcel, r10);
    }
}
