package h8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import c8.bc;
import f7.t0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new t0(25);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.m(parcel, 1, this.a);
        bc.g(parcel, 2, this.b);
        bc.k(parcel, 3, this.c, i7);
        bc.c(parcel, 4, this.d);
        bc.s(parcel, r10);
    }
}
