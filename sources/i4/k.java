package i4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.w;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k extends b {
    public static final Parcelable.Creator<k> CREATOR = new g(1);
    public final long a;
    public final long b;

    public k(long j10, long j11) {
        this.a = j10;
        this.b = j11;
    }

    public static long a(long j10, w wVar) {
        long r6 = wVar.r();
        if ((128 & r6) != 0) {
            return 8589934591L & ((((r6 & 1) << 32) | wVar.s()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
