package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 2, this.a, i7);
        wb.k(parcel, 3, this.b, i7);
        wb.a(parcel, 4, this.c);
        wb.q(parcel, 5, 8);
        parcel.writeLong(this.d);
        wb.q(parcel, 6, 8);
        parcel.writeDouble(this.e);
        wb.j(parcel, 7, this.f);
        wb.l(parcel, 8, this.h);
        wb.l(parcel, 9, this.r);
        wb.l(parcel, 10, this.s);
        wb.l(parcel, 11, this.w);
        wb.l(parcel, 12, this.x);
        wb.q(parcel, 13, 8);
        parcel.writeLong(this.y);
        wb.s(parcel, r10);
    }
}
