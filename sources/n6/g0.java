package n6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class g0 extends o6.a {
    public static final Parcelable.Creator<g0> CREATOR = new m8.h(19);
    public Bundle a;
    public k6.c[] b;
    public int c;
    public e d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.b(parcel, 1, this.a);
        w7.d0.o(parcel, 2, this.b, i10);
        int i11 = this.c;
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(i11);
        w7.d0.k(parcel, 4, this.d, i10);
        w7.d0.r(parcel, q6);
    }
}
