package h8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import c8.xb;
import f7.t0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new t0(25);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.m(parcel, 1, this.a);
        xb.g(parcel, 2, this.b);
        xb.k(parcel, 3, this.c, i7);
        xb.c(parcel, 4, this.d);
        xb.s(parcel, r10);
    }
}
