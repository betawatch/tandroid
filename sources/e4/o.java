package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import j3.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new c.c(16);
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
            if (this.a.equals(oVar.a) && f0.a(this.b, oVar.b) && f0.a(this.c, oVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int f10 = r0.f(527, 31, this.a);
        String str = this.b;
        int hashCode = (f10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // e4.j
    public final String toString() {
        return this.a + ": url=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
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
        int i9 = f0.a;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
