package c6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.v7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR;
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
    public long[] v;
    public int w;
    public int x;
    public String y;
    public final ArrayList G = new ArrayList();
    public final SparseArray N = new SparseArray();

    static {
        n6.l.g("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j3, int i10, double d, int i11, int i12, long j10, long j11, double d10, boolean z10, long[] jArr, int i13, int i14, String str, int i15, ArrayList arrayList, boolean z11, c cVar, u uVar, j jVar, n nVar) {
        this.a = mediaInfo;
        this.b = j3;
        this.c = i10;
        this.d = d;
        this.e = i11;
        this.f = i12;
        this.h = j10;
        this.n = j11;
        this.r = d10;
        this.s = z10;
        this.v = jArr;
        this.w = i13;
        this.x = i14;
        this.y = str;
        if (str != null) {
            try {
                this.E = new JSONObject(this.y);
            } catch (JSONException unused) {
                this.E = null;
                this.y = null;
            }
        } else {
            this.E = null;
        }
        this.F = i15;
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        this.H = z11;
        this.I = cVar;
        this.J = uVar;
        this.K = jVar;
        this.L = nVar;
        boolean z12 = false;
        if (nVar != null && nVar.s) {
            z12 = true;
        }
        this.M = z12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0248, code lost:
    
        if (r12 != 3) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x024b, code lost:
    
        if (r2 != 2) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x024e, code lost:
    
        if (r13 == 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x01b6, code lost:
    
        if (r34.v != null) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x045e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0396 A[Catch: JSONException -> 0x03a2, TryCatch #0 {JSONException -> 0x03a2, blocks: (B:319:0x036f, B:321:0x0396, B:322:0x0398), top: B:318:0x036f }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(int i10, JSONObject jSONObject) {
        JSONObject jSONObject2;
        long j3;
        int i11;
        double d;
        JSONArray jSONArray;
        long[] jArr;
        int optInt;
        int optInt2;
        int i12;
        boolean z10;
        int i13;
        MediaInfo mediaInfo;
        int i14;
        JSONObject optJSONObject;
        long optLong;
        c cVar;
        c cVar2;
        JSONObject optJSONObject2;
        u uVar;
        int i15;
        u uVar2;
        int i16;
        int i17;
        j jVar;
        int i18;
        String a2;
        String str;
        String str2;
        int i19;
        m mVar;
        ArrayList arrayList;
        boolean optBoolean;
        ArrayList arrayList2;
        int i20;
        int i21;
        String str3;
        String str4;
        int i22;
        JSONArray optJSONArray;
        ArrayList arrayList3;
        JSONArray optJSONArray2;
        ArrayList arrayList4;
        String str5;
        MediaInfo mediaInfo2;
        int i23;
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
            if (j3 == this.b) {
                this.b = j3;
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (jSONObject2.has("playerState")) {
                String string = jSONObject2.getString("playerState");
                int i24 = string.equals("IDLE") ? 1 : string.equals("PLAYING") ? 2 : string.equals("PAUSED") ? 3 : string.equals("BUFFERING") ? 4 : string.equals("LOADING") ? 5 : 0;
                if (i24 != this.e) {
                    this.e = i24;
                    i11 |= 2;
                }
                if (i24 == 1 && jSONObject2.has("idleReason")) {
                    String string2 = jSONObject2.getString("idleReason");
                    int i25 = string2.equals("CANCELLED") ? 2 : string2.equals("INTERRUPTED") ? 3 : string2.equals("FINISHED") ? 1 : string2.equals("ERROR") ? 4 : 0;
                    if (i25 != this.f) {
                        this.f = i25;
                        i11 |= 2;
                    }
                }
            }
            if (jSONObject2.has("playbackRate")) {
                double d10 = jSONObject2.getDouble("playbackRate");
                if (this.d != d10) {
                    this.d = d10;
                    i11 |= 2;
                }
            }
            if (jSONObject2.has("currentTime")) {
                double d11 = jSONObject2.getDouble("currentTime");
                Pattern pattern = g6.a.a;
                long j10 = (long) (d11 * 1000.0d);
                if (j10 != this.h) {
                    this.h = j10;
                    i11 |= 2;
                }
                i11 |= 128;
            }
            if (jSONObject2.has("supportedMediaCommands")) {
                long j11 = jSONObject2.getLong("supportedMediaCommands");
                if (j11 != this.n) {
                    this.n = j11;
                    i11 |= 2;
                }
            }
            if (jSONObject2.has("volume") || i10 != 0) {
                d = 1000.0d;
            } else {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("volume");
                double d12 = jSONObject3.getDouble("level");
                d = 1000.0d;
                if (d12 != this.r) {
                    this.r = d12;
                    i11 |= 2;
                }
                boolean z11 = jSONObject3.getBoolean("muted");
                if (z11 != this.s) {
                    this.s = z11;
                    i11 |= 2;
                }
            }
            jSONArray = !jSONObject2.has("activeTrackIds") ? jSONObject2.getJSONArray("activeTrackIds") : null;
            Pattern pattern2 = g6.a.a;
            if (jSONArray != null) {
                jArr = null;
            } else {
                jArr = new long[jSONArray.length()];
                for (int i26 = 0; i26 < jSONArray.length(); i26++) {
                    jArr[i26] = jSONArray.getLong(i26);
                }
            }
            if (jArr == null) {
                long[] jArr2 = this.v;
                if (jArr2 != null && jArr2.length == jArr.length) {
                    for (int i27 = 0; i27 < jArr.length; i27++) {
                        if (this.v[i27] == jArr[i27]) {
                        }
                    }
                }
                this.v = jArr;
                i11 |= 2;
                break;
            }
            if (jSONObject2.has("customData")) {
                this.E = jSONObject2.getJSONObject("customData");
                this.y = null;
                i11 |= 2;
            }
            if (jSONObject2.has("media")) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("media");
                MediaInfo mediaInfo3 = new MediaInfo(jSONObject4);
                MediaInfo mediaInfo4 = this.a;
                if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                    this.a = mediaInfo3;
                    i11 |= 2;
                }
                if (jSONObject4.has("metadata")) {
                    i11 |= 4;
                }
            }
            if (jSONObject2.has("currentItemId") && this.c != (i23 = jSONObject2.getInt("currentItemId"))) {
                this.c = i23;
                i11 |= 2;
            }
            optInt = jSONObject2.optInt("preloadedItemId", 0);
            if (this.x != optInt) {
                this.x = optInt;
                i11 |= 16;
            }
            optInt2 = jSONObject2.optInt("loadingItemId", 0);
            if (this.w != optInt2) {
                this.w = optInt2;
                i11 |= 2;
            }
            MediaInfo mediaInfo5 = this.a;
            int i28 = mediaInfo5 != null ? -1 : mediaInfo5.b;
            i12 = this.e;
            int i29 = this.f;
            int i30 = this.w;
            SparseArray sparseArray = this.N;
            ArrayList arrayList6 = this.G;
            double d13 = d;
            if (i12 == 1) {
                if (i29 != 1) {
                    if (i29 != 2) {
                    }
                    this.c = 0;
                    this.w = 0;
                    this.x = 0;
                    if (arrayList6.isEmpty()) {
                        i14 = i11;
                        optJSONObject = jSONObject2.optJSONObject("breakStatus");
                        Parcelable.Creator<c> creator = c.CREATOR;
                        long j12 = -1;
                        if (optJSONObject != null) {
                            long j13 = optJSONObject.getLong("currentBreakTime");
                            Pattern pattern3 = g6.a.a;
                            long j14 = j13 * 1000;
                            long j15 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                            String a10 = g6.a.a("breakId", optJSONObject);
                            String a11 = g6.a.a("breakClipId", optJSONObject);
                            optLong = optJSONObject.optLong("whenSkippable", -1L);
                            if (optLong != -1) {
                            }
                            cVar = new c(j14, j15, a10, a11, optLong);
                            cVar2 = this.I;
                            if (cVar2 == null) {
                            }
                            this.H = cVar == null && !(cVar.c == null && cVar.d == null);
                            this.I = cVar;
                            i14 |= 32;
                            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                            g6.b bVar = u.d;
                            if (optJSONObject2 != null) {
                            }
                            uVar2 = this.J;
                            if (uVar2 == null) {
                            }
                            this.J = uVar;
                            i14 |= 64;
                            if (jSONObject2.has("breakInfo")) {
                            }
                            if (jSONObject2.has("queueData")) {
                            }
                            i17 = i16;
                            if (jSONObject2.has("liveSeekableRange")) {
                            }
                            return i17;
                        }
                        cVar = null;
                        cVar2 = this.I;
                        if (cVar2 == null) {
                        }
                        this.H = cVar == null && !(cVar.c == null && cVar.d == null);
                        this.I = cVar;
                        i14 |= 32;
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        g6.b bVar2 = u.d;
                        if (optJSONObject2 != null) {
                        }
                        uVar2 = this.J;
                        if (uVar2 == null) {
                        }
                        this.J = uVar;
                        i14 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        i17 = i16;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i17;
                    }
                    this.F = 0;
                    arrayList6.clear();
                    sparseArray.clear();
                    i14 = i11 | 8;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<c> creator2 = c.CREATOR;
                    long j122 = -1;
                    if (optJSONObject != null && optJSONObject.has("currentBreakTime") && optJSONObject.has("currentBreakClipTime")) {
                        try {
                            long j132 = optJSONObject.getLong("currentBreakTime");
                            Pattern pattern32 = g6.a.a;
                            long j142 = j132 * 1000;
                            long j152 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                            String a102 = g6.a.a("breakId", optJSONObject);
                            String a112 = g6.a.a("breakClipId", optJSONObject);
                            optLong = optJSONObject.optLong("whenSkippable", -1L);
                            if (optLong != -1) {
                                optLong *= 1000;
                            }
                            cVar = new c(j142, j152, a102, a112, optLong);
                        } catch (JSONException e7) {
                            g6.b bVar3 = c.f;
                            Log.e(bVar3.a, bVar3.d("Error while creating an AdBreakClipInfo from JSON", new Object[0]), e7);
                        }
                        cVar2 = this.I;
                        if ((cVar2 == null && cVar != null) || (cVar2 != null && !cVar2.equals(cVar))) {
                            this.H = cVar == null && !(cVar.c == null && cVar.d == null);
                            this.I = cVar;
                            i14 |= 32;
                        }
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        g6.b bVar22 = u.d;
                        if (optJSONObject2 != null) {
                            uVar = null;
                        } else {
                            try {
                                String string3 = optJSONObject2.getString("hdrType");
                                int hashCode = string3.hashCode();
                                if (hashCode == 3218) {
                                    if (string3.equals("dv")) {
                                        i15 = 3;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                    }
                                    bVar22.b("Unknown HDR type: %s", string3);
                                    i15 = 0;
                                    uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                } else if (hashCode == 103158) {
                                    if (string3.equals("hdr")) {
                                        i15 = 4;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                    }
                                    bVar22.b("Unknown HDR type: %s", string3);
                                    i15 = 0;
                                    uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                } else if (hashCode != 113729) {
                                    try {
                                        if (hashCode == 99136405 && string3.equals("hdr10")) {
                                            i15 = 2;
                                            uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                        }
                                        bVar22.b("Unknown HDR type: %s", string3);
                                        i15 = 0;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                    } catch (JSONException e10) {
                                        e = e10;
                                        bVar22.a(e, "Error while creating a VideoInfo instance from JSON", new Object[0]);
                                        uVar = null;
                                        uVar2 = this.J;
                                        if (uVar2 == null) {
                                        }
                                        this.J = uVar;
                                        i14 |= 64;
                                        if (jSONObject2.has("breakInfo")) {
                                        }
                                        if (jSONObject2.has("queueData")) {
                                        }
                                        i17 = i16;
                                        if (jSONObject2.has("liveSeekableRange")) {
                                        }
                                        return i17;
                                    }
                                } else {
                                    if (string3.equals("sdr")) {
                                        i15 = 1;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                    }
                                    bVar22.b("Unknown HDR type: %s", string3);
                                    i15 = 0;
                                    uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                }
                            } catch (JSONException e11) {
                                e = e11;
                            }
                        }
                        uVar2 = this.J;
                        if ((uVar2 == null && uVar != null) || (uVar2 != null && !uVar2.equals(uVar))) {
                            this.J = uVar;
                            i14 |= 64;
                        }
                        if (jSONObject2.has("breakInfo") && (mediaInfo2 = this.a) != null) {
                            mediaInfo2.c(jSONObject2.getJSONObject("breakInfo"));
                            i14 |= 2;
                        }
                        if (jSONObject2.has("queueData")) {
                            i16 = i14;
                        } else {
                            JSONObject jSONObject5 = jSONObject2.getJSONObject("queueData");
                            if (jSONObject5 == null) {
                                i16 = i14;
                                arrayList2 = null;
                                mVar = null;
                                str4 = null;
                                str3 = null;
                                i21 = 0;
                                i20 = 0;
                                optBoolean = false;
                                a2 = null;
                                i19 = 0;
                            } else {
                                String a12 = g6.a.a("id", jSONObject5);
                                String a13 = g6.a.a("entity", jSONObject5);
                                String optString = jSONObject5.optString("queueType");
                                switch (optString.hashCode()) {
                                    case -1803151310:
                                        if (optString.equals("PODCAST_SERIES")) {
                                            i18 = 5;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case -1758903120:
                                        if (optString.equals("RADIO_STATION")) {
                                            i18 = 4;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case -1632865838:
                                        if (optString.equals("PLAYLIST")) {
                                            i18 = 2;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case -1319760993:
                                        if (optString.equals("AUDIOBOOK")) {
                                            i18 = 3;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case -1088524588:
                                        if (optString.equals("TV_SERIES")) {
                                            i18 = 6;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case 62359119:
                                        if (optString.equals("ALBUM")) {
                                            i18 = 1;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case 73549584:
                                        if (optString.equals("MOVIE")) {
                                            i18 = 9;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case 393100598:
                                        if (optString.equals("VIDEO_PLAYLIST")) {
                                            i18 = 7;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case 902303413:
                                        if (optString.equals("LIVE_TV")) {
                                            i18 = 8;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    default:
                                        i18 = 0;
                                        break;
                                }
                                a2 = g6.a.a("name", jSONObject5);
                                JSONObject optJSONObject4 = jSONObject5.has("containerMetadata") ? jSONObject5.optJSONObject("containerMetadata") : null;
                                if (optJSONObject4 != null) {
                                    String optString2 = optJSONObject4.optString("containerType", "");
                                    int hashCode2 = optString2.hashCode();
                                    if (hashCode2 != 6924225) {
                                        if (hashCode2 == 828666841) {
                                            optString2.equals("GENERIC_CONTAINER");
                                        }
                                    } else if (optString2.equals("AUDIOBOOK_CONTAINER")) {
                                        i22 = 1;
                                        String a14 = g6.a.a("title", optJSONObject4);
                                        optJSONArray = optJSONObject4.optJSONArray("sections");
                                        if (optJSONArray == null) {
                                            arrayList3 = new ArrayList();
                                            i16 = i14;
                                            int i31 = 0;
                                            while (i31 < optJSONArray.length()) {
                                                JSONObject optJSONObject5 = optJSONArray.optJSONObject(i31);
                                                int i32 = i31;
                                                if (optJSONObject5 != null) {
                                                    str5 = a12;
                                                    l lVar = new l(0);
                                                    lVar.e(optJSONObject5);
                                                    arrayList3.add(lVar);
                                                } else {
                                                    str5 = a12;
                                                }
                                                i31 = i32 + 1;
                                                a12 = str5;
                                            }
                                        } else {
                                            i16 = i14;
                                            arrayList3 = null;
                                        }
                                        str = a12;
                                        optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                        if (optJSONArray2 == null) {
                                            arrayList4 = new ArrayList();
                                            h6.a.c(arrayList4, optJSONArray2);
                                        } else {
                                            arrayList4 = null;
                                        }
                                        str2 = a13;
                                        i19 = i18;
                                        double optDouble = optJSONObject4.optDouble("containerDuration", 0.0d);
                                        mVar = new m();
                                        mVar.a = i22;
                                        mVar.b = a14;
                                        mVar.c = arrayList3;
                                        mVar.d = arrayList4;
                                        mVar.e = optDouble;
                                    }
                                    i22 = 0;
                                    String a142 = g6.a.a("title", optJSONObject4);
                                    optJSONArray = optJSONObject4.optJSONArray("sections");
                                    if (optJSONArray == null) {
                                    }
                                    str = a12;
                                    optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                    if (optJSONArray2 == null) {
                                    }
                                    str2 = a13;
                                    i19 = i18;
                                    double optDouble2 = optJSONObject4.optDouble("containerDuration", 0.0d);
                                    mVar = new m();
                                    mVar.a = i22;
                                    mVar.b = a142;
                                    mVar.c = arrayList3;
                                    mVar.d = arrayList4;
                                    mVar.e = optDouble2;
                                } else {
                                    i16 = i14;
                                    str = a12;
                                    str2 = a13;
                                    i19 = i18;
                                    mVar = null;
                                }
                                Integer a15 = v7.a(jSONObject5.optString("repeatMode"));
                                int intValue = a15 != null ? a15.intValue() : 0;
                                JSONArray optJSONArray3 = jSONObject5.optJSONArray("items");
                                if (optJSONArray3 != null) {
                                    arrayList = new ArrayList();
                                    for (int i33 = 0; i33 < optJSONArray3.length(); i33++) {
                                        JSONObject optJSONObject6 = optJSONArray3.optJSONObject(i33);
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
                                long optDouble3 = jSONObject5.has("startTime") ? (long) (jSONObject5.optDouble("startTime", -1L) * d13) : -1L;
                                optBoolean = jSONObject5.optBoolean("shuffle");
                                arrayList2 = arrayList;
                                long j16 = optDouble3;
                                i20 = optInt3;
                                i21 = intValue;
                                j122 = j16;
                                str3 = str2;
                                str4 = str;
                            }
                            n nVar = new n();
                            nVar.a = str4;
                            nVar.b = str3;
                            nVar.c = i19;
                            nVar.d = a2;
                            nVar.e = mVar;
                            nVar.f = i21;
                            nVar.h = arrayList2;
                            nVar.n = i20;
                            nVar.r = j122;
                            nVar.s = optBoolean;
                            this.L = nVar;
                            if (this.M != optBoolean) {
                                this.M = optBoolean;
                                i17 = i16 | 8;
                                if (jSONObject2.has("liveSeekableRange")) {
                                    i17 |= 2;
                                    JSONObject optJSONObject7 = jSONObject2.optJSONObject("liveSeekableRange");
                                    Parcelable.Creator<j> creator3 = j.CREATOR;
                                    if (optJSONObject7 != null && optJSONObject7.has("start") && optJSONObject7.has("end")) {
                                        try {
                                            double d14 = optJSONObject7.getDouble("start");
                                            Pattern pattern4 = g6.a.a;
                                            jVar = new j((long) (d14 * d13), (long) (optJSONObject7.getDouble("end") * d13), optJSONObject7.optBoolean("isMovingWindow"), optJSONObject7.optBoolean("isLiveDone"));
                                        } catch (JSONException unused3) {
                                            g6.b bVar4 = j.e;
                                            Log.e(bVar4.a, bVar4.d("Ignoring Malformed MediaLiveSeekableRange: ".concat(optJSONObject7.toString()), new Object[0]));
                                        }
                                        this.K = jVar;
                                    }
                                    jVar = null;
                                    this.K = jVar;
                                } else {
                                    if (this.K != null) {
                                        i17 |= 2;
                                    }
                                    this.K = null;
                                }
                                return i17;
                            }
                        }
                        i17 = i16;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i17;
                    }
                    cVar = null;
                    cVar2 = this.I;
                    if (cVar2 == null) {
                        this.H = cVar == null && !(cVar.c == null && cVar.d == null);
                        this.I = cVar;
                        i14 |= 32;
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        g6.b bVar222 = u.d;
                        if (optJSONObject2 != null) {
                        }
                        uVar2 = this.J;
                        if (uVar2 == null) {
                            this.J = uVar;
                            i14 |= 64;
                            if (jSONObject2.has("breakInfo")) {
                                mediaInfo2.c(jSONObject2.getJSONObject("breakInfo"));
                                i14 |= 2;
                            }
                            if (jSONObject2.has("queueData")) {
                            }
                            i17 = i16;
                            if (jSONObject2.has("liveSeekableRange")) {
                            }
                            return i17;
                        }
                        this.J = uVar;
                        i14 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        i17 = i16;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i17;
                    }
                    this.H = cVar == null && !(cVar.c == null && cVar.d == null);
                    this.I = cVar;
                    i14 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    g6.b bVar2222 = u.d;
                    if (optJSONObject2 != null) {
                    }
                    uVar2 = this.J;
                    if (uVar2 == null) {
                    }
                    this.J = uVar;
                    i14 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    i17 = i16;
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i17;
                }
            }
            if (jSONObject2.has("repeatMode")) {
                Integer a16 = v7.a(jSONObject2.getString("repeatMode"));
                int intValue2 = a16 == null ? this.F : a16.intValue();
                if (this.F != intValue2) {
                    this.F = intValue2;
                    z10 = true;
                    if (jSONObject2.has("items")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("items");
                        int length = jSONArray2.length();
                        SparseArray sparseArray2 = new SparseArray();
                        for (int i34 = 0; i34 < length; i34++) {
                            sparseArray2.put(i34, Integer.valueOf(jSONArray2.getJSONObject(i34).getInt("itemId")));
                        }
                        ArrayList arrayList7 = new ArrayList();
                        while (i13 < length) {
                            Integer num = (Integer) sparseArray2.get(i13);
                            JSONObject jSONObject6 = jSONArray2.getJSONObject(i13);
                            Integer num2 = (Integer) sparseArray.get(num.intValue());
                            o oVar = num2 == null ? null : (o) arrayList6.get(num2.intValue());
                            if (oVar != null) {
                                z10 |= oVar.b(jSONObject6);
                                arrayList7.add(oVar);
                                i13 = i13 == ((Integer) sparseArray.get(num.intValue())).intValue() ? i13 + 1 : 0;
                            } else if (num.intValue() != this.c || (mediaInfo = this.a) == null) {
                                arrayList7.add(new o(jSONObject6));
                            } else {
                                o B = new xa.c(mediaInfo).B();
                                B.b(jSONObject6);
                                arrayList7.add(B);
                            }
                            z10 = true;
                        }
                        z10 |= !(arrayList6.size() == length);
                        c(arrayList7);
                    }
                    if (z10) {
                        i11 |= 8;
                    }
                    i14 = i11;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<c> creator22 = c.CREATOR;
                    long j1222 = -1;
                    if (optJSONObject != null) {
                    }
                    cVar = null;
                    cVar2 = this.I;
                    if (cVar2 == null) {
                    }
                    this.H = cVar == null && !(cVar.c == null && cVar.d == null);
                    this.I = cVar;
                    i14 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    g6.b bVar22222 = u.d;
                    if (optJSONObject2 != null) {
                    }
                    uVar2 = this.J;
                    if (uVar2 == null) {
                    }
                    this.J = uVar;
                    i14 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    i17 = i16;
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i17;
                }
            }
            z10 = false;
            if (jSONObject2.has("items")) {
            }
            if (z10) {
            }
            i14 = i11;
            optJSONObject = jSONObject2.optJSONObject("breakStatus");
            Parcelable.Creator<c> creator222 = c.CREATOR;
            long j12222 = -1;
            if (optJSONObject != null) {
            }
            cVar = null;
            cVar2 = this.I;
            if (cVar2 == null) {
            }
            this.H = cVar == null && !(cVar.c == null && cVar.d == null);
            this.I = cVar;
            i14 |= 32;
            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
            g6.b bVar222222 = u.d;
            if (optJSONObject2 != null) {
            }
            uVar2 = this.J;
            if (uVar2 == null) {
            }
            this.J = uVar;
            i14 |= 64;
            if (jSONObject2.has("breakInfo")) {
            }
            if (jSONObject2.has("queueData")) {
            }
            i17 = i16;
            if (jSONObject2.has("liveSeekableRange")) {
            }
            return i17;
        }
        jSONObject2 = jSONObject;
        j3 = jSONObject2.getLong("mediaSessionId");
        if (j3 == this.b) {
        }
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
        Pattern pattern22 = g6.a.a;
        if (jSONArray != null) {
        }
        if (jArr == null) {
        }
        if (jSONObject2.has("customData")) {
        }
        if (jSONObject2.has("media")) {
        }
        if (jSONObject2.has("currentItemId")) {
            this.c = i23;
            i11 |= 2;
        }
        optInt = jSONObject2.optInt("preloadedItemId", 0);
        if (this.x != optInt) {
        }
        optInt2 = jSONObject2.optInt("loadingItemId", 0);
        if (this.w != optInt2) {
        }
        MediaInfo mediaInfo52 = this.a;
        if (mediaInfo52 != null) {
        }
        i12 = this.e;
        int i292 = this.f;
        int i302 = this.w;
        SparseArray sparseArray3 = this.N;
        ArrayList arrayList62 = this.G;
        double d132 = d;
        if (i12 == 1) {
        }
        if (jSONObject2.has("repeatMode")) {
        }
        z10 = false;
        if (jSONObject2.has("items")) {
        }
        if (z10) {
        }
        i14 = i11;
        optJSONObject = jSONObject2.optJSONObject("breakStatus");
        Parcelable.Creator<c> creator2222 = c.CREATOR;
        long j122222 = -1;
        if (optJSONObject != null) {
        }
        cVar = null;
        cVar2 = this.I;
        if (cVar2 == null) {
        }
        this.H = cVar == null && !(cVar.c == null && cVar.d == null);
        this.I = cVar;
        i14 |= 32;
        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
        g6.b bVar2222222 = u.d;
        if (optJSONObject2 != null) {
        }
        uVar2 = this.J;
        if (uVar2 == null) {
        }
        this.J = uVar;
        i14 |= 64;
        if (jSONObject2.has("breakInfo")) {
        }
        if (jSONObject2.has("queueData")) {
        }
        i17 = i16;
        if (jSONObject2.has("liveSeekableRange")) {
        }
        return i17;
    }

    public final void c(List list) {
        ArrayList arrayList = this.G;
        arrayList.clear();
        SparseArray sparseArray = this.N;
        sparseArray.clear();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                o oVar = (o) list.get(i10);
                arrayList.add(oVar);
                sparseArray.put(oVar.b, Integer.valueOf(i10));
            }
        }
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if ((this.E == null) == (qVar.E == null) && this.b == qVar.b && this.c == qVar.c && this.d == qVar.d && this.e == qVar.e && this.f == qVar.f && this.h == qVar.h && this.r == qVar.r && this.s == qVar.s && this.w == qVar.w && this.x == qVar.x && this.F == qVar.F && Arrays.equals(this.v, qVar.v) && g6.a.d(Long.valueOf(this.n), Long.valueOf(qVar.n)) && g6.a.d(this.G, qVar.G) && g6.a.d(this.a, qVar.a) && (((jSONObject = this.E) == null || (jSONObject2 = qVar.E) == null || u6.c.a(jSONObject, jSONObject2)) && this.H == qVar.H && g6.a.d(this.I, qVar.I) && g6.a.d(this.J, qVar.J) && g6.a.d(this.K, qVar.K) && n6.l.l(this.L, qVar.L) && this.M == qVar.M)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.h), Long.valueOf(this.n), Double.valueOf(this.r), Boolean.valueOf(this.s), Integer.valueOf(Arrays.hashCode(this.v)), Integer.valueOf(this.w), Integer.valueOf(this.x), String.valueOf(this.E), Integer.valueOf(this.F), this.G, Boolean.valueOf(this.H), this.I, this.J, this.K, this.L});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.E;
        this.y = jSONObject == null ? null : jSONObject.toString();
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.a, i10);
        long j3 = this.b;
        w7.e0.s(parcel, 3, 8);
        parcel.writeLong(j3);
        int i11 = this.c;
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        double d = this.d;
        w7.e0.s(parcel, 5, 8);
        parcel.writeDouble(d);
        int i12 = this.e;
        w7.e0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        int i13 = this.f;
        w7.e0.s(parcel, 7, 4);
        parcel.writeInt(i13);
        long j10 = this.h;
        w7.e0.s(parcel, 8, 8);
        parcel.writeLong(j10);
        long j11 = this.n;
        w7.e0.s(parcel, 9, 8);
        parcel.writeLong(j11);
        double d10 = this.r;
        w7.e0.s(parcel, 10, 8);
        parcel.writeDouble(d10);
        boolean z10 = this.s;
        w7.e0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        w7.e0.j(parcel, 12, this.v);
        int i14 = this.w;
        w7.e0.s(parcel, 13, 4);
        parcel.writeInt(i14);
        int i15 = this.x;
        w7.e0.s(parcel, 14, 4);
        parcel.writeInt(i15);
        w7.e0.l(parcel, 15, this.y);
        int i16 = this.F;
        w7.e0.s(parcel, 16, 4);
        parcel.writeInt(i16);
        w7.e0.p(parcel, 17, this.G);
        boolean z11 = this.H;
        w7.e0.s(parcel, 18, 4);
        parcel.writeInt(z11 ? 1 : 0);
        w7.e0.k(parcel, 19, this.I, i10);
        w7.e0.k(parcel, 20, this.J, i10);
        w7.e0.k(parcel, 21, this.K, i10);
        w7.e0.k(parcel, 22, this.L, i10);
        w7.e0.r(parcel, q6);
    }
}
