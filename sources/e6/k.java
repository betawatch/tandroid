package e6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k extends q6.a {
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
    public static final i6.b E = new i6.b("MediaLoadRequestData", null);
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
        return w6.c.a(this.n, kVar.n) && p6.m.k(this.a, kVar.a) && p6.m.k(this.b, kVar.b) && p6.m.k(this.c, kVar.c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f, kVar.f) && p6.m.k(this.r, kVar.r) && p6.m.k(this.s, kVar.s) && p6.m.k(this.w, kVar.w) && p6.m.k(this.x, kVar.x) && this.y == kVar.y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, String.valueOf(this.n), this.r, this.s, this.w, this.x, Long.valueOf(this.y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        JSONObject jSONObject = this.n;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.a, i3);
        j8.a.l(parcel, 3, this.b, i3);
        j8.a.b(parcel, 4, this.c);
        j8.a.r(parcel, 5, 8);
        parcel.writeLong(this.d);
        j8.a.r(parcel, 6, 8);
        parcel.writeDouble(this.e);
        j8.a.k(parcel, 7, this.f);
        j8.a.m(parcel, 8, this.h);
        j8.a.m(parcel, 9, this.r);
        j8.a.m(parcel, 10, this.s);
        j8.a.m(parcel, 11, this.w);
        j8.a.m(parcel, 12, this.x);
        j8.a.r(parcel, 13, 8);
        parcel.writeLong(this.y);
        j8.a.t(parcel, s6);
    }
}
