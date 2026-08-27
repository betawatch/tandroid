package h5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import n6.u;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g extends z5.a {
    public static final Parcelable.Creator<g> CREATOR = new h(5);
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
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.a);
        r8.l(parcel, 2, this.b);
        r8.l(parcel, 3, this.c);
        r8.l(parcel, 4, this.d);
        r8.k(parcel, 5, this.e, i10);
        r8.l(parcel, 6, this.f);
        r8.l(parcel, 7, this.h);
        r8.l(parcel, 8, this.n);
        r8.k(parcel, 9, this.r, i10);
        r8.r(parcel, q6);
    }
}
