package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import c6.v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import o6.a;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        return new MediaError(jSONObject.optString(TeXSymbolParser.TYPE_ATTR, "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, g6.a.a("reason", jSONObject), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f;
        this.e = jSONObject == null ? null : jSONObject.toString();
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.a);
        h0.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        h0.i(parcel, 4, this.c);
        h0.l(parcel, 5, this.d);
        h0.l(parcel, 6, this.e);
        h0.r(parcel, q6);
    }
}
