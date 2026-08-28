package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends y5.a implements h8.b, h8.d {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String a;
    public final String b;
    public final String c;

    public f(String str, String str2, String str3) {
        x5.l.h(str);
        this.a = str;
        x5.l.h(str2);
        this.b = str2;
        x5.l.h(str3);
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && x5.l.l(fVar.b, this.b) && x5.l.l(fVar.c, this.c);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i9 = 0;
        for (char c10 : str.toCharArray()) {
            i9 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i9;
        }
        return aa.d.r(j3.r0.q("Channel{token=", trim, ", nodeId=", this.b, ", path="), this.c, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.l(parcel, 3, this.b);
        p8.l(parcel, 4, this.c);
        p8.r(parcel, q10);
    }
}
