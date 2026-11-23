package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class t0 extends r6.a {
    public static final Parcelable.Creator<t0> CREATOR = new o0(5);
    public final int a;
    public final int b;
    public final byte[] c;

    public t0(int i7, int i10, byte[] bArr) {
        this.a = i7;
        this.b = i10;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bc.c(parcel, 3, this.c);
        bc.s(parcel, r10);
    }
}
