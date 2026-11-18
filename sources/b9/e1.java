package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bc.p(parcel, 2, this.b);
        bc.k(parcel, 3, this.c, i7);
        bc.s(parcel, r10);
    }
}
