package com.google.android.gms.cast;

import a8.df;
import a8.ia;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.f0;
import com.google.android.gms.internal.cast.j0;
import d6.b;
import d6.l;
import d6.s;
import d6.t;
import d6.v;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import p6.a;
import v6.c;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class MediaInfo extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR;
    public final String E;
    public final String F;
    public final String G;
    public final JSONObject H;
    public final String a;
    public final int b;
    public final String c;
    public final l d;
    public final long e;
    public final List f;
    public final s h;
    public String n;
    public List r;
    public List s;
    public final String v;
    public final t w;
    public final long x;
    public final String y;

    static {
        Pattern pattern = h6.a.a;
        CREATOR = new v(7);
    }

    public MediaInfo(String str, int i10, String str2, l lVar, long j10, ArrayList arrayList, s sVar, String str3, ArrayList arrayList2, ArrayList arrayList3, String str4, t tVar, long j11, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = i10;
        this.c = str2;
        this.d = lVar;
        this.e = j10;
        this.f = arrayList;
        this.h = sVar;
        this.n = str3;
        if (str3 != null) {
            try {
                this.H = new JSONObject(this.n);
            } catch (JSONException unused) {
                this.H = null;
                this.n = null;
            }
        } else {
            this.H = null;
        }
        this.r = arrayList2;
        this.s = arrayList3;
        this.v = str4;
        this.w = tVar;
        this.x = j11;
        this.y = str5;
        this.E = str6;
        this.F = str7;
        this.G = str8;
        if (this.a == null && str6 == null && str4 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.a);
            jSONObject.putOpt("contentUrl", this.E);
            int i10 = this.b;
            jSONObject.put("streamType", i10 != 1 ? i10 != 2 ? "NONE" : "LIVE" : "BUFFERED");
            String str = this.c;
            if (str != null) {
                jSONObject.put("contentType", str);
            }
            l lVar = this.d;
            if (lVar != null) {
                jSONObject.put("metadata", lVar.d());
            }
            long j10 = this.e;
            if (j10 <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                Pattern pattern = h6.a.a;
                jSONObject.put("duration", j10 / 1000.0d);
            }
            List list = this.f;
            if (list != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaTrack) it.next()).b());
                }
                jSONObject.put("tracks", jSONArray);
            }
            s sVar = this.h;
            if (sVar != null) {
                jSONObject.put("textTrackStyle", sVar.b());
            }
            JSONObject jSONObject2 = this.H;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str2 = this.v;
            if (str2 != null) {
                jSONObject.put("entity", str2);
            }
            if (this.r != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = this.r.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((b) it2.next()).b());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.s != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = this.s.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((d6.a) it3.next()).b());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            t tVar = this.w;
            if (tVar != null) {
                jSONObject.put("vmapAdsRequest", tVar.b());
            }
            long j11 = this.x;
            if (j11 != -1) {
                Pattern pattern2 = h6.a.a;
                jSONObject.put("startAbsoluteTime", j11 / 1000.0d);
            }
            jSONObject.putOpt("atvEntity", this.y);
            String str3 = this.F;
            if (str3 != null) {
                jSONObject.put("hlsSegmentFormat", str3);
            }
            String str4 = this.G;
            if (str4 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str4);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00bb A[LOOP:0: B:4:0x0025->B:11:0x00bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b7 A[LOOP:1: B:18:0x00e9->B:24:0x01b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01be A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(JSONObject jSONObject) {
        long j10;
        d6.a aVar;
        b bVar;
        long j11 = 1000;
        int i10 = 0;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i11 = 0;
            while (true) {
                if (i11 >= jSONArray.length()) {
                    j10 = j11;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                if (jSONObject2 != null && jSONObject2.has("id") && jSONObject2.has("position")) {
                    try {
                        String string = jSONObject2.getString("id");
                        long j12 = jSONObject2.getLong("position");
                        Pattern pattern = h6.a.a;
                        long j13 = j12 * j11;
                        boolean optBoolean = jSONObject2.optBoolean("isWatched");
                        long optLong = jSONObject2.optLong("duration") * j11;
                        JSONArray optJSONArray = jSONObject2.optJSONArray("breakClipIds");
                        String[] strArr = new String[0];
                        if (optJSONArray != null) {
                            strArr = new String[optJSONArray.length()];
                            j10 = j11;
                            for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                                try {
                                    strArr[i12] = optJSONArray.getString(i12);
                                } catch (JSONException e) {
                                    e = e;
                                    String message = e.getMessage();
                                    Locale locale = Locale.ROOT;
                                    Log.d("AdBreakInfo", "Error while creating an AdBreakInfo from JSON: " + message);
                                    bVar = null;
                                    if (bVar == null) {
                                    }
                                }
                            }
                        } else {
                            j10 = j11;
                        }
                        bVar = new b(j13, string, optLong, optBoolean, strArr, jSONObject2.optBoolean("isEmbedded"), jSONObject2.optBoolean("expanded"));
                    } catch (JSONException e10) {
                        e = e10;
                        j10 = j11;
                    }
                    if (bVar == null) {
                        arrayList.clear();
                        break;
                    } else {
                        arrayList.add(bVar);
                        i11++;
                        j11 = j10;
                    }
                } else {
                    j10 = j11;
                }
                bVar = null;
                if (bVar == null) {
                }
            }
            this.r = new ArrayList(arrayList);
        } else {
            j10 = 1000;
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            while (true) {
                if (i10 >= jSONArray2.length()) {
                    break;
                }
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i10);
                if (jSONObject3 != null && jSONObject3.has("id")) {
                    try {
                        String string2 = jSONObject3.getString("id");
                        long optLong2 = jSONObject3.optLong("duration") * j10;
                        String a2 = h6.a.a("clickThroughUrl", jSONObject3);
                        String a10 = h6.a.a("contentUrl", jSONObject3);
                        String a11 = h6.a.a("mimeType", jSONObject3);
                        if (a11 == null) {
                            a11 = h6.a.a("contentType", jSONObject3);
                        }
                        String str = a11;
                        String a12 = h6.a.a("title", jSONObject3);
                        JSONObject optJSONObject = jSONObject3.optJSONObject("customData");
                        String a13 = h6.a.a("contentId", jSONObject3);
                        String a14 = h6.a.a("posterUrl", jSONObject3);
                        long intValue = jSONObject3.has("whenSkippable") ? ((Integer) jSONObject3.get("whenSkippable")).intValue() * j10 : -1L;
                        String a15 = h6.a.a("hlsSegmentFormat", jSONObject3);
                        JSONObject optJSONObject2 = jSONObject3.optJSONObject("vastAdsRequest");
                        aVar = new d6.a(string2, a12, optLong2, a10, str, a2, (optJSONObject == null || optJSONObject.length() == 0) ? null : optJSONObject.toString(), a13, a14, intValue, a15, optJSONObject2 == null ? null : new t(h6.a.a("adTagUrl", optJSONObject2), h6.a.a("adsResponse", optJSONObject2)));
                    } catch (JSONException e11) {
                        String message2 = e11.getMessage();
                        Locale locale2 = Locale.ROOT;
                        Log.d("AdBreakClipInfo", "Error while creating an AdBreakClipInfo from JSON: " + message2);
                    }
                    if (aVar != null) {
                        arrayList2.clear();
                        break;
                    } else {
                        arrayList2.add(aVar);
                        i10++;
                    }
                }
                aVar = null;
                if (aVar != null) {
                }
            }
            this.s = new ArrayList(arrayList2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.H;
        boolean z10 = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.H;
        if (z10 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || c.a(jSONObject, jSONObject2)) && h6.a.d(this.a, mediaInfo.a) && this.b == mediaInfo.b && h6.a.d(this.c, mediaInfo.c) && h6.a.d(this.d, mediaInfo.d) && this.e == mediaInfo.e && h6.a.d(this.f, mediaInfo.f) && h6.a.d(this.h, mediaInfo.h) && h6.a.d(this.r, mediaInfo.r) && h6.a.d(this.s, mediaInfo.s) && h6.a.d(this.v, mediaInfo.v) && h6.a.d(this.w, mediaInfo.w) && this.x == mediaInfo.x && h6.a.d(this.y, mediaInfo.y) && h6.a.d(this.E, mediaInfo.E) && h6.a.d(this.F, mediaInfo.F) && h6.a.d(this.G, mediaInfo.G);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), String.valueOf(this.H), this.f, this.h, this.r, this.s, this.v, this.w, Long.valueOf(this.x), this.y, this.F, this.G});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.H;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int q5 = df.q(parcel, 20293);
        String str = this.a;
        if (str == null) {
            str = "";
        }
        df.l(parcel, 2, str);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        df.l(parcel, 4, this.c);
        df.k(parcel, 5, this.d, i10);
        df.s(parcel, 6, 8);
        parcel.writeLong(this.e);
        df.p(parcel, 7, this.f);
        df.k(parcel, 8, this.h, i10);
        df.l(parcel, 9, this.n);
        List list = this.r;
        df.p(parcel, 10, list == null ? null : DesugarCollections.unmodifiableList(list));
        List list2 = this.s;
        df.p(parcel, 11, list2 != null ? DesugarCollections.unmodifiableList(list2) : null);
        df.l(parcel, 12, this.v);
        df.k(parcel, 13, this.w, i10);
        df.s(parcel, 14, 8);
        parcel.writeLong(this.x);
        df.l(parcel, 15, this.y);
        df.l(parcel, 16, this.E);
        df.l(parcel, 17, this.F);
        df.l(parcel, 18, this.G);
        df.r(parcel, q5);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x031d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaInfo(JSONObject jSONObject) {
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        double d;
        int i10;
        int i11;
        int i12;
        j0 j0Var;
        String optString = jSONObject.optString("streamType", "NONE");
        int i13 = 2;
        int i14 = 1;
        int i15 = 0;
        if ("NONE".equals(optString)) {
            this.b = 0;
        } else if ("BUFFERED".equals(optString)) {
            this.b = 1;
        } else if ("LIVE".equals(optString)) {
            this.b = 2;
        } else {
            this.b = -1;
        }
        this.c = h6.a.a("contentType", jSONObject);
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            l lVar = new l(jSONObject2.getInt("metadataType"));
            this.d = lVar;
            lVar.e(jSONObject2);
        }
        this.e = -1L;
        if (this.b != 2 && jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double optDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble) && optDouble >= 0.0d) {
                this.e = (long) (optDouble * 1000.0d);
            }
        }
        int i16 = 4;
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i17 = 0;
            d = 0.0d;
            while (i17 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i17);
                long j10 = jSONObject3.getLong("trackId");
                String optString2 = jSONObject3.optString(TeXSymbolParser.TYPE_ATTR);
                if ("TEXT".equals(optString2)) {
                    i11 = i14;
                } else if ("AUDIO".equals(optString2)) {
                    i11 = i13;
                } else {
                    i11 = "VIDEO".equals(optString2) ? 3 : i15;
                }
                String a2 = h6.a.a("trackContentId", jSONObject3);
                String a10 = h6.a.a("trackContentType", jSONObject3);
                String a11 = h6.a.a("name", jSONObject3);
                String a12 = h6.a.a("language", jSONObject3);
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i12 = i14;
                    } else if ("CAPTIONS".equals(string)) {
                        i12 = i13;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i12 = 3;
                    } else if ("CHAPTERS".equals(string)) {
                        i12 = i16;
                    } else {
                        i12 = "METADATA".equals(string) ? 5 : -1;
                    }
                } else {
                    i12 = i15;
                }
                if (jSONObject3.has("roles")) {
                    Object[] objArr = new Object[i16];
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    int i18 = i15;
                    int i19 = i18;
                    while (i18 < jSONArray2.length()) {
                        String optString3 = jSONArray2.optString(i18);
                        optString3.getClass();
                        int i20 = i19 + 1;
                        int length = objArr.length;
                        if (length < i20) {
                            objArr = Arrays.copyOf(objArr, ia.a(length, i20));
                        }
                        objArr[i19] = optString3;
                        i18++;
                        i19 = i20;
                    }
                    j0Var = f0.q(i19, objArr);
                } else {
                    j0Var = null;
                }
                arrayList.add(new MediaTrack(j10, i11, a2, a10, a11, a12, i12, j0Var, jSONObject3.optJSONObject("customData")));
                i17++;
                i16 = 4;
                i13 = 2;
                i14 = 1;
                i15 = 0;
            }
            this.f = new ArrayList(arrayList);
        } else {
            d = 0.0d;
            this.f = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            s sVar = new s(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
            sVar.a = (float) jSONObject4.optDouble("fontScale", 1.0d);
            sVar.b = s.c(jSONObject4.optString("foregroundColor"));
            sVar.c = s.c(jSONObject4.optString("backgroundColor"));
            if (jSONObject4.has("edgeType")) {
                String string2 = jSONObject4.getString("edgeType");
                if ("NONE".equals(string2)) {
                    sVar.d = 0;
                } else if ("OUTLINE".equals(string2)) {
                    sVar.d = 1;
                } else if ("DROP_SHADOW".equals(string2)) {
                    sVar.d = 2;
                } else if ("RAISED".equals(string2)) {
                    sVar.d = 3;
                } else if ("DEPRESSED".equals(string2)) {
                    sVar.d = 4;
                }
            }
            sVar.e = s.c(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string3 = jSONObject4.getString("windowType");
                if ("NONE".equals(string3)) {
                    sVar.f = 0;
                } else if ("NORMAL".equals(string3)) {
                    sVar.f = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    i10 = 2;
                    sVar.f = 2;
                    sVar.h = s.c(jSONObject4.optString("windowColor"));
                    if (sVar.f == i10) {
                        sVar.n = jSONObject4.optInt("windowRoundedCornerRadius", 0);
                    }
                    sVar.r = h6.a.a("fontFamily", jSONObject4);
                    if (jSONObject4.has("fontGenericFamily")) {
                        String string4 = jSONObject4.getString("fontGenericFamily");
                        if ("SANS_SERIF".equals(string4)) {
                            sVar.s = 0;
                        } else if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                            sVar.s = 1;
                        } else if ("SERIF".equals(string4)) {
                            sVar.s = 2;
                        } else if ("MONOSPACED_SERIF".equals(string4)) {
                            sVar.s = 3;
                        } else if ("CASUAL".equals(string4)) {
                            sVar.s = 4;
                        } else if ("CURSIVE".equals(string4)) {
                            sVar.s = 5;
                        } else if ("SMALL_CAPITALS".equals(string4)) {
                            sVar.s = 6;
                        }
                    }
                    if (jSONObject4.has("fontStyle")) {
                        String string5 = jSONObject4.getString("fontStyle");
                        if ("NORMAL".equals(string5)) {
                            sVar.v = 0;
                        } else if ("BOLD".equals(string5)) {
                            sVar.v = 1;
                        } else if ("ITALIC".equals(string5)) {
                            sVar.v = 2;
                        } else if ("BOLD_ITALIC".equals(string5)) {
                            sVar.v = 3;
                        }
                    }
                    sVar.x = jSONObject4.optJSONObject("customData");
                    this.h = sVar;
                }
            }
            i10 = 2;
            sVar.h = s.c(jSONObject4.optString("windowColor"));
            if (sVar.f == i10) {
            }
            sVar.r = h6.a.a("fontFamily", jSONObject4);
            if (jSONObject4.has("fontGenericFamily")) {
            }
            if (jSONObject4.has("fontStyle")) {
            }
            sVar.x = jSONObject4.optJSONObject("customData");
            this.h = sVar;
        } else {
            this.h = null;
        }
        c(jSONObject);
        this.H = jSONObject.optJSONObject("customData");
        this.v = h6.a.a("entity", jSONObject);
        this.y = h6.a.a("atvEntity", jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("vmapAdsRequest");
        this.w = optJSONObject != null ? new t(h6.a.a("adTagUrl", optJSONObject), h6.a.a("adsResponse", optJSONObject)) : null;
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= d) {
                this.x = (long) (optDouble2 * 1000.0d);
            }
        }
        if (jSONObject.has("contentUrl")) {
            this.E = jSONObject.optString("contentUrl");
        }
        this.F = h6.a.a("hlsSegmentFormat", jSONObject);
        this.G = h6.a.a("hlsVideoSegmentFormat", jSONObject);
    }
}
