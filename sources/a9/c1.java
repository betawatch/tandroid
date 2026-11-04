package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c1 extends q6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String a;
    public final String b;
    public final a1 c;
    public final String d;
    public final String e;
    public final Float f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f10, e1 e1Var) {
        this.a = str;
        this.b = str2;
        this.c = a1Var;
        this.d = str3;
        this.e = str4;
        this.f = f10;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (a5.a.b(this.a, c1Var.a) && a5.a.b(this.b, c1Var.b) && a5.a.b(this.c, c1Var.c) && a5.a.b(this.d, c1Var.d) && a5.a.b(this.e, c1Var.e) && a5.a.b(this.f, c1Var.f) && a5.a.b(this.h, c1Var.h)) {
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
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("AppParcelable{title='", this.b, "', developerName='", this.d, "', formattedPrice='");
        n4.append(this.e);
        n4.append("', starRating=");
        n4.append(this.f);
        n4.append(", wearDetails=");
        com.google.android.recaptcha.internal.a.s(n4, valueOf, ", deepLinkUri='", this.a, "', icon=");
        return a1.g.s(n4, valueOf2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.a);
        j8.a.m(parcel, 2, this.b);
        j8.a.l(parcel, 3, this.c, i3);
        j8.a.m(parcel, 4, this.d);
        j8.a.m(parcel, 5, this.e);
        j8.a.f(parcel, 6, this.f);
        j8.a.l(parcel, 7, this.h, i3);
        j8.a.t(parcel, s6);
    }
}
