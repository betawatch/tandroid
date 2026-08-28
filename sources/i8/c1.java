package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c1 extends y5.a {
    public static final Parcelable.Creator<c1> CREATOR = new c(26);
    public final String a;
    public final int b;
    public final int c;

    public c1(String str, int i9, int i10) {
        this.a = str;
        this.b = i9;
        this.c = i10;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (this.b == c1Var.b && this.c == c1Var.c && ((str = this.a) == (obj2 = c1Var.a) || (str != null && str.equals(obj2)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return aa.d.r(e2.c.o("WebIconParcelable{", this.b, "x", this.c, " - "), this.a, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        p8.r(parcel, q10);
    }
}
