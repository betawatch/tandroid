package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class u extends r6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(18);
    public final int a;
    public final ConnectionConfiguration b;

    public u(int i7, ConnectionConfiguration connectionConfiguration) {
        this.a = i7;
        this.b = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bc.k(parcel, 3, this.b, i7);
        bc.s(parcel, r10);
    }
}
