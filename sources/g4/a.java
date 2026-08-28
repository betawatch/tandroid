package g4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import f8.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new r(15);
    public final long a;
    public final long b;
    public final byte[] c;

    public a(long j10, long j11, byte[] bArr) {
        this.a = j11;
        this.b = j10;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }

    public a(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i9 = f0.a;
        this.c = createByteArray;
    }
}
