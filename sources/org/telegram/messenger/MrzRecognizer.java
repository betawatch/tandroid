package org.telegram.messenger;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Base64;
import android.util.SparseArray;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import java.util.Calendar;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class MrzRecognizer {

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

    private static native int[] findCornerPoints(Bitmap bitmap);

    private static int getNumber(char c) {
        if (c == 'O') {
            return 0;
        }
        if (c == 'I') {
            return 1;
        }
        if (c == 'B') {
            return 8;
        }
        return c - '0';
    }

    private static int parseGender(char c) {
        if (c != 'F') {
            return c != 'M' ? 0 : 1;
        }
        return 2;
    }

    private static native String performRecognition(Bitmap bitmap, int i, int i2, AssetManager assetManager);

    private static native void setYuvBitmapPixels(Bitmap bitmap, byte[] bArr);

    public static Result recognize(Bitmap bitmap, boolean z) {
        Result recognizeBarcode;
        Result recognizeBarcode2;
        if (z && (recognizeBarcode2 = recognizeBarcode(bitmap)) != null) {
            return recognizeBarcode2;
        }
        try {
            Result recognizeMRZ = recognizeMRZ(bitmap);
            if (recognizeMRZ != null) {
                return recognizeMRZ;
            }
        } catch (Exception unused) {
        }
        if (z || (recognizeBarcode = recognizeBarcode(bitmap)) == null) {
            return null;
        }
        return recognizeBarcode;
    }

    private static Result recognizeBarcode(Bitmap bitmap) {
        BarcodeDetector build = new BarcodeDetector.Builder(ApplicationLoader.applicationContext).build();
        if (bitmap.getWidth() > 1500 || bitmap.getHeight() > 1500) {
            float max = 1500.0f / Math.max(bitmap.getWidth(), bitmap.getHeight());
            bitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * max), Math.round(bitmap.getHeight() * max), true);
        }
        SparseArray detect = build.detect(new Frame.Builder().setBitmap(bitmap).build());
        int i = 0;
        for (int i2 = 0; i2 < detect.size(); i2++) {
            Barcode barcode = (Barcode) detect.valueAt(i2);
            int i3 = barcode.valueFormat;
            int i4 = 6;
            int i5 = 4;
            if (i3 == 12 && barcode.driverLicense != null) {
                Result result = new Result();
                result.type = "ID".equals(barcode.driverLicense.documentType) ? 2 : 4;
                String str = barcode.driverLicense.issuingCountry;
                str.getClass();
                if (str.equals("CAN")) {
                    result.issuingCountry = "CA";
                    result.nationality = "CA";
                } else if (str.equals("USA")) {
                    result.issuingCountry = "US";
                    result.nationality = "US";
                }
                result.firstName = capitalize(barcode.driverLicense.firstName);
                result.lastName = capitalize(barcode.driverLicense.lastName);
                result.middleName = capitalize(barcode.driverLicense.middleName);
                Barcode.DriverLicense driverLicense = barcode.driverLicense;
                result.number = driverLicense.licenseNumber;
                String str2 = driverLicense.gender;
                if (str2 != null) {
                    if (str2.equals("1")) {
                        result.gender = 1;
                    } else if (str2.equals("2")) {
                        result.gender = 2;
                    }
                }
                if ("USA".equals(result.issuingCountry)) {
                    i = 4;
                    i4 = 2;
                    i5 = 0;
                }
                try {
                    String str3 = barcode.driverLicense.birthDate;
                    if (str3 != null && str3.length() == 8) {
                        result.birthYear = Integer.parseInt(barcode.driverLicense.birthDate.substring(i, i + 4));
                        result.birthMonth = Integer.parseInt(barcode.driverLicense.birthDate.substring(i5, i5 + 2));
                        result.birthDay = Integer.parseInt(barcode.driverLicense.birthDate.substring(i4, i4 + 2));
                    }
                    String str4 = barcode.driverLicense.expiryDate;
                    if (str4 != null && str4.length() == 8) {
                        result.expiryYear = Integer.parseInt(barcode.driverLicense.expiryDate.substring(i, i + 4));
                        result.expiryMonth = Integer.parseInt(barcode.driverLicense.expiryDate.substring(i5, i5 + 2));
                        result.expiryDay = Integer.parseInt(barcode.driverLicense.expiryDate.substring(i4, i4 + 2));
                    }
                } catch (NumberFormatException unused) {
                }
                return result;
            }
            if (i3 == 7 && barcode.format == 2048 && barcode.rawValue.matches("^[A-Za-z0-9=]+$")) {
                try {
                    String[] split = new String(Base64.decode(barcode.rawValue, 0), "windows-1251").split("\\|");
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

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0487, code lost:
    
        r3.middleName = cyrillicToLatin(russianPassportTranslit(r1[1]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0493, code lost:
    
        r3.lastName = cyrillicToLatin(russianPassportTranslit(r3.lastName));
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x04a1, code lost:
    
        if (r3.number == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x04a3, code lost:
    
        r3.number = r3.number.substring(0, 3) + r0[1].charAt(28) + r3.number.substring(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x04e4, code lost:
    
        r3.lastName = capitalize(r3.lastName);
        r3.firstName = capitalize(r3.firstName);
        r3.middleName = capitalize(r3.middleName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x04d0, code lost:
    
        r3.firstName = r3.firstName.replace('8', 'B');
        r3.lastName = r3.lastName.replace('8', 'B');
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0452, code lost:
    
        parseExpiryDate(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0785, code lost:
    
        if (android.text.TextUtils.isEmpty(r3.firstName) == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x078d, code lost:
    
        if (android.text.TextUtils.isEmpty(r3.lastName) == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x078f, code lost:
    
        return r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0790, code lost:
    
        r3.issuingCountry = r2.get(r3.issuingCountry);
        r3.nationality = r2.get(r3.nationality);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x07a4, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x04fe, code lost:
    
        if (r4 == 'I') goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0502, code lost:
    
        if (r4 == 'A') goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0506, code lost:
    
        if (r4 != 'C') goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x050a, code lost:
    
        return r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x050b, code lost:
    
        r3.type = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x050f, code lost:
    
        if (r0.length != 3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x051a, code lost:
    
        if (r0[0].length() != 30) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0522, code lost:
    
        if (r0[2].length() != 30) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0524, code lost:
    
        r3.issuingCountry = r0[0].substring(2, 5);
        r1 = r0[0].substring(5, 14).replace('<', ' ').replace('O', '0').trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x054c, code lost:
    
        if (checksum(r1) != (r0[0].charAt(14) - '0')) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x054e, code lost:
    
        r3.number = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0550, code lost:
    
        r1 = r0[1].substring(0, 6).replace('O', '0').replace('I', '1');
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x056f, code lost:
    
        if (checksum(r1) != getNumber(r0[1].charAt(6))) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0571, code lost:
    
        parseBirthDate(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0574, code lost:
    
        r3.gender = parseGender(r0[1].charAt(7));
        r1 = r0[1].substring(8, 14).replace('O', '0').replace('I', '1');
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x059f, code lost:
    
        if (checksum(r1) == getNumber(r0[1].charAt(14))) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x05a7, code lost:
    
        if (r0[1].charAt(14) != '<') goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x05ac, code lost:
    
        r3.nationality = r0[1].substring(15, 18);
        r1 = r0[2].indexOf("<<");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x05c0, code lost:
    
        if (r1 == (-1)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x05c2, code lost:
    
        r3.lastName = r0[2].substring(0, r1).replace('<', ' ').trim();
        r3.firstName = r0[2].substring(r1 + 2).replace('<', ' ').trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x075b, code lost:
    
        r3.firstName = capitalize(r3.firstName.replace('0', 'O').replace('8', 'B'));
        r3.lastName = capitalize(r3.lastName.replace('0', 'O').replace('8', 'B'));
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x05a9, code lost:
    
        parseExpiryDate(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x05e7, code lost:
    
        if (r0.length != 2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x05f3, code lost:
    
        if (r0[0].length() != 36) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x05f5, code lost:
    
        r1 = r0[0].substring(2, 5);
        r3.issuingCountry = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0604, code lost:
    
        if ("FRA".equals(r1) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0606, code lost:
    
        if (r4 != 'I') goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0611, code lost:
    
        if (r0[0].charAt(1) != 'D') goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0613, code lost:
    
        r3.nationality = "FRA";
        r3.lastName = r0[0].substring(5, 30).replace('<', ' ').trim();
        r3.firstName = r0[1].substring(13, 27).replace("<<", ", ").replace('<', ' ').trim();
        r1 = r0[1].substring(0, 12).replace('O', '0');
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x065f, code lost:
    
        if (checksum(r1) != getNumber(r0[1].charAt(12))) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0661, code lost:
    
        r3.number = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0663, code lost:
    
        r1 = r0[1].substring(27, 33).replace('O', '0').replace('I', '1');
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0685, code lost:
    
        if (checksum(r1) != getNumber(r0[1].charAt(33))) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0687, code lost:
    
        parseBirthDate(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x068a, code lost:
    
        r3.gender = parseGender(r0[1].charAt(34));
        r3.doesNotExpire = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x069c, code lost:
    
        r1 = r0[0].indexOf("<<");
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x06a4, code lost:
    
        if (r1 == (-1)) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x06a6, code lost:
    
        r3.lastName = r0[0].substring(5, r1).replace('<', ' ').trim();
        r3.firstName = r0[0].substring(r1 + 2).replace('<', ' ').trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x06cb, code lost:
    
        r1 = r0[1].substring(0, 9).replace('<', ' ').replace('O', '0').trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x06ef, code lost:
    
        if (checksum(r1) != getNumber(r0[1].charAt(9))) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x06f1, code lost:
    
        r3.number = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x06f3, code lost:
    
        r3.nationality = r0[1].substring(10, 13);
        r1 = r0[1].substring(13, 19).replace('O', '0').replace('I', '1');
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x071b, code lost:
    
        if (checksum(r1) != getNumber(r0[1].charAt(19))) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x071d, code lost:
    
        parseBirthDate(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0720, code lost:
    
        r3.gender = parseGender(r0[1].charAt(20));
        r1 = r0[1].substring(21, 27).replace('O', '0').replace('I', '1');
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x074e, code lost:
    
        if (checksum(r1) == getNumber(r0[1].charAt(27))) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0756, code lost:
    
        if (r0[1].charAt(27) != '<') goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0758, code lost:
    
        parseExpiryDate(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:?, code lost:
    
        return r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:?, code lost:
    
        return r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:?, code lost:
    
        return r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x07a5, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x028e, code lost:
    
        if (r5 < 30) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0290, code lost:
    
        if (r14 >= r10) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0296, code lost:
    
        r3 = android.graphics.Bitmap.createBitmap(r9[r24].length * 10, r9.length * 15, android.graphics.Bitmap.Config.ALPHA_8);
        r5 = new android.graphics.Canvas(r3);
        r6 = new android.graphics.Paint(2);
        r7 = new android.graphics.Rect(0, 0, 10, 15);
        r10 = r9.length;
        r13 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02bc, code lost:
    
        if (r13 >= r10) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02be, code lost:
    
        r37 = r0;
        r0 = r9[r13];
        r4 = r0.length;
        r11 = 0;
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02c8, code lost:
    
        if (r11 >= r4) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02ca, code lost:
    
        r12 = r0[r11];
        r15 = r16 * 10;
        r23 = r0;
        r0 = r14 * 15;
        r7.set(r15, r0, r15 + 10, r0 + 15);
        r5.drawBitmap(r8, r12, r7, r6);
        r16 = r16 + 1;
        r11 = r11 + 1;
        r0 = r23;
        r4 = r4;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02f3, code lost:
    
        r14 = r14 + 1;
        r13 = r13 + 1;
        r0 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0304, code lost:
    
        r37 = r0;
        r0 = performRecognition(r3, r9.length, r9[0].length, org.telegram.messenger.ApplicationLoader.applicationContext.getAssets());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0316, code lost:
    
        if (r0 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0318, code lost:
    
        return r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0319, code lost:
    
        r0 = android.text.TextUtils.split(r0, "\n");
        r3 = new org.telegram.messenger.MrzRecognizer.Result();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0324, code lost:
    
        if (r0.length < 2) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x032f, code lost:
    
        if (r0[0].length() < 30) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x033f, code lost:
    
        if (r0[1].length() != r0[0].length()) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0341, code lost:
    
        r3.rawMRZ = android.text.TextUtils.join("\n", r0);
        r2 = getCountriesMap();
        r4 = r0[0].charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0363, code lost:
    
        if (r4 != 'P') goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0365, code lost:
    
        r3.type = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0371, code lost:
    
        if (r0[0].length() != 44) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0373, code lost:
    
        r3.issuingCountry = r0[0].substring(2, 5);
        r5 = r0[0].indexOf("<<", 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0385, code lost:
    
        if (r5 == (-1)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0387, code lost:
    
        r3.lastName = r0[0].substring(5, r5).replace('<', ' ').replace('0', 'O').trim();
        r5 = r0[0].substring(r5 + 2).replace('<', ' ').replace('0', 'O').trim();
        r3.firstName = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03b7, code lost:
    
        if (r5.contains("   ") == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03b9, code lost:
    
        r5 = r3.firstName;
        r3.firstName = r5.substring(0, r5.indexOf("   "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x03c5, code lost:
    
        r1 = r0[1].substring(0, 9).replace('<', ' ').replace('O', '0').trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03e9, code lost:
    
        if (checksum(r1) != getNumber(r0[1].charAt(9))) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x03eb, code lost:
    
        r3.number = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03ed, code lost:
    
        r3.nationality = r0[1].substring(10, 13);
        r1 = r0[1].substring(13, 19).replace('O', '0').replace('I', '1');
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0415, code lost:
    
        if (checksum(r1) != getNumber(r0[1].charAt(19))) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0417, code lost:
    
        parseBirthDate(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x041a, code lost:
    
        r3.gender = parseGender(r0[1].charAt(20));
        r1 = r0[1].substring(21, 27).replace('O', '0').replace('I', '1');
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0448, code lost:
    
        if (checksum(r1) == getNumber(r0[1].charAt(27))) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0450, code lost:
    
        if (r0[1].charAt(27) != '<') goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x045d, code lost:
    
        if ("RUS".equals(r3.issuingCountry) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x046a, code lost:
    
        if (r0[0].charAt(1) != 'N') goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x046c, code lost:
    
        r3.type = 3;
        r1 = r3.firstName.split(" ");
        r3.firstName = cyrillicToLatin(russianPassportTranslit(r1[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0485, code lost:
    
        if (r1.length <= 1) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:185:0x028d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Result recognizeMRZ(Bitmap bitmap) {
        float max;
        char c;
        Bitmap createScaledBitmap;
        char c2;
        int i;
        Bitmap createScaledBitmap2;
        int i2;
        int i3;
        Matrix matrix;
        if (bitmap.getWidth() > 512 || bitmap.getHeight() > 512) {
            max = 512.0f / Math.max(bitmap.getWidth(), bitmap.getHeight());
            c = 6;
            createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * max), Math.round(bitmap.getHeight() * max), true);
        } else {
            createScaledBitmap = bitmap;
            max = 1.0f;
            c = 6;
        }
        int[] findCornerPoints = findCornerPoints(createScaledBitmap);
        float f = 1.0f / max;
        if (findCornerPoints != null) {
            Point point = new Point(findCornerPoints[0], findCornerPoints[1]);
            Point point2 = new Point(findCornerPoints[2], findCornerPoints[3]);
            Point point3 = new Point(findCornerPoints[4], findCornerPoints[5]);
            Point point4 = new Point(findCornerPoints[c], findCornerPoints[7]);
            if (point2.x < point.x) {
                point4 = point3;
                point3 = point4;
            } else {
                point2 = point;
                point = point2;
            }
            c2 = 0;
            double hypot = Math.hypot(point.x - point2.x, point.y - point2.y);
            double hypot2 = Math.hypot(point4.x - point3.x, point4.y - point3.y);
            Point point5 = point3;
            double hypot3 = Math.hypot(point3.x - point2.x, point3.y - point2.y);
            double hypot4 = Math.hypot(point4.x - point.x, point4.y - point.y);
            double d = hypot / hypot3;
            double d2 = hypot / hypot4;
            double d3 = hypot2 / hypot3;
            double d4 = hypot2 / hypot4;
            if (d >= 1.35d && d <= 1.75d && d3 >= 1.35d && d3 <= 1.75d && d2 >= 1.35d && d2 <= 1.75d && d4 >= 1.35d && d4 <= 1.75d) {
                Bitmap createBitmap = Bitmap.createBitmap(1024, (int) Math.round(1024.0d / ((((d + d2) + d3) + d4) / 4.0d)), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                float width = createBitmap.getWidth();
                float width2 = createBitmap.getWidth();
                float height = createBitmap.getHeight();
                float height2 = createBitmap.getHeight();
                float[] fArr = new float[8];
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = width;
                fArr[3] = 0.0f;
                fArr[4] = width2;
                fArr[5] = height;
                fArr[c] = 0.0f;
                fArr[7] = height2;
                float f2 = point2.x * f;
                float f3 = point2.y * f;
                float f4 = point.x * f;
                float f5 = point.y * f;
                float f6 = point4.x * f;
                float f7 = point4.y * f;
                float f8 = point5.x * f;
                float f9 = point5.y * f;
                float[] fArr2 = new float[8];
                fArr2[0] = f2;
                fArr2[1] = f3;
                fArr2[2] = f4;
                fArr2[3] = f5;
                fArr2[4] = f6;
                fArr2[5] = f7;
                fArr2[c] = f8;
                fArr2[7] = f9;
                Matrix matrix2 = new Matrix();
                matrix2.setPolyToPoly(fArr2, 0, fArr, 0, 4);
                canvas.drawBitmap(bitmap, matrix2, new Paint(2));
                createScaledBitmap2 = createBitmap;
                i = 1;
                Result result = null;
                Bitmap bitmap2 = null;
                Rect[][] rectArr = null;
                i2 = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i2 >= 3) {
                        i3 = 2;
                        break;
                    }
                    if (i2 == i) {
                        Matrix matrix3 = new Matrix();
                        matrix3.setRotate(1.0f, createScaledBitmap2.getWidth() / 2, createScaledBitmap2.getHeight() / 2);
                        matrix = matrix3;
                    } else if (i2 != 2) {
                        matrix = null;
                    } else {
                        Matrix matrix4 = new Matrix();
                        matrix4.setRotate(-1.0f, createScaledBitmap2.getWidth() / 2, createScaledBitmap2.getHeight() / 2);
                        matrix = matrix4;
                    }
                    Bitmap createBitmap2 = matrix != null ? Bitmap.createBitmap(createScaledBitmap2, 0, 0, createScaledBitmap2.getWidth(), createScaledBitmap2.getHeight(), matrix, true) : createScaledBitmap2;
                    bitmap2 = Bitmap.createBitmap(createBitmap2.getWidth(), createBitmap2.getHeight(), Bitmap.Config.ALPHA_8);
                    rectArr = binarizeAndFindCharacters(createBitmap2, bitmap2);
                    if (rectArr == null) {
                        return null;
                    }
                    for (Rect[] rectArr2 : rectArr) {
                        i4 = Math.max(rectArr2.length, i4);
                        if (rectArr2.length > 0) {
                            i5++;
                        }
                    }
                    i3 = 2;
                    if (i5 >= 2 && i4 >= 30) {
                        break;
                    }
                    i2++;
                    i = 1;
                }
            }
        } else {
            c2 = 0;
            if (bitmap.getWidth() > 1500 || bitmap.getHeight() > 1500) {
                float max2 = 1500.0f / Math.max(bitmap.getWidth(), bitmap.getHeight());
                i = 1;
                createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * max2), Math.round(bitmap.getHeight() * max2), true);
                Result result2 = null;
                Bitmap bitmap22 = null;
                Rect[][] rectArr3 = null;
                i2 = 0;
                int i42 = 0;
                int i52 = 0;
                while (true) {
                    if (i2 >= 3) {
                    }
                    i2++;
                    i = 1;
                }
            }
        }
        createScaledBitmap2 = bitmap;
        i = 1;
        Result result22 = null;
        Bitmap bitmap222 = null;
        Rect[][] rectArr32 = null;
        i2 = 0;
        int i422 = 0;
        int i522 = 0;
        while (true) {
            if (i2 >= 3) {
            }
            i2++;
            i = 1;
        }
    }

    public static Result recognize(byte[] bArr, int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        setYuvBitmapPixels(createBitmap, bArr);
        Matrix matrix = new Matrix();
        matrix.setRotate(i3);
        int min = Math.min(i, i2);
        int round = Math.round(min * 0.704f);
        boolean z = i3 == 90 || i3 == 270;
        return recognize(Bitmap.createBitmap(createBitmap, z ? (i / 2) - (round / 2) : 0, z ? 0 : (i2 / 2) - (round / 2), z ? round : min, z ? min : round, matrix, false), false);
    }

    private static String capitalize(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        boolean z = true;
        for (int i = 0; i < charArray.length; i++) {
            if (!z && Character.isLetter(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            } else {
                z = charArray[i] == ' ';
            }
        }
        return new String(charArray);
    }

    private static int checksum(String str) {
        char[] charArray = str.toCharArray();
        int[] iArr = {7, 3, 1};
        int i = 0;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            i += ((c < '0' || c > '9') ? (c < 'A' || c > 'Z') ? 0 : c - '7' : c - '0') * iArr[i2 % 3];
        }
        return i % 10;
    }

    private static void parseBirthDate(String str, Result result) {
        try {
            int parseInt = Integer.parseInt(str.substring(0, 2));
            result.birthYear = parseInt;
            result.birthYear += parseInt < (Calendar.getInstance().get(1) % 100) + (-5) ? 2000 : 1900;
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

    private static String russianPassportTranslit(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int indexOf = "ABVGDE2JZIQKLMNOPRSTUFHC34WXY9678".indexOf(charArray[i]);
            if (indexOf != -1) {
                charArray[i] = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".charAt(indexOf);
            }
        }
        return new String(charArray);
    }

    private static String cyrillicToLatin(String str) {
        String[] strArr = {"A", "B", "V", "G", "D", "E", "E", "ZH", "Z", "I", "I", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F", "KH", "TS", "CH", "SH", "SHCH", "IE", "Y", "", "E", "IU", "IA"};
        String str2 = str;
        int i = 0;
        while (i < 33) {
            int i2 = i + 1;
            str2 = str2.replace("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ".substring(i, i2), strArr[i]);
            i = i2;
        }
        return str2;
    }

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
}
