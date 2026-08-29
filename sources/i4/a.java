package i4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new g8.b(27);
    public final long a;
    public final long b;
    public final byte[] c;

    public a(long j10, long j11, byte[] bArr) {
        this.a = j11;
        this.b = j10;
        this.c = bArr;
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
