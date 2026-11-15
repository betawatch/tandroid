package h8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import f7.t0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new t0(22);
    public final byte[] a;

    public e(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.c(parcel, 2, this.a);
        yb.s(parcel, r10);
    }
}
