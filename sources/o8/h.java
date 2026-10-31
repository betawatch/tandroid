package o8;

import android.os.Parcel;
import android.os.Parcelable;
import m8.i;
import n6.v;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new i(22);
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
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        h0.k(parcel, 2, this.b, i10);
        h0.k(parcel, 3, this.c, i10);
        h0.r(parcel, q6);
    }
}
