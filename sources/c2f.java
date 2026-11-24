// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c2f extends b4 {
    public static final Parcelable.Creator<c2f> CREATOR = new e2f((byte) 4);
    public final byte[] a;

    public c2f(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.c(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
