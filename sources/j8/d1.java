package j8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.n8;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d1 extends z5.a {
    public static final Parcelable.Creator<d1> CREATOR = new o0(10);
    public final String a;
    public final String b;
    public final b1 c;
    public final String d;
    public final String e;
    public final Float f;
    public final f1 h;

    public d1(String str, String str2, b1 b1Var, String str3, String str4, Float f10, f1 f1Var) {
        this.a = str;
        this.b = str2;
        this.c = b1Var;
        this.d = str3;
        this.e = str4;
        this.f = f10;
        this.h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (n8.a(this.a, d1Var.a) && n8.a(this.b, d1Var.b) && n8.a(this.c, d1Var.c) && n8.a(this.d, d1Var.d) && n8.a(this.e, d1Var.e) && n8.a(this.f, d1Var.f) && n8.a(this.h, d1Var.h)) {
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
        StringBuilder p6 = i0.a.p("AppParcelable{title='", this.b, "', developerName='", this.d, "', formattedPrice='");
        p6.append(this.e);
        p6.append("', starRating=");
        p6.append(this.f);
        p6.append(", wearDetails=");
        i0.a.z(p6, valueOf, ", deepLinkUri='", this.a, "', icon=");
        return a9.p.p(p6, valueOf2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.a);
        r8.l(parcel, 2, this.b);
        r8.k(parcel, 3, this.c, i10);
        r8.l(parcel, 4, this.d);
        r8.l(parcel, 5, this.e);
        r8.e(parcel, 6, this.f);
        r8.k(parcel, 7, this.h, i10);
        r8.r(parcel, q6);
    }
}
