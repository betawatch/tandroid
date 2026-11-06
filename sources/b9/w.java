package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new c(20);
    public final int a;
    public final List b;

    public w(int i7, ArrayList arrayList) {
        this.a = i7;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        xb.p(parcel, 3, this.b);
        xb.s(parcel, r10);
    }
}
