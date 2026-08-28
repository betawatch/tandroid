package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import h3.g1;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends j {
    public static final Parcelable.Creator<a> CREATOR = new c.c(6);
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public a(int i9, String str, String str2, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i9;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && f0.a(this.b, aVar.b) && f0.a(this.c, aVar.c) && Arrays.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = (527 + this.d) * 31;
        String str = this.b;
        int hashCode = (i9 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return Arrays.hashCode(this.e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // e4.j, z3.b
    public final void populateMediaMetadata(g1 g1Var) {
        g1Var.a(this.d, this.e);
    }

    @Override // e4.j
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.e);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i9 = f0.a;
        this.b = readString;
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.createByteArray();
    }
}
