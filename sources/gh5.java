// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.EOFException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gh5 extends g00 {
    public static final Logger s = Logger.getLogger(gh5.class.getName());
    public byte r;

    public static boolean b(rg6 rg6Var) {
        boolean z;
        rg6Var.mark(3);
        try {
            if (rg6Var.read() == 73 && rg6Var.read() == 68) {
                if (rg6Var.read() == 51) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            rg6Var.reset();
        }
    }

    public static ce3 c(eh5 eh5Var) {
        bh5 b = eh5Var.b();
        eh5Var.c(3, bh5.c);
        return new ce3(eh5Var.d(kk7.d3, b), eh5Var.c((int) eh5Var.a.e(), b), (byte) 3);
    }

    public static String e(eh5 eh5Var) {
        return eh5Var.c((int) eh5Var.a.e(), eh5Var.b());
    }

    public final void d(eh5 eh5Var) {
        int i;
        int i2;
        fh5 fh5Var = eh5Var.c;
        Level level = Level.FINEST;
        Logger logger = s;
        if (logger.isLoggable(level)) {
            logger.log(level, "Parsing frame: " + fh5Var.a);
        }
        String str = fh5Var.a;
        str.getClass();
        i = 0;
        switch (str) {
            case "COM":
            case "COMM":
                ce3 c = c(eh5Var);
                if (this.i == null || "".equals(c.b)) {
                    this.i = c.c;
                    return;
                }
                return;
            case "PIC":
            case "APIC":
                if (this.o == null || this.r != 3) {
                    bh5 b = eh5Var.b();
                    z24 z24Var = eh5Var.d;
                    if (eh5Var.b.a == 2) {
                        eh5Var.c(3, bh5.c).toUpperCase().getClass();
                    } else {
                        eh5Var.d(20, bh5.c);
                    }
                    byte Z = z24Var.Z();
                    eh5Var.d(kk7.d3, b);
                    int e = (int) eh5Var.a.e();
                    byte[] bArr = new byte[e];
                    int i3 = 0;
                    while (i3 < e) {
                        int read = ((a51) z24Var.b).read(bArr, i3, e - i3);
                        if (read <= 0) {
                            throw new EOFException();
                        }
                        i3 += read;
                    }
                    if (this.o == null || Z == 3 || Z == 0) {
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
                        this.r = Z;
                        return;
                    }
                    return;
                }
                return;
            case "TAL":
            case "TALB":
                this.f = e(eh5Var);
                return;
            case "TCM":
            case "TCOM":
                this.m = e(eh5Var);
                return;
            case "TCO":
            case "TCON":
                String e2 = e(eh5Var);
                if (e2.length() > 0) {
                    this.h = e2;
                    try {
                        if (e2.charAt(0) == '(') {
                            int indexOf = e2.indexOf(41);
                            if (indexOf > 1 && (i = tb4.b(Integer.parseInt(e2.substring(1, indexOf)))) == 0 && e2.length() > (i2 = indexOf + 1)) {
                                this.h = e2.substring(i2);
                            }
                        } else {
                            i = tb4.b(Integer.parseInt(e2));
                        }
                        if (i != 0) {
                            this.h = tb4.d(i);
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
                "1".equals(e(eh5Var));
                return;
            case "TCR":
            case "TCOP":
                this.l = e(eh5Var);
                return;
            case "TLE":
            case "TLEN":
                String e3 = e(eh5Var);
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
                this.d = e(eh5Var);
                return;
            case "TP2":
            case "TPE2":
                this.e = e(eh5Var);
                return;
            case "TPA":
            case "TPOS":
                String e4 = e(eh5Var);
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
                String e5 = e(eh5Var);
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
                e(eh5Var);
                return;
            case "TT2":
            case "TIT2":
                this.c = e(eh5Var);
                return;
            case "TYE":
            case "TYER":
                String e6 = e(eh5Var);
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
                    this.n = c(eh5Var).c;
                    return;
                }
                return;
            case "TDRC":
                String e7 = e(eh5Var);
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
