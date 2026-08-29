package o5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k extends a6.a {
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
    public static final s5.b y = new s5.b("MediaLoadRequestData", null);
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
        return g6.c.a(this.n, kVar.n) && z5.l.l(this.a, kVar.a) && z5.l.l(this.b, kVar.b) && z5.l.l(this.c, kVar.c) && this.d == kVar.d && this.e == kVar.e && Arrays.equals(this.f, kVar.f) && z5.l.l(this.r, kVar.r) && z5.l.l(this.s, kVar.s) && z5.l.l(this.v, kVar.v) && z5.l.l(this.w, kVar.w) && this.x == kVar.x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, String.valueOf(this.n), this.r, this.s, this.v, this.w, Long.valueOf(this.x)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.n;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.a, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.b, i10);
        com.google.android.gms.internal.cast.o.a(parcel, 4, this.c);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 8);
        parcel.writeLong(this.d);
        com.google.android.gms.internal.cast.o.s(parcel, 6, 8);
        parcel.writeDouble(this.e);
        com.google.android.gms.internal.cast.o.j(parcel, 7, this.f);
        com.google.android.gms.internal.cast.o.l(parcel, 8, this.h);
        com.google.android.gms.internal.cast.o.l(parcel, 9, this.r);
        com.google.android.gms.internal.cast.o.l(parcel, 10, this.s);
        com.google.android.gms.internal.cast.o.l(parcel, 11, this.v);
        com.google.android.gms.internal.cast.o.l(parcel, 12, this.w);
        com.google.android.gms.internal.cast.o.s(parcel, 13, 8);
        parcel.writeLong(this.x);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
