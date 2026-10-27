package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k extends p6.a {
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
    public static final h6.b y = new h6.b("MediaLoadRequestData", null);
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
        return v6.c.a(this.n, kVar.n) && o6.l.l(this.a, kVar.a) && o6.l.l(this.b, kVar.b) && o6.l.l(this.c, kVar.c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f, kVar.f) && o6.l.l(this.r, kVar.r) && o6.l.l(this.s, kVar.s) && o6.l.l(this.v, kVar.v) && o6.l.l(this.w, kVar.w) && this.x == kVar.x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, String.valueOf(this.n), this.r, this.s, this.v, this.w, Long.valueOf(this.x)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.n;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.a, i10);
        df.k(parcel, 3, this.b, i10);
        df.a(parcel, 4, this.c);
        df.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        df.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        df.j(parcel, 7, this.f);
        df.l(parcel, 8, this.h);
        df.l(parcel, 9, this.r);
        df.l(parcel, 10, this.s);
        df.l(parcel, 11, this.v);
        df.l(parcel, 12, this.w);
        df.s(parcel, 13, 8);
        parcel.writeLong(this.x);
        df.r(parcel, q5);
    }
}
