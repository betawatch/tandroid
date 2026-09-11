package lf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bf.p;
import com.google.firebase.messaging.d;
import i2.g;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a extends kf.a {
    public static final Logger s = Logger.getLogger(a.class.getName());
    public final Level r;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0435 A[Catch: Exception -> 0x0418, TryCatch #0 {Exception -> 0x0418, blocks: (B:109:0x03f7, B:111:0x0413, B:114:0x042b, B:116:0x0435, B:118:0x044c, B:119:0x0469, B:121:0x046d, B:122:0x0465, B:126:0x041a, B:128:0x0422), top: B:108:0x03f7 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(BufferedInputStream bufferedInputStream) {
        b c10;
        char c11;
        DataInputStream dataInputStream;
        char c12;
        Bitmap decodeByteArray;
        Level level = Level.FINEST;
        this.r = level;
        ?? r62 = 1;
        b bVar = new b(new d((FilterInputStream) bufferedInputStream), null, "", 1 == true ? 1 : 0);
        Logger logger = s;
        if (logger.isLoggable(level)) {
            logger.log(level, bVar.toString());
        }
        b d = bVar.d("ftyp");
        DataInputStream dataInputStream2 = (DataInputStream) d.e;
        if (logger.isLoggable(level)) {
            logger.log(level, d.toString());
        }
        int i10 = 4;
        byte[] bArr = new byte[4];
        dataInputStream2.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        int indexOf = str.indexOf(0);
        String trim = (indexOf >= 0 ? str.substring(0, indexOf) : str).trim();
        this.a = trim;
        if (trim.matches("M4V|MP4|mp42|isom")) {
            StringBuilder sb2 = new StringBuilder();
            StringBuffer stringBuffer = new StringBuffer();
            b.h(stringBuffer, d);
            sb2.append(stringBuffer.toString());
            sb2.append(": brand=");
            sb2.append(this.a);
            sb2.append(" (experimental)");
            logger.warning(sb2.toString());
        } else if (!this.a.matches("M4A|M4P")) {
            StringBuilder sb3 = new StringBuilder();
            StringBuffer stringBuffer2 = new StringBuffer();
            b.h(stringBuffer2, d);
            sb3.append(stringBuffer2.toString());
            sb3.append(": brand=");
            sb3.append(this.a);
            sb3.append(" (expected M4A or M4P)");
            logger.warning(sb3.toString());
        }
        String.valueOf(dataInputStream2.readInt());
        do {
            c10 = bVar.c();
        } while (!((String) c10.d).matches("moov"));
        Level level2 = this.r;
        if (logger.isLoggable(level2)) {
            logger.log(level2, c10.toString());
        }
        while (c10.j()) {
            b c13 = c10.c();
            DataInputStream dataInputStream3 = (DataInputStream) c13.e;
            String str2 = (String) c13.d;
            int i11 = 2;
            switch (str2.hashCode()) {
                case 3363941:
                    if (str2.equals("mvhd")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3568424:
                    if (str2.equals("trak")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3585340:
                    if (str2.equals("udta")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, c13.toString());
                    }
                    byte readByte = dataInputStream3.readByte();
                    c13.n(3);
                    c13.n(readByte == r62 ? 16 : 8);
                    int readInt = dataInputStream3.readInt();
                    long readLong = readByte == r62 ? dataInputStream3.readLong() : dataInputStream3.readInt();
                    if (this.b == 0) {
                        this.b = (readLong * 1000) / readInt;
                    } else if (logger.isLoggable(level2)) {
                        dataInputStream = dataInputStream3;
                        long j3 = (readLong * 1000) / readInt;
                        if (Math.abs(this.b - j3) > 2) {
                            logger.log(level2, "mvhd: duration " + this.b + " -> " + j3);
                        }
                        new BigDecimal(String.valueOf((int) dataInputStream.readShort()) + "" + String.valueOf(dataInputStream.readUnsignedShort()));
                        new BigDecimal(String.valueOf((int) dataInputStream.readByte()) + "" + String.valueOf(dataInputStream.readUnsignedByte()));
                        break;
                    }
                    dataInputStream = dataInputStream3;
                    new BigDecimal(String.valueOf((int) dataInputStream.readShort()) + "" + String.valueOf(dataInputStream.readUnsignedShort()));
                    new BigDecimal(String.valueOf((int) dataInputStream.readByte()) + "" + String.valueOf(dataInputStream.readUnsignedByte()));
                case 1:
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, c13.toString());
                    }
                    b k10 = c13.k("mdia");
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, k10.toString());
                    }
                    b d10 = k10.d("mdhd");
                    DataInputStream dataInputStream4 = (DataInputStream) d10.e;
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, d10.toString());
                    }
                    byte readByte2 = dataInputStream4.readByte();
                    d10.n(3);
                    d10.n(readByte2 == r62 ? 16 : 8);
                    int readInt2 = dataInputStream4.readInt();
                    long readLong2 = readByte2 == r62 ? dataInputStream4.readLong() : dataInputStream4.readInt();
                    if (this.b == 0) {
                        this.b = (readLong2 * 1000) / readInt2;
                        break;
                    } else if (logger.isLoggable(level2)) {
                        long j10 = (readLong2 * 1000) / readInt2;
                        if (Math.abs(this.b - j10) > 2) {
                            logger.log(level2, "mdhd: duration " + this.b + " -> " + j10);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                case 2:
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, c13.toString());
                    }
                    while (true) {
                        if (c13.j()) {
                            b c14 = c13.c();
                            if ("meta".equals((String) c14.d)) {
                                if (logger.isLoggable(level2)) {
                                    logger.log(level2, c14.toString());
                                }
                                c14.n(i10);
                                while (true) {
                                    if (c14.j()) {
                                        b c15 = c14.c();
                                        if ("ilst".equals((String) c15.d)) {
                                            if (logger.isLoggable(level2)) {
                                                logger.log(level2, c15.toString());
                                            }
                                            while (c15.j()) {
                                                b c16 = c15.c();
                                                if (logger.isLoggable(level2)) {
                                                    logger.log(level2, c16.toString());
                                                }
                                                if (c16.i() != 0) {
                                                    b k11 = c16.k("data");
                                                    DataInputStream dataInputStream5 = (DataInputStream) k11.e;
                                                    if (logger.isLoggable(level2)) {
                                                        logger.log(level2, k11.toString());
                                                    }
                                                    k11.n(i10);
                                                    k11.n(i10);
                                                    String str3 = (String) ((p) k11.c).d;
                                                    switch (str3.hashCode()) {
                                                        case 2954818:
                                                            if (str3.equals("aART")) {
                                                                c12 = 0;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 3059752:
                                                            if (str3.equals("covr")) {
                                                                c12 = 1;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 3060304:
                                                            if (str3.equals("cpil")) {
                                                                c12 = 2;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 3060591:
                                                            if (str3.equals("cprt")) {
                                                                c12 = 3;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 3083677:
                                                            if (str3.equals("disk")) {
                                                                c12 = 4;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 3177818:
                                                            if (str3.equals("gnre")) {
                                                                c12 = 5;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 3511163:
                                                            if (str3.equals("rtng")) {
                                                                c12 = 6;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 3564088:
                                                            if (str3.equals("tmpo")) {
                                                                c12 = 7;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 3568737:
                                                            if (str3.equals("trkn")) {
                                                                c12 = '\b';
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 5099770:
                                                            if (str3.equals("©ART")) {
                                                                c12 = '\t';
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 5131342:
                                                            if (str3.equals("©alb")) {
                                                                c12 = '\n';
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 5133313:
                                                            if (str3.equals("©cmt")) {
                                                                c12 = 11;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 5133368:
                                                            if (str3.equals("©com")) {
                                                                c12 = '\f';
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 5133411:
                                                            if (str3.equals("©cpy")) {
                                                                c12 = '\r';
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 5133907:
                                                            if (str3.equals("©day")) {
                                                                c12 = 14;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 5136903:
                                                            if (str3.equals("©gen")) {
                                                                c12 = 15;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 5137308:
                                                            if (str3.equals("©grp")) {
                                                                c12 = 16;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 5142332:
                                                            if (str3.equals("©lyr")) {
                                                                c12 = 17;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 5143505:
                                                            if (str3.equals("©nam")) {
                                                                c12 = 18;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 5152688:
                                                            if (str3.equals("©wrt")) {
                                                                c12 = 19;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        default:
                                                            c12 = 65535;
                                                            break;
                                                    }
                                                    switch (c12) {
                                                        case 0:
                                                            this.e = k11.m();
                                                            break;
                                                        case 1:
                                                            try {
                                                                int i12 = (int) k11.i();
                                                                byte[] bArr2 = new byte[i12];
                                                                dataInputStream5.readFully(bArr2);
                                                                BitmapFactory.Options options = new BitmapFactory.Options();
                                                                options.inJustDecodeBounds = r62;
                                                                options.inSampleSize = r62;
                                                                BitmapFactory.decodeByteArray(bArr2, 0, i12, options);
                                                                int i13 = options.outWidth;
                                                                if (i13 <= 800) {
                                                                    if (options.outHeight > 800) {
                                                                    }
                                                                    options.inJustDecodeBounds = false;
                                                                    decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i12, options);
                                                                    this.o = decodeByteArray;
                                                                    if (decodeByteArray != null) {
                                                                        float max = Math.max(decodeByteArray.getWidth(), this.o.getHeight()) / 120.0f;
                                                                        if (max > 0.0f) {
                                                                            this.p = Bitmap.createScaledBitmap(this.o, (int) (r7.getWidth() / max), (int) (this.o.getHeight() / max), r62);
                                                                        } else {
                                                                            this.p = this.o;
                                                                        }
                                                                        if (this.p == null) {
                                                                            this.p = this.o;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                for (int max2 = Math.max(i13, options.outHeight); max2 > 800; max2 /= 2) {
                                                                    options.inSampleSize *= 2;
                                                                }
                                                                options.inJustDecodeBounds = false;
                                                                decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i12, options);
                                                                this.o = decodeByteArray;
                                                                if (decodeByteArray != null) {
                                                                }
                                                            } catch (Exception e7) {
                                                                e7.printStackTrace();
                                                                break;
                                                            }
                                                            break;
                                                        case 2:
                                                            dataInputStream5.readBoolean();
                                                            break;
                                                        case 3:
                                                        case '\r':
                                                            String str4 = this.l;
                                                            if (str4 == null || str4.trim().length() == 0) {
                                                                this.l = k11.m();
                                                            }
                                                            break;
                                                        case 4:
                                                            k11.n(i11);
                                                            this.k = dataInputStream5.readShort();
                                                            k11.l();
                                                            break;
                                                        case 5:
                                                            String str5 = this.h;
                                                            if (str5 == null || str5.trim().length() == 0) {
                                                                if (k11.i() == 2) {
                                                                    int a2 = g.a(dataInputStream5.readShort() - r62);
                                                                    if (a2 != 0) {
                                                                        this.h = g.c(a2);
                                                                    }
                                                                } else {
                                                                    this.h = k11.m();
                                                                }
                                                            }
                                                            break;
                                                        case 6:
                                                            dataInputStream5.readByte();
                                                            break;
                                                        case 7:
                                                            k11.l();
                                                            break;
                                                        case '\b':
                                                            k11.n(i11);
                                                            this.j = dataInputStream5.readShort();
                                                            k11.l();
                                                            break;
                                                        case '\t':
                                                            this.d = k11.m();
                                                            break;
                                                        case '\n':
                                                            this.f = k11.m();
                                                            break;
                                                        case 11:
                                                            this.i = k11.m();
                                                            break;
                                                        case '\f':
                                                        case 19:
                                                            String str6 = this.m;
                                                            if (str6 == null || str6.trim().length() == 0) {
                                                                this.m = k11.m();
                                                            }
                                                            break;
                                                        case 14:
                                                            String trim2 = k11.m().trim();
                                                            if (trim2.length() >= i10) {
                                                                try {
                                                                    this.g = Short.valueOf(trim2.substring(0, i10)).shortValue();
                                                                } catch (NumberFormatException unused) {
                                                                }
                                                            }
                                                            break;
                                                        case 15:
                                                            String str7 = this.h;
                                                            if (str7 == null || str7.trim().length() == 0) {
                                                                this.h = k11.m();
                                                            }
                                                            break;
                                                        case 16:
                                                            k11.m();
                                                            break;
                                                        case 17:
                                                            this.n = k11.m();
                                                            break;
                                                        case 18:
                                                            this.c = k11.m();
                                                            break;
                                                    }
                                                    i10 = 4;
                                                    i11 = 2;
                                                } else if (logger.isLoggable(level2)) {
                                                    StringBuilder sb4 = new StringBuilder();
                                                    StringBuffer stringBuffer3 = new StringBuffer();
                                                    b.h(stringBuffer3, c16);
                                                    sb4.append(stringBuffer3.toString());
                                                    sb4.append(": contains no value");
                                                    logger.log(level2, sb4.toString());
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
            }
            r62 = 1;
            i10 = 4;
        }
    }
}
