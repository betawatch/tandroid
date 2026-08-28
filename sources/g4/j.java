package g4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.y;
import f8.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new r(19);
    public final long a;
    public final long b;

    public j(long j10, long j11) {
        this.a = j10;
        this.b = j11;
    }

    public static long a(long j10, y yVar) {
        long r10 = yVar.r();
        if ((128 & r10) != 0) {
            return 8589934591L & ((((r10 & 1) << 32) | yVar.s()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
