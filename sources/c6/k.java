package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k extends o6.a {
    public final MediaInfo a;
    public final n b;
    public final Boolean c;
    public final long d;
    public final double e;
    public final long[] f;
    public String h;
    public final JSONObject n;
    public final String r;
    public final String s;
    public final String v;
    public final String w;
    public final long x;
    public static final g6.b y = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j3, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j10) {
        this.a = mediaInfo;
        this.b = nVar;
        this.c = bool;
        this.d = j3;
        this.e = d;
        this.f = jArr;
        this.n = jSONObject;
        this.r = str;
        this.s = str2;
        this.v = str3;
        this.w = str4;
        this.x = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return u6.c.a(this.n, kVar.n) && n6.l.l(this.a, kVar.a) && n6.l.l(this.b, kVar.b) && n6.l.l(this.c, kVar.c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f, kVar.f) && n6.l.l(this.r, kVar.r) && n6.l.l(this.s, kVar.s) && n6.l.l(this.v, kVar.v) && n6.l.l(this.w, kVar.w) && this.x == kVar.x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, String.valueOf(this.n), this.r, this.s, this.v, this.w, Long.valueOf(this.x)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.n;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.a, i10);
        w7.e0.k(parcel, 3, this.b, i10);
        w7.e0.a(parcel, 4, this.c);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        w7.e0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        w7.e0.j(parcel, 7, this.f);
        w7.e0.l(parcel, 8, this.h);
        w7.e0.l(parcel, 9, this.r);
        w7.e0.l(parcel, 10, this.s);
        w7.e0.l(parcel, 11, this.v);
        w7.e0.l(parcel, 12, this.w);
        w7.e0.s(parcel, 13, 8);
        parcel.writeLong(this.x);
        w7.e0.r(parcel, q6);
    }
}
