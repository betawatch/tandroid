package b9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class z extends r6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(23);
    public final int a;
    public final ParcelFileDescriptor b;

    public z(int i7, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i7;
        this.b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bc.k(parcel, 3, this.b, i7 | 1);
        bc.s(parcel, r10);
    }
}
