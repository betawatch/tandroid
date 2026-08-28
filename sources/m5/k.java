package m5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import g7.p8;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k extends y5.a {
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
    public static final q5.b y = new q5.b("MediaLoadRequestData", null);
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
        this.v = str3;
        this.w = str4;
        this.x = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return e6.c.a(this.n, kVar.n) && x5.l.l(this.a, kVar.a) && x5.l.l(this.b, kVar.b) && x5.l.l(this.c, kVar.c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f, kVar.f) && x5.l.l(this.r, kVar.r) && x5.l.l(this.s, kVar.s) && x5.l.l(this.v, kVar.v) && x5.l.l(this.w, kVar.w) && this.x == kVar.x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, String.valueOf(this.n), this.r, this.s, this.v, this.w, Long.valueOf(this.x)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        JSONObject jSONObject = this.n;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.a, i9);
        p8.k(parcel, 3, this.b, i9);
        p8.a(parcel, 4, this.c);
        p8.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        p8.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        p8.j(parcel, 7, this.f);
        p8.l(parcel, 8, this.h);
        p8.l(parcel, 9, this.r);
        p8.l(parcel, 10, this.s);
        p8.l(parcel, 11, this.v);
        p8.l(parcel, 12, this.w);
        p8.s(parcel, 13, 8);
        parcel.writeLong(this.x);
        p8.r(parcel, q10);
    }
}
