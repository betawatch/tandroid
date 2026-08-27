package g4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new f4.e(5);
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
        int i10 = g0.a;
        this.c = createByteArray;
    }
}
