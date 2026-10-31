package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new p(0);
    public final int a;
    public final int b;
    public final int c;

    public b(int i10, int i11, int i12) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        h0.r(parcel, q6);
    }
}
