package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class e1 extends r6.a {
    public static final Parcelable.Creator<e1> CREATOR = new o0(11);
    public final int a;
    public final List b;
    public final b1 c;

    public e1(int i7, ArrayList arrayList, b1 b1Var) {
        this.a = i7;
        this.b = arrayList;
        this.c = b1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        yb.p(parcel, 2, this.b);
        yb.k(parcel, 3, this.c, i7);
        yb.s(parcel, r10);
    }
}
