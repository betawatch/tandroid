package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c6.v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import o6.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import u6.c;
import w7.e0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class MediaTrack extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new v(16);
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int h;
    public final List n;
    public String r;
    public final JSONObject s;

    public MediaTrack(long j3, int i10, String str, String str2, String str3, String str4, int i11, List list, JSONObject jSONObject) {
        this.a = j3;
        this.b = i10;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.h = i11;
        this.n = list;
        this.s = jSONObject;
    }

    public final JSONObject b() {
        String str = this.f;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.a);
            int i10 = this.b;
            if (i10 == 1) {
                jSONObject.put(TeXSymbolParser.TYPE_ATTR, "TEXT");
            } else if (i10 == 2) {
                jSONObject.put(TeXSymbolParser.TYPE_ATTR, "AUDIO");
            } else if (i10 == 3) {
                jSONObject.put(TeXSymbolParser.TYPE_ATTR, "VIDEO");
            }
            String str2 = this.c;
            if (str2 != null) {
                jSONObject.put("trackContentId", str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                jSONObject.put("trackContentType", str3);
            }
            String str4 = this.e;
            if (str4 != null) {
                jSONObject.put("name", str4);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("language", str);
            }
            int i11 = this.h;
            if (i11 == 1) {
                jSONObject.put("subtype", "SUBTITLES");
            } else if (i11 == 2) {
                jSONObject.put("subtype", "CAPTIONS");
            } else if (i11 == 3) {
                jSONObject.put("subtype", "DESCRIPTIONS");
            } else if (i11 == 4) {
                jSONObject.put("subtype", "CHAPTERS");
            } else if (i11 == 5) {
                jSONObject.put("subtype", "METADATA");
            }
            List list = this.n;
            if (list != null) {
                jSONObject.put("roles", new JSONArray((Collection) list));
            }
            JSONObject jSONObject2 = this.s;
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
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.s;
        boolean z10 = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.s;
        if (z10 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || c.a(jSONObject, jSONObject2)) && this.a == mediaTrack.a && this.b == mediaTrack.b && g6.a.d(this.c, mediaTrack.c) && g6.a.d(this.d, mediaTrack.d) && g6.a.d(this.e, mediaTrack.e) && g6.a.d(this.f, mediaTrack.f) && this.h == mediaTrack.h && g6.a.d(this.n, mediaTrack.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(this.h), this.n, String.valueOf(this.s)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.s;
        this.r = jSONObject == null ? null : jSONObject.toString();
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        e0.l(parcel, 4, this.c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.e);
        e0.l(parcel, 7, this.f);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.h);
        e0.n(parcel, 9, this.n);
        e0.l(parcel, 10, this.r);
        e0.r(parcel, q6);
    }
}
