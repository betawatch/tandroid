package l4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.w;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class k extends b {
    public static final Parcelable.Creator<k> CREATOR = new j(0);
    public final long a;
    public final long b;

    public k(long j10, long j11) {
        this.a = j10;
        this.b = j11;
    }

    public static long a(long j10, w wVar) {
        long u10 = wVar.u();
        if ((128 & u10) != 0) {
            return 8589934591L & ((((u10 & 1) << 32) | wVar.v()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // l4.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.a);
        sb.append(", playbackPositionUs= ");
        return android.support.v4.media.a.q(sb, this.b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
