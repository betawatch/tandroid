package com.google.android.gms.cast;

import a8.u8;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c8.xb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.f0;
import com.google.android.gms.internal.cast.j0;
import f6.b;
import f6.l;
import f6.s;
import f6.t;
import f6.v;
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
import r6.a;
import x6.c;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class MediaInfo extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR;
    public final String D;
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
    public final String w;
    public final t x;
    public final long y;

    static {
        Pattern pattern = j6.a.a;
        CREATOR = new v(7);
    }

    public MediaInfo(String str, int i7, String str2, l lVar, long j3, ArrayList arrayList, s sVar, String str3, ArrayList arrayList2, ArrayList arrayList3, String str4, t tVar, long j10, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = i7;
        this.c = str2;
        this.d = lVar;
        this.e = j3;
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
        this.w = str4;
        this.x = tVar;
        this.y = j10;
        this.D = str5;
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
            int i7 = this.b;
            jSONObject.put("streamType", i7 != 1 ? i7 != 2 ? "NONE" : "LIVE" : "BUFFERED");
            String str = this.c;
            if (str != null) {
                jSONObject.put("contentType", str);
            }
            l lVar = this.d;
            if (lVar != null) {
                jSONObject.put("metadata", lVar.d());
            }
            long j3 = this.e;
            if (j3 <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                Pattern pattern = j6.a.a;
                jSONObject.put("duration", j3 / 1000.0d);
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
                    jSONArray3.put(((f6.a) it3.next()).b());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            t tVar = this.x;
            if (tVar != null) {
                jSONObject.put("vmapAdsRequest", tVar.b());
            }
            long j10 = this.y;
            if (j10 != -1) {
                Pattern pattern2 = j6.a.a;
                jSONObject.put("startAbsoluteTime", j10 / 1000.0d);
            }
            jSONObject.putOpt("atvEntity", this.D);
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b9 A[LOOP:0: B:4:0x0024->B:11:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b2 A[LOOP:1: B:18:0x00e7->B:24:0x01b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(JSONObject jSONObject) {
        long j3;
        f6.a aVar;
        b bVar;
        long j10 = 1000;
        int i7 = 0;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i10 = 0;
            while (true) {
                if (i10 >= jSONArray.length()) {
                    j3 = j10;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (jSONObject2 != null && jSONObject2.has("id") && jSONObject2.has("position")) {
                    try {
                        String string = jSONObject2.getString("id");
                        long j11 = jSONObject2.getLong("position");
                        Pattern pattern = j6.a.a;
                        long j12 = j11 * j10;
                        boolean optBoolean = jSONObject2.optBoolean("isWatched");
                        long optLong = jSONObject2.optLong("duration") * j10;
                        JSONArray optJSONArray = jSONObject2.optJSONArray("breakClipIds");
                        String[] strArr = new String[0];
                        if (optJSONArray != null) {
                            strArr = new String[optJSONArray.length()];
                            j3 = j10;
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
                            j3 = j10;
                        }
                        bVar = new b(j12, string, optLong, optBoolean, strArr, jSONObject2.optBoolean("isEmbedded"), jSONObject2.optBoolean("expanded"));
                    } catch (JSONException e11) {
                        e = e11;
                        j3 = j10;
                    }
                    if (bVar == null) {
                        arrayList.clear();
                        break;
                    } else {
                        arrayList.add(bVar);
                        i10++;
                        j10 = j3;
                    }
                } else {
                    j3 = j10;
                }
                bVar = null;
                if (bVar == null) {
                }
            }
            this.r = new ArrayList(arrayList);
        } else {
            j3 = 1000;
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            while (true) {
                if (i7 >= jSONArray2.length()) {
                    break;
                }
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i7);
                if (jSONObject3 != null && jSONObject3.has("id")) {
                    try {
                        String string2 = jSONObject3.getString("id");
                        long optLong2 = jSONObject3.optLong("duration") * j3;
                        String a10 = j6.a.a("clickThroughUrl", jSONObject3);
                        String a11 = j6.a.a("contentUrl", jSONObject3);
                        String a12 = j6.a.a("mimeType", jSONObject3);
                        if (a12 == null) {
                            a12 = j6.a.a("contentType", jSONObject3);
                        }
                        String str = a12;
                        String a13 = j6.a.a("title", jSONObject3);
                        JSONObject optJSONObject = jSONObject3.optJSONObject("customData");
                        String a14 = j6.a.a("contentId", jSONObject3);
                        String a15 = j6.a.a("posterUrl", jSONObject3);
                        long intValue = jSONObject3.has("whenSkippable") ? ((Integer) jSONObject3.get("whenSkippable")).intValue() * j3 : -1L;
                        String a16 = j6.a.a("hlsSegmentFormat", jSONObject3);
                        JSONObject optJSONObject2 = jSONObject3.optJSONObject("vastAdsRequest");
                        aVar = new f6.a(string2, a13, optLong2, a11, str, a10, (optJSONObject == null || optJSONObject.length() == 0) ? null : optJSONObject.toString(), a14, a15, intValue, a16, optJSONObject2 == null ? null : new t(j6.a.a("adTagUrl", optJSONObject2), j6.a.a("adsResponse", optJSONObject2)));
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
                        i7++;
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
        boolean z9 = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.H;
        if (z9 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || c.a(jSONObject, jSONObject2)) && j6.a.d(this.a, mediaInfo.a) && this.b == mediaInfo.b && j6.a.d(this.c, mediaInfo.c) && j6.a.d(this.d, mediaInfo.d) && this.e == mediaInfo.e && j6.a.d(this.f, mediaInfo.f) && j6.a.d(this.h, mediaInfo.h) && j6.a.d(this.r, mediaInfo.r) && j6.a.d(this.s, mediaInfo.s) && j6.a.d(this.w, mediaInfo.w) && j6.a.d(this.x, mediaInfo.x) && this.y == mediaInfo.y && j6.a.d(this.D, mediaInfo.D) && j6.a.d(this.E, mediaInfo.E) && j6.a.d(this.F, mediaInfo.F) && j6.a.d(this.G, mediaInfo.G);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), String.valueOf(this.H), this.f, this.h, this.r, this.s, this.w, this.x, Long.valueOf(this.y), this.D, this.F, this.G});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        JSONObject jSONObject = this.H;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int r10 = xb.r(parcel, 20293);
        String str = this.a;
        if (str == null) {
            str = "";
        }
        xb.l(parcel, 2, str);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        xb.l(parcel, 4, this.c);
        xb.k(parcel, 5, this.d, i7);
        xb.q(parcel, 6, 8);
        parcel.writeLong(this.e);
        xb.p(parcel, 7, this.f);
        xb.k(parcel, 8, this.h, i7);
        xb.l(parcel, 9, this.n);
        List list = this.r;
        xb.p(parcel, 10, list == null ? null : DesugarCollections.unmodifiableList(list));
        List list2 = this.s;
        xb.p(parcel, 11, list2 != null ? DesugarCollections.unmodifiableList(list2) : null);
        xb.l(parcel, 12, this.w);
        xb.k(parcel, 13, this.x, i7);
        xb.q(parcel, 14, 8);
        parcel.writeLong(this.y);
        xb.l(parcel, 15, this.D);
        xb.l(parcel, 16, this.E);
        xb.l(parcel, 17, this.F);
        xb.l(parcel, 18, this.G);
        xb.s(parcel, r10);
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
        int i7;
        int i10;
        int i11;
        j0 j0Var;
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
        this.c = j6.a.a("contentType", jSONObject);
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
                long j3 = jSONObject3.getLong("trackId");
                String optString2 = jSONObject3.optString(TeXSymbolParser.TYPE_ATTR);
                if ("TEXT".equals(optString2)) {
                    i10 = i13;
                } else if ("AUDIO".equals(optString2)) {
                    i10 = i12;
                } else {
                    i10 = "VIDEO".equals(optString2) ? 3 : i14;
                }
                String a10 = j6.a.a("trackContentId", jSONObject3);
                String a11 = j6.a.a("trackContentType", jSONObject3);
                String a12 = j6.a.a("name", jSONObject3);
                String a13 = j6.a.a("language", jSONObject3);
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
                            objArr = Arrays.copyOf(objArr, u8.a(length, i19));
                        }
                        objArr[i18] = optString3;
                        i17++;
                        i18 = i19;
                    }
                    j0Var = f0.m(i18, objArr);
                } else {
                    j0Var = null;
                }
                arrayList.add(new MediaTrack(j3, i10, a10, a11, a12, a13, i11, j0Var, jSONObject3.optJSONObject("customData")));
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
                    i7 = 2;
                    sVar.f = 2;
                    sVar.h = s.c(jSONObject4.optString("windowColor"));
                    if (sVar.f == i7) {
                        sVar.n = jSONObject4.optInt("windowRoundedCornerRadius", 0);
                    }
                    sVar.r = j6.a.a("fontFamily", jSONObject4);
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
            i7 = 2;
            sVar.h = s.c(jSONObject4.optString("windowColor"));
            if (sVar.f == i7) {
            }
            sVar.r = j6.a.a("fontFamily", jSONObject4);
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
        this.H = jSONObject.optJSONObject("customData");
        this.w = j6.a.a("entity", jSONObject);
        this.D = j6.a.a("atvEntity", jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("vmapAdsRequest");
        this.x = optJSONObject != null ? new t(j6.a.a("adTagUrl", optJSONObject), j6.a.a("adsResponse", optJSONObject)) : null;
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= d) {
                this.y = (long) (optDouble2 * 1000.0d);
            }
        }
        if (jSONObject.has("contentUrl")) {
            this.E = jSONObject.optString("contentUrl");
        }
        this.F = j6.a.a("hlsSegmentFormat", jSONObject);
        this.G = j6.a.a("hlsVideoSegmentFormat", jSONObject);
    }
}
