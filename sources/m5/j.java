package m5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends y5.a {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public static final q5.b e = new q5.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new v(8);

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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        p8.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.r(parcel, q10);
    }
}
