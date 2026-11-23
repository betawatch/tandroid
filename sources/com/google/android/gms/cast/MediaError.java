package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f6.v;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import r6.a;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.a);
        cc.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        cc.i(parcel, 4, this.c);
        cc.l(parcel, 5, this.d);
        cc.l(parcel, 6, this.e);
        cc.s(parcel, r10);
    }
}
