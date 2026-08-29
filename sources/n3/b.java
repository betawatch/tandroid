package n3;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import j7.l1;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new i4.g(27);
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
        return d0.a(this.c, bVar.c) && d0.a(this.d, bVar.d) && d0.a(this.b, bVar.b) && Arrays.equals(this.e, bVar.e);
    }

    public final int hashCode() {
        if (this.a == 0) {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            this.a = Arrays.hashCode(this.e) + l1.f((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
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
        int i10 = d0.a;
        this.d = readString;
        this.e = parcel.createByteArray();
    }
}
