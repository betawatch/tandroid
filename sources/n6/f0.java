package n6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class f0 extends o6.a {
    public static final Parcelable.Creator<f0> CREATOR = new m8.h(19);
    public Bundle a;
    public k6.c[] b;
    public int c;
    public e d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.b(parcel, 1, this.a);
        w7.f0.o(parcel, 2, this.b, i10);
        int i11 = this.c;
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(i11);
        w7.f0.k(parcel, 4, this.d, i10);
        w7.f0.r(parcel, q6);
    }
}
