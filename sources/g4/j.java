package g4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new f4.e(9);
    public final long a;
    public final long b;

    public j(long j10, long j11) {
        this.a = j10;
        this.b = j11;
    }

    public static long a(long j10, z zVar) {
        long r10 = zVar.r();
        if ((128 & r10) != 0) {
            return 8589934591L & ((((r10 & 1) << 32) | zVar.s()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
