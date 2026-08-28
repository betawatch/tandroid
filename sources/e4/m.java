package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m extends j {
    public static final Parcelable.Creator<m> CREATOR = new c.c(14);
    public final String b;
    public final byte[] c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (f0.a(this.b, mVar.b) && Arrays.equals(this.c, mVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // e4.j
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i9 = f0.a;
        this.b = readString;
        this.c = parcel.createByteArray();
    }
}
