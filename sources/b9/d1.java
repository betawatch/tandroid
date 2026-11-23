package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        cc.p(parcel, 2, this.b);
        cc.k(parcel, 3, this.c, i7);
        cc.s(parcel, r10);
    }
}
