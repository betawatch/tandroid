package e2;

import a3.k0;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import b2.b1;
import b2.r0;
import b2.s0;
import bi.af;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.MediaStreamTrack;
import v7.o7;
import v7.q7;
import v7.r6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class d0 {
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
        d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, MessagesStorage.LAST_DB_VERSION, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, TLRPC.LAYER, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, 230, 225, 232, 239, MediaDataController.MAX_LINKS_COUNT, 253, 244, 243};
    }

    public static long A(long j3) {
        return j3 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j3;
    }

    public static int B(int i10, ByteOrder byteOrder) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                return 2;
            }
            return TLObject.FLAG_28;
        }
        if (i10 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i10 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static b2.s C(int i10, int i11, int i12) {
        b2.r rVar = new b2.r();
        rVar.q = r0.n("audio/raw");
        rVar.I = i11;
        rVar.J = i12;
        rVar.K = i10;
        return new b2.s(rVar);
    }

    public static long D(long j3, float f7) {
        return f7 == 1.0f ? j3 : Math.round(j3 / f7);
    }

    public static String[] E() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i10 = 0; i10 < split.length; i10++) {
            split[i10] = R(split[i10]);
        }
        return split;
    }

    public static String F(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e7) {
            a.f("Util", "Failed to read system property ".concat(str), e7);
            return null;
        }
    }

    public static String G(int i10) {
        switch (i10) {
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
                return i10 >= 10000 ? hc.b.k(i10, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean H(b1 b1Var) {
        boolean z10 = false;
        if (b1Var == null) {
            return false;
        }
        int d10 = b1Var.d();
        if (d10 != 1 || !b1Var.m0(2)) {
            if (d10 == 4 && b1Var.m0(4)) {
                b1Var.H();
            }
            if (b1Var.m0(1)) {
                return z10;
            }
            b1Var.i();
            return true;
        }
        b1Var.b();
        z10 = true;
        if (b1Var.m0(1)) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int I(Uri uri, String str) {
        int i10;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme == null || (!r6.a("rtsp", scheme) && !r6.a("rtspt", scheme))) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (lastIndexOf >= 0) {
                        String b10 = r6.b(lastPathSegment.substring(lastIndexOf + 1));
                        b10.getClass();
                        switch (b10) {
                            case "ism":
                            case "isml":
                                i10 = 1;
                                break;
                            case "mpd":
                                i10 = 0;
                                break;
                            case "m3u8":
                                i10 = 2;
                                break;
                            default:
                                i10 = 4;
                                break;
                        }
                        if (i10 != 4) {
                            return i10;
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
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.d0.I(android.net.Uri, java.lang.String):int");
    }

    public static void J(int i10) {
        Integer.toString(i10, 36);
    }

    public static boolean K(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static boolean L(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i10 == 30) {
            String str = Build.MODEL;
            if (r6.a(str, "moto g(20)") || r6.a(str, "rmx3231")) {
                return true;
            }
        }
        return i10 == 34 && r6.a(Build.MODEL, "sm-x200");
    }

    public static boolean M(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static boolean N(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean O(v vVar, v vVar2, Inflater inflater) {
        if (vVar.a() > 0 && (vVar.a[vVar.b] & 255) == 120 && vVar.a() != 0) {
            if (vVar2.a.length < vVar.a()) {
                vVar2.c(vVar.a() * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(vVar.a, vVar.b, vVar.a());
            int i10 = 0;
            while (true) {
                try {
                    byte[] bArr = vVar2.a;
                    i10 += inflater.inflate(bArr, i10, bArr.length - i10);
                    if (!inflater.finished()) {
                        if (inflater.needsDictionary() || inflater.needsInput()) {
                            break;
                        }
                        byte[] bArr2 = vVar2.a;
                        if (i10 == bArr2.length) {
                            vVar2.c(bArr2.length * 2);
                        }
                    } else {
                        vVar2.I(i10);
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

    public static void P(int i10, int i11, int i12, ArrayList arrayList) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(arrayList.remove(i10 + i13));
        }
        arrayList.addAll(Math.min(i12, arrayList.size()), arrayDeque);
    }

    public static long Q(long j3) {
        return (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? j3 : j3 * 1000;
    }

    public static String R(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(TranslateController.UNKNOWN_LANGUAGE)) {
            str = replace;
        }
        String b10 = r6.b(str);
        int i10 = 0;
        String str2 = b10.split("-", 2)[0];
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
            for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                hashMap.put(strArr[i11], strArr[i11 + 1]);
            }
            g = hashMap;
        }
        String str4 = (String) g.get(str2);
        if (str4 != null) {
            StringBuilder u10 = a4.a.u(str4);
            u10.append(b10.substring(str2.length()));
            b10 = u10.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return b10;
        }
        while (true) {
            String[] strArr2 = i;
            if (i10 >= strArr2.length) {
                return b10;
            }
            if (b10.startsWith(strArr2[i10])) {
                return strArr2[i10 + 1] + b10.substring(strArr2[i10].length());
            }
            i10 += 2;
        }
    }

    public static Object[] S(int i10, Object[] objArr) {
        d.b(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    public static long T(String str) {
        Matcher matcher = d.matcher(str);
        if (!matcher.matches()) {
            throw s0.a(null, "Invalid date/time format: " + str);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i10 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i10 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - (i10 * 60000) : timeInMillis;
    }

    public static void U(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void V(int i10, int i11, ArrayList arrayList) {
        if (i10 < 0 || i11 > arrayList.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            arrayList.subList(i10, i11).clear();
        }
    }

    public static long W(int i10, long j3) {
        return Y(j3, 1000000L, i10, RoundingMode.DOWN);
    }

    public static void X(long[] jArr, long j3) {
        long j10;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i10 = 0;
        if (j3 >= 1000000 && j3 % 1000000 == 0) {
            long b10 = q7.b(j3, 1000000L, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = q7.b(jArr[i10], b10, roundingMode);
                i10++;
            }
            return;
        }
        if (j3 < 1000000 && 1000000 % j3 == 0) {
            long b11 = q7.b(1000000L, j3, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = q7.d(jArr[i10], b11);
                i10++;
            }
            return;
        }
        int i11 = 0;
        while (i11 < jArr.length) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                if (j3 >= j11 && j3 % j11 == 0) {
                    jArr[i11] = q7.b(1000000L, q7.b(j3, j11, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j3 >= j11 || j11 % j3 != 0) {
                    j10 = j3;
                    jArr[i11] = Z(j11, 1000000L, j10, roundingMode);
                    i11++;
                    j3 = j10;
                } else {
                    jArr[i11] = q7.d(1000000L, q7.b(j11, j3, RoundingMode.UNNECESSARY));
                }
            }
            j10 = j3;
            i11++;
            j3 = j10;
        }
    }

    public static long Y(long j3, long j10, long j11, RoundingMode roundingMode) {
        if (j3 == 0 || j10 == 0) {
            return 0L;
        }
        return (j11 < j10 || j11 % j10 != 0) ? (j11 >= j10 || j10 % j11 != 0) ? (j11 < j3 || j11 % j3 != 0) ? (j11 >= j3 || j3 % j11 != 0) ? Z(j3, j10, j11, roundingMode) : q7.d(j10, q7.b(j3, j11, RoundingMode.UNNECESSARY)) : q7.b(j10, q7.b(j11, j3, RoundingMode.UNNECESSARY), roundingMode) : q7.d(j3, q7.b(j10, j11, RoundingMode.UNNECESSARY)) : q7.b(j3, q7.b(j11, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
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
    public static long Z(long j3, long j10, long j11, RoundingMode roundingMode) {
        double d10;
        long j12;
        long d11 = q7.d(j3, j10);
        if (d11 != Long.MAX_VALUE && d11 != Long.MIN_VALUE) {
            return q7.b(d11, j11, roundingMode);
        }
        long c10 = q7.c(Math.abs(j10), Math.abs(j11));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long b10 = q7.b(j10, c10, roundingMode2);
        long b11 = q7.b(j11, c10, roundingMode2);
        long c11 = q7.c(Math.abs(j3), Math.abs(b11));
        long b12 = q7.b(j3, c11, roundingMode2);
        long b13 = q7.b(b11, c11, roundingMode2);
        long d12 = q7.d(b12, b10);
        if (d12 != Long.MAX_VALUE && d12 != Long.MIN_VALUE) {
            return q7.b(d12, b13, roundingMode);
        }
        double d13 = b12 * (b10 / b13);
        if (d13 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d13 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i10 = g9.c.a;
        if (!o7.b(d13)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (g9.b.a[roundingMode.ordinal()]) {
            case 1:
                if (!g9.c.a(d13)) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                d10 = d13;
                if (!((-9.223372036854776E18d) - d10 >= 1.0d) || !(d10 < 9.223372036854776E18d)) {
                    return (long) d10;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d13 + " and rounding mode " + roundingMode);
            case 2:
                if (d13 < 0.0d && !g9.c.a(d13)) {
                    j12 = ((long) d13) - 1;
                    d10 = j12;
                    if (!(((-9.223372036854776E18d) - d10 >= 1.0d) & (d10 < 9.223372036854776E18d))) {
                    }
                }
                d10 = d13;
                if (!(((-9.223372036854776E18d) - d10 >= 1.0d) & (d10 < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d13 > 0.0d && !g9.c.a(d13)) {
                    j12 = ((long) d13) + 1;
                    d10 = j12;
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
                if (!g9.c.a(d13)) {
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

    public static int a(long[] jArr, long j3, boolean z10) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i10 = binarySearch + 1;
            if (i10 >= jArr.length || jArr[i10] != j3) {
                break;
            }
            binarySearch = i10;
        }
        return z10 ? binarySearch : i10;
    }

    public static boolean a0(b1 b1Var, boolean z10) {
        return b1Var == null || !b1Var.u() || b1Var.d() == 1 || b1Var.d() == 4 || !(!z10 || b1Var.u0() == 0 || b1Var.u0() == 4);
    }

    public static int b(c5.b0 b0Var, long j3) {
        int i10 = b0Var.b - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            if (b0Var.f(i12) < j3) {
                i11 = i12 + 1;
            } else {
                i10 = i12 - 1;
            }
        }
        int i13 = i10 + 1;
        if (i13 < b0Var.b && b0Var.f(i13) == j3) {
            return i13;
        }
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public static String[] b0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int c(List list, Long l4, boolean z10) {
        int i10;
        int binarySearch = Collections.binarySearch(list, l4);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            while (true) {
                int i11 = binarySearch - 1;
                if (i11 < 0 || ((Comparable) list.get(i11)).compareTo(l4) != 0) {
                    break;
                }
                binarySearch = i11;
            }
            i10 = binarySearch;
        }
        return z10 ? Math.max(0, i10) : i10;
    }

    public static String c0(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return sb2.toString();
    }

    public static int d(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int binarySearch = Arrays.binarySearch(iArr, i10);
        if (binarySearch < 0) {
            i12 = -(binarySearch + 2);
        } else {
            while (true) {
                i11 = binarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                binarySearch = i11;
            }
            i12 = z10 ? binarySearch : i11;
        }
        return z11 ? Math.max(0, i12) : i12;
    }

    public static i9.c0 d0(i9.w wVar, i9.p pVar) {
        i9.c0 c0Var = new i9.c0();
        af afVar = new af(23, c0Var, wVar);
        i9.q qVar = i9.q.a;
        c0Var.a(afVar, qVar);
        wVar.a(new k0(wVar, c0Var, pVar, 19), qVar);
        return c0Var;
    }

    public static int e(long[] jArr, long j3, boolean z10) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            while (true) {
                int i11 = binarySearch - 1;
                if (i11 < 0 || jArr[i11] != j3) {
                    break;
                }
                binarySearch = i11;
            }
            i10 = binarySearch;
        }
        return z10 ? Math.max(0, i10) : i10;
    }

    public static long e0(long j3) {
        return (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? j3 : j3 / 1000;
    }

    public static int f(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static float g(float f7, float f10, float f11) {
        return Math.max(f10, Math.min(f7, f11));
    }

    public static int h(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static long i(long j3, long j10, long j11) {
        return Math.max(j10, Math.min(j3, j11));
    }

    public static boolean j(SparseArray sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static boolean k(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(SparseArray sparseArray, SparseArray sparseArray2) {
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
        for (int i10 = 0; i10 < size; i10++) {
            if (!Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                return false;
            }
        }
        return true;
    }

    public static int m(SparseArray sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int i10 = 17;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            i10 = Objects.hashCode(sparseArray.valueAt(i11)) + ((sparseArray.keyAt(i11) + (i10 * 31)) * 31);
        }
        return i10;
    }

    public static int n(int i10, int i11, int i12, byte[] bArr) {
        while (i10 < i11) {
            i12 = j[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static Handler o(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        d.h(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String p(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int q(int i10) {
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
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
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i10) {
                            case 20:
                                return 30;
                            case 21:
                            case 22:
                                return 31;
                            default:
                                return ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                }
        }
    }

    public static AudioFormat r(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static int s(int i10) {
        if (i10 == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i10 == 12) {
            return 743676;
        }
        if (i10 == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static int t(int i10) {
        if (i10 != 2) {
            if (i10 == 3) {
                return 1;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
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

    public static int u(int i10, String str) {
        int i11 = 0;
        for (String str2 : b0(str)) {
            if (i10 == r0.h(r0.d(str2))) {
                i11++;
            }
        }
        return i11;
    }

    public static String v(int i10, String str) {
        String[] b02 = b0(str);
        if (b02.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : b02) {
            if (i10 == r0.h(r0.d(str2))) {
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

    public static Point w(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && N(context)) {
            String F = Build.VERSION.SDK_INT < 28 ? F("sys.display-size") : F("vendor.display-size");
            if (!TextUtils.isEmpty(F)) {
                try {
                    String[] split = F.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                a.e("Util", "Invalid display size: " + F);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (Build.VERSION.SDK_INT < 23) {
            display.getRealSize(point);
            return point;
        }
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static int x(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
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
                switch (i10) {
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

    public static int y(String str) {
        String[] split;
        int length;
        int i10 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z10 = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            i10 = Integer.parseInt(str2);
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    public static long z(long j3, float f7) {
        return f7 == 1.0f ? j3 : Math.round(j3 * f7);
    }
}
