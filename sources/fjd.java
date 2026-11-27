// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fjd extends c4 implements Parcelable {
    public static final Parcelable.Creator<fjd> CREATOR = new ced(25);
    public final String a;
    public final String b;
    public final String c;

    public fjd(String str, String str2, String str3) {
        xve.h(str);
        this.a = str;
        xve.h(str2);
        this.b = str2;
        xve.h(str3);
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fjd)) {
            return false;
        }
        fjd fjdVar = (fjd) obj;
        return this.a.equals(fjdVar.a) && vue.a(fjdVar.b, this.b) && vue.a(fjdVar.c, this.c);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i;
        }
        return c00.k(xnb.l("Channel{token=", trim, ", nodeId=", this.b, ", path="), this.c, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.l(parcel, 4, this.c);
        bye.s(parcel, r);
    }
}
