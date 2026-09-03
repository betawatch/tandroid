package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j3.d1;
import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a extends j {
    public static final Parcelable.Creator<a> CREATOR = new f8.o(12);
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i10;
        this.e = bArr;
    }

    @Override // j4.j, e4.b
    public final void c(d1 d1Var) {
        d1Var.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && d0.a(this.b, aVar.b) && d0.a(this.c, aVar.c) && Arrays.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.d) * 31;
        String str = this.b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return Arrays.hashCode(this.e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // j4.j
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.e);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i10 = d0.a;
        this.b = readString;
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.createByteArray();
    }
}
