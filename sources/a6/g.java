package a6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import f7.u;
import java.util.Arrays;
import q6.m;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.a);
        cc.l(parcel, 2, this.b);
        cc.l(parcel, 3, this.c);
        cc.l(parcel, 4, this.d);
        cc.k(parcel, 5, this.e, i7);
        cc.l(parcel, 6, this.f);
        cc.l(parcel, 7, this.h);
        cc.l(parcel, 8, this.n);
        cc.k(parcel, 9, this.r, i7);
        cc.s(parcel, r10);
    }
}
