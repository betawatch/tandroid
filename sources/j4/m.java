package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m extends j {
    public static final Parcelable.Creator<m> CREATOR = new f8.o(20);
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
            if (d0.a(this.b, mVar.b) && Arrays.equals(this.c, mVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // j4.j
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i10 = d0.a;
        this.b = readString;
        this.c = parcel.createByteArray();
    }
}
