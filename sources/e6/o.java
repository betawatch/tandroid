package e6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o extends q6.a {
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

    public o(MediaInfo mediaInfo, int i3, boolean z10, double d, double d10, double d11, long[] jArr, String str) {
        this.a = mediaInfo;
        this.b = i3;
        this.c = z10;
        this.d = d;
        this.e = d10;
        this.f = d11;
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
        int i3;
        boolean z12 = false;
        if (jSONObject.has("media")) {
            this.a = new MediaInfo(jSONObject.getJSONObject("media"));
            z10 = true;
        } else {
            z10 = false;
        }
        if (jSONObject.has("itemId") && this.b != (i3 = jSONObject.getInt("itemId"))) {
            this.b = i3;
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
            double d10 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d10 - this.f) > 1.0E-7d) {
                this.f = d10;
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
            int i3 = this.b;
            if (i3 != 0) {
                jSONObject.put("itemId", i3);
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
        return (jSONObject == null || jSONObject2 == null || w6.c.a(jSONObject, jSONObject2)) && i6.a.d(this.a, oVar.a) && this.b == oVar.b && this.c == oVar.c && ((Double.isNaN(this.d) && Double.isNaN(oVar.d)) || this.d == oVar.d) && this.e == oVar.e && this.f == oVar.f && Arrays.equals(this.h, oVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), Double.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.f), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.r)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        JSONObject jSONObject = this.r;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.a, i3);
        int i10 = this.b;
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(i10);
        boolean z10 = this.c;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        double d = this.d;
        j8.a.r(parcel, 5, 8);
        parcel.writeDouble(d);
        double d10 = this.e;
        j8.a.r(parcel, 6, 8);
        parcel.writeDouble(d10);
        double d11 = this.f;
        j8.a.r(parcel, 7, 8);
        parcel.writeDouble(d11);
        j8.a.k(parcel, 8, this.h);
        j8.a.m(parcel, 9, this.n);
        j8.a.t(parcel, s6);
    }

    public o(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        b(jSONObject);
    }
}
