package b9;

import a8.g7;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class c1 extends r6.a {
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
            if (g7.a(this.a, c1Var.a) && g7.a(this.b, c1Var.b) && g7.a(this.c, c1Var.c) && g7.a(this.d, c1Var.d) && g7.a(this.e, c1Var.e) && g7.a(this.f, c1Var.f) && g7.a(this.h, c1Var.h)) {
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
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("AppParcelable{title='", this.b, "', developerName='", this.d, "', formattedPrice='");
        n10.append(this.e);
        n10.append("', starRating=");
        n10.append(this.f);
        n10.append(", wearDetails=");
        com.google.android.recaptcha.internal.a.s(n10, valueOf, ", deepLinkUri='", this.a, "', icon=");
        return a8.p0.s(n10, valueOf2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.a);
        xb.l(parcel, 2, this.b);
        xb.k(parcel, 3, this.c, i7);
        xb.l(parcel, 4, this.d);
        xb.l(parcel, 5, this.e);
        xb.e(parcel, 6, this.f);
        xb.k(parcel, 7, this.h, i7);
        xb.s(parcel, r10);
    }
}
