package org.telegram.messenger;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import java.util.Calendar;
import java.util.HashMap;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class MrzRecognizer {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        boolean z9 = true;
        for (int i7 = 0; i7 < charArray.length; i7++) {
            if (z9 || !Character.isLetter(charArray[i7])) {
                z9 = charArray[i7] == ' ';
            } else {
                charArray[i7] = Character.toLowerCase(charArray[i7]);
            }
        }
        return new String(charArray);
    }

    public static int b(String str) {
        char[] charArray = str.toCharArray();
        int[] iArr = {7, 3, 1};
        int i7 = 0;
        for (int i10 = 0; i10 < charArray.length; i10++) {
            char c10 = charArray[i10];
            i7 += ((c10 < '0' || c10 > '9') ? (c10 < 'A' || c10 > 'Z') ? 0 : c10 - '7' : c10 - '0') * iArr[i10 % 3];
        }
        return i7 % 10;
    }

    private static native Rect[][] binarizeAndFindCharacters(Bitmap bitmap, Bitmap bitmap2);

    public static String c(String str) {
        String[] strArr = {"A", "B", "V", "G", "D", "E", "E", "ZH", "Z", "I", "I", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F", "KH", "TS", "CH", "SH", "SHCH", "IE", "Y", "", "E", "IU", "IA"};
        int i7 = 0;
        String str2 = str;
        while (i7 < 33) {
            int i10 = i7 + 1;
            str2 = str2.replace("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".substring(i7, i10), strArr[i7]);
            i7 = i10;
        }
        return str2;
    }

    public static HashMap d() {
        HashMap hashMap = new HashMap();
        hashMap.put("AFG", "AF");
        hashMap.put("ALA", "AX");
        hashMap.put("ALB", "AL");
        hashMap.put("DZA", "DZ");
        hashMap.put("ASM", "AS");
        hashMap.put("AND", "AD");
        hashMap.put("AGO", "AO");
        hashMap.put("AIA", "AI");
        hashMap.put("ATA", "AQ");
        hashMap.put("ATG", "AG");
        hashMap.put("ARG", "AR");
        hashMap.put("ARM", "AM");
        hashMap.put("ABW", "AW");
        hashMap.put("AUS", "AU");
        hashMap.put("AUT", "AT");
        hashMap.put("AZE", "AZ");
        hashMap.put("BHS", "BS");
        hashMap.put("BHR", "BH");
        hashMap.put("BGD", "BD");
        hashMap.put("BRB", "BB");
        hashMap.put("BLR", "BY");
        hashMap.put("BEL", "BE");
        hashMap.put("BLZ", "BZ");
        hashMap.put("BEN", "BJ");
        hashMap.put("BMU", "BM");
        hashMap.put("BTN", "BT");
        hashMap.put("BOL", "BO");
        hashMap.put("BES", "BQ");
        hashMap.put("BIH", "BA");
        hashMap.put("BWA", "BW");
        hashMap.put("BVT", "BV");
        hashMap.put("BRA", "BR");
        hashMap.put("IOT", "IO");
        hashMap.put("BRN", "BN");
        hashMap.put("BGR", "BG");
        hashMap.put("BFA", "BF");
        hashMap.put("BDI", "BI");
        hashMap.put("CPV", "CV");
        hashMap.put("KHM", "KH");
        hashMap.put("CMR", "CM");
        hashMap.put("CAN", "CA");
        hashMap.put("CYM", "KY");
        hashMap.put("CAF", "CF");
        hashMap.put("TCD", "TD");
        hashMap.put("CHL", "CL");
        hashMap.put("CHN", "CN");
        hashMap.put("CXR", "CX");
        hashMap.put("CCK", "CC");
        hashMap.put("COL", "CO");
        hashMap.put("COM", "KM");
        hashMap.put("COG", "CG");
        hashMap.put("COD", "CD");
        hashMap.put("COK", "CK");
        hashMap.put("CRI", "CR");
        hashMap.put("CIV", "CI");
        hashMap.put("HRV", "HR");
        hashMap.put("CUB", "CU");
        hashMap.put("CUW", "CW");
        hashMap.put("CYP", "CY");
        hashMap.put("CZE", "CZ");
        hashMap.put("DNK", "DK");
        hashMap.put("DJI", "DJ");
        hashMap.put("DMA", "DM");
        hashMap.put("DOM", "DO");
        hashMap.put("ECU", "EC");
        hashMap.put("EGY", "EG");
        hashMap.put("SLV", "SV");
        hashMap.put("GNQ", "GQ");
        hashMap.put("ERI", "ER");
        hashMap.put("EST", "EE");
        hashMap.put("ETH", "ET");
        hashMap.put("FLK", "FK");
        hashMap.put("FRO", "FO");
        hashMap.put("FJI", "FJ");
        hashMap.put("FIN", "FI");
        hashMap.put("FRA", "FR");
        hashMap.put("GUF", "GF");
        hashMap.put("PYF", "PF");
        hashMap.put("ATF", "TF");
        hashMap.put("GAB", "GA");
        hashMap.put("GMB", "GM");
        hashMap.put("GEO", "GE");
        hashMap.put("D<<", "DE");
        hashMap.put("GHA", "GH");
        hashMap.put("GIB", "GI");
        hashMap.put("GRC", "GR");
        hashMap.put("GRL", "GL");
        hashMap.put("GRD", "GD");
        hashMap.put("GLP", "GP");
        hashMap.put("GUM", "GU");
        hashMap.put("GTM", "GT");
        hashMap.put("GGY", "GG");
        hashMap.put("GIN", "GN");
        hashMap.put("GNB", "GW");
        hashMap.put("GUY", "GY");
        hashMap.put("HTI", "HT");
        hashMap.put("HMD", "HM");
        hashMap.put("VAT", "VA");
        hashMap.put("HND", "HN");
        hashMap.put("HKG", "HK");
        hashMap.put("HUN", "HU");
        hashMap.put("ISL", "IS");
        hashMap.put("IND", "IN");
        hashMap.put("IDN", "ID");
        hashMap.put("IRN", "IR");
        hashMap.put("IRQ", "IQ");
        hashMap.put("IRL", "IE");
        hashMap.put("IMN", "IM");
        hashMap.put("ISR", "IL");
        hashMap.put("ITA", "IT");
        hashMap.put("JAM", "JM");
        hashMap.put("JPN", "JP");
        hashMap.put("JEY", "JE");
        hashMap.put("JOR", "JO");
        hashMap.put("KAZ", "KZ");
        hashMap.put("KEN", "KE");
        hashMap.put("KIR", "KI");
        hashMap.put("PRK", "KP");
        hashMap.put("KOR", "KR");
        hashMap.put("KWT", "KW");
        hashMap.put("KGZ", "KG");
        hashMap.put("LAO", "LA");
        hashMap.put("LVA", "LV");
        hashMap.put("LBN", "LB");
        hashMap.put("LSO", "LS");
        hashMap.put("LBR", "LR");
        hashMap.put("LBY", "LY");
        hashMap.put("LIE", "LI");
        hashMap.put("LTU", "LT");
        hashMap.put("LUX", "LU");
        hashMap.put("MAC", "MO");
        hashMap.put("MKD", "MK");
        hashMap.put("MDG", "MG");
        hashMap.put("MWI", "MW");
        hashMap.put("MYS", "MY");
        hashMap.put("MDV", "MV");
        hashMap.put("MLI", "ML");
        hashMap.put("MLT", "MT");
        hashMap.put("MHL", "MH");
        hashMap.put("MTQ", "MQ");
        hashMap.put("MRT", "MR");
        hashMap.put("MUS", "MU");
        hashMap.put("MYT", "YT");
        hashMap.put("MEX", "MX");
        hashMap.put("FSM", "FM");
        hashMap.put("MDA", "MD");
        hashMap.put("MCO", "MC");
        hashMap.put("MNG", "MN");
        hashMap.put("MNE", "ME");
        hashMap.put("MSR", "MS");
        hashMap.put("MAR", "MA");
        hashMap.put("MOZ", "MZ");
        hashMap.put("MMR", "MM");
        hashMap.put("NAM", "NA");
        hashMap.put("NRU", "NR");
        hashMap.put("NPL", "NP");
        hashMap.put("NLD", "NL");
        hashMap.put("NCL", "NC");
        hashMap.put("NZL", "NZ");
        hashMap.put("NIC", "NI");
        hashMap.put("NER", "NE");
        hashMap.put("NGA", "NG");
        hashMap.put("NIU", "NU");
        hashMap.put("NFK", "NF");
        hashMap.put("MNP", "MP");
        hashMap.put("NOR", "NO");
        hashMap.put("OMN", "OM");
        hashMap.put("PAK", "PK");
        hashMap.put("PLW", "PW");
        hashMap.put("PSE", "PS");
        hashMap.put("PAN", "PA");
        hashMap.put("PNG", "PG");
        hashMap.put("PRY", "PY");
        hashMap.put("PER", "PE");
        hashMap.put("PHL", "PH");
        hashMap.put("PCN", "PN");
        hashMap.put("POL", "PL");
        hashMap.put("PRT", "PT");
        hashMap.put("PRI", "PR");
        hashMap.put("QAT", "QA");
        hashMap.put("REU", "RE");
        hashMap.put("ROU", "RO");
        hashMap.put("RUS", "RU");
        hashMap.put("RWA", "RW");
        hashMap.put("BLM", "BL");
        hashMap.put("SHN", "SH");
        hashMap.put("KNA", "KN");
        hashMap.put("LCA", "LC");
        hashMap.put("MAF", "MF");
        hashMap.put("SPM", "PM");
        hashMap.put("VCT", "VC");
        hashMap.put("WSM", "WS");
        hashMap.put("SMR", "SM");
        hashMap.put("STP", "ST");
        hashMap.put("SAU", "SA");
        hashMap.put("SEN", "SN");
        hashMap.put("SRB", "RS");
        hashMap.put("SYC", "SC");
        hashMap.put("SLE", "SL");
        hashMap.put("SGP", "SG");
        hashMap.put("SXM", "SX");
        hashMap.put("SVK", "SK");
        hashMap.put("SVN", "SI");
        hashMap.put("SLB", "SB");
        hashMap.put("SOM", "SO");
        hashMap.put("ZAF", "ZA");
        hashMap.put("SGS", "GS");
        hashMap.put("SSD", "SS");
        hashMap.put("ESP", "ES");
        hashMap.put("LKA", "LK");
        hashMap.put("SDN", "SD");
        hashMap.put("SUR", "SR");
        hashMap.put("SJM", "SJ");
        hashMap.put("SWZ", "SZ");
        hashMap.put("SWE", "SE");
        hashMap.put("CHE", "CH");
        hashMap.put("SYR", "SY");
        hashMap.put("TWN", "TW");
        hashMap.put("TJK", "TJ");
        hashMap.put("TZA", "TZ");
        hashMap.put("THA", "TH");
        hashMap.put("TLS", "TL");
        hashMap.put("TGO", "TG");
        hashMap.put("TKL", "TK");
        hashMap.put("TON", "TO");
        hashMap.put("TTO", "TT");
        hashMap.put("TUN", "TN");
        hashMap.put("TUR", "TR");
        hashMap.put("TKM", "TM");
        hashMap.put("TCA", "TC");
        hashMap.put("TUV", "TV");
        hashMap.put("UGA", "UG");
        hashMap.put("UKR", "UA");
        hashMap.put("ARE", "AE");
        hashMap.put("GBR", "GB");
        hashMap.put("USA", "US");
        hashMap.put("UMI", "UM");
        hashMap.put("URY", "UY");
        hashMap.put("UZB", "UZ");
        hashMap.put("VUT", "VU");
        hashMap.put("VEN", "VE");
        hashMap.put("VNM", "VN");
        hashMap.put("VGB", "VG");
        hashMap.put("VIR", "VI");
        hashMap.put("WLF", "WF");
        hashMap.put("ESH", "EH");
        hashMap.put("YEM", "YE");
        hashMap.put("ZMB", "ZM");
        hashMap.put("ZWE", "ZW");
        return hashMap;
    }

    public static int e(char c10) {
        if (c10 == 'O') {
            return 0;
        }
        if (c10 == 'I') {
            return 1;
        }
        if (c10 == 'B') {
            return 8;
        }
        return c10 - '0';
    }

    public static void f(String str, zr zrVar) {
        try {
            int parseInt = Integer.parseInt(str.substring(0, 2));
            zrVar.i = parseInt;
            zrVar.i = parseInt < (Calendar.getInstance().get(1) % 100) + (-5) ? zrVar.i + 2000 : zrVar.i + 1900;
            zrVar.j = Integer.parseInt(str.substring(2, 4));
            zrVar.k = Integer.parseInt(str.substring(4));
        } catch (NumberFormatException unused) {
        }
    }

    private static native int[] findCornerPoints(Bitmap bitmap);

    public static void g(String str, zr zrVar) {
        try {
            if ("<<<<<<".equals(str)) {
                zrVar.o = true;
                return;
            }
            zrVar.f = Integer.parseInt(str.substring(0, 2)) + 2000;
            zrVar.g = Integer.parseInt(str.substring(2, 4));
            zrVar.h = Integer.parseInt(str.substring(4));
        } catch (NumberFormatException unused) {
        }
    }

    public static int h(char c10) {
        if (c10 != 'F') {
            return c10 != 'M' ? 0 : 1;
        }
        return 2;
    }

    public static zr i(Bitmap bitmap) {
        u8.e eVar;
        u8.n nVar = new u8.n(new com.google.android.gms.internal.vision.t2(t0.b, new com.google.android.gms.internal.vision.x1()));
        if (bitmap.getWidth() > 1500 || bitmap.getHeight() > 1500) {
            float max = 1500.0f / Math.max(bitmap.getWidth(), bitmap.getHeight());
            bitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * max), Math.round(bitmap.getHeight() * max), true);
        }
        hy0 hy0Var = new hy0(17);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        hy0Var.d = bitmap;
        b7.d dVar = (b7.d) hy0Var.b;
        dVar.a = width;
        dVar.b = height;
        SparseArray e12 = nVar.e1(hy0Var);
        int i7 = 0;
        for (int i10 = 0; i10 < e12.size(); i10++) {
            u8.m mVar = (u8.m) e12.valueAt(i10);
            int i11 = mVar.d;
            int i12 = 6;
            int i13 = 4;
            if (i11 == 12 && (eVar = mVar.D) != null) {
                zr zrVar = new zr();
                zrVar.a = "ID".equals(eVar.a) ? 2 : 4;
                String str = mVar.D.D;
                str.getClass();
                if (str.equals("CAN")) {
                    zrVar.l = "CA";
                    zrVar.m = "CA";
                } else if (str.equals("USA")) {
                    zrVar.l = "US";
                    zrVar.m = "US";
                }
                zrVar.b = a(mVar.D.b);
                zrVar.c = a(mVar.D.d);
                zrVar.d = a(mVar.D.c);
                u8.e eVar2 = mVar.D;
                zrVar.e = eVar2.s;
                String str2 = eVar2.e;
                if (str2 != null) {
                    if (str2.equals("1")) {
                        zrVar.n = 1;
                    } else if (str2.equals("2")) {
                        zrVar.n = 2;
                    }
                }
                if ("USA".equals(zrVar.l)) {
                    i13 = 0;
                    i7 = 4;
                    i12 = 2;
                }
                try {
                    String str3 = mVar.D.y;
                    if (str3 != null && str3.length() == 8) {
                        zrVar.i = Integer.parseInt(mVar.D.y.substring(i7, i7 + 4));
                        zrVar.j = Integer.parseInt(mVar.D.y.substring(i13, i13 + 2));
                        zrVar.k = Integer.parseInt(mVar.D.y.substring(i12, i12 + 2));
                    }
                    String str4 = mVar.D.x;
                    if (str4 != null && str4.length() == 8) {
                        zrVar.f = Integer.parseInt(mVar.D.x.substring(i7, i7 + 4));
                        zrVar.g = Integer.parseInt(mVar.D.x.substring(i13, i13 + 2));
                        zrVar.h = Integer.parseInt(mVar.D.x.substring(i12, i12 + 2));
                    }
                } catch (NumberFormatException unused) {
                }
                return zrVar;
            }
            if (i11 == 7 && mVar.a == 2048 && mVar.b.matches("^[A-Za-z0-9=]+$")) {
                try {
                    String[] split = new String(Base64.decode(mVar.b, 0), "windows-1251").split("\\|");
                    if (split.length >= 10) {
                        zr zrVar2 = new zr();
                        zrVar2.a = 4;
                        zrVar2.l = "RU";
                        zrVar2.m = "RU";
                        zrVar2.e = split[0];
                        zrVar2.f = Integer.parseInt(split[2].substring(0, 4));
                        zrVar2.g = Integer.parseInt(split[2].substring(4, 6));
                        zrVar2.h = Integer.parseInt(split[2].substring(6));
                        zrVar2.c = a(c(split[3]));
                        zrVar2.b = a(c(split[4]));
                        zrVar2.d = a(c(split[5]));
                        zrVar2.i = Integer.parseInt(split[6].substring(0, 4));
                        zrVar2.j = Integer.parseInt(split[6].substring(4, 6));
                        zrVar2.k = Integer.parseInt(split[6].substring(6));
                        return zrVar2;
                    }
                    continue;
                } catch (Exception unused2) {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zr j(Bitmap bitmap) {
        float max;
        Bitmap createScaledBitmap;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Bitmap createScaledBitmap2;
        int i16;
        int i17;
        Rect[][] rectArr;
        int i18;
        String performRecognition;
        int i19;
        char c10;
        Matrix matrix;
        Bitmap bitmap2 = bitmap;
        if (bitmap2.getWidth() > 512 || bitmap2.getHeight() > 512) {
            max = 512.0f / Math.max(bitmap2.getWidth(), bitmap2.getHeight());
            createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, Math.round(bitmap2.getWidth() * max), Math.round(bitmap2.getHeight() * max), true);
        } else {
            createScaledBitmap = bitmap2;
            max = 1.0f;
        }
        int[] findCornerPoints = findCornerPoints(createScaledBitmap);
        float f10 = 1.0f / max;
        if (findCornerPoints != null) {
            Point point = new Point(findCornerPoints[0], findCornerPoints[1]);
            Point point2 = new Point(findCornerPoints[2], findCornerPoints[3]);
            i14 = 7;
            Point point3 = new Point(findCornerPoints[4], findCornerPoints[5]);
            Point point4 = new Point(findCornerPoints[6], findCornerPoints[7]);
            if (point2.x >= point.x) {
                point3 = point4;
                point4 = point3;
                point2 = point;
                point = point2;
            }
            i11 = 3;
            double hypot = Math.hypot(point.x - point2.x, point.y - point2.y);
            i10 = 6;
            i7 = 1;
            double hypot2 = Math.hypot(point3.x - point4.x, point3.y - point4.y);
            double hypot3 = Math.hypot(point4.x - point2.x, point4.y - point2.y);
            i12 = 5;
            i13 = 0;
            double hypot4 = Math.hypot(point3.x - point.x, point3.y - point.y);
            double d = hypot / hypot3;
            double d2 = hypot / hypot4;
            double d10 = hypot2 / hypot3;
            double d11 = hypot2 / hypot4;
            if (d >= 1.35d && d <= 1.75d && d10 >= 1.35d && d10 <= 1.75d && d2 >= 1.35d && d2 <= 1.75d && d11 >= 1.35d && d11 <= 1.75d) {
                Bitmap createBitmap = Bitmap.createBitmap(1024, (int) Math.round(1024.0d / ((((d + d2) + d10) + d11) / 4.0d)), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Matrix matrix2 = new Matrix();
                matrix2.setPolyToPoly(new float[]{point2.x * f10, point2.y * f10, point.x * f10, point.y * f10, point3.x * f10, point3.y * f10, point4.x * f10, point4.y * f10}, 0, new float[]{0.0f, 0.0f, createBitmap.getWidth(), 0.0f, createBitmap.getWidth(), createBitmap.getHeight(), 0.0f, createBitmap.getHeight()}, 0, 4);
                canvas.drawBitmap(bitmap2, matrix2, new Paint(2));
                bitmap2 = createBitmap;
            }
        } else {
            i7 = 1;
            i10 = 6;
            i11 = 3;
            i12 = 5;
            i13 = 0;
            i14 = 7;
            if (bitmap2.getWidth() > 1500 || bitmap2.getHeight() > 1500) {
                float max2 = 1500.0f / Math.max(bitmap2.getWidth(), bitmap2.getHeight());
                i15 = 1;
                createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap2, Math.round(bitmap2.getWidth() * max2), Math.round(bitmap2.getHeight() * max2), true);
                i16 = i13;
                i17 = i16;
                int i20 = i17;
                Bitmap bitmap3 = null;
                rectArr = null;
                while (true) {
                    if (i16 < i11) {
                        i18 = 2;
                        break;
                    }
                    if (i16 == i15) {
                        Matrix matrix3 = new Matrix();
                        c10 = 0;
                        matrix3.setRotate(1.0f, createScaledBitmap2.getWidth() / 2, createScaledBitmap2.getHeight() / 2);
                        matrix = matrix3;
                    } else if (i16 != 2) {
                        c10 = 0;
                        matrix = null;
                    } else {
                        Matrix matrix4 = new Matrix();
                        matrix4.setRotate(-1.0f, createScaledBitmap2.getWidth() / 2, createScaledBitmap2.getHeight() / 2);
                        matrix = matrix4;
                        c10 = 0;
                    }
                    Bitmap createBitmap2 = matrix != null ? Bitmap.createBitmap(createScaledBitmap2, 0, 0, createScaledBitmap2.getWidth(), createScaledBitmap2.getHeight(), matrix, true) : createScaledBitmap2;
                    bitmap3 = Bitmap.createBitmap(createBitmap2.getWidth(), createBitmap2.getHeight(), Bitmap.Config.ALPHA_8);
                    rectArr = binarizeAndFindCharacters(createBitmap2, bitmap3);
                    if (rectArr == null) {
                        break;
                    }
                    int length = rectArr.length;
                    for (int i21 = i13; i21 < length; i21++) {
                        Rect[] rectArr2 = rectArr[i21];
                        i17 = Math.max(rectArr2.length, i17);
                        if (rectArr2.length > 0) {
                            i20++;
                        }
                    }
                    i18 = 2;
                    if (i20 >= 2 && i17 >= 30) {
                        break;
                    }
                    i16++;
                    i15 = 1;
                    i11 = 3;
                }
                if (i17 >= 30 && i20 >= i18) {
                    Bitmap createBitmap3 = Bitmap.createBitmap(rectArr[i13].length * 10, rectArr.length * 15, Bitmap.Config.ALPHA_8);
                    Canvas canvas2 = new Canvas(createBitmap3);
                    Paint paint = new Paint(2);
                    int i22 = i13;
                    Rect rect = new Rect(i22, i22, 10, 15);
                    int i23 = 0;
                    for (Rect[] rectArr3 : rectArr) {
                        int i24 = 0;
                        int i25 = 0;
                        for (int length2 = rectArr3.length; i24 < length2; length2 = length2) {
                            Rect rect2 = rectArr3[i24];
                            int i26 = i25 * 10;
                            int i27 = i23 * 15;
                            rect.set(i26, i27, i26 + 10, i27 + 15);
                            canvas2.drawBitmap(bitmap3, rect2, rect, paint);
                            i25++;
                            i24++;
                        }
                        i23++;
                    }
                    performRecognition = performRecognition(createBitmap3, rectArr.length, rectArr[0].length, t0.b.getAssets());
                    if (performRecognition != null) {
                        return null;
                    }
                    String[] split = TextUtils.split(performRecognition, "\n");
                    zr zrVar = new zr();
                    if (split.length < 2 || split[0].length() < 30 || split[1].length() != split[0].length()) {
                        return null;
                    }
                    zrVar.p = TextUtils.join("\n", split);
                    HashMap d12 = d();
                    char charAt = split[0].charAt(0);
                    if (charAt == 'P') {
                        zrVar.a = 1;
                        if (split[0].length() == 44) {
                            int i28 = i12;
                            zrVar.l = split[0].substring(2, i28);
                            int indexOf = split[0].indexOf("<<", i10);
                            if (indexOf != -1) {
                                zrVar.c = split[0].substring(i28, indexOf).replace('<', ' ').replace('0', 'O').trim();
                                String trim = split[0].substring(indexOf + 2).replace('<', ' ').replace('0', 'O').trim();
                                zrVar.b = trim;
                                if (trim.contains("   ")) {
                                    String str = zrVar.b;
                                    i19 = 0;
                                    zrVar.b = str.substring(0, str.indexOf("   "));
                                } else {
                                    i19 = 0;
                                }
                            } else {
                                i19 = 0;
                            }
                            String trim2 = split[1].substring(i19, 9).replace('<', ' ').replace('O', '0').trim();
                            if (b(trim2) == e(split[1].charAt(9))) {
                                zrVar.e = trim2;
                            }
                            zrVar.m = split[1].substring(10, 13);
                            String replace = split[1].substring(13, 19).replace('O', '0').replace('I', '1');
                            if (b(replace) == e(split[1].charAt(19))) {
                                f(replace, zrVar);
                            }
                            zrVar.n = h(split[1].charAt(20));
                            String replace2 = split[1].substring(21, 27).replace('O', '0').replace('I', '1');
                            if (b(replace2) == e(split[1].charAt(27)) || split[1].charAt(27) == '<') {
                                g(replace2, zrVar);
                            }
                            if ("RUS".equals(zrVar.l) && split[0].charAt(1) == 'N') {
                                zrVar.a = 3;
                                String[] split2 = zrVar.b.split(" ");
                                zrVar.b = c(k(split2[0]));
                                if (split2.length > 1) {
                                    zrVar.d = c(k(split2[1]));
                                }
                                zrVar.c = c(k(zrVar.c));
                                if (zrVar.e != null) {
                                    zrVar.e = zrVar.e.substring(0, 3) + split[1].charAt(28) + zrVar.e.substring(3);
                                }
                            } else {
                                zrVar.b = zrVar.b.replace('8', 'B');
                                zrVar.c = zrVar.c.replace('8', 'B');
                            }
                            zrVar.c = a(zrVar.c);
                            zrVar.b = a(zrVar.b);
                            zrVar.d = a(zrVar.d);
                        }
                    } else {
                        if (charAt != 'I' && charAt != 'A' && charAt != 'C') {
                            return null;
                        }
                        zrVar.a = 2;
                        if (split.length == 3 && split[0].length() == 30 && split[2].length() == 30) {
                            zrVar.l = split[0].substring(2, 5);
                            String trim3 = split[0].substring(5, 14).replace('<', ' ').replace('O', '0').trim();
                            if (b(trim3) == split[0].charAt(14) - '0') {
                                zrVar.e = trim3;
                            }
                            String replace3 = split[1].substring(0, 6).replace('O', '0').replace('I', '1');
                            if (b(replace3) == e(split[1].charAt(6))) {
                                f(replace3, zrVar);
                            }
                            zrVar.n = h(split[1].charAt(i14));
                            String replace4 = split[1].substring(8, 14).replace('O', '0').replace('I', '1');
                            if (b(replace4) == e(split[1].charAt(14)) || split[1].charAt(14) == '<') {
                                g(replace4, zrVar);
                            }
                            zrVar.m = split[1].substring(15, 18);
                            int indexOf2 = split[2].indexOf("<<");
                            if (indexOf2 != -1) {
                                zrVar.c = split[2].substring(0, indexOf2).replace('<', ' ').trim();
                                zrVar.b = split[2].substring(indexOf2 + 2).replace('<', ' ').trim();
                            }
                        } else if (split.length == 2 && split[0].length() == 36) {
                            String substring = split[0].substring(2, 5);
                            zrVar.l = substring;
                            if ("FRA".equals(substring) && charAt == 'I' && split[0].charAt(1) == 'D') {
                                zrVar.m = "FRA";
                                zrVar.c = split[0].substring(5, 30).replace('<', ' ').trim();
                                zrVar.b = split[1].substring(13, 27).replace("<<", ", ").replace('<', ' ').trim();
                                String replace5 = split[1].substring(0, 12).replace('O', '0');
                                if (b(replace5) == e(split[1].charAt(12))) {
                                    zrVar.e = replace5;
                                }
                                String replace6 = split[1].substring(27, 33).replace('O', '0').replace('I', '1');
                                if (b(replace6) == e(split[1].charAt(33))) {
                                    f(replace6, zrVar);
                                }
                                zrVar.n = h(split[1].charAt(34));
                                zrVar.o = true;
                            } else {
                                int indexOf3 = split[0].indexOf("<<");
                                if (indexOf3 != -1) {
                                    zrVar.c = split[0].substring(5, indexOf3).replace('<', ' ').trim();
                                    zrVar.b = split[0].substring(indexOf3 + 2).replace('<', ' ').trim();
                                }
                                String trim4 = split[1].substring(0, 9).replace('<', ' ').replace('O', '0').trim();
                                if (b(trim4) == e(split[1].charAt(9))) {
                                    zrVar.e = trim4;
                                }
                                zrVar.m = split[1].substring(10, 13);
                                String replace7 = split[1].substring(13, 19).replace('O', '0').replace('I', '1');
                                if (b(replace7) == e(split[1].charAt(19))) {
                                    f(replace7, zrVar);
                                }
                                zrVar.n = h(split[1].charAt(20));
                                String replace8 = split[1].substring(21, 27).replace('O', '0').replace('I', '1');
                                if (b(replace8) == e(split[1].charAt(27)) || split[1].charAt(27) == '<') {
                                    g(replace8, zrVar);
                                }
                            }
                        }
                        zrVar.b = a(zrVar.b.replace('0', 'O').replace('8', 'B'));
                        zrVar.c = a(zrVar.c.replace('0', 'O').replace('8', 'B'));
                    }
                    if (TextUtils.isEmpty(zrVar.b) && TextUtils.isEmpty(zrVar.c)) {
                        return null;
                    }
                    zrVar.l = (String) d12.get(zrVar.l);
                    zrVar.m = (String) d12.get(zrVar.m);
                    return zrVar;
                }
                return null;
            }
        }
        createScaledBitmap2 = bitmap2;
        i15 = i7;
        i16 = i13;
        i17 = i16;
        int i202 = i17;
        Bitmap bitmap32 = null;
        rectArr = null;
        while (true) {
            if (i16 < i11) {
            }
            i16++;
            i15 = 1;
            i11 = 3;
        }
        if (i17 >= 30) {
            Bitmap createBitmap32 = Bitmap.createBitmap(rectArr[i13].length * 10, rectArr.length * 15, Bitmap.Config.ALPHA_8);
            Canvas canvas22 = new Canvas(createBitmap32);
            Paint paint2 = new Paint(2);
            int i222 = i13;
            Rect rect3 = new Rect(i222, i222, 10, 15);
            int i232 = 0;
            while (r13 < r12) {
            }
            performRecognition = performRecognition(createBitmap32, rectArr.length, rectArr[0].length, t0.b.getAssets());
            if (performRecognition != null) {
            }
        }
        return null;
    }

    public static String k(String str) {
        char[] charArray = str.toCharArray();
        for (int i7 = 0; i7 < charArray.length; i7++) {
            int indexOf = "ABVGDE2JZIQKLMNOPRSTUFHC34WXY9678".indexOf(charArray[i7]);
            if (indexOf != -1) {
                charArray[i7] = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".charAt(indexOf);
            }
        }
        return new String(charArray);
    }

    private static native String performRecognition(Bitmap bitmap, int i7, int i10, AssetManager assetManager);

    private static native void setYuvBitmapPixels(Bitmap bitmap, byte[] bArr);
}
