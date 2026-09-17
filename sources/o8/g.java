package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.u;
import w7.e0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new m8.h(24);
    public final int a;
    public final u b;

    public g(int i10, u uVar) {
        this.a = i10;
        this.b = uVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        e0.k(parcel, 2, this.b, i10);
        e0.r(parcel, q6);
    }
}
