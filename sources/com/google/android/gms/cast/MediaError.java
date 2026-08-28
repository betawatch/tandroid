package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.p8;
import m5.v;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class MediaError extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaError> CREATOR = new v(6);
    public final String a;
    public final long b;
    public final Integer c;
    public final String d;
    public String e;
    public final JSONObject f;

    public MediaError(String str, long j10, Integer num, String str2, JSONObject jSONObject) {
        this.a = str;
        this.b = j10;
        this.c = num;
        this.d = str2;
        this.f = jSONObject;
    }

    public static MediaError b(JSONObject jSONObject) {
        return new MediaError(jSONObject.optString(TeXSymbolParser.TYPE_ATTR, "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, q5.a.a("reason", jSONObject), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        JSONObject jSONObject = this.f;
        this.e = jSONObject == null ? null : jSONObject.toString();
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        p8.i(parcel, 4, this.c);
        p8.l(parcel, 5, this.d);
        p8.l(parcel, 6, this.e);
        p8.r(parcel, q10);
    }
}
