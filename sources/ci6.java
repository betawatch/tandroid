// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ci6 extends b4 {
    public static final Parcelable.Creator<ci6> CREATOR = new sje((byte) 10);
    public String a;
    public di6 b;
    public qpb c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.k(parcel, 3, this.b, i);
        mve.k(parcel, 5, this.c, i);
        mve.s(parcel, r);
    }
}
