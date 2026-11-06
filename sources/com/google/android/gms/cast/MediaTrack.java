package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c8.wb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f6.v;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import r6.a;
import x6.c;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    public MediaTrack(long j3, int i7, String str, String str2, String str3, String str4, int i10, List list, JSONObject jSONObject) {
        this.a = j3;
        this.b = i7;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.h = i10;
        this.n = list;
        this.s = jSONObject;
    }

    public final JSONObject b() {
        String str = this.f;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.a);
            int i7 = this.b;
            if (i7 == 1) {
                jSONObject.put(TeXSymbolParser.TYPE_ATTR, "TEXT");
            } else if (i7 == 2) {
                jSONObject.put(TeXSymbolParser.TYPE_ATTR, "AUDIO");
            } else if (i7 == 3) {
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
            int i10 = this.h;
            if (i10 == 1) {
                jSONObject.put("subtype", "SUBTITLES");
            } else if (i10 == 2) {
                jSONObject.put("subtype", "CAPTIONS");
            } else if (i10 == 3) {
                jSONObject.put("subtype", "DESCRIPTIONS");
            } else if (i10 == 4) {
                jSONObject.put("subtype", "CHAPTERS");
            } else if (i10 == 5) {
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
        boolean z9 = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.s;
        if (z9 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || c.a(jSONObject, jSONObject2)) && this.a == mediaTrack.a && this.b == mediaTrack.b && j6.a.d(this.c, mediaTrack.c) && j6.a.d(this.d, mediaTrack.d) && j6.a.d(this.e, mediaTrack.e) && j6.a.d(this.f, mediaTrack.f) && this.h == mediaTrack.h && j6.a.d(this.n, mediaTrack.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(this.h), this.n, String.valueOf(this.s)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        JSONObject jSONObject = this.s;
        this.r = jSONObject == null ? null : jSONObject.toString();
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        wb.l(parcel, 4, this.c);
        wb.l(parcel, 5, this.d);
        wb.l(parcel, 6, this.e);
        wb.l(parcel, 7, this.f);
        wb.q(parcel, 8, 4);
        parcel.writeInt(this.h);
        wb.n(parcel, 9, this.n);
        wb.l(parcel, 10, this.r);
        wb.s(parcel, r10);
    }
}
