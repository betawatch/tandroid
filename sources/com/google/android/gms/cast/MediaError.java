package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f6.v;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import r6.a;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        return new MediaError(jSONObject.optString(TeXSymbolParser.TYPE_ATTR, "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, j6.a.a("reason", jSONObject), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        JSONObject jSONObject = this.f;
        this.e = jSONObject == null ? null : jSONObject.toString();
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.a);
        wb.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        wb.i(parcel, 4, this.c);
        wb.l(parcel, 5, this.d);
        wb.l(parcel, 6, this.e);
        wb.s(parcel, r10);
    }
}
