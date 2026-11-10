package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public j(int i7, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.a = i7;
        this.b = z9;
        this.c = z10;
        this.d = z11;
        this.e = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
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
