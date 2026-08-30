package l4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j8.t;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new t(26);
    public final long a;
    public final long b;
    public final byte[] c;

    public a(long j10, long j11, byte[] bArr) {
        this.a = j11;
        this.b = j10;
        this.c = bArr;
    }

    @Override // l4.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.a);
        sb.append(", identifier= ");
        return android.support.v4.media.a.q(sb, this.b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }

    public a(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i10 = d0.a;
        this.c = createByteArray;
    }
}
