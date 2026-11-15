package b9;

import a8.h7;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class d1 extends r6.a {
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
            if (h7.a(this.a, d1Var.a) && h7.a(this.b, d1Var.b) && h7.a(this.c, d1Var.c) && h7.a(this.d, d1Var.d) && h7.a(this.e, d1Var.e) && h7.a(this.f, d1Var.f) && h7.a(this.h, d1Var.h)) {
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
        StringBuilder n10 = e2.n("AppParcelable{title='", this.b, "', developerName='", this.d, "', formattedPrice='");
        n10.append(this.e);
        n10.append("', starRating=");
        n10.append(this.f);
        n10.append(", wearDetails=");
        e2.r(n10, valueOf, ", deepLinkUri='", this.a, "', icon=");
        return a8.p0.s(n10, valueOf2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.a);
        yb.l(parcel, 2, this.b);
        yb.k(parcel, 3, this.c, i7);
        yb.l(parcel, 4, this.d);
        yb.l(parcel, 5, this.e);
        yb.e(parcel, 6, this.f);
        yb.k(parcel, 7, this.h, i7);
        yb.s(parcel, r10);
    }
}
