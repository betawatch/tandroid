package m5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j extends z5.a {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public static final r5.b e = new r5.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new w(8);

    public j(long j10, long j11, boolean z10, boolean z11) {
        this.a = Math.max(j10, 0L);
        this.b = Math.max(j11, 0L);
        this.c = z10;
        this.d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b && this.c == jVar.c && this.d == jVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        r8.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        r8.r(parcel, q6);
    }
}
