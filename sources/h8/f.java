package h8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends z5.a {
    public static final Parcelable.Creator<f> CREATOR = new h5.h(12);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        long j10 = this.a;
        r8.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.b;
        r8.s(parcel, 3, 8);
        parcel.writeLong(j11);
        r8.r(parcel, q6);
    }
}
