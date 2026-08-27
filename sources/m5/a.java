package m5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import h7.r8;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new w(0);
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
    public final String v;
    public final u w;
    public final JSONObject x;

    public a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, u uVar) {
        this.a = str;
        this.b = str2;
        this.c = j10;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.h = str6;
        this.n = str7;
        this.r = str8;
        this.s = j11;
        this.v = str9;
        this.w = uVar;
        if (TextUtils.isEmpty(str6)) {
            this.x = new JSONObject();
            return;
        }
        try {
            this.x = new JSONObject(str6);
        } catch (JSONException e9) {
            Locale locale = Locale.ROOT;
            Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + e9.getMessage());
            this.h = null;
            this.x = new JSONObject();
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.a);
            long j10 = this.c;
            Pattern pattern = r5.a.a;
            jSONObject.put("duration", j10 / 1000.0d);
            long j11 = this.s;
            if (j11 != -1) {
                jSONObject.put("whenSkippable", j11 / 1000.0d);
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
            JSONObject jSONObject2 = this.x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            u uVar = this.w;
            if (uVar != null) {
                jSONObject.put("vastAdsRequest", uVar.b());
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
        return r5.a.d(this.a, aVar.a) && r5.a.d(this.b, aVar.b) && this.c == aVar.c && r5.a.d(this.d, aVar.d) && r5.a.d(this.e, aVar.e) && r5.a.d(this.f, aVar.f) && r5.a.d(this.h, aVar.h) && r5.a.d(this.n, aVar.n) && r5.a.d(this.r, aVar.r) && this.s == aVar.s && r5.a.d(this.v, aVar.v) && r5.a.d(this.w, aVar.w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.h, this.n, this.r, Long.valueOf(this.s), this.v, this.w});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.a);
        r8.l(parcel, 3, this.b);
        r8.s(parcel, 4, 8);
        parcel.writeLong(this.c);
        r8.l(parcel, 5, this.d);
        r8.l(parcel, 6, this.e);
        r8.l(parcel, 7, this.f);
        r8.l(parcel, 8, this.h);
        r8.l(parcel, 9, this.n);
        r8.l(parcel, 10, this.r);
        r8.s(parcel, 11, 8);
        parcel.writeLong(this.s);
        r8.l(parcel, 12, this.v);
        r8.k(parcel, 13, this.w, i10);
        r8.r(parcel, q6);
    }
}
