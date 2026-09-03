package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d extends j {
    public static final Parcelable.Creator<d> CREATOR = new f8.o(15);
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final j[] f;

    public d(String str, boolean z4, boolean z10, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z4;
        this.d = z10;
        this.e = strArr;
        this.f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.c == dVar.c && this.d == dVar.d && d0.a(this.b, dVar.b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f, dVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
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
        int i10 = d0.a;
        this.b = readString;
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f = new j[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f[i11] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
