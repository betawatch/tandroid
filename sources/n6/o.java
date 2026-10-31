package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new m8.i(10);
    public final int a;
    public List b;

    public o(int i10, List list) {
        this.a = i10;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.h0.p(parcel, 2, this.b);
        w7.h0.r(parcel, q6);
    }
}
