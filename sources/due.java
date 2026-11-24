// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class due extends b4 {
    public static final Parcelable.Creator<due> CREATOR = new sje((byte) 20);
    public final byte[] a;

    public due(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.c(parcel, 2, this.a);
        mve.s(parcel, r);
    }
}
