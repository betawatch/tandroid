package o6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class o extends p6.a {
    public static final Parcelable.Creator<o> CREATOR = new n4.x(11);
    public final int a;
    public List b;

    public o(int i10, List list) {
        this.a = i10;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.p(parcel, 2, this.b);
        df.r(parcel, q5);
    }
}
