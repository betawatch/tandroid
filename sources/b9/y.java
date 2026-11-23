package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(22);
    public final int a;
    public final String b;

    public y(int i7, String str) {
        this.a = i7;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bc.l(parcel, 3, this.b);
        bc.s(parcel, r10);
    }
}
