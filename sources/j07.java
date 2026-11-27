// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class j07 extends c4 {
    public static final Parcelable.Creator<j07> CREATOR;
    public String E;
    public JSONObject F;
    public int G;
    public boolean I;
    public ba J;
    public bfc K;
    public it6 L;
    public du6 M;
    public boolean N;
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
    public final ArrayList H = new ArrayList();
    public final SparseArray O = new SparseArray();

    static {
        xve.g("MediaStatus", "The log tag cannot be null or empty.");
        CREATOR = new zkd((byte) 16);
    }

    public j07(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, ArrayList arrayList, boolean z2, ba baVar, bfc bfcVar, it6 it6Var, du6 du6Var) {
        this.a = mediaInfo;
        this.b = j;
        this.c = i;
        this.d = d;
        this.e = i2;
        this.f = i3;
        this.h = j2;
        this.n = j3;
        this.r = d2;
        this.s = z;
        this.w = jArr;
        this.x = i4;
        this.y = i5;
        this.E = str;
        if (str != null) {
            try {
                this.F = new JSONObject(this.E);
            } catch (JSONException unused) {
                this.F = null;
                this.E = null;
            }
        } else {
            this.F = null;
        }
        this.G = i6;
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        this.I = z2;
        this.J = baVar;
        this.K = bfcVar;
        this.L = it6Var;
        this.M = du6Var;
        boolean z3 = false;
        if (du6Var != null && du6Var.s) {
            z3 = true;
        }
        this.N = z3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x023b, code lost:
    
        if (r13 != 3) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x023e, code lost:
    
        if (r3 != 2) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0241, code lost:
    
        if (r2 == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x01ac, code lost:
    
        if (r2 != null) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0385 A[Catch: JSONException -> 0x0390, TryCatch #5 {JSONException -> 0x0390, blocks: (B:133:0x035f, B:135:0x0385, B:136:0x0386), top: B:132:0x035f }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0453 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(JSONObject jSONObject, int i) {
        JSONObject jSONObject2;
        long j;
        int i2;
        double d;
        JSONArray jSONArray;
        long[] jArr;
        int optInt;
        int optInt2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        MediaInfo mediaInfo;
        int i8;
        JSONObject optJSONObject;
        ba baVar;
        ba baVar2;
        JSONObject optJSONObject2;
        int i9;
        int i10;
        bfc bfcVar;
        bfc bfcVar2;
        int i11;
        int i12;
        it6 it6Var;
        int i13;
        String a;
        String str;
        String str2;
        int i14;
        cu6 cu6Var;
        ArrayList arrayList;
        int i15;
        boolean optBoolean;
        ArrayList arrayList2;
        String str3;
        int i16;
        String str4;
        int i17;
        JSONArray optJSONArray;
        ArrayList arrayList3;
        JSONArray optJSONArray2;
        ArrayList arrayList4;
        String str5;
        MediaInfo mediaInfo2;
        long optLong;
        int i18;
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
            j = jSONObject2.getLong("mediaSessionId");
            int i19 = 1;
            if (j == this.b) {
                this.b = j;
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i20 = 2;
            if (jSONObject2.has("playerState")) {
                String string = jSONObject2.getString("playerState");
                int i21 = string.equals("IDLE") ? 1 : string.equals("PLAYING") ? 2 : string.equals("PAUSED") ? 3 : string.equals("BUFFERING") ? 4 : string.equals("LOADING") ? 5 : 0;
                if (i21 != this.e) {
                    this.e = i21;
                    i2 |= 2;
                }
                if (i21 == 1 && jSONObject2.has("idleReason")) {
                    String string2 = jSONObject2.getString("idleReason");
                    int i22 = string2.equals("CANCELLED") ? 2 : string2.equals("INTERRUPTED") ? 3 : string2.equals("FINISHED") ? 1 : string2.equals("ERROR") ? 4 : 0;
                    if (i22 != this.f) {
                        this.f = i22;
                        i2 |= 2;
                    }
                }
            }
            if (jSONObject2.has("playbackRate")) {
                double d2 = jSONObject2.getDouble("playbackRate");
                if (this.d != d2) {
                    this.d = d2;
                    i2 |= 2;
                }
            }
            if (jSONObject2.has("currentTime")) {
                double d3 = jSONObject2.getDouble("currentTime");
                Pattern pattern = qd1.a;
                long j2 = (long) (d3 * 1000.0d);
                if (j2 != this.h) {
                    this.h = j2;
                    i2 |= 2;
                }
                i2 |= 128;
            }
            if (jSONObject2.has("supportedMediaCommands")) {
                long j3 = jSONObject2.getLong("supportedMediaCommands");
                if (j3 != this.n) {
                    this.n = j3;
                    i2 |= 2;
                }
            }
            if (jSONObject2.has("volume") || i != 0) {
                d = 1000.0d;
            } else {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("volume");
                double d4 = jSONObject3.getDouble("level");
                d = 1000.0d;
                if (d4 != this.r) {
                    this.r = d4;
                    i2 |= 2;
                }
                boolean z = jSONObject3.getBoolean("muted");
                if (z != this.s) {
                    this.s = z;
                    i2 |= 2;
                }
            }
            jSONArray = !jSONObject2.has("activeTrackIds") ? jSONObject2.getJSONArray("activeTrackIds") : null;
            Pattern pattern2 = qd1.a;
            if (jSONArray != null) {
                jArr = null;
            } else {
                jArr = new long[jSONArray.length()];
                for (int i23 = 0; i23 < jSONArray.length(); i23++) {
                    jArr[i23] = jSONArray.getLong(i23);
                }
            }
            long[] jArr2 = this.w;
            if (jArr == null) {
                if (jArr2 != null) {
                    if (jArr2.length == jArr.length) {
                        for (int i24 = 0; i24 < jArr.length; i24++) {
                            if (this.w[i24] == jArr[i24]) {
                            }
                        }
                    }
                }
                this.w = jArr;
                i2 |= 2;
                break;
            }
            if (jSONObject2.has("customData")) {
                this.F = jSONObject2.getJSONObject("customData");
                this.E = null;
                i2 |= 2;
            }
            if (jSONObject2.has("media")) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("media");
                MediaInfo mediaInfo3 = new MediaInfo(jSONObject4);
                MediaInfo mediaInfo4 = this.a;
                if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                    this.a = mediaInfo3;
                    i2 |= 2;
                }
                if (jSONObject4.has("metadata")) {
                    i2 |= 4;
                }
            }
            if (jSONObject2.has("currentItemId") && this.c != (i18 = jSONObject2.getInt("currentItemId"))) {
                this.c = i18;
                i2 |= 2;
            }
            optInt = jSONObject2.optInt("preloadedItemId", 0);
            if (this.y != optInt) {
                this.y = optInt;
                i2 |= 16;
            }
            optInt2 = jSONObject2.optInt("loadingItemId", 0);
            i3 = this.x;
            if (i3 == optInt2) {
                this.x = optInt2;
                i2 |= 2;
            } else {
                optInt2 = i3;
            }
            MediaInfo mediaInfo5 = this.a;
            int i25 = mediaInfo5 != null ? -1 : mediaInfo5.b;
            i4 = this.e;
            int i26 = this.f;
            SparseArray sparseArray = this.O;
            ArrayList arrayList6 = this.H;
            double d5 = d;
            if (i4 == 1) {
                if (i26 != 1) {
                    if (i26 != 2) {
                    }
                    this.c = 0;
                    this.x = 0;
                    this.y = 0;
                    if (arrayList6.isEmpty()) {
                        i6 = 1;
                        i7 = 2;
                        i8 = i2;
                        optJSONObject = jSONObject2.optJSONObject("breakStatus");
                        Parcelable.Creator<ba> creator = ba.CREATOR;
                        long j4 = -1;
                        if (optJSONObject != null) {
                            long j5 = optJSONObject.getLong("currentBreakTime");
                            Pattern pattern3 = qd1.a;
                            long j6 = j5 * 1000;
                            long j7 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                            String a2 = qd1.a("breakId", optJSONObject);
                            String a3 = qd1.a("breakClipId", optJSONObject);
                            optLong = optJSONObject.optLong("whenSkippable", -1L);
                            if (optLong != -1) {
                            }
                            baVar = new ba(j6, j7, a2, a3, optLong);
                            baVar2 = this.J;
                            if (baVar2 != null) {
                            }
                            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                            he6 he6Var = bfc.d;
                            if (optJSONObject2 != null) {
                            }
                            bfcVar = null;
                            bfcVar2 = this.K;
                            if (bfcVar2 != null) {
                            }
                            if (jSONObject2.has("breakInfo")) {
                            }
                            if (jSONObject2.has("queueData")) {
                            }
                            i12 = i11;
                            if (jSONObject2.has("liveSeekableRange")) {
                            }
                            return i12;
                        }
                        baVar = null;
                        baVar2 = this.J;
                        if (baVar2 != null) {
                        }
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        he6 he6Var2 = bfc.d;
                        if (optJSONObject2 != null) {
                        }
                        bfcVar = null;
                        bfcVar2 = this.K;
                        if (bfcVar2 != null) {
                        }
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        i12 = i11;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i12;
                    }
                    this.G = 0;
                    arrayList6.clear();
                    sparseArray.clear();
                    i8 = i2 | 8;
                    i6 = 1;
                    i7 = 2;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<ba> creator2 = ba.CREATOR;
                    long j42 = -1;
                    if (optJSONObject != null && optJSONObject.has("currentBreakTime") && optJSONObject.has("currentBreakClipTime")) {
                        try {
                            long j52 = optJSONObject.getLong("currentBreakTime");
                            Pattern pattern32 = qd1.a;
                            long j62 = j52 * 1000;
                            long j72 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                            String a22 = qd1.a("breakId", optJSONObject);
                            String a32 = qd1.a("breakClipId", optJSONObject);
                            optLong = optJSONObject.optLong("whenSkippable", -1L);
                            if (optLong != -1) {
                                optLong *= 1000;
                            }
                            baVar = new ba(j62, j72, a22, a32, optLong);
                        } catch (JSONException e) {
                            he6 he6Var3 = ba.f;
                            Log.e(he6Var3.a, he6Var3.d("Error while creating an AdBreakClipInfo from JSON", new Object[0]), e);
                        }
                        baVar2 = this.J;
                        if (baVar2 != null ? !baVar2.equals(baVar) : baVar != null) {
                            this.I = (baVar != null || (baVar.c == null && baVar.d == null)) ? 0 : i6;
                            this.J = baVar;
                            i8 |= 32;
                        }
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        he6 he6Var22 = bfc.d;
                        if (optJSONObject2 != null) {
                            try {
                                String string3 = optJSONObject2.getString("hdrType");
                                int hashCode = string3.hashCode();
                                if (hashCode == 3218) {
                                    if (string3.equals("dv")) {
                                        i9 = i6;
                                        i10 = 3;
                                        bfcVar = new bfc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                    }
                                    i9 = i6;
                                    Object[] objArr = new Object[i9];
                                    objArr[0] = string3;
                                    he6Var22.b("Unknown HDR type: %s", objArr);
                                    i10 = 0;
                                    bfcVar = new bfc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                } else if (hashCode == 103158) {
                                    if (string3.equals("hdr")) {
                                        i9 = i6;
                                        i10 = 4;
                                        bfcVar = new bfc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                    }
                                    i9 = i6;
                                    Object[] objArr2 = new Object[i9];
                                    objArr2[0] = string3;
                                    he6Var22.b("Unknown HDR type: %s", objArr2);
                                    i10 = 0;
                                    bfcVar = new bfc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                } else if (hashCode != 113729) {
                                    try {
                                        if (hashCode == 99136405 && string3.equals("hdr10")) {
                                            i10 = i7;
                                            i9 = i6;
                                            bfcVar = new bfc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                        }
                                        Object[] objArr22 = new Object[i9];
                                        objArr22[0] = string3;
                                        he6Var22.b("Unknown HDR type: %s", objArr22);
                                        i10 = 0;
                                        bfcVar = new bfc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                    } catch (JSONException e2) {
                                        e = e2;
                                        he6Var22.a(e, "Error while creating a VideoInfo instance from JSON", new Object[0]);
                                        bfcVar = null;
                                        bfcVar2 = this.K;
                                        if (bfcVar2 != null) {
                                        }
                                        if (jSONObject2.has("breakInfo")) {
                                        }
                                        if (jSONObject2.has("queueData")) {
                                        }
                                        i12 = i11;
                                        if (jSONObject2.has("liveSeekableRange")) {
                                        }
                                        return i12;
                                    }
                                    i9 = i6;
                                } else {
                                    if (string3.equals("sdr")) {
                                        i10 = i6;
                                        i9 = i10;
                                        bfcVar = new bfc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                    }
                                    i9 = i6;
                                    Object[] objArr222 = new Object[i9];
                                    objArr222[0] = string3;
                                    he6Var22.b("Unknown HDR type: %s", objArr222);
                                    i10 = 0;
                                    bfcVar = new bfc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                }
                            } catch (JSONException e3) {
                                e = e3;
                                i9 = i6;
                            }
                            bfcVar2 = this.K;
                            if (bfcVar2 != null ? !bfcVar2.equals(bfcVar) : bfcVar != null) {
                                this.K = bfcVar;
                                i8 |= 64;
                            }
                            if (jSONObject2.has("breakInfo") && (mediaInfo2 = this.a) != null) {
                                mediaInfo2.c(jSONObject2.getJSONObject("breakInfo"));
                                i8 |= 2;
                            }
                            if (jSONObject2.has("queueData")) {
                                JSONObject jSONObject5 = jSONObject2.getJSONObject("queueData");
                                if (jSONObject5 == null) {
                                    i11 = i8;
                                    arrayList2 = null;
                                    cu6Var = null;
                                    str4 = null;
                                    optBoolean = false;
                                    str3 = null;
                                    i16 = 0;
                                    i15 = 0;
                                    a = null;
                                    i14 = 0;
                                } else {
                                    String a4 = qd1.a("id", jSONObject5);
                                    String a5 = qd1.a("entity", jSONObject5);
                                    String optString = jSONObject5.optString("queueType");
                                    switch (optString.hashCode()) {
                                        case -1803151310:
                                            if (optString.equals("PODCAST_SERIES")) {
                                                i13 = 5;
                                                break;
                                            }
                                            i13 = 0;
                                            break;
                                        case -1758903120:
                                            if (optString.equals("RADIO_STATION")) {
                                                i13 = 4;
                                                break;
                                            }
                                            i13 = 0;
                                            break;
                                        case -1632865838:
                                            if (optString.equals("PLAYLIST")) {
                                                i13 = i7;
                                                break;
                                            }
                                            i13 = 0;
                                            break;
                                        case -1319760993:
                                            if (optString.equals("AUDIOBOOK")) {
                                                i13 = 3;
                                                break;
                                            }
                                            i13 = 0;
                                            break;
                                        case -1088524588:
                                            if (optString.equals("TV_SERIES")) {
                                                i13 = 6;
                                                break;
                                            }
                                            i13 = 0;
                                            break;
                                        case 62359119:
                                            if (optString.equals("ALBUM")) {
                                                i13 = i9;
                                                break;
                                            }
                                            i13 = 0;
                                            break;
                                        case 73549584:
                                            if (optString.equals("MOVIE")) {
                                                i13 = 9;
                                                break;
                                            }
                                            i13 = 0;
                                            break;
                                        case 393100598:
                                            if (optString.equals("VIDEO_PLAYLIST")) {
                                                i13 = 7;
                                                break;
                                            }
                                            i13 = 0;
                                            break;
                                        case 902303413:
                                            if (optString.equals("LIVE_TV")) {
                                                i13 = 8;
                                                break;
                                            }
                                            i13 = 0;
                                            break;
                                        default:
                                            i13 = 0;
                                            break;
                                    }
                                    a = qd1.a("name", jSONObject5);
                                    JSONObject optJSONObject4 = jSONObject5.has("containerMetadata") ? jSONObject5.optJSONObject("containerMetadata") : null;
                                    if (optJSONObject4 != null) {
                                        String optString2 = optJSONObject4.optString("containerType", "");
                                        int hashCode2 = optString2.hashCode();
                                        if (hashCode2 != 6924225) {
                                            if (hashCode2 == 828666841) {
                                                optString2.equals("GENERIC_CONTAINER");
                                            }
                                        } else if (optString2.equals("AUDIOBOOK_CONTAINER")) {
                                            i17 = 1;
                                            String a6 = qd1.a("title", optJSONObject4);
                                            optJSONArray = optJSONObject4.optJSONArray("sections");
                                            if (optJSONArray == null) {
                                                arrayList3 = new ArrayList();
                                                i11 = i8;
                                                int i27 = 0;
                                                while (i27 < optJSONArray.length()) {
                                                    JSONObject optJSONObject5 = optJSONArray.optJSONObject(i27);
                                                    int i28 = i27;
                                                    if (optJSONObject5 != null) {
                                                        str5 = a4;
                                                        mt6 mt6Var = new mt6(0);
                                                        mt6Var.e(optJSONObject5);
                                                        arrayList3.add(mt6Var);
                                                    } else {
                                                        str5 = a4;
                                                    }
                                                    i27 = i28 + 1;
                                                    a4 = str5;
                                                }
                                            } else {
                                                i11 = i8;
                                                arrayList3 = null;
                                            }
                                            str = a4;
                                            optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                            if (optJSONArray2 == null) {
                                                arrayList4 = new ArrayList();
                                                u9d.c(arrayList4, optJSONArray2);
                                            } else {
                                                arrayList4 = null;
                                            }
                                            str2 = a5;
                                            i14 = i13;
                                            double optDouble = optJSONObject4.optDouble("containerDuration", 0.0d);
                                            cu6Var = new cu6();
                                            cu6Var.a = i17;
                                            cu6Var.b = a6;
                                            cu6Var.c = arrayList3;
                                            cu6Var.d = arrayList4;
                                            cu6Var.e = optDouble;
                                        }
                                        i17 = 0;
                                        String a62 = qd1.a("title", optJSONObject4);
                                        optJSONArray = optJSONObject4.optJSONArray("sections");
                                        if (optJSONArray == null) {
                                        }
                                        str = a4;
                                        optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                        if (optJSONArray2 == null) {
                                        }
                                        str2 = a5;
                                        i14 = i13;
                                        double optDouble2 = optJSONObject4.optDouble("containerDuration", 0.0d);
                                        cu6Var = new cu6();
                                        cu6Var.a = i17;
                                        cu6Var.b = a62;
                                        cu6Var.c = arrayList3;
                                        cu6Var.d = arrayList4;
                                        cu6Var.e = optDouble2;
                                    } else {
                                        i11 = i8;
                                        str = a4;
                                        str2 = a5;
                                        i14 = i13;
                                        cu6Var = null;
                                    }
                                    Integer a7 = hte.a(jSONObject5.optString("repeatMode"));
                                    int intValue = a7 != null ? a7.intValue() : 0;
                                    JSONArray optJSONArray3 = jSONObject5.optJSONArray("items");
                                    if (optJSONArray3 != null) {
                                        arrayList = new ArrayList();
                                        for (int i29 = 0; i29 < optJSONArray3.length(); i29++) {
                                            JSONObject optJSONObject6 = optJSONArray3.optJSONObject(i29);
                                            if (optJSONObject6 != null) {
                                                try {
                                                    arrayList.add(new eu6(optJSONObject6));
                                                } catch (JSONException unused2) {
                                                }
                                            }
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                    int optInt3 = jSONObject5.optInt("startIndex", 0);
                                    long optDouble3 = jSONObject5.has("startTime") ? (long) (jSONObject5.optDouble("startTime", -1L) * d5) : -1L;
                                    i15 = optInt3;
                                    int i30 = intValue;
                                    optBoolean = jSONObject5.optBoolean("shuffle");
                                    arrayList2 = arrayList;
                                    j42 = optDouble3;
                                    str3 = str2;
                                    i16 = i30;
                                    str4 = str;
                                }
                                du6 du6Var = new du6();
                                du6Var.a = str4;
                                du6Var.b = str3;
                                du6Var.c = i14;
                                du6Var.d = a;
                                du6Var.e = cu6Var;
                                du6Var.f = i16;
                                du6Var.h = arrayList2;
                                du6Var.n = i15;
                                du6Var.r = j42;
                                du6Var.s = optBoolean;
                                this.M = du6Var;
                                if (this.N != optBoolean) {
                                    this.N = optBoolean;
                                    i12 = i11 | 8;
                                    if (jSONObject2.has("liveSeekableRange")) {
                                        if (this.L != null) {
                                            i12 |= 2;
                                        }
                                        this.L = null;
                                    } else {
                                        i12 |= 2;
                                        JSONObject optJSONObject7 = jSONObject2.optJSONObject("liveSeekableRange");
                                        Parcelable.Creator<it6> creator3 = it6.CREATOR;
                                        if (optJSONObject7 != null && optJSONObject7.has("start") && optJSONObject7.has("end")) {
                                            try {
                                                double d6 = optJSONObject7.getDouble("start");
                                                Pattern pattern4 = qd1.a;
                                                it6Var = new it6((long) (d6 * d5), (long) (optJSONObject7.getDouble("end") * d5), optJSONObject7.optBoolean("isMovingWindow"), optJSONObject7.optBoolean("isLiveDone"));
                                            } catch (JSONException unused3) {
                                                he6 he6Var4 = it6.e;
                                                Log.e(he6Var4.a, he6Var4.d("Ignoring Malformed MediaLiveSeekableRange: ".concat(optJSONObject7.toString()), new Object[0]));
                                            }
                                            this.L = it6Var;
                                        }
                                        it6Var = null;
                                        this.L = it6Var;
                                    }
                                    return i12;
                                }
                            } else {
                                i11 = i8;
                            }
                            i12 = i11;
                            if (jSONObject2.has("liveSeekableRange")) {
                            }
                            return i12;
                        }
                        i9 = i6;
                        bfcVar = null;
                        bfcVar2 = this.K;
                        if (bfcVar2 != null) {
                            this.K = bfcVar;
                            i8 |= 64;
                        } else {
                            this.K = bfcVar;
                            i8 |= 64;
                        }
                        if (jSONObject2.has("breakInfo")) {
                            mediaInfo2.c(jSONObject2.getJSONObject("breakInfo"));
                            i8 |= 2;
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        i12 = i11;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i12;
                    }
                    baVar = null;
                    baVar2 = this.J;
                    if (baVar2 != null) {
                        this.I = (baVar != null || (baVar.c == null && baVar.d == null)) ? 0 : i6;
                        this.J = baVar;
                        i8 |= 32;
                    } else {
                        this.I = (baVar != null || (baVar.c == null && baVar.d == null)) ? 0 : i6;
                        this.J = baVar;
                        i8 |= 32;
                    }
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    he6 he6Var222 = bfc.d;
                    if (optJSONObject2 != null) {
                    }
                    bfcVar = null;
                    bfcVar2 = this.K;
                    if (bfcVar2 != null) {
                    }
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    i12 = i11;
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i12;
                }
            }
            if (jSONObject2.has("repeatMode")) {
                Integer a8 = hte.a(jSONObject2.getString("repeatMode"));
                int intValue2 = a8 == null ? this.G : a8.intValue();
                if (this.G != intValue2) {
                    this.G = intValue2;
                    i5 = 1;
                    if (jSONObject2.has("items")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("items");
                        int length = jSONArray2.length();
                        SparseArray sparseArray2 = new SparseArray();
                        int i31 = 0;
                        while (true) {
                            i7 = i20;
                            if (i31 >= length) {
                                break;
                            }
                            sparseArray2.put(i31, Integer.valueOf(jSONArray2.getJSONObject(i31).getInt("itemId")));
                            i31++;
                            i20 = i7;
                        }
                        ArrayList arrayList7 = new ArrayList();
                        int i32 = 0;
                        while (i32 < length) {
                            Integer num = (Integer) sparseArray2.get(i32);
                            int i33 = i19;
                            JSONObject jSONObject6 = jSONArray2.getJSONObject(i32);
                            Integer num2 = (Integer) sparseArray.get(num.intValue());
                            eu6 eu6Var = num2 == null ? null : (eu6) arrayList6.get(num2.intValue());
                            if (eu6Var != null) {
                                i5 |= eu6Var.b(jSONObject6) ? 1 : 0;
                                arrayList7.add(eu6Var);
                                if (i32 == ((Integer) sparseArray.get(num.intValue())).intValue()) {
                                    i32++;
                                    i19 = i33;
                                }
                            } else if (num.intValue() != this.c || (mediaInfo = this.a) == null) {
                                arrayList7.add(new eu6(jSONObject6));
                            } else {
                                eu6 v = new kj4(mediaInfo).v();
                                v.b(jSONObject6);
                                arrayList7.add(v);
                            }
                            i5 = i33;
                            i32++;
                            i19 = i33;
                        }
                        i6 = i19;
                        i5 |= (arrayList6.size() != length ? 0 : i6) ^ 1;
                        c(arrayList7);
                    } else {
                        i6 = 1;
                        i7 = 2;
                    }
                    if (i5 != 0) {
                        i2 |= 8;
                    }
                    i8 = i2;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<ba> creator22 = ba.CREATOR;
                    long j422 = -1;
                    if (optJSONObject != null) {
                    }
                    baVar = null;
                    baVar2 = this.J;
                    if (baVar2 != null) {
                    }
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    he6 he6Var2222 = bfc.d;
                    if (optJSONObject2 != null) {
                    }
                    bfcVar = null;
                    bfcVar2 = this.K;
                    if (bfcVar2 != null) {
                    }
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    i12 = i11;
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i12;
                }
            }
            i5 = 0;
            if (jSONObject2.has("items")) {
            }
            if (i5 != 0) {
            }
            i8 = i2;
            optJSONObject = jSONObject2.optJSONObject("breakStatus");
            Parcelable.Creator<ba> creator222 = ba.CREATOR;
            long j4222 = -1;
            if (optJSONObject != null) {
            }
            baVar = null;
            baVar2 = this.J;
            if (baVar2 != null) {
            }
            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
            he6 he6Var22222 = bfc.d;
            if (optJSONObject2 != null) {
            }
            bfcVar = null;
            bfcVar2 = this.K;
            if (bfcVar2 != null) {
            }
            if (jSONObject2.has("breakInfo")) {
            }
            if (jSONObject2.has("queueData")) {
            }
            i12 = i11;
            if (jSONObject2.has("liveSeekableRange")) {
            }
            return i12;
        }
        jSONObject2 = jSONObject;
        j = jSONObject2.getLong("mediaSessionId");
        int i192 = 1;
        if (j == this.b) {
        }
        int i202 = 2;
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
        Pattern pattern22 = qd1.a;
        if (jSONArray != null) {
        }
        long[] jArr22 = this.w;
        if (jArr == null) {
        }
        if (jSONObject2.has("customData")) {
        }
        if (jSONObject2.has("media")) {
        }
        if (jSONObject2.has("currentItemId")) {
            this.c = i18;
            i2 |= 2;
        }
        optInt = jSONObject2.optInt("preloadedItemId", 0);
        if (this.y != optInt) {
        }
        optInt2 = jSONObject2.optInt("loadingItemId", 0);
        i3 = this.x;
        if (i3 == optInt2) {
        }
        MediaInfo mediaInfo52 = this.a;
        if (mediaInfo52 != null) {
        }
        i4 = this.e;
        int i262 = this.f;
        SparseArray sparseArray3 = this.O;
        ArrayList arrayList62 = this.H;
        double d52 = d;
        if (i4 == 1) {
        }
        if (jSONObject2.has("repeatMode")) {
        }
        i5 = 0;
        if (jSONObject2.has("items")) {
        }
        if (i5 != 0) {
        }
        i8 = i2;
        optJSONObject = jSONObject2.optJSONObject("breakStatus");
        Parcelable.Creator<ba> creator2222 = ba.CREATOR;
        long j42222 = -1;
        if (optJSONObject != null) {
        }
        baVar = null;
        baVar2 = this.J;
        if (baVar2 != null) {
        }
        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
        he6 he6Var222222 = bfc.d;
        if (optJSONObject2 != null) {
        }
        bfcVar = null;
        bfcVar2 = this.K;
        if (bfcVar2 != null) {
        }
        if (jSONObject2.has("breakInfo")) {
        }
        if (jSONObject2.has("queueData")) {
        }
        i12 = i11;
        if (jSONObject2.has("liveSeekableRange")) {
        }
        return i12;
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = this.H;
        arrayList2.clear();
        SparseArray sparseArray = this.O;
        sparseArray.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            eu6 eu6Var = (eu6) arrayList.get(i);
            arrayList2.add(eu6Var);
            sparseArray.put(eu6Var.b, Integer.valueOf(i));
        }
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof j07) {
                j07 j07Var = (j07) obj;
                if ((this.F == null) != (j07Var.F == null) || this.b != j07Var.b || this.c != j07Var.c || this.d != j07Var.d || this.e != j07Var.e || this.f != j07Var.f || this.h != j07Var.h || this.r != j07Var.r || this.s != j07Var.s || this.x != j07Var.x || this.y != j07Var.y || this.G != j07Var.G || !Arrays.equals(this.w, j07Var.w) || !qd1.d(Long.valueOf(this.n), Long.valueOf(j07Var.n)) || !qd1.d(this.H, j07Var.H) || !qd1.d(this.a, j07Var.a) || (((jSONObject = this.F) != null && (jSONObject2 = j07Var.F) != null && !ax5.a(jSONObject, jSONObject2)) || this.I != j07Var.I || !qd1.d(this.J, j07Var.J) || !qd1.d(this.K, j07Var.K) || !qd1.d(this.L, j07Var.L) || !vue.a(this.M, j07Var.M) || this.N != j07Var.N)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.h), Long.valueOf(this.n), Double.valueOf(this.r), Boolean.valueOf(this.s), Integer.valueOf(Arrays.hashCode(this.w)), Integer.valueOf(this.x), Integer.valueOf(this.y), String.valueOf(this.F), Integer.valueOf(this.G), this.H, Boolean.valueOf(this.I), this.J, this.K, this.L, this.M});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.F;
        this.E = jSONObject == null ? null : jSONObject.toString();
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        long j = this.b;
        bye.q(parcel, 3, 8);
        parcel.writeLong(j);
        int i2 = this.c;
        bye.q(parcel, 4, 4);
        parcel.writeInt(i2);
        double d = this.d;
        bye.q(parcel, 5, 8);
        parcel.writeDouble(d);
        int i3 = this.e;
        bye.q(parcel, 6, 4);
        parcel.writeInt(i3);
        int i4 = this.f;
        bye.q(parcel, 7, 4);
        parcel.writeInt(i4);
        long j2 = this.h;
        bye.q(parcel, 8, 8);
        parcel.writeLong(j2);
        long j3 = this.n;
        bye.q(parcel, 9, 8);
        parcel.writeLong(j3);
        double d2 = this.r;
        bye.q(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z = this.s;
        bye.q(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        bye.j(parcel, 12, this.w);
        int i5 = this.x;
        bye.q(parcel, 13, 4);
        parcel.writeInt(i5);
        int i6 = this.y;
        bye.q(parcel, 14, 4);
        parcel.writeInt(i6);
        bye.l(parcel, 15, this.E);
        int i7 = this.G;
        bye.q(parcel, 16, 4);
        parcel.writeInt(i7);
        bye.p(parcel, 17, this.H);
        boolean z2 = this.I;
        bye.q(parcel, 18, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bye.k(parcel, 19, this.J, i);
        bye.k(parcel, 20, this.K, i);
        bye.k(parcel, 21, this.L, i);
        bye.k(parcel, 22, this.M, i);
        bye.s(parcel, r);
    }
}
