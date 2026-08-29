package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import j7.l1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new d6.d(29);
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
        int f9 = l1.f(527, 31, this.a);
        String str = this.b;
        int hashCode = (f9 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // g4.j
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
