package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class k extends r6.a {
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
    public static final j6.b D = new j6.b("MediaLoadRequestData", null);
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
        this.w = str3;
        this.x = str4;
        this.y = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return x6.c.a(this.n, kVar.n) && q6.m.k(this.a, kVar.a) && q6.m.k(this.b, kVar.b) && q6.m.k(this.c, kVar.c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f, kVar.f) && q6.m.k(this.r, kVar.r) && q6.m.k(this.s, kVar.s) && q6.m.k(this.w, kVar.w) && q6.m.k(this.x, kVar.x) && this.y == kVar.y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, String.valueOf(this.n), this.r, this.s, this.w, this.x, Long.valueOf(this.y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        JSONObject jSONObject = this.n;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.a, i7);
        xb.k(parcel, 3, this.b, i7);
        xb.a(parcel, 4, this.c);
        xb.q(parcel, 5, 8);
        parcel.writeLong(this.d);
        xb.q(parcel, 6, 8);
        parcel.writeDouble(this.e);
        xb.j(parcel, 7, this.f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.r);
        xb.l(parcel, 10, this.s);
        xb.l(parcel, 11, this.w);
        xb.l(parcel, 12, this.x);
        xb.q(parcel, 13, 8);
        parcel.writeLong(this.y);
        xb.s(parcel, r10);
    }
}
