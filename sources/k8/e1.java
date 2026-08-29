package k8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.e9;
import java.util.Arrays;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e1 extends a6.a {
    public static final Parcelable.Creator<e1> CREATOR = new p0(10);
    public final String a;
    public final String b;
    public final c1 c;
    public final String d;
    public final String e;
    public final Float f;
    public final g1 h;

    public e1(String str, String str2, c1 c1Var, String str3, String str4, Float f9, g1 g1Var) {
        this.a = str;
        this.b = str2;
        this.c = c1Var;
        this.d = str3;
        this.e = str4;
        this.f = f9;
        this.h = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (e9.b(this.a, e1Var.a) && e9.b(this.b, e1Var.b) && e9.b(this.c, e1Var.c) && e9.b(this.d, e1Var.d) && e9.b(this.e, e1Var.e) && e9.b(this.f, e1Var.f) && e9.b(this.h, e1Var.h)) {
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
        StringBuilder k9 = th.k("AppParcelable{title='", this.b, "', developerName='", this.d, "', formattedPrice='");
        k9.append(this.e);
        k9.append("', starRating=");
        k9.append(this.f);
        k9.append(", wearDetails=");
        th.w(k9, valueOf, ", deepLinkUri='", this.a, "', icon=");
        return a4.w.q(k9, valueOf2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 1, this.a);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.b);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.c, i10);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.d);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.e);
        com.google.android.gms.internal.cast.o.e(parcel, 6, this.f);
        com.google.android.gms.internal.cast.o.k(parcel, 7, this.h, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
