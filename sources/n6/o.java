package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new m8.h(13);
    public final int a;
    public List b;

    public o(int i10, List list) {
        this.a = i10;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.e0.p(parcel, 2, this.b);
        w7.e0.r(parcel, q6);
    }
}
