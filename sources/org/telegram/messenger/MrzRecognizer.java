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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class MrzRecognizer {

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public static class Result {
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_UNKNOWN = 0;
        public static final int TYPE_DRIVER_LICENSE = 4;
        public static final int TYPE_ID = 2;
        public static final int TYPE_INTERNAL_PASSPORT = 3;
        public static final int TYPE_PASSPORT = 1;
        public int birthDay;
        public int birthMonth;
        public int birthYear;
        public boolean doesNotExpire;
        public int expiryDay;
        public int expiryMonth;
        public int expiryYear;
        public String firstName;
        public int gender;
        public String issuingCountry;
        public String lastName;
        public boolean mainCheckDigitIsValid;
        public String middleName;
        public String nationality;
        public String number;
        public String rawMRZ;
        public int type;
    }

    private static native Rect[][] binarizeAndFindCharacters(Bitmap bitmap, Bitmap bitmap2);

    private static String capitalize(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        boolean z10 = true;
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (z10 || !Character.isLetter(charArray[i10])) {
                z10 = charArray[i10] == ' ';
            } else {
                charArray[i10] = Character.toLowerCase(charArray[i10]);
            }
        }
        return new String(charArray);
    }

    private static int checksum(String str) {
        char[] charArray = str.toCharArray();
        int[] iArr = {7, 3, 1};
        int i10 = 0;
        for (int i11 = 0; i11 < charArray.length; i11++) {
            char c10 = charArray[i11];
            i10 += ((c10 < '0' || c10 > '9') ? (c10 < 'A' || c10 > 'Z') ? 0 : c10 - '7' : c10 - '0') * iArr[i11 % 3];
        }
        return i10 % 10;
    }

    private static String cyrillicToLatin(String str) {
        String[] strArr = {"A", "B", "V", "G", "D", "E", "E", "ZH", "Z", "I", "I", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F", "KH", "TS", "CH", "SH", "SHCH", "IE", "Y", "", "E", "IU", "IA"};
        String str2 = str;
        int i10 = 0;
        while (i10 < 33) {
            int i11 = i10 + 1;
            str2 = str2.replace("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".substring(i10, i11), strArr[i10]);
            i10 = i11;
        }
        return str2;
    }

    private static native int[] findCornerPoints(Bitmap bitmap);

    private static HashMap<String, String> getCountriesMap() {
        HashMap<String, String> hashMap = new HashMap<>();
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

    private static int getNumber(char c10) {
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

    private static void parseBirthDate(String str, Result result) {
        try {
            int parseInt = Integer.parseInt(str.substring(0, 2));
            result.birthYear = parseInt;
            result.birthYear = parseInt < (Calendar.getInstance().get(1) % 100) + (-5) ? result.birthYear + 2000 : result.birthYear + 1900;
            result.birthMonth = Integer.parseInt(str.substring(2, 4));
            result.birthDay = Integer.parseInt(str.substring(4));
        } catch (NumberFormatException unused) {
        }
    }

    private static void parseExpiryDate(String str, Result result) {
        try {
            if ("<<<<<<".equals(str)) {
                result.doesNotExpire = true;
                return;
            }
            result.expiryYear = Integer.parseInt(str.substring(0, 2)) + 2000;
            result.expiryMonth = Integer.parseInt(str.substring(2, 4));
            result.expiryDay = Integer.parseInt(str.substring(4));
        } catch (NumberFormatException unused) {
        }
    }

    private static int parseGender(char c10) {
        if (c10 != 'F') {
            return c10 != 'M' ? 0 : 1;
        }
        return 2;
    }

    private static native String performRecognition(Bitmap bitmap, int i10, int i11, AssetManager assetManager);

    public static Result recognize(Bitmap bitmap, boolean z10) {
        Result recognizeBarcode;
        Result recognizeBarcode2;
        if (z10 && (recognizeBarcode2 = recognizeBarcode(bitmap)) != null) {
            return recognizeBarcode2;
        }
        try {
            Result recognizeMRZ = recognizeMRZ(bitmap);
            if (recognizeMRZ != null) {
                return recognizeMRZ;
            }
        } catch (Exception unused) {
        }
        if (z10 || (recognizeBarcode = recognizeBarcode(bitmap)) == null) {
            return null;
        }
        return recognizeBarcode;
    }

    private static Result recognizeBarcode(Bitmap bitmap) {
        r8.n nVar = new r8.n(new com.google.android.gms.internal.vision.u2(ApplicationLoader.applicationContext, new com.google.android.gms.internal.vision.x1()));
        if (bitmap.getWidth() > 1500 || bitmap.getHeight() > 1500) {
            float max = 1500.0f / Math.max(bitmap.getWidth(), bitmap.getHeight());
            bitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * max), Math.round(bitmap.getHeight() * max), true);
        }
        m2.t tVar = new m2.t(20);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        tVar.d = bitmap;
        a3.k kVar = (a3.k) tVar.b;
        kVar.a = width;
        kVar.b = height;
        SparseArray Z0 = nVar.Z0(tVar);
        int i10 = 0;
        for (int i11 = 0; i11 < Z0.size(); i11++) {
            r8.m mVar = (r8.m) Z0.valueAt(i11);
            int i12 = mVar.d;
            int i13 = 6;
            int i14 = 4;
            if (i12 == 12 && mVar.y != null) {
                Result result = new Result();
                result.type = "ID".equals(mVar.y.a) ? 2 : 4;
                String str = mVar.y.y;
                str.getClass();
                if (str.equals("CAN")) {
                    result.issuingCountry = "CA";
                    result.nationality = "CA";
                } else if (str.equals("USA")) {
                    result.issuingCountry = "US";
                    result.nationality = "US";
                }
                result.firstName = capitalize(mVar.y.b);
                result.lastName = capitalize(mVar.y.d);
                result.middleName = capitalize(mVar.y.c);
                r8.e eVar = mVar.y;
                result.number = eVar.s;
                String str2 = eVar.e;
                if (str2 != null) {
                    if (str2.equals("1")) {
                        result.gender = 1;
                    } else if (str2.equals("2")) {
                        result.gender = 2;
                    }
                }
                if ("USA".equals(result.issuingCountry)) {
                    i10 = 4;
                    i13 = 2;
                    i14 = 0;
                }
                try {
                    String str3 = mVar.y.x;
                    if (str3 != null && str3.length() == 8) {
                        result.birthYear = Integer.parseInt(mVar.y.x.substring(i10, i10 + 4));
                        result.birthMonth = Integer.parseInt(mVar.y.x.substring(i14, i14 + 2));
                        result.birthDay = Integer.parseInt(mVar.y.x.substring(i13, i13 + 2));
                    }
                    String str4 = mVar.y.w;
                    if (str4 != null && str4.length() == 8) {
                        result.expiryYear = Integer.parseInt(mVar.y.w.substring(i10, i10 + 4));
                        result.expiryMonth = Integer.parseInt(mVar.y.w.substring(i14, i14 + 2));
                        result.expiryDay = Integer.parseInt(mVar.y.w.substring(i13, i13 + 2));
                    }
                } catch (NumberFormatException unused) {
                }
                return result;
            }
            if (i12 == 7 && mVar.a == 2048 && mVar.b.matches("^[A-Za-z0-9=]+$")) {
                try {
                    String[] split = new String(Base64.decode(mVar.b, 0), "windows-1251").split("\\|");
                    if (split.length >= 10) {
                        Result result2 = new Result();
                        result2.type = 4;
                        result2.issuingCountry = "RU";
                        result2.nationality = "RU";
                        result2.number = split[0];
                        result2.expiryYear = Integer.parseInt(split[2].substring(0, 4));
                        result2.expiryMonth = Integer.parseInt(split[2].substring(4, 6));
                        result2.expiryDay = Integer.parseInt(split[2].substring(6));
                        result2.lastName = capitalize(cyrillicToLatin(split[3]));
                        result2.firstName = capitalize(cyrillicToLatin(split[4]));
                        result2.middleName = capitalize(cyrillicToLatin(split[5]));
                        result2.birthYear = Integer.parseInt(split[6].substring(0, 4));
                        result2.birthMonth = Integer.parseInt(split[6].substring(4, 6));
                        result2.birthDay = Integer.parseInt(split[6].substring(6));
                        return result2;
                    }
                    continue;
                } catch (Exception unused2) {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x027d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0404  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Result recognizeMRZ(Bitmap bitmap) {
        float max;
        Bitmap createScaledBitmap;
        char c10;
        int i10;
        Bitmap createScaledBitmap2;
        int i11;
        int i12;
        int i13;
        int i14;
        String trim;
        String replace;
        String replace2;
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
        float f7 = 1.0f / max;
        if (findCornerPoints != null) {
            Point point = new Point(findCornerPoints[0], findCornerPoints[1]);
            Point point2 = new Point(findCornerPoints[2], findCornerPoints[3]);
            Point point3 = new Point(findCornerPoints[4], findCornerPoints[5]);
            Point point4 = new Point(findCornerPoints[6], findCornerPoints[7]);
            if (point2.x >= point.x) {
                point3 = point4;
                point4 = point3;
                point2 = point;
                point = point2;
            }
            double hypot = Math.hypot(point.x - point2.x, point.y - point2.y);
            double hypot2 = Math.hypot(point3.x - point4.x, point3.y - point4.y);
            double hypot3 = Math.hypot(point4.x - point2.x, point4.y - point2.y);
            c10 = 0;
            double hypot4 = Math.hypot(point3.x - point.x, point3.y - point.y);
            double d = hypot / hypot3;
            double d10 = hypot / hypot4;
            double d11 = hypot2 / hypot3;
            double d12 = hypot2 / hypot4;
            if (d >= 1.35d && d <= 1.75d && d11 >= 1.35d && d11 <= 1.75d && d10 >= 1.35d && d10 <= 1.75d && d12 >= 1.35d && d12 <= 1.75d) {
                Bitmap createBitmap = Bitmap.createBitmap(1024, (int) Math.round(1024.0d / ((((d + d10) + d11) + d12) / 4.0d)), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Matrix matrix2 = new Matrix();
                matrix2.setPolyToPoly(new float[]{point2.x * f7, point2.y * f7, point.x * f7, point.y * f7, point3.x * f7, point3.y * f7, point4.x * f7, point4.y * f7}, 0, new float[]{0.0f, 0.0f, createBitmap.getWidth(), 0.0f, createBitmap.getWidth(), createBitmap.getHeight(), 0.0f, createBitmap.getHeight()}, 0, 4);
                canvas.drawBitmap(bitmap2, matrix2, new Paint(2));
                bitmap2 = createBitmap;
            }
        } else {
            c10 = 0;
            if (bitmap2.getWidth() > 1500 || bitmap2.getHeight() > 1500) {
                float max2 = 1500.0f / Math.max(bitmap2.getWidth(), bitmap2.getHeight());
                i10 = 1;
                createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap2, Math.round(bitmap2.getWidth() * max2), Math.round(bitmap2.getHeight() * max2), true);
                Result result = null;
                Bitmap bitmap3 = null;
                Rect[][] rectArr = null;
                i11 = 0;
                i12 = 0;
                int i15 = 0;
                while (true) {
                    if (i11 < 3) {
                        i13 = 2;
                        break;
                    }
                    if (i11 == i10) {
                        Matrix matrix3 = new Matrix();
                        matrix3.setRotate(1.0f, createScaledBitmap2.getWidth() / 2, createScaledBitmap2.getHeight() / 2);
                        matrix = matrix3;
                    } else if (i11 != 2) {
                        matrix = null;
                    } else {
                        Matrix matrix4 = new Matrix();
                        matrix4.setRotate(-1.0f, createScaledBitmap2.getWidth() / 2, createScaledBitmap2.getHeight() / 2);
                        matrix = matrix4;
                    }
                    Bitmap createBitmap2 = matrix != null ? Bitmap.createBitmap(createScaledBitmap2, 0, 0, createScaledBitmap2.getWidth(), createScaledBitmap2.getHeight(), matrix, true) : createScaledBitmap2;
                    bitmap3 = Bitmap.createBitmap(createBitmap2.getWidth(), createBitmap2.getHeight(), Bitmap.Config.ALPHA_8);
                    rectArr = binarizeAndFindCharacters(createBitmap2, bitmap3);
                    if (rectArr == null) {
                        return null;
                    }
                    for (Rect[] rectArr2 : rectArr) {
                        i12 = Math.max(rectArr2.length, i12);
                        if (rectArr2.length > 0) {
                            i15++;
                        }
                    }
                    i13 = 2;
                    if (i15 >= 2 && i12 >= 30) {
                        break;
                    }
                    i11++;
                    i10 = 1;
                }
                if (i12 >= 30 || i15 < i13) {
                    return null;
                }
                Bitmap createBitmap3 = Bitmap.createBitmap(rectArr[c10].length * 10, rectArr.length * 15, Bitmap.Config.ALPHA_8);
                Canvas canvas2 = new Canvas(createBitmap3);
                Paint paint = new Paint(2);
                Rect rect = new Rect(0, 0, 10, 15);
                int length = rectArr.length;
                int i16 = 0;
                int i17 = 0;
                while (i16 < length) {
                    Rect[] rectArr3 = rectArr[i16];
                    Result result2 = result;
                    int i18 = 0;
                    int i19 = 0;
                    for (int length2 = rectArr3.length; i18 < length2; length2 = length2) {
                        Rect rect2 = rectArr3[i18];
                        int i20 = i19 * 10;
                        int i21 = i17 * 15;
                        rect.set(i20, i21, i20 + 10, i21 + 15);
                        canvas2.drawBitmap(bitmap3, rect2, rect, paint);
                        i19++;
                        i18++;
                    }
                    i17++;
                    i16++;
                    result = result2;
                }
                Result result3 = result;
                String performRecognition = performRecognition(createBitmap3, rectArr.length, rectArr[0].length, ApplicationLoader.applicationContext.getAssets());
                if (performRecognition == null) {
                    return result3;
                }
                String[] split = TextUtils.split(performRecognition, "\n");
                Result result4 = new Result();
                if (split.length < 2 || split[0].length() < 30 || split[1].length() != split[0].length()) {
                    return result3;
                }
                result4.rawMRZ = TextUtils.join("\n", split);
                HashMap<String, String> countriesMap = getCountriesMap();
                char charAt = split[0].charAt(0);
                if (charAt == 'P') {
                    result4.type = 1;
                    if (split[0].length() == 44) {
                        result4.issuingCountry = split[0].substring(2, 5);
                        int indexOf = split[0].indexOf("<<", 6);
                        if (indexOf != -1) {
                            result4.lastName = split[0].substring(5, indexOf).replace('<', ' ').replace('0', 'O').trim();
                            String trim2 = split[0].substring(indexOf + 2).replace('<', ' ').replace('0', 'O').trim();
                            result4.firstName = trim2;
                            if (trim2.contains("   ")) {
                                String str = result4.firstName;
                                i14 = 0;
                                result4.firstName = str.substring(0, str.indexOf("   "));
                                trim = split[1].substring(i14, 9).replace('<', ' ').replace('O', '0').trim();
                                if (checksum(trim) == getNumber(split[1].charAt(9))) {
                                    result4.number = trim;
                                }
                                result4.nationality = split[1].substring(10, 13);
                                replace = split[1].substring(13, 19).replace('O', '0').replace('I', '1');
                                if (checksum(replace) == getNumber(split[1].charAt(19))) {
                                    parseBirthDate(replace, result4);
                                }
                                result4.gender = parseGender(split[1].charAt(20));
                                replace2 = split[1].substring(21, 27).replace('O', '0').replace('I', '1');
                                if (checksum(replace2) != getNumber(split[1].charAt(27)) || split[1].charAt(27) == '<') {
                                    parseExpiryDate(replace2, result4);
                                }
                                if ("RUS".equals(result4.issuingCountry) || split[0].charAt(1) != 'N') {
                                    result4.firstName = result4.firstName.replace('8', 'B');
                                    result4.lastName = result4.lastName.replace('8', 'B');
                                } else {
                                    result4.type = 3;
                                    String[] split2 = result4.firstName.split(" ");
                                    result4.firstName = cyrillicToLatin(russianPassportTranslit(split2[0]));
                                    if (split2.length > 1) {
                                        result4.middleName = cyrillicToLatin(russianPassportTranslit(split2[1]));
                                    }
                                    result4.lastName = cyrillicToLatin(russianPassportTranslit(result4.lastName));
                                    if (result4.number != null) {
                                        result4.number = result4.number.substring(0, 3) + split[1].charAt(28) + result4.number.substring(3);
                                    }
                                }
                                result4.lastName = capitalize(result4.lastName);
                                result4.firstName = capitalize(result4.firstName);
                                result4.middleName = capitalize(result4.middleName);
                            }
                        }
                        i14 = 0;
                        trim = split[1].substring(i14, 9).replace('<', ' ').replace('O', '0').trim();
                        if (checksum(trim) == getNumber(split[1].charAt(9))) {
                        }
                        result4.nationality = split[1].substring(10, 13);
                        replace = split[1].substring(13, 19).replace('O', '0').replace('I', '1');
                        if (checksum(replace) == getNumber(split[1].charAt(19))) {
                        }
                        result4.gender = parseGender(split[1].charAt(20));
                        replace2 = split[1].substring(21, 27).replace('O', '0').replace('I', '1');
                        if (checksum(replace2) != getNumber(split[1].charAt(27))) {
                        }
                        parseExpiryDate(replace2, result4);
                        if ("RUS".equals(result4.issuingCountry)) {
                        }
                        result4.firstName = result4.firstName.replace('8', 'B');
                        result4.lastName = result4.lastName.replace('8', 'B');
                        result4.lastName = capitalize(result4.lastName);
                        result4.firstName = capitalize(result4.firstName);
                        result4.middleName = capitalize(result4.middleName);
                    }
                } else {
                    if (charAt != 'I' && charAt != 'A' && charAt != 'C') {
                        return result3;
                    }
                    result4.type = 2;
                    if (split.length == 3 && split[0].length() == 30 && split[2].length() == 30) {
                        result4.issuingCountry = split[0].substring(2, 5);
                        String trim3 = split[0].substring(5, 14).replace('<', ' ').replace('O', '0').trim();
                        if (checksum(trim3) == split[0].charAt(14) - '0') {
                            result4.number = trim3;
                        }
                        String replace3 = split[1].substring(0, 6).replace('O', '0').replace('I', '1');
                        if (checksum(replace3) == getNumber(split[1].charAt(6))) {
                            parseBirthDate(replace3, result4);
                        }
                        result4.gender = parseGender(split[1].charAt(7));
                        String replace4 = split[1].substring(8, 14).replace('O', '0').replace('I', '1');
                        if (checksum(replace4) == getNumber(split[1].charAt(14)) || split[1].charAt(14) == '<') {
                            parseExpiryDate(replace4, result4);
                        }
                        result4.nationality = split[1].substring(15, 18);
                        int indexOf2 = split[2].indexOf("<<");
                        if (indexOf2 != -1) {
                            result4.lastName = split[2].substring(0, indexOf2).replace('<', ' ').trim();
                            result4.firstName = split[2].substring(indexOf2 + 2).replace('<', ' ').trim();
                        }
                    } else if (split.length == 2 && split[0].length() == 36) {
                        String substring = split[0].substring(2, 5);
                        result4.issuingCountry = substring;
                        if ("FRA".equals(substring) && charAt == 'I' && split[0].charAt(1) == 'D') {
                            result4.nationality = "FRA";
                            result4.lastName = split[0].substring(5, 30).replace('<', ' ').trim();
                            result4.firstName = split[1].substring(13, 27).replace("<<", ", ").replace('<', ' ').trim();
                            String replace5 = split[1].substring(0, 12).replace('O', '0');
                            if (checksum(replace5) == getNumber(split[1].charAt(12))) {
                                result4.number = replace5;
                            }
                            String replace6 = split[1].substring(27, 33).replace('O', '0').replace('I', '1');
                            if (checksum(replace6) == getNumber(split[1].charAt(33))) {
                                parseBirthDate(replace6, result4);
                            }
                            result4.gender = parseGender(split[1].charAt(34));
                            result4.doesNotExpire = true;
                        } else {
                            int indexOf3 = split[0].indexOf("<<");
                            if (indexOf3 != -1) {
                                result4.lastName = split[0].substring(5, indexOf3).replace('<', ' ').trim();
                                result4.firstName = split[0].substring(indexOf3 + 2).replace('<', ' ').trim();
                            }
                            String trim4 = split[1].substring(0, 9).replace('<', ' ').replace('O', '0').trim();
                            if (checksum(trim4) == getNumber(split[1].charAt(9))) {
                                result4.number = trim4;
                            }
                            result4.nationality = split[1].substring(10, 13);
                            String replace7 = split[1].substring(13, 19).replace('O', '0').replace('I', '1');
                            if (checksum(replace7) == getNumber(split[1].charAt(19))) {
                                parseBirthDate(replace7, result4);
                            }
                            result4.gender = parseGender(split[1].charAt(20));
                            String replace8 = split[1].substring(21, 27).replace('O', '0').replace('I', '1');
                            if (checksum(replace8) == getNumber(split[1].charAt(27)) || split[1].charAt(27) == '<') {
                                parseExpiryDate(replace8, result4);
                            }
                        }
                    }
                    result4.firstName = capitalize(result4.firstName.replace('0', 'O').replace('8', 'B'));
                    result4.lastName = capitalize(result4.lastName.replace('0', 'O').replace('8', 'B'));
                }
                if (TextUtils.isEmpty(result4.firstName) && TextUtils.isEmpty(result4.lastName)) {
                    return result3;
                }
                result4.issuingCountry = countriesMap.get(result4.issuingCountry);
                result4.nationality = countriesMap.get(result4.nationality);
                return result4;
            }
        }
        createScaledBitmap2 = bitmap2;
        i10 = 1;
        Result result5 = null;
        Bitmap bitmap32 = null;
        Rect[][] rectArr4 = null;
        i11 = 0;
        i12 = 0;
        int i152 = 0;
        while (true) {
            if (i11 < 3) {
            }
            i11++;
            i10 = 1;
        }
        if (i12 >= 30) {
        }
        return null;
    }

    private static String russianPassportTranslit(String str) {
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            int indexOf = "ABVGDE2JZIQKLMNOPRSTUFHC34WXY9678".indexOf(charArray[i10]);
            if (indexOf != -1) {
                charArray[i10] = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".charAt(indexOf);
            }
        }
        return new String(charArray);
    }

    private static native void setYuvBitmapPixels(Bitmap bitmap, byte[] bArr);

    public static Result recognize(byte[] bArr, int i10, int i11, int i12) {
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        setYuvBitmapPixels(createBitmap, bArr);
        Matrix matrix = new Matrix();
        matrix.setRotate(i12);
        int min = Math.min(i10, i11);
        int round = Math.round(min * 0.704f);
        boolean z10 = i12 == 90 || i12 == 270;
        return recognize(Bitmap.createBitmap(createBitmap, z10 ? (i10 / 2) - (round / 2) : 0, z10 ? 0 : (i11 / 2) - (round / 2), z10 ? round : min, z10 ? min : round, matrix, false), false);
    }
}
