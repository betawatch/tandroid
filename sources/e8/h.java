package e8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import e6.p;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p(6);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.m(parcel, 1, this.a);
        h0.g(parcel, 2, this.b);
        h0.k(parcel, 3, this.c, i10);
        h0.c(parcel, 4, this.d);
        h0.r(parcel, q6);
    }
}
