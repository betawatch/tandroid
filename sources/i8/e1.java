package i8;

import android.os.Parcel;
import android.os.Parcelable;
import f7.l8;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e1 extends y5.a {
    public static final Parcelable.Creator<e1> CREATOR = new p0(10);
    public final String a;
    public final String b;
    public final c1 c;
    public final String d;
    public final String e;
    public final Float f;
    public final g1 h;

    public e1(String str, String str2, c1 c1Var, String str3, String str4, Float f10, g1 g1Var) {
        this.a = str;
        this.b = str2;
        this.c = c1Var;
        this.d = str3;
        this.e = str4;
        this.f = f10;
        this.h = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (l8.a(this.a, e1Var.a) && l8.a(this.b, e1Var.b) && l8.a(this.c, e1Var.c) && l8.a(this.d, e1Var.d) && l8.a(this.e, e1Var.e) && l8.a(this.f, e1Var.f) && l8.a(this.h, e1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder q10 = j3.r0.q("AppParcelable{title='", this.b, "', developerName='", this.d, "', formattedPrice='");
        q10.append(this.e);
        q10.append("', starRating=");
        q10.append(this.f);
        q10.append(", wearDetails=");
        j3.r0.A(q10, valueOf, ", deepLinkUri='", this.a, "', icon=");
        return aa.d.r(q10, valueOf2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.a);
        p8.l(parcel, 2, this.b);
        p8.k(parcel, 3, this.c, i9);
        p8.l(parcel, 4, this.d);
        p8.l(parcel, 5, this.e);
        p8.e(parcel, 6, this.f);
        p8.k(parcel, 7, this.h, i9);
        p8.r(parcel, q10);
    }
}
