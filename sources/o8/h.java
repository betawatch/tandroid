package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.v;
import w7.g0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(25);
    public final int a;
    public final k6.a b;
    public final v c;

    public h(int i10, k6.a aVar, v vVar) {
        this.a = i10;
        this.b = aVar;
        this.c = vVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        g0.k(parcel, 2, this.b, i10);
        g0.k(parcel, 3, this.c, i10);
        g0.r(parcel, q6);
    }
}
