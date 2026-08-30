package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import kh.a2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new f8.o(22);
    public final String b;
    public final String c;

    public o(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.a.equals(oVar.a) && d0.a(this.b, oVar.b) && d0.a(this.c, oVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int e = a2.e(527, 31, this.a);
        String str = this.b;
        int hashCode = (e + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // j4.j
    public final String toString() {
        return this.a + ": url=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i10 = d0.a;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
