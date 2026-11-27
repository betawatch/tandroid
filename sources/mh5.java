// default package

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mh5 implements iy7 {
    public final jh5 a;
    public final fh5 b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern n = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern r = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern s = Pattern.compile("SAMPLE-RATE=(\\d+)\\b");
    public static final Pattern w = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern x = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern y = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern E = Pattern.compile("MIME=\"(.+?)\"");
    public static final Pattern F = Pattern.compile("CACHED=\"(.+?)\"");
    public static final Pattern G = Pattern.compile("DOCID=\"(.+?)\"");
    public static final Pattern H = Pattern.compile("DOCFILENAME=\"(.+?)\"");
    public static final Pattern I = Pattern.compile("ACCOUNT=\"(.+?)\"");
    public static final Pattern J = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern K = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern L = Pattern.compile("SCORE=([\\d\\.]+)\\b");
    public static final Pattern M = Pattern.compile("SERVER-URI=\"((?:.|\f)+?)\"");
    public static final Pattern N = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    public static final Pattern O = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    public static final Pattern P = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    public static final Pattern Q = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern R = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern S = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern T = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern U = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern V = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern W = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern X = a("CAN-SKIP-DATERANGES");
    public static final Pattern Y = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern Z = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern a0 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern b0 = a("CAN-BLOCK-RELOAD");
    public static final Pattern c0 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern d0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern e0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern f0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern g0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern h0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern i0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern j0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern k0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern l0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern m0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern n0 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern o0 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern p0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern q0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern r0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern s0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern t0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern u0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern v0 = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern w0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern x0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern y0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern z0 = a("AUTOSELECT");
    public static final Pattern A0 = a("DEFAULT");
    public static final Pattern B0 = a("FORCED");
    public static final Pattern C0 = a("INDEPENDENT");
    public static final Pattern D0 = a("GAP");
    public static final Pattern E0 = a("PRECISE");
    public static final Pattern F0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern G0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern H0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern I0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern J0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern K0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern L0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern M0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern N0 = a("END-ON-NEXT");
    public static final Pattern O0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern P0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern Q0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern R0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern S0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern T0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern U0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern V0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern W0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern X0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern Y0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern Z0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern a1 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern b1 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public mh5(jh5 jh5Var, fh5 fh5Var) {
        this.a = jh5Var;
        this.b = fh5Var;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static hr3 b(String str, gr3[] gr3VarArr) {
        gr3[] gr3VarArr2 = new gr3[gr3VarArr.length];
        for (int i = 0; i < gr3VarArr.length; i++) {
            gr3 gr3Var = gr3VarArr[i];
            gr3VarArr2[i] = new gr3(gr3Var.b, gr3Var.c, gr3Var.d, null);
        }
        return new hr3(str, true, gr3VarArr2);
    }

    public static gr3 c(String str, String str2, HashMap hashMap, rr4 rr4Var) {
        String j = j(str, o0, "1", hashMap, rr4Var);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = p0;
        if (equals) {
            String k = k(str, pattern, hashMap, rr4Var);
            return new gr3(o51.e, null, "video/mp4", Base64.decode(k.substring(k.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = o51.e;
            String str3 = gcc.a;
            return new gr3(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(j)) {
            return null;
        }
        String k2 = k(str, pattern, hashMap, rr4Var);
        byte[] decode = Base64.decode(k2.substring(k2.indexOf(44)), 0);
        UUID uuid2 = o51.f;
        return new gr3(uuid2, null, "video/mp4", lwe.a(uuid2, null, decode));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0a0f, code lost:
    
        if (r5.equals(r13) == false) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x09f5, code lost:
    
        if (r13.equals("POINT") == false) goto L349;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0ba3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:777:0x1191  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x1194 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fh5 d(jh5 jh5Var, fh5 fh5Var, pm3 pm3Var, Uri uri, rr4 rr4Var) {
        HashMap hashMap;
        Iterator it;
        zg5 zg5Var;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        int i;
        String str2;
        int i2;
        long j;
        int i3;
        ah5 ah5Var;
        String str3;
        long j2;
        String str4;
        HashMap hashMap2;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList2;
        String str5;
        TreeMap treeMap;
        ArrayList arrayList3;
        String str6;
        hr3 hr3Var;
        hr3 hr3Var2;
        String str7;
        int i4;
        String str8;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j3;
        String str9;
        int i5;
        hr3 hr3Var3;
        String j4;
        String str10;
        String str11;
        Matcher b;
        String str12;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        char c2;
        ArrayList arrayList10;
        Matcher matcher;
        boolean z;
        ArrayList arrayList11;
        xg5 xg5Var;
        int i6;
        char c3;
        String str13;
        long j5;
        hr3 hr3Var4;
        hr3 hr3Var5;
        jh5 jh5Var2 = jh5Var;
        fh5 fh5Var2 = fh5Var;
        String uri2 = uri.toString();
        boolean z2 = jh5Var2.c;
        ch5 ch5Var = fh5Var2 != null ? fh5Var2.x : null;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        eh5 eh5Var = new eh5(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap2 = new TreeMap();
        String str14 = "";
        int i7 = 0;
        String str15 = "";
        ch5 ch5Var2 = ch5Var;
        long j6 = -1;
        boolean z3 = z2;
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        long j9 = -9223372036854775807L;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z7 = false;
        int i12 = 1;
        hr3 hr3Var6 = null;
        hr3 hr3Var7 = null;
        String str16 = null;
        String str17 = null;
        ah5 ah5Var2 = null;
        String str18 = null;
        while (true) {
            int i13 = i8;
            String str19 = "POINT";
            eh5 eh5Var2 = eh5Var;
            if (!pm3Var.z()) {
                ArrayList arrayList16 = arrayList12;
                ArrayList arrayList17 = arrayList13;
                ArrayList arrayList18 = arrayList14;
                ArrayList arrayList19 = arrayList15;
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                ah5 ah5Var3 = ah5Var2;
                HashMap hashMap5 = new HashMap();
                int i14 = i7;
                while (i14 < arrayList18.size()) {
                    ArrayList arrayList20 = arrayList18;
                    bh5 bh5Var = (bh5) arrayList20.get(i14);
                    long j18 = bh5Var.b;
                    if (j18 == -1) {
                        j18 = (j10 + arrayList16.size()) - (arrayList17.isEmpty() ? 1L : 0L);
                    }
                    int i15 = bh5Var.c;
                    if (i15 == -1 && j7 != -9223372036854775807L) {
                        i15 = (arrayList17.isEmpty() ? ((ch5) dqe.b(arrayList16)).y : arrayList17).size() - 1;
                    }
                    Uri uri3 = bh5Var.a;
                    hashMap5.put(uri3, new bh5(uri3, j18, i15));
                    i14++;
                    arrayList18 = arrayList20;
                }
                if (ah5Var3 != null) {
                    arrayList17.add(ah5Var3);
                }
                ArrayList arrayList21 = new ArrayList();
                Iterator it2 = linkedHashMap4.values().iterator();
                while (it2.hasNext()) {
                    yg5 yg5Var = (yg5) it2.next();
                    Uri uri4 = yg5Var.d;
                    Uri uri5 = yg5Var.c;
                    if (uri4 != null ? uri5 == null : uri5 != null) {
                        long j19 = yg5Var.e;
                        if (j19 != -9223372036854775807L) {
                            String str20 = yg5Var.a;
                            long j20 = yg5Var.f;
                            hashMap = hashMap5;
                            it = it2;
                            long j21 = yg5Var.g;
                            long j22 = yg5Var.h;
                            ArrayList arrayList22 = yg5Var.i;
                            boolean z8 = yg5Var.j;
                            long j23 = yg5Var.k;
                            long j24 = yg5Var.l;
                            ArrayList arrayList23 = yg5Var.m;
                            ArrayList arrayList24 = yg5Var.n;
                            ArrayList arrayList25 = new ArrayList(yg5Var.b.values());
                            Boolean bool = yg5Var.o;
                            boolean z9 = bool == null || bool.booleanValue();
                            String str21 = yg5Var.p;
                            String str22 = str21 != null ? str21 : "POINT";
                            String str23 = yg5Var.q;
                            zg5Var = new zg5(str20, uri5, uri4, j19, j20, j21, j22, arrayList22, z8, j23, j24, arrayList23, arrayList24, arrayList25, z9, str22, str23 != null ? str23 : "HIGHLIGHT", yg5Var.r, yg5Var.s, yg5Var.t);
                            if (zg5Var == null) {
                                arrayList21.add(zg5Var);
                            }
                            it2 = it;
                            hashMap5 = hashMap;
                        }
                    }
                    hashMap = hashMap5;
                    it = it2;
                    zg5Var = null;
                    if (zg5Var == null) {
                    }
                    it2 = it;
                    hashMap5 = hashMap;
                }
                HashMap hashMap6 = hashMap5;
                if (j12 == 0 && fh5Var != null && fh5Var.p) {
                    j12 = fh5Var.h;
                }
                return new fh5(i11, uri.toString(), arrayList19, j8, z5, j12, z4, i9, j10, i12, j9, j7, z3, z6, j12 != 0, hr3Var6, arrayList16, arrayList17, eh5Var2, hashMap6, arrayList21, ch5Var2);
            }
            String B = pm3Var.B();
            HashMap hashMap7 = hashMap4;
            if (B.startsWith("#EXT")) {
                arrayList15.add(B);
            }
            if (B.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String k = k(B, V, hashMap3, rr4Var);
                if ("VOD".equals(k)) {
                    i11 = 1;
                } else if ("EVENT".equals(k)) {
                    i11 = 2;
                }
                i8 = i13;
                eh5Var = eh5Var2;
            } else if (B.equals("#EXT-X-I-FRAMES-ONLY")) {
                i8 = i13;
                eh5Var = eh5Var2;
                hashMap4 = hashMap7;
                z7 = true;
            } else {
                if (B.startsWith("#EXT-X-START")) {
                    arrayList = arrayList15;
                    linkedHashMap = linkedHashMap3;
                    long parseDouble = (long) (Double.parseDouble(k(B, h0, Collections.EMPTY_MAP, rr4Var)) * 1000000.0d);
                    z5 = f(B, E0, rr4Var);
                    j8 = parseDouble;
                } else {
                    arrayList = arrayList15;
                    linkedHashMap = linkedHashMap3;
                    if (B.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double g = g(B, W, -9.223372036854776E18d, rr4Var);
                        long j25 = g == -9.223372036854776E18d ? -9223372036854775807L : (long) (g * 1000000.0d);
                        boolean f2 = f(B, X, rr4Var);
                        double g2 = g(B, Z, -9.223372036854776E18d, rr4Var);
                        long j26 = g2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g2 * 1000000.0d);
                        double g3 = g(B, a0, -9.223372036854776E18d, rr4Var);
                        arrayList15 = arrayList;
                        i8 = i13;
                        hashMap4 = hashMap7;
                        linkedHashMap3 = linkedHashMap;
                        eh5Var = new eh5(j25, f2, j26, g3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g3 * 1000000.0d), f(B, b0, rr4Var));
                    } else if (B.startsWith("#EXT-X-PART-INF")) {
                        j7 = (long) (Double.parseDouble(k(B, T, Collections.EMPTY_MAP, rr4Var)) * 1000000.0d);
                    } else {
                        boolean startsWith = B.startsWith("#EXT-X-MAP");
                        Pattern pattern = j0;
                        Pattern pattern2 = p0;
                        if (startsWith) {
                            String k2 = k(B, pattern2, hashMap3, rr4Var);
                            String j27 = j(B, pattern, null, hashMap3, rr4Var);
                            if (j27 != null) {
                                String str24 = gcc.a;
                                String[] split = j27.split("@", -1);
                                j6 = Long.parseLong(split[i7]);
                                if (split.length > 1) {
                                    j14 = Long.parseLong(split[1]);
                                }
                            }
                            long j28 = j6;
                            long j29 = j28 == -1 ? 0L : j14;
                            if (str16 != null && str17 == null) {
                                throw hy7.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            ch5 ch5Var3 = new ch5(k2, j29, j28, str16, str17);
                            String str25 = str17;
                            if (j28 != -1) {
                                j29 += j28;
                            }
                            j14 = j29;
                            ch5Var2 = ch5Var3;
                            i8 = i13;
                            j6 = -1;
                            eh5Var = eh5Var2;
                            hashMap4 = hashMap7;
                            linkedHashMap3 = linkedHashMap;
                            arrayList15 = arrayList;
                            str17 = str25;
                        } else {
                            String str26 = str17;
                            ArrayList arrayList26 = arrayList13;
                            ArrayList arrayList27 = arrayList14;
                            if (B.startsWith("#EXT-X-TARGETDURATION")) {
                                j9 = Integer.parseInt(k(B, Q, Collections.EMPTY_MAP, rr4Var)) * 1000000;
                            } else if (B.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j13 = Long.parseLong(k(B, c0, Collections.EMPTY_MAP, rr4Var));
                                i8 = i13;
                                j10 = j13;
                                eh5Var = eh5Var2;
                                hashMap4 = hashMap7;
                                linkedHashMap3 = linkedHashMap;
                                arrayList15 = arrayList;
                                str17 = str26;
                                arrayList14 = arrayList27;
                                arrayList13 = arrayList26;
                            } else if (B.startsWith("#EXT-X-VERSION")) {
                                i12 = Integer.parseInt(k(B, U, Collections.EMPTY_MAP, rr4Var));
                            } else {
                                if (B.startsWith("#EXT-X-DEFINE")) {
                                    String j30 = j(B, u0, null, hashMap3, rr4Var);
                                    String j31 = j(B, v0, null, hashMap3, rr4Var);
                                    if (j30 != null) {
                                        m(j30, hashMap3);
                                        hashMap3.put(j30, k(B, F0, hashMap3, rr4Var));
                                    } else if (j31 != null) {
                                        m(j31, hashMap3);
                                        String queryParameter = uri.getQueryParameter(j31);
                                        if (queryParameter == null) {
                                            throw hy7.b("QUERYPARAM \"" + j31 + "\" not found in playlist URI", null);
                                        }
                                        hashMap3.put(j31, queryParameter);
                                    } else {
                                        String k3 = k(B, G0, hashMap3, rr4Var);
                                        m(k3, hashMap3);
                                        String str27 = (String) jh5Var2.l.get(k3);
                                        if (str27 != null) {
                                            hashMap3.put(k3, str27);
                                        }
                                    }
                                    str = str16;
                                    i = i13;
                                    str2 = str14;
                                    i2 = i7;
                                    j = j6;
                                    i3 = i10;
                                    ah5Var = ah5Var2;
                                    str3 = str18;
                                    j2 = j16;
                                    str4 = str15;
                                    hashMap2 = hashMap7;
                                    linkedHashMap2 = linkedHashMap;
                                    arrayList2 = arrayList26;
                                    str5 = uri2;
                                    treeMap = treeMap2;
                                } else if (B.startsWith("#EXTINF")) {
                                    j16 = new BigDecimal(k(B, d0, Collections.EMPTY_MAP, rr4Var)).multiply(new BigDecimal(1000000L)).longValue();
                                    str15 = j(B, e0, str14, hashMap3, rr4Var);
                                } else if (B.startsWith("#EXT-X-SKIP")) {
                                    int parseInt = Integer.parseInt(k(B, Y, Collections.EMPTY_MAP, rr4Var));
                                    yve.p((fh5Var2 == null || !arrayList12.isEmpty()) ? i7 : 1);
                                    String str28 = gcc.a;
                                    long j32 = fh5Var2.k;
                                    po5 po5Var = fh5Var2.r;
                                    int i16 = (int) (j10 - j32);
                                    int i17 = parseInt + i16;
                                    if (i16 >= 0 && i17 <= po5Var.size()) {
                                        long j33 = j15;
                                        str17 = str26;
                                        while (i16 < i17) {
                                            ch5 ch5Var4 = (ch5) po5Var.get(i16);
                                            if (j10 != fh5Var2.k) {
                                                int i18 = (fh5Var2.j - i9) + ch5Var4.d;
                                                po5 po5Var2 = ch5Var4.y;
                                                ArrayList arrayList28 = new ArrayList();
                                                int i19 = i7;
                                                long j34 = j33;
                                                while (i19 < po5Var2.size()) {
                                                    ah5 ah5Var4 = (ah5) po5Var2.get(i19);
                                                    arrayList28.add(new ah5(ah5Var4.a, ah5Var4.b, ah5Var4.c, i18, j34, ah5Var4.f, ah5Var4.h, ah5Var4.n, ah5Var4.r, ah5Var4.s, ah5Var4.w, ah5Var4.x, ah5Var4.y));
                                                    j34 += ah5Var4.c;
                                                    i19++;
                                                    str14 = str14;
                                                }
                                                str6 = str14;
                                                ch5Var4 = new ch5(ch5Var4.a, ch5Var4.b, ch5Var4.x, ch5Var4.c, i18, j33, ch5Var4.f, ch5Var4.h, ch5Var4.n, ch5Var4.r, ch5Var4.s, ch5Var4.w, arrayList28);
                                            } else {
                                                str6 = str14;
                                            }
                                            arrayList12.add(ch5Var4);
                                            long j35 = ch5Var4.c;
                                            String str29 = ch5Var4.n;
                                            j33 += j35;
                                            long j36 = ch5Var4.s;
                                            if (j36 != -1) {
                                                j14 = ch5Var4.r + j36;
                                            }
                                            int i20 = ch5Var4.d;
                                            ch5 ch5Var5 = ch5Var4.b;
                                            hr3 hr3Var8 = ch5Var4.f;
                                            String str30 = ch5Var4.h;
                                            if (str29 == null || !str29.equals(Long.toHexString(j13))) {
                                                str17 = str29;
                                            }
                                            j13++;
                                            i16++;
                                            i13 = i20;
                                            ch5Var2 = ch5Var5;
                                            str16 = str30;
                                            hr3Var7 = hr3Var8;
                                            j11 = j33;
                                            str14 = str6;
                                        }
                                        jh5Var2 = jh5Var;
                                        i8 = i13;
                                        eh5Var = eh5Var2;
                                        hashMap4 = hashMap7;
                                        linkedHashMap3 = linkedHashMap;
                                        arrayList15 = arrayList;
                                        arrayList14 = arrayList27;
                                        arrayList13 = arrayList26;
                                        j15 = j33;
                                    }
                                } else {
                                    str2 = str14;
                                    if (B.startsWith("#EXT-X-KEY")) {
                                        String k4 = k(B, m0, hashMap3, rr4Var);
                                        String j37 = j(B, n0, "identity", hashMap3, rr4Var);
                                        if ("NONE".equals(k4)) {
                                            treeMap2.clear();
                                            hr3Var7 = null;
                                            str16 = null;
                                            str17 = null;
                                        } else {
                                            String j38 = j(B, q0, null, hashMap3, rr4Var);
                                            if (!"identity".equals(j37)) {
                                                String str31 = str18;
                                                if (str31 == null) {
                                                    str18 = ("SAMPLE-AES-CENC".equals(k4) || "SAMPLE-AES-CTR".equals(k4)) ? "cenc" : "cbcs";
                                                } else {
                                                    str18 = str31;
                                                }
                                                gr3 c4 = c(B, j37, hashMap3, rr4Var);
                                                if (c4 != null) {
                                                    treeMap2.put(j37, c4);
                                                    str17 = j38;
                                                    hr3Var7 = null;
                                                    str16 = null;
                                                }
                                            } else if ("AES-128".equals(k4)) {
                                                str16 = k(B, pattern2, hashMap3, rr4Var);
                                                str17 = j38;
                                            }
                                            str17 = j38;
                                            str16 = null;
                                        }
                                        jh5Var2 = jh5Var;
                                        i8 = i13;
                                        eh5Var = eh5Var2;
                                        hashMap4 = hashMap7;
                                        linkedHashMap3 = linkedHashMap;
                                        arrayList15 = arrayList;
                                    } else {
                                        String str32 = str18;
                                        if (B.startsWith("#EXT-X-BYTERANGE")) {
                                            String k5 = k(B, i0, hashMap3, rr4Var);
                                            String str33 = gcc.a;
                                            String[] split2 = k5.split("@", -1);
                                            j6 = Long.parseLong(split2[i7]);
                                            if (split2.length > 1) {
                                                j14 = Long.parseLong(split2[1]);
                                            }
                                        } else if (B.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i9 = Integer.parseInt(B.substring(B.indexOf(58) + 1));
                                            jh5Var2 = jh5Var;
                                            str18 = str32;
                                            i8 = i13;
                                            eh5Var = eh5Var2;
                                            hashMap4 = hashMap7;
                                            linkedHashMap3 = linkedHashMap;
                                            arrayList15 = arrayList;
                                            str17 = str26;
                                            arrayList14 = arrayList27;
                                            arrayList13 = arrayList26;
                                            str14 = str2;
                                            z4 = true;
                                        } else if (B.equals("#EXT-X-DISCONTINUITY")) {
                                            i8 = i13 + 1;
                                            jh5Var2 = jh5Var;
                                            str18 = str32;
                                            eh5Var = eh5Var2;
                                            hashMap4 = hashMap7;
                                            linkedHashMap3 = linkedHashMap;
                                            arrayList15 = arrayList;
                                            str17 = str26;
                                        } else {
                                            if (B.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j12 == 0) {
                                                    j12 = gcc.T(gcc.W(B.substring(B.indexOf(58) + 1))) - j15;
                                                }
                                            } else if (B.equals("#EXT-X-GAP")) {
                                                jh5Var2 = jh5Var;
                                                str18 = str32;
                                                i8 = i13;
                                                eh5Var = eh5Var2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                i10 = 1;
                                            } else if (B.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                jh5Var2 = jh5Var;
                                                str18 = str32;
                                                i8 = i13;
                                                eh5Var = eh5Var2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                z3 = true;
                                            } else if (B.equals("#EXT-X-ENDLIST")) {
                                                jh5Var2 = jh5Var;
                                                str18 = str32;
                                                i8 = i13;
                                                eh5Var = eh5Var2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                z6 = true;
                                            } else if (B.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                arrayList27.add(new bh5(Uri.parse(d2f.c(uri2, k(B, pattern2, hashMap3, rr4Var))), i(B, f0, rr4Var), h(B, g0, rr4Var)));
                                            } else if (B.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                ah5 ah5Var5 = ah5Var2;
                                                if (ah5Var5 == null && "PART".equals(k(B, s0, hashMap3, rr4Var))) {
                                                    hr3 hr3Var9 = hr3Var7;
                                                    String k6 = k(B, pattern2, hashMap3, rr4Var);
                                                    long i21 = i(B, k0, rr4Var);
                                                    long i22 = i(B, l0, rr4Var);
                                                    String hexString = str16 == null ? null : str26 != null ? str26 : Long.toHexString(j13);
                                                    if (hr3Var9 != null || treeMap2.isEmpty()) {
                                                        hr3Var = hr3Var9;
                                                    } else {
                                                        gr3[] gr3VarArr = (gr3[]) treeMap2.values().toArray(new gr3[i7]);
                                                        hr3 hr3Var10 = new hr3(str32, true, gr3VarArr);
                                                        if (hr3Var6 == null) {
                                                            hr3Var2 = b(str32, gr3VarArr);
                                                            hr3Var = hr3Var10;
                                                            if (i21 == -1 && i22 == -1) {
                                                                str7 = str16;
                                                                i4 = i13;
                                                                ah5Var2 = ah5Var5;
                                                            } else {
                                                                if (i21 == -1) {
                                                                    i21 = 0;
                                                                }
                                                                long j39 = j11;
                                                                ah5 ah5Var6 = new ah5(k6, ch5Var2, 0L, i13, j39, hr3Var, str16, hexString, i21, i22, false, false, true);
                                                                j11 = j39;
                                                                str7 = str16;
                                                                i4 = i13;
                                                                ah5Var2 = ah5Var6;
                                                            }
                                                            arrayList14 = arrayList27;
                                                            str18 = str32;
                                                            hr3Var6 = hr3Var2;
                                                            hr3Var7 = hr3Var;
                                                            i8 = i4;
                                                            str16 = str7;
                                                            eh5Var = eh5Var2;
                                                            hashMap4 = hashMap7;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList15 = arrayList;
                                                            str17 = str26;
                                                            arrayList13 = arrayList26;
                                                            str14 = str2;
                                                            i7 = 0;
                                                            jh5Var2 = jh5Var;
                                                        } else {
                                                            hr3Var = hr3Var10;
                                                        }
                                                    }
                                                    hr3Var2 = hr3Var6;
                                                    if (i21 == -1) {
                                                    }
                                                    if (i21 == -1) {
                                                    }
                                                    long j392 = j11;
                                                    ah5 ah5Var62 = new ah5(k6, ch5Var2, 0L, i13, j392, hr3Var, str16, hexString, i21, i22, false, false, true);
                                                    j11 = j392;
                                                    str7 = str16;
                                                    i4 = i13;
                                                    ah5Var2 = ah5Var62;
                                                    arrayList14 = arrayList27;
                                                    str18 = str32;
                                                    hr3Var6 = hr3Var2;
                                                    hr3Var7 = hr3Var;
                                                    i8 = i4;
                                                    str16 = str7;
                                                    eh5Var = eh5Var2;
                                                    hashMap4 = hashMap7;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList15 = arrayList;
                                                    str17 = str26;
                                                    arrayList13 = arrayList26;
                                                    str14 = str2;
                                                    i7 = 0;
                                                    jh5Var2 = jh5Var;
                                                } else {
                                                    str = str16;
                                                    i = i13;
                                                    arrayList27 = arrayList27;
                                                    str5 = uri2;
                                                    ah5Var = ah5Var5;
                                                    str3 = str32;
                                                    treeMap = treeMap2;
                                                    i2 = i7;
                                                    j = j6;
                                                    i3 = i10;
                                                    j2 = j16;
                                                    str4 = str15;
                                                    hashMap2 = hashMap7;
                                                    linkedHashMap2 = linkedHashMap;
                                                    arrayList2 = arrayList26;
                                                }
                                            } else {
                                                str = str16;
                                                i = i13;
                                                hr3 hr3Var11 = hr3Var7;
                                                ah5 ah5Var7 = ah5Var2;
                                                if (B.startsWith("#EXT-X-PART")) {
                                                    String hexString2 = str == null ? null : str26 != null ? str26 : Long.toHexString(j13);
                                                    String k7 = k(B, pattern2, hashMap3, rr4Var);
                                                    long parseDouble2 = (long) (Double.parseDouble(k(B, R, Collections.EMPTY_MAP, rr4Var)) * 1000000.0d);
                                                    boolean f3 = f(B, C0, rr4Var) | (z3 && arrayList26.isEmpty());
                                                    boolean f4 = f(B, D0, rr4Var);
                                                    String j40 = j(B, pattern, null, hashMap3, rr4Var);
                                                    if (j40 != null) {
                                                        String str34 = gcc.a;
                                                        String[] split3 = j40.split("@", -1);
                                                        j5 = Long.parseLong(split3[0]);
                                                        str13 = uri2;
                                                        if (split3.length > 1) {
                                                            j17 = Long.parseLong(split3[1]);
                                                        }
                                                    } else {
                                                        str13 = uri2;
                                                        j5 = -1;
                                                    }
                                                    if (j5 == -1) {
                                                        j17 = 0;
                                                    }
                                                    if (hr3Var11 != null || treeMap2.isEmpty()) {
                                                        hr3Var4 = hr3Var11;
                                                    } else {
                                                        gr3[] gr3VarArr2 = (gr3[]) treeMap2.values().toArray(new gr3[0]);
                                                        hr3 hr3Var12 = new hr3(str32, true, gr3VarArr2);
                                                        if (hr3Var6 == null) {
                                                            hr3Var5 = b(str32, gr3VarArr2);
                                                            hr3Var4 = hr3Var12;
                                                            long j41 = j11;
                                                            arrayList26.add(new ah5(k7, ch5Var2, parseDouble2, i, j41, hr3Var4, str, hexString2, j17, j5, f4, f3, false));
                                                            j11 = j41 + parseDouble2;
                                                            if (j5 != -1) {
                                                                j17 += j5;
                                                            }
                                                            arrayList14 = arrayList27;
                                                            str18 = str32;
                                                            hr3Var6 = hr3Var5;
                                                            arrayList13 = arrayList26;
                                                            hr3Var7 = hr3Var4;
                                                            i8 = i;
                                                            str16 = str;
                                                            uri2 = str13;
                                                            eh5Var = eh5Var2;
                                                            hashMap4 = hashMap7;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList15 = arrayList;
                                                            str17 = str26;
                                                            str14 = str2;
                                                            i7 = 0;
                                                            jh5Var2 = jh5Var;
                                                            ah5Var2 = ah5Var7;
                                                        } else {
                                                            hr3Var4 = hr3Var12;
                                                        }
                                                    }
                                                    hr3Var5 = hr3Var6;
                                                    long j412 = j11;
                                                    arrayList26.add(new ah5(k7, ch5Var2, parseDouble2, i, j412, hr3Var4, str, hexString2, j17, j5, f4, f3, false));
                                                    j11 = j412 + parseDouble2;
                                                    if (j5 != -1) {
                                                    }
                                                    arrayList14 = arrayList27;
                                                    str18 = str32;
                                                    hr3Var6 = hr3Var5;
                                                    arrayList13 = arrayList26;
                                                    hr3Var7 = hr3Var4;
                                                    i8 = i;
                                                    str16 = str;
                                                    uri2 = str13;
                                                    eh5Var = eh5Var2;
                                                    hashMap4 = hashMap7;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList15 = arrayList;
                                                    str17 = str26;
                                                    str14 = str2;
                                                    i7 = 0;
                                                    jh5Var2 = jh5Var;
                                                    ah5Var2 = ah5Var7;
                                                } else {
                                                    str5 = uri2;
                                                    if (B.startsWith("#EXT-X-DATERANGE")) {
                                                        if (j(B, I0, str2, hashMap3, rr4Var).equals("com.apple.hls.interstitial")) {
                                                            String k8 = k(B, H0, hashMap3, rr4Var);
                                                            String j42 = j(B, O0, null, hashMap3, rr4Var);
                                                            Uri parse = j42 != null ? Uri.parse(j42) : null;
                                                            arrayList4 = arrayList26;
                                                            String j43 = j(B, P0, null, hashMap3, rr4Var);
                                                            Uri parse2 = j43 != null ? Uri.parse(j43) : null;
                                                            hr3Var7 = hr3Var11;
                                                            String j44 = j(B, J0, null, hashMap3, rr4Var);
                                                            long T2 = j44 != null ? gcc.T(gcc.W(j44)) : -9223372036854775807L;
                                                            String j45 = j(B, L0, null, hashMap3, rr4Var);
                                                            long T3 = j45 != null ? gcc.T(gcc.W(j45)) : -9223372036854775807L;
                                                            ArrayList arrayList29 = new ArrayList();
                                                            str2 = str2;
                                                            String j46 = j(B, K0, null, hashMap3, rr4Var);
                                                            if (j46 != null) {
                                                                String str35 = gcc.a;
                                                                treeMap = treeMap2;
                                                                String[] split4 = j46.split(",", -1);
                                                                int length = split4.length;
                                                                int i23 = 0;
                                                                while (i23 < length) {
                                                                    int i24 = i23;
                                                                    String trim = split4[i23].trim();
                                                                    trim.getClass();
                                                                    switch (trim.hashCode()) {
                                                                        case 79491:
                                                                            i6 = length;
                                                                            if (trim.equals("PRE")) {
                                                                                c3 = 0;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 2430593:
                                                                            i6 = length;
                                                                            if (trim.equals("ONCE")) {
                                                                                c3 = 1;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 2461856:
                                                                            i6 = length;
                                                                            if (trim.equals("POST")) {
                                                                                c3 = 2;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        default:
                                                                            i6 = length;
                                                                            c3 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c3) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                            arrayList29.add(trim);
                                                                            break;
                                                                    }
                                                                    i23 = i24 + 1;
                                                                    length = i6;
                                                                }
                                                            } else {
                                                                treeMap = treeMap2;
                                                            }
                                                            arrayList27 = arrayList27;
                                                            double g4 = g(B, S, -1.0d, rr4Var);
                                                            long j47 = g4 >= 0.0d ? (long) (g4 * 1000000.0d) : -9223372036854775807L;
                                                            ah5 ah5Var8 = ah5Var7;
                                                            double g5 = g(B, M0, -1.0d, rr4Var);
                                                            long j48 = g5 >= 0.0d ? (long) (g5 * 1000000.0d) : -9223372036854775807L;
                                                            boolean f5 = f(B, N0, rr4Var);
                                                            double g6 = g(B, Q0, Double.MIN_VALUE, rr4Var);
                                                            long j49 = g6 != Double.MIN_VALUE ? (long) (g6 * 1000000.0d) : -9223372036854775807L;
                                                            double g7 = g(B, R0, -1.0d, rr4Var);
                                                            long j50 = g7 >= 0.0d ? (long) (g7 * 1000000.0d) : -9223372036854775807L;
                                                            ArrayList arrayList30 = new ArrayList();
                                                            String j51 = j(B, S0, null, hashMap3, rr4Var);
                                                            if (j51 != null) {
                                                                String str36 = gcc.a;
                                                                String[] split5 = j51.split(",", -1);
                                                                int length2 = split5.length;
                                                                str8 = str32;
                                                                int i25 = 0;
                                                                while (i25 < length2) {
                                                                    int i26 = i25;
                                                                    String trim2 = split5[i25].trim();
                                                                    trim2.getClass();
                                                                    String[] strArr = split5;
                                                                    if (trim2.equals("IN") || trim2.equals("OUT")) {
                                                                        arrayList30.add(trim2);
                                                                    }
                                                                    i25 = i26 + 1;
                                                                    split5 = strArr;
                                                                }
                                                            } else {
                                                                str8 = str32;
                                                            }
                                                            ArrayList arrayList31 = new ArrayList();
                                                            String j52 = j(B, T0, null, hashMap3, rr4Var);
                                                            if (j52 != null) {
                                                                String str37 = gcc.a;
                                                                String[] split6 = j52.split(",", -1);
                                                                int length3 = split6.length;
                                                                int i27 = 0;
                                                                while (i27 < length3) {
                                                                    String[] strArr2 = split6;
                                                                    String trim3 = split6[i27].trim();
                                                                    trim3.getClass();
                                                                    int i28 = length3;
                                                                    if (trim3.equals("JUMP") || trim3.equals("SKIP")) {
                                                                        arrayList31.add(trim3);
                                                                    }
                                                                    i27++;
                                                                    length3 = i28;
                                                                    split6 = strArr2;
                                                                }
                                                            }
                                                            Boolean valueOf = j(B, U0, null, hashMap3, rr4Var) != null ? Boolean.valueOf(!r4.equals("NO")) : null;
                                                            String j53 = j(B, V0, null, hashMap3, rr4Var);
                                                            if (j53 != null) {
                                                                if (j53.equals("RANGE")) {
                                                                    str19 = "RANGE";
                                                                }
                                                                j4 = j(B, W0, null, hashMap3, rr4Var);
                                                                if (j4 != null) {
                                                                    str10 = "PRIMARY";
                                                                    if (!j4.equals("PRIMARY")) {
                                                                        str10 = "HIGHLIGHT";
                                                                    }
                                                                    double g8 = g(B, X0, -1.0d, rr4Var);
                                                                    long j54 = g8 >= 0.0d ? (long) (g8 * 1000000.0d) : -9223372036854775807L;
                                                                    str11 = str19;
                                                                    double g9 = g(B, Y0, -1.0d, rr4Var);
                                                                    long j55 = g9 >= 0.0d ? (long) (g9 * 1000000.0d) : -9223372036854775807L;
                                                                    String j56 = j(B, Z0, null, hashMap3, rr4Var);
                                                                    ArrayList arrayList32 = new ArrayList();
                                                                    String substring = B.substring(17);
                                                                    int i29 = rr4.b;
                                                                    b = rr4Var.b(b1, substring);
                                                                    while (true) {
                                                                        str12 = str11;
                                                                        if (b.find()) {
                                                                            String group = b.group();
                                                                            group.getClass();
                                                                            ah5 ah5Var9 = ah5Var8;
                                                                            switch (group.hashCode()) {
                                                                                case -2136701954:
                                                                                    if (group.equals("X-SNAP=")) {
                                                                                        c2 = 0;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case -1843050726:
                                                                                    if (group.equals("X-CONTENT-MAY-VARY=")) {
                                                                                        c2 = 1;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case -148960310:
                                                                                    if (group.equals("X-PLAYOUT-LIMIT=")) {
                                                                                        c2 = 2;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case -36345757:
                                                                                    if (group.equals("X-TIMELINE-STYLE=")) {
                                                                                        c2 = 3;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 397239341:
                                                                                    if (group.equals("X-ASSET-LIST=")) {
                                                                                        c2 = 4;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 850193465:
                                                                                    if (group.equals("X-TIMELINE-OCCUPIES=")) {
                                                                                        c2 = 5;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 1065650400:
                                                                                    if (group.equals("X-SKIP-CONTROL-DURATION=")) {
                                                                                        c2 = 6;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 1274498945:
                                                                                    if (group.equals("X-SKIP-CONTROL-OFFSET=")) {
                                                                                        c2 = 7;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 1472528844:
                                                                                    if (group.equals("X-RESTRICT=")) {
                                                                                        c2 = '\b';
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 1748487807:
                                                                                    if (group.equals("X-RESUME-OFFSET=")) {
                                                                                        c2 = '\t';
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 1814205923:
                                                                                    if (group.equals("X-ASSET-URI=")) {
                                                                                        c2 = '\n';
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 2080546752:
                                                                                    if (group.equals("X-SKIP-CONTROL-LABEL-ID=")) {
                                                                                        c2 = 11;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                default:
                                                                                    c2 = 65535;
                                                                                    break;
                                                                            }
                                                                            switch (c2) {
                                                                                case 0:
                                                                                case 1:
                                                                                case 2:
                                                                                case 3:
                                                                                case 4:
                                                                                case 5:
                                                                                case 6:
                                                                                case 7:
                                                                                case '\b':
                                                                                case '\t':
                                                                                case '\n':
                                                                                case 11:
                                                                                    arrayList10 = arrayList29;
                                                                                    matcher = b;
                                                                                    z = f5;
                                                                                    arrayList11 = arrayList12;
                                                                                    break;
                                                                                default:
                                                                                    matcher = b;
                                                                                    String n2 = bs2.n(1, 0, group);
                                                                                    String concat = n2.concat("=");
                                                                                    int length4 = concat.length() + substring.indexOf(concat);
                                                                                    z = f5;
                                                                                    String substring2 = substring.substring(length4, (substring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                                    if (substring2.startsWith("\"")) {
                                                                                        xg5Var = new xg5(0, n2, k(substring, Pattern.compile(n2.concat("=\"((?:.|\f)+?)\"")), hashMap3, rr4Var));
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                    } else if (substring2.equals("0x") || substring2.equals("0X")) {
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                        xg5Var = new xg5(1, n2, k(substring, Pattern.compile(n2.concat("=(0[xX][A-F0-9]+)")), hashMap3, rr4Var));
                                                                                    } else {
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                        xg5Var = new xg5(n2, Double.parseDouble(k(substring, Pattern.compile(n2.concat("=([\\d\\.]+)\\b")), Collections.EMPTY_MAP, rr4Var)));
                                                                                    }
                                                                                    arrayList32.add(xg5Var);
                                                                                    break;
                                                                            }
                                                                            arrayList12 = arrayList11;
                                                                            str11 = str12;
                                                                            b = matcher;
                                                                            f5 = z;
                                                                            arrayList29 = arrayList10;
                                                                            ah5Var8 = ah5Var9;
                                                                        } else {
                                                                            ArrayList arrayList33 = arrayList29;
                                                                            ah5Var = ah5Var8;
                                                                            boolean z10 = f5;
                                                                            linkedHashMap2 = linkedHashMap;
                                                                            ArrayList arrayList34 = arrayList12;
                                                                            yg5 yg5Var2 = linkedHashMap2.containsKey(k8) ? (yg5) linkedHashMap2.get(k8) : new yg5(k8);
                                                                            if (parse == null) {
                                                                                yg5Var2.getClass();
                                                                            } else {
                                                                                Uri uri6 = yg5Var2.c;
                                                                                if (uri6 != null) {
                                                                                    yve.i(uri6.equals(parse), "Can't change assetUri from %s to %s", yg5Var2.c, parse);
                                                                                }
                                                                                yg5Var2.c = parse;
                                                                            }
                                                                            if (parse2 != null) {
                                                                                Uri uri7 = yg5Var2.d;
                                                                                if (uri7 != null) {
                                                                                    yve.i(uri7.equals(parse2), "Can't change assetListUri from %s to %s", yg5Var2.d, parse2);
                                                                                }
                                                                                yg5Var2.d = parse2;
                                                                            }
                                                                            if (T2 != -9223372036854775807L) {
                                                                                long j57 = yg5Var2.e;
                                                                                if (j57 != -9223372036854775807L) {
                                                                                    yve.g(j57 == T2, "Can't change startDateUnixUs from %s to %s", j57, T2);
                                                                                }
                                                                                yg5Var2.e = T2;
                                                                            }
                                                                            if (T3 != -9223372036854775807L) {
                                                                                long j58 = yg5Var2.f;
                                                                                if (j58 != -9223372036854775807L) {
                                                                                    yve.g(j58 == T3, "Can't change endDateUnixUs from %s to %s", j58, T3);
                                                                                }
                                                                                yg5Var2.f = T3;
                                                                            }
                                                                            if (j47 != -9223372036854775807L) {
                                                                                long j59 = yg5Var2.g;
                                                                                if (j59 != -9223372036854775807L) {
                                                                                    yve.g(j59 == j47, "Can't change durationUs from %s to %s", j59, j47);
                                                                                }
                                                                                yg5Var2.g = j47;
                                                                            }
                                                                            if (j48 != -9223372036854775807L) {
                                                                                long j60 = yg5Var2.h;
                                                                                if (j60 != -9223372036854775807L) {
                                                                                    yve.g(j60 == j48, "Can't change plannedDurationUs from %s to %s", j60, j48);
                                                                                }
                                                                                yg5Var2.h = j48;
                                                                            }
                                                                            if (arrayList33.isEmpty()) {
                                                                                arrayList5 = arrayList34;
                                                                            } else {
                                                                                if (yg5Var2.i.isEmpty()) {
                                                                                    arrayList5 = arrayList34;
                                                                                    arrayList6 = arrayList33;
                                                                                } else {
                                                                                    arrayList6 = arrayList33;
                                                                                    boolean equals = yg5Var2.i.equals(arrayList6);
                                                                                    StringBuilder sb = new StringBuilder("Can't change cue from ");
                                                                                    ArrayList arrayList35 = yg5Var2.i;
                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                    Iterator it3 = arrayList35.iterator();
                                                                                    if (it3.hasNext()) {
                                                                                        arrayList5 = arrayList34;
                                                                                        Object next = it3.next();
                                                                                        while (true) {
                                                                                            sb2.append((CharSequence) next);
                                                                                            if (it3.hasNext()) {
                                                                                                sb2.append((CharSequence) ", ");
                                                                                                next = it3.next();
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        arrayList5 = arrayList34;
                                                                                    }
                                                                                    sb.append(sb2.toString());
                                                                                    sb.append(" to ");
                                                                                    StringBuilder sb3 = new StringBuilder();
                                                                                    Iterator it4 = arrayList6.iterator();
                                                                                    if (it4.hasNext()) {
                                                                                        Object next2 = it4.next();
                                                                                        while (true) {
                                                                                            sb3.append((CharSequence) next2);
                                                                                            if (it4.hasNext()) {
                                                                                                sb3.append((CharSequence) ", ");
                                                                                                next2 = it4.next();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    sb.append(sb3.toString());
                                                                                    yve.e(sb.toString(), equals);
                                                                                }
                                                                                yg5Var2.i = arrayList6;
                                                                            }
                                                                            if (z10) {
                                                                                yg5Var2.j = true;
                                                                            }
                                                                            if (j49 != -9223372036854775807L) {
                                                                                long j61 = yg5Var2.k;
                                                                                if (j61 != -9223372036854775807L) {
                                                                                    yve.g(j61 == j49, "Can't change resumeOffsetUs from %s to %s", j61, j49);
                                                                                }
                                                                                yg5Var2.k = j49;
                                                                            }
                                                                            if (j50 != -9223372036854775807L) {
                                                                                long j62 = yg5Var2.l;
                                                                                if (j62 != -9223372036854775807L) {
                                                                                    yve.g(j62 == j50, "Can't change playoutLimitUs from %s to %s", j62, j50);
                                                                                }
                                                                                yg5Var2.l = j50;
                                                                            }
                                                                            if (!arrayList30.isEmpty()) {
                                                                                if (yg5Var2.m.isEmpty()) {
                                                                                    arrayList9 = arrayList30;
                                                                                } else {
                                                                                    arrayList9 = arrayList30;
                                                                                    boolean equals2 = yg5Var2.m.equals(arrayList9);
                                                                                    StringBuilder sb4 = new StringBuilder("Can't change snapTypes from ");
                                                                                    ArrayList arrayList36 = yg5Var2.m;
                                                                                    StringBuilder sb5 = new StringBuilder();
                                                                                    Iterator it5 = arrayList36.iterator();
                                                                                    if (it5.hasNext()) {
                                                                                        Object next3 = it5.next();
                                                                                        while (true) {
                                                                                            sb5.append((CharSequence) next3);
                                                                                            if (it5.hasNext()) {
                                                                                                sb5.append((CharSequence) ", ");
                                                                                                next3 = it5.next();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    sb4.append(sb5.toString());
                                                                                    sb4.append(" to ");
                                                                                    StringBuilder sb6 = new StringBuilder();
                                                                                    Iterator it6 = arrayList9.iterator();
                                                                                    if (it6.hasNext()) {
                                                                                        Object next4 = it6.next();
                                                                                        while (true) {
                                                                                            sb6.append((CharSequence) next4);
                                                                                            if (it6.hasNext()) {
                                                                                                sb6.append((CharSequence) ", ");
                                                                                                next4 = it6.next();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    sb4.append(sb6.toString());
                                                                                    yve.e(sb4.toString(), equals2);
                                                                                }
                                                                                yg5Var2.m = arrayList9;
                                                                            }
                                                                            if (!arrayList31.isEmpty()) {
                                                                                if (yg5Var2.n.isEmpty()) {
                                                                                    arrayList8 = arrayList31;
                                                                                } else {
                                                                                    arrayList8 = arrayList31;
                                                                                    boolean equals3 = yg5Var2.n.equals(arrayList8);
                                                                                    StringBuilder sb7 = new StringBuilder("Can't change restrictions from ");
                                                                                    ArrayList arrayList37 = yg5Var2.n;
                                                                                    StringBuilder sb8 = new StringBuilder();
                                                                                    Iterator it7 = arrayList37.iterator();
                                                                                    if (it7.hasNext()) {
                                                                                        Object next5 = it7.next();
                                                                                        while (true) {
                                                                                            sb8.append((CharSequence) next5);
                                                                                            if (it7.hasNext()) {
                                                                                                sb8.append((CharSequence) ", ");
                                                                                                next5 = it7.next();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    sb7.append(sb8.toString());
                                                                                    sb7.append(" to ");
                                                                                    StringBuilder sb9 = new StringBuilder();
                                                                                    Iterator it8 = arrayList8.iterator();
                                                                                    if (it8.hasNext()) {
                                                                                        while (true) {
                                                                                            sb9.append((CharSequence) it8.next());
                                                                                            if (it8.hasNext()) {
                                                                                                sb9.append((CharSequence) ", ");
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    sb7.append(sb9.toString());
                                                                                    yve.e(sb7.toString(), equals3);
                                                                                }
                                                                                yg5Var2.n = arrayList8;
                                                                            }
                                                                            HashMap hashMap8 = yg5Var2.b;
                                                                            if (!arrayList32.isEmpty()) {
                                                                                int i30 = 0;
                                                                                while (i30 < arrayList32.size()) {
                                                                                    xg5 xg5Var2 = (xg5) arrayList32.get(i30);
                                                                                    String str38 = xg5Var2.a;
                                                                                    xg5 xg5Var3 = (xg5) hashMap8.get(str38);
                                                                                    if (xg5Var3 != null) {
                                                                                        boolean equals4 = xg5Var3.equals(xg5Var2);
                                                                                        arrayList7 = arrayList32;
                                                                                        Object[] objArr = {str38, xg5Var3.d, Double.valueOf(xg5Var3.c), xg5Var2.d, Double.valueOf(xg5Var2.c)};
                                                                                        if (!equals4) {
                                                                                            lq5.j(fze.a("Can't change %s from %s %s to %s %s", objArr));
                                                                                            return null;
                                                                                        }
                                                                                    } else {
                                                                                        arrayList7 = arrayList32;
                                                                                    }
                                                                                    hashMap8.put(str38, xg5Var2);
                                                                                    i30++;
                                                                                    arrayList32 = arrayList7;
                                                                                }
                                                                            }
                                                                            if (valueOf != null) {
                                                                                Boolean bool2 = yg5Var2.o;
                                                                                if (bool2 != null) {
                                                                                    yve.i(bool2.equals(valueOf), "Can't change contentMayVary from %s to %s", yg5Var2.o, valueOf);
                                                                                }
                                                                                yg5Var2.o = valueOf;
                                                                            }
                                                                            if (str12 != null) {
                                                                                String str39 = yg5Var2.p;
                                                                                if (str39 != null) {
                                                                                    yve.i(str39.equals(str12), "Can't change timelineOccupies from %s to %s", yg5Var2.p, str12);
                                                                                }
                                                                                yg5Var2.p = str12;
                                                                            }
                                                                            if (str10 != null) {
                                                                                String str40 = yg5Var2.q;
                                                                                if (str40 != null) {
                                                                                    yve.i(str40.equals(str10), "Can't change timelineStyle from %s to %s", yg5Var2.q, str10);
                                                                                }
                                                                                yg5Var2.q = str10;
                                                                            }
                                                                            if (j54 != -9223372036854775807L) {
                                                                                long j63 = yg5Var2.r;
                                                                                if (j63 != -9223372036854775807L) {
                                                                                    yve.g(j63 == j54, "Can't change skipControlOffsetUs from %s to %s", j63, j54);
                                                                                }
                                                                                yg5Var2.r = j54;
                                                                            }
                                                                            if (j55 != -9223372036854775807L) {
                                                                                long j64 = yg5Var2.s;
                                                                                if (j64 != -9223372036854775807L) {
                                                                                    yve.g(j64 == j55, "Can't change skipControlDurationUs from %s to %s", j64, j55);
                                                                                }
                                                                                yg5Var2.s = j55;
                                                                            }
                                                                            if (j56 != null) {
                                                                                String str41 = yg5Var2.t;
                                                                                if (str41 != null) {
                                                                                    yve.i(str41.equals(j56), "Can't change skipControlLabelId from %s to %s", yg5Var2.t, j56);
                                                                                }
                                                                                yg5Var2.t = j56;
                                                                            }
                                                                            linkedHashMap2.put(k8, yg5Var2);
                                                                            str3 = str8;
                                                                            j = j6;
                                                                            i3 = i10;
                                                                            j2 = j16;
                                                                            str4 = str15;
                                                                            hashMap2 = hashMap7;
                                                                            arrayList3 = arrayList5;
                                                                            arrayList2 = arrayList4;
                                                                            i2 = 0;
                                                                            jh5Var2 = jh5Var;
                                                                            linkedHashMap3 = linkedHashMap2;
                                                                            arrayList13 = arrayList2;
                                                                            i7 = i2;
                                                                            arrayList12 = arrayList3;
                                                                            str15 = str4;
                                                                            j16 = j2;
                                                                            i8 = i;
                                                                            str16 = str;
                                                                            i10 = i3;
                                                                            uri2 = str5;
                                                                            treeMap2 = treeMap;
                                                                            eh5Var = eh5Var2;
                                                                            str17 = str26;
                                                                            arrayList14 = arrayList27;
                                                                            ah5Var2 = ah5Var;
                                                                            fh5Var2 = fh5Var;
                                                                            hashMap4 = hashMap2;
                                                                            str18 = str3;
                                                                            j6 = j;
                                                                            arrayList15 = arrayList;
                                                                            str14 = str2;
                                                                        }
                                                                    }
                                                                }
                                                                str10 = null;
                                                                double g82 = g(B, X0, -1.0d, rr4Var);
                                                                if (g82 >= 0.0d) {
                                                                }
                                                                str11 = str19;
                                                                double g92 = g(B, Y0, -1.0d, rr4Var);
                                                                if (g92 >= 0.0d) {
                                                                }
                                                                String j562 = j(B, Z0, null, hashMap3, rr4Var);
                                                                ArrayList arrayList322 = new ArrayList();
                                                                String substring3 = B.substring(17);
                                                                int i292 = rr4.b;
                                                                b = rr4Var.b(b1, substring3);
                                                                while (true) {
                                                                    str12 = str11;
                                                                    if (b.find()) {
                                                                    }
                                                                    arrayList12 = arrayList11;
                                                                    str11 = str12;
                                                                    b = matcher;
                                                                    f5 = z;
                                                                    arrayList29 = arrayList10;
                                                                    ah5Var8 = ah5Var9;
                                                                }
                                                            }
                                                            str19 = null;
                                                            j4 = j(B, W0, null, hashMap3, rr4Var);
                                                            if (j4 != null) {
                                                            }
                                                            str10 = null;
                                                            double g822 = g(B, X0, -1.0d, rr4Var);
                                                            if (g822 >= 0.0d) {
                                                            }
                                                            str11 = str19;
                                                            double g922 = g(B, Y0, -1.0d, rr4Var);
                                                            if (g922 >= 0.0d) {
                                                            }
                                                            String j5622 = j(B, Z0, null, hashMap3, rr4Var);
                                                            ArrayList arrayList3222 = new ArrayList();
                                                            String substring32 = B.substring(17);
                                                            int i2922 = rr4.b;
                                                            b = rr4Var.b(b1, substring32);
                                                            while (true) {
                                                                str12 = str11;
                                                                if (b.find()) {
                                                                }
                                                                arrayList12 = arrayList11;
                                                                str11 = str12;
                                                                b = matcher;
                                                                f5 = z;
                                                                arrayList29 = arrayList10;
                                                                ah5Var8 = ah5Var9;
                                                            }
                                                        } else {
                                                            str2 = str2;
                                                        }
                                                    }
                                                    arrayList27 = arrayList27;
                                                    ah5Var = ah5Var7;
                                                    str8 = str32;
                                                    arrayList4 = arrayList26;
                                                    hr3Var7 = hr3Var11;
                                                    treeMap = treeMap2;
                                                    linkedHashMap2 = linkedHashMap;
                                                    arrayList5 = arrayList12;
                                                    if (B.startsWith("#")) {
                                                        str3 = str8;
                                                        j = j6;
                                                        i3 = i10;
                                                        j2 = j16;
                                                        str4 = str15;
                                                        hashMap2 = hashMap7;
                                                        arrayList3 = arrayList5;
                                                        arrayList2 = arrayList4;
                                                        i2 = 0;
                                                        jh5Var2 = jh5Var;
                                                        linkedHashMap3 = linkedHashMap2;
                                                        arrayList13 = arrayList2;
                                                        i7 = i2;
                                                        arrayList12 = arrayList3;
                                                        str15 = str4;
                                                        j16 = j2;
                                                        i8 = i;
                                                        str16 = str;
                                                        i10 = i3;
                                                        uri2 = str5;
                                                        treeMap2 = treeMap;
                                                        eh5Var = eh5Var2;
                                                        str17 = str26;
                                                        arrayList14 = arrayList27;
                                                        ah5Var2 = ah5Var;
                                                        fh5Var2 = fh5Var;
                                                        hashMap4 = hashMap2;
                                                        str18 = str3;
                                                        j6 = j;
                                                        arrayList15 = arrayList;
                                                        str14 = str2;
                                                    } else {
                                                        String hexString3 = str == null ? null : str26 != null ? str26 : Long.toHexString(j13);
                                                        long j65 = j13 + 1;
                                                        String l = l(B, hashMap3, rr4Var);
                                                        ch5 ch5Var6 = (ch5) hashMap7.get(l);
                                                        if (j6 == -1) {
                                                            j3 = 0;
                                                        } else {
                                                            if (z7 && ch5Var2 == null && ch5Var6 == null) {
                                                                ch5Var6 = new ch5(l, 0L, j14, null, null);
                                                                hashMap7.put(l, ch5Var6);
                                                            }
                                                            j3 = j14;
                                                        }
                                                        if (hr3Var7 != null || treeMap.isEmpty()) {
                                                            str9 = str8;
                                                            i5 = 0;
                                                            hr3Var3 = hr3Var7;
                                                        } else {
                                                            i5 = 0;
                                                            gr3[] gr3VarArr3 = (gr3[]) treeMap.values().toArray(new gr3[0]);
                                                            str9 = str8;
                                                            hr3 hr3Var13 = new hr3(str9, true, gr3VarArr3);
                                                            if (hr3Var6 == null) {
                                                                hr3Var6 = b(str9, gr3VarArr3);
                                                            }
                                                            hr3Var3 = hr3Var13;
                                                        }
                                                        String str42 = hexString3;
                                                        long j66 = j6;
                                                        long j67 = j15;
                                                        long j68 = j16;
                                                        arrayList5.add(new ch5(l, ch5Var2 != null ? ch5Var2 : ch5Var6, str15, j68, i, j67, hr3Var3, str, str42, j3, j66, i10, arrayList4));
                                                        long j69 = j67 + j68;
                                                        ArrayList arrayList38 = new ArrayList();
                                                        if (j6 != -1) {
                                                            j3 += j66;
                                                        }
                                                        j14 = j3;
                                                        linkedHashMap3 = linkedHashMap2;
                                                        j13 = j65;
                                                        hashMap4 = hashMap7;
                                                        j15 = j69;
                                                        i7 = i5;
                                                        i10 = i7;
                                                        i8 = i;
                                                        hr3Var7 = hr3Var3;
                                                        str16 = str;
                                                        uri2 = str5;
                                                        j6 = -1;
                                                        j16 = 0;
                                                        eh5Var = eh5Var2;
                                                        str17 = str26;
                                                        arrayList14 = arrayList27;
                                                        ah5Var2 = ah5Var;
                                                        str14 = str2;
                                                        str15 = str14;
                                                        fh5Var2 = fh5Var;
                                                        arrayList13 = arrayList38;
                                                        j11 = j15;
                                                        arrayList12 = arrayList5;
                                                        treeMap2 = treeMap;
                                                        jh5Var2 = jh5Var;
                                                        str18 = str9;
                                                        arrayList15 = arrayList;
                                                    }
                                                }
                                            }
                                            str = str16;
                                            i = i13;
                                            str3 = str32;
                                            treeMap = treeMap2;
                                            i2 = i7;
                                            j = j6;
                                            i3 = i10;
                                            ah5Var = ah5Var2;
                                            j2 = j16;
                                            str4 = str15;
                                            hashMap2 = hashMap7;
                                            linkedHashMap2 = linkedHashMap;
                                            arrayList2 = arrayList26;
                                            str5 = uri2;
                                        }
                                        jh5Var2 = jh5Var;
                                        str18 = str32;
                                        i8 = i13;
                                        eh5Var = eh5Var2;
                                        hashMap4 = hashMap7;
                                        linkedHashMap3 = linkedHashMap;
                                        arrayList15 = arrayList;
                                        str17 = str26;
                                    }
                                    arrayList14 = arrayList27;
                                    arrayList13 = arrayList26;
                                    str14 = str2;
                                }
                                arrayList3 = arrayList12;
                                jh5Var2 = jh5Var;
                                linkedHashMap3 = linkedHashMap2;
                                arrayList13 = arrayList2;
                                i7 = i2;
                                arrayList12 = arrayList3;
                                str15 = str4;
                                j16 = j2;
                                i8 = i;
                                str16 = str;
                                i10 = i3;
                                uri2 = str5;
                                treeMap2 = treeMap;
                                eh5Var = eh5Var2;
                                str17 = str26;
                                arrayList14 = arrayList27;
                                ah5Var2 = ah5Var;
                                fh5Var2 = fh5Var;
                                hashMap4 = hashMap2;
                                str18 = str3;
                                j6 = j;
                                arrayList15 = arrayList;
                                str14 = str2;
                            }
                            i8 = i13;
                            eh5Var = eh5Var2;
                            hashMap4 = hashMap7;
                            linkedHashMap3 = linkedHashMap;
                            arrayList15 = arrayList;
                            str17 = str26;
                            arrayList14 = arrayList27;
                            arrayList13 = arrayList26;
                        }
                    }
                }
                i8 = i13;
                eh5Var = eh5Var2;
                linkedHashMap3 = linkedHashMap;
                arrayList15 = arrayList;
            }
            hashMap4 = hashMap7;
        }
        throw new lh5();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(31:52|(1:54)(1:147)|55|(2:57|(26:59|60|(1:143)(7:77|(1:79)|80|(1:82)(4:127|(2:128|(3:130|(1:138)(4:132|(1:134)|135|136)|137)(1:139))|140|(3:142|(1:85)(1:126)|86))|83|(0)(0)|86)|87|(2:89|(0))(1:125)|124|92|(1:94)(1:123)|95|96|(1:98)|99|(1:101)(2:117|(1:119)(3:120|121|122))|102|103|104|105|106|107|108|109|(1:111)|112|14|15|16)(1:144))(1:146)|145|60|(0)|143|87|(0)(0)|124|92|(0)(0)|95|96|(0)|99|(0)(0)|102|103|104|105|106|107|108|109|(0)|112|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02c4, code lost:
    
        if (r6 > 0) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ea  */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v13 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jh5 e(pm3 pm3Var, Uri uri, rr4 rr4Var) {
        int i;
        int i2;
        char c2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ih5 ih5Var;
        String str;
        int parseInt;
        String str2;
        ih5 ih5Var2;
        String str3;
        ih5 ih5Var3;
        HashMap hashMap;
        HashSet hashSet;
        int i3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i4;
        String str4;
        String str5;
        String w2;
        bm2 bm2Var;
        String j;
        String str6;
        int i5;
        int i6;
        Uri d2;
        ArrayList arrayList9;
        HashMap hashMap2;
        ArrayList arrayList10;
        bm2 bm2Var2;
        String sb;
        String uri2 = uri.toString();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        ym4 ym4Var = null;
        while (true) {
            boolean z3 = pm3Var.z();
            Pattern pattern = p0;
            ArrayList arrayList19 = arrayList15;
            Pattern pattern2 = u0;
            boolean z4 = z;
            boolean z5 = z2;
            if (!z3) {
                ArrayList arrayList20 = arrayList11;
                HashMap hashMap5 = hashMap3;
                ArrayList arrayList21 = arrayList16;
                ArrayList arrayList22 = arrayList18;
                ArrayList arrayList23 = arrayList12;
                ArrayList arrayList24 = arrayList13;
                ArrayList arrayList25 = arrayList14;
                ArrayList arrayList26 = arrayList17;
                ArrayList arrayList27 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                int i7 = 0;
                while (i7 < arrayList20.size()) {
                    ih5 ih5Var4 = (ih5) arrayList20.get(i7);
                    Uri uri3 = ih5Var4.a;
                    ko4 ko4Var = ih5Var4.b;
                    if (hashSet2.add(uri3)) {
                        yve.p(ko4Var.m == null);
                        ArrayList arrayList28 = (ArrayList) hashMap5.get(ih5Var4.a);
                        arrayList28.getClass();
                        hashMap = hashMap5;
                        hashSet = hashSet2;
                        vf7 vf7Var = new vf7(new xh5(null, null, arrayList28));
                        jo4 a = ko4Var.a();
                        a.l = vf7Var;
                        arrayList27.add(new ih5(ih5Var4.a, new ko4(a), ih5Var4.c, ih5Var4.d, ih5Var4.e, ih5Var4.f, ih5Var4.g, ih5Var4.h));
                    } else {
                        hashMap = hashMap5;
                        hashSet = hashSet2;
                    }
                    i7++;
                    hashSet2 = hashSet;
                    hashMap5 = hashMap;
                }
                int i8 = 0;
                ArrayList arrayList29 = null;
                ko4 ko4Var2 = null;
                while (i8 < arrayList21.size()) {
                    ArrayList arrayList30 = arrayList21;
                    String str7 = (String) arrayList30.get(i8);
                    String k = k(str7, w0, hashMap4, rr4Var);
                    String k2 = k(str7, pattern2, hashMap4, rr4Var);
                    ArrayList arrayList31 = arrayList29;
                    ArrayList arrayList32 = arrayList27;
                    String j2 = j(str7, P, null, hashMap4, rr4Var);
                    jo4 jo4Var = new jo4();
                    jo4Var.a = qd4.y(k, ":", k2);
                    jo4Var.b = k2;
                    jo4Var.r = eg7.n("application/x-mpegURL");
                    boolean f2 = f(str7, A0, rr4Var);
                    ?? r29 = f2;
                    if (f(str7, B0, rr4Var)) {
                        r29 = (f2 ? 1 : 0) | 2;
                    }
                    jo4Var.e = f(str7, z0, rr4Var) ? r29 | 4 : r29;
                    ko4 ko4Var3 = ko4Var2;
                    String j3 = j(str7, x0, null, hashMap4, rr4Var);
                    if (TextUtils.isEmpty(j3)) {
                        i2 = i8;
                        i = 0;
                    } else {
                        String str8 = gcc.a;
                        String[] split = j3.split(",", -1);
                        i = gcc.l(split, "public.accessibility.describes-video") ? 512 : 0;
                        i2 = i8;
                        if (gcc.l(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i |= TLObject.FLAG_12;
                        }
                        if (gcc.l(split, "public.accessibility.describes-music-and-sound")) {
                            i |= 1024;
                        }
                        if (gcc.l(split, "public.easy-to-read")) {
                            i |= TLObject.FLAG_13;
                        }
                    }
                    jo4Var.f = i;
                    jo4Var.d = j(str7, t0, null, hashMap4, rr4Var);
                    String j4 = j(str7, pattern, null, hashMap4, rr4Var);
                    Uri d3 = j4 == null ? null : d2f.d(uri2, j4);
                    String str9 = uri2;
                    vf7 vf7Var2 = new vf7(new xh5(k, k2, Collections.EMPTY_LIST));
                    String k3 = k(str7, r0, hashMap4, rr4Var);
                    switch (k3.hashCode()) {
                        case -959297733:
                            if (k3.equals("SUBTITLES")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -333210994:
                            if (k3.equals("CLOSED-CAPTIONS")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 62628790:
                            if (k3.equals("AUDIO")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 81665115:
                            if (k3.equals("VIDEO")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            arrayList2 = arrayList24;
                            arrayList3 = arrayList23;
                            int i9 = 0;
                            while (true) {
                                if (i9 < arrayList20.size()) {
                                    ih5Var = (ih5) arrayList20.get(i9);
                                    if (!k.equals(ih5Var.e)) {
                                        i9++;
                                    }
                                } else {
                                    ih5Var = null;
                                }
                            }
                            if (ih5Var != null) {
                                String w3 = gcc.w(3, ih5Var.b.l);
                                jo4Var.k = w3;
                                str = eg7.d(w3);
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "text/vtt";
                            }
                            jo4Var.s = eg7.n(str);
                            jo4Var.l = vf7Var2;
                            if (d3 != null) {
                                arrayList = arrayList25;
                                arrayList.add(new hh5(d3, new ko4(jo4Var), k, k2, j2));
                            } else {
                                arrayList = arrayList25;
                                efd.f("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList29 = arrayList31;
                            ko4Var2 = ko4Var3;
                            break;
                        case 1:
                            arrayList2 = arrayList24;
                            arrayList3 = arrayList23;
                            String k4 = k(str7, y0, hashMap4, rr4Var);
                            if (k4.startsWith("CC")) {
                                parseInt = Integer.parseInt(k4.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(k4.substring(7));
                                str2 = "application/cea-708";
                            }
                            ArrayList arrayList33 = arrayList31 == null ? new ArrayList() : arrayList31;
                            jo4Var.s = eg7.n(str2);
                            jo4Var.S = parseInt;
                            arrayList33.add(new ko4(jo4Var));
                            arrayList29 = arrayList33;
                            arrayList = arrayList25;
                            ko4Var2 = ko4Var3;
                            break;
                        case 2:
                            arrayList3 = arrayList23;
                            int i10 = 0;
                            while (true) {
                                if (i10 < arrayList20.size()) {
                                    ih5 ih5Var5 = (ih5) arrayList20.get(i10);
                                    if (k.equals(ih5Var5.d)) {
                                        ih5Var2 = ih5Var5;
                                    } else {
                                        i10++;
                                    }
                                } else {
                                    ih5Var2 = null;
                                }
                            }
                            if (ih5Var2 != null) {
                                String w4 = gcc.w(1, ih5Var2.b.l);
                                jo4Var.k = w4;
                                str3 = eg7.d(w4);
                            } else {
                                str3 = null;
                            }
                            String j5 = j(str7, r, null, hashMap4, rr4Var);
                            if (j5 != null) {
                                String str10 = gcc.a;
                                jo4Var.M = Integer.parseInt(j5.split("/", 2)[0]);
                                if ("audio/eac3".equals(str3) && j5.endsWith("/JOC")) {
                                    jo4Var.k = "ec+3";
                                    str3 = "audio/eac3-joc";
                                }
                            }
                            int h2 = h(str7, s, rr4Var);
                            if (h2 != -1) {
                                jo4Var.O = h2;
                            }
                            jo4Var.s = eg7.n(str3);
                            if (d3 == null) {
                                arrayList2 = arrayList24;
                                if (ih5Var2 != null) {
                                    ko4 ko4Var4 = new ko4(jo4Var);
                                    arrayList29 = arrayList31;
                                    ko4Var2 = ko4Var4;
                                    arrayList = arrayList25;
                                    break;
                                }
                            } else {
                                jo4Var.l = vf7Var2;
                                arrayList2 = arrayList24;
                                arrayList2.add(new hh5(d3, new ko4(jo4Var), k, k2, j2));
                            }
                            arrayList = arrayList25;
                            arrayList29 = arrayList31;
                            ko4Var2 = ko4Var3;
                            break;
                        case 3:
                            int i11 = 0;
                            while (true) {
                                if (i11 < arrayList20.size()) {
                                    ih5Var3 = (ih5) arrayList20.get(i11);
                                    if (!k.equals(ih5Var3.c)) {
                                        i11++;
                                    }
                                } else {
                                    ih5Var3 = null;
                                }
                            }
                            if (ih5Var3 != null) {
                                ko4 ko4Var5 = ih5Var3.b;
                                String w5 = gcc.w(2, ko4Var5.l);
                                jo4Var.k = w5;
                                jo4Var.s = eg7.n(eg7.d(w5));
                                jo4Var.z = ko4Var5.A;
                                jo4Var.A = ko4Var5.B;
                                jo4Var.a(ko4Var5.F);
                            }
                            if (d3 != null) {
                                jo4Var.l = vf7Var2;
                                arrayList3 = arrayList23;
                                arrayList3.add(new hh5(d3, new ko4(jo4Var), k, k2, j2));
                                arrayList = arrayList25;
                                arrayList2 = arrayList24;
                                arrayList29 = arrayList31;
                                ko4Var2 = ko4Var3;
                                break;
                            }
                        default:
                            arrayList = arrayList25;
                            arrayList2 = arrayList24;
                            arrayList3 = arrayList23;
                            arrayList29 = arrayList31;
                            ko4Var2 = ko4Var3;
                            break;
                    }
                    arrayList24 = arrayList2;
                    arrayList23 = arrayList3;
                    arrayList21 = arrayList30;
                    arrayList25 = arrayList;
                    uri2 = str9;
                    i8 = i2 + 1;
                    arrayList27 = arrayList32;
                }
                return new jh5(uri.toString(), arrayList22, arrayList27, arrayList23, arrayList24, arrayList25, arrayList19, ko4Var2, z4 ? Collections.EMPTY_LIST : arrayList29, z5, hashMap4, arrayList26, ym4Var);
            }
            String B = pm3Var.B();
            ArrayList arrayList34 = arrayList14;
            if (B.startsWith("#EXT")) {
                arrayList18.add(B);
            }
            boolean startsWith = B.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList35 = arrayList18;
            if (B.startsWith("#EXT-X-DEFINE")) {
                String j6 = j(B, pattern2, null, hashMap4, rr4Var);
                if (j6 != null) {
                    m(j6, hashMap4);
                    hashMap4.put(j6, k(B, F0, hashMap4, rr4Var));
                } else {
                    String k5 = k(B, v0, hashMap4, rr4Var);
                    m(k5, hashMap4);
                    String queryParameter = uri.getQueryParameter(k5);
                    if (queryParameter == null) {
                        throw hy7.b("QUERYPARAM \"" + k5 + "\" not found in playlist URI", null);
                    }
                    hashMap4.put(k5, queryParameter);
                }
            } else if (B.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                ArrayList arrayList36 = arrayList11;
                hashMap2 = hashMap3;
                arrayList9 = arrayList36;
                arrayList7 = arrayList16;
                arrayList6 = arrayList12;
                arrayList5 = arrayList13;
                arrayList4 = arrayList17;
                z = z4;
                z2 = true;
                HashMap hashMap6 = hashMap2;
                arrayList11 = arrayList9;
                hashMap3 = hashMap6;
                arrayList15 = arrayList19;
                arrayList14 = arrayList34;
                arrayList18 = arrayList35;
                arrayList17 = arrayList4;
                arrayList13 = arrayList5;
                arrayList12 = arrayList6;
                arrayList16 = arrayList7;
            } else if (B.startsWith("#EXT-X-MEDIA")) {
                arrayList16.add(B);
            } else if (B.startsWith("#EXT-X-SESSION-KEY")) {
                gr3 c3 = c(B, j(B, n0, "identity", hashMap4, rr4Var), hashMap4, rr4Var);
                if (c3 != null) {
                    String k6 = k(B, m0, hashMap4, rr4Var);
                    arrayList17.add(new hr3(("SAMPLE-AES-CENC".equals(k6) || "SAMPLE-AES-CTR".equals(k6)) ? "cenc" : "cbcs", true, c3));
                }
            } else {
                boolean startsWith2 = B.startsWith("#EXT-X-CONTENT-STEERING");
                Pattern pattern3 = N;
                if (startsWith2) {
                    if (ym4Var != null) {
                        throw hy7.b("The #EXT-X-CONTENT-STEERING tag must not appear more than once in a multivariant playlist", null);
                    }
                    ArrayList arrayList37 = arrayList11;
                    hashMap2 = hashMap3;
                    arrayList9 = arrayList37;
                    arrayList7 = arrayList16;
                    arrayList6 = arrayList12;
                    arrayList5 = arrayList13;
                    ym4Var = new ym4(d2f.d(uri2, k(B, M, hashMap4, rr4Var)), j(B, pattern3, null, hashMap4, rr4Var), (byte) 3);
                    arrayList4 = arrayList17;
                    z = z4;
                    z2 = z5;
                    HashMap hashMap62 = hashMap2;
                    arrayList11 = arrayList9;
                    hashMap3 = hashMap62;
                    arrayList15 = arrayList19;
                    arrayList14 = arrayList34;
                    arrayList18 = arrayList35;
                    arrayList17 = arrayList4;
                    arrayList13 = arrayList5;
                    arrayList12 = arrayList6;
                    arrayList16 = arrayList7;
                } else if (B.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                    boolean contains = z4 | B.contains("CLOSED-CAPTIONS=NONE");
                    if (startsWith) {
                        z4 = contains;
                        i3 = 16384;
                    } else {
                        z4 = contains;
                        i3 = 0;
                    }
                    arrayList4 = arrayList17;
                    int parseInt2 = Integer.parseInt(k(B, n, Collections.EMPTY_MAP, rr4Var));
                    int h3 = h(B, c, rr4Var);
                    arrayList5 = arrayList13;
                    arrayList6 = arrayList12;
                    String j7 = j(B, w, null, hashMap4, rr4Var);
                    arrayList7 = arrayList16;
                    String j8 = j(B, x, null, hashMap4, rr4Var);
                    HashMap hashMap7 = hashMap3;
                    String j9 = j(B, y, null, hashMap4, rr4Var);
                    if (j9 != null) {
                        String str11 = gcc.a;
                        String[] split2 = j9.split(",", 2)[0].split("/", -1);
                        str4 = split2[0];
                        if (split2.length > 1) {
                            str5 = split2[1];
                            arrayList8 = arrayList11;
                            i4 = 2;
                            w2 = gcc.w(i4, j8);
                            if (eg7.j(w2, str4) || (str4 != null && (j7 == null || str5 == null || ((j7.equals("PQ") && !str5.equals("db1p")) || ((j7.equals("SDR") && !str5.equals("db2g")) || (j7.equals("HLG") && !str5.startsWith("db4"))))))) {
                                bm2Var = null;
                            } else {
                                bm2 x2 = gcc.x(j8, str4, str5);
                                if (str4 == null) {
                                    str4 = w2;
                                }
                                String[] e02 = gcc.e0(j8);
                                if (e02.length == 0) {
                                    bm2Var2 = x2;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    int length = e02.length;
                                    int i12 = 0;
                                    while (true) {
                                        bm2Var2 = x2;
                                        if (i12 >= length) {
                                            break;
                                        }
                                        String str12 = e02[i12];
                                        String[] strArr = e02;
                                        int i13 = length;
                                        if (2 != eg7.h(eg7.d(str12))) {
                                            if (sb2.length() > 0) {
                                                sb2.append(",");
                                            }
                                            sb2.append(str12);
                                        }
                                        i12++;
                                        x2 = bm2Var2;
                                        length = i13;
                                        e02 = strArr;
                                    }
                                    if (sb2.length() > 0) {
                                        sb = sb2.toString();
                                        j8 = sb == null ? qd4.p(str4, ",", sb) : str4;
                                        bm2Var = bm2Var2;
                                    }
                                }
                                sb = null;
                                if (sb == null) {
                                }
                                bm2Var = bm2Var2;
                            }
                            boolean equals = TextUtils.equals(j(B, F, null, hashMap4, rr4Var), "true");
                            String j10 = j(B, E, null, hashMap4, rr4Var);
                            String j11 = j(B, G, null, hashMap4, rr4Var);
                            String j12 = j(B, H, null, hashMap4, rr4Var);
                            String j13 = j(B, I, null, hashMap4, rr4Var);
                            j = j(B, J, null, hashMap4, rr4Var);
                            if (j == null) {
                                str6 = j11;
                                String[] split3 = j.split("x", -1);
                                i6 = Integer.parseInt(split3[0]);
                                i5 = Integer.parseInt(split3[1]);
                                if (i6 > 0) {
                                }
                            } else {
                                str6 = j11;
                            }
                            i5 = -1;
                            i6 = -1;
                            String j14 = j(B, K, null, hashMap4, rr4Var);
                            float parseFloat = j14 == null ? Float.parseFloat(j14) : -1.0f;
                            String j15 = j(B, L, null, hashMap4, rr4Var);
                            float parseFloat2 = j15 != null ? Float.parseFloat(j15) : -1.0f;
                            String j16 = j(B, pattern3, null, hashMap4, rr4Var);
                            String j17 = j(B, d, null, hashMap4, rr4Var);
                            String j18 = j(B, e, null, hashMap4, rr4Var);
                            String j19 = j(B, f, null, hashMap4, rr4Var);
                            String j20 = j(B, h, null, hashMap4, rr4Var);
                            String j21 = j(B, O, null, hashMap4, rr4Var);
                            if (!startsWith) {
                                d2 = d2f.d(uri2, k(B, pattern, hashMap4, rr4Var));
                            } else {
                                if (!pm3Var.z()) {
                                    throw hy7.b("#EXT-X-STREAM-INF must be followed by another line", null);
                                }
                                d2 = d2f.d(uri2, l(pm3Var.B(), hashMap4, rr4Var));
                            }
                            Uri uri4 = d2;
                            jo4 jo4Var2 = new jo4();
                            jo4Var2.a = Integer.toString(arrayList8.size());
                            jo4Var2.r = eg7.n("application/x-mpegURL");
                            jo4Var2.k = j8;
                            jo4Var2.i = h3;
                            jo4Var2.j = parseInt2;
                            jo4Var2.z = i6;
                            jo4Var2.A = i5;
                            jo4Var2.a(parseFloat);
                            jo4Var2.g = parseFloat2;
                            jo4Var2.f = i3;
                            jo4Var2.K = bm2Var;
                            jo4Var2.n = equals;
                            jo4Var2.s = eg7.n(j10);
                            jo4Var2.o = Long.parseLong(str6);
                            jo4Var2.p = j12;
                            jo4Var2.q = Integer.parseInt(j13);
                            arrayList9 = arrayList8;
                            arrayList9.add(new ih5(uri4, new ko4(jo4Var2), j17, j18, j19, j20, j16, j21));
                            hashMap2 = hashMap7;
                            arrayList10 = (ArrayList) hashMap2.get(uri4);
                            if (arrayList10 == null) {
                                arrayList10 = new ArrayList();
                                hashMap2.put(uri4, arrayList10);
                            }
                            arrayList10.add(new wh5(h3, j17, parseInt2, j18, j19, j20));
                            z = z4;
                            z2 = z5;
                            HashMap hashMap622 = hashMap2;
                            arrayList11 = arrayList9;
                            hashMap3 = hashMap622;
                            arrayList15 = arrayList19;
                            arrayList14 = arrayList34;
                            arrayList18 = arrayList35;
                            arrayList17 = arrayList4;
                            arrayList13 = arrayList5;
                            arrayList12 = arrayList6;
                            arrayList16 = arrayList7;
                        } else {
                            arrayList8 = arrayList11;
                            i4 = 2;
                        }
                    } else {
                        arrayList8 = arrayList11;
                        i4 = 2;
                        str4 = null;
                    }
                    str5 = null;
                    w2 = gcc.w(i4, j8);
                    if (eg7.j(w2, str4)) {
                    }
                    bm2Var = null;
                    boolean equals2 = TextUtils.equals(j(B, F, null, hashMap4, rr4Var), "true");
                    String j102 = j(B, E, null, hashMap4, rr4Var);
                    String j112 = j(B, G, null, hashMap4, rr4Var);
                    String j122 = j(B, H, null, hashMap4, rr4Var);
                    String j132 = j(B, I, null, hashMap4, rr4Var);
                    j = j(B, J, null, hashMap4, rr4Var);
                    if (j == null) {
                    }
                    i5 = -1;
                    i6 = -1;
                    String j142 = j(B, K, null, hashMap4, rr4Var);
                    if (j142 == null) {
                    }
                    String j152 = j(B, L, null, hashMap4, rr4Var);
                    float parseFloat22 = j152 != null ? Float.parseFloat(j152) : -1.0f;
                    String j162 = j(B, pattern3, null, hashMap4, rr4Var);
                    String j172 = j(B, d, null, hashMap4, rr4Var);
                    String j182 = j(B, e, null, hashMap4, rr4Var);
                    String j192 = j(B, f, null, hashMap4, rr4Var);
                    String j202 = j(B, h, null, hashMap4, rr4Var);
                    String j212 = j(B, O, null, hashMap4, rr4Var);
                    if (!startsWith) {
                    }
                    Uri uri42 = d2;
                    jo4 jo4Var22 = new jo4();
                    jo4Var22.a = Integer.toString(arrayList8.size());
                    jo4Var22.r = eg7.n("application/x-mpegURL");
                    jo4Var22.k = j8;
                    jo4Var22.i = h3;
                    jo4Var22.j = parseInt2;
                    jo4Var22.z = i6;
                    jo4Var22.A = i5;
                    jo4Var22.a(parseFloat);
                    jo4Var22.g = parseFloat22;
                    jo4Var22.f = i3;
                    jo4Var22.K = bm2Var;
                    jo4Var22.n = equals2;
                    jo4Var22.s = eg7.n(j102);
                    jo4Var22.o = Long.parseLong(str6);
                    jo4Var22.p = j122;
                    jo4Var22.q = Integer.parseInt(j132);
                    arrayList9 = arrayList8;
                    arrayList9.add(new ih5(uri42, new ko4(jo4Var22), j172, j182, j192, j202, j162, j212));
                    hashMap2 = hashMap7;
                    arrayList10 = (ArrayList) hashMap2.get(uri42);
                    if (arrayList10 == null) {
                    }
                    arrayList10.add(new wh5(h3, j172, parseInt2, j182, j192, j202));
                    z = z4;
                    z2 = z5;
                    HashMap hashMap6222 = hashMap2;
                    arrayList11 = arrayList9;
                    hashMap3 = hashMap6222;
                    arrayList15 = arrayList19;
                    arrayList14 = arrayList34;
                    arrayList18 = arrayList35;
                    arrayList17 = arrayList4;
                    arrayList13 = arrayList5;
                    arrayList12 = arrayList6;
                    arrayList16 = arrayList7;
                }
            }
            ArrayList arrayList38 = arrayList11;
            hashMap2 = hashMap3;
            arrayList9 = arrayList38;
            arrayList7 = arrayList16;
            arrayList6 = arrayList12;
            arrayList5 = arrayList13;
            arrayList4 = arrayList17;
            z = z4;
            z2 = z5;
            HashMap hashMap62222 = hashMap2;
            arrayList11 = arrayList9;
            hashMap3 = hashMap62222;
            arrayList15 = arrayList19;
            arrayList14 = arrayList34;
            arrayList18 = arrayList35;
            arrayList17 = arrayList4;
            arrayList13 = arrayList5;
            arrayList12 = arrayList6;
            arrayList16 = arrayList7;
        }
    }

    public static boolean f(String str, Pattern pattern, rr4 rr4Var) {
        int i = rr4.b;
        Matcher b = rr4Var.b(pattern, str);
        if (b.find()) {
            return "YES".equals(b.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d2, rr4 rr4Var) {
        int i = rr4.b;
        Matcher b = rr4Var.b(pattern, str);
        if (!b.find()) {
            return d2;
        }
        String group = b.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static int h(String str, Pattern pattern, rr4 rr4Var) {
        int i = rr4.b;
        Matcher b = rr4Var.b(pattern, str);
        if (!b.find()) {
            return -1;
        }
        String group = b.group(1);
        group.getClass();
        return Integer.parseInt(group);
    }

    public static long i(String str, Pattern pattern, rr4 rr4Var) {
        int i = rr4.b;
        Matcher b = rr4Var.b(pattern, str);
        if (!b.find()) {
            return -1L;
        }
        String group = b.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String j(String str, Pattern pattern, String str2, Map map, rr4 rr4Var) {
        int i = rr4.b;
        Matcher b = rr4Var.b(pattern, str);
        if (b.find()) {
            str2 = b.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map, rr4Var);
    }

    public static String k(String str, Pattern pattern, Map map, rr4 rr4Var) {
        String j = j(str, pattern, null, map, rr4Var);
        if (j != null) {
            return j;
        }
        throw hy7.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map, rr4 rr4Var) {
        int i = rr4.b;
        Matcher b = rr4Var.b(a1, str);
        StringBuffer stringBuffer = new StringBuffer();
        while (b.find()) {
            String group = b.group(1);
            if (map.containsKey(group)) {
                b.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        b.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static void m(String str, HashMap hashMap) {
        if (hashMap.containsKey(str)) {
            throw hy7.b("duplicate variable name \"" + str + "\"", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071 A[Catch: all -> 0x010a, LOOP:0: B:12:0x0071->B:37:0x0071, LOOP_START, TryCatch #1 {all -> 0x010a, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:9:0x0032, B:12:0x0071, B:14:0x0077, B:17:0x0081, B:55:0x008b, B:19:0x009d, B:21:0x00a5, B:23:0x00ad, B:25:0x00b5, B:27:0x00bd, B:29:0x00c5, B:31:0x00cd, B:33:0x00d5, B:35:0x00dd, B:39:0x00e1, B:71:0x0103, B:72:0x0109, B:76:0x0039, B:78:0x003f, B:83:0x0048, B:85:0x0050, B:89:0x0059, B:91:0x005f, B:93:0x0065, B:95:0x006a), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103 A[Catch: all -> 0x010a, TRY_ENTER, TryCatch #1 {all -> 0x010a, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:9:0x0032, B:12:0x0071, B:14:0x0077, B:17:0x0081, B:55:0x008b, B:19:0x009d, B:21:0x00a5, B:23:0x00ad, B:25:0x00b5, B:27:0x00bd, B:29:0x00c5, B:31:0x00cd, B:33:0x00d5, B:35:0x00dd, B:39:0x00e1, B:71:0x0103, B:72:0x0109, B:76:0x0039, B:78:0x003f, B:83:0x0048, B:85:0x0050, B:89:0x0059, B:91:0x005f, B:93:0x0065, B:95:0x006a), top: B:2:0x0019 }] */
    @Override // iy7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(Uri uri, l73 l73Var) {
        String trim;
        byte b;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(l73Var));
        ArrayDeque arrayDeque = new ArrayDeque();
        rr4 rr4Var = new rr4(16, 0.75f, true, (byte) 1);
        try {
            int read = bufferedReader.read();
            boolean z = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                if (z) {
                    throw hy7.b("Input does not start with the #EXTM3U header.", null);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                        }
                        throw hy7.b("Failed to parse the playlist, could not identify any tags.", null);
                    }
                    trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        b = 8;
                        if (trim.startsWith("#EXT-X-STREAM-INF")) {
                            arrayDeque.add(trim);
                            jh5 e2 = e(new pm3(arrayDeque, bufferedReader, b), uri, rr4Var);
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                            return e2;
                        }
                        if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(trim);
                    }
                }
                arrayDeque.add(trim);
                fh5 d2 = d(this.a, this.b, new pm3(arrayDeque, bufferedReader, b), uri, rr4Var);
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                return d2;
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i = 0;
            while (true) {
                if (i >= 7) {
                    while (read != -1 && Character.isWhitespace(read) && !gcc.P(read)) {
                        read = bufferedReader.read();
                    }
                    z = gcc.P(read);
                } else {
                    if (read != "#EXTM3U".charAt(i)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i++;
                }
            }
            if (z) {
            }
        } finally {
            String str = gcc.a;
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
        }
    }
}
