package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.v;
import w7.g0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new m8.h(22);
    public final int a;
    public final v b;

    public g(int i10, v vVar) {
        this.a = i10;
        this.b = vVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        g0.k(parcel, 2, this.b, i10);
        g0.r(parcel, q6);
    }
}
