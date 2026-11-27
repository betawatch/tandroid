// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.EOFException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ij5 extends h00 {
    public static final Logger s = Logger.getLogger(ij5.class.getName());
    public byte r;

    public static boolean b(wi6 wi6Var) {
        boolean z;
        wi6Var.mark(3);
        try {
            if (wi6Var.read() == 73 && wi6Var.read() == 68) {
                if (wi6Var.read() == 51) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            wi6Var.reset();
        }
    }

    public static j5 c(gj5 gj5Var) {
        dj5 b = gj5Var.b();
        gj5Var.c(3, dj5.c);
        return new j5(gj5Var.d(jn7.d3, b), gj5Var.c((int) gj5Var.a.e(), b), (byte) 3, false);
    }

    public static String e(gj5 gj5Var) {
        return gj5Var.c((int) gj5Var.a.e(), gj5Var.b());
    }

    public final void d(gj5 gj5Var) {
        int i;
        int i2;
        hj5 hj5Var = gj5Var.c;
        Level level = Level.FINEST;
        Logger logger = s;
        if (logger.isLoggable(level)) {
            logger.log(level, "Parsing frame: " + hj5Var.a);
        }
        String str = hj5Var.a;
        str.getClass();
        i = 0;
        switch (str) {
            case "COM":
            case "COMM":
                j5 c = c(gj5Var);
                if (this.i == null || "".equals(c.b)) {
                    this.i = c.c;
                    return;
                }
                return;
            case "PIC":
            case "APIC":
                if (this.o == null || this.r != 3) {
                    dj5 b = gj5Var.b();
                    xh4 xh4Var = gj5Var.d;
                    if (gj5Var.b.a == 2) {
                        gj5Var.c(3, dj5.c).toUpperCase().getClass();
                    } else {
                        gj5Var.d(20, dj5.c);
                    }
                    byte J = xh4Var.J();
                    gj5Var.d(jn7.d3, b);
                    int e = (int) gj5Var.a.e();
                    byte[] bArr = new byte[e];
                    int i3 = 0;
                    while (i3 < e) {
                        int read = ((i51) xh4Var.b).read(bArr, i3, e - i3);
                        if (read <= 0) {
                            throw new EOFException();
                        }
                        i3 += read;
                    }
                    if (this.o == null || J == 3 || J == 0) {
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            options.inSampleSize = 1;
                            BitmapFactory.decodeByteArray(bArr, 0, e, options);
                            int i4 = options.outWidth;
                            if (i4 > 800 || options.outHeight > 800) {
                                for (int max = Math.max(i4, options.outHeight); max > 800; max /= 2) {
                                    options.inSampleSize <<= 1;
                                }
                            }
                            options.inJustDecodeBounds = false;
                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, e, options);
                            this.o = decodeByteArray;
                            if (decodeByteArray != null) {
                                float max2 = Math.max(decodeByteArray.getWidth(), this.o.getHeight()) / 120.0f;
                                Bitmap bitmap = this.o;
                                if (max2 > 0.0f) {
                                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / max2), (int) (this.o.getHeight() / max2), true);
                                    this.p = bitmap;
                                } else {
                                    this.p = bitmap;
                                }
                                if (bitmap == null) {
                                    this.p = this.o;
                                }
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        this.r = J;
                        return;
                    }
                    return;
                }
                return;
            case "TAL":
            case "TALB":
                this.f = e(gj5Var);
                return;
            case "TCM":
            case "TCOM":
                this.m = e(gj5Var);
                return;
            case "TCO":
            case "TCON":
                String e2 = e(gj5Var);
                if (e2.length() > 0) {
                    this.h = e2;
                    try {
                        if (e2.charAt(0) == '(') {
                            int indexOf = e2.indexOf(41);
                            if (indexOf > 1 && (i = qd4.b(Integer.parseInt(e2.substring(1, indexOf)))) == 0 && e2.length() > (i2 = indexOf + 1)) {
                                this.h = e2.substring(i2);
                            }
                        } else {
                            i = qd4.b(Integer.parseInt(e2));
                        }
                        if (i != 0) {
                            this.h = qd4.d(i);
                            return;
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        return;
                    }
                }
                return;
            case "TCP":
            case "TCMP":
                "1".equals(e(gj5Var));
                return;
            case "TCR":
            case "TCOP":
                this.l = e(gj5Var);
                return;
            case "TLE":
            case "TLEN":
                String e3 = e(gj5Var);
                try {
                    this.b = Long.valueOf(e3).longValue();
                    return;
                } catch (NumberFormatException unused2) {
                    if (logger.isLoggable(level)) {
                        logger.log(level, "Could not parse track duration: ".concat(e3));
                        return;
                    }
                    return;
                }
            case "TP1":
            case "TPE1":
                this.d = e(gj5Var);
                return;
            case "TP2":
            case "TPE2":
                this.e = e(gj5Var);
                return;
            case "TPA":
            case "TPOS":
                String e4 = e(gj5Var);
                if (e4.length() > 0) {
                    int indexOf2 = e4.indexOf(47);
                    if (indexOf2 < 0) {
                        try {
                            this.k = Short.valueOf(e4).shortValue();
                            return;
                        } catch (NumberFormatException unused3) {
                            if (logger.isLoggable(level)) {
                                logger.log(level, "Could not parse disc number: ".concat(e4));
                                return;
                            }
                            return;
                        }
                    }
                    try {
                        this.k = Short.valueOf(e4.substring(0, indexOf2)).shortValue();
                    } catch (NumberFormatException unused4) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse disc number: ".concat(e4));
                        }
                    }
                    try {
                        Short.valueOf(e4.substring(indexOf2 + 1));
                        return;
                    } catch (NumberFormatException unused5) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse number of discs: ".concat(e4));
                            return;
                        }
                        return;
                    }
                }
                return;
            case "TRK":
            case "TRCK":
                String e5 = e(gj5Var);
                if (e5.length() > 0) {
                    int indexOf3 = e5.indexOf(47);
                    if (indexOf3 < 0) {
                        try {
                            this.j = Short.valueOf(e5).shortValue();
                            return;
                        } catch (NumberFormatException unused6) {
                            if (logger.isLoggable(level)) {
                                logger.log(level, "Could not parse track number: ".concat(e5));
                                return;
                            }
                            return;
                        }
                    }
                    try {
                        this.j = Short.valueOf(e5.substring(0, indexOf3)).shortValue();
                    } catch (NumberFormatException unused7) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse track number: ".concat(e5));
                        }
                    }
                    try {
                        Short.valueOf(e5.substring(indexOf3 + 1));
                        return;
                    } catch (NumberFormatException unused8) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse number of tracks: ".concat(e5));
                            return;
                        }
                        return;
                    }
                }
                return;
            case "TT1":
            case "TIT1":
                e(gj5Var);
                return;
            case "TT2":
            case "TIT2":
                this.c = e(gj5Var);
                return;
            case "TYE":
            case "TYER":
                String e6 = e(gj5Var);
                if (e6.length() > 0) {
                    try {
                        this.g = Short.valueOf(e6).shortValue();
                        return;
                    } catch (NumberFormatException unused9) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse year: ".concat(e6));
                            return;
                        }
                        return;
                    }
                }
                return;
            case "ULT":
            case "USLT":
                if (this.n == null) {
                    this.n = c(gj5Var).c;
                    return;
                }
                return;
            case "TDRC":
                String e7 = e(gj5Var);
                if (e7.length() >= 4) {
                    try {
                        this.g = Short.valueOf(e7.substring(0, 4)).shortValue();
                        return;
                    } catch (NumberFormatException unused10) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse year from: ".concat(e7));
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }
}
