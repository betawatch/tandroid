package g2;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import b8.ac;
import b8.vc;
import b8.wc;
import b8.xb;
import b8.xc;
import b8.yc;
import b8.zb;
import d2.e1;
import d2.u0;
import d2.v0;
import ei.h9;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import k2.p1;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class n0 {
    public static final String a;
    public static final byte[] b;
    public static final long[] c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static HashMap g;
    public static final String[] h;
    public static final String[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        a = str + ", " + Build.MODEL + ", " + str2 + ", " + Build.VERSION.SDK_INT;
        b = new byte[0];
        c = new long[0];
        d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, hs.x1, hs.E1, hs.K1, hs.F1, hs.t1, hs.s1, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, hs.B3, hs.H3, hs.N3, TLRPC.LAYER, hs.b4, hs.a4, hs.R3, hs.U3, hs.t3, hs.A3, hs.r3, hs.m3, hs.a3, hs.Z2, hs.g3, hs.j3, hs.a2, hs.h2, hs.o2, hs.j2, hs.W1, hs.V1, hs.O1, 133, hs.y2, hs.F2, hs.w2, hs.r2, hs.K2, hs.J2, hs.Q2, hs.T2, hs.d3, hs.W2, hs.f3, hs.k3, hs.w3, hs.x3, hs.q3, hs.n3, hs.e4, hs.X3, hs.Q3, hs.V3, 227, hs.E3, hs.M3, hs.J3, hs.N2, hs.G2, hs.P2, hs.U2, hs.B2, hs.C2, hs.v2, hs.s2, hs.Z1, hs.S1, hs.N1, 134, hs.d2, hs.e2, hs.n2, hs.k2, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, hs.w1, hs.p1, 97, hs.n1, hs.A1, hs.B1, hs.J1, hs.G1, hs.T1, hs.Y1, hs.R1, 128, hs.f2, hs.c2, hs.l2, hs.m2, hs.H2, hs.M2, hs.V2, hs.O2, hs.D2, hs.A2, hs.t2, hs.u2, hs.Y3, hs.d4, hs.W3, hs.P3, hs.F3, hs.D3, hs.K3, hs.L3, hs.X2, hs.c3, hs.l3, hs.e3, hs.y3, hs.v3, hs.o3, hs.p3, hs.q1, hs.v1, hs.o1, 96, hs.C1, hs.z1, hs.H1, hs.I1, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, hs.D1, hs.y1, 120, hs.L1, hs.r1, hs.u1, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, hs.E2, hs.z2, hs.q2, hs.x2, hs.I2, hs.L2, hs.S2, hs.R2, hs.g2, hs.b2, hs.i2, hs.p2, hs.U1, hs.X1, hs.Q1, hs.P1, hs.z3, hs.u3, 208, hs.s3, hs.Y2, hs.b3, hs.i3, 203, hs.G3, hs.C3, hs.I3, hs.O3, hs.Z3, hs.c4, hs.T3, hs.S3};
    }

    public static int A(String str) {
        String[] split;
        int length;
        int i3 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z10 = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            i3 = Integer.parseInt(str2);
            if (z10) {
                return -i3;
            }
        } catch (NumberFormatException unused) {
        }
        return i3;
    }

    public static long B(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    public static long C(long j10) {
        return j10 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j10;
    }

    public static int D(int i3, ByteOrder byteOrder) {
        if (i3 == 8) {
            return 3;
        }
        if (i3 == 16) {
            if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                return 2;
            }
            return TLObject.FLAG_28;
        }
        if (i3 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i3 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static d2.v E(int i3, int i10, int i11) {
        d2.u uVar = new d2.u();
        uVar.r = u0.n("audio/raw");
        uVar.J = i10;
        uVar.K = i11;
        uVar.L = i3;
        return new d2.v(uVar);
    }

    public static long F(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    public static String[] G() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i3 = 0; i3 < split.length; i3++) {
            split[i3] = T(split[i3]);
        }
        return split;
    }

    public static String H(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            a.d("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    public static String I(int i3) {
        switch (i3) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return MediaStreamTrack.AUDIO_TRACK_KIND;
            case 2:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i3 >= 10000 ? p1.j(i3, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean J(e1 e1Var) {
        boolean z10 = false;
        if (e1Var == null) {
            return false;
        }
        int h7 = e1Var.h();
        if (h7 != 1 || !e1Var.m0(2)) {
            if (h7 == 4 && e1Var.m0(4)) {
                e1Var.F();
            }
            if (e1Var.m0(1)) {
                return z10;
            }
            e1Var.j();
            return true;
        }
        e1Var.a();
        z10 = true;
        if (e1Var.m0(1)) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int K(Uri uri, String str) {
        int i3;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme == null || (!xb.a("rtsp", scheme) && !xb.a("rtspt", scheme))) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (lastIndexOf >= 0) {
                        String c2 = xb.c(lastPathSegment.substring(lastIndexOf + 1));
                        c2.getClass();
                        switch (c2) {
                            case "ism":
                            case "isml":
                                i3 = 1;
                                break;
                            case "mpd":
                                i3 = 0;
                                break;
                            case "m3u8":
                                i3 = 2;
                                break;
                            default:
                                i3 = 4;
                                break;
                        }
                        if (i3 != 4) {
                            return i3;
                        }
                    }
                    String path = uri.getPath();
                    path.getClass();
                    Matcher matcher = f.matcher(path);
                    if (matcher.matches()) {
                        String group = matcher.group(2);
                        if (group != null) {
                            if (!group.contains("format=mpd-time-csf")) {
                                if (group.contains("format=m3u8-aapl")) {
                                    return 2;
                                }
                            }
                            return 0;
                        }
                        return 1;
                    }
                }
                return 4;
            }
            return 3;
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    break;
                }
                break;
        }
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Switch insn not found in header
            	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            */
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.n0.K(android.net.Uri, java.lang.String):int");
    }

    public static boolean L(int i3) {
        return i3 == 21 || i3 == 1342177280 || i3 == 22 || i3 == 1610612736 || i3 == 4 || i3 == 1879048192;
    }

    public static boolean M(int i3) {
        return i3 == 3 || i3 == 2 || i3 == 268435456 || i3 == 21 || i3 == 1342177280 || i3 == 22 || i3 == 1610612736 || i3 == 4 || i3 == 1879048192;
    }

    public static boolean N(Context context) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i3 == 30) {
            String str = Build.MODEL;
            if (xb.a(str, "moto g(20)") || xb.a(str, "rmx3231")) {
                return true;
            }
        }
        return i3 == 34 && xb.a(Build.MODEL, "sm-x200");
    }

    public static boolean O(int i3) {
        return i3 == 10 || i3 == 13;
    }

    public static boolean P(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean Q(y yVar, y yVar2, Inflater inflater) {
        if (yVar.a() > 0 && yVar.j() == 120 && yVar.a() != 0) {
            if (yVar2.a.length < yVar.a()) {
                yVar2.c(yVar.a() * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(yVar.a, yVar.b, yVar.a());
            int i3 = 0;
            while (true) {
                try {
                    byte[] bArr = yVar2.a;
                    i3 += inflater.inflate(bArr, i3, bArr.length - i3);
                    if (!inflater.finished()) {
                        if (inflater.needsDictionary() || inflater.needsInput()) {
                            break;
                        }
                        byte[] bArr2 = yVar2.a;
                        if (i3 == bArr2.length) {
                            yVar2.c(bArr2.length * 2);
                        }
                    } else {
                        yVar2.M(i3);
                        inflater.reset();
                        return true;
                    }
                } catch (DataFormatException unused) {
                } catch (Throwable th2) {
                    inflater.reset();
                    throw th2;
                }
            }
            inflater.reset();
        }
        return false;
    }

    public static void R(int i3, int i10, int i11, ArrayList arrayList) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i12 = (i10 - i3) - 1; i12 >= 0; i12--) {
            arrayDeque.addFirst(arrayList.remove(i3 + i12));
        }
        arrayList.addAll(Math.min(i11, arrayList.size()), arrayDeque);
    }

    public static long S(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static String T(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String c2 = xb.c(str);
        int i3 = 0;
        String str2 = c2.split("-", 2)[0];
        if (g == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = h;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                hashMap.put(strArr[i10], strArr[i10 + 1]);
            }
            g = hashMap;
        }
        String str4 = (String) g.get(str2);
        if (str4 != null) {
            StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str4);
            l10.append(c2.substring(str2.length()));
            c2 = l10.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return c2;
        }
        while (true) {
            String[] strArr2 = i;
            if (i3 >= strArr2.length) {
                return c2;
            }
            if (c2.startsWith(strArr2[i3])) {
                return strArr2[i3 + 1] + c2.substring(strArr2[i3].length());
            }
            i3 += 2;
        }
    }

    public static Object[] U(int i3, Object[] objArr) {
        zb.f(i3 <= objArr.length);
        return Arrays.copyOf(objArr, i3);
    }

    public static long V(String str) {
        Matcher matcher = d.matcher(str);
        if (!matcher.matches()) {
            throw v0.a(null, "Invalid date/time format: " + str);
        }
        int i3 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            int parseInt = Integer.parseInt(matcher.group(12)) * 60;
            String group = matcher.group(13);
            i3 = group != null ? Integer.parseInt(group) + parseInt : parseInt;
            if ("-".equals(matcher.group(11))) {
                i3 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i3 != 0 ? timeInMillis - (i3 * 60000) : timeInMillis;
    }

    public static void W(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void X(int i3, int i10, ArrayList arrayList) {
        if (i3 < 0 || i10 > arrayList.size() || i3 > i10) {
            throw new IllegalArgumentException();
        }
        if (i3 != i10) {
            arrayList.subList(i3, i10).clear();
        }
    }

    public static long Y(int i3, long j10) {
        return a0(j10, 1000000L, i3, RoundingMode.DOWN);
    }

    public static void Z(long[] jArr, long j10) {
        long j11;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i3 = 0;
        if (j10 >= 1000000 && j10 % 1000000 == 0) {
            long b10 = xc.b(j10, 1000000L, RoundingMode.UNNECESSARY);
            while (i3 < jArr.length) {
                jArr[i3] = xc.b(jArr[i3], b10, roundingMode);
                i3++;
            }
            return;
        }
        if (j10 < 1000000 && 1000000 % j10 == 0) {
            long b11 = xc.b(1000000L, j10, RoundingMode.UNNECESSARY);
            while (i3 < jArr.length) {
                jArr[i3] = xc.d(jArr[i3], b11);
                i3++;
            }
            return;
        }
        int i10 = 0;
        while (i10 < jArr.length) {
            long j12 = jArr[i10];
            if (j12 != 0) {
                if (j10 >= j12 && j10 % j12 == 0) {
                    jArr[i10] = xc.b(1000000L, xc.b(j10, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j10 >= j12 || j12 % j10 != 0) {
                    j11 = j10;
                    jArr[i10] = b0(j12, 1000000L, j11, roundingMode);
                    i10++;
                    j10 = j11;
                } else {
                    jArr[i10] = xc.d(1000000L, xc.b(j12, j10, RoundingMode.UNNECESSARY));
                }
            }
            j11 = j10;
            i10++;
            j10 = j11;
        }
    }

    public static long a(long j10, long j11) {
        long j12 = j10 + j11;
        long j13 = (((j11 ^ j10) > 0L ? 1 : ((j11 ^ j10) == 0L ? 0 : -1)) < 0) | ((j10 ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j13 != Long.MIN_VALUE || j12 == Long.MIN_VALUE) && (j13 != Long.MAX_VALUE || j12 == Long.MAX_VALUE)) {
            return j13;
        }
        return Long.MAX_VALUE;
    }

    public static long a0(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        return (j12 < j11 || j12 % j11 != 0) ? (j12 >= j11 || j11 % j12 != 0) ? (j12 < j10 || j12 % j10 != 0) ? (j12 >= j10 || j10 % j12 != 0) ? b0(j10, j11, j12, roundingMode) : xc.d(j11, xc.b(j10, j12, RoundingMode.UNNECESSARY)) : xc.b(j11, xc.b(j12, j10, RoundingMode.UNNECESSARY), roundingMode) : xc.d(j10, xc.b(j11, j12, RoundingMode.UNNECESSARY)) : xc.b(j10, xc.b(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static int b(long[] jArr, long j10, boolean z10) {
        int i3;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i3 = binarySearch + 1;
            if (i3 >= jArr.length || jArr[i3] != j10) {
                break;
            }
            binarySearch = i3;
        }
        return z10 ? binarySearch : i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b0(long j10, long j11, long j12, RoundingMode roundingMode) {
        double d10;
        long j13;
        long d11 = xc.d(j10, j11);
        if (d11 != Long.MAX_VALUE && d11 != Long.MIN_VALUE) {
            return xc.b(d11, j12, roundingMode);
        }
        long c2 = xc.c(Math.abs(j11), Math.abs(j12));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long b10 = xc.b(j11, c2, roundingMode2);
        long b11 = xc.b(j12, c2, roundingMode2);
        long c10 = xc.c(Math.abs(j10), Math.abs(b11));
        long b12 = xc.b(j10, c10, roundingMode2);
        long b13 = xc.b(b11, c10, roundingMode2);
        long d12 = xc.d(b12, b10);
        if (d12 != Long.MAX_VALUE && d12 != Long.MIN_VALUE) {
            return xc.b(d12, b13, roundingMode);
        }
        double d13 = b12 * (b10 / b13);
        if (d13 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d13 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i3 = i9.c.a;
        if (!vc.b(d13)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (i9.b.a[roundingMode.ordinal()]) {
            case 1:
                yc.b(i9.c.a(d13));
                d10 = d13;
                if (!((-9.223372036854776E18d) - d10 >= 1.0d) || !(d10 < 9.223372036854776E18d)) {
                    return (long) d10;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d13 + " and rounding mode " + roundingMode);
            case 2:
                if (d13 < 0.0d && !i9.c.a(d13)) {
                    j13 = ((long) d13) - 1;
                    d10 = j13;
                    if (!(((-9.223372036854776E18d) - d10 >= 1.0d) & (d10 < 9.223372036854776E18d))) {
                    }
                }
                d10 = d13;
                if (!(((-9.223372036854776E18d) - d10 >= 1.0d) & (d10 < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d13 > 0.0d && !i9.c.a(d13)) {
                    j13 = ((long) d13) + 1;
                    d10 = j13;
                    if (!(((-9.223372036854776E18d) - d10 >= 1.0d) & (d10 < 9.223372036854776E18d))) {
                    }
                }
                d10 = d13;
                if (!(((-9.223372036854776E18d) - d10 >= 1.0d) & (d10 < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d10 = d13;
                if (!(((-9.223372036854776E18d) - d10 >= 1.0d) & (d10 < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!i9.c.a(d13)) {
                    d10 = ((long) d13) + (d13 > 0.0d ? 1 : -1);
                    if (!(((-9.223372036854776E18d) - d10 >= 1.0d) & (d10 < 9.223372036854776E18d))) {
                    }
                }
                d10 = d13;
                if (!(((-9.223372036854776E18d) - d10 >= 1.0d) & (d10 < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                d10 = Math.rint(d13);
                if (!(((-9.223372036854776E18d) - d10 >= 1.0d) & (d10 < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                d10 = Math.rint(d13);
                if (Math.abs(d13 - d10) == 0.5d) {
                    d10 = Math.copySign(0.5d, d13) + d13;
                }
                if (!(((-9.223372036854776E18d) - d10 >= 1.0d) & (d10 < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                d10 = Math.rint(d13);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static int c(e5.u uVar, long j10) {
        int i3 = uVar.b - 1;
        int i10 = 0;
        while (i10 <= i3) {
            int i11 = (i10 + i3) >>> 1;
            if (uVar.j(i11) < j10) {
                i10 = i11 + 1;
            } else {
                i3 = i11 - 1;
            }
        }
        int i12 = i3 + 1;
        if (i12 < uVar.b && uVar.j(i12) == j10) {
            return i12;
        }
        if (i3 == -1) {
            return 0;
        }
        return i3;
    }

    public static boolean c0(e1 e1Var, boolean z10) {
        return e1Var == null || !e1Var.u() || e1Var.h() == 1 || e1Var.h() == 4 || !(!z10 || e1Var.t0() == 0 || e1Var.t0() == 4);
    }

    public static int d(List list, Long l10, boolean z10) {
        int i3;
        int binarySearch = Collections.binarySearch(list, l10);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                int i10 = binarySearch - 1;
                if (i10 < 0 || ((Comparable) list.get(i10)).compareTo(l10) != 0) {
                    break;
                }
                binarySearch = i10;
            }
            i3 = binarySearch;
        }
        return z10 ? Math.max(0, i3) : i3;
    }

    public static String[] d0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int e(int[] iArr, int i3, boolean z10, boolean z11) {
        int i10;
        int i11;
        int binarySearch = Arrays.binarySearch(iArr, i3);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                i10 = binarySearch - 1;
                if (i10 < 0 || iArr[i10] != i3) {
                    break;
                }
                binarySearch = i10;
            }
            i11 = z10 ? binarySearch : i10;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static String e0(int i3) {
        return new String(new byte[]{(byte) (i3 >> 24), (byte) (i3 >> 16), (byte) (i3 >> 8), (byte) i3}, StandardCharsets.US_ASCII);
    }

    public static int f(long[] jArr, long j10, boolean z10) {
        int i3;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                int i10 = binarySearch - 1;
                if (i10 < 0 || jArr[i10] != j10) {
                    break;
                }
                binarySearch = i10;
            }
            i3 = binarySearch;
        }
        return z10 ? Math.max(0, i3) : i3;
    }

    public static String f0(byte[] bArr) {
        boolean z10;
        h9.b bVar = h9.d.d;
        h9.d dVar = bVar.c;
        if (dVar == null) {
            h9.a aVar = bVar.a;
            char[] cArr = aVar.b;
            int length = cArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (xb.b(cArr[i3])) {
                    int length2 = cArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length2) {
                            z10 = false;
                            break;
                        }
                        char c2 = cArr[i10];
                        if (c2 >= 'a' && c2 <= 'z') {
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                    zb.o("Cannot call lowerCase() on a mixed-case alphabet", !z10);
                    char[] cArr2 = new char[cArr.length];
                    for (int i11 = 0; i11 < cArr.length; i11++) {
                        char c10 = cArr[i11];
                        if (xb.b(c10)) {
                            c10 = (char) (c10 ^ ' ');
                        }
                        cArr2[i11] = c10;
                    }
                    h9.a aVar2 = new h9.a(a1.g.s(new StringBuilder(), aVar.a, ".lowerCase()"), cArr2);
                    if (aVar.h) {
                        byte[] bArr2 = aVar2.g;
                        if (!aVar2.h) {
                            byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
                            for (int i12 = 65; i12 <= 90; i12++) {
                                int i13 = i12 | 32;
                                byte b10 = bArr2[i12];
                                byte b11 = bArr2[i13];
                                if (b10 == -1) {
                                    copyOf[i12] = b11;
                                } else {
                                    char c11 = (char) i12;
                                    char c12 = (char) i13;
                                    if (!(b11 == -1)) {
                                        throw new IllegalStateException(ac.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                                    }
                                    copyOf[i13] = b10;
                                }
                            }
                            aVar = new h9.a(a1.g.s(new StringBuilder(), aVar2.a, ".ignoreCase()"), aVar2.b, copyOf, true);
                        }
                    }
                    aVar = aVar2;
                } else {
                    i3++;
                }
            }
            dVar = aVar == bVar.a ? bVar : new h9.b(aVar);
            bVar.c = dVar;
        }
        int length3 = bArr.length;
        zb.n(0, length3, bArr.length);
        h9.a aVar3 = dVar.a;
        int i14 = aVar3.e;
        int i15 = aVar3.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(wc.b(length3, i15) * i14);
        try {
            dVar.b(sb2, bArr, length3);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public static int g(int i3, int i10) {
        return ((i3 + i10) - 1) / i10;
    }

    public static l9.e0 g0(l9.y yVar, l9.q qVar) {
        l9.e0 e0Var = new l9.e0();
        c cVar = new c(3, e0Var, yVar);
        l9.r rVar = l9.r.a;
        e0Var.b(cVar, rVar);
        yVar.b(new h9(yVar, e0Var, qVar, 2), rVar);
        return e0Var;
    }

    public static float h(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static long h0(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static int i(int i3, int i10, int i11) {
        return Math.max(i10, Math.min(i3, i11));
    }

    public static long j(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static boolean k(SparseArray sparseArray, int i3) {
        return sparseArray.indexOfKey(i3) >= 0;
    }

    public static boolean l(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i3 = 0; i3 < size; i3++) {
            if (!Objects.equals(sparseArray.valueAt(i3), sparseArray2.get(sparseArray.keyAt(i3)))) {
                return false;
            }
        }
        return true;
    }

    public static int n(SparseArray sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int i3 = 17;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            i3 = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (i3 * 31)) * 31);
        }
        return i3;
    }

    public static Bundle o(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ClassLoader classLoader = n0.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (RuntimeException e10) {
            a.d("Util", "Ignoring invalid bundle", e10);
            return null;
        }
    }

    public static int p(int i3, int i10, int i11, byte[] bArr) {
        while (i3 < i10) {
            i11 = j[((i11 >>> 24) ^ (bArr[i3] & 255)) & hs.e4] ^ (i11 << 8);
            i3++;
        }
        return i11;
    }

    public static Handler q(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, callback);
    }

    public static String r(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int s(int i3) {
        switch (i3) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
                return 28;
            case 13:
            case 19:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return ConnectionsManager.DEFAULT_DATACENTER_ID;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case hs.T /* 30 */:
            case hs.U /* 31 */:
                return 34;
        }
    }

    public static int t(int i3) {
        if (i3 == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i3 == 16) {
            return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
        }
        if (i3 == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i3) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                switch (i3) {
                    case 13:
                        if (Build.VERSION.SDK_INT >= 32) {
                        }
                        break;
                    case 14:
                        if (Build.VERSION.SDK_INT >= 32) {
                        }
                        break;
                }
        }
        return 0;
    }

    public static int u(int i3) {
        if (i3 != 2) {
            if (i3 == 3) {
                return 1;
            }
            if (i3 != 4) {
                if (i3 != 21) {
                    if (i3 != 22) {
                        if (i3 != 268435456) {
                            if (i3 != 1342177280) {
                                if (i3 != 1610612736) {
                                    if (i3 == 1879048192) {
                                        return 8;
                                    }
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int v(int i3, String str) {
        int i10 = 0;
        for (String str2 : d0(str)) {
            if (i3 == u0.h(u0.d(str2))) {
                i10++;
            }
        }
        return i10;
    }

    public static String w(int i3, String str) {
        String[] d02 = d0(str);
        if (d02.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : d02) {
            if (i3 == u0.h(u0.d(str2))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d2.n x(String str, String str2, String str3) {
        int i3;
        int i10;
        int i11;
        int i12;
        if (str == null || !u0.j(str, str2)) {
            return null;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
            i3 = 1;
        } else {
            if (str3 != null) {
                i3 = 2;
                if (!str3.equals("db1p")) {
                    if (str3.startsWith("db4")) {
                        i10 = 7;
                        i11 = 2;
                        i12 = 6;
                        if (i12 == -1) {
                            return null;
                        }
                        return new d2.n(i12, i11, i10, null, -1, -1);
                    }
                }
            }
            i12 = -1;
            i11 = -1;
            i10 = -1;
            if (i12 == -1) {
            }
        }
        i11 = i3;
        i12 = 6;
        i10 = 6;
        if (i12 == -1) {
        }
    }

    public static Point y(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && P(context)) {
            String H = Build.VERSION.SDK_INT < 28 ? H("sys.display-size") : H("vendor.display-size");
            if (!TextUtils.isEmpty(H)) {
                try {
                    String[] split = H.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                a.c("Util", "Invalid display size: " + H);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static int z(int i3) {
        if (i3 == 2 || i3 == 4) {
            return 6005;
        }
        if (i3 == 10) {
            return 6004;
        }
        if (i3 == 7) {
            return 6005;
        }
        if (i3 == 8) {
            return 6003;
        }
        switch (i3) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i3) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }
}
