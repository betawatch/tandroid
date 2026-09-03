package k4;

import android.os.Parcel;
import android.os.Parcelable;
import j3.d1;
import j3.n0;
import j8.t;
import k7.z7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b implements e4.b {
    public static final Parcelable.Creator<b> CREATOR = new t(12);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.a = j10;
        this.b = j11;
        this.c = j12;
        this.d = j13;
        this.e = j14;
    }

    @Override // e4.b
    public final /* synthetic */ n0 b() {
        return null;
    }

    @Override // e4.b
    public final /* synthetic */ byte[] d() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return z7.a(this.e) + ((z7.a(this.d) + ((z7.a(this.c) + ((z7.a(this.b) + ((z7.a(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
    }

    public b(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
    }

    @Override // e4.b
    public final /* synthetic */ void c(d1 d1Var) {
    }
}
