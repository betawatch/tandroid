package com.google.android.gms.cast;

import a6.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.o;
import o5.v;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        return new MediaError(jSONObject.optString(TeXSymbolParser.TYPE_ATTR, "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, s5.a.a("reason", jSONObject), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f;
        this.e = jSONObject == null ? null : jSONObject.toString();
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.a);
        o.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        o.i(parcel, 4, this.c);
        o.l(parcel, 5, this.d);
        o.l(parcel, 6, this.e);
        o.r(parcel, q6);
    }
}
