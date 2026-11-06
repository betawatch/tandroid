package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import c8.xb;
import c8.y0;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR;
    public String D;
    public JSONObject E;
    public int F;
    public boolean H;
    public c I;
    public u J;
    public j K;
    public n L;
    public boolean M;
    public MediaInfo a;
    public long b;
    public int c;
    public double d;
    public int e;
    public int f;
    public long h;
    public long n;
    public double r;
    public boolean s;
    public long[] w;
    public int x;
    public int y;
    public final ArrayList G = new ArrayList();
    public final SparseArray N = new SparseArray();

    static {
        q6.m.f("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j3, int i7, double d, int i10, int i11, long j10, long j11, double d2, boolean z9, long[] jArr, int i12, int i13, String str, int i14, ArrayList arrayList, boolean z10, c cVar, u uVar, j jVar, n nVar) {
        this.a = mediaInfo;
        this.b = j3;
        this.c = i7;
        this.d = d;
        this.e = i10;
        this.f = i11;
        this.h = j10;
        this.n = j11;
        this.r = d2;
        this.s = z9;
        this.w = jArr;
        this.x = i12;
        this.y = i13;
        this.D = str;
        if (str != null) {
            try {
                this.E = new JSONObject(this.D);
            } catch (JSONException unused) {
                this.E = null;
                this.D = null;
            }
        } else {
            this.E = null;
        }
        this.F = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        this.H = z10;
        this.I = cVar;
        this.J = uVar;
        this.K = jVar;
        this.L = nVar;
        boolean z11 = false;
        if (nVar != null && nVar.s) {
            z11 = true;
        }
        this.M = z11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x023f, code lost:
    
        if (r12 != 3) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0242, code lost:
    
        if (r2 != 2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0245, code lost:
    
        if (r13 == 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x01af, code lost:
    
        if (r34.w != null) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0461 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0390 A[Catch: JSONException -> 0x039b, TryCatch #1 {JSONException -> 0x039b, blocks: (B:319:0x036a, B:321:0x0390, B:322:0x0391), top: B:318:0x036a }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(JSONObject jSONObject, int i7) {
        JSONObject jSONObject2;
        long j3;
        int i10;
        double d;
        JSONArray jSONArray;
        long[] jArr;
        int optInt;
        int optInt2;
        int i11;
        int i12;
        int i13;
        int i14;
        MediaInfo mediaInfo;
        int i15;
        JSONObject optJSONObject;
        long optLong;
        c cVar;
        c cVar2;
        JSONObject optJSONObject2;
        int i16;
        int i17;
        u uVar;
        u uVar2;
        int i18;
        int i19;
        j jVar;
        int i20;
        String a10;
        String str;
        String str2;
        int i21;
        m mVar;
        ArrayList arrayList;
        boolean optBoolean;
        ArrayList arrayList2;
        int i22;
        int i23;
        String str3;
        String str4;
        int i24;
        JSONArray optJSONArray;
        ArrayList arrayList3;
        JSONArray optJSONArray2;
        ArrayList arrayList4;
        String str5;
        MediaInfo mediaInfo2;
        int i25;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("extendedStatus");
        if (optJSONObject3 != null) {
            try {
                ArrayList arrayList5 = new ArrayList();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    arrayList5.add(keys.next());
                }
                jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList5.toArray(new String[0]));
                Iterator<String> keys2 = optJSONObject3.keys();
                while (keys2.hasNext()) {
                    String next = keys2.next();
                    jSONObject2.put(next, optJSONObject3.get(next));
                }
                jSONObject2.remove("extendedStatus");
            } catch (JSONException unused) {
            }
            j3 = jSONObject2.getLong("mediaSessionId");
            int i26 = 1;
            if (j3 == this.b) {
                this.b = j3;
                i10 = 1;
            } else {
                i10 = 0;
            }
            int i27 = 2;
            if (jSONObject2.has("playerState")) {
                String string = jSONObject2.getString("playerState");
                int i28 = string.equals("IDLE") ? 1 : string.equals("PLAYING") ? 2 : string.equals("PAUSED") ? 3 : string.equals("BUFFERING") ? 4 : string.equals("LOADING") ? 5 : 0;
                if (i28 != this.e) {
                    this.e = i28;
                    i10 |= 2;
                }
                if (i28 == 1 && jSONObject2.has("idleReason")) {
                    String string2 = jSONObject2.getString("idleReason");
                    int i29 = string2.equals("CANCELLED") ? 2 : string2.equals("INTERRUPTED") ? 3 : string2.equals("FINISHED") ? 1 : string2.equals("ERROR") ? 4 : 0;
                    if (i29 != this.f) {
                        this.f = i29;
                        i10 |= 2;
                    }
                }
            }
            if (jSONObject2.has("playbackRate")) {
                double d2 = jSONObject2.getDouble("playbackRate");
                if (this.d != d2) {
                    this.d = d2;
                    i10 |= 2;
                }
            }
            if (jSONObject2.has("currentTime")) {
                double d10 = jSONObject2.getDouble("currentTime");
                Pattern pattern = j6.a.a;
                long j10 = (long) (d10 * 1000.0d);
                if (j10 != this.h) {
                    this.h = j10;
                    i10 |= 2;
                }
                i10 |= 128;
            }
            if (jSONObject2.has("supportedMediaCommands")) {
                long j11 = jSONObject2.getLong("supportedMediaCommands");
                if (j11 != this.n) {
                    this.n = j11;
                    i10 |= 2;
                }
            }
            if (jSONObject2.has("volume") || i7 != 0) {
                d = 1000.0d;
            } else {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("volume");
                double d11 = jSONObject3.getDouble("level");
                d = 1000.0d;
                if (d11 != this.r) {
                    this.r = d11;
                    i10 |= 2;
                }
                boolean z9 = jSONObject3.getBoolean("muted");
                if (z9 != this.s) {
                    this.s = z9;
                    i10 |= 2;
                }
            }
            jSONArray = !jSONObject2.has("activeTrackIds") ? jSONObject2.getJSONArray("activeTrackIds") : null;
            Pattern pattern2 = j6.a.a;
            if (jSONArray != null) {
                jArr = null;
            } else {
                jArr = new long[jSONArray.length()];
                for (int i30 = 0; i30 < jSONArray.length(); i30++) {
                    jArr[i30] = jSONArray.getLong(i30);
                }
            }
            if (jArr == null) {
                long[] jArr2 = this.w;
                if (jArr2 != null) {
                    if (jArr2.length == jArr.length) {
                        for (int i31 = 0; i31 < jArr.length; i31++) {
                            if (this.w[i31] == jArr[i31]) {
                            }
                        }
                    }
                }
                this.w = jArr;
                i10 |= 2;
                break;
            }
            if (jSONObject2.has("customData")) {
                this.E = jSONObject2.getJSONObject("customData");
                this.D = null;
                i10 |= 2;
            }
            if (jSONObject2.has("media")) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("media");
                MediaInfo mediaInfo3 = new MediaInfo(jSONObject4);
                MediaInfo mediaInfo4 = this.a;
                if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                    this.a = mediaInfo3;
                    i10 |= 2;
                }
                if (jSONObject4.has("metadata")) {
                    i10 |= 4;
                }
            }
            if (jSONObject2.has("currentItemId") && this.c != (i25 = jSONObject2.getInt("currentItemId"))) {
                this.c = i25;
                i10 |= 2;
            }
            optInt = jSONObject2.optInt("preloadedItemId", 0);
            if (this.y != optInt) {
                this.y = optInt;
                i10 |= 16;
            }
            optInt2 = jSONObject2.optInt("loadingItemId", 0);
            if (this.x != optInt2) {
                this.x = optInt2;
                i10 |= 2;
            }
            MediaInfo mediaInfo5 = this.a;
            int i32 = mediaInfo5 != null ? -1 : mediaInfo5.b;
            i11 = this.e;
            int i33 = this.f;
            int i34 = this.x;
            SparseArray sparseArray = this.N;
            ArrayList arrayList6 = this.G;
            double d12 = d;
            if (i11 == 1) {
                if (i33 != 1) {
                    if (i33 != 2) {
                    }
                    this.c = 0;
                    this.x = 0;
                    this.y = 0;
                    if (arrayList6.isEmpty()) {
                        i13 = 1;
                        i14 = 2;
                        i15 = i10;
                        optJSONObject = jSONObject2.optJSONObject("breakStatus");
                        Parcelable.Creator<c> creator = c.CREATOR;
                        long j12 = -1;
                        if (optJSONObject != null) {
                            long j13 = optJSONObject.getLong("currentBreakTime");
                            Pattern pattern3 = j6.a.a;
                            long j14 = j13 * 1000;
                            long j15 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                            String a11 = j6.a.a("breakId", optJSONObject);
                            String a12 = j6.a.a("breakClipId", optJSONObject);
                            optLong = optJSONObject.optLong("whenSkippable", -1L);
                            if (optLong != -1) {
                            }
                            cVar = new c(j14, j15, a11, a12, optLong);
                            cVar2 = this.I;
                            if (cVar2 == null) {
                            }
                            this.H = (cVar != null || (cVar.c == null && cVar.d == null)) ? 0 : i13;
                            this.I = cVar;
                            i15 |= 32;
                            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                            j6.b bVar = u.d;
                            if (optJSONObject2 == null) {
                            }
                            uVar = null;
                            uVar2 = this.J;
                            if (uVar2 == null) {
                            }
                            this.J = uVar;
                            i15 |= 64;
                            if (jSONObject2.has("breakInfo")) {
                            }
                            if (jSONObject2.has("queueData")) {
                            }
                            i19 = i18;
                            if (jSONObject2.has("liveSeekableRange")) {
                            }
                            return i19;
                        }
                        cVar = null;
                        cVar2 = this.I;
                        if (cVar2 == null) {
                        }
                        this.H = (cVar != null || (cVar.c == null && cVar.d == null)) ? 0 : i13;
                        this.I = cVar;
                        i15 |= 32;
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        j6.b bVar2 = u.d;
                        if (optJSONObject2 == null) {
                        }
                        uVar = null;
                        uVar2 = this.J;
                        if (uVar2 == null) {
                        }
                        this.J = uVar;
                        i15 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        i19 = i18;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i19;
                    }
                    this.F = 0;
                    arrayList6.clear();
                    sparseArray.clear();
                    i15 = i10 | 8;
                    i13 = 1;
                    i14 = 2;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<c> creator2 = c.CREATOR;
                    long j122 = -1;
                    if (optJSONObject != null && optJSONObject.has("currentBreakTime") && optJSONObject.has("currentBreakClipTime")) {
                        try {
                            long j132 = optJSONObject.getLong("currentBreakTime");
                            Pattern pattern32 = j6.a.a;
                            long j142 = j132 * 1000;
                            long j152 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                            String a112 = j6.a.a("breakId", optJSONObject);
                            String a122 = j6.a.a("breakClipId", optJSONObject);
                            optLong = optJSONObject.optLong("whenSkippable", -1L);
                            if (optLong != -1) {
                                optLong *= 1000;
                            }
                            cVar = new c(j142, j152, a112, a122, optLong);
                        } catch (JSONException e10) {
                            j6.b bVar3 = c.f;
                            Log.e(bVar3.a, bVar3.d("Error while creating an AdBreakClipInfo from JSON", new Object[0]), e10);
                        }
                        cVar2 = this.I;
                        if ((cVar2 == null && cVar != null) || (cVar2 != null && !cVar2.equals(cVar))) {
                            this.H = (cVar != null || (cVar.c == null && cVar.d == null)) ? 0 : i13;
                            this.I = cVar;
                            i15 |= 32;
                        }
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        j6.b bVar22 = u.d;
                        if (optJSONObject2 == null) {
                            try {
                                String string3 = optJSONObject2.getString("hdrType");
                                int hashCode = string3.hashCode();
                                if (hashCode == 3218) {
                                    if (string3.equals("dv")) {
                                        i16 = i13;
                                        i17 = 3;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i17);
                                    }
                                    i16 = i13;
                                    Object[] objArr = new Object[i16];
                                    objArr[0] = string3;
                                    bVar22.b("Unknown HDR type: %s", objArr);
                                    i17 = 0;
                                    uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i17);
                                } else if (hashCode == 103158) {
                                    if (string3.equals("hdr")) {
                                        i16 = i13;
                                        i17 = 4;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i17);
                                    }
                                    i16 = i13;
                                    Object[] objArr2 = new Object[i16];
                                    objArr2[0] = string3;
                                    bVar22.b("Unknown HDR type: %s", objArr2);
                                    i17 = 0;
                                    uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i17);
                                } else if (hashCode != 113729) {
                                    try {
                                        if (hashCode == 99136405 && string3.equals("hdr10")) {
                                            i17 = i14;
                                            i16 = i13;
                                            uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i17);
                                        }
                                        Object[] objArr22 = new Object[i16];
                                        objArr22[0] = string3;
                                        bVar22.b("Unknown HDR type: %s", objArr22);
                                        i17 = 0;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i17);
                                    } catch (JSONException e11) {
                                        e = e11;
                                        bVar22.a(e, "Error while creating a VideoInfo instance from JSON", new Object[0]);
                                        uVar = null;
                                        uVar2 = this.J;
                                        if (uVar2 == null) {
                                        }
                                        this.J = uVar;
                                        i15 |= 64;
                                        if (jSONObject2.has("breakInfo")) {
                                        }
                                        if (jSONObject2.has("queueData")) {
                                        }
                                        i19 = i18;
                                        if (jSONObject2.has("liveSeekableRange")) {
                                        }
                                        return i19;
                                    }
                                    i16 = i13;
                                } else {
                                    if (string3.equals("sdr")) {
                                        i17 = i13;
                                        i16 = i17;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i17);
                                    }
                                    i16 = i13;
                                    Object[] objArr222 = new Object[i16];
                                    objArr222[0] = string3;
                                    bVar22.b("Unknown HDR type: %s", objArr222);
                                    i17 = 0;
                                    uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i17);
                                }
                            } catch (JSONException e12) {
                                e = e12;
                                i16 = i13;
                            }
                            uVar2 = this.J;
                            if ((uVar2 == null && uVar != null) || (uVar2 != null && !uVar2.equals(uVar))) {
                                this.J = uVar;
                                i15 |= 64;
                            }
                            if (jSONObject2.has("breakInfo") && (mediaInfo2 = this.a) != null) {
                                mediaInfo2.c(jSONObject2.getJSONObject("breakInfo"));
                                i15 |= 2;
                            }
                            if (jSONObject2.has("queueData")) {
                                JSONObject jSONObject5 = jSONObject2.getJSONObject("queueData");
                                if (jSONObject5 == null) {
                                    i18 = i15;
                                    arrayList2 = null;
                                    mVar = null;
                                    str4 = null;
                                    str3 = null;
                                    i23 = 0;
                                    i22 = 0;
                                    optBoolean = false;
                                    a10 = null;
                                    i21 = 0;
                                } else {
                                    String a13 = j6.a.a("id", jSONObject5);
                                    String a14 = j6.a.a("entity", jSONObject5);
                                    String optString = jSONObject5.optString("queueType");
                                    switch (optString.hashCode()) {
                                        case -1803151310:
                                            if (optString.equals("PODCAST_SERIES")) {
                                                i20 = 5;
                                                break;
                                            }
                                            i20 = 0;
                                            break;
                                        case -1758903120:
                                            if (optString.equals("RADIO_STATION")) {
                                                i20 = 4;
                                                break;
                                            }
                                            i20 = 0;
                                            break;
                                        case -1632865838:
                                            if (optString.equals("PLAYLIST")) {
                                                i20 = i14;
                                                break;
                                            }
                                            i20 = 0;
                                            break;
                                        case -1319760993:
                                            if (optString.equals("AUDIOBOOK")) {
                                                i20 = 3;
                                                break;
                                            }
                                            i20 = 0;
                                            break;
                                        case -1088524588:
                                            if (optString.equals("TV_SERIES")) {
                                                i20 = 6;
                                                break;
                                            }
                                            i20 = 0;
                                            break;
                                        case 62359119:
                                            if (optString.equals("ALBUM")) {
                                                i20 = i16;
                                                break;
                                            }
                                            i20 = 0;
                                            break;
                                        case 73549584:
                                            if (optString.equals("MOVIE")) {
                                                i20 = 9;
                                                break;
                                            }
                                            i20 = 0;
                                            break;
                                        case 393100598:
                                            if (optString.equals("VIDEO_PLAYLIST")) {
                                                i20 = 7;
                                                break;
                                            }
                                            i20 = 0;
                                            break;
                                        case 902303413:
                                            if (optString.equals("LIVE_TV")) {
                                                i20 = 8;
                                                break;
                                            }
                                            i20 = 0;
                                            break;
                                        default:
                                            i20 = 0;
                                            break;
                                    }
                                    a10 = j6.a.a("name", jSONObject5);
                                    JSONObject optJSONObject4 = jSONObject5.has("containerMetadata") ? jSONObject5.optJSONObject("containerMetadata") : null;
                                    if (optJSONObject4 != null) {
                                        String optString2 = optJSONObject4.optString("containerType", "");
                                        int hashCode2 = optString2.hashCode();
                                        if (hashCode2 != 6924225) {
                                            if (hashCode2 == 828666841) {
                                                optString2.equals("GENERIC_CONTAINER");
                                            }
                                        } else if (optString2.equals("AUDIOBOOK_CONTAINER")) {
                                            i24 = 1;
                                            String a15 = j6.a.a("title", optJSONObject4);
                                            optJSONArray = optJSONObject4.optJSONArray("sections");
                                            if (optJSONArray == null) {
                                                arrayList3 = new ArrayList();
                                                i18 = i15;
                                                int i35 = 0;
                                                while (i35 < optJSONArray.length()) {
                                                    JSONObject optJSONObject5 = optJSONArray.optJSONObject(i35);
                                                    int i36 = i35;
                                                    if (optJSONObject5 != null) {
                                                        str5 = a13;
                                                        l lVar = new l(0);
                                                        lVar.e(optJSONObject5);
                                                        arrayList3.add(lVar);
                                                    } else {
                                                        str5 = a13;
                                                    }
                                                    i35 = i36 + 1;
                                                    a13 = str5;
                                                }
                                            } else {
                                                i18 = i15;
                                                arrayList3 = null;
                                            }
                                            str = a13;
                                            optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                            if (optJSONArray2 == null) {
                                                arrayList4 = new ArrayList();
                                                k6.a.c(arrayList4, optJSONArray2);
                                            } else {
                                                arrayList4 = null;
                                            }
                                            str2 = a14;
                                            i21 = i20;
                                            double optDouble = optJSONObject4.optDouble("containerDuration", 0.0d);
                                            mVar = new m();
                                            mVar.a = i24;
                                            mVar.b = a15;
                                            mVar.c = arrayList3;
                                            mVar.d = arrayList4;
                                            mVar.e = optDouble;
                                        }
                                        i24 = 0;
                                        String a152 = j6.a.a("title", optJSONObject4);
                                        optJSONArray = optJSONObject4.optJSONArray("sections");
                                        if (optJSONArray == null) {
                                        }
                                        str = a13;
                                        optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                        if (optJSONArray2 == null) {
                                        }
                                        str2 = a14;
                                        i21 = i20;
                                        double optDouble2 = optJSONObject4.optDouble("containerDuration", 0.0d);
                                        mVar = new m();
                                        mVar.a = i24;
                                        mVar.b = a152;
                                        mVar.c = arrayList3;
                                        mVar.d = arrayList4;
                                        mVar.e = optDouble2;
                                    } else {
                                        i18 = i15;
                                        str = a13;
                                        str2 = a14;
                                        i21 = i20;
                                        mVar = null;
                                    }
                                    Integer a16 = y0.a(jSONObject5.optString("repeatMode"));
                                    int intValue = a16 != null ? a16.intValue() : 0;
                                    JSONArray optJSONArray3 = jSONObject5.optJSONArray("items");
                                    if (optJSONArray3 != null) {
                                        arrayList = new ArrayList();
                                        for (int i37 = 0; i37 < optJSONArray3.length(); i37++) {
                                            JSONObject optJSONObject6 = optJSONArray3.optJSONObject(i37);
                                            if (optJSONObject6 != null) {
                                                try {
                                                    arrayList.add(new o(optJSONObject6));
                                                } catch (JSONException unused2) {
                                                }
                                            }
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                    int optInt3 = jSONObject5.optInt("startIndex", 0);
                                    long optDouble3 = jSONObject5.has("startTime") ? (long) (jSONObject5.optDouble("startTime", -1L) * d12) : -1L;
                                    optBoolean = jSONObject5.optBoolean("shuffle");
                                    arrayList2 = arrayList;
                                    long j16 = optDouble3;
                                    i22 = optInt3;
                                    i23 = intValue;
                                    j122 = j16;
                                    str3 = str2;
                                    str4 = str;
                                }
                                n nVar = new n();
                                nVar.a = str4;
                                nVar.b = str3;
                                nVar.c = i21;
                                nVar.d = a10;
                                nVar.e = mVar;
                                nVar.f = i23;
                                nVar.h = arrayList2;
                                nVar.n = i22;
                                nVar.r = j122;
                                nVar.s = optBoolean;
                                this.L = nVar;
                                if (this.M != optBoolean) {
                                    this.M = optBoolean;
                                    i19 = i18 | 8;
                                    if (jSONObject2.has("liveSeekableRange")) {
                                        if (this.K != null) {
                                            i19 |= 2;
                                        }
                                        this.K = null;
                                    } else {
                                        i19 |= 2;
                                        JSONObject optJSONObject7 = jSONObject2.optJSONObject("liveSeekableRange");
                                        Parcelable.Creator<j> creator3 = j.CREATOR;
                                        if (optJSONObject7 != null && optJSONObject7.has("start") && optJSONObject7.has("end")) {
                                            try {
                                                double d13 = optJSONObject7.getDouble("start");
                                                Pattern pattern4 = j6.a.a;
                                                jVar = new j((long) (d13 * d12), (long) (optJSONObject7.getDouble("end") * d12), optJSONObject7.optBoolean("isMovingWindow"), optJSONObject7.optBoolean("isLiveDone"));
                                            } catch (JSONException unused3) {
                                                j6.b bVar4 = j.e;
                                                Log.e(bVar4.a, bVar4.d("Ignoring Malformed MediaLiveSeekableRange: ".concat(optJSONObject7.toString()), new Object[0]));
                                            }
                                            this.K = jVar;
                                        }
                                        jVar = null;
                                        this.K = jVar;
                                    }
                                    return i19;
                                }
                            } else {
                                i18 = i15;
                            }
                            i19 = i18;
                            if (jSONObject2.has("liveSeekableRange")) {
                            }
                            return i19;
                        }
                        i16 = i13;
                        uVar = null;
                        uVar2 = this.J;
                        if (uVar2 == null) {
                            this.J = uVar;
                            i15 |= 64;
                            if (jSONObject2.has("breakInfo")) {
                                mediaInfo2.c(jSONObject2.getJSONObject("breakInfo"));
                                i15 |= 2;
                            }
                            if (jSONObject2.has("queueData")) {
                            }
                            i19 = i18;
                            if (jSONObject2.has("liveSeekableRange")) {
                            }
                            return i19;
                        }
                        this.J = uVar;
                        i15 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        i19 = i18;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i19;
                    }
                    cVar = null;
                    cVar2 = this.I;
                    if (cVar2 == null) {
                        this.H = (cVar != null || (cVar.c == null && cVar.d == null)) ? 0 : i13;
                        this.I = cVar;
                        i15 |= 32;
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        j6.b bVar222 = u.d;
                        if (optJSONObject2 == null) {
                        }
                        uVar = null;
                        uVar2 = this.J;
                        if (uVar2 == null) {
                        }
                        this.J = uVar;
                        i15 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        i19 = i18;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i19;
                    }
                    this.H = (cVar != null || (cVar.c == null && cVar.d == null)) ? 0 : i13;
                    this.I = cVar;
                    i15 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    j6.b bVar2222 = u.d;
                    if (optJSONObject2 == null) {
                    }
                    uVar = null;
                    uVar2 = this.J;
                    if (uVar2 == null) {
                    }
                    this.J = uVar;
                    i15 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    i19 = i18;
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i19;
                }
            }
            if (jSONObject2.has("repeatMode")) {
                Integer a17 = y0.a(jSONObject2.getString("repeatMode"));
                int intValue2 = a17 == null ? this.F : a17.intValue();
                if (this.F != intValue2) {
                    this.F = intValue2;
                    i12 = 1;
                    if (jSONObject2.has("items")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("items");
                        int length = jSONArray2.length();
                        SparseArray sparseArray2 = new SparseArray();
                        int i38 = 0;
                        while (i38 < length) {
                            sparseArray2.put(i38, Integer.valueOf(jSONArray2.getJSONObject(i38).getInt("itemId")));
                            i38++;
                            i27 = i27;
                        }
                        i14 = i27;
                        ArrayList arrayList7 = new ArrayList();
                        int i39 = 0;
                        while (i39 < length) {
                            Integer num = (Integer) sparseArray2.get(i39);
                            int i40 = i26;
                            JSONObject jSONObject6 = jSONArray2.getJSONObject(i39);
                            Integer num2 = (Integer) sparseArray.get(num.intValue());
                            o oVar = num2 == null ? null : (o) arrayList6.get(num2.intValue());
                            if (oVar != null) {
                                i12 |= oVar.b(jSONObject6) ? 1 : 0;
                                arrayList7.add(oVar);
                                if (i39 == ((Integer) sparseArray.get(num.intValue())).intValue()) {
                                    i39++;
                                    i26 = i40;
                                }
                            } else if (num.intValue() != this.c || (mediaInfo = this.a) == null) {
                                arrayList7.add(new o(jSONObject6));
                            } else {
                                o n10 = new cb.c(mediaInfo).n();
                                n10.b(jSONObject6);
                                arrayList7.add(n10);
                            }
                            i12 = i40;
                            i39++;
                            i26 = i40;
                        }
                        i13 = i26;
                        i12 |= (arrayList6.size() != length ? 0 : i13) ^ 1;
                        c(arrayList7);
                    } else {
                        i13 = 1;
                        i14 = 2;
                    }
                    if (i12 != 0) {
                        i10 |= 8;
                    }
                    i15 = i10;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<c> creator22 = c.CREATOR;
                    long j1222 = -1;
                    if (optJSONObject != null) {
                    }
                    cVar = null;
                    cVar2 = this.I;
                    if (cVar2 == null) {
                    }
                    this.H = (cVar != null || (cVar.c == null && cVar.d == null)) ? 0 : i13;
                    this.I = cVar;
                    i15 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    j6.b bVar22222 = u.d;
                    if (optJSONObject2 == null) {
                    }
                    uVar = null;
                    uVar2 = this.J;
                    if (uVar2 == null) {
                    }
                    this.J = uVar;
                    i15 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    i19 = i18;
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i19;
                }
            }
            i12 = 0;
            if (jSONObject2.has("items")) {
            }
            if (i12 != 0) {
            }
            i15 = i10;
            optJSONObject = jSONObject2.optJSONObject("breakStatus");
            Parcelable.Creator<c> creator222 = c.CREATOR;
            long j12222 = -1;
            if (optJSONObject != null) {
            }
            cVar = null;
            cVar2 = this.I;
            if (cVar2 == null) {
            }
            this.H = (cVar != null || (cVar.c == null && cVar.d == null)) ? 0 : i13;
            this.I = cVar;
            i15 |= 32;
            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
            j6.b bVar222222 = u.d;
            if (optJSONObject2 == null) {
            }
            uVar = null;
            uVar2 = this.J;
            if (uVar2 == null) {
            }
            this.J = uVar;
            i15 |= 64;
            if (jSONObject2.has("breakInfo")) {
            }
            if (jSONObject2.has("queueData")) {
            }
            i19 = i18;
            if (jSONObject2.has("liveSeekableRange")) {
            }
            return i19;
        }
        jSONObject2 = jSONObject;
        j3 = jSONObject2.getLong("mediaSessionId");
        int i262 = 1;
        if (j3 == this.b) {
        }
        int i272 = 2;
        if (jSONObject2.has("playerState")) {
        }
        if (jSONObject2.has("playbackRate")) {
        }
        if (jSONObject2.has("currentTime")) {
        }
        if (jSONObject2.has("supportedMediaCommands")) {
        }
        if (jSONObject2.has("volume")) {
        }
        d = 1000.0d;
        if (!jSONObject2.has("activeTrackIds")) {
        }
        Pattern pattern22 = j6.a.a;
        if (jSONArray != null) {
        }
        if (jArr == null) {
        }
        if (jSONObject2.has("customData")) {
        }
        if (jSONObject2.has("media")) {
        }
        if (jSONObject2.has("currentItemId")) {
            this.c = i25;
            i10 |= 2;
        }
        optInt = jSONObject2.optInt("preloadedItemId", 0);
        if (this.y != optInt) {
        }
        optInt2 = jSONObject2.optInt("loadingItemId", 0);
        if (this.x != optInt2) {
        }
        MediaInfo mediaInfo52 = this.a;
        if (mediaInfo52 != null) {
        }
        i11 = this.e;
        int i332 = this.f;
        int i342 = this.x;
        SparseArray sparseArray3 = this.N;
        ArrayList arrayList62 = this.G;
        double d122 = d;
        if (i11 == 1) {
        }
        if (jSONObject2.has("repeatMode")) {
        }
        i12 = 0;
        if (jSONObject2.has("items")) {
        }
        if (i12 != 0) {
        }
        i15 = i10;
        optJSONObject = jSONObject2.optJSONObject("breakStatus");
        Parcelable.Creator<c> creator2222 = c.CREATOR;
        long j122222 = -1;
        if (optJSONObject != null) {
        }
        cVar = null;
        cVar2 = this.I;
        if (cVar2 == null) {
        }
        this.H = (cVar != null || (cVar.c == null && cVar.d == null)) ? 0 : i13;
        this.I = cVar;
        i15 |= 32;
        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
        j6.b bVar2222222 = u.d;
        if (optJSONObject2 == null) {
        }
        uVar = null;
        uVar2 = this.J;
        if (uVar2 == null) {
        }
        this.J = uVar;
        i15 |= 64;
        if (jSONObject2.has("breakInfo")) {
        }
        if (jSONObject2.has("queueData")) {
        }
        i19 = i18;
        if (jSONObject2.has("liveSeekableRange")) {
        }
        return i19;
    }

    public final void c(List list) {
        ArrayList arrayList = this.G;
        arrayList.clear();
        SparseArray sparseArray = this.N;
        sparseArray.clear();
        if (list != null) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                o oVar = (o) list.get(i7);
                arrayList.add(oVar);
                sparseArray.put(oVar.b, Integer.valueOf(i7));
            }
        }
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if ((this.E == null) == (qVar.E == null) && this.b == qVar.b && this.c == qVar.c && this.d == qVar.d && this.e == qVar.e && this.f == qVar.f && this.h == qVar.h && this.r == qVar.r && this.s == qVar.s && this.x == qVar.x && this.y == qVar.y && this.F == qVar.F && Arrays.equals(this.w, qVar.w) && j6.a.d(Long.valueOf(this.n), Long.valueOf(qVar.n)) && j6.a.d(this.G, qVar.G) && j6.a.d(this.a, qVar.a) && (((jSONObject = this.E) == null || (jSONObject2 = qVar.E) == null || x6.c.a(jSONObject, jSONObject2)) && this.H == qVar.H && j6.a.d(this.I, qVar.I) && j6.a.d(this.J, qVar.J) && j6.a.d(this.K, qVar.K) && q6.m.k(this.L, qVar.L) && this.M == qVar.M)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.h), Long.valueOf(this.n), Double.valueOf(this.r), Boolean.valueOf(this.s), Integer.valueOf(Arrays.hashCode(this.w)), Integer.valueOf(this.x), Integer.valueOf(this.y), String.valueOf(this.E), Integer.valueOf(this.F), this.G, Boolean.valueOf(this.H), this.I, this.J, this.K, this.L});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        JSONObject jSONObject = this.E;
        this.D = jSONObject == null ? null : jSONObject.toString();
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.a, i7);
        long j3 = this.b;
        xb.q(parcel, 3, 8);
        parcel.writeLong(j3);
        int i10 = this.c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        double d = this.d;
        xb.q(parcel, 5, 8);
        parcel.writeDouble(d);
        int i11 = this.e;
        xb.q(parcel, 6, 4);
        parcel.writeInt(i11);
        int i12 = this.f;
        xb.q(parcel, 7, 4);
        parcel.writeInt(i12);
        long j10 = this.h;
        xb.q(parcel, 8, 8);
        parcel.writeLong(j10);
        long j11 = this.n;
        xb.q(parcel, 9, 8);
        parcel.writeLong(j11);
        double d2 = this.r;
        xb.q(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z9 = this.s;
        xb.q(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.j(parcel, 12, this.w);
        int i13 = this.x;
        xb.q(parcel, 13, 4);
        parcel.writeInt(i13);
        int i14 = this.y;
        xb.q(parcel, 14, 4);
        parcel.writeInt(i14);
        xb.l(parcel, 15, this.D);
        int i15 = this.F;
        xb.q(parcel, 16, 4);
        parcel.writeInt(i15);
        xb.p(parcel, 17, this.G);
        boolean z10 = this.H;
        xb.q(parcel, 18, 4);
        parcel.writeInt(z10 ? 1 : 0);
        xb.k(parcel, 19, this.I, i7);
        xb.k(parcel, 20, this.J, i7);
        xb.k(parcel, 21, this.K, i7);
        xb.k(parcel, 22, this.L, i7);
        xb.s(parcel, r10);
    }
}
