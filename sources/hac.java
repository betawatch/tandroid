// default package

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
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class hac {
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
        l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, nm7.w1, nm7.D1, nm7.J1, 121, nm7.s1, nm7.r1, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, nm7.A3, nm7.G3, nm7.M3, nm7.I3, nm7.a4, nm7.Z3, nm7.Q3, nm7.T3, nm7.s3, nm7.z3, nm7.q3, nm7.m3, nm7.Z2, nm7.Y2, nm7.f3, nm7.i3, nm7.Z1, nm7.g2, nm7.n2, nm7.i2, nm7.V1, nm7.U1, nm7.N1, nm7.Q1, nm7.x2, nm7.E2, nm7.v2, nm7.q2, nm7.J2, nm7.I2, nm7.P2, nm7.S2, nm7.c3, nm7.V2, nm7.e3, nm7.j3, nm7.v3, nm7.w3, nm7.p3, nm7.n3, nm7.d4, nm7.W3, nm7.P3, nm7.U3, nm7.D3, nm7.E3, 237, nm7.J3, nm7.M2, nm7.F2, nm7.O2, nm7.T2, nm7.A2, nm7.B2, nm7.u2, nm7.r2, nm7.Y1, nm7.R1, nm7.M1, 134, nm7.c2, nm7.d2, nm7.m2, nm7.j2, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, nm7.v1, nm7.o1, 97, nm7.m1, nm7.z1, nm7.A1, nm7.I1, nm7.F1, nm7.S1, nm7.X1, 135, 128, nm7.e2, nm7.b2, nm7.k2, nm7.l2, nm7.G2, nm7.L2, nm7.U2, nm7.N2, nm7.C2, nm7.z2, nm7.s2, nm7.t2, nm7.X3, nm7.c4, nm7.V3, nm7.O3, nm7.F3, nm7.C3, 235, nm7.L3, nm7.W2, nm7.b3, nm7.k3, nm7.d3, nm7.x3, nm7.u3, 211, nm7.o3, nm7.p1, nm7.u1, nm7.n1, 96, nm7.B1, nm7.y1, nm7.G1, nm7.H1, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, nm7.C1, nm7.x1, nm7.E1, nm7.K1, nm7.q1, nm7.t1, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, nm7.D2, nm7.y2, nm7.p2, nm7.w2, nm7.H2, nm7.K2, nm7.R2, nm7.Q2, nm7.f2, nm7.a2, nm7.h2, nm7.o2, nm7.T1, nm7.W1, nm7.P1, nm7.O1, nm7.y3, nm7.t3, nm7.l3, nm7.r3, nm7.X2, nm7.a3, nm7.h3, 203, 230, nm7.B3, nm7.H3, nm7.N3, nm7.Y3, nm7.b4, nm7.S3, nm7.R3};
    }

    public static int A(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return 6003;
        }
        switch (i2) {
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
                switch (i2) {
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

    public static int B(String str) {
        String[] split;
        int length;
        int i2 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            i2 = Integer.parseInt(str2);
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    public static int C(int i2, ByteOrder byteOrder) {
        if (i2 == 32) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 4 : 1895825408;
        }
        if (i2 != 64) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 1879048192 : 1912602624;
    }

    public static long D(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * f2);
    }

    public static long E(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j2;
    }

    public static int F(int i2, ByteOrder byteOrder) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                return 2;
            }
            return TLObject.FLAG_28;
        }
        if (i2 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i2 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static go4 G(int i2, int i3, int i4) {
        fo4 fo4Var = new fo4();
        fo4Var.s = wf7.n("audio/raw");
        fo4Var.M = i3;
        fo4Var.O = i4;
        fo4Var.P = i2;
        return new go4(fo4Var);
    }

    public static long H(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / f2);
    }

    public static String[] I() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i2 = 0; i2 < split.length; i2++) {
            split[i2] = U(split[i2]);
        }
        return split;
    }

    public static String J(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            ncd.d("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String K(int i2) {
        switch (i2) {
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
                return i2 >= 10000 ? td4.o(i2, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean L(re8 re8Var) {
        boolean z = false;
        if (re8Var == null) {
            return false;
        }
        int h2 = re8Var.h();
        if (h2 != 1 || !re8Var.m0(2)) {
            if (h2 == 4 && re8Var.m0(4)) {
                re8Var.E();
            }
            if (re8Var.m0(1)) {
                return z;
            }
            re8Var.j();
            return true;
        }
        re8Var.a();
        z = true;
        if (re8Var.m0(1)) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int M(Uri uri, String str) {
        int i2;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme == null || (!vod.a("rtsp", scheme) && !vod.a("rtspt", scheme))) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (lastIndexOf >= 0) {
                        String c2 = vod.c(lastPathSegment.substring(lastIndexOf + 1));
                        c2.getClass();
                        switch (c2) {
                            case "ism":
                            case "isml":
                                i2 = 1;
                                break;
                            case "mpd":
                                i2 = 0;
                                break;
                            case "m3u8":
                                i2 = 2;
                                break;
                            default:
                                i2 = 4;
                                break;
                        }
                        if (i2 != 4) {
                            return i2;
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
            	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
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
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            */
        /*
            r0 = -1
            r1 = 3
            r2 = 4
            r3 = 1
            r4 = 2
            r5 = 0
            if (r8 != 0) goto L9e
            java.lang.String r8 = r7.getScheme()
            if (r8 == 0) goto L1e
            java.lang.String r6 = "rtsp"
            boolean r6 = vod.a(r6, r8)
            if (r6 != 0) goto Ld1
            java.lang.String r6 = "rtspt"
            boolean r8 = vod.a(r6, r8)
            if (r8 != 0) goto Ld1
        L1e:
            java.lang.String r8 = r7.getLastPathSegment()
            if (r8 == 0) goto Ld0
            r6 = 46
            int r6 = r8.lastIndexOf(r6)
            if (r6 < 0) goto L74
            int r6 = r6 + r3
            java.lang.String r8 = r8.substring(r6)
            java.lang.String r8 = vod.c(r8)
            r8.getClass()
            int r6 = r8.hashCode()
            switch(r6) {
                case 104579: goto L5e;
                case 108321: goto L54;
                case 3242057: goto L4a;
                case 3299913: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L67
        L40:
            java.lang.String r6 = "m3u8"
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L67
            r0 = r1
            goto L67
        L4a:
            java.lang.String r1 = "isml"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L67
            r0 = r4
            goto L67
        L54:
            java.lang.String r1 = "mpd"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L67
            r0 = r3
            goto L67
        L5e:
            java.lang.String r1 = "ism"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L67
            r0 = r5
        L67:
            switch(r0) {
                case 0: goto L70;
                case 1: goto L6e;
                case 2: goto L70;
                case 3: goto L6c;
                default: goto L6a;
            }
        L6a:
            r8 = r2
            goto L71
        L6c:
            r8 = r4
            goto L71
        L6e:
            r8 = r5
            goto L71
        L70:
            r8 = r3
        L71:
            if (r8 == r2) goto L74
            return r8
        L74:
            java.lang.String r7 = r7.getPath()
            r7.getClass()
            java.util.regex.Pattern r8 = hac.f
            java.util.regex.Matcher r7 = r8.matcher(r7)
            boolean r8 = r7.matches()
            if (r8 == 0) goto Ld0
            java.lang.String r7 = r7.group(r4)
            if (r7 == 0) goto Ld3
            java.lang.String r8 = "format=mpd-time-csf"
            boolean r8 = r7.contains(r8)
            if (r8 != 0) goto Ld2
            java.lang.String r8 = "format=m3u8-aapl"
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto Ld3
            goto Ld4
        L9e:
            int r7 = r8.hashCode()
            switch(r7) {
                case -979127466: goto Lc4;
                case -156749520: goto Lba;
                case 64194685: goto Lb0;
                case 1154777587: goto La6;
                default: goto La5;
            }
        La5:
            goto Lcd
        La6:
            java.lang.String r7 = "application/x-rtsp"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto Lcd
            r0 = r1
            goto Lcd
        Lb0:
            java.lang.String r7 = "application/dash+xml"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto Lcd
            r0 = r4
            goto Lcd
        Lba:
            java.lang.String r7 = "application/vnd.ms-sstr+xml"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto Lcd
            r0 = r3
            goto Lcd
        Lc4:
            java.lang.String r7 = "application/x-mpegURL"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto Lcd
            r0 = r5
        Lcd:
            switch(r0) {
                case 0: goto Ld4;
                case 1: goto Ld3;
                case 2: goto Ld2;
                case 3: goto Ld1;
                default: goto Ld0;
            }
        Ld0:
            return r2
        Ld1:
            return r1
        Ld2:
            return r5
        Ld3:
            return r3
        Ld4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hac.M(android.net.Uri, java.lang.String):int");
    }

    public static boolean N(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4 || i2 == 1895825408 || i2 == 1879048192 || i2 == 1912602624;
    }

    public static boolean O(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i2 == 30) {
            String str = Build.MODEL;
            if (vod.a(str, "moto g(20)") || vod.a(str, "rmx3231")) {
                return true;
            }
        }
        return i2 == 34 && vod.a(Build.MODEL, "sm-x200");
    }

    public static boolean P(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean Q(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean R(yw7 yw7Var, yw7 yw7Var2, Inflater inflater) {
        if (yw7Var.a() > 0 && yw7Var.j() == 120 && yw7Var.a() != 0) {
            if (yw7Var2.a.length < yw7Var.a()) {
                yw7Var2.c(yw7Var.a() << 1);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(yw7Var.a, yw7Var.b, yw7Var.a());
            int i2 = 0;
            while (true) {
                try {
                    byte[] bArr = yw7Var2.a;
                    i2 += inflater.inflate(bArr, i2, bArr.length - i2);
                    if (!inflater.finished()) {
                        if (inflater.needsDictionary() || inflater.needsInput()) {
                            break;
                        }
                        byte[] bArr2 = yw7Var2.a;
                        if (i2 == bArr2.length) {
                            yw7Var2.c(bArr2.length << 1);
                        }
                    } else {
                        yw7Var2.M(i2);
                        inflater.reset();
                        return true;
                    }
                } catch (DataFormatException unused) {
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            }
            inflater.reset();
        }
        return false;
    }

    public static void S(int i2, int i3, int i4, ArrayList arrayList) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i5 = (i3 - i2) - 1; i5 >= 0; i5--) {
            arrayDeque.addFirst(arrayList.remove(i2 + i5));
        }
        arrayList.addAll(Math.min(i4, arrayList.size()), arrayDeque);
    }

    public static long T(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static String U(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String c2 = vod.c(str);
        int i2 = 0;
        String str2 = c2.split("-", 2)[0];
        HashMap hashMap = g;
        if (hashMap == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = h;
            HashMap hashMap2 = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap2.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                hashMap2.put(strArr[i3], strArr[i3 + 1]);
            }
            g = hashMap2;
            hashMap = hashMap2;
        }
        String str4 = (String) hashMap.get(str2);
        if (str4 != null) {
            c2 = str4.concat(c2.substring(str2.length()));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return c2;
        }
        while (true) {
            String[] strArr2 = i;
            if (i2 >= strArr2.length) {
                return c2;
            }
            if (c2.startsWith(strArr2[i2])) {
                return strArr2[i2 + 1] + c2.substring(strArr2[i2].length());
            }
            i2 += 2;
        }
    }

    public static Object[] V(int i2, Object[] objArr) {
        jte.f(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    public static long W(String str) {
        Matcher matcher = d.matcher(str);
        if (!matcher.matches()) {
            throw bx7.a("Invalid date/time format: " + str, null);
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            int parseInt = Integer.parseInt(matcher.group(12)) * 60;
            String group = matcher.group(13);
            i2 = group != null ? Integer.parseInt(group) + parseInt : parseInt;
            if ("-".equals(matcher.group(11))) {
                i2 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - (i2 * 60000) : timeInMillis;
    }

    public static void X(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void Y(int i2, int i3, ArrayList arrayList) {
        if (i2 < 0 || i3 > arrayList.size() || i2 > i3) {
            i98.g();
        } else if (i2 != i3) {
            arrayList.subList(i2, i3).clear();
        }
    }

    public static long Z(int i2, long j2) {
        return b0(j2, 1000000L, i2, RoundingMode.DOWN);
    }

    public static long a(long j2, long j3) {
        long j4 = j2 + j3;
        long j5 = (((j3 ^ j2) > 0L ? 1 : ((j3 ^ j2) == 0L ? 0 : -1)) < 0) | ((j2 ^ j4) >= 0) ? j4 : ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j5 != Long.MIN_VALUE || j4 == Long.MIN_VALUE) && (j5 != Long.MAX_VALUE || j4 == Long.MAX_VALUE)) {
            return j5;
        }
        return Long.MAX_VALUE;
    }

    public static void a0(long[] jArr, long j2) {
        long j3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i2 = 0;
        if (j2 >= 1000000) {
            if (j2 % 1000000 == 0) {
                long b2 = bqe.b(j2, 1000000L, RoundingMode.UNNECESSARY);
                while (i2 < jArr.length) {
                    jArr[i2] = bqe.b(jArr[i2], b2, roundingMode);
                    i2++;
                }
                return;
            }
        } else if (1000000 % j2 == 0) {
            long b3 = bqe.b(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = bqe.d(jArr[i2], b3);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j4 = jArr[i3];
            if (j4 != 0) {
                if (j2 >= j4) {
                    if (j2 % j4 == 0) {
                        jArr[i3] = bqe.b(1000000L, bqe.b(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                    }
                    j3 = j2;
                    jArr[i3] = c0(j4, 1000000L, j3, roundingMode);
                } else {
                    if (j4 % j2 == 0) {
                        jArr[i3] = bqe.d(1000000L, bqe.b(j4, j2, RoundingMode.UNNECESSARY));
                    }
                    j3 = j2;
                    jArr[i3] = c0(j4, 1000000L, j3, roundingMode);
                }
                i3++;
                j2 = j3;
            }
            j3 = j2;
            i3++;
            j2 = j3;
        }
    }

    public static int b(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i2 = binarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j2) {
                break;
            }
            binarySearch = i2;
        }
        return z ? binarySearch : i2;
    }

    public static long b0(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        if (j4 >= j3) {
            if (j4 % j3 == 0) {
                return bqe.b(j2, bqe.b(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
            }
        } else if (j3 % j4 == 0) {
            return bqe.d(j2, bqe.b(j3, j4, RoundingMode.UNNECESSARY));
        }
        if (j4 >= j2) {
            if (j4 % j2 == 0) {
                return bqe.b(j3, bqe.b(j4, j2, RoundingMode.UNNECESSARY), roundingMode);
            }
        } else if (j2 % j4 == 0) {
            return bqe.d(j3, bqe.b(j2, j4, RoundingMode.UNNECESSARY));
        }
        return c0(j2, j3, j4, roundingMode);
    }

    public static int c(de deVar, long j2) {
        int i2 = deVar.b - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (deVar.g0(i4) < j2) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        int i5 = i2 + 1;
        if (i5 < deVar.b && deVar.g0(i5) == j2) {
            return i5;
        }
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long c0(long j2, long j3, long j4, RoundingMode roundingMode) {
        double d2;
        long j5;
        long d3 = bqe.d(j2, j3);
        if (d3 != Long.MAX_VALUE && d3 != Long.MIN_VALUE) {
            return bqe.b(d3, j4, roundingMode);
        }
        long c2 = bqe.c(Math.abs(j3), Math.abs(j4));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long b2 = bqe.b(j3, c2, roundingMode2);
        long b3 = bqe.b(j4, c2, roundingMode2);
        long c3 = bqe.c(Math.abs(j2), Math.abs(b3));
        long b4 = bqe.b(j2, c3, roundingMode2);
        long b5 = bqe.b(b3, c3, roundingMode2);
        long d4 = bqe.d(b4, b2);
        if (d4 != Long.MAX_VALUE && d4 != Long.MIN_VALUE) {
            return bqe.b(d4, b5, roundingMode);
        }
        double d5 = b4 * (b2 / b5);
        if (d5 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d5 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        if (!rge.b(d5)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (nq3.a[roundingMode.ordinal()]) {
            case 1:
                lqe.b(mge.a(d5));
                d2 = d5;
                if (!((-9.223372036854776E18d) - d2 >= 1.0d) || !(d2 < 9.223372036854776E18d)) {
                    return (long) d2;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d5 + " and rounding mode " + roundingMode);
            case 2:
                if (d5 < 0.0d && !mge.a(d5)) {
                    j5 = ((long) d5) - 1;
                    d2 = j5;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d5;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d5 > 0.0d && !mge.a(d5)) {
                    j5 = ((long) d5) + 1;
                    d2 = j5;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d5;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d2 = d5;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!mge.a(d5)) {
                    d2 = ((long) d5) + (d5 > 0.0d ? 1 : -1);
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d5;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                d2 = Math.rint(d5);
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                d2 = Math.rint(d5);
                if (Math.abs(d5 - d2) == 0.5d) {
                    d2 = Math.copySign(0.5d, d5) + d5;
                }
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                d2 = Math.rint(d5);
                break;
            default:
                zo4.f();
                return 0L;
        }
    }

    public static int d(mo5 mo5Var, Long l2, boolean z) {
        int i2;
        int binarySearch = Collections.binarySearch(mo5Var, l2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || ((Comparable) mo5Var.get(i3)).compareTo(l2) != 0) {
                    break;
                }
                binarySearch = i3;
            }
            i2 = binarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static boolean d0(re8 re8Var, boolean z) {
        return re8Var == null || !re8Var.s() || re8Var.h() == 1 || re8Var.h() == 4 || !(!z || re8Var.v0() == 0 || re8Var.v0() == 4);
    }

    public static int e(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                i3 = binarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                binarySearch = i3;
            }
            i4 = z ? binarySearch : i3;
        }
        return z2 ? Math.max(0, i4) : i4;
    }

    public static String[] e0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int f(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                binarySearch = i3;
            }
            i2 = binarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static String f0(int i2) {
        return new String(new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2}, StandardCharsets.US_ASCII);
    }

    public static int g(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static String g0(byte[] bArr) {
        boolean z;
        int length = bArr.length;
        tg0 tg0Var = vg0.d;
        vg0 vg0Var = tg0Var.c;
        if (vg0Var == null) {
            sg0 sg0Var = tg0Var.a;
            char[] cArr = sg0Var.b;
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                if (vod.b(cArr[i2])) {
                    int length3 = cArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length3) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 >= 'a' && c2 <= 'z') {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    jte.o("Cannot call lowerCase() on a mixed-case alphabet", !z);
                    char[] cArr2 = new char[cArr.length];
                    for (int i4 = 0; i4 < cArr.length; i4++) {
                        char c3 = cArr[i4];
                        if (vod.b(c3)) {
                            c3 = (char) (c3 ^ ' ');
                        }
                        cArr2[i4] = c3;
                    }
                    sg0 sg0Var2 = new sg0(b10.j(new StringBuilder(), sg0Var.a, ".lowerCase()"), cArr2);
                    if (sg0Var.h) {
                        byte[] bArr2 = sg0Var2.g;
                        if (!sg0Var2.h) {
                            byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
                            for (int i5 = 65; i5 <= 90; i5++) {
                                int i6 = i5 | 32;
                                byte b2 = bArr2[i5];
                                byte b3 = bArr2[i6];
                                if (b2 == -1) {
                                    copyOf[i5] = b3;
                                } else {
                                    char c4 = (char) i5;
                                    char c5 = (char) i6;
                                    if (!(b3 == -1)) {
                                        dq9.m(pwe.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                        return null;
                                    }
                                    copyOf[i6] = b2;
                                }
                            }
                            sg0Var = new sg0(b10.j(new StringBuilder(), sg0Var2.a, ".ignoreCase()"), sg0Var2.b, copyOf, true);
                        }
                    }
                    sg0Var = sg0Var2;
                } else {
                    i2++;
                }
            }
            vg0Var = sg0Var == tg0Var.a ? tg0Var : new tg0(sg0Var);
            tg0Var.c = vg0Var;
        }
        jte.n(0, length, bArr.length);
        sg0 sg0Var3 = vg0Var.a;
        int i7 = sg0Var3.e;
        int i8 = sg0Var3.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(ene.b(length, i8) * i7);
        try {
            vg0Var.b(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            bh7.j(e2);
            return null;
        }
    }

    public static float h(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static q9a h0(t76 t76Var, ny nyVar) {
        q9a q9aVar = new q9a();
        x4c x4cVar = new x4c(q9aVar, t76Var, (byte) 9);
        fp3 fp3Var = fp3.a;
        q9aVar.b(x4cVar, fp3Var);
        t76Var.b(new j2b(t76Var, q9aVar, nyVar, (byte) 26), fp3Var);
        return q9aVar;
    }

    public static int i(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long i0(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static long j(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static boolean k(SparseArray sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
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
        for (int i2 = 0; i2 < size; i2++) {
            if (!Objects.equals(sparseArray.valueAt(i2), sparseArray2.get(sparseArray.keyAt(i2)))) {
                return false;
            }
        }
        return true;
    }

    public static int n(SparseArray sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int i2 = 17;
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            i2 = Objects.hashCode(sparseArray.valueAt(i3)) + ((sparseArray.keyAt(i3) + (i2 * 31)) * 31);
        }
        return i2;
    }

    public static Bundle o(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ClassLoader classLoader = hac.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (RuntimeException e2) {
            ncd.d("Util", "Ignoring invalid bundle", e2);
            return null;
        }
    }

    public static int p(int i2, int i3, int i4, byte[] bArr) {
        while (i2 < i3) {
            i4 = j[((i4 >>> 24) ^ (bArr[i2] & 255)) & nm7.d4] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static Handler q(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, callback);
    }

    public static String r(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int s(int i2) {
        switch (i2) {
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
            case nm7.S /* 30 */:
            case 31:
                return 34;
        }
    }

    public static int t(int i2) {
        if (i2 == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i2 == 16) {
            return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
        }
        if (i2 == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i2) {
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
                switch (i2) {
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

    public static int u(int i2) {
        if (i2 != 2) {
            if (i2 == 3) {
                return 1;
            }
            if (i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    if (i2 == 1879048192) {
                                        return 8;
                                    }
                                    if (i2 != 1895825408) {
                                        if (i2 == 1912602624) {
                                            return 8;
                                        }
                                        i98.g();
                                        return 0;
                                    }
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

    public static int v(int i2, String str) {
        int i3 = 0;
        for (String str2 : e0(str)) {
            if (i2 == wf7.h(wf7.d(str2))) {
                i3++;
            }
        }
        return i3;
    }

    public static String w(int i2, String str) {
        String[] e0 = e0(str);
        if (e0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : e0) {
            if (i2 == wf7.h(wf7.d(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tm2 x(String str, String str2, String str3) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (str == null || !wf7.j(str, str2)) {
            return null;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
            i2 = 1;
        } else {
            if (str3 != null) {
                i2 = 2;
                if (!str3.equals("db1p")) {
                    if (str3.startsWith("db4")) {
                        i3 = 7;
                        i4 = 2;
                        i5 = 6;
                        if (i5 == -1) {
                            return null;
                        }
                        return new tm2(i5, i4, i3, null, -1, -1);
                    }
                }
            }
            i5 = -1;
            i4 = -1;
            i3 = -1;
            if (i5 == -1) {
            }
        }
        i4 = i2;
        i5 = 6;
        i3 = 6;
        if (i5 == -1) {
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
        if (display.getDisplayId() == 0 && Q(context)) {
            String J = Build.VERSION.SDK_INT < 28 ? J("sys.display-size") : J("vendor.display-size");
            if (!TextUtils.isEmpty(J)) {
                try {
                    String[] split = J.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                ncd.c("Util", "Invalid display size: " + J);
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

    public static Looper z() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }
}
