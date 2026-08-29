package j5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;
import o6.u;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g extends a6.a {
    public static final Parcelable.Creator<g> CREATOR = new i4.g(18);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String h;
    public final String n;
    public final u r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.h = str6;
        this.n = str7;
        this.r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.l(this.a, gVar.a) && l.l(this.b, gVar.b) && l.l(this.c, gVar.c) && l.l(this.d, gVar.d) && l.l(this.e, gVar.e) && l.l(this.f, gVar.f) && l.l(this.h, gVar.h) && l.l(this.n, gVar.n) && l.l(this.r, gVar.r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 1, this.a);
        o.l(parcel, 2, this.b);
        o.l(parcel, 3, this.c);
        o.l(parcel, 4, this.d);
        o.k(parcel, 5, this.e, i10);
        o.l(parcel, 6, this.f);
        o.l(parcel, 7, this.h);
        o.l(parcel, 8, this.n);
        o.k(parcel, 9, this.r, i10);
        o.r(parcel, q6);
    }
}
