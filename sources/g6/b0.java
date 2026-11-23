package g6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import f7.t0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new t0(15);
    public final int a;

    public b0(int i7) {
        this.a = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bc.s(parcel, r10);
    }
}
