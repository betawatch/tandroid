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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class fy6 extends b4 {
    public static final Parcelable.Creator<fy6> CREATOR;
    public String E;
    public JSONObject F;
    public int G;
    public boolean I;
    public aa J;
    public bbc K;
    public er6 L;
    public yr6 M;
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
        fre.g("MediaStatus", "The log tag cannot be null or empty.");
        CREATOR = new igd((byte) 16);
    }

    public fy6(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, ArrayList arrayList, boolean z2, aa aaVar, bbc bbcVar, er6 er6Var, yr6 yr6Var) {
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
        this.J = aaVar;
        this.K = bbcVar;
        this.L = er6Var;
        this.M = yr6Var;
        boolean z3 = false;
        if (yr6Var != null && yr6Var.s) {
            z3 = true;
        }
        this.N = z3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x023b, code lost:
    
        if (r13 != 3) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x023e, code lost:
    
        if (r3 != 2) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0241, code lost:
    
        if (r2 == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x01ac, code lost:
    
        if (r2 != null) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03b4 A[Catch: JSONException -> 0x03bf, TryCatch #4 {JSONException -> 0x03bf, blocks: (B:133:0x038e, B:135:0x03b4, B:136:0x03b5), top: B:132:0x038e }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0485 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0403 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0061  */
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
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [aa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [bbc] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [er6] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, xr6] */
    /* JADX WARN: Type inference failed for: r2v59, types: [xr6] */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r38v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v30, types: [er6] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v9, types: [aa] */
    /* JADX WARN: Type inference failed for: r8v12, types: [bbc] */
    /* JADX WARN: Type inference failed for: r8v19, types: [bbc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v7 */
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
        JSONObject jSONObject3;
        MediaInfo mediaInfo;
        int i8;
        JSONObject jSONObject4;
        JSONObject optJSONObject;
        ?? r0;
        ?? r5;
        JSONObject optJSONObject2;
        int i9;
        ?? r8;
        int i10;
        ?? r02;
        int i11;
        int i12;
        ?? r11;
        int i13;
        String a;
        String str;
        String str2;
        int i14;
        JSONObject jSONObject5;
        ?? r4;
        int i15;
        boolean optBoolean;
        ?? r03;
        String str3;
        int i16;
        ?? r52;
        int i17;
        JSONArray optJSONArray;
        ?? r3;
        JSONArray optJSONArray2;
        ?? r42;
        String str4;
        ?? r2;
        MediaInfo mediaInfo2;
        long optLong;
        int i18;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("extendedStatus");
        if (optJSONObject3 != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    arrayList.add(keys.next());
                }
                jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList.toArray(new String[0]));
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
                Pattern pattern = id1.a;
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
                JSONObject jSONObject6 = jSONObject2.getJSONObject("volume");
                double d4 = jSONObject6.getDouble("level");
                d = 1000.0d;
                if (d4 != this.r) {
                    this.r = d4;
                    i2 |= 2;
                }
                boolean z = jSONObject6.getBoolean("muted");
                if (z != this.s) {
                    this.s = z;
                    i2 |= 2;
                }
            }
            Object obj = null;
            jSONArray = !jSONObject2.has("activeTrackIds") ? jSONObject2.getJSONArray("activeTrackIds") : null;
            Pattern pattern2 = id1.a;
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
                JSONObject jSONObject7 = jSONObject2.getJSONObject("media");
                MediaInfo mediaInfo3 = new MediaInfo(jSONObject7);
                MediaInfo mediaInfo4 = this.a;
                if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                    this.a = mediaInfo3;
                    i2 |= 2;
                }
                if (jSONObject7.has("metadata")) {
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
            ArrayList arrayList2 = this.H;
            double d5 = d;
            if (i4 == 1) {
                if (i26 != 1) {
                    if (i26 != 2) {
                    }
                    this.c = 0;
                    this.x = 0;
                    this.y = 0;
                    if (arrayList2.isEmpty()) {
                        i6 = 1;
                        i7 = 2;
                        jSONObject3 = null;
                        i8 = i2;
                        jSONObject4 = jSONObject3;
                        optJSONObject = jSONObject2.optJSONObject("breakStatus");
                        Parcelable.Creator<aa> creator = aa.CREATOR;
                        long j4 = -1;
                        if (optJSONObject != null) {
                            long j5 = optJSONObject.getLong("currentBreakTime");
                            Pattern pattern3 = id1.a;
                            long j6 = j5 * 1000;
                            long j7 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                            String a2 = id1.a("breakId", optJSONObject);
                            String a3 = id1.a("breakClipId", optJSONObject);
                            optLong = optJSONObject.optLong("whenSkippable", -1L);
                            if (optLong != -1) {
                            }
                            r0 = new aa(j6, j7, a2, a3, optLong);
                            r5 = this.J;
                            if (r5 != null) {
                            }
                        }
                        r0 = jSONObject4;
                        r5 = this.J;
                        if (r5 != null) {
                        }
                    } else {
                        this.G = 0;
                        arrayList2.clear();
                        sparseArray.clear();
                        i8 = i2 | 8;
                        i6 = 1;
                        i7 = 2;
                        jSONObject4 = null;
                        optJSONObject = jSONObject2.optJSONObject("breakStatus");
                        Parcelable.Creator<aa> creator2 = aa.CREATOR;
                        long j42 = -1;
                        if (optJSONObject != null && optJSONObject.has("currentBreakTime") && optJSONObject.has("currentBreakClipTime")) {
                            try {
                                long j52 = optJSONObject.getLong("currentBreakTime");
                                Pattern pattern32 = id1.a;
                                long j62 = j52 * 1000;
                                long j72 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                                String a22 = id1.a("breakId", optJSONObject);
                                String a32 = id1.a("breakClipId", optJSONObject);
                                optLong = optJSONObject.optLong("whenSkippable", -1L);
                                if (optLong != -1) {
                                    optLong *= 1000;
                                }
                                r0 = new aa(j62, j72, a22, a32, optLong);
                            } catch (JSONException e) {
                                dc6 dc6Var = aa.f;
                                Log.e(dc6Var.a, dc6Var.d("Error while creating an AdBreakClipInfo from JSON", new Object[0]), e);
                            }
                            r5 = this.J;
                            if (r5 != null ? !r5.equals(r0) : r0 != null) {
                                this.I = (r0 != null || (r0.c == null && r0.d == null)) ? 0 : i6;
                                this.J = r0;
                                i8 |= 32;
                            }
                            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                            dc6 dc6Var2 = bbc.d;
                            if (optJSONObject2 == null) {
                                r8 = jSONObject4;
                                i9 = i6;
                            } else {
                                try {
                                    String string3 = optJSONObject2.getString("hdrType");
                                    int hashCode = string3.hashCode();
                                    if (hashCode == 3218) {
                                        if (string3.equals("dv")) {
                                            i9 = i6;
                                            i10 = 3;
                                            r8 = new bbc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                        }
                                        i9 = i6;
                                        Object[] objArr = new Object[i9];
                                        objArr[0] = string3;
                                        dc6Var2.b("Unknown HDR type: %s", objArr);
                                        i10 = 0;
                                        r8 = new bbc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                    } else if (hashCode == 103158) {
                                        if (string3.equals("hdr")) {
                                            i9 = i6;
                                            i10 = 4;
                                            r8 = new bbc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                        }
                                        i9 = i6;
                                        Object[] objArr2 = new Object[i9];
                                        objArr2[0] = string3;
                                        dc6Var2.b("Unknown HDR type: %s", objArr2);
                                        i10 = 0;
                                        r8 = new bbc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                    } else if (hashCode != 113729) {
                                        try {
                                            if (hashCode == 99136405 && string3.equals("hdr10")) {
                                                i10 = i7;
                                                i9 = i6;
                                                r8 = new bbc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                            }
                                            Object[] objArr22 = new Object[i9];
                                            objArr22[0] = string3;
                                            dc6Var2.b("Unknown HDR type: %s", objArr22);
                                            i10 = 0;
                                            r8 = new bbc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                        } catch (JSONException e2) {
                                            e = e2;
                                            dc6Var2.a(e, "Error while creating a VideoInfo instance from JSON", new Object[0]);
                                            r8 = jSONObject4;
                                            r02 = this.K;
                                            if (r02 != null) {
                                            }
                                        }
                                        i9 = i6;
                                    } else {
                                        if (string3.equals("sdr")) {
                                            i10 = i6;
                                            i9 = i10;
                                            r8 = new bbc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                        }
                                        i9 = i6;
                                        Object[] objArr222 = new Object[i9];
                                        objArr222[0] = string3;
                                        dc6Var2.b("Unknown HDR type: %s", objArr222);
                                        i10 = 0;
                                        r8 = new bbc(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i10);
                                    }
                                } catch (JSONException e3) {
                                    e = e3;
                                    i9 = i6;
                                }
                            }
                            r02 = this.K;
                            if (r02 != null ? !r02.equals(r8) : r8 != null) {
                                this.K = r8;
                                i8 |= 64;
                            }
                            if (jSONObject2.has("breakInfo") && (mediaInfo2 = this.a) != null) {
                                mediaInfo2.c(jSONObject2.getJSONObject("breakInfo"));
                                i8 |= 2;
                            }
                            if (jSONObject2.has("queueData")) {
                                JSONObject jSONObject8 = jSONObject2.getJSONObject("queueData");
                                if (jSONObject8 == null) {
                                    JSONObject jSONObject9 = jSONObject4;
                                    r52 = jSONObject9;
                                    str3 = r52;
                                    a = str3;
                                    i11 = i8;
                                    optBoolean = false;
                                    i16 = 0;
                                    i15 = 0;
                                    i14 = 0;
                                    r2 = a;
                                    r03 = jSONObject9;
                                } else {
                                    String a4 = id1.a("id", jSONObject8);
                                    String a5 = id1.a("entity", jSONObject8);
                                    String optString = jSONObject8.optString("queueType");
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
                                    a = id1.a("name", jSONObject8);
                                    JSONObject optJSONObject4 = jSONObject8.has("containerMetadata") ? jSONObject8.optJSONObject("containerMetadata") : jSONObject4;
                                    if (optJSONObject4 != null) {
                                        String optString2 = optJSONObject4.optString("containerType", "");
                                        int hashCode2 = optString2.hashCode();
                                        if (hashCode2 != 6924225) {
                                            if (hashCode2 == 828666841) {
                                                optString2.equals("GENERIC_CONTAINER");
                                            }
                                        } else if (optString2.equals("AUDIOBOOK_CONTAINER")) {
                                            i17 = 1;
                                            String a6 = id1.a("title", optJSONObject4);
                                            optJSONArray = optJSONObject4.optJSONArray("sections");
                                            if (optJSONArray == null) {
                                                r3 = new ArrayList();
                                                i11 = i8;
                                                int i27 = 0;
                                                while (i27 < optJSONArray.length()) {
                                                    JSONObject optJSONObject5 = optJSONArray.optJSONObject(i27);
                                                    int i28 = i27;
                                                    if (optJSONObject5 != null) {
                                                        str4 = a4;
                                                        ir6 ir6Var = new ir6(0);
                                                        ir6Var.e(optJSONObject5);
                                                        r3.add(ir6Var);
                                                    } else {
                                                        str4 = a4;
                                                    }
                                                    i27 = i28 + 1;
                                                    a4 = str4;
                                                }
                                            } else {
                                                i11 = i8;
                                                r3 = jSONObject4;
                                            }
                                            str = a4;
                                            optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                            if (optJSONArray2 == null) {
                                                r42 = new ArrayList();
                                                b5d.c(r42, optJSONArray2);
                                            } else {
                                                r42 = jSONObject4;
                                            }
                                            str2 = a5;
                                            i14 = i13;
                                            double optDouble = optJSONObject4.optDouble("containerDuration", 0.0d);
                                            ?? xr6Var = new xr6();
                                            xr6Var.a = i17;
                                            xr6Var.b = a6;
                                            xr6Var.c = r3;
                                            xr6Var.d = r42;
                                            xr6Var.e = optDouble;
                                            jSONObject5 = xr6Var;
                                        }
                                        i17 = 0;
                                        String a62 = id1.a("title", optJSONObject4);
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
                                        ?? xr6Var2 = new xr6();
                                        xr6Var2.a = i17;
                                        xr6Var2.b = a62;
                                        xr6Var2.c = r3;
                                        xr6Var2.d = r42;
                                        xr6Var2.e = optDouble2;
                                        jSONObject5 = xr6Var2;
                                    } else {
                                        i11 = i8;
                                        str = a4;
                                        str2 = a5;
                                        i14 = i13;
                                        jSONObject5 = jSONObject4;
                                    }
                                    Integer a7 = ooe.a(jSONObject8.optString("repeatMode"));
                                    int intValue = a7 != null ? a7.intValue() : 0;
                                    JSONArray optJSONArray3 = jSONObject8.optJSONArray("items");
                                    if (optJSONArray3 != null) {
                                        r4 = new ArrayList();
                                        for (int i29 = 0; i29 < optJSONArray3.length(); i29++) {
                                            JSONObject optJSONObject6 = optJSONArray3.optJSONObject(i29);
                                            if (optJSONObject6 != null) {
                                                try {
                                                    r4.add(new zr6(optJSONObject6));
                                                } catch (JSONException unused2) {
                                                }
                                            }
                                        }
                                    } else {
                                        r4 = jSONObject4;
                                    }
                                    int optInt3 = jSONObject8.optInt("startIndex", 0);
                                    long optDouble3 = jSONObject8.has("startTime") ? (long) (jSONObject8.optDouble("startTime", -1L) * d5) : -1L;
                                    i15 = optInt3;
                                    int i30 = intValue;
                                    optBoolean = jSONObject8.optBoolean("shuffle");
                                    r03 = r4;
                                    j42 = optDouble3;
                                    str3 = str2;
                                    i16 = i30;
                                    r52 = str;
                                    r2 = jSONObject5;
                                }
                                yr6 yr6Var = new yr6();
                                yr6Var.a = r52;
                                yr6Var.b = str3;
                                yr6Var.c = i14;
                                yr6Var.d = a;
                                yr6Var.e = r2;
                                yr6Var.f = i16;
                                yr6Var.h = r03;
                                yr6Var.n = i15;
                                yr6Var.r = j42;
                                yr6Var.s = optBoolean;
                                this.M = yr6Var;
                                if (this.N != optBoolean) {
                                    this.N = optBoolean;
                                    i12 = i11 | 8;
                                    if (jSONObject2.has("liveSeekableRange")) {
                                        if (this.L != null) {
                                            i12 |= 2;
                                        }
                                        this.L = jSONObject4;
                                    } else {
                                        i12 |= 2;
                                        JSONObject optJSONObject7 = jSONObject2.optJSONObject("liveSeekableRange");
                                        Parcelable.Creator<er6> creator3 = er6.CREATOR;
                                        if (optJSONObject7 != null && optJSONObject7.has("start") && optJSONObject7.has("end")) {
                                            try {
                                                double d6 = optJSONObject7.getDouble("start");
                                                Pattern pattern4 = id1.a;
                                                r11 = new er6((long) (d6 * d5), (long) (optJSONObject7.getDouble("end") * d5), optJSONObject7.optBoolean("isMovingWindow"), optJSONObject7.optBoolean("isLiveDone"));
                                            } catch (JSONException unused3) {
                                                dc6 dc6Var3 = er6.e;
                                                Log.e(dc6Var3.a, dc6Var3.d("Ignoring Malformed MediaLiveSeekableRange: ".concat(optJSONObject7.toString()), new Object[0]));
                                            }
                                            this.L = r11;
                                        }
                                        r11 = jSONObject4;
                                        this.L = r11;
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
                        r0 = jSONObject4;
                        r5 = this.J;
                        if (r5 != null) {
                            this.I = (r0 != null || (r0.c == null && r0.d == null)) ? 0 : i6;
                            this.J = r0;
                            i8 |= 32;
                            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                            dc6 dc6Var22 = bbc.d;
                            if (optJSONObject2 == null) {
                            }
                            r02 = this.K;
                            if (r02 != null) {
                                this.K = r8;
                                i8 |= 64;
                                if (jSONObject2.has("breakInfo")) {
                                }
                                if (jSONObject2.has("queueData")) {
                                }
                                i12 = i11;
                                if (jSONObject2.has("liveSeekableRange")) {
                                }
                                return i12;
                            }
                            this.K = r8;
                            i8 |= 64;
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
                        this.I = (r0 != null || (r0.c == null && r0.d == null)) ? 0 : i6;
                        this.J = r0;
                        i8 |= 32;
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        dc6 dc6Var222 = bbc.d;
                        if (optJSONObject2 == null) {
                        }
                        r02 = this.K;
                        if (r02 != null) {
                        }
                    }
                }
            }
            if (jSONObject2.has("repeatMode")) {
                Integer a8 = ooe.a(jSONObject2.getString("repeatMode"));
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
                            obj = obj;
                            i20 = i7;
                        }
                        ?? r38 = obj;
                        ArrayList arrayList3 = new ArrayList();
                        int i32 = 0;
                        while (i32 < length) {
                            Integer num = (Integer) sparseArray2.get(i32);
                            int i33 = i19;
                            JSONObject jSONObject10 = jSONArray2.getJSONObject(i32);
                            Integer num2 = (Integer) sparseArray.get(num.intValue());
                            zr6 zr6Var = num2 == null ? r38 : (zr6) arrayList2.get(num2.intValue());
                            if (zr6Var != null) {
                                i5 |= zr6Var.b(jSONObject10) ? 1 : 0;
                                arrayList3.add(zr6Var);
                                if (i32 == ((Integer) sparseArray.get(num.intValue())).intValue()) {
                                    i32++;
                                    i19 = i33;
                                }
                            } else if (num.intValue() != this.c || (mediaInfo = this.a) == null) {
                                arrayList3.add(new zr6(jSONObject10));
                            } else {
                                gi3 gi3Var = new gi3();
                                zr6 zr6Var2 = new zr6(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
                                if (mediaInfo == null) {
                                    w26.j("media cannot be null.");
                                    throw r38;
                                }
                                gi3Var.a = zr6Var2;
                                zr6 d7 = gi3Var.d();
                                d7.b(jSONObject10);
                                arrayList3.add(d7);
                            }
                            i5 = i33;
                            i32++;
                            i19 = i33;
                        }
                        i6 = i19;
                        i5 |= (arrayList2.size() != length ? 0 : i6) ^ 1;
                        c(arrayList3);
                        jSONObject3 = r38;
                    } else {
                        i6 = 1;
                        i7 = 2;
                        jSONObject3 = null;
                    }
                    if (i5 != 0) {
                        i2 |= 8;
                    }
                    i8 = i2;
                    jSONObject4 = jSONObject3;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<aa> creator22 = aa.CREATOR;
                    long j422 = -1;
                    if (optJSONObject != null) {
                    }
                    r0 = jSONObject4;
                    r5 = this.J;
                    if (r5 != null) {
                    }
                }
            }
            i5 = 0;
            if (jSONObject2.has("items")) {
            }
            if (i5 != 0) {
            }
            i8 = i2;
            jSONObject4 = jSONObject3;
            optJSONObject = jSONObject2.optJSONObject("breakStatus");
            Parcelable.Creator<aa> creator222 = aa.CREATOR;
            long j4222 = -1;
            if (optJSONObject != null) {
            }
            r0 = jSONObject4;
            r5 = this.J;
            if (r5 != null) {
            }
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
        Object obj2 = null;
        if (!jSONObject2.has("activeTrackIds")) {
        }
        Pattern pattern22 = id1.a;
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
        ArrayList arrayList22 = this.H;
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
        jSONObject4 = jSONObject3;
        optJSONObject = jSONObject2.optJSONObject("breakStatus");
        Parcelable.Creator<aa> creator2222 = aa.CREATOR;
        long j42222 = -1;
        if (optJSONObject != null) {
        }
        r0 = jSONObject4;
        r5 = this.J;
        if (r5 != null) {
        }
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = this.H;
        arrayList2.clear();
        SparseArray sparseArray = this.O;
        sparseArray.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            zr6 zr6Var = (zr6) arrayList.get(i);
            arrayList2.add(zr6Var);
            sparseArray.put(zr6Var.b, Integer.valueOf(i));
        }
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof fy6) {
                fy6 fy6Var = (fy6) obj;
                if ((this.F == null) != (fy6Var.F == null) || this.b != fy6Var.b || this.c != fy6Var.c || this.d != fy6Var.d || this.e != fy6Var.e || this.f != fy6Var.f || this.h != fy6Var.h || this.r != fy6Var.r || this.s != fy6Var.s || this.x != fy6Var.x || this.y != fy6Var.y || this.G != fy6Var.G || !Arrays.equals(this.w, fy6Var.w) || !id1.d(Long.valueOf(this.n), Long.valueOf(fy6Var.n)) || !id1.d(this.H, fy6Var.H) || !id1.d(this.a, fy6Var.a) || (((jSONObject = this.F) != null && (jSONObject2 = fy6Var.F) != null && !vu5.a(jSONObject, jSONObject2)) || this.I != fy6Var.I || !id1.d(this.J, fy6Var.J) || !id1.d(this.K, fy6Var.K) || !id1.d(this.L, fy6Var.L) || !cqe.a(this.M, fy6Var.M) || this.N != fy6Var.N)) {
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
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        long j = this.b;
        jte.q(parcel, 3, 8);
        parcel.writeLong(j);
        int i2 = this.c;
        jte.q(parcel, 4, 4);
        parcel.writeInt(i2);
        double d = this.d;
        jte.q(parcel, 5, 8);
        parcel.writeDouble(d);
        int i3 = this.e;
        jte.q(parcel, 6, 4);
        parcel.writeInt(i3);
        int i4 = this.f;
        jte.q(parcel, 7, 4);
        parcel.writeInt(i4);
        long j2 = this.h;
        jte.q(parcel, 8, 8);
        parcel.writeLong(j2);
        long j3 = this.n;
        jte.q(parcel, 9, 8);
        parcel.writeLong(j3);
        double d2 = this.r;
        jte.q(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z = this.s;
        jte.q(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        jte.j(parcel, 12, this.w);
        int i5 = this.x;
        jte.q(parcel, 13, 4);
        parcel.writeInt(i5);
        int i6 = this.y;
        jte.q(parcel, 14, 4);
        parcel.writeInt(i6);
        jte.l(parcel, 15, this.E);
        int i7 = this.G;
        jte.q(parcel, 16, 4);
        parcel.writeInt(i7);
        jte.p(parcel, 17, this.H);
        boolean z2 = this.I;
        jte.q(parcel, 18, 4);
        parcel.writeInt(z2 ? 1 : 0);
        jte.k(parcel, 19, this.J, i);
        jte.k(parcel, 20, this.K, i);
        jte.k(parcel, 21, this.L, i);
        jte.k(parcel, 22, this.M, i);
        jte.s(parcel, r);
    }
}
