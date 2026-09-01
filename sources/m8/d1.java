package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class d1 extends c6.a {
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
            if (k7.q.a(this.a, d1Var.a) && k7.q.a(this.b, d1Var.b) && k7.q.a(this.c, d1Var.c) && k7.q.a(this.d, d1Var.d) && k7.q.a(this.e, d1Var.e) && k7.q.a(this.f, d1Var.f) && k7.q.a(this.h, d1Var.h)) {
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
        StringBuilder m9 = yh.m("AppParcelable{title='", this.b, "', developerName='", this.d, "', formattedPrice='");
        m9.append(this.e);
        m9.append("', starRating=");
        m9.append(this.f);
        m9.append(", wearDetails=");
        yh.w(m9, valueOf, ", deepLinkUri='", this.a, "', icon=");
        return android.support.v4.media.a.r(m9, valueOf2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.a);
        g5.l(parcel, 2, this.b);
        g5.k(parcel, 3, this.c, i10);
        g5.l(parcel, 4, this.d);
        g5.l(parcel, 5, this.e);
        g5.e(parcel, 6, this.f);
        g5.k(parcel, 7, this.h, i10);
        g5.r(parcel, q10);
    }
}
