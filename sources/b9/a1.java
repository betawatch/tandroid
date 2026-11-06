package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a1 extends r6.a {
    public static final Parcelable.Creator<a1> CREATOR = new c(26);
    public final String a;
    public final int b;
    public final int c;

    public a1(String str, int i7, int i10) {
        this.a = str;
        this.b = i7;
        this.c = i10;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.b == a1Var.b && this.c == a1Var.c && ((str = this.a) == (obj2 = a1Var.a) || (str != null && str.equals(obj2)))) {
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
        return a8.p0.s(jg.g.o("WebIconParcelable{", this.b, "x", this.c, " - "), this.a, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        xb.s(parcel, r10);
    }
}
