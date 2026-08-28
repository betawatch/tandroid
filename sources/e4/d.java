package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends j {
    public static final Parcelable.Creator<d> CREATOR = new c.c(9);
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final j[] f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z10;
        this.d = z11;
        this.e = strArr;
        this.f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.c == dVar.c && this.d == dVar.d && f0.a(this.b, dVar.b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f, dVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = (((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.b;
        return i9 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.e);
        j[] jVarArr = this.f;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i9 = f0.a;
        this.b = readString;
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f = new j[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f[i10] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
