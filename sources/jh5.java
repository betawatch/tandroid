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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jh5 implements cx7 {
    public final gh5 a;
    public final ch5 b;
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

    public jh5(gh5 gh5Var, ch5 ch5Var) {
        this.a = gh5Var;
        this.b = ch5Var;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static as3 b(String str, zr3[] zr3VarArr) {
        zr3[] zr3VarArr2 = new zr3[zr3VarArr.length];
        for (int i = 0; i < zr3VarArr.length; i++) {
            zr3 zr3Var = zr3VarArr[i];
            zr3VarArr2[i] = new zr3(zr3Var.b, zr3Var.c, zr3Var.d, null);
        }
        return new as3(str, true, zr3VarArr2);
    }

    public static zr3 c(String str, String str2, HashMap hashMap, or4 or4Var) {
        String j = j(str, o0, "1", hashMap, or4Var);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = p0;
        if (equals) {
            String k = k(str, pattern, hashMap, or4Var);
            return new zr3(n61.e, null, "video/mp4", Base64.decode(k.substring(k.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = n61.e;
            String str3 = hac.a;
            return new zr3(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(j)) {
            return null;
        }
        String k2 = k(str, pattern, hashMap, or4Var);
        byte[] decode = Base64.decode(k2.substring(k2.indexOf(44)), 0);
        UUID uuid2 = n61.f;
        return new zr3(uuid2, null, "video/mp4", wte.a(uuid2, null, decode));
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
    public static ch5 d(gh5 gh5Var, ch5 ch5Var, in3 in3Var, Uri uri, or4 or4Var) {
        HashMap hashMap;
        Iterator it;
        wg5 wg5Var;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        int i;
        String str2;
        int i2;
        long j;
        int i3;
        xg5 xg5Var;
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
        as3 as3Var;
        as3 as3Var2;
        String str7;
        int i4;
        String str8;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j3;
        String str9;
        int i5;
        as3 as3Var3;
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
        ug5 ug5Var;
        int i6;
        char c3;
        String str13;
        long j5;
        as3 as3Var4;
        as3 as3Var5;
        gh5 gh5Var2 = gh5Var;
        ch5 ch5Var2 = ch5Var;
        String uri2 = uri.toString();
        boolean z2 = gh5Var2.c;
        zg5 zg5Var = ch5Var2 != null ? ch5Var2.x : null;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        bh5 bh5Var = new bh5(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap2 = new TreeMap();
        String str14 = "";
        int i7 = 0;
        String str15 = "";
        zg5 zg5Var2 = zg5Var;
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
        as3 as3Var6 = null;
        as3 as3Var7 = null;
        String str16 = null;
        String str17 = null;
        xg5 xg5Var2 = null;
        String str18 = null;
        while (true) {
            int i13 = i8;
            String str19 = "POINT";
            bh5 bh5Var2 = bh5Var;
            if (!in3Var.z()) {
                ArrayList arrayList16 = arrayList12;
                ArrayList arrayList17 = arrayList13;
                ArrayList arrayList18 = arrayList14;
                ArrayList arrayList19 = arrayList15;
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                xg5 xg5Var3 = xg5Var2;
                HashMap hashMap5 = new HashMap();
                int i14 = i7;
                while (i14 < arrayList18.size()) {
                    ArrayList arrayList20 = arrayList18;
                    yg5 yg5Var = (yg5) arrayList20.get(i14);
                    long j18 = yg5Var.b;
                    if (j18 == -1) {
                        j18 = (j10 + arrayList16.size()) - (arrayList17.isEmpty() ? 1L : 0L);
                    }
                    int i15 = yg5Var.c;
                    if (i15 == -1 && j7 != -9223372036854775807L) {
                        i15 = (arrayList17.isEmpty() ? ((zg5) lne.b(arrayList16)).y : arrayList17).size() - 1;
                    }
                    Uri uri3 = yg5Var.a;
                    hashMap5.put(uri3, new yg5(uri3, j18, i15));
                    i14++;
                    arrayList18 = arrayList20;
                }
                if (xg5Var3 != null) {
                    arrayList17.add(xg5Var3);
                }
                ArrayList arrayList21 = new ArrayList();
                Iterator it2 = linkedHashMap4.values().iterator();
                while (it2.hasNext()) {
                    vg5 vg5Var = (vg5) it2.next();
                    Uri uri4 = vg5Var.d;
                    Uri uri5 = vg5Var.c;
                    if (uri4 != null ? uri5 == null : uri5 != null) {
                        long j19 = vg5Var.e;
                        if (j19 != -9223372036854775807L) {
                            String str20 = vg5Var.a;
                            long j20 = vg5Var.f;
                            hashMap = hashMap5;
                            it = it2;
                            long j21 = vg5Var.g;
                            long j22 = vg5Var.h;
                            ArrayList arrayList22 = vg5Var.i;
                            boolean z8 = vg5Var.j;
                            long j23 = vg5Var.k;
                            long j24 = vg5Var.l;
                            ArrayList arrayList23 = vg5Var.m;
                            ArrayList arrayList24 = vg5Var.n;
                            ArrayList arrayList25 = new ArrayList(vg5Var.b.values());
                            Boolean bool = vg5Var.o;
                            boolean z9 = bool == null || bool.booleanValue();
                            String str21 = vg5Var.p;
                            String str22 = str21 != null ? str21 : "POINT";
                            String str23 = vg5Var.q;
                            wg5Var = new wg5(str20, uri5, uri4, j19, j20, j21, j22, arrayList22, z8, j23, j24, arrayList23, arrayList24, arrayList25, z9, str22, str23 != null ? str23 : "HIGHLIGHT", vg5Var.r, vg5Var.s, vg5Var.t);
                            if (wg5Var == null) {
                                arrayList21.add(wg5Var);
                            }
                            it2 = it;
                            hashMap5 = hashMap;
                        }
                    }
                    hashMap = hashMap5;
                    it = it2;
                    wg5Var = null;
                    if (wg5Var == null) {
                    }
                    it2 = it;
                    hashMap5 = hashMap;
                }
                HashMap hashMap6 = hashMap5;
                if (j12 == 0 && ch5Var != null && ch5Var.p) {
                    j12 = ch5Var.h;
                }
                return new ch5(i11, uri.toString(), arrayList19, j8, z5, j12, z4, i9, j10, i12, j9, j7, z3, z6, j12 != 0, as3Var6, arrayList16, arrayList17, bh5Var2, hashMap6, arrayList21, zg5Var2);
            }
            String B = in3Var.B();
            HashMap hashMap7 = hashMap4;
            if (B.startsWith("#EXT")) {
                arrayList15.add(B);
            }
            if (B.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String k = k(B, V, hashMap3, or4Var);
                if ("VOD".equals(k)) {
                    i11 = 1;
                } else if ("EVENT".equals(k)) {
                    i11 = 2;
                }
                i8 = i13;
                bh5Var = bh5Var2;
            } else if (B.equals("#EXT-X-I-FRAMES-ONLY")) {
                i8 = i13;
                bh5Var = bh5Var2;
                hashMap4 = hashMap7;
                z7 = true;
            } else {
                if (B.startsWith("#EXT-X-START")) {
                    arrayList = arrayList15;
                    linkedHashMap = linkedHashMap3;
                    long parseDouble = (long) (Double.parseDouble(k(B, h0, Collections.EMPTY_MAP, or4Var)) * 1000000.0d);
                    z5 = f(B, E0, or4Var);
                    j8 = parseDouble;
                } else {
                    arrayList = arrayList15;
                    linkedHashMap = linkedHashMap3;
                    if (B.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double g = g(B, W, -9.223372036854776E18d, or4Var);
                        long j25 = g == -9.223372036854776E18d ? -9223372036854775807L : (long) (g * 1000000.0d);
                        boolean f2 = f(B, X, or4Var);
                        double g2 = g(B, Z, -9.223372036854776E18d, or4Var);
                        long j26 = g2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g2 * 1000000.0d);
                        double g3 = g(B, a0, -9.223372036854776E18d, or4Var);
                        arrayList15 = arrayList;
                        i8 = i13;
                        hashMap4 = hashMap7;
                        linkedHashMap3 = linkedHashMap;
                        bh5Var = new bh5(j25, f2, j26, g3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g3 * 1000000.0d), f(B, b0, or4Var));
                    } else if (B.startsWith("#EXT-X-PART-INF")) {
                        j7 = (long) (Double.parseDouble(k(B, T, Collections.EMPTY_MAP, or4Var)) * 1000000.0d);
                    } else {
                        boolean startsWith = B.startsWith("#EXT-X-MAP");
                        Pattern pattern = j0;
                        Pattern pattern2 = p0;
                        if (startsWith) {
                            String k2 = k(B, pattern2, hashMap3, or4Var);
                            String j27 = j(B, pattern, null, hashMap3, or4Var);
                            if (j27 != null) {
                                String str24 = hac.a;
                                String[] split = j27.split("@", -1);
                                j6 = Long.parseLong(split[i7]);
                                if (split.length > 1) {
                                    j14 = Long.parseLong(split[1]);
                                }
                            }
                            long j28 = j6;
                            long j29 = j28 == -1 ? 0L : j14;
                            if (str16 != null && str17 == null) {
                                throw bx7.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            zg5 zg5Var3 = new zg5(k2, j29, j28, str16, str17);
                            String str25 = str17;
                            if (j28 != -1) {
                                j29 += j28;
                            }
                            j14 = j29;
                            zg5Var2 = zg5Var3;
                            i8 = i13;
                            j6 = -1;
                            bh5Var = bh5Var2;
                            hashMap4 = hashMap7;
                            linkedHashMap3 = linkedHashMap;
                            arrayList15 = arrayList;
                            str17 = str25;
                        } else {
                            String str26 = str17;
                            ArrayList arrayList26 = arrayList13;
                            ArrayList arrayList27 = arrayList14;
                            if (B.startsWith("#EXT-X-TARGETDURATION")) {
                                j9 = Integer.parseInt(k(B, Q, Collections.EMPTY_MAP, or4Var)) * 1000000;
                            } else if (B.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j13 = Long.parseLong(k(B, c0, Collections.EMPTY_MAP, or4Var));
                                i8 = i13;
                                j10 = j13;
                                bh5Var = bh5Var2;
                                hashMap4 = hashMap7;
                                linkedHashMap3 = linkedHashMap;
                                arrayList15 = arrayList;
                                str17 = str26;
                                arrayList14 = arrayList27;
                                arrayList13 = arrayList26;
                            } else if (B.startsWith("#EXT-X-VERSION")) {
                                i12 = Integer.parseInt(k(B, U, Collections.EMPTY_MAP, or4Var));
                            } else {
                                if (B.startsWith("#EXT-X-DEFINE")) {
                                    String j30 = j(B, u0, null, hashMap3, or4Var);
                                    String j31 = j(B, v0, null, hashMap3, or4Var);
                                    if (j30 != null) {
                                        m(j30, hashMap3);
                                        hashMap3.put(j30, k(B, F0, hashMap3, or4Var));
                                    } else if (j31 != null) {
                                        m(j31, hashMap3);
                                        String queryParameter = uri.getQueryParameter(j31);
                                        if (queryParameter == null) {
                                            throw bx7.b("QUERYPARAM \"" + j31 + "\" not found in playlist URI", null);
                                        }
                                        hashMap3.put(j31, queryParameter);
                                    } else {
                                        String k3 = k(B, G0, hashMap3, or4Var);
                                        m(k3, hashMap3);
                                        String str27 = (String) gh5Var2.l.get(k3);
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
                                    xg5Var = xg5Var2;
                                    str3 = str18;
                                    j2 = j16;
                                    str4 = str15;
                                    hashMap2 = hashMap7;
                                    linkedHashMap2 = linkedHashMap;
                                    arrayList2 = arrayList26;
                                    str5 = uri2;
                                    treeMap = treeMap2;
                                } else if (B.startsWith("#EXTINF")) {
                                    j16 = new BigDecimal(k(B, d0, Collections.EMPTY_MAP, or4Var)).multiply(new BigDecimal(1000000L)).longValue();
                                    str15 = j(B, e0, str14, hashMap3, or4Var);
                                } else if (B.startsWith("#EXT-X-SKIP")) {
                                    int parseInt = Integer.parseInt(k(B, Y, Collections.EMPTY_MAP, or4Var));
                                    jte.p((ch5Var2 == null || !arrayList12.isEmpty()) ? i7 : 1);
                                    String str28 = hac.a;
                                    long j32 = ch5Var2.k;
                                    mo5 mo5Var = ch5Var2.r;
                                    int i16 = (int) (j10 - j32);
                                    int i17 = parseInt + i16;
                                    if (i16 >= 0 && i17 <= mo5Var.size()) {
                                        long j33 = j15;
                                        str17 = str26;
                                        while (i16 < i17) {
                                            zg5 zg5Var4 = (zg5) mo5Var.get(i16);
                                            if (j10 != ch5Var2.k) {
                                                int i18 = (ch5Var2.j - i9) + zg5Var4.d;
                                                mo5 mo5Var2 = zg5Var4.y;
                                                ArrayList arrayList28 = new ArrayList();
                                                int i19 = i7;
                                                long j34 = j33;
                                                while (i19 < mo5Var2.size()) {
                                                    xg5 xg5Var4 = (xg5) mo5Var2.get(i19);
                                                    arrayList28.add(new xg5(xg5Var4.a, xg5Var4.b, xg5Var4.c, i18, j34, xg5Var4.f, xg5Var4.h, xg5Var4.n, xg5Var4.r, xg5Var4.s, xg5Var4.w, xg5Var4.x, xg5Var4.y));
                                                    j34 += xg5Var4.c;
                                                    i19++;
                                                    str14 = str14;
                                                }
                                                str6 = str14;
                                                zg5Var4 = new zg5(zg5Var4.a, zg5Var4.b, zg5Var4.x, zg5Var4.c, i18, j33, zg5Var4.f, zg5Var4.h, zg5Var4.n, zg5Var4.r, zg5Var4.s, zg5Var4.w, arrayList28);
                                            } else {
                                                str6 = str14;
                                            }
                                            arrayList12.add(zg5Var4);
                                            long j35 = zg5Var4.c;
                                            String str29 = zg5Var4.n;
                                            j33 += j35;
                                            long j36 = zg5Var4.s;
                                            if (j36 != -1) {
                                                j14 = zg5Var4.r + j36;
                                            }
                                            int i20 = zg5Var4.d;
                                            zg5 zg5Var5 = zg5Var4.b;
                                            as3 as3Var8 = zg5Var4.f;
                                            String str30 = zg5Var4.h;
                                            if (str29 == null || !str29.equals(Long.toHexString(j13))) {
                                                str17 = str29;
                                            }
                                            j13++;
                                            i16++;
                                            i13 = i20;
                                            zg5Var2 = zg5Var5;
                                            str16 = str30;
                                            as3Var7 = as3Var8;
                                            j11 = j33;
                                            str14 = str6;
                                        }
                                        gh5Var2 = gh5Var;
                                        i8 = i13;
                                        bh5Var = bh5Var2;
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
                                        String k4 = k(B, m0, hashMap3, or4Var);
                                        String j37 = j(B, n0, "identity", hashMap3, or4Var);
                                        if ("NONE".equals(k4)) {
                                            treeMap2.clear();
                                            as3Var7 = null;
                                            str16 = null;
                                            str17 = null;
                                        } else {
                                            String j38 = j(B, q0, null, hashMap3, or4Var);
                                            if (!"identity".equals(j37)) {
                                                String str31 = str18;
                                                if (str31 == null) {
                                                    str18 = ("SAMPLE-AES-CENC".equals(k4) || "SAMPLE-AES-CTR".equals(k4)) ? "cenc" : "cbcs";
                                                } else {
                                                    str18 = str31;
                                                }
                                                zr3 c4 = c(B, j37, hashMap3, or4Var);
                                                if (c4 != null) {
                                                    treeMap2.put(j37, c4);
                                                    str17 = j38;
                                                    as3Var7 = null;
                                                    str16 = null;
                                                }
                                            } else if ("AES-128".equals(k4)) {
                                                str16 = k(B, pattern2, hashMap3, or4Var);
                                                str17 = j38;
                                            }
                                            str17 = j38;
                                            str16 = null;
                                        }
                                        gh5Var2 = gh5Var;
                                        i8 = i13;
                                        bh5Var = bh5Var2;
                                        hashMap4 = hashMap7;
                                        linkedHashMap3 = linkedHashMap;
                                        arrayList15 = arrayList;
                                    } else {
                                        String str32 = str18;
                                        if (B.startsWith("#EXT-X-BYTERANGE")) {
                                            String k5 = k(B, i0, hashMap3, or4Var);
                                            String str33 = hac.a;
                                            String[] split2 = k5.split("@", -1);
                                            j6 = Long.parseLong(split2[i7]);
                                            if (split2.length > 1) {
                                                j14 = Long.parseLong(split2[1]);
                                            }
                                        } else if (B.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i9 = Integer.parseInt(B.substring(B.indexOf(58) + 1));
                                            gh5Var2 = gh5Var;
                                            str18 = str32;
                                            i8 = i13;
                                            bh5Var = bh5Var2;
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
                                            gh5Var2 = gh5Var;
                                            str18 = str32;
                                            bh5Var = bh5Var2;
                                            hashMap4 = hashMap7;
                                            linkedHashMap3 = linkedHashMap;
                                            arrayList15 = arrayList;
                                            str17 = str26;
                                        } else {
                                            if (B.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j12 == 0) {
                                                    j12 = hac.T(hac.W(B.substring(B.indexOf(58) + 1))) - j15;
                                                }
                                            } else if (B.equals("#EXT-X-GAP")) {
                                                gh5Var2 = gh5Var;
                                                str18 = str32;
                                                i8 = i13;
                                                bh5Var = bh5Var2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                i10 = 1;
                                            } else if (B.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                gh5Var2 = gh5Var;
                                                str18 = str32;
                                                i8 = i13;
                                                bh5Var = bh5Var2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                z3 = true;
                                            } else if (B.equals("#EXT-X-ENDLIST")) {
                                                gh5Var2 = gh5Var;
                                                str18 = str32;
                                                i8 = i13;
                                                bh5Var = bh5Var2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                z6 = true;
                                            } else if (B.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                arrayList27.add(new yg5(Uri.parse(lze.c(uri2, k(B, pattern2, hashMap3, or4Var))), i(B, f0, or4Var), h(B, g0, or4Var)));
                                            } else if (B.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                xg5 xg5Var5 = xg5Var2;
                                                if (xg5Var5 == null && "PART".equals(k(B, s0, hashMap3, or4Var))) {
                                                    as3 as3Var9 = as3Var7;
                                                    String k6 = k(B, pattern2, hashMap3, or4Var);
                                                    long i21 = i(B, k0, or4Var);
                                                    long i22 = i(B, l0, or4Var);
                                                    String hexString = str16 == null ? null : str26 != null ? str26 : Long.toHexString(j13);
                                                    if (as3Var9 != null || treeMap2.isEmpty()) {
                                                        as3Var = as3Var9;
                                                    } else {
                                                        zr3[] zr3VarArr = (zr3[]) treeMap2.values().toArray(new zr3[i7]);
                                                        as3 as3Var10 = new as3(str32, true, zr3VarArr);
                                                        if (as3Var6 == null) {
                                                            as3Var2 = b(str32, zr3VarArr);
                                                            as3Var = as3Var10;
                                                            if (i21 == -1 && i22 == -1) {
                                                                str7 = str16;
                                                                i4 = i13;
                                                                xg5Var2 = xg5Var5;
                                                            } else {
                                                                if (i21 == -1) {
                                                                    i21 = 0;
                                                                }
                                                                long j39 = j11;
                                                                xg5 xg5Var6 = new xg5(k6, zg5Var2, 0L, i13, j39, as3Var, str16, hexString, i21, i22, false, false, true);
                                                                j11 = j39;
                                                                str7 = str16;
                                                                i4 = i13;
                                                                xg5Var2 = xg5Var6;
                                                            }
                                                            arrayList14 = arrayList27;
                                                            str18 = str32;
                                                            as3Var6 = as3Var2;
                                                            as3Var7 = as3Var;
                                                            i8 = i4;
                                                            str16 = str7;
                                                            bh5Var = bh5Var2;
                                                            hashMap4 = hashMap7;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList15 = arrayList;
                                                            str17 = str26;
                                                            arrayList13 = arrayList26;
                                                            str14 = str2;
                                                            i7 = 0;
                                                            gh5Var2 = gh5Var;
                                                        } else {
                                                            as3Var = as3Var10;
                                                        }
                                                    }
                                                    as3Var2 = as3Var6;
                                                    if (i21 == -1) {
                                                    }
                                                    if (i21 == -1) {
                                                    }
                                                    long j392 = j11;
                                                    xg5 xg5Var62 = new xg5(k6, zg5Var2, 0L, i13, j392, as3Var, str16, hexString, i21, i22, false, false, true);
                                                    j11 = j392;
                                                    str7 = str16;
                                                    i4 = i13;
                                                    xg5Var2 = xg5Var62;
                                                    arrayList14 = arrayList27;
                                                    str18 = str32;
                                                    as3Var6 = as3Var2;
                                                    as3Var7 = as3Var;
                                                    i8 = i4;
                                                    str16 = str7;
                                                    bh5Var = bh5Var2;
                                                    hashMap4 = hashMap7;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList15 = arrayList;
                                                    str17 = str26;
                                                    arrayList13 = arrayList26;
                                                    str14 = str2;
                                                    i7 = 0;
                                                    gh5Var2 = gh5Var;
                                                } else {
                                                    str = str16;
                                                    i = i13;
                                                    arrayList27 = arrayList27;
                                                    str5 = uri2;
                                                    xg5Var = xg5Var5;
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
                                                as3 as3Var11 = as3Var7;
                                                xg5 xg5Var7 = xg5Var2;
                                                if (B.startsWith("#EXT-X-PART")) {
                                                    String hexString2 = str == null ? null : str26 != null ? str26 : Long.toHexString(j13);
                                                    String k7 = k(B, pattern2, hashMap3, or4Var);
                                                    long parseDouble2 = (long) (Double.parseDouble(k(B, R, Collections.EMPTY_MAP, or4Var)) * 1000000.0d);
                                                    boolean f3 = f(B, C0, or4Var) | (z3 && arrayList26.isEmpty());
                                                    boolean f4 = f(B, D0, or4Var);
                                                    String j40 = j(B, pattern, null, hashMap3, or4Var);
                                                    if (j40 != null) {
                                                        String str34 = hac.a;
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
                                                    if (as3Var11 != null || treeMap2.isEmpty()) {
                                                        as3Var4 = as3Var11;
                                                    } else {
                                                        zr3[] zr3VarArr2 = (zr3[]) treeMap2.values().toArray(new zr3[0]);
                                                        as3 as3Var12 = new as3(str32, true, zr3VarArr2);
                                                        if (as3Var6 == null) {
                                                            as3Var5 = b(str32, zr3VarArr2);
                                                            as3Var4 = as3Var12;
                                                            long j41 = j11;
                                                            arrayList26.add(new xg5(k7, zg5Var2, parseDouble2, i, j41, as3Var4, str, hexString2, j17, j5, f4, f3, false));
                                                            j11 = j41 + parseDouble2;
                                                            if (j5 != -1) {
                                                                j17 += j5;
                                                            }
                                                            arrayList14 = arrayList27;
                                                            str18 = str32;
                                                            as3Var6 = as3Var5;
                                                            arrayList13 = arrayList26;
                                                            as3Var7 = as3Var4;
                                                            i8 = i;
                                                            str16 = str;
                                                            uri2 = str13;
                                                            bh5Var = bh5Var2;
                                                            hashMap4 = hashMap7;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList15 = arrayList;
                                                            str17 = str26;
                                                            str14 = str2;
                                                            i7 = 0;
                                                            gh5Var2 = gh5Var;
                                                            xg5Var2 = xg5Var7;
                                                        } else {
                                                            as3Var4 = as3Var12;
                                                        }
                                                    }
                                                    as3Var5 = as3Var6;
                                                    long j412 = j11;
                                                    arrayList26.add(new xg5(k7, zg5Var2, parseDouble2, i, j412, as3Var4, str, hexString2, j17, j5, f4, f3, false));
                                                    j11 = j412 + parseDouble2;
                                                    if (j5 != -1) {
                                                    }
                                                    arrayList14 = arrayList27;
                                                    str18 = str32;
                                                    as3Var6 = as3Var5;
                                                    arrayList13 = arrayList26;
                                                    as3Var7 = as3Var4;
                                                    i8 = i;
                                                    str16 = str;
                                                    uri2 = str13;
                                                    bh5Var = bh5Var2;
                                                    hashMap4 = hashMap7;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList15 = arrayList;
                                                    str17 = str26;
                                                    str14 = str2;
                                                    i7 = 0;
                                                    gh5Var2 = gh5Var;
                                                    xg5Var2 = xg5Var7;
                                                } else {
                                                    str5 = uri2;
                                                    if (B.startsWith("#EXT-X-DATERANGE")) {
                                                        if (j(B, I0, str2, hashMap3, or4Var).equals("com.apple.hls.interstitial")) {
                                                            String k8 = k(B, H0, hashMap3, or4Var);
                                                            String j42 = j(B, O0, null, hashMap3, or4Var);
                                                            Uri parse = j42 != null ? Uri.parse(j42) : null;
                                                            arrayList4 = arrayList26;
                                                            String j43 = j(B, P0, null, hashMap3, or4Var);
                                                            Uri parse2 = j43 != null ? Uri.parse(j43) : null;
                                                            as3Var7 = as3Var11;
                                                            String j44 = j(B, J0, null, hashMap3, or4Var);
                                                            long T2 = j44 != null ? hac.T(hac.W(j44)) : -9223372036854775807L;
                                                            String j45 = j(B, L0, null, hashMap3, or4Var);
                                                            long T3 = j45 != null ? hac.T(hac.W(j45)) : -9223372036854775807L;
                                                            ArrayList arrayList29 = new ArrayList();
                                                            str2 = str2;
                                                            String j46 = j(B, K0, null, hashMap3, or4Var);
                                                            if (j46 != null) {
                                                                String str35 = hac.a;
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
                                                            double g4 = g(B, S, -1.0d, or4Var);
                                                            long j47 = g4 >= 0.0d ? (long) (g4 * 1000000.0d) : -9223372036854775807L;
                                                            xg5 xg5Var8 = xg5Var7;
                                                            double g5 = g(B, M0, -1.0d, or4Var);
                                                            long j48 = g5 >= 0.0d ? (long) (g5 * 1000000.0d) : -9223372036854775807L;
                                                            boolean f5 = f(B, N0, or4Var);
                                                            double g6 = g(B, Q0, Double.MIN_VALUE, or4Var);
                                                            long j49 = g6 != Double.MIN_VALUE ? (long) (g6 * 1000000.0d) : -9223372036854775807L;
                                                            double g7 = g(B, R0, -1.0d, or4Var);
                                                            long j50 = g7 >= 0.0d ? (long) (g7 * 1000000.0d) : -9223372036854775807L;
                                                            ArrayList arrayList30 = new ArrayList();
                                                            String j51 = j(B, S0, null, hashMap3, or4Var);
                                                            if (j51 != null) {
                                                                String str36 = hac.a;
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
                                                            String j52 = j(B, T0, null, hashMap3, or4Var);
                                                            if (j52 != null) {
                                                                String str37 = hac.a;
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
                                                            Boolean valueOf = j(B, U0, null, hashMap3, or4Var) != null ? Boolean.valueOf(!r4.equals("NO")) : null;
                                                            String j53 = j(B, V0, null, hashMap3, or4Var);
                                                            if (j53 != null) {
                                                                if (j53.equals("RANGE")) {
                                                                    str19 = "RANGE";
                                                                }
                                                                j4 = j(B, W0, null, hashMap3, or4Var);
                                                                if (j4 != null) {
                                                                    str10 = "PRIMARY";
                                                                    if (!j4.equals("PRIMARY")) {
                                                                        str10 = "HIGHLIGHT";
                                                                    }
                                                                    double g8 = g(B, X0, -1.0d, or4Var);
                                                                    long j54 = g8 >= 0.0d ? (long) (g8 * 1000000.0d) : -9223372036854775807L;
                                                                    str11 = str19;
                                                                    double g9 = g(B, Y0, -1.0d, or4Var);
                                                                    long j55 = g9 >= 0.0d ? (long) (g9 * 1000000.0d) : -9223372036854775807L;
                                                                    String j56 = j(B, Z0, null, hashMap3, or4Var);
                                                                    ArrayList arrayList32 = new ArrayList();
                                                                    String substring = B.substring(17);
                                                                    int i29 = or4.b;
                                                                    b = or4Var.b(b1, substring);
                                                                    while (true) {
                                                                        str12 = str11;
                                                                        if (b.find()) {
                                                                            String group = b.group();
                                                                            group.getClass();
                                                                            xg5 xg5Var9 = xg5Var8;
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
                                                                                    String m = ts2.m(1, 0, group);
                                                                                    String concat = m.concat("=");
                                                                                    int length4 = concat.length() + substring.indexOf(concat);
                                                                                    z = f5;
                                                                                    String substring2 = substring.substring(length4, (substring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                                    if (substring2.startsWith("\"")) {
                                                                                        ug5Var = new ug5(0, m, k(substring, Pattern.compile(m.concat("=\"((?:.|\f)+?)\"")), hashMap3, or4Var));
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                    } else if (substring2.equals("0x") || substring2.equals("0X")) {
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                        ug5Var = new ug5(1, m, k(substring, Pattern.compile(m.concat("=(0[xX][A-F0-9]+)")), hashMap3, or4Var));
                                                                                    } else {
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                        ug5Var = new ug5(m, Double.parseDouble(k(substring, Pattern.compile(m.concat("=([\\d\\.]+)\\b")), Collections.EMPTY_MAP, or4Var)));
                                                                                    }
                                                                                    arrayList32.add(ug5Var);
                                                                                    break;
                                                                            }
                                                                            arrayList12 = arrayList11;
                                                                            str11 = str12;
                                                                            b = matcher;
                                                                            f5 = z;
                                                                            arrayList29 = arrayList10;
                                                                            xg5Var8 = xg5Var9;
                                                                        } else {
                                                                            ArrayList arrayList33 = arrayList29;
                                                                            xg5Var = xg5Var8;
                                                                            boolean z10 = f5;
                                                                            linkedHashMap2 = linkedHashMap;
                                                                            ArrayList arrayList34 = arrayList12;
                                                                            vg5 vg5Var2 = linkedHashMap2.containsKey(k8) ? (vg5) linkedHashMap2.get(k8) : new vg5(k8);
                                                                            if (parse == null) {
                                                                                vg5Var2.getClass();
                                                                            } else {
                                                                                Uri uri6 = vg5Var2.c;
                                                                                if (uri6 != null) {
                                                                                    jte.i(uri6.equals(parse), "Can't change assetUri from %s to %s", vg5Var2.c, parse);
                                                                                }
                                                                                vg5Var2.c = parse;
                                                                            }
                                                                            if (parse2 != null) {
                                                                                Uri uri7 = vg5Var2.d;
                                                                                if (uri7 != null) {
                                                                                    jte.i(uri7.equals(parse2), "Can't change assetListUri from %s to %s", vg5Var2.d, parse2);
                                                                                }
                                                                                vg5Var2.d = parse2;
                                                                            }
                                                                            if (T2 != -9223372036854775807L) {
                                                                                long j57 = vg5Var2.e;
                                                                                if (j57 != -9223372036854775807L) {
                                                                                    jte.g(j57 == T2, "Can't change startDateUnixUs from %s to %s", j57, T2);
                                                                                }
                                                                                vg5Var2.e = T2;
                                                                            }
                                                                            if (T3 != -9223372036854775807L) {
                                                                                long j58 = vg5Var2.f;
                                                                                if (j58 != -9223372036854775807L) {
                                                                                    jte.g(j58 == T3, "Can't change endDateUnixUs from %s to %s", j58, T3);
                                                                                }
                                                                                vg5Var2.f = T3;
                                                                            }
                                                                            if (j47 != -9223372036854775807L) {
                                                                                long j59 = vg5Var2.g;
                                                                                if (j59 != -9223372036854775807L) {
                                                                                    jte.g(j59 == j47, "Can't change durationUs from %s to %s", j59, j47);
                                                                                }
                                                                                vg5Var2.g = j47;
                                                                            }
                                                                            if (j48 != -9223372036854775807L) {
                                                                                long j60 = vg5Var2.h;
                                                                                if (j60 != -9223372036854775807L) {
                                                                                    jte.g(j60 == j48, "Can't change plannedDurationUs from %s to %s", j60, j48);
                                                                                }
                                                                                vg5Var2.h = j48;
                                                                            }
                                                                            if (arrayList33.isEmpty()) {
                                                                                arrayList5 = arrayList34;
                                                                            } else {
                                                                                if (vg5Var2.i.isEmpty()) {
                                                                                    arrayList5 = arrayList34;
                                                                                    arrayList6 = arrayList33;
                                                                                } else {
                                                                                    arrayList6 = arrayList33;
                                                                                    boolean equals = vg5Var2.i.equals(arrayList6);
                                                                                    StringBuilder sb = new StringBuilder("Can't change cue from ");
                                                                                    ArrayList arrayList35 = vg5Var2.i;
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
                                                                                    jte.e(sb.toString(), equals);
                                                                                }
                                                                                vg5Var2.i = arrayList6;
                                                                            }
                                                                            if (z10) {
                                                                                vg5Var2.j = true;
                                                                            }
                                                                            if (j49 != -9223372036854775807L) {
                                                                                long j61 = vg5Var2.k;
                                                                                if (j61 != -9223372036854775807L) {
                                                                                    jte.g(j61 == j49, "Can't change resumeOffsetUs from %s to %s", j61, j49);
                                                                                }
                                                                                vg5Var2.k = j49;
                                                                            }
                                                                            if (j50 != -9223372036854775807L) {
                                                                                long j62 = vg5Var2.l;
                                                                                if (j62 != -9223372036854775807L) {
                                                                                    jte.g(j62 == j50, "Can't change playoutLimitUs from %s to %s", j62, j50);
                                                                                }
                                                                                vg5Var2.l = j50;
                                                                            }
                                                                            if (!arrayList30.isEmpty()) {
                                                                                if (vg5Var2.m.isEmpty()) {
                                                                                    arrayList9 = arrayList30;
                                                                                } else {
                                                                                    arrayList9 = arrayList30;
                                                                                    boolean equals2 = vg5Var2.m.equals(arrayList9);
                                                                                    StringBuilder sb4 = new StringBuilder("Can't change snapTypes from ");
                                                                                    ArrayList arrayList36 = vg5Var2.m;
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
                                                                                    jte.e(sb4.toString(), equals2);
                                                                                }
                                                                                vg5Var2.m = arrayList9;
                                                                            }
                                                                            if (!arrayList31.isEmpty()) {
                                                                                if (vg5Var2.n.isEmpty()) {
                                                                                    arrayList8 = arrayList31;
                                                                                } else {
                                                                                    arrayList8 = arrayList31;
                                                                                    boolean equals3 = vg5Var2.n.equals(arrayList8);
                                                                                    StringBuilder sb7 = new StringBuilder("Can't change restrictions from ");
                                                                                    ArrayList arrayList37 = vg5Var2.n;
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
                                                                                    jte.e(sb7.toString(), equals3);
                                                                                }
                                                                                vg5Var2.n = arrayList8;
                                                                            }
                                                                            HashMap hashMap8 = vg5Var2.b;
                                                                            if (!arrayList32.isEmpty()) {
                                                                                int i30 = 0;
                                                                                while (i30 < arrayList32.size()) {
                                                                                    ug5 ug5Var2 = (ug5) arrayList32.get(i30);
                                                                                    String str38 = ug5Var2.a;
                                                                                    ug5 ug5Var3 = (ug5) hashMap8.get(str38);
                                                                                    if (ug5Var3 != null) {
                                                                                        boolean equals4 = ug5Var3.equals(ug5Var2);
                                                                                        arrayList7 = arrayList32;
                                                                                        Object[] objArr = {str38, ug5Var3.d, Double.valueOf(ug5Var3.c), ug5Var2.d, Double.valueOf(ug5Var2.c)};
                                                                                        if (!equals4) {
                                                                                            u36.j(pwe.a("Can't change %s from %s %s to %s %s", objArr));
                                                                                            return null;
                                                                                        }
                                                                                    } else {
                                                                                        arrayList7 = arrayList32;
                                                                                    }
                                                                                    hashMap8.put(str38, ug5Var2);
                                                                                    i30++;
                                                                                    arrayList32 = arrayList7;
                                                                                }
                                                                            }
                                                                            if (valueOf != null) {
                                                                                Boolean bool2 = vg5Var2.o;
                                                                                if (bool2 != null) {
                                                                                    jte.i(bool2.equals(valueOf), "Can't change contentMayVary from %s to %s", vg5Var2.o, valueOf);
                                                                                }
                                                                                vg5Var2.o = valueOf;
                                                                            }
                                                                            if (str12 != null) {
                                                                                String str39 = vg5Var2.p;
                                                                                if (str39 != null) {
                                                                                    jte.i(str39.equals(str12), "Can't change timelineOccupies from %s to %s", vg5Var2.p, str12);
                                                                                }
                                                                                vg5Var2.p = str12;
                                                                            }
                                                                            if (str10 != null) {
                                                                                String str40 = vg5Var2.q;
                                                                                if (str40 != null) {
                                                                                    jte.i(str40.equals(str10), "Can't change timelineStyle from %s to %s", vg5Var2.q, str10);
                                                                                }
                                                                                vg5Var2.q = str10;
                                                                            }
                                                                            if (j54 != -9223372036854775807L) {
                                                                                long j63 = vg5Var2.r;
                                                                                if (j63 != -9223372036854775807L) {
                                                                                    jte.g(j63 == j54, "Can't change skipControlOffsetUs from %s to %s", j63, j54);
                                                                                }
                                                                                vg5Var2.r = j54;
                                                                            }
                                                                            if (j55 != -9223372036854775807L) {
                                                                                long j64 = vg5Var2.s;
                                                                                if (j64 != -9223372036854775807L) {
                                                                                    jte.g(j64 == j55, "Can't change skipControlDurationUs from %s to %s", j64, j55);
                                                                                }
                                                                                vg5Var2.s = j55;
                                                                            }
                                                                            if (j56 != null) {
                                                                                String str41 = vg5Var2.t;
                                                                                if (str41 != null) {
                                                                                    jte.i(str41.equals(j56), "Can't change skipControlLabelId from %s to %s", vg5Var2.t, j56);
                                                                                }
                                                                                vg5Var2.t = j56;
                                                                            }
                                                                            linkedHashMap2.put(k8, vg5Var2);
                                                                            str3 = str8;
                                                                            j = j6;
                                                                            i3 = i10;
                                                                            j2 = j16;
                                                                            str4 = str15;
                                                                            hashMap2 = hashMap7;
                                                                            arrayList3 = arrayList5;
                                                                            arrayList2 = arrayList4;
                                                                            i2 = 0;
                                                                            gh5Var2 = gh5Var;
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
                                                                            bh5Var = bh5Var2;
                                                                            str17 = str26;
                                                                            arrayList14 = arrayList27;
                                                                            xg5Var2 = xg5Var;
                                                                            ch5Var2 = ch5Var;
                                                                            hashMap4 = hashMap2;
                                                                            str18 = str3;
                                                                            j6 = j;
                                                                            arrayList15 = arrayList;
                                                                            str14 = str2;
                                                                        }
                                                                    }
                                                                }
                                                                str10 = null;
                                                                double g82 = g(B, X0, -1.0d, or4Var);
                                                                if (g82 >= 0.0d) {
                                                                }
                                                                str11 = str19;
                                                                double g92 = g(B, Y0, -1.0d, or4Var);
                                                                if (g92 >= 0.0d) {
                                                                }
                                                                String j562 = j(B, Z0, null, hashMap3, or4Var);
                                                                ArrayList arrayList322 = new ArrayList();
                                                                String substring3 = B.substring(17);
                                                                int i292 = or4.b;
                                                                b = or4Var.b(b1, substring3);
                                                                while (true) {
                                                                    str12 = str11;
                                                                    if (b.find()) {
                                                                    }
                                                                    arrayList12 = arrayList11;
                                                                    str11 = str12;
                                                                    b = matcher;
                                                                    f5 = z;
                                                                    arrayList29 = arrayList10;
                                                                    xg5Var8 = xg5Var9;
                                                                }
                                                            }
                                                            str19 = null;
                                                            j4 = j(B, W0, null, hashMap3, or4Var);
                                                            if (j4 != null) {
                                                            }
                                                            str10 = null;
                                                            double g822 = g(B, X0, -1.0d, or4Var);
                                                            if (g822 >= 0.0d) {
                                                            }
                                                            str11 = str19;
                                                            double g922 = g(B, Y0, -1.0d, or4Var);
                                                            if (g922 >= 0.0d) {
                                                            }
                                                            String j5622 = j(B, Z0, null, hashMap3, or4Var);
                                                            ArrayList arrayList3222 = new ArrayList();
                                                            String substring32 = B.substring(17);
                                                            int i2922 = or4.b;
                                                            b = or4Var.b(b1, substring32);
                                                            while (true) {
                                                                str12 = str11;
                                                                if (b.find()) {
                                                                }
                                                                arrayList12 = arrayList11;
                                                                str11 = str12;
                                                                b = matcher;
                                                                f5 = z;
                                                                arrayList29 = arrayList10;
                                                                xg5Var8 = xg5Var9;
                                                            }
                                                        } else {
                                                            str2 = str2;
                                                        }
                                                    }
                                                    arrayList27 = arrayList27;
                                                    xg5Var = xg5Var7;
                                                    str8 = str32;
                                                    arrayList4 = arrayList26;
                                                    as3Var7 = as3Var11;
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
                                                        gh5Var2 = gh5Var;
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
                                                        bh5Var = bh5Var2;
                                                        str17 = str26;
                                                        arrayList14 = arrayList27;
                                                        xg5Var2 = xg5Var;
                                                        ch5Var2 = ch5Var;
                                                        hashMap4 = hashMap2;
                                                        str18 = str3;
                                                        j6 = j;
                                                        arrayList15 = arrayList;
                                                        str14 = str2;
                                                    } else {
                                                        String hexString3 = str == null ? null : str26 != null ? str26 : Long.toHexString(j13);
                                                        long j65 = j13 + 1;
                                                        String l = l(B, hashMap3, or4Var);
                                                        zg5 zg5Var6 = (zg5) hashMap7.get(l);
                                                        if (j6 == -1) {
                                                            j3 = 0;
                                                        } else {
                                                            if (z7 && zg5Var2 == null && zg5Var6 == null) {
                                                                zg5Var6 = new zg5(l, 0L, j14, null, null);
                                                                hashMap7.put(l, zg5Var6);
                                                            }
                                                            j3 = j14;
                                                        }
                                                        if (as3Var7 != null || treeMap.isEmpty()) {
                                                            str9 = str8;
                                                            i5 = 0;
                                                            as3Var3 = as3Var7;
                                                        } else {
                                                            i5 = 0;
                                                            zr3[] zr3VarArr3 = (zr3[]) treeMap.values().toArray(new zr3[0]);
                                                            str9 = str8;
                                                            as3 as3Var13 = new as3(str9, true, zr3VarArr3);
                                                            if (as3Var6 == null) {
                                                                as3Var6 = b(str9, zr3VarArr3);
                                                            }
                                                            as3Var3 = as3Var13;
                                                        }
                                                        String str42 = hexString3;
                                                        long j66 = j6;
                                                        long j67 = j15;
                                                        long j68 = j16;
                                                        arrayList5.add(new zg5(l, zg5Var2 != null ? zg5Var2 : zg5Var6, str15, j68, i, j67, as3Var3, str, str42, j3, j66, i10, arrayList4));
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
                                                        as3Var7 = as3Var3;
                                                        str16 = str;
                                                        uri2 = str5;
                                                        j6 = -1;
                                                        j16 = 0;
                                                        bh5Var = bh5Var2;
                                                        str17 = str26;
                                                        arrayList14 = arrayList27;
                                                        xg5Var2 = xg5Var;
                                                        str14 = str2;
                                                        str15 = str14;
                                                        ch5Var2 = ch5Var;
                                                        arrayList13 = arrayList38;
                                                        j11 = j15;
                                                        arrayList12 = arrayList5;
                                                        treeMap2 = treeMap;
                                                        gh5Var2 = gh5Var;
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
                                            xg5Var = xg5Var2;
                                            j2 = j16;
                                            str4 = str15;
                                            hashMap2 = hashMap7;
                                            linkedHashMap2 = linkedHashMap;
                                            arrayList2 = arrayList26;
                                            str5 = uri2;
                                        }
                                        gh5Var2 = gh5Var;
                                        str18 = str32;
                                        i8 = i13;
                                        bh5Var = bh5Var2;
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
                                gh5Var2 = gh5Var;
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
                                bh5Var = bh5Var2;
                                str17 = str26;
                                arrayList14 = arrayList27;
                                xg5Var2 = xg5Var;
                                ch5Var2 = ch5Var;
                                hashMap4 = hashMap2;
                                str18 = str3;
                                j6 = j;
                                arrayList15 = arrayList;
                                str14 = str2;
                            }
                            i8 = i13;
                            bh5Var = bh5Var2;
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
                bh5Var = bh5Var2;
                linkedHashMap3 = linkedHashMap;
                arrayList15 = arrayList;
            }
            hashMap4 = hashMap7;
        }
        throw new ih5();
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
    public static gh5 e(in3 in3Var, Uri uri, or4 or4Var) {
        int i;
        int i2;
        char c2;
        ArrayList arrayList;
        ArrayList arrayList2;
        fh5 fh5Var;
        String str;
        int parseInt;
        String str2;
        fh5 fh5Var2;
        String str3;
        fh5 fh5Var3;
        HashMap hashMap;
        HashSet hashSet;
        int i3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i4;
        String str4;
        String str5;
        String w2;
        tm2 tm2Var;
        String j;
        String str6;
        int i5;
        int i6;
        Uri d2;
        ArrayList arrayList8;
        HashMap hashMap2;
        ArrayList arrayList9;
        tm2 tm2Var2;
        String sb;
        String uri2 = uri.toString();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        mj4 mj4Var = null;
        while (true) {
            boolean z3 = in3Var.z();
            Pattern pattern = p0;
            ArrayList arrayList18 = arrayList14;
            Pattern pattern2 = u0;
            boolean z4 = z;
            boolean z5 = z2;
            if (!z3) {
                ArrayList arrayList19 = arrayList10;
                HashMap hashMap5 = hashMap3;
                ArrayList arrayList20 = arrayList15;
                ArrayList arrayList21 = arrayList17;
                ArrayList arrayList22 = arrayList11;
                ArrayList arrayList23 = arrayList12;
                ArrayList arrayList24 = arrayList13;
                ArrayList arrayList25 = arrayList16;
                ArrayList arrayList26 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                int i7 = 0;
                while (i7 < arrayList19.size()) {
                    fh5 fh5Var4 = (fh5) arrayList19.get(i7);
                    Uri uri3 = fh5Var4.a;
                    go4 go4Var = fh5Var4.b;
                    if (hashSet2.add(uri3)) {
                        jte.p(go4Var.m == null);
                        ArrayList arrayList27 = (ArrayList) hashMap5.get(fh5Var4.a);
                        arrayList27.getClass();
                        hashMap = hashMap5;
                        hashSet = hashSet2;
                        nf7 nf7Var = new nf7(new uh5(null, null, arrayList27));
                        fo4 a = go4Var.a();
                        a.l = nf7Var;
                        arrayList26.add(new fh5(fh5Var4.a, new go4(a), fh5Var4.c, fh5Var4.d, fh5Var4.e, fh5Var4.f, fh5Var4.g, fh5Var4.h));
                    } else {
                        hashMap = hashMap5;
                        hashSet = hashSet2;
                    }
                    i7++;
                    hashSet2 = hashSet;
                    hashMap5 = hashMap;
                }
                int i8 = 0;
                ArrayList arrayList28 = null;
                go4 go4Var2 = null;
                while (i8 < arrayList20.size()) {
                    ArrayList arrayList29 = arrayList20;
                    String str7 = (String) arrayList29.get(i8);
                    String k = k(str7, w0, hashMap4, or4Var);
                    String k2 = k(str7, pattern2, hashMap4, or4Var);
                    ArrayList arrayList30 = arrayList28;
                    ArrayList arrayList31 = arrayList26;
                    String j2 = j(str7, P, null, hashMap4, or4Var);
                    fo4 fo4Var = new fo4();
                    fo4Var.a = kt6.o(k, ":", k2);
                    fo4Var.b = k2;
                    fo4Var.r = wf7.n("application/x-mpegURL");
                    boolean f2 = f(str7, A0, or4Var);
                    ?? r29 = f2;
                    if (f(str7, B0, or4Var)) {
                        r29 = (f2 ? 1 : 0) | 2;
                    }
                    fo4Var.e = f(str7, z0, or4Var) ? r29 | 4 : r29;
                    go4 go4Var3 = go4Var2;
                    String j3 = j(str7, x0, null, hashMap4, or4Var);
                    if (TextUtils.isEmpty(j3)) {
                        i2 = i8;
                        i = 0;
                    } else {
                        String str8 = hac.a;
                        String[] split = j3.split(",", -1);
                        i = hac.l(split, "public.accessibility.describes-video") ? 512 : 0;
                        i2 = i8;
                        if (hac.l(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i |= TLObject.FLAG_12;
                        }
                        if (hac.l(split, "public.accessibility.describes-music-and-sound")) {
                            i |= 1024;
                        }
                        if (hac.l(split, "public.easy-to-read")) {
                            i |= TLObject.FLAG_13;
                        }
                    }
                    fo4Var.f = i;
                    fo4Var.d = j(str7, t0, null, hashMap4, or4Var);
                    String j4 = j(str7, pattern, null, hashMap4, or4Var);
                    Uri d3 = j4 == null ? null : lze.d(uri2, j4);
                    String str9 = uri2;
                    nf7 nf7Var2 = new nf7(new uh5(k, k2, Collections.EMPTY_LIST));
                    String k3 = k(str7, r0, hashMap4, or4Var);
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
                            arrayList2 = arrayList23;
                            int i9 = 0;
                            while (true) {
                                if (i9 < arrayList19.size()) {
                                    fh5Var = (fh5) arrayList19.get(i9);
                                    if (!k.equals(fh5Var.e)) {
                                        i9++;
                                    }
                                } else {
                                    fh5Var = null;
                                }
                            }
                            if (fh5Var != null) {
                                String w3 = hac.w(3, fh5Var.b.l);
                                fo4Var.k = w3;
                                str = wf7.d(w3);
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "text/vtt";
                            }
                            fo4Var.s = wf7.n(str);
                            fo4Var.l = nf7Var2;
                            if (d3 != null) {
                                arrayList = arrayList24;
                                arrayList.add(new eh5(d3, new go4(fo4Var), k, k2, j2));
                            } else {
                                arrayList = arrayList24;
                                ncd.f("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList28 = arrayList30;
                            go4Var2 = go4Var3;
                            break;
                        case 1:
                            arrayList2 = arrayList23;
                            String k4 = k(str7, y0, hashMap4, or4Var);
                            if (k4.startsWith("CC")) {
                                parseInt = Integer.parseInt(k4.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(k4.substring(7));
                                str2 = "application/cea-708";
                            }
                            ArrayList arrayList32 = arrayList30 == null ? new ArrayList() : arrayList30;
                            fo4Var.s = wf7.n(str2);
                            fo4Var.S = parseInt;
                            arrayList32.add(new go4(fo4Var));
                            arrayList28 = arrayList32;
                            arrayList = arrayList24;
                            go4Var2 = go4Var3;
                            break;
                        case 2:
                            ArrayList arrayList33 = arrayList22;
                            int i10 = 0;
                            while (true) {
                                if (i10 < arrayList19.size()) {
                                    fh5Var2 = (fh5) arrayList19.get(i10);
                                    if (!k.equals(fh5Var2.d)) {
                                        i10++;
                                    }
                                } else {
                                    fh5Var2 = null;
                                }
                            }
                            if (fh5Var2 != null) {
                                String w4 = hac.w(1, fh5Var2.b.l);
                                fo4Var.k = w4;
                                str3 = wf7.d(w4);
                            } else {
                                str3 = null;
                            }
                            arrayList22 = arrayList33;
                            String j5 = j(str7, r, null, hashMap4, or4Var);
                            if (j5 != null) {
                                String str10 = hac.a;
                                fo4Var.M = Integer.parseInt(j5.split("/", 2)[0]);
                                if ("audio/eac3".equals(str3) && j5.endsWith("/JOC")) {
                                    fo4Var.k = "ec+3";
                                    str3 = "audio/eac3-joc";
                                }
                            }
                            int h2 = h(str7, s, or4Var);
                            if (h2 != -1) {
                                fo4Var.O = h2;
                            }
                            fo4Var.s = wf7.n(str3);
                            if (d3 == null) {
                                arrayList2 = arrayList23;
                                if (fh5Var2 != null) {
                                    go4 go4Var4 = new go4(fo4Var);
                                    arrayList28 = arrayList30;
                                    go4Var2 = go4Var4;
                                    arrayList = arrayList24;
                                    break;
                                }
                            } else {
                                fo4Var.l = nf7Var2;
                                arrayList2 = arrayList23;
                                arrayList2.add(new eh5(d3, new go4(fo4Var), k, k2, j2));
                            }
                            arrayList = arrayList24;
                            arrayList28 = arrayList30;
                            go4Var2 = go4Var3;
                            break;
                        case 3:
                            int i11 = 0;
                            while (true) {
                                if (i11 < arrayList19.size()) {
                                    fh5Var3 = (fh5) arrayList19.get(i11);
                                    if (!k.equals(fh5Var3.c)) {
                                        i11++;
                                    }
                                } else {
                                    fh5Var3 = null;
                                }
                            }
                            if (fh5Var3 != null) {
                                go4 go4Var5 = fh5Var3.b;
                                String w5 = hac.w(2, go4Var5.l);
                                fo4Var.k = w5;
                                fo4Var.s = wf7.n(wf7.d(w5));
                                fo4Var.z = go4Var5.A;
                                fo4Var.A = go4Var5.B;
                                fo4Var.a(go4Var5.F);
                            }
                            if (d3 != null) {
                                fo4Var.l = nf7Var2;
                                arrayList22.add(new eh5(d3, new go4(fo4Var), k, k2, j2));
                            }
                        default:
                            arrayList = arrayList24;
                            arrayList2 = arrayList23;
                            arrayList28 = arrayList30;
                            go4Var2 = go4Var3;
                            break;
                    }
                    i8 = i2 + 1;
                    arrayList23 = arrayList2;
                    arrayList20 = arrayList29;
                    arrayList24 = arrayList;
                    arrayList26 = arrayList31;
                    uri2 = str9;
                }
                return new gh5(uri.toString(), arrayList21, arrayList26, arrayList22, arrayList23, arrayList24, arrayList18, go4Var2, z4 ? Collections.EMPTY_LIST : arrayList28, z5, hashMap4, arrayList25, mj4Var);
            }
            String B = in3Var.B();
            ArrayList arrayList34 = arrayList13;
            if (B.startsWith("#EXT")) {
                arrayList17.add(B);
            }
            boolean startsWith = B.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList35 = arrayList17;
            if (B.startsWith("#EXT-X-DEFINE")) {
                String j6 = j(B, pattern2, null, hashMap4, or4Var);
                if (j6 != null) {
                    m(j6, hashMap4);
                    hashMap4.put(j6, k(B, F0, hashMap4, or4Var));
                } else {
                    String k5 = k(B, v0, hashMap4, or4Var);
                    m(k5, hashMap4);
                    String queryParameter = uri.getQueryParameter(k5);
                    if (queryParameter == null) {
                        throw bx7.b("QUERYPARAM \"" + k5 + "\" not found in playlist URI", null);
                    }
                    hashMap4.put(k5, queryParameter);
                }
            } else if (B.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                ArrayList arrayList36 = arrayList10;
                hashMap2 = hashMap3;
                arrayList8 = arrayList36;
                arrayList6 = arrayList15;
                arrayList5 = arrayList11;
                arrayList4 = arrayList12;
                arrayList3 = arrayList16;
                z = z4;
                z2 = true;
                HashMap hashMap6 = hashMap2;
                arrayList10 = arrayList8;
                hashMap3 = hashMap6;
                arrayList14 = arrayList18;
                arrayList13 = arrayList34;
                arrayList17 = arrayList35;
                arrayList16 = arrayList3;
                arrayList12 = arrayList4;
                arrayList11 = arrayList5;
                arrayList15 = arrayList6;
            } else if (B.startsWith("#EXT-X-MEDIA")) {
                arrayList15.add(B);
            } else if (B.startsWith("#EXT-X-SESSION-KEY")) {
                zr3 c3 = c(B, j(B, n0, "identity", hashMap4, or4Var), hashMap4, or4Var);
                if (c3 != null) {
                    String k6 = k(B, m0, hashMap4, or4Var);
                    arrayList16.add(new as3(("SAMPLE-AES-CENC".equals(k6) || "SAMPLE-AES-CTR".equals(k6)) ? "cenc" : "cbcs", true, c3));
                }
            } else {
                boolean startsWith2 = B.startsWith("#EXT-X-CONTENT-STEERING");
                Pattern pattern3 = N;
                if (startsWith2) {
                    if (mj4Var != null) {
                        throw bx7.b("The #EXT-X-CONTENT-STEERING tag must not appear more than once in a multivariant playlist", null);
                    }
                    ArrayList arrayList37 = arrayList10;
                    hashMap2 = hashMap3;
                    arrayList8 = arrayList37;
                    arrayList6 = arrayList15;
                    arrayList5 = arrayList11;
                    arrayList4 = arrayList12;
                    mj4Var = new mj4(lze.d(uri2, k(B, M, hashMap4, or4Var)), j(B, pattern3, null, hashMap4, or4Var), (byte) 5);
                    arrayList3 = arrayList16;
                    z = z4;
                    z2 = z5;
                    HashMap hashMap62 = hashMap2;
                    arrayList10 = arrayList8;
                    hashMap3 = hashMap62;
                    arrayList14 = arrayList18;
                    arrayList13 = arrayList34;
                    arrayList17 = arrayList35;
                    arrayList16 = arrayList3;
                    arrayList12 = arrayList4;
                    arrayList11 = arrayList5;
                    arrayList15 = arrayList6;
                } else if (B.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                    boolean contains = z4 | B.contains("CLOSED-CAPTIONS=NONE");
                    if (startsWith) {
                        z4 = contains;
                        i3 = 16384;
                    } else {
                        z4 = contains;
                        i3 = 0;
                    }
                    arrayList3 = arrayList16;
                    int parseInt2 = Integer.parseInt(k(B, n, Collections.EMPTY_MAP, or4Var));
                    int h3 = h(B, c, or4Var);
                    arrayList4 = arrayList12;
                    arrayList5 = arrayList11;
                    String j7 = j(B, w, null, hashMap4, or4Var);
                    arrayList6 = arrayList15;
                    String j8 = j(B, x, null, hashMap4, or4Var);
                    HashMap hashMap7 = hashMap3;
                    String j9 = j(B, y, null, hashMap4, or4Var);
                    if (j9 != null) {
                        String str11 = hac.a;
                        String[] split2 = j9.split(",", 2)[0].split("/", -1);
                        str4 = split2[0];
                        if (split2.length > 1) {
                            str5 = split2[1];
                            arrayList7 = arrayList10;
                            i4 = 2;
                            w2 = hac.w(i4, j8);
                            if (wf7.j(w2, str4) || (str4 != null && (j7 == null || str5 == null || ((j7.equals("PQ") && !str5.equals("db1p")) || ((j7.equals("SDR") && !str5.equals("db2g")) || (j7.equals("HLG") && !str5.startsWith("db4"))))))) {
                                tm2Var = null;
                            } else {
                                tm2 x2 = hac.x(j8, str4, str5);
                                if (str4 == null) {
                                    str4 = w2;
                                }
                                String[] e02 = hac.e0(j8);
                                if (e02.length == 0) {
                                    tm2Var2 = x2;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    int length = e02.length;
                                    int i12 = 0;
                                    while (true) {
                                        tm2Var2 = x2;
                                        if (i12 >= length) {
                                            break;
                                        }
                                        String str12 = e02[i12];
                                        String[] strArr = e02;
                                        int i13 = length;
                                        if (2 != wf7.h(wf7.d(str12))) {
                                            if (sb2.length() > 0) {
                                                sb2.append(",");
                                            }
                                            sb2.append(str12);
                                        }
                                        i12++;
                                        x2 = tm2Var2;
                                        length = i13;
                                        e02 = strArr;
                                    }
                                    if (sb2.length() > 0) {
                                        sb = sb2.toString();
                                        j8 = sb == null ? td4.q(str4, ",", sb) : str4;
                                        tm2Var = tm2Var2;
                                    }
                                }
                                sb = null;
                                if (sb == null) {
                                }
                                tm2Var = tm2Var2;
                            }
                            boolean equals = TextUtils.equals(j(B, F, null, hashMap4, or4Var), "true");
                            String j10 = j(B, E, null, hashMap4, or4Var);
                            String j11 = j(B, G, null, hashMap4, or4Var);
                            String j12 = j(B, H, null, hashMap4, or4Var);
                            String j13 = j(B, I, null, hashMap4, or4Var);
                            j = j(B, J, null, hashMap4, or4Var);
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
                            String j14 = j(B, K, null, hashMap4, or4Var);
                            float parseFloat = j14 == null ? Float.parseFloat(j14) : -1.0f;
                            String j15 = j(B, L, null, hashMap4, or4Var);
                            float parseFloat2 = j15 != null ? Float.parseFloat(j15) : -1.0f;
                            String j16 = j(B, pattern3, null, hashMap4, or4Var);
                            String j17 = j(B, d, null, hashMap4, or4Var);
                            String j18 = j(B, e, null, hashMap4, or4Var);
                            String j19 = j(B, f, null, hashMap4, or4Var);
                            String j20 = j(B, h, null, hashMap4, or4Var);
                            String j21 = j(B, O, null, hashMap4, or4Var);
                            if (!startsWith) {
                                d2 = lze.d(uri2, k(B, pattern, hashMap4, or4Var));
                            } else {
                                if (!in3Var.z()) {
                                    throw bx7.b("#EXT-X-STREAM-INF must be followed by another line", null);
                                }
                                d2 = lze.d(uri2, l(in3Var.B(), hashMap4, or4Var));
                            }
                            Uri uri4 = d2;
                            fo4 fo4Var2 = new fo4();
                            fo4Var2.a = Integer.toString(arrayList7.size());
                            fo4Var2.r = wf7.n("application/x-mpegURL");
                            fo4Var2.k = j8;
                            fo4Var2.i = h3;
                            fo4Var2.j = parseInt2;
                            fo4Var2.z = i6;
                            fo4Var2.A = i5;
                            fo4Var2.a(parseFloat);
                            fo4Var2.g = parseFloat2;
                            fo4Var2.f = i3;
                            fo4Var2.K = tm2Var;
                            fo4Var2.n = equals;
                            fo4Var2.s = wf7.n(j10);
                            fo4Var2.o = Long.parseLong(str6);
                            fo4Var2.p = j12;
                            fo4Var2.q = Integer.parseInt(j13);
                            arrayList8 = arrayList7;
                            arrayList8.add(new fh5(uri4, new go4(fo4Var2), j17, j18, j19, j20, j16, j21));
                            hashMap2 = hashMap7;
                            arrayList9 = (ArrayList) hashMap2.get(uri4);
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                                hashMap2.put(uri4, arrayList9);
                            }
                            arrayList9.add(new th5(h3, j17, parseInt2, j18, j19, j20));
                            z = z4;
                            z2 = z5;
                            HashMap hashMap622 = hashMap2;
                            arrayList10 = arrayList8;
                            hashMap3 = hashMap622;
                            arrayList14 = arrayList18;
                            arrayList13 = arrayList34;
                            arrayList17 = arrayList35;
                            arrayList16 = arrayList3;
                            arrayList12 = arrayList4;
                            arrayList11 = arrayList5;
                            arrayList15 = arrayList6;
                        } else {
                            arrayList7 = arrayList10;
                            i4 = 2;
                        }
                    } else {
                        arrayList7 = arrayList10;
                        i4 = 2;
                        str4 = null;
                    }
                    str5 = null;
                    w2 = hac.w(i4, j8);
                    if (wf7.j(w2, str4)) {
                    }
                    tm2Var = null;
                    boolean equals2 = TextUtils.equals(j(B, F, null, hashMap4, or4Var), "true");
                    String j102 = j(B, E, null, hashMap4, or4Var);
                    String j112 = j(B, G, null, hashMap4, or4Var);
                    String j122 = j(B, H, null, hashMap4, or4Var);
                    String j132 = j(B, I, null, hashMap4, or4Var);
                    j = j(B, J, null, hashMap4, or4Var);
                    if (j == null) {
                    }
                    i5 = -1;
                    i6 = -1;
                    String j142 = j(B, K, null, hashMap4, or4Var);
                    if (j142 == null) {
                    }
                    String j152 = j(B, L, null, hashMap4, or4Var);
                    float parseFloat22 = j152 != null ? Float.parseFloat(j152) : -1.0f;
                    String j162 = j(B, pattern3, null, hashMap4, or4Var);
                    String j172 = j(B, d, null, hashMap4, or4Var);
                    String j182 = j(B, e, null, hashMap4, or4Var);
                    String j192 = j(B, f, null, hashMap4, or4Var);
                    String j202 = j(B, h, null, hashMap4, or4Var);
                    String j212 = j(B, O, null, hashMap4, or4Var);
                    if (!startsWith) {
                    }
                    Uri uri42 = d2;
                    fo4 fo4Var22 = new fo4();
                    fo4Var22.a = Integer.toString(arrayList7.size());
                    fo4Var22.r = wf7.n("application/x-mpegURL");
                    fo4Var22.k = j8;
                    fo4Var22.i = h3;
                    fo4Var22.j = parseInt2;
                    fo4Var22.z = i6;
                    fo4Var22.A = i5;
                    fo4Var22.a(parseFloat);
                    fo4Var22.g = parseFloat22;
                    fo4Var22.f = i3;
                    fo4Var22.K = tm2Var;
                    fo4Var22.n = equals2;
                    fo4Var22.s = wf7.n(j102);
                    fo4Var22.o = Long.parseLong(str6);
                    fo4Var22.p = j122;
                    fo4Var22.q = Integer.parseInt(j132);
                    arrayList8 = arrayList7;
                    arrayList8.add(new fh5(uri42, new go4(fo4Var22), j172, j182, j192, j202, j162, j212));
                    hashMap2 = hashMap7;
                    arrayList9 = (ArrayList) hashMap2.get(uri42);
                    if (arrayList9 == null) {
                    }
                    arrayList9.add(new th5(h3, j172, parseInt2, j182, j192, j202));
                    z = z4;
                    z2 = z5;
                    HashMap hashMap6222 = hashMap2;
                    arrayList10 = arrayList8;
                    hashMap3 = hashMap6222;
                    arrayList14 = arrayList18;
                    arrayList13 = arrayList34;
                    arrayList17 = arrayList35;
                    arrayList16 = arrayList3;
                    arrayList12 = arrayList4;
                    arrayList11 = arrayList5;
                    arrayList15 = arrayList6;
                }
            }
            ArrayList arrayList38 = arrayList10;
            hashMap2 = hashMap3;
            arrayList8 = arrayList38;
            arrayList6 = arrayList15;
            arrayList5 = arrayList11;
            arrayList4 = arrayList12;
            arrayList3 = arrayList16;
            z = z4;
            z2 = z5;
            HashMap hashMap62222 = hashMap2;
            arrayList10 = arrayList8;
            hashMap3 = hashMap62222;
            arrayList14 = arrayList18;
            arrayList13 = arrayList34;
            arrayList17 = arrayList35;
            arrayList16 = arrayList3;
            arrayList12 = arrayList4;
            arrayList11 = arrayList5;
            arrayList15 = arrayList6;
        }
    }

    public static boolean f(String str, Pattern pattern, or4 or4Var) {
        int i = or4.b;
        Matcher b = or4Var.b(pattern, str);
        if (b.find()) {
            return "YES".equals(b.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d2, or4 or4Var) {
        int i = or4.b;
        Matcher b = or4Var.b(pattern, str);
        if (!b.find()) {
            return d2;
        }
        String group = b.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static int h(String str, Pattern pattern, or4 or4Var) {
        int i = or4.b;
        Matcher b = or4Var.b(pattern, str);
        if (!b.find()) {
            return -1;
        }
        String group = b.group(1);
        group.getClass();
        return Integer.parseInt(group);
    }

    public static long i(String str, Pattern pattern, or4 or4Var) {
        int i = or4.b;
        Matcher b = or4Var.b(pattern, str);
        if (!b.find()) {
            return -1L;
        }
        String group = b.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String j(String str, Pattern pattern, String str2, Map map, or4 or4Var) {
        int i = or4.b;
        Matcher b = or4Var.b(pattern, str);
        if (b.find()) {
            str2 = b.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map, or4Var);
    }

    public static String k(String str, Pattern pattern, Map map, or4 or4Var) {
        String j = j(str, pattern, null, map, or4Var);
        if (j != null) {
            return j;
        }
        throw bx7.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map, or4 or4Var) {
        int i = or4.b;
        Matcher b = or4Var.b(a1, str);
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
            throw bx7.b("duplicate variable name \"" + str + "\"", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071 A[Catch: all -> 0x010a, LOOP:0: B:12:0x0071->B:37:0x0071, LOOP_START, TryCatch #1 {all -> 0x010a, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:9:0x0032, B:12:0x0071, B:14:0x0077, B:17:0x0081, B:55:0x008b, B:19:0x009d, B:21:0x00a5, B:23:0x00ad, B:25:0x00b5, B:27:0x00bd, B:29:0x00c5, B:31:0x00cd, B:33:0x00d5, B:35:0x00dd, B:39:0x00e1, B:71:0x0103, B:72:0x0109, B:76:0x0039, B:78:0x003f, B:83:0x0048, B:85:0x0050, B:89:0x0059, B:91:0x005f, B:93:0x0065, B:95:0x006a), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103 A[Catch: all -> 0x010a, TRY_ENTER, TryCatch #1 {all -> 0x010a, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:9:0x0032, B:12:0x0071, B:14:0x0077, B:17:0x0081, B:55:0x008b, B:19:0x009d, B:21:0x00a5, B:23:0x00ad, B:25:0x00b5, B:27:0x00bd, B:29:0x00c5, B:31:0x00cd, B:33:0x00d5, B:35:0x00dd, B:39:0x00e1, B:71:0x0103, B:72:0x0109, B:76:0x0039, B:78:0x003f, B:83:0x0048, B:85:0x0050, B:89:0x0059, B:91:0x005f, B:93:0x0065, B:95:0x006a), top: B:2:0x0019 }] */
    @Override // cx7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(Uri uri, e83 e83Var) {
        String trim;
        byte b;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(e83Var));
        ArrayDeque arrayDeque = new ArrayDeque();
        or4 or4Var = new or4(16, 0.75f, true, (byte) 1);
        try {
            int read = bufferedReader.read();
            boolean z = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                if (z) {
                    throw bx7.b("Input does not start with the #EXTM3U header.", null);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                        }
                        throw bx7.b("Failed to parse the playlist, could not identify any tags.", null);
                    }
                    trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        b = 8;
                        if (trim.startsWith("#EXT-X-STREAM-INF")) {
                            arrayDeque.add(trim);
                            gh5 e2 = e(new in3(arrayDeque, bufferedReader, b), uri, or4Var);
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
                ch5 d2 = d(this.a, this.b, new in3(arrayDeque, bufferedReader, b), uri, or4Var);
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
                    while (read != -1 && Character.isWhitespace(read) && !hac.P(read)) {
                        read = bufferedReader.read();
                    }
                    z = hac.P(read);
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
            String str = hac.a;
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
        }
    }
}
