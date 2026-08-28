package l3;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import j3.r0;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new h5.h(14);
    public int a;
    public final UUID b;
    public final String c;
    public final String d;
    public final byte[] e;

    public b(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        str2.getClass();
        this.d = str2;
        this.e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        return f0.a(this.c, bVar.c) && f0.a(this.d, bVar.d) && f0.a(this.b, bVar.b) && Arrays.equals(this.e, bVar.e);
    }

    public final int hashCode() {
        if (this.a == 0) {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            this.a = Arrays.hashCode(this.e) + r0.f((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        UUID uuid = this.b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public b(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        String readString = parcel.readString();
        int i9 = f0.a;
        this.d = readString;
        this.e = parcel.createByteArray();
    }
}
