package a6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import f7.u;
import java.util.Arrays;
import q6.m;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new w.a(7);
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
        m.g(str);
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
        return m.k(this.a, gVar.a) && m.k(this.b, gVar.b) && m.k(this.c, gVar.c) && m.k(this.d, gVar.d) && m.k(this.e, gVar.e) && m.k(this.f, gVar.f) && m.k(this.h, gVar.h) && m.k(this.n, gVar.n) && m.k(this.r, gVar.r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.a);
        yb.l(parcel, 2, this.b);
        yb.l(parcel, 3, this.c);
        yb.l(parcel, 4, this.d);
        yb.k(parcel, 5, this.e, i7);
        yb.l(parcel, 6, this.f);
        yb.l(parcel, 7, this.h);
        yb.l(parcel, 8, this.n);
        yb.k(parcel, 9, this.r, i7);
        yb.s(parcel, r10);
    }
}
