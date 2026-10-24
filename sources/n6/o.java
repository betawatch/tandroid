package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class o extends o6.a {
    public static final Parcelable.Creator<o> CREATOR = new m8.h(11);
    public final int a;
    public List b;

    public o(int i10, List list) {
        this.a = i10;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.f0.p(parcel, 2, this.b);
        w7.f0.r(parcel, q6);
    }
}
