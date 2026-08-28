package m5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import g7.p8;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o extends y5.a {
    public static final Parcelable.Creator<o> CREATOR = new v(14);
    public MediaInfo a;
    public int b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public long[] h;
    public String n;
    public JSONObject r;

    public o(MediaInfo mediaInfo, int i9, boolean z10, double d, double d9, double d10, long[] jArr, String str) {
        this.a = mediaInfo;
        this.b = i9;
        this.c = z10;
        this.d = d;
        this.e = d9;
        this.f = d10;
        this.h = jArr;
        this.n = str;
        if (str == null) {
            this.r = null;
            return;
        }
        try {
            this.r = new JSONObject(this.n);
        } catch (JSONException unused) {
            this.r = null;
            this.n = null;
        }
    }

    public final boolean b(JSONObject jSONObject) {
        boolean z10;
        long[] jArr;
        boolean z11;
        int i9;
        boolean z12 = false;
        if (jSONObject.has("media")) {
            this.a = new MediaInfo(jSONObject.getJSONObject("media"));
            z10 = true;
        } else {
            z10 = false;
        }
        if (jSONObject.has("itemId") && this.b != (i9 = jSONObject.getInt("itemId"))) {
            this.b = i9;
            z10 = true;
        }
        if (jSONObject.has("autoplay") && this.c != (z11 = jSONObject.getBoolean("autoplay"))) {
            this.c = z11;
            z10 = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.d) > 1.0E-7d)) {
            this.d = optDouble;
            z10 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.e) > 1.0E-7d) {
                this.e = d;
                z10 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d9 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d9 - this.f) > 1.0E-7d) {
                this.f = d9;
                z10 = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArray.getLong(i10);
            }
            long[] jArr2 = this.h;
            if (jArr2 != null && jArr2.length == length) {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.h[i11] == jArr[i11]) {
                    }
                }
            }
            z12 = true;
            break;
        } else {
            jArr = null;
        }
        if (z12) {
            this.h = jArr;
            z10 = true;
        }
        if (!jSONObject.has("customData")) {
            return z10;
        }
        this.r = jSONObject.getJSONObject("customData");
        return true;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.a;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.b());
            }
            int i9 = this.b;
            if (i9 != 0) {
                jSONObject.put("itemId", i9);
            }
            jSONObject.put("autoplay", this.c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            double d = this.e;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f);
            if (this.h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j10 : this.h) {
                    jSONArray.put(j10);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.r;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        JSONObject jSONObject = this.r;
        boolean z10 = jSONObject == null;
        JSONObject jSONObject2 = oVar.r;
        if (z10 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || e6.c.a(jSONObject, jSONObject2)) && q5.a.d(this.a, oVar.a) && this.b == oVar.b && this.c == oVar.c && ((Double.isNaN(this.d) && Double.isNaN(oVar.d)) || this.d == oVar.d) && this.e == oVar.e && this.f == oVar.f && Arrays.equals(this.h, oVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), Double.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.f), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.r)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        JSONObject jSONObject = this.r;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.a, i9);
        int i10 = this.b;
        p8.s(parcel, 3, 4);
        parcel.writeInt(i10);
        boolean z10 = this.c;
        p8.s(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        double d = this.d;
        p8.s(parcel, 5, 8);
        parcel.writeDouble(d);
        double d9 = this.e;
        p8.s(parcel, 6, 8);
        parcel.writeDouble(d9);
        double d10 = this.f;
        p8.s(parcel, 7, 8);
        parcel.writeDouble(d10);
        p8.j(parcel, 8, this.h);
        p8.l(parcel, 9, this.n);
        p8.r(parcel, q10);
    }

    public o(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        b(jSONObject);
    }
}
