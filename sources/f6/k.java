package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
    public static final j6.b E = new j6.b("MediaLoadRequestData", null);
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
        return x6.c.a(this.n, kVar.n) && q6.m.l(this.a, kVar.a) && q6.m.l(this.b, kVar.b) && q6.m.l(this.c, kVar.c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f, kVar.f) && q6.m.l(this.r, kVar.r) && q6.m.l(this.s, kVar.s) && q6.m.l(this.w, kVar.w) && q6.m.l(this.x, kVar.x) && this.y == kVar.y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, String.valueOf(this.n), this.r, this.s, this.w, this.x, Long.valueOf(this.y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        JSONObject jSONObject = this.n;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.a, i7);
        cc.k(parcel, 3, this.b, i7);
        cc.a(parcel, 4, this.c);
        cc.q(parcel, 5, 8);
        parcel.writeLong(this.d);
        cc.q(parcel, 6, 8);
        parcel.writeDouble(this.e);
        cc.j(parcel, 7, this.f);
        cc.l(parcel, 8, this.h);
        cc.l(parcel, 9, this.r);
        cc.l(parcel, 10, this.s);
        cc.l(parcel, 11, this.w);
        cc.l(parcel, 12, this.x);
        cc.q(parcel, 13, 8);
        parcel.writeLong(this.y);
        cc.s(parcel, r10);
    }
}
