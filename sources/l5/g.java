package l5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.g5;
import java.util.Arrays;
import l4.j;
import q6.u;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new j(7);
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
        m.h(str);
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
        return m.l(this.a, gVar.a) && m.l(this.b, gVar.b) && m.l(this.c, gVar.c) && m.l(this.d, gVar.d) && m.l(this.e, gVar.e) && m.l(this.f, gVar.f) && m.l(this.h, gVar.h) && m.l(this.n, gVar.n) && m.l(this.r, gVar.r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.a);
        g5.l(parcel, 2, this.b);
        g5.l(parcel, 3, this.c);
        g5.l(parcel, 4, this.d);
        g5.k(parcel, 5, this.e, i10);
        g5.l(parcel, 6, this.f);
        g5.l(parcel, 7, this.h);
        g5.l(parcel, 8, this.n);
        g5.k(parcel, 9, this.r, i10);
        g5.r(parcel, q10);
    }
}
