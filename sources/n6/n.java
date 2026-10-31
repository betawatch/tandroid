package n6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new m8.i(14);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public n(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.a = i10;
        this.b = z10;
        this.c = z11;
        this.d = i11;
        this.e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.h0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        w7.h0.r(parcel, q6);
    }
}
