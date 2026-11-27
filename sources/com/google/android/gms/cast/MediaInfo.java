package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class MediaInfo extends c4 implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR;
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final JSONObject I;
    public final String a;
    public final int b;
    public final String c;
    public final mt6 d;
    public final long e;
    public final ArrayList f;
    public final tmb h;
    public String n;
    public ArrayList r;
    public ArrayList s;
    public final String w;
    public final ddc x;
    public final long y;

    static {
        Pattern pattern = qd1.a;
        CREATOR = new ced((byte) 29);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0311  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaInfo(JSONObject jSONObject) {
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        char c;
        double d;
        int i;
        int i2;
        y9e y9eVar;
        String optString = jSONObject.optString("streamType", "NONE");
        int i3 = 2;
        int i4 = 1;
        int i5 = 0;
        if ("NONE".equals(optString)) {
            this.b = 0;
            c = 0;
        } else if ("BUFFERED".equals(optString)) {
            this.b = 1;
            c = 1;
        } else if ("LIVE".equals(optString)) {
            this.b = 2;
            c = 2;
        } else {
            this.b = -1;
            c = 65535;
        }
        this.c = qd1.a("contentType", jSONObject);
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            mt6 mt6Var = new mt6(jSONObject2.getInt("metadataType"));
            this.d = mt6Var;
            mt6Var.e(jSONObject2);
        }
        this.e = -1L;
        if (c != 2 && jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double optDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble) && optDouble >= 0.0d) {
                this.e = (long) (optDouble * 1000.0d);
            }
        }
        int i6 = 4;
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i7 = 0;
            d = 0.0d;
            while (i7 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i7);
                long j = jSONObject3.getLong("trackId");
                String optString2 = jSONObject3.optString(TeXSymbolParser.TYPE_ATTR);
                int i8 = "TEXT".equals(optString2) ? i4 : "AUDIO".equals(optString2) ? i3 : "VIDEO".equals(optString2) ? 3 : i5;
                String a = qd1.a("trackContentId", jSONObject3);
                String a2 = qd1.a("trackContentType", jSONObject3);
                String a3 = qd1.a("name", jSONObject3);
                String a4 = qd1.a("language", jSONObject3);
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    i2 = "SUBTITLES".equals(string) ? i4 : "CAPTIONS".equals(string) ? i3 : "DESCRIPTIONS".equals(string) ? 3 : "CHAPTERS".equals(string) ? i6 : "METADATA".equals(string) ? 5 : -1;
                } else {
                    i2 = i5;
                }
                if (jSONObject3.has("roles")) {
                    Object[] objArr = new Object[i6];
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    int i9 = i5;
                    int i10 = i9;
                    while (i9 < jSONArray2.length()) {
                        String optString3 = jSONArray2.optString(i9);
                        optString3.getClass();
                        int i11 = i10 + 1;
                        int length = objArr.length;
                        if (length < i11) {
                            objArr = Arrays.copyOf(objArr, p6f.a(length, i11));
                        }
                        objArr[i10] = optString3;
                        i9++;
                        i10 = i11;
                    }
                    y9eVar = k8e.z(i10, objArr);
                } else {
                    y9eVar = null;
                }
                arrayList.add(new MediaTrack(j, i8, a, a2, a3, a4, i2, y9eVar, jSONObject3.optJSONObject("customData")));
                i7++;
                i6 = 4;
                i3 = 2;
                i4 = 1;
                i5 = 0;
            }
            this.f = new ArrayList(arrayList);
        } else {
            d = 0.0d;
            this.f = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            tmb tmbVar = new tmb(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
            tmbVar.a = (float) jSONObject4.optDouble("fontScale", 1.0d);
            tmbVar.b = tmb.c(jSONObject4.optString("foregroundColor"));
            tmbVar.c = tmb.c(jSONObject4.optString("backgroundColor"));
            if (jSONObject4.has("edgeType")) {
                String string2 = jSONObject4.getString("edgeType");
                if ("NONE".equals(string2)) {
                    tmbVar.d = 0;
                } else if ("OUTLINE".equals(string2)) {
                    tmbVar.d = 1;
                } else if ("DROP_SHADOW".equals(string2)) {
                    tmbVar.d = 2;
                } else if ("RAISED".equals(string2)) {
                    tmbVar.d = 3;
                } else if ("DEPRESSED".equals(string2)) {
                    tmbVar.d = 4;
                }
            }
            tmbVar.e = tmb.c(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string3 = jSONObject4.getString("windowType");
                if ("NONE".equals(string3)) {
                    tmbVar.f = 0;
                } else if ("NORMAL".equals(string3)) {
                    tmbVar.f = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    i = 2;
                    tmbVar.f = 2;
                    tmbVar.h = tmb.c(jSONObject4.optString("windowColor"));
                    if (tmbVar.f == i) {
                        tmbVar.n = jSONObject4.optInt("windowRoundedCornerRadius", 0);
                    }
                    tmbVar.r = qd1.a("fontFamily", jSONObject4);
                    if (jSONObject4.has("fontGenericFamily")) {
                        String string4 = jSONObject4.getString("fontGenericFamily");
                        if ("SANS_SERIF".equals(string4)) {
                            tmbVar.s = 0;
                        } else if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                            tmbVar.s = 1;
                        } else if ("SERIF".equals(string4)) {
                            tmbVar.s = 2;
                        } else if ("MONOSPACED_SERIF".equals(string4)) {
                            tmbVar.s = 3;
                        } else if ("CASUAL".equals(string4)) {
                            tmbVar.s = 4;
                        } else if ("CURSIVE".equals(string4)) {
                            tmbVar.s = 5;
                        } else if ("SMALL_CAPITALS".equals(string4)) {
                            tmbVar.s = 6;
                        }
                    }
                    if (jSONObject4.has("fontStyle")) {
                        String string5 = jSONObject4.getString("fontStyle");
                        if ("NORMAL".equals(string5)) {
                            tmbVar.w = 0;
                        } else if ("BOLD".equals(string5)) {
                            tmbVar.w = 1;
                        } else if ("ITALIC".equals(string5)) {
                            tmbVar.w = 2;
                        } else if ("BOLD_ITALIC".equals(string5)) {
                            tmbVar.w = 3;
                        }
                    }
                    tmbVar.y = jSONObject4.optJSONObject("customData");
                    this.h = tmbVar;
                }
            }
            i = 2;
            tmbVar.h = tmb.c(jSONObject4.optString("windowColor"));
            if (tmbVar.f == i) {
            }
            tmbVar.r = qd1.a("fontFamily", jSONObject4);
            if (jSONObject4.has("fontGenericFamily")) {
            }
            if (jSONObject4.has("fontStyle")) {
            }
            tmbVar.y = jSONObject4.optJSONObject("customData");
            this.h = tmbVar;
        } else {
            this.h = null;
        }
        c(jSONObject);
        this.I = jSONObject.optJSONObject("customData");
        this.w = qd1.a("entity", jSONObject);
        this.E = qd1.a("atvEntity", jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("vmapAdsRequest");
        this.x = optJSONObject != null ? new ddc(qd1.a("adTagUrl", optJSONObject), qd1.a("adsResponse", optJSONObject)) : null;
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= d) {
                this.y = (long) (optDouble2 * 1000.0d);
            }
        }
        if (jSONObject.has("contentUrl")) {
            this.F = jSONObject.optString("contentUrl");
        }
        this.G = qd1.a("hlsSegmentFormat", jSONObject);
        this.H = qd1.a("hlsVideoSegmentFormat", jSONObject);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.a);
            jSONObject.putOpt("contentUrl", this.F);
            int i = this.b;
            jSONObject.put("streamType", i != 1 ? i != 2 ? "NONE" : "LIVE" : "BUFFERED");
            String str = this.c;
            if (str != null) {
                jSONObject.put("contentType", str);
            }
            mt6 mt6Var = this.d;
            if (mt6Var != null) {
                jSONObject.put("metadata", mt6Var.d());
            }
            long j = this.e;
            if (j <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                Pattern pattern = qd1.a;
                jSONObject.put("duration", j / 1000.0d);
            }
            int i2 = 0;
            ArrayList arrayList = this.f;
            if (arrayList != null) {
                JSONArray jSONArray = new JSONArray();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    jSONArray.put(((MediaTrack) obj).b());
                }
                jSONObject.put("tracks", jSONArray);
            }
            tmb tmbVar = this.h;
            if (tmbVar != null) {
                jSONObject.put("textTrackStyle", tmbVar.b());
            }
            JSONObject jSONObject2 = this.I;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str2 = this.w;
            if (str2 != null) {
                jSONObject.put("entity", str2);
            }
            if (this.r != null) {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList2 = this.r;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    jSONArray2.put(((aa) obj2).b());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.s != null) {
                JSONArray jSONArray3 = new JSONArray();
                ArrayList arrayList3 = this.s;
                int size3 = arrayList3.size();
                while (i2 < size3) {
                    Object obj3 = arrayList3.get(i2);
                    i2++;
                    jSONArray3.put(((z9) obj3).b());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            ddc ddcVar = this.x;
            if (ddcVar != null) {
                jSONObject.put("vmapAdsRequest", ddcVar.b());
            }
            long j2 = this.y;
            if (j2 != -1) {
                Pattern pattern2 = qd1.a;
                jSONObject.put("startAbsoluteTime", j2 / 1000.0d);
            }
            jSONObject.putOpt("atvEntity", this.E);
            String str3 = this.G;
            if (str3 != null) {
                jSONObject.put("hlsSegmentFormat", str3);
            }
            String str4 = this.H;
            if (str4 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str4);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5 A[LOOP:0: B:4:0x0024->B:25:0x00b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01aa A[LOOP:2: B:32:0x00e3->B:57:0x01aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(JSONObject jSONObject) {
        long j;
        z9 z9Var;
        aa aaVar;
        long j2 = 1000;
        int i = 0;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArray.length()) {
                    j = j2;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2 != null && jSONObject2.has("id") && jSONObject2.has("position")) {
                    try {
                        String string = jSONObject2.getString("id");
                        long j3 = jSONObject2.getLong("position");
                        Pattern pattern = qd1.a;
                        long j4 = j3 * j2;
                        boolean optBoolean = jSONObject2.optBoolean("isWatched");
                        long optLong = jSONObject2.optLong("duration") * j2;
                        JSONArray optJSONArray = jSONObject2.optJSONArray("breakClipIds");
                        String[] strArr = new String[0];
                        if (optJSONArray != null) {
                            strArr = new String[optJSONArray.length()];
                            j = j2;
                            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                try {
                                    strArr[i3] = optJSONArray.getString(i3);
                                } catch (JSONException e) {
                                    e = e;
                                    String message = e.getMessage();
                                    Locale locale = Locale.ROOT;
                                    Log.d("AdBreakInfo", "Error while creating an AdBreakInfo from JSON: " + message);
                                    aaVar = null;
                                    if (aaVar == null) {
                                    }
                                }
                            }
                        } else {
                            j = j2;
                        }
                        aaVar = new aa(j4, string, optLong, optBoolean, strArr, jSONObject2.optBoolean("isEmbedded"), jSONObject2.optBoolean("expanded"));
                    } catch (JSONException e2) {
                        e = e2;
                        j = j2;
                    }
                    if (aaVar == null) {
                        arrayList.clear();
                        break;
                    } else {
                        arrayList.add(aaVar);
                        i2++;
                        j2 = j;
                    }
                } else {
                    j = j2;
                }
                aaVar = null;
                if (aaVar == null) {
                }
            }
            this.r = new ArrayList(arrayList);
        } else {
            j = 1000;
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            while (true) {
                if (i >= jSONArray2.length()) {
                    break;
                }
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                if (jSONObject3 != null && jSONObject3.has("id")) {
                    try {
                        String string2 = jSONObject3.getString("id");
                        long optLong2 = jSONObject3.optLong("duration") * j;
                        String a = qd1.a("clickThroughUrl", jSONObject3);
                        String a2 = qd1.a("contentUrl", jSONObject3);
                        String a3 = qd1.a("mimeType", jSONObject3);
                        if (a3 == null) {
                            a3 = qd1.a("contentType", jSONObject3);
                        }
                        String str = a3;
                        String a4 = qd1.a("title", jSONObject3);
                        JSONObject optJSONObject = jSONObject3.optJSONObject("customData");
                        String a5 = qd1.a("contentId", jSONObject3);
                        String a6 = qd1.a("posterUrl", jSONObject3);
                        long intValue = jSONObject3.has("whenSkippable") ? ((Integer) jSONObject3.get("whenSkippable")).intValue() * j : -1L;
                        String a7 = qd1.a("hlsSegmentFormat", jSONObject3);
                        JSONObject optJSONObject2 = jSONObject3.optJSONObject("vastAdsRequest");
                        z9Var = new z9(string2, a4, optLong2, a2, str, a, (optJSONObject == null || optJSONObject.length() == 0) ? null : optJSONObject.toString(), a5, a6, intValue, a7, optJSONObject2 == null ? null : new ddc(qd1.a("adTagUrl", optJSONObject2), qd1.a("adsResponse", optJSONObject2)));
                    } catch (JSONException e3) {
                        String message2 = e3.getMessage();
                        Locale locale2 = Locale.ROOT;
                        Log.d("AdBreakClipInfo", "Error while creating an AdBreakClipInfo from JSON: " + message2);
                    }
                    if (z9Var != null) {
                        arrayList2.clear();
                        break;
                    } else {
                        arrayList2.add(z9Var);
                        i++;
                    }
                }
                z9Var = null;
                if (z9Var != null) {
                }
            }
            this.s = new ArrayList(arrayList2);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaInfo) {
                MediaInfo mediaInfo = (MediaInfo) obj;
                JSONObject jSONObject = this.I;
                boolean z = jSONObject == null;
                JSONObject jSONObject2 = mediaInfo.I;
                if (z != (jSONObject2 == null) || ((jSONObject != null && jSONObject2 != null && !ax5.a(jSONObject, jSONObject2)) || !qd1.d(this.a, mediaInfo.a) || this.b != mediaInfo.b || !qd1.d(this.c, mediaInfo.c) || !qd1.d(this.d, mediaInfo.d) || this.e != mediaInfo.e || !qd1.d(this.f, mediaInfo.f) || !qd1.d(this.h, mediaInfo.h) || !qd1.d(this.r, mediaInfo.r) || !qd1.d(this.s, mediaInfo.s) || !qd1.d(this.w, mediaInfo.w) || !qd1.d(this.x, mediaInfo.x) || this.y != mediaInfo.y || !qd1.d(this.E, mediaInfo.E) || !qd1.d(this.F, mediaInfo.F) || !qd1.d(this.G, mediaInfo.G) || !qd1.d(this.H, mediaInfo.H))) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), String.valueOf(this.I), this.f, this.h, this.r, this.s, this.w, this.x, Long.valueOf(this.y), this.E, this.G, this.H});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.I;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int r = bye.r(parcel, 20293);
        String str = this.a;
        if (str == null) {
            str = "";
        }
        bye.l(parcel, 2, str);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        bye.l(parcel, 4, this.c);
        bye.k(parcel, 5, this.d, i);
        bye.q(parcel, 6, 8);
        parcel.writeLong(this.e);
        bye.p(parcel, 7, this.f);
        bye.k(parcel, 8, this.h, i);
        bye.l(parcel, 9, this.n);
        ArrayList arrayList = this.r;
        bye.p(parcel, 10, arrayList == null ? null : DesugarCollections.unmodifiableList(arrayList));
        ArrayList arrayList2 = this.s;
        bye.p(parcel, 11, arrayList2 != null ? DesugarCollections.unmodifiableList(arrayList2) : null);
        bye.l(parcel, 12, this.w);
        bye.k(parcel, 13, this.x, i);
        bye.q(parcel, 14, 8);
        parcel.writeLong(this.y);
        bye.l(parcel, 15, this.E);
        bye.l(parcel, 16, this.F);
        bye.l(parcel, 17, this.G);
        bye.l(parcel, 18, this.H);
        bye.s(parcel, r);
    }

    public MediaInfo(String str, int i, String str2, mt6 mt6Var, long j, ArrayList arrayList, tmb tmbVar, String str3, ArrayList arrayList2, ArrayList arrayList3, String str4, ddc ddcVar, long j2, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = mt6Var;
        this.e = j;
        this.f = arrayList;
        this.h = tmbVar;
        this.n = str3;
        if (str3 != null) {
            try {
                this.I = new JSONObject(this.n);
            } catch (JSONException unused) {
                this.I = null;
                this.n = null;
            }
        } else {
            this.I = null;
        }
        this.r = arrayList2;
        this.s = arrayList3;
        this.w = str4;
        this.x = ddcVar;
        this.y = j2;
        this.E = str5;
        this.F = str6;
        this.G = str7;
        this.H = str8;
        if (this.a == null && str6 == null && str4 == null) {
            lq5.j("Either contentID or contentUrl or entity should be set");
            throw null;
        }
    }
}
