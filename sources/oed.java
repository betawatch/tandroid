// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class oed extends b4 implements Parcelable {
    public static final Parcelable.Creator<oed> CREATOR = new j9d(25);
    public final String a;
    public final String b;
    public final String c;

    public oed(String str, String str2, String str3) {
        fre.h(str);
        this.a = str;
        fre.h(str2);
        this.b = str2;
        fre.h(str3);
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oed)) {
            return false;
        }
        oed oedVar = (oed) obj;
        return this.a.equals(oedVar.a) && cqe.a(oedVar.b, this.b) && cqe.a(oedVar.c, this.c);
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
        return b00.j(yjb.l("Channel{token=", trim, ", nodeId=", this.b, ", path="), this.c, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.l(parcel, 4, this.c);
        jte.s(parcel, r);
    }
}
