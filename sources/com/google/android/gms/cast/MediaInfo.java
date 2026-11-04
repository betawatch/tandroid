package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import b8.fa;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.g0;
import com.google.android.gms.internal.cast.k0;
import e6.b;
import e6.l;
import e6.s;
import e6.t;
import e6.v;
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
import q6.a;
import w6.c;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class MediaInfo extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR;
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final JSONObject I;
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
    public final String w;
    public final t x;
    public final long y;

    static {
        Pattern pattern = i6.a.a;
        CREATOR = new v(7);
    }

    public MediaInfo(String str, int i3, String str2, l lVar, long j10, ArrayList arrayList, s sVar, String str3, ArrayList arrayList2, ArrayList arrayList3, String str4, t tVar, long j11, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = i3;
        this.c = str2;
        this.d = lVar;
        this.e = j10;
        this.f = arrayList;
        this.h = sVar;
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
        this.x = tVar;
        this.y = j11;
        this.E = str5;
        this.F = str6;
        this.G = str7;
        this.H = str8;
        if (this.a == null && str6 == null && str4 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.a);
            jSONObject.putOpt("contentUrl", this.F);
            int i3 = this.b;
            jSONObject.put("streamType", i3 != 1 ? i3 != 2 ? "NONE" : "LIVE" : "BUFFERED");
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
                Pattern pattern = i6.a.a;
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
                    jSONArray3.put(((e6.a) it3.next()).b());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            t tVar = this.x;
            if (tVar != null) {
                jSONObject.put("vmapAdsRequest", tVar.b());
            }
            long j11 = this.y;
            if (j11 != -1) {
                Pattern pattern2 = i6.a.a;
                jSONObject.put("startAbsoluteTime", j11 / 1000.0d);
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b9 A[LOOP:0: B:4:0x0024->B:11:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b2 A[LOOP:1: B:18:0x00e7->B:24:0x01b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(JSONObject jSONObject) {
        long j10;
        e6.a aVar;
        b bVar;
        long j11 = 1000;
        int i3 = 0;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i10 = 0;
            while (true) {
                if (i10 >= jSONArray.length()) {
                    j10 = j11;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (jSONObject2 != null && jSONObject2.has("id") && jSONObject2.has("position")) {
                    try {
                        String string = jSONObject2.getString("id");
                        long j12 = jSONObject2.getLong("position");
                        Pattern pattern = i6.a.a;
                        long j13 = j12 * j11;
                        boolean optBoolean = jSONObject2.optBoolean("isWatched");
                        long optLong = jSONObject2.optLong("duration") * j11;
                        JSONArray optJSONArray = jSONObject2.optJSONArray("breakClipIds");
                        String[] strArr = new String[0];
                        if (optJSONArray != null) {
                            strArr = new String[optJSONArray.length()];
                            j10 = j11;
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                try {
                                    strArr[i11] = optJSONArray.getString(i11);
                                } catch (JSONException e10) {
                                    e = e10;
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
                    } catch (JSONException e11) {
                        e = e11;
                        j10 = j11;
                    }
                    if (bVar == null) {
                        arrayList.clear();
                        break;
                    } else {
                        arrayList.add(bVar);
                        i10++;
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
                if (i3 >= jSONArray2.length()) {
                    break;
                }
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                if (jSONObject3 != null && jSONObject3.has("id")) {
                    try {
                        String string2 = jSONObject3.getString("id");
                        long optLong2 = jSONObject3.optLong("duration") * j10;
                        String a10 = i6.a.a("clickThroughUrl", jSONObject3);
                        String a11 = i6.a.a("contentUrl", jSONObject3);
                        String a12 = i6.a.a("mimeType", jSONObject3);
                        if (a12 == null) {
                            a12 = i6.a.a("contentType", jSONObject3);
                        }
                        String str = a12;
                        String a13 = i6.a.a("title", jSONObject3);
                        JSONObject optJSONObject = jSONObject3.optJSONObject("customData");
                        String a14 = i6.a.a("contentId", jSONObject3);
                        String a15 = i6.a.a("posterUrl", jSONObject3);
                        long intValue = jSONObject3.has("whenSkippable") ? ((Integer) jSONObject3.get("whenSkippable")).intValue() * j10 : -1L;
                        String a16 = i6.a.a("hlsSegmentFormat", jSONObject3);
                        JSONObject optJSONObject2 = jSONObject3.optJSONObject("vastAdsRequest");
                        aVar = new e6.a(string2, a13, optLong2, a11, str, a10, (optJSONObject == null || optJSONObject.length() == 0) ? null : optJSONObject.toString(), a14, a15, intValue, a16, optJSONObject2 == null ? null : new t(i6.a.a("adTagUrl", optJSONObject2), i6.a.a("adsResponse", optJSONObject2)));
                    } catch (JSONException e12) {
                        String message2 = e12.getMessage();
                        Locale locale2 = Locale.ROOT;
                        Log.d("AdBreakClipInfo", "Error while creating an AdBreakClipInfo from JSON: " + message2);
                    }
                    if (aVar != null) {
                        arrayList2.clear();
                        break;
                    } else {
                        arrayList2.add(aVar);
                        i3++;
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
        JSONObject jSONObject = this.I;
        boolean z10 = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.I;
        if (z10 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || c.a(jSONObject, jSONObject2)) && i6.a.d(this.a, mediaInfo.a) && this.b == mediaInfo.b && i6.a.d(this.c, mediaInfo.c) && i6.a.d(this.d, mediaInfo.d) && this.e == mediaInfo.e && i6.a.d(this.f, mediaInfo.f) && i6.a.d(this.h, mediaInfo.h) && i6.a.d(this.r, mediaInfo.r) && i6.a.d(this.s, mediaInfo.s) && i6.a.d(this.w, mediaInfo.w) && i6.a.d(this.x, mediaInfo.x) && this.y == mediaInfo.y && i6.a.d(this.E, mediaInfo.E) && i6.a.d(this.F, mediaInfo.F) && i6.a.d(this.G, mediaInfo.G) && i6.a.d(this.H, mediaInfo.H);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), String.valueOf(this.I), this.f, this.h, this.r, this.s, this.w, this.x, Long.valueOf(this.y), this.E, this.G, this.H});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        JSONObject jSONObject = this.I;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int s6 = j8.a.s(parcel, 20293);
        String str = this.a;
        if (str == null) {
            str = "";
        }
        j8.a.m(parcel, 2, str);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.b);
        j8.a.m(parcel, 4, this.c);
        j8.a.l(parcel, 5, this.d, i3);
        j8.a.r(parcel, 6, 8);
        parcel.writeLong(this.e);
        j8.a.q(parcel, 7, this.f);
        j8.a.l(parcel, 8, this.h, i3);
        j8.a.m(parcel, 9, this.n);
        List list = this.r;
        j8.a.q(parcel, 10, list == null ? null : DesugarCollections.unmodifiableList(list));
        List list2 = this.s;
        j8.a.q(parcel, 11, list2 != null ? DesugarCollections.unmodifiableList(list2) : null);
        j8.a.m(parcel, 12, this.w);
        j8.a.l(parcel, 13, this.x, i3);
        j8.a.r(parcel, 14, 8);
        parcel.writeLong(this.y);
        j8.a.m(parcel, 15, this.E);
        j8.a.m(parcel, 16, this.F);
        j8.a.m(parcel, 17, this.G);
        j8.a.m(parcel, 18, this.H);
        j8.a.t(parcel, s6);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0311  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaInfo(JSONObject jSONObject) {
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        double d;
        int i3;
        int i10;
        int i11;
        k0 k0Var;
        String optString = jSONObject.optString("streamType", "NONE");
        int i12 = 2;
        int i13 = 1;
        int i14 = 0;
        if ("NONE".equals(optString)) {
            this.b = 0;
        } else if ("BUFFERED".equals(optString)) {
            this.b = 1;
        } else if ("LIVE".equals(optString)) {
            this.b = 2;
        } else {
            this.b = -1;
        }
        this.c = i6.a.a("contentType", jSONObject);
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
        int i15 = 4;
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i16 = 0;
            d = 0.0d;
            while (i16 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i16);
                long j10 = jSONObject3.getLong("trackId");
                String optString2 = jSONObject3.optString(TeXSymbolParser.TYPE_ATTR);
                if ("TEXT".equals(optString2)) {
                    i10 = i13;
                } else if ("AUDIO".equals(optString2)) {
                    i10 = i12;
                } else {
                    i10 = "VIDEO".equals(optString2) ? 3 : i14;
                }
                String a10 = i6.a.a("trackContentId", jSONObject3);
                String a11 = i6.a.a("trackContentType", jSONObject3);
                String a12 = i6.a.a("name", jSONObject3);
                String a13 = i6.a.a("language", jSONObject3);
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i11 = i13;
                    } else if ("CAPTIONS".equals(string)) {
                        i11 = i12;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i11 = 3;
                    } else if ("CHAPTERS".equals(string)) {
                        i11 = i15;
                    } else {
                        i11 = "METADATA".equals(string) ? 5 : -1;
                    }
                } else {
                    i11 = i14;
                }
                if (jSONObject3.has("roles")) {
                    Object[] objArr = new Object[i15];
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    int i17 = i14;
                    int i18 = i17;
                    while (i17 < jSONArray2.length()) {
                        String optString3 = jSONArray2.optString(i17);
                        optString3.getClass();
                        int i19 = i18 + 1;
                        int length = objArr.length;
                        if (length < i19) {
                            objArr = Arrays.copyOf(objArr, fa.a(length, i19));
                        }
                        objArr[i18] = optString3;
                        i17++;
                        i18 = i19;
                    }
                    k0Var = g0.m(i18, objArr);
                } else {
                    k0Var = null;
                }
                arrayList.add(new MediaTrack(j10, i10, a10, a11, a12, a13, i11, k0Var, jSONObject3.optJSONObject("customData")));
                i16++;
                i15 = 4;
                i12 = 2;
                i13 = 1;
                i14 = 0;
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
                    i3 = 2;
                    sVar.f = 2;
                    sVar.h = s.c(jSONObject4.optString("windowColor"));
                    if (sVar.f == i3) {
                        sVar.n = jSONObject4.optInt("windowRoundedCornerRadius", 0);
                    }
                    sVar.r = i6.a.a("fontFamily", jSONObject4);
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
                            sVar.w = 0;
                        } else if ("BOLD".equals(string5)) {
                            sVar.w = 1;
                        } else if ("ITALIC".equals(string5)) {
                            sVar.w = 2;
                        } else if ("BOLD_ITALIC".equals(string5)) {
                            sVar.w = 3;
                        }
                    }
                    sVar.y = jSONObject4.optJSONObject("customData");
                    this.h = sVar;
                }
            }
            i3 = 2;
            sVar.h = s.c(jSONObject4.optString("windowColor"));
            if (sVar.f == i3) {
            }
            sVar.r = i6.a.a("fontFamily", jSONObject4);
            if (jSONObject4.has("fontGenericFamily")) {
            }
            if (jSONObject4.has("fontStyle")) {
            }
            sVar.y = jSONObject4.optJSONObject("customData");
            this.h = sVar;
        } else {
            this.h = null;
        }
        c(jSONObject);
        this.I = jSONObject.optJSONObject("customData");
        this.w = i6.a.a("entity", jSONObject);
        this.E = i6.a.a("atvEntity", jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("vmapAdsRequest");
        this.x = optJSONObject != null ? new t(i6.a.a("adTagUrl", optJSONObject), i6.a.a("adsResponse", optJSONObject)) : null;
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= d) {
                this.y = (long) (optDouble2 * 1000.0d);
            }
        }
        if (jSONObject.has("contentUrl")) {
            this.F = jSONObject.optString("contentUrl");
        }
        this.G = i6.a.a("hlsSegmentFormat", jSONObject);
        this.H = i6.a.a("hlsVideoSegmentFormat", jSONObject);
    }
}
