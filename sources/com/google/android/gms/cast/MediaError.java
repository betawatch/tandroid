package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import c6.v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import o6.a;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public class MediaError extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaError> CREATOR = new v(6);
    public final String a;
    public final long b;
    public final Integer c;
    public final String d;
    public String e;
    public final JSONObject f;

    public MediaError(String str, long j3, Integer num, String str2, JSONObject jSONObject) {
        this.a = str;
        this.b = j3;
        this.c = num;
        this.d = str2;
        this.f = jSONObject;
    }

    public static MediaError b(JSONObject jSONObject) {
        return new MediaError(jSONObject.optString(TeXSymbolParser.TYPE_ATTR, "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, g6.a.a("reason", jSONObject), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f;
        this.e = jSONObject == null ? null : jSONObject.toString();
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.a);
        g0.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        g0.i(parcel, 4, this.c);
        g0.l(parcel, 5, this.d);
        g0.l(parcel, 6, this.e);
        g0.r(parcel, q6);
    }
}
