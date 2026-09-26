package e8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import w7.f0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new e6.i(7);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.m(parcel, 1, this.a);
        f0.g(parcel, 2, this.b);
        f0.k(parcel, 3, this.c, i10);
        f0.c(parcel, 4, this.d);
        f0.r(parcel, q6);
    }
}
