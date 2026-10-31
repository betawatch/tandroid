package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public final String w;
    public final String x;
    public final long y;
    public static final g6.b D = new g6.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new v(10);

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j10, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.a = mediaInfo;
        this.b = nVar;
        this.c = bool;
        this.d = j10;
        this.e = d;
        this.f = jArr;
        this.n = jSONObject;
        this.r = str;
        this.s = str2;
        this.w = str3;
        this.x = str4;
        this.y = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return u6.c.a(this.n, kVar.n) && n6.l.k(this.a, kVar.a) && n6.l.k(this.b, kVar.b) && n6.l.k(this.c, kVar.c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f, kVar.f) && n6.l.k(this.r, kVar.r) && n6.l.k(this.s, kVar.s) && n6.l.k(this.w, kVar.w) && n6.l.k(this.x, kVar.x) && this.y == kVar.y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, String.valueOf(this.n), this.r, this.s, this.w, this.x, Long.valueOf(this.y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.n;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 2, this.a, i10);
        h0.k(parcel, 3, this.b, i10);
        h0.a(parcel, 4, this.c);
        h0.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        h0.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        h0.j(parcel, 7, this.f);
        h0.l(parcel, 8, this.h);
        h0.l(parcel, 9, this.r);
        h0.l(parcel, 10, this.s);
        h0.l(parcel, 11, this.w);
        h0.l(parcel, 12, this.x);
        h0.s(parcel, 13, 8);
        parcel.writeLong(this.y);
        h0.r(parcel, q6);
    }
}
