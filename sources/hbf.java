// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hbf extends b4 {
    public static final Parcelable.Creator<hbf> CREATOR = new e2f((byte) 17);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.m(parcel, 1, this.a);
        mve.g(parcel, 2, this.b);
        mve.k(parcel, 3, this.c, i);
        mve.c(parcel, 4, this.d);
        mve.s(parcel, r);
    }
}
