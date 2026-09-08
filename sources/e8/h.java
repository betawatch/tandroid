package e8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import w7.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new e6.i(7);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.m(parcel, 1, this.a);
        e0.g(parcel, 2, this.b);
        e0.k(parcel, 3, this.c, i10);
        e0.c(parcel, 4, this.d);
        e0.r(parcel, q6);
    }
}
