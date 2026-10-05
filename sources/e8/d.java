package e8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new e6.i(3);
    public final byte[] a;

    public d(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.c(parcel, 2, this.a);
        g0.r(parcel, q6);
    }
}
