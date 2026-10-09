package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.w;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(25);
    public final int a;
    public final k6.a b;
    public final w c;

    public h(int i10, k6.a aVar, w wVar) {
        this.a = i10;
        this.b = aVar;
        this.c = wVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        d0.k(parcel, 2, this.b, i10);
        d0.k(parcel, 3, this.c, i10);
        d0.r(parcel, q6);
    }
}
