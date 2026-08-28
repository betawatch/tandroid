package m5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import g7.e7;
import g7.p8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q extends y5.a {
    public static final Parcelable.Creator<q> CREATOR;
    public JSONObject A;
    public int B;
    public boolean D;
    public c E;
    public u F;
    public j G;
    public n H;
    public boolean I;
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
    public final ArrayList C = new ArrayList();
    public final SparseArray J = new SparseArray();

    static {
        x5.l.g("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j10, int i9, double d, int i10, int i11, long j11, long j12, double d9, boolean z10, long[] jArr, int i12, int i13, String str, int i14, ArrayList arrayList, boolean z11, c cVar, u uVar, j jVar, n nVar) {
        this.a = mediaInfo;
        this.b = j10;
        this.c = i9;
        this.d = d;
        this.e = i10;
        this.f = i11;
        this.h = j11;
        this.n = j12;
        this.r = d9;
        this.s = z10;
        this.v = jArr;
        this.w = i12;
        this.x = i13;
        this.y = str;
        if (str != null) {
            try {
                this.A = new JSONObject(this.y);
            } catch (JSONException unused) {
                this.A = null;
                this.y = null;
            }
        } else {
            this.A = null;
        }
        this.B = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        this.D = z11;
        this.E = cVar;
        this.F = uVar;
        this.G = jVar;
        this.H = nVar;
        boolean z12 = false;
        if (nVar != null && nVar.s) {
            z12 = true;
        }
        this.I = z12;
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
    public final int b(int i9, JSONObject jSONObject) {
        JSONObject jSONObject2;
        long j10;
        int i10;
        double d;
        JSONArray jSONArray;
        long[] jArr;
        int optInt;
        int optInt2;
        int i11;
        boolean z10;
        int i12;
        MediaInfo mediaInfo;
        int i13;
        JSONObject optJSONObject;
        long optLong;
        c cVar;
        c cVar2;
        JSONObject optJSONObject2;
        u uVar;
        int i14;
        u uVar2;
        int i15;
        int i16;
        j jVar;
        int i17;
        String a2;
        String str;
        String str2;
        int i18;
        m mVar;
        ArrayList arrayList;
        boolean optBoolean;
        ArrayList arrayList2;
        int i19;
        int i20;
        String str3;
        String str4;
        int i21;
        JSONArray optJSONArray;
        ArrayList arrayList3;
        JSONArray optJSONArray2;
        ArrayList arrayList4;
        String str5;
        MediaInfo mediaInfo2;
        int i22;
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
            j10 = jSONObject2.getLong("mediaSessionId");
            if (j10 == this.b) {
                this.b = j10;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (jSONObject2.has("playerState")) {
                String string = jSONObject2.getString("playerState");
                int i23 = string.equals("IDLE") ? 1 : string.equals("PLAYING") ? 2 : string.equals("PAUSED") ? 3 : string.equals("BUFFERING") ? 4 : string.equals("LOADING") ? 5 : 0;
                if (i23 != this.e) {
                    this.e = i23;
                    i10 |= 2;
                }
                if (i23 == 1 && jSONObject2.has("idleReason")) {
                    String string2 = jSONObject2.getString("idleReason");
                    int i24 = string2.equals("CANCELLED") ? 2 : string2.equals("INTERRUPTED") ? 3 : string2.equals("FINISHED") ? 1 : string2.equals("ERROR") ? 4 : 0;
                    if (i24 != this.f) {
                        this.f = i24;
                        i10 |= 2;
                    }
                }
            }
            if (jSONObject2.has("playbackRate")) {
                double d9 = jSONObject2.getDouble("playbackRate");
                if (this.d != d9) {
                    this.d = d9;
                    i10 |= 2;
                }
            }
            if (jSONObject2.has("currentTime")) {
                double d10 = jSONObject2.getDouble("currentTime");
                Pattern pattern = q5.a.a;
                long j11 = (long) (d10 * 1000.0d);
                if (j11 != this.h) {
                    this.h = j11;
                    i10 |= 2;
                }
                i10 |= 128;
            }
            if (jSONObject2.has("supportedMediaCommands")) {
                long j12 = jSONObject2.getLong("supportedMediaCommands");
                if (j12 != this.n) {
                    this.n = j12;
                    i10 |= 2;
                }
            }
            if (jSONObject2.has("volume") || i9 != 0) {
                d = 1000.0d;
            } else {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("volume");
                double d11 = jSONObject3.getDouble("level");
                d = 1000.0d;
                if (d11 != this.r) {
                    this.r = d11;
                    i10 |= 2;
                }
                boolean z11 = jSONObject3.getBoolean("muted");
                if (z11 != this.s) {
                    this.s = z11;
                    i10 |= 2;
                }
            }
            jSONArray = !jSONObject2.has("activeTrackIds") ? jSONObject2.getJSONArray("activeTrackIds") : null;
            Pattern pattern2 = q5.a.a;
            if (jSONArray != null) {
                jArr = null;
            } else {
                jArr = new long[jSONArray.length()];
                for (int i25 = 0; i25 < jSONArray.length(); i25++) {
                    jArr[i25] = jSONArray.getLong(i25);
                }
            }
            if (jArr == null) {
                long[] jArr2 = this.v;
                if (jArr2 != null && jArr2.length == jArr.length) {
                    for (int i26 = 0; i26 < jArr.length; i26++) {
                        if (this.v[i26] == jArr[i26]) {
                        }
                    }
                }
                this.v = jArr;
                i10 |= 2;
                break;
            }
            if (jSONObject2.has("customData")) {
                this.A = jSONObject2.getJSONObject("customData");
                this.y = null;
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
            if (jSONObject2.has("currentItemId") && this.c != (i22 = jSONObject2.getInt("currentItemId"))) {
                this.c = i22;
                i10 |= 2;
            }
            optInt = jSONObject2.optInt("preloadedItemId", 0);
            if (this.x != optInt) {
                this.x = optInt;
                i10 |= 16;
            }
            optInt2 = jSONObject2.optInt("loadingItemId", 0);
            if (this.w != optInt2) {
                this.w = optInt2;
                i10 |= 2;
            }
            MediaInfo mediaInfo5 = this.a;
            int i27 = mediaInfo5 != null ? -1 : mediaInfo5.b;
            i11 = this.e;
            int i28 = this.f;
            int i29 = this.w;
            SparseArray sparseArray = this.J;
            ArrayList arrayList6 = this.C;
            double d12 = d;
            if (i11 == 1) {
                if (i28 != 1) {
                    if (i28 != 2) {
                    }
                    this.c = 0;
                    this.w = 0;
                    this.x = 0;
                    if (arrayList6.isEmpty()) {
                        i13 = i10;
                        optJSONObject = jSONObject2.optJSONObject("breakStatus");
                        Parcelable.Creator<c> creator = c.CREATOR;
                        long j13 = -1;
                        if (optJSONObject != null) {
                            long j14 = optJSONObject.getLong("currentBreakTime");
                            Pattern pattern3 = q5.a.a;
                            long j15 = j14 * 1000;
                            long j16 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                            String a3 = q5.a.a("breakId", optJSONObject);
                            String a10 = q5.a.a("breakClipId", optJSONObject);
                            optLong = optJSONObject.optLong("whenSkippable", -1L);
                            if (optLong != -1) {
                            }
                            cVar = new c(j15, j16, a3, a10, optLong);
                            cVar2 = this.E;
                            if (cVar2 == null) {
                            }
                            this.D = cVar == null && !(cVar.c == null && cVar.d == null);
                            this.E = cVar;
                            i13 |= 32;
                            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                            q5.b bVar = u.d;
                            if (optJSONObject2 != null) {
                            }
                            uVar2 = this.F;
                            if (uVar2 == null) {
                            }
                            this.F = uVar;
                            i13 |= 64;
                            if (jSONObject2.has("breakInfo")) {
                            }
                            if (jSONObject2.has("queueData")) {
                            }
                            i16 = i15;
                            if (jSONObject2.has("liveSeekableRange")) {
                            }
                            return i16;
                        }
                        cVar = null;
                        cVar2 = this.E;
                        if (cVar2 == null) {
                        }
                        this.D = cVar == null && !(cVar.c == null && cVar.d == null);
                        this.E = cVar;
                        i13 |= 32;
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        q5.b bVar2 = u.d;
                        if (optJSONObject2 != null) {
                        }
                        uVar2 = this.F;
                        if (uVar2 == null) {
                        }
                        this.F = uVar;
                        i13 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        i16 = i15;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i16;
                    }
                    this.B = 0;
                    arrayList6.clear();
                    sparseArray.clear();
                    i13 = i10 | 8;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<c> creator2 = c.CREATOR;
                    long j132 = -1;
                    if (optJSONObject != null && optJSONObject.has("currentBreakTime") && optJSONObject.has("currentBreakClipTime")) {
                        try {
                            long j142 = optJSONObject.getLong("currentBreakTime");
                            Pattern pattern32 = q5.a.a;
                            long j152 = j142 * 1000;
                            long j162 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                            String a32 = q5.a.a("breakId", optJSONObject);
                            String a102 = q5.a.a("breakClipId", optJSONObject);
                            optLong = optJSONObject.optLong("whenSkippable", -1L);
                            if (optLong != -1) {
                                optLong *= 1000;
                            }
                            cVar = new c(j152, j162, a32, a102, optLong);
                        } catch (JSONException e10) {
                            q5.b bVar3 = c.f;
                            Log.e(bVar3.a, bVar3.d("Error while creating an AdBreakClipInfo from JSON", new Object[0]), e10);
                        }
                        cVar2 = this.E;
                        if ((cVar2 == null && cVar != null) || (cVar2 != null && !cVar2.equals(cVar))) {
                            this.D = cVar == null && !(cVar.c == null && cVar.d == null);
                            this.E = cVar;
                            i13 |= 32;
                        }
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        q5.b bVar22 = u.d;
                        if (optJSONObject2 != null) {
                            uVar = null;
                        } else {
                            try {
                                String string3 = optJSONObject2.getString("hdrType");
                                int hashCode = string3.hashCode();
                                if (hashCode == 3218) {
                                    if (string3.equals("dv")) {
                                        i14 = 3;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i14);
                                    }
                                    bVar22.b("Unknown HDR type: %s", string3);
                                    i14 = 0;
                                    uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i14);
                                } else if (hashCode == 103158) {
                                    if (string3.equals("hdr")) {
                                        i14 = 4;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i14);
                                    }
                                    bVar22.b("Unknown HDR type: %s", string3);
                                    i14 = 0;
                                    uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i14);
                                } else if (hashCode != 113729) {
                                    try {
                                        if (hashCode == 99136405 && string3.equals("hdr10")) {
                                            i14 = 2;
                                            uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i14);
                                        }
                                        bVar22.b("Unknown HDR type: %s", string3);
                                        i14 = 0;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i14);
                                    } catch (JSONException e11) {
                                        e = e11;
                                        bVar22.a(e, "Error while creating a VideoInfo instance from JSON", new Object[0]);
                                        uVar = null;
                                        uVar2 = this.F;
                                        if (uVar2 == null) {
                                        }
                                        this.F = uVar;
                                        i13 |= 64;
                                        if (jSONObject2.has("breakInfo")) {
                                        }
                                        if (jSONObject2.has("queueData")) {
                                        }
                                        i16 = i15;
                                        if (jSONObject2.has("liveSeekableRange")) {
                                        }
                                        return i16;
                                    }
                                } else {
                                    if (string3.equals("sdr")) {
                                        i14 = 1;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i14);
                                    }
                                    bVar22.b("Unknown HDR type: %s", string3);
                                    i14 = 0;
                                    uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i14);
                                }
                            } catch (JSONException e12) {
                                e = e12;
                            }
                        }
                        uVar2 = this.F;
                        if ((uVar2 == null && uVar != null) || (uVar2 != null && !uVar2.equals(uVar))) {
                            this.F = uVar;
                            i13 |= 64;
                        }
                        if (jSONObject2.has("breakInfo") && (mediaInfo2 = this.a) != null) {
                            mediaInfo2.c(jSONObject2.getJSONObject("breakInfo"));
                            i13 |= 2;
                        }
                        if (jSONObject2.has("queueData")) {
                            i15 = i13;
                        } else {
                            JSONObject jSONObject5 = jSONObject2.getJSONObject("queueData");
                            if (jSONObject5 == null) {
                                i15 = i13;
                                arrayList2 = null;
                                mVar = null;
                                str4 = null;
                                str3 = null;
                                i20 = 0;
                                i19 = 0;
                                optBoolean = false;
                                a2 = null;
                                i18 = 0;
                            } else {
                                String a11 = q5.a.a("id", jSONObject5);
                                String a12 = q5.a.a("entity", jSONObject5);
                                String optString = jSONObject5.optString("queueType");
                                switch (optString.hashCode()) {
                                    case -1803151310:
                                        if (optString.equals("PODCAST_SERIES")) {
                                            i17 = 5;
                                            break;
                                        }
                                        i17 = 0;
                                        break;
                                    case -1758903120:
                                        if (optString.equals("RADIO_STATION")) {
                                            i17 = 4;
                                            break;
                                        }
                                        i17 = 0;
                                        break;
                                    case -1632865838:
                                        if (optString.equals("PLAYLIST")) {
                                            i17 = 2;
                                            break;
                                        }
                                        i17 = 0;
                                        break;
                                    case -1319760993:
                                        if (optString.equals("AUDIOBOOK")) {
                                            i17 = 3;
                                            break;
                                        }
                                        i17 = 0;
                                        break;
                                    case -1088524588:
                                        if (optString.equals("TV_SERIES")) {
                                            i17 = 6;
                                            break;
                                        }
                                        i17 = 0;
                                        break;
                                    case 62359119:
                                        if (optString.equals("ALBUM")) {
                                            i17 = 1;
                                            break;
                                        }
                                        i17 = 0;
                                        break;
                                    case 73549584:
                                        if (optString.equals("MOVIE")) {
                                            i17 = 9;
                                            break;
                                        }
                                        i17 = 0;
                                        break;
                                    case 393100598:
                                        if (optString.equals("VIDEO_PLAYLIST")) {
                                            i17 = 7;
                                            break;
                                        }
                                        i17 = 0;
                                        break;
                                    case 902303413:
                                        if (optString.equals("LIVE_TV")) {
                                            i17 = 8;
                                            break;
                                        }
                                        i17 = 0;
                                        break;
                                    default:
                                        i17 = 0;
                                        break;
                                }
                                a2 = q5.a.a("name", jSONObject5);
                                JSONObject optJSONObject4 = jSONObject5.has("containerMetadata") ? jSONObject5.optJSONObject("containerMetadata") : null;
                                if (optJSONObject4 != null) {
                                    String optString2 = optJSONObject4.optString("containerType", "");
                                    int hashCode2 = optString2.hashCode();
                                    if (hashCode2 != 6924225) {
                                        if (hashCode2 == 828666841) {
                                            optString2.equals("GENERIC_CONTAINER");
                                        }
                                    } else if (optString2.equals("AUDIOBOOK_CONTAINER")) {
                                        i21 = 1;
                                        String a13 = q5.a.a("title", optJSONObject4);
                                        optJSONArray = optJSONObject4.optJSONArray("sections");
                                        if (optJSONArray == null) {
                                            arrayList3 = new ArrayList();
                                            i15 = i13;
                                            int i30 = 0;
                                            while (i30 < optJSONArray.length()) {
                                                JSONObject optJSONObject5 = optJSONArray.optJSONObject(i30);
                                                int i31 = i30;
                                                if (optJSONObject5 != null) {
                                                    str5 = a11;
                                                    l lVar = new l(0);
                                                    lVar.e(optJSONObject5);
                                                    arrayList3.add(lVar);
                                                } else {
                                                    str5 = a11;
                                                }
                                                i30 = i31 + 1;
                                                a11 = str5;
                                            }
                                        } else {
                                            i15 = i13;
                                            arrayList3 = null;
                                        }
                                        str = a11;
                                        optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                        if (optJSONArray2 == null) {
                                            arrayList4 = new ArrayList();
                                            r5.a.c(arrayList4, optJSONArray2);
                                        } else {
                                            arrayList4 = null;
                                        }
                                        str2 = a12;
                                        i18 = i17;
                                        double optDouble = optJSONObject4.optDouble("containerDuration", 0.0d);
                                        mVar = new m();
                                        mVar.a = i21;
                                        mVar.b = a13;
                                        mVar.c = arrayList3;
                                        mVar.d = arrayList4;
                                        mVar.e = optDouble;
                                    }
                                    i21 = 0;
                                    String a132 = q5.a.a("title", optJSONObject4);
                                    optJSONArray = optJSONObject4.optJSONArray("sections");
                                    if (optJSONArray == null) {
                                    }
                                    str = a11;
                                    optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                    if (optJSONArray2 == null) {
                                    }
                                    str2 = a12;
                                    i18 = i17;
                                    double optDouble2 = optJSONObject4.optDouble("containerDuration", 0.0d);
                                    mVar = new m();
                                    mVar.a = i21;
                                    mVar.b = a132;
                                    mVar.c = arrayList3;
                                    mVar.d = arrayList4;
                                    mVar.e = optDouble2;
                                } else {
                                    i15 = i13;
                                    str = a11;
                                    str2 = a12;
                                    i18 = i17;
                                    mVar = null;
                                }
                                Integer a14 = e7.a(jSONObject5.optString("repeatMode"));
                                int intValue = a14 != null ? a14.intValue() : 0;
                                JSONArray optJSONArray3 = jSONObject5.optJSONArray("items");
                                if (optJSONArray3 != null) {
                                    arrayList = new ArrayList();
                                    for (int i32 = 0; i32 < optJSONArray3.length(); i32++) {
                                        JSONObject optJSONObject6 = optJSONArray3.optJSONObject(i32);
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
                                long j17 = optDouble3;
                                i19 = optInt3;
                                i20 = intValue;
                                j132 = j17;
                                str3 = str2;
                                str4 = str;
                            }
                            n nVar = new n();
                            nVar.a = str4;
                            nVar.b = str3;
                            nVar.c = i18;
                            nVar.d = a2;
                            nVar.e = mVar;
                            nVar.f = i20;
                            nVar.h = arrayList2;
                            nVar.n = i19;
                            nVar.r = j132;
                            nVar.s = optBoolean;
                            this.H = nVar;
                            if (this.I != optBoolean) {
                                this.I = optBoolean;
                                i16 = i15 | 8;
                                if (jSONObject2.has("liveSeekableRange")) {
                                    i16 |= 2;
                                    JSONObject optJSONObject7 = jSONObject2.optJSONObject("liveSeekableRange");
                                    Parcelable.Creator<j> creator3 = j.CREATOR;
                                    if (optJSONObject7 != null && optJSONObject7.has("start") && optJSONObject7.has("end")) {
                                        try {
                                            double d13 = optJSONObject7.getDouble("start");
                                            Pattern pattern4 = q5.a.a;
                                            jVar = new j((long) (d13 * d12), (long) (optJSONObject7.getDouble("end") * d12), optJSONObject7.optBoolean("isMovingWindow"), optJSONObject7.optBoolean("isLiveDone"));
                                        } catch (JSONException unused3) {
                                            q5.b bVar4 = j.e;
                                            Log.e(bVar4.a, bVar4.d("Ignoring Malformed MediaLiveSeekableRange: ".concat(optJSONObject7.toString()), new Object[0]));
                                        }
                                        this.G = jVar;
                                    }
                                    jVar = null;
                                    this.G = jVar;
                                } else {
                                    if (this.G != null) {
                                        i16 |= 2;
                                    }
                                    this.G = null;
                                }
                                return i16;
                            }
                        }
                        i16 = i15;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i16;
                    }
                    cVar = null;
                    cVar2 = this.E;
                    if (cVar2 == null) {
                        this.D = cVar == null && !(cVar.c == null && cVar.d == null);
                        this.E = cVar;
                        i13 |= 32;
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        q5.b bVar222 = u.d;
                        if (optJSONObject2 != null) {
                        }
                        uVar2 = this.F;
                        if (uVar2 == null) {
                            this.F = uVar;
                            i13 |= 64;
                            if (jSONObject2.has("breakInfo")) {
                                mediaInfo2.c(jSONObject2.getJSONObject("breakInfo"));
                                i13 |= 2;
                            }
                            if (jSONObject2.has("queueData")) {
                            }
                            i16 = i15;
                            if (jSONObject2.has("liveSeekableRange")) {
                            }
                            return i16;
                        }
                        this.F = uVar;
                        i13 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        i16 = i15;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i16;
                    }
                    this.D = cVar == null && !(cVar.c == null && cVar.d == null);
                    this.E = cVar;
                    i13 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    q5.b bVar2222 = u.d;
                    if (optJSONObject2 != null) {
                    }
                    uVar2 = this.F;
                    if (uVar2 == null) {
                    }
                    this.F = uVar;
                    i13 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    i16 = i15;
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i16;
                }
            }
            if (jSONObject2.has("repeatMode")) {
                Integer a15 = e7.a(jSONObject2.getString("repeatMode"));
                int intValue2 = a15 == null ? this.B : a15.intValue();
                if (this.B != intValue2) {
                    this.B = intValue2;
                    z10 = true;
                    if (jSONObject2.has("items")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("items");
                        int length = jSONArray2.length();
                        SparseArray sparseArray2 = new SparseArray();
                        for (int i33 = 0; i33 < length; i33++) {
                            sparseArray2.put(i33, Integer.valueOf(jSONArray2.getJSONObject(i33).getInt("itemId")));
                        }
                        ArrayList arrayList7 = new ArrayList();
                        while (i12 < length) {
                            Integer num = (Integer) sparseArray2.get(i12);
                            JSONObject jSONObject6 = jSONArray2.getJSONObject(i12);
                            Integer num2 = (Integer) sparseArray.get(num.intValue());
                            o oVar = num2 == null ? null : (o) arrayList6.get(num2.intValue());
                            if (oVar != null) {
                                z10 |= oVar.b(jSONObject6);
                                arrayList7.add(oVar);
                                i12 = i12 == ((Integer) sparseArray.get(num.intValue())).intValue() ? i12 + 1 : 0;
                            } else if (num.intValue() != this.c || (mediaInfo = this.a) == null) {
                                arrayList7.add(new o(jSONObject6));
                            } else {
                                o z12 = new xa.c(mediaInfo).z();
                                z12.b(jSONObject6);
                                arrayList7.add(z12);
                            }
                            z10 = true;
                        }
                        z10 |= !(arrayList6.size() == length);
                        c(arrayList7);
                    }
                    if (z10) {
                        i10 |= 8;
                    }
                    i13 = i10;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<c> creator22 = c.CREATOR;
                    long j1322 = -1;
                    if (optJSONObject != null) {
                    }
                    cVar = null;
                    cVar2 = this.E;
                    if (cVar2 == null) {
                    }
                    this.D = cVar == null && !(cVar.c == null && cVar.d == null);
                    this.E = cVar;
                    i13 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    q5.b bVar22222 = u.d;
                    if (optJSONObject2 != null) {
                    }
                    uVar2 = this.F;
                    if (uVar2 == null) {
                    }
                    this.F = uVar;
                    i13 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    i16 = i15;
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i16;
                }
            }
            z10 = false;
            if (jSONObject2.has("items")) {
            }
            if (z10) {
            }
            i13 = i10;
            optJSONObject = jSONObject2.optJSONObject("breakStatus");
            Parcelable.Creator<c> creator222 = c.CREATOR;
            long j13222 = -1;
            if (optJSONObject != null) {
            }
            cVar = null;
            cVar2 = this.E;
            if (cVar2 == null) {
            }
            this.D = cVar == null && !(cVar.c == null && cVar.d == null);
            this.E = cVar;
            i13 |= 32;
            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
            q5.b bVar222222 = u.d;
            if (optJSONObject2 != null) {
            }
            uVar2 = this.F;
            if (uVar2 == null) {
            }
            this.F = uVar;
            i13 |= 64;
            if (jSONObject2.has("breakInfo")) {
            }
            if (jSONObject2.has("queueData")) {
            }
            i16 = i15;
            if (jSONObject2.has("liveSeekableRange")) {
            }
            return i16;
        }
        jSONObject2 = jSONObject;
        j10 = jSONObject2.getLong("mediaSessionId");
        if (j10 == this.b) {
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
        Pattern pattern22 = q5.a.a;
        if (jSONArray != null) {
        }
        if (jArr == null) {
        }
        if (jSONObject2.has("customData")) {
        }
        if (jSONObject2.has("media")) {
        }
        if (jSONObject2.has("currentItemId")) {
            this.c = i22;
            i10 |= 2;
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
        i11 = this.e;
        int i282 = this.f;
        int i292 = this.w;
        SparseArray sparseArray3 = this.J;
        ArrayList arrayList62 = this.C;
        double d122 = d;
        if (i11 == 1) {
        }
        if (jSONObject2.has("repeatMode")) {
        }
        z10 = false;
        if (jSONObject2.has("items")) {
        }
        if (z10) {
        }
        i13 = i10;
        optJSONObject = jSONObject2.optJSONObject("breakStatus");
        Parcelable.Creator<c> creator2222 = c.CREATOR;
        long j132222 = -1;
        if (optJSONObject != null) {
        }
        cVar = null;
        cVar2 = this.E;
        if (cVar2 == null) {
        }
        this.D = cVar == null && !(cVar.c == null && cVar.d == null);
        this.E = cVar;
        i13 |= 32;
        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
        q5.b bVar2222222 = u.d;
        if (optJSONObject2 != null) {
        }
        uVar2 = this.F;
        if (uVar2 == null) {
        }
        this.F = uVar;
        i13 |= 64;
        if (jSONObject2.has("breakInfo")) {
        }
        if (jSONObject2.has("queueData")) {
        }
        i16 = i15;
        if (jSONObject2.has("liveSeekableRange")) {
        }
        return i16;
    }

    public final void c(List list) {
        ArrayList arrayList = this.C;
        arrayList.clear();
        SparseArray sparseArray = this.J;
        sparseArray.clear();
        if (list != null) {
            for (int i9 = 0; i9 < list.size(); i9++) {
                o oVar = (o) list.get(i9);
                arrayList.add(oVar);
                sparseArray.put(oVar.b, Integer.valueOf(i9));
            }
        }
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if ((this.A == null) == (qVar.A == null) && this.b == qVar.b && this.c == qVar.c && this.d == qVar.d && this.e == qVar.e && this.f == qVar.f && this.h == qVar.h && this.r == qVar.r && this.s == qVar.s && this.w == qVar.w && this.x == qVar.x && this.B == qVar.B && Arrays.equals(this.v, qVar.v) && q5.a.d(Long.valueOf(this.n), Long.valueOf(qVar.n)) && q5.a.d(this.C, qVar.C) && q5.a.d(this.a, qVar.a) && (((jSONObject = this.A) == null || (jSONObject2 = qVar.A) == null || e6.c.a(jSONObject, jSONObject2)) && this.D == qVar.D && q5.a.d(this.E, qVar.E) && q5.a.d(this.F, qVar.F) && q5.a.d(this.G, qVar.G) && x5.l.l(this.H, qVar.H) && this.I == qVar.I)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.h), Long.valueOf(this.n), Double.valueOf(this.r), Boolean.valueOf(this.s), Integer.valueOf(Arrays.hashCode(this.v)), Integer.valueOf(this.w), Integer.valueOf(this.x), String.valueOf(this.A), Integer.valueOf(this.B), this.C, Boolean.valueOf(this.D), this.E, this.F, this.G, this.H});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        JSONObject jSONObject = this.A;
        this.y = jSONObject == null ? null : jSONObject.toString();
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.a, i9);
        long j10 = this.b;
        p8.s(parcel, 3, 8);
        parcel.writeLong(j10);
        int i10 = this.c;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i10);
        double d = this.d;
        p8.s(parcel, 5, 8);
        parcel.writeDouble(d);
        int i11 = this.e;
        p8.s(parcel, 6, 4);
        parcel.writeInt(i11);
        int i12 = this.f;
        p8.s(parcel, 7, 4);
        parcel.writeInt(i12);
        long j11 = this.h;
        p8.s(parcel, 8, 8);
        parcel.writeLong(j11);
        long j12 = this.n;
        p8.s(parcel, 9, 8);
        parcel.writeLong(j12);
        double d9 = this.r;
        p8.s(parcel, 10, 8);
        parcel.writeDouble(d9);
        boolean z10 = this.s;
        p8.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p8.j(parcel, 12, this.v);
        int i13 = this.w;
        p8.s(parcel, 13, 4);
        parcel.writeInt(i13);
        int i14 = this.x;
        p8.s(parcel, 14, 4);
        parcel.writeInt(i14);
        p8.l(parcel, 15, this.y);
        int i15 = this.B;
        p8.s(parcel, 16, 4);
        parcel.writeInt(i15);
        p8.p(parcel, 17, this.C);
        boolean z11 = this.D;
        p8.s(parcel, 18, 4);
        parcel.writeInt(z11 ? 1 : 0);
        p8.k(parcel, 19, this.E, i9);
        p8.k(parcel, 20, this.F, i9);
        p8.k(parcel, 21, this.G, i9);
        p8.k(parcel, 22, this.H, i9);
        p8.r(parcel, q10);
    }
}
