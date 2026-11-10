package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class d1 extends r6.a {
    public static final Parcelable.Creator<d1> CREATOR = new n0(11);
    public final int a;
    public final List b;
    public final a1 c;

    public d1(int i7, ArrayList arrayList, a1 a1Var) {
        this.a = i7;
        this.b = arrayList;
        this.c = a1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        xb.p(parcel, 2, this.b);
        xb.k(parcel, 3, this.c, i7);
        xb.s(parcel, r10);
    }
}
