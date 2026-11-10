package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c8.xb;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String h;
    public final String n;
    public final String r;
    public final long s;
    public final String w;
    public final t x;
    public final JSONObject y;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.a = str;
        this.b = str2;
        this.c = j3;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.h = str6;
        this.n = str7;
        this.r = str8;
        this.s = j10;
        this.w = str9;
        this.x = tVar;
        if (TextUtils.isEmpty(str6)) {
            this.y = new JSONObject();
            return;
        }
        try {
            this.y = new JSONObject(str6);
        } catch (JSONException e10) {
            Locale locale = Locale.ROOT;
            Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + e10.getMessage());
            this.h = null;
            this.y = new JSONObject();
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.a);
            long j3 = this.c;
            Pattern pattern = j6.a.a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.w;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.x;
            if (tVar != null) {
                jSONObject.put("vastAdsRequest", tVar.b());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j6.a.d(this.a, aVar.a) && j6.a.d(this.b, aVar.b) && this.c == aVar.c && j6.a.d(this.d, aVar.d) && j6.a.d(this.e, aVar.e) && j6.a.d(this.f, aVar.f) && j6.a.d(this.h, aVar.h) && j6.a.d(this.n, aVar.n) && j6.a.d(this.r, aVar.r) && this.s == aVar.s && j6.a.d(this.w, aVar.w) && j6.a.d(this.x, aVar.x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.h, this.n, this.r, Long.valueOf(this.s), this.w, this.x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.l(parcel, 3, this.b);
        xb.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.e);
        xb.l(parcel, 7, this.f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.n);
        xb.l(parcel, 10, this.r);
        xb.q(parcel, 11, 8);
        parcel.writeLong(this.s);
        xb.l(parcel, 12, this.w);
        xb.k(parcel, 13, this.x, i7);
        xb.s(parcel, r10);
    }
}
