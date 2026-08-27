package m5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import h7.r8;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k extends z5.a {
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
    public static final r5.b y = new r5.b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<k> CREATOR = new w(10);

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
        return f6.c.a(this.n, kVar.n) && y5.l.l(this.a, kVar.a) && y5.l.l(this.b, kVar.b) && y5.l.l(this.c, kVar.c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f, kVar.f) && y5.l.l(this.r, kVar.r) && y5.l.l(this.s, kVar.s) && y5.l.l(this.v, kVar.v) && y5.l.l(this.w, kVar.w) && this.x == kVar.x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, String.valueOf(this.n), this.r, this.s, this.v, this.w, Long.valueOf(this.x)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.n;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int q6 = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.a, i10);
        r8.k(parcel, 3, this.b, i10);
        r8.a(parcel, 4, this.c);
        r8.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        r8.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        r8.j(parcel, 7, this.f);
        r8.l(parcel, 8, this.h);
        r8.l(parcel, 9, this.r);
        r8.l(parcel, 10, this.s);
        r8.l(parcel, 11, this.v);
        r8.l(parcel, 12, this.w);
        r8.s(parcel, 13, 8);
        parcel.writeLong(this.x);
        r8.r(parcel, q6);
    }
}
