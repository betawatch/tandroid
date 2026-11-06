package h2;

import a8.ga;
import a8.ia;
import a8.ja;
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
import c8.q0;
import c8.r0;
import e2.c1;
import e2.s0;
import e2.t0;
import fi.x1;
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
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class m0 {
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
        l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, qs.x1, qs.E1, qs.K1, qs.F1, qs.t1, qs.s1, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, qs.B3, qs.H3, qs.N3, TLRPC.LAYER, qs.b4, qs.a4, qs.R3, qs.U3, qs.t3, qs.A3, qs.r3, qs.m3, qs.a3, qs.Z2, qs.g3, qs.j3, qs.a2, qs.h2, qs.o2, qs.j2, qs.W1, qs.V1, qs.O1, 133, qs.y2, qs.F2, qs.w2, qs.r2, qs.K2, qs.J2, qs.Q2, qs.T2, qs.d3, qs.W2, qs.f3, qs.k3, qs.w3, qs.x3, qs.q3, qs.n3, qs.e4, qs.X3, qs.Q3, qs.V3, 227, qs.E3, qs.M3, qs.J3, qs.N2, qs.G2, qs.P2, qs.U2, qs.B2, qs.C2, qs.v2, qs.s2, qs.Z1, qs.S1, qs.N1, 134, qs.d2, qs.e2, qs.n2, qs.k2, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, qs.w1, qs.p1, 97, qs.n1, qs.A1, qs.B1, qs.J1, qs.G1, qs.T1, qs.Y1, qs.R1, 128, qs.f2, qs.c2, qs.l2, qs.m2, qs.H2, qs.M2, qs.V2, qs.O2, qs.D2, qs.A2, qs.t2, qs.u2, qs.Y3, qs.d4, qs.W3, qs.P3, qs.F3, qs.D3, qs.K3, qs.L3, qs.X2, qs.c3, qs.l3, qs.e3, qs.y3, qs.v3, qs.o3, qs.p3, qs.q1, qs.v1, qs.o1, 96, qs.C1, qs.z1, qs.H1, qs.I1, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, qs.D1, qs.y1, 120, qs.L1, qs.r1, qs.u1, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, qs.E2, qs.z2, qs.q2, qs.x2, qs.I2, qs.L2, qs.S2, qs.R2, qs.g2, qs.b2, qs.i2, qs.p2, qs.U1, qs.X1, qs.Q1, qs.P1, qs.z3, qs.u3, 208, qs.s3, qs.Y2, qs.b3, qs.i3, 203, qs.G3, qs.C3, qs.I3, qs.O3, qs.Z3, qs.c4, qs.T3, qs.S3};
    }

    public static int A(String str) {
        String[] split;
        int length;
        int i7 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z9 = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            i7 = Integer.parseInt(str2);
            if (z9) {
                return -i7;
            }
        } catch (NumberFormatException unused) {
        }
        return i7;
    }

    public static long B(long j3, float f10) {
        return f10 == 1.0f ? j3 : Math.round(j3 * f10);
    }

    public static long C(long j3) {
        return j3 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j3;
    }

    public static int D(int i7, ByteOrder byteOrder) {
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                return 2;
            }
            return TLObject.FLAG_28;
        }
        if (i7 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i7 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static e2.u E(int i7, int i10, int i11) {
        e2.t tVar = new e2.t();
        tVar.r = s0.n("audio/raw");
        tVar.J = i10;
        tVar.K = i11;
        tVar.L = i7;
        return new e2.u(tVar);
    }

    public static long F(long j3, float f10) {
        return f10 == 1.0f ? j3 : Math.round(j3 / f10);
    }

    public static String[] G() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i7 = 0; i7 < split.length; i7++) {
            split[i7] = T(split[i7]);
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

    public static String I(int i7) {
        switch (i7) {
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
                return i7 >= 10000 ? jg.g.k(i7, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean J(c1 c1Var) {
        boolean z9 = false;
        if (c1Var == null) {
            return false;
        }
        int i7 = c1Var.i();
        if (i7 != 1 || !c1Var.p0(2)) {
            if (i7 == 4 && c1Var.p0(4)) {
                c1Var.G();
            }
            if (c1Var.p0(1)) {
                return z9;
            }
            c1Var.f();
            return true;
        }
        c1Var.a();
        z9 = true;
        if (c1Var.p0(1)) {
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
        int i7;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme == null || (!ga.a("rtsp", scheme) && !ga.a("rtspt", scheme))) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (lastIndexOf >= 0) {
                        String c10 = ga.c(lastPathSegment.substring(lastIndexOf + 1));
                        c10.getClass();
                        switch (c10) {
                            case "ism":
                            case "isml":
                                i7 = 1;
                                break;
                            case "mpd":
                                i7 = 0;
                                break;
                            case "m3u8":
                                i7 = 2;
                                break;
                            default:
                                i7 = 4;
                                break;
                        }
                        if (i7 != 4) {
                            return i7;
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
        throw new UnsupportedOperationException("Method not decompiled: h2.m0.K(android.net.Uri, java.lang.String):int");
    }

    public static boolean L(int i7) {
        return i7 == 21 || i7 == 1342177280 || i7 == 22 || i7 == 1610612736 || i7 == 4 || i7 == 1879048192;
    }

    public static boolean M(int i7) {
        return i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 21 || i7 == 1342177280 || i7 == 22 || i7 == 1610612736 || i7 == 4 || i7 == 1879048192;
    }

    public static boolean N(Context context) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i7 == 30) {
            String str = Build.MODEL;
            if (ga.a(str, "moto g(20)") || ga.a(str, "rmx3231")) {
                return true;
            }
        }
        return i7 == 34 && ga.a(Build.MODEL, "sm-x200");
    }

    public static boolean O(int i7) {
        return i7 == 10 || i7 == 13;
    }

    public static boolean P(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean Q(x xVar, x xVar2, Inflater inflater) {
        if (xVar.a() > 0 && xVar.j() == 120 && xVar.a() != 0) {
            if (xVar2.a.length < xVar.a()) {
                xVar2.c(xVar.a() * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(xVar.a, xVar.b, xVar.a());
            int i7 = 0;
            while (true) {
                try {
                    byte[] bArr = xVar2.a;
                    i7 += inflater.inflate(bArr, i7, bArr.length - i7);
                    if (!inflater.finished()) {
                        if (inflater.needsDictionary() || inflater.needsInput()) {
                            break;
                        }
                        byte[] bArr2 = xVar2.a;
                        if (i7 == bArr2.length) {
                            xVar2.c(bArr2.length * 2);
                        }
                    } else {
                        xVar2.M(i7);
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

    public static void R(int i7, int i10, int i11, ArrayList arrayList) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i12 = (i10 - i7) - 1; i12 >= 0; i12--) {
            arrayDeque.addFirst(arrayList.remove(i7 + i12));
        }
        arrayList.addAll(Math.min(i11, arrayList.size()), arrayDeque);
    }

    public static long S(long j3) {
        return (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? j3 : j3 * 1000;
    }

    public static String T(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String c10 = ga.c(str);
        int i7 = 0;
        String str2 = c10.split("-", 2)[0];
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
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str4);
            m10.append(c10.substring(str2.length()));
            c10 = m10.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return c10;
        }
        while (true) {
            String[] strArr2 = i;
            if (i7 >= strArr2.length) {
                return c10;
            }
            if (c10.startsWith(strArr2[i7])) {
                return strArr2[i7 + 1] + c10.substring(strArr2[i7].length());
            }
            i7 += 2;
        }
    }

    public static Object[] U(int i7, Object[] objArr) {
        ia.f(i7 <= objArr.length);
        return Arrays.copyOf(objArr, i7);
    }

    public static long V(String str) {
        Matcher matcher = d.matcher(str);
        if (!matcher.matches()) {
            throw t0.a(null, "Invalid date/time format: " + str);
        }
        int i7 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            int parseInt = Integer.parseInt(matcher.group(12)) * 60;
            String group = matcher.group(13);
            i7 = group != null ? Integer.parseInt(group) + parseInt : parseInt;
            if ("-".equals(matcher.group(11))) {
                i7 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i7 != 0 ? timeInMillis - (i7 * 60000) : timeInMillis;
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

    public static void X(int i7, int i10, ArrayList arrayList) {
        if (i7 < 0 || i10 > arrayList.size() || i7 > i10) {
            throw new IllegalArgumentException();
        }
        if (i7 != i10) {
            arrayList.subList(i7, i10).clear();
        }
    }

    public static long Y(int i7, long j3) {
        return a0(j3, 1000000L, i7, RoundingMode.DOWN);
    }

    public static void Z(long[] jArr, long j3) {
        long j10;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i7 = 0;
        if (j3 >= 1000000 && j3 % 1000000 == 0) {
            long b10 = c8.s0.b(j3, 1000000L, RoundingMode.UNNECESSARY);
            while (i7 < jArr.length) {
                jArr[i7] = c8.s0.b(jArr[i7], b10, roundingMode);
                i7++;
            }
            return;
        }
        if (j3 < 1000000 && 1000000 % j3 == 0) {
            long b11 = c8.s0.b(1000000L, j3, RoundingMode.UNNECESSARY);
            while (i7 < jArr.length) {
                jArr[i7] = c8.s0.d(jArr[i7], b11);
                i7++;
            }
            return;
        }
        int i10 = 0;
        while (i10 < jArr.length) {
            long j11 = jArr[i10];
            if (j11 != 0) {
                if (j3 >= j11 && j3 % j11 == 0) {
                    jArr[i10] = c8.s0.b(1000000L, c8.s0.b(j3, j11, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j3 >= j11 || j11 % j3 != 0) {
                    j10 = j3;
                    jArr[i10] = b0(j11, 1000000L, j10, roundingMode);
                    i10++;
                    j3 = j10;
                } else {
                    jArr[i10] = c8.s0.d(1000000L, c8.s0.b(j11, j3, RoundingMode.UNNECESSARY));
                }
            }
            j10 = j3;
            i10++;
            j3 = j10;
        }
    }

    public static long a(long j3, long j10) {
        long j11 = j3 + j10;
        long j12 = (((j10 ^ j3) > 0L ? 1 : ((j10 ^ j3) == 0L ? 0 : -1)) < 0) | ((j3 ^ j11) >= 0) ? j11 : ((j11 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j12 != Long.MIN_VALUE || j11 == Long.MIN_VALUE) && (j12 != Long.MAX_VALUE || j11 == Long.MAX_VALUE)) {
            return j12;
        }
        return Long.MAX_VALUE;
    }

    public static long a0(long j3, long j10, long j11, RoundingMode roundingMode) {
        if (j3 == 0 || j10 == 0) {
            return 0L;
        }
        return (j11 < j10 || j11 % j10 != 0) ? (j11 >= j10 || j10 % j11 != 0) ? (j11 < j3 || j11 % j3 != 0) ? (j11 >= j3 || j3 % j11 != 0) ? b0(j3, j10, j11, roundingMode) : c8.s0.d(j10, c8.s0.b(j3, j11, RoundingMode.UNNECESSARY)) : c8.s0.b(j10, c8.s0.b(j11, j3, RoundingMode.UNNECESSARY), roundingMode) : c8.s0.d(j3, c8.s0.b(j10, j11, RoundingMode.UNNECESSARY)) : c8.s0.b(j3, c8.s0.b(j11, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static int b(long[] jArr, long j3, boolean z9) {
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i7 = binarySearch + 1;
            if (i7 >= jArr.length || jArr[i7] != j3) {
                break;
            }
            binarySearch = i7;
        }
        return z9 ? binarySearch : i7;
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
    public static long b0(long j3, long j10, long j11, RoundingMode roundingMode) {
        double d2;
        long j12;
        long d10 = c8.s0.d(j3, j10);
        if (d10 != Long.MAX_VALUE && d10 != Long.MIN_VALUE) {
            return c8.s0.b(d10, j11, roundingMode);
        }
        long c10 = c8.s0.c(Math.abs(j10), Math.abs(j11));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long b10 = c8.s0.b(j10, c10, roundingMode2);
        long b11 = c8.s0.b(j11, c10, roundingMode2);
        long c11 = c8.s0.c(Math.abs(j3), Math.abs(b11));
        long b12 = c8.s0.b(j3, c11, roundingMode2);
        long b13 = c8.s0.b(b11, c11, roundingMode2);
        long d11 = c8.s0.d(b12, b10);
        if (d11 != Long.MAX_VALUE && d11 != Long.MIN_VALUE) {
            return c8.s0.b(d11, b13, roundingMode);
        }
        double d12 = b12 * (b10 / b13);
        if (d12 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d12 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i7 = j9.c.a;
        if (!q0.b(d12)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (j9.b.a[roundingMode.ordinal()]) {
            case 1:
                c8.t0.b(j9.c.a(d12));
                d2 = d12;
                if (!((-9.223372036854776E18d) - d2 >= 1.0d) || !(d2 < 9.223372036854776E18d)) {
                    return (long) d2;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d12 + " and rounding mode " + roundingMode);
            case 2:
                if (d12 < 0.0d && !j9.c.a(d12)) {
                    j12 = ((long) d12) - 1;
                    d2 = j12;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d12;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d12 > 0.0d && !j9.c.a(d12)) {
                    j12 = ((long) d12) + 1;
                    d2 = j12;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d12;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d2 = d12;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!j9.c.a(d12)) {
                    d2 = ((long) d12) + (d12 > 0.0d ? 1 : -1);
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d12;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                d2 = Math.rint(d12);
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                d2 = Math.rint(d12);
                if (Math.abs(d12 - d2) == 0.5d) {
                    d2 = Math.copySign(0.5d, d12) + d12;
                }
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                d2 = Math.rint(d12);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static int c(f5.u uVar, long j3) {
        int i7 = uVar.b - 1;
        int i10 = 0;
        while (i10 <= i7) {
            int i11 = (i10 + i7) >>> 1;
            if (uVar.j(i11) < j3) {
                i10 = i11 + 1;
            } else {
                i7 = i11 - 1;
            }
        }
        int i12 = i7 + 1;
        if (i12 < uVar.b && uVar.j(i12) == j3) {
            return i12;
        }
        if (i7 == -1) {
            return 0;
        }
        return i7;
    }

    public static boolean c0(c1 c1Var, boolean z9) {
        return c1Var == null || !c1Var.u() || c1Var.i() == 1 || c1Var.i() == 4 || !(!z9 || c1Var.w0() == 0 || c1Var.w0() == 4);
    }

    public static int d(List list, Long l10, boolean z9) {
        int i7;
        int binarySearch = Collections.binarySearch(list, l10);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            while (true) {
                int i10 = binarySearch - 1;
                if (i10 < 0 || ((Comparable) list.get(i10)).compareTo(l10) != 0) {
                    break;
                }
                binarySearch = i10;
            }
            i7 = binarySearch;
        }
        return z9 ? Math.max(0, i7) : i7;
    }

    public static String[] d0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int e(int[] iArr, int i7, boolean z9, boolean z10) {
        int i10;
        int i11;
        int binarySearch = Arrays.binarySearch(iArr, i7);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                i10 = binarySearch - 1;
                if (i10 < 0 || iArr[i10] != i7) {
                    break;
                }
                binarySearch = i10;
            }
            i11 = z9 ? binarySearch : i10;
        }
        return z10 ? Math.max(0, i11) : i11;
    }

    public static String e0(int i7) {
        return new String(new byte[]{(byte) (i7 >> 24), (byte) (i7 >> 16), (byte) (i7 >> 8), (byte) i7}, StandardCharsets.US_ASCII);
    }

    public static int f(long[] jArr, long j3, boolean z9) {
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            while (true) {
                int i10 = binarySearch - 1;
                if (i10 < 0 || jArr[i10] != j3) {
                    break;
                }
                binarySearch = i10;
            }
            i7 = binarySearch;
        }
        return z9 ? Math.max(0, i7) : i7;
    }

    public static String f0(byte[] bArr) {
        boolean z9;
        i9.b bVar = i9.d.d;
        i9.d dVar = bVar.c;
        if (dVar == null) {
            i9.a aVar = bVar.a;
            char[] cArr = aVar.b;
            int length = cArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (ga.b(cArr[i7])) {
                    int length2 = cArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length2) {
                            z9 = false;
                            break;
                        }
                        char c10 = cArr[i10];
                        if (c10 >= 'a' && c10 <= 'z') {
                            z9 = true;
                            break;
                        }
                        i10++;
                    }
                    ia.o("Cannot call lowerCase() on a mixed-case alphabet", !z9);
                    char[] cArr2 = new char[cArr.length];
                    for (int i11 = 0; i11 < cArr.length; i11++) {
                        char c11 = cArr[i11];
                        if (ga.b(c11)) {
                            c11 = (char) (c11 ^ ' ');
                        }
                        cArr2[i11] = c11;
                    }
                    i9.a aVar2 = new i9.a(a8.p0.s(new StringBuilder(), aVar.a, ".lowerCase()"), cArr2);
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
                                    char c12 = (char) i12;
                                    char c13 = (char) i13;
                                    if (!(b11 == -1)) {
                                        throw new IllegalStateException(ja.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c12), Character.valueOf(c13)));
                                    }
                                    copyOf[i13] = b10;
                                }
                            }
                            aVar = new i9.a(a8.p0.s(new StringBuilder(), aVar2.a, ".ignoreCase()"), aVar2.b, copyOf, true);
                        }
                    }
                    aVar = aVar2;
                } else {
                    i7++;
                }
            }
            dVar = aVar == bVar.a ? bVar : new i9.b(aVar);
            bVar.c = dVar;
        }
        int length3 = bArr.length;
        ia.n(0, length3, bArr.length);
        i9.a aVar3 = dVar.a;
        int i14 = aVar3.e;
        int i15 = aVar3.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(r0.b(length3, i15) * i14);
        try {
            dVar.b(sb2, bArr, length3);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public static int g(int i7, int i10) {
        return ((i7 + i10) - 1) / i10;
    }

    public static m9.e0 g0(m9.y yVar, m9.q qVar) {
        m9.e0 e0Var = new m9.e0();
        f2.h hVar = new f2.h(27, e0Var, yVar);
        m9.r rVar = m9.r.a;
        e0Var.b(hVar, rVar);
        yVar.b(new x1(yVar, e0Var, qVar, 9), rVar);
        return e0Var;
    }

    public static float h(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static long h0(long j3) {
        return (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? j3 : j3 / 1000;
    }

    public static int i(int i7, int i10, int i11) {
        return Math.max(i10, Math.min(i7, i11));
    }

    public static long j(long j3, long j10, long j11) {
        return Math.max(j10, Math.min(j3, j11));
    }

    public static boolean k(SparseArray sparseArray, int i7) {
        return sparseArray.indexOfKey(i7) >= 0;
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
        for (int i7 = 0; i7 < size; i7++) {
            if (!Objects.equals(sparseArray.valueAt(i7), sparseArray2.get(sparseArray.keyAt(i7)))) {
                return false;
            }
        }
        return true;
    }

    public static int n(SparseArray sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int i7 = 17;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            i7 = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (i7 * 31)) * 31);
        }
        return i7;
    }

    public static Bundle o(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ClassLoader classLoader = m0.class.getClassLoader();
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

    public static int p(int i7, int i10, int i11, byte[] bArr) {
        while (i7 < i10) {
            i11 = j[((i11 >>> 24) ^ (bArr[i7] & 255)) & qs.e4] ^ (i11 << 8);
            i7++;
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

    public static int s(int i7) {
        switch (i7) {
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
            case qs.T /* 30 */:
            case qs.U /* 31 */:
                return 34;
        }
    }

    public static int t(int i7) {
        if (i7 == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i7 == 16) {
            return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
        }
        if (i7 == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i7) {
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
                switch (i7) {
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

    public static int u(int i7) {
        if (i7 != 2) {
            if (i7 == 3) {
                return 1;
            }
            if (i7 != 4) {
                if (i7 != 21) {
                    if (i7 != 22) {
                        if (i7 != 268435456) {
                            if (i7 != 1342177280) {
                                if (i7 != 1610612736) {
                                    if (i7 == 1879048192) {
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

    public static int v(int i7, String str) {
        int i10 = 0;
        for (String str2 : d0(str)) {
            if (i7 == s0.h(s0.d(str2))) {
                i10++;
            }
        }
        return i10;
    }

    public static String w(int i7, String str) {
        String[] d02 = d0(str);
        if (d02.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : d02) {
            if (i7 == s0.h(s0.d(str2))) {
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
    public static e2.m x(String str, String str2, String str3) {
        int i7;
        int i10;
        int i11;
        int i12;
        if (str == null || !s0.j(str, str2)) {
            return null;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
            i7 = 1;
        } else {
            if (str3 != null) {
                i7 = 2;
                if (!str3.equals("db1p")) {
                    if (str3.startsWith("db4")) {
                        i10 = 7;
                        i11 = 2;
                        i12 = 6;
                        if (i12 == -1) {
                            return null;
                        }
                        return new e2.m(i12, i11, i10, null, -1, -1);
                    }
                }
            }
            i12 = -1;
            i11 = -1;
            i10 = -1;
            if (i12 == -1) {
            }
        }
        i11 = i7;
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

    public static int z(int i7) {
        if (i7 == 2 || i7 == 4) {
            return 6005;
        }
        if (i7 == 10) {
            return 6004;
        }
        if (i7 == 7) {
            return 6005;
        }
        if (i7 == 8) {
            return 6003;
        }
        switch (i7) {
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
                switch (i7) {
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
