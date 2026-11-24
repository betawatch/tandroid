// default package

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.xml.parsers.SAXParserFactory;
import org.telegram.messenger.a;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class lcb {
    public static final double[] a = new double[128];
    public static final Pattern b;

    static {
        int i = 0;
        while (true) {
            double[] dArr = a;
            if (i >= 128) {
                b = Pattern.compile("(?<=\\))\\s*(?=[A-Za-z])");
                return;
            } else {
                dArr[i] = Math.pow(10.0d, i);
                i++;
            }
        }
    }

    public static String a(byte[] bArr) {
        try {
            StringBuilder sb = new StringBuilder(bArr.length << 1);
            sb.append('M');
            for (byte b2 : bArr) {
                int i = b2 & 255;
                if (i >= 192) {
                    sb.append("AACAAAAHAAALMAAAQASTAVAAAZaacaaaahaaalmaaaqastava.az0123456789-,".charAt(i - 192));
                } else {
                    if (i >= 128) {
                        sb.append(',');
                    } else if (i >= 64) {
                        sb.append('-');
                    }
                    sb.append(b2 & 63);
                }
            }
            sb.append('z');
            return sb.toString();
        } catch (Exception e) {
            fa4.g(e, true);
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r6 != 'T') goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Path b(String str) {
        char c;
        float f;
        int i;
        gcb gcbVar;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z;
        String str2 = str;
        a.l();
        int length = str2.length();
        gcb gcbVar2 = new gcb();
        gcbVar2.b = str2;
        gcbVar2.c = 0;
        gcbVar2.d = str2.length();
        gcbVar2.a = str2.charAt(0);
        gcbVar2.d();
        Path path = new Path();
        char c2 = 0;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            int i2 = gcbVar2.c;
            if (i2 >= length) {
                return path;
            }
            char charAt = str2.charAt(i2);
            switch (charAt) {
                case '+':
                case '-':
                case '.':
                case '0':
                case '1':
                case '2':
                case kk7.n0 /* 51 */:
                case kk7.o0 /* 52 */:
                case kk7.p0 /* 53 */:
                case kk7.q0 /* 54 */:
                case kk7.r0 /* 55 */:
                case '8':
                case kk7.t0 /* 57 */:
                    if (c2 != 'm' && c2 != 'M') {
                        if (c2 != 'c') {
                            if (c2 != 'C') {
                                if (c2 != 'l') {
                                    if (c2 != 'L') {
                                        if (c2 != 's') {
                                            if (c2 != 'S') {
                                                if (c2 != 'h') {
                                                    if (c2 != 'H') {
                                                        if (c2 != 'v') {
                                                            if (c2 != 'V') {
                                                                if (c2 != 'q') {
                                                                    if (c2 != 'Q') {
                                                                        if (c2 != 'a') {
                                                                            if (c2 != 'A') {
                                                                                if (c2 != 't') {
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        c = c2;
                        break;
                    } else {
                        c = c2;
                        c2 = (char) (c2 - 1);
                        break;
                    }
                    break;
                case ',':
                case '/':
                default:
                    gcbVar2.a = gcbVar2.b();
                    c2 = charAt;
                    c = c2;
                    break;
            }
            boolean z2 = true;
            switch (c2) {
                case 'A':
                case kk7.h1 /* 97 */:
                    float a2 = gcbVar2.a();
                    float a3 = gcbVar2.a();
                    float a4 = gcbVar2.a();
                    boolean z3 = ((int) gcbVar2.a()) == 1;
                    boolean z4 = ((int) gcbVar2.a()) == 1;
                    float a5 = gcbVar2.a();
                    float a6 = gcbVar2.a();
                    if (c2 == 'a') {
                        f = a5 + f7;
                        a6 += f8;
                    } else {
                        f = a5;
                    }
                    float f13 = a6;
                    if (f7 == f && f8 == f13) {
                        i = length;
                        gcbVar = gcbVar2;
                        f2 = f13;
                        f3 = f9;
                        f4 = f10;
                        f5 = f11;
                        f6 = f12;
                    } else if (a2 == 0.0f || a3 == 0.0f) {
                        i = length;
                        gcbVar = gcbVar2;
                        f2 = f13;
                        f3 = f9;
                        f4 = f10;
                        f5 = f11;
                        f6 = f12;
                        path.lineTo(f, f2);
                    } else {
                        float abs = Math.abs(a2);
                        float abs2 = Math.abs(a3);
                        i = length;
                        gcbVar = gcbVar2;
                        double radians = Math.toRadians(a4 % 360.0d);
                        double cos = Math.cos(radians);
                        double sin = Math.sin(radians);
                        float f14 = f7;
                        float f15 = f8;
                        double d = (f14 - f) / 2.0d;
                        double d2 = (f15 - f13) / 2.0d;
                        double d3 = (sin * d2) + (cos * d);
                        f3 = f9;
                        f4 = f10;
                        double d4 = (cos * d2) + ((-sin) * d);
                        double d5 = abs * abs;
                        double d6 = abs2 * abs2;
                        double d7 = d3 * d3;
                        double d8 = d4 * d4;
                        double d9 = (d8 / d6) + (d7 / d5);
                        if (d9 > 0.99999d) {
                            double sqrt = Math.sqrt(d9) * 1.00001d;
                            abs = (float) (abs * sqrt);
                            abs2 = (float) (abs2 * sqrt);
                            d5 = abs * abs;
                            d6 = abs2 * abs2;
                        }
                        double d10 = d5;
                        double d11 = d6;
                        double d12 = z3 == z4 ? -1.0d : 1.0d;
                        double d13 = d10 * d8;
                        double d14 = (d10 * d11) - d13;
                        double d15 = d11 * d7;
                        double d16 = (d14 - d15) / (d13 + d15);
                        if (d16 < 0.0d) {
                            d16 = 0.0d;
                        }
                        double sqrt2 = Math.sqrt(d16) * d12;
                        double d17 = abs;
                        double d18 = d17 * d4;
                        double d19 = abs2;
                        double d20 = (d18 / d19) * sqrt2;
                        double d21 = sqrt2 * (-((d19 * d3) / d17));
                        double d22 = (f15 + f13) / 2.0d;
                        double d23 = ((cos * d20) - (sin * d21)) + ((f14 + f) / 2.0d);
                        f5 = f11;
                        f6 = f12;
                        double d24 = (cos * d21) + (sin * d20) + d22;
                        double d25 = (d3 - d20) / d17;
                        double d26 = (d4 - d21) / d19;
                        double d27 = ((-d3) - d20) / d17;
                        double d28 = ((-d4) - d21) / d19;
                        double d29 = (d26 * d26) + (d25 * d25);
                        double acos = Math.acos(d25 / Math.sqrt(d29)) * (d26 < 0.0d ? -1.0d : 1.0d);
                        double sqrt3 = ((d26 * d28) + (d25 * d27)) / Math.sqrt(((d28 * d28) + (d27 * d27)) * d29);
                        double acos2 = ((d25 * d28) - (d26 * d27) < 0.0d ? -1.0d : 1.0d) * (sqrt3 < -1.0d ? 3.141592653589793d : sqrt3 > 1.0d ? 0.0d : Math.acos(sqrt3));
                        if (acos2 == 0.0d) {
                            path.lineTo(f, f13);
                            f2 = f13;
                        } else {
                            if (z4) {
                                if (acos2 < 0.0d) {
                                    acos2 += 6.283185307179586d;
                                }
                            } else if (acos2 > 0.0d) {
                                acos2 -= 6.283185307179586d;
                            }
                            double d30 = acos2 % 6.283185307179586d;
                            double d31 = acos % 6.283185307179586d;
                            int ceil = (int) Math.ceil((Math.abs(d30) * 2.0d) / 3.141592653589793d);
                            double d32 = d30 / ceil;
                            double d33 = d32 / 2.0d;
                            double sin2 = (Math.sin(d33) * 1.3333333333333333d) / (Math.cos(d33) + 1.0d);
                            int i3 = ceil * 6;
                            float[] fArr = new float[i3];
                            int i4 = 0;
                            int i5 = 0;
                            while (true) {
                                Path path2 = path;
                                float f16 = f13;
                                if (i4 < ceil) {
                                    double d34 = (i4 * d32) + d31;
                                    double cos2 = Math.cos(d34);
                                    double sin3 = Math.sin(d34);
                                    fArr[i5] = (float) (cos2 - (sin2 * sin3));
                                    fArr[i5 + 1] = (float) ((cos2 * sin2) + sin3);
                                    double d35 = d34 + d32;
                                    double cos3 = Math.cos(d35);
                                    double d36 = d32;
                                    double sin4 = Math.sin(d35);
                                    int i6 = i4;
                                    fArr[i5 + 2] = (float) ((sin2 * sin4) + cos3);
                                    fArr[i5 + 3] = (float) (sin4 - (sin2 * cos3));
                                    int i7 = i5 + 5;
                                    fArr[i5 + 4] = (float) cos3;
                                    i5 += 6;
                                    fArr[i7] = (float) sin4;
                                    i4 = i6 + 1;
                                    path = path2;
                                    f13 = f16;
                                    d32 = d36;
                                    i3 = i3;
                                } else {
                                    int i8 = i3;
                                    Matrix matrix = new Matrix();
                                    matrix.postScale(abs, abs2);
                                    matrix.postRotate(a4);
                                    matrix.postTranslate((float) d23, (float) d24);
                                    matrix.mapPoints(fArr);
                                    fArr[i8 - 2] = f;
                                    fArr[i8 - 1] = f16;
                                    for (int i9 = 0; i9 < i8; i9 += 6) {
                                        path2.cubicTo(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3], fArr[i9 + 4], fArr[i9 + 5]);
                                    }
                                    path = path2;
                                    f2 = f16;
                                }
                            }
                        }
                    }
                    f7 = f;
                    f8 = f2;
                    f11 = f5;
                    f12 = f6;
                    f9 = f3;
                    f10 = f4;
                    z2 = false;
                    break;
                case kk7.D0 /* 67 */:
                case kk7.j1 /* 99 */:
                    z = true;
                    float a7 = gcbVar2.a();
                    float a8 = gcbVar2.a();
                    float a9 = gcbVar2.a();
                    float a10 = gcbVar2.a();
                    float a11 = gcbVar2.a();
                    float a12 = gcbVar2.a();
                    if (c2 == 'c') {
                        a7 += f7;
                        a9 += f7;
                        a11 += f7;
                        a8 += f8;
                        a10 += f8;
                        a12 += f8;
                    }
                    float f17 = a7;
                    float f18 = a8;
                    float f19 = a9;
                    float f20 = a10;
                    float f21 = a11;
                    float f22 = a12;
                    path.cubicTo(f17, f18, f19, f20, f21, f22);
                    f9 = f19;
                    f10 = f20;
                    f7 = f21;
                    f8 = f22;
                    i = length;
                    gcbVar = gcbVar2;
                    z2 = z;
                    break;
                case kk7.I0 /* 72 */:
                case kk7.o1 /* 104 */:
                    float a13 = gcbVar2.a();
                    if (c2 == 'h') {
                        path.rLineTo(a13, 0.0f);
                        f7 += a13;
                        i = length;
                        gcbVar = gcbVar2;
                        z2 = false;
                        break;
                    } else {
                        path.lineTo(a13, f8);
                        i = length;
                        gcbVar = gcbVar2;
                        f7 = a13;
                        z2 = false;
                    }
                case kk7.M0 /* 76 */:
                case kk7.s1 /* 108 */:
                    float a14 = gcbVar2.a();
                    float a15 = gcbVar2.a();
                    if (c2 == 'l') {
                        path.rLineTo(a14, a15);
                        f7 += a14;
                        f8 += a15;
                        i = length;
                        gcbVar = gcbVar2;
                        z2 = false;
                        break;
                    } else {
                        path.lineTo(a14, a15);
                        i = length;
                        gcbVar = gcbVar2;
                        f7 = a14;
                        f8 = a15;
                        z2 = false;
                    }
                case kk7.N0 /* 77 */:
                case kk7.t1 /* 109 */:
                    float a16 = gcbVar2.a();
                    float a17 = gcbVar2.a();
                    if (c2 == 'm') {
                        f11 += a16;
                        f12 += a17;
                        path.rMoveTo(a16, a17);
                        f7 += a16;
                        f8 += a17;
                        i = length;
                        gcbVar = gcbVar2;
                        z2 = false;
                        break;
                    } else {
                        path.moveTo(a16, a17);
                        i = length;
                        gcbVar = gcbVar2;
                        f7 = a16;
                        f11 = f7;
                        f8 = a17;
                        f12 = f8;
                        z2 = false;
                    }
                case kk7.R0 /* 81 */:
                case kk7.x1 /* 113 */:
                    z = true;
                    float a18 = gcbVar2.a();
                    float a19 = gcbVar2.a();
                    float a20 = gcbVar2.a();
                    float a21 = gcbVar2.a();
                    if (c2 == 'q') {
                        a18 += f7;
                        a19 += f8;
                        a20 += f7;
                        a21 += f8;
                    }
                    f9 = a18;
                    f10 = a19;
                    f7 = a20;
                    f8 = a21;
                    path.quadTo(f9, f10, f7, f8);
                    i = length;
                    gcbVar = gcbVar2;
                    z2 = z;
                    break;
                case kk7.T0 /* 83 */:
                case kk7.z1 /* 115 */:
                    float a22 = gcbVar2.a();
                    float a23 = gcbVar2.a();
                    float a24 = gcbVar2.a();
                    float a25 = gcbVar2.a();
                    if (c2 == 's') {
                        a22 += f7;
                        a24 += f7;
                        a23 += f8;
                        a25 += f8;
                    }
                    float f23 = a25;
                    float f24 = (f7 * 2.0f) - f9;
                    float f25 = (f8 * 2.0f) - f10;
                    float f26 = a22;
                    float f27 = a23;
                    z = true;
                    float f28 = a24;
                    path.cubicTo(f24, f25, f26, f27, f28, f23);
                    i = length;
                    gcbVar = gcbVar2;
                    f9 = f26;
                    f10 = f27;
                    f7 = f28;
                    f8 = f23;
                    z2 = z;
                    break;
                case kk7.U0 /* 84 */:
                case kk7.A1 /* 116 */:
                    float a26 = gcbVar2.a();
                    float a27 = gcbVar2.a();
                    if (c2 == 't') {
                        a26 += f7;
                        a27 += f8;
                    }
                    f9 = (f7 * 2.0f) - f9;
                    f10 = (f8 * 2.0f) - f10;
                    path.quadTo(f9, f10, a26, a27);
                    i = length;
                    gcbVar = gcbVar2;
                    f7 = a26;
                    f8 = a27;
                    break;
                case kk7.W0 /* 86 */:
                case kk7.C1 /* 118 */:
                    float a28 = gcbVar2.a();
                    if (c2 == 'v') {
                        path.rLineTo(0.0f, a28);
                        f8 += a28;
                        i = length;
                        gcbVar = gcbVar2;
                        z2 = false;
                        break;
                    } else {
                        path.lineTo(f7, a28);
                        i = length;
                        gcbVar = gcbVar2;
                        f8 = a28;
                        z2 = false;
                    }
                case kk7.a1 /* 90 */:
                case kk7.F1 /* 122 */:
                    path.close();
                    path.moveTo(f11, f12);
                    i = length;
                    gcbVar = gcbVar2;
                    f7 = f11;
                    f9 = f7;
                    f8 = f12;
                    f10 = f8;
                    break;
                default:
                    i = length;
                    gcbVar = gcbVar2;
                    z2 = false;
                    break;
            }
            if (!z2) {
                f9 = f7;
                f10 = f8;
            }
            gcbVar.d();
            str2 = str;
            length = i;
            gcbVar2 = gcbVar;
            c2 = c;
        }
    }

    public static Bitmap c(float f, int i, int i2, int i3, int i4, int i5) {
        try {
            InputStream openRawResource = a.b.getResources().openRawResource(i);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                icb icbVar = new icb(i2, i3, Integer.valueOf(i4), false, f, i5);
                xMLReader.setContentHandler(icbVar);
                xMLReader.parse(new InputSource(openRawResource));
                Bitmap bitmap = icbVar.b;
                if (openRawResource != null) {
                    openRawResource.close();
                }
                return bitmap;
            } finally {
            }
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public static Bitmap d(int i, int i2, int i3, int i4) {
        return c(1.0f, i, i2, i3, i4, 1);
    }

    public static Bitmap e(int i, int i2, String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            icb icbVar = new icb(i, i2, null, false);
            xMLReader.setContentHandler(icbVar);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return icbVar.b;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public static Bitmap f(FilterInputStream filterInputStream, int i, int i2) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            icb icbVar = new icb(i, i2, null, false);
            xMLReader.setContentHandler(icbVar);
            xMLReader.parse(new InputSource(filterInputStream));
            return icbVar.b;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public static kcb g(int i, Integer num) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            icb icbVar = new icb(0, 0, num, true);
            xMLReader.setContentHandler(icbVar);
            xMLReader.parse(new InputSource(a.b.getResources().openRawResource(i)));
            return icbVar.c;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public static kcb h(String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            icb icbVar = new icb(0, 0, null, true);
            xMLReader.setContentHandler(icbVar);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return icbVar.c;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public static kcb i(int i, int i2, Path path) {
        try {
            kcb kcbVar = new kcb();
            kcbVar.a.add(path);
            kcbVar.b.put(path, new Paint(1));
            kcbVar.e = i;
            kcbVar.f = i2;
            return kcbVar;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public static Float j(String str, Attributes attributes) {
        String k = k(str, attributes);
        if (k == null) {
            return null;
        }
        if (k.endsWith("px")) {
            k = ir2.n(2, 0, k);
        } else if (k.endsWith("mm")) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(k));
    }

    public static String k(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    public static icb l(File file, int i, int i2, boolean z) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                icb icbVar = new icb(i, i2, z ? -1 : null, false);
                if (!z) {
                    icbVar.F = true;
                }
                xMLReader.setContentHandler(icbVar);
                xMLReader.parse(new InputSource(fileInputStream));
                fileInputStream.close();
                return icbVar;
            } finally {
            }
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public static il8 m(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 1; i2 < length; i2++) {
            if (z) {
                z = false;
            } else {
                char charAt = str.charAt(i2);
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                    case '-':
                        if (charAt != '-' || str.charAt(i2 - 1) != 'e') {
                            String substring = str.substring(i, i2);
                            if (substring.trim().length() > 0) {
                                arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                                if (charAt == '-') {
                                    i = i2;
                                    break;
                                } else {
                                    i = i2 + 1;
                                    z = true;
                                    break;
                                }
                            } else {
                                i++;
                                break;
                            }
                        } else {
                            break;
                        }
                    case ')':
                    case 'A':
                    case kk7.D0 /* 67 */:
                    case kk7.I0 /* 72 */:
                    case kk7.M0 /* 76 */:
                    case kk7.N0 /* 77 */:
                    case kk7.R0 /* 81 */:
                    case kk7.T0 /* 83 */:
                    case kk7.U0 /* 84 */:
                    case kk7.W0 /* 86 */:
                    case kk7.a1 /* 90 */:
                    case kk7.h1 /* 97 */:
                    case kk7.j1 /* 99 */:
                    case kk7.o1 /* 104 */:
                    case kk7.s1 /* 108 */:
                    case kk7.t1 /* 109 */:
                    case kk7.x1 /* 113 */:
                    case kk7.z1 /* 115 */:
                    case kk7.A1 /* 116 */:
                    case kk7.C1 /* 118 */:
                    case kk7.F1 /* 122 */:
                        String substring2 = str.substring(i, i2);
                        if (substring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                        }
                        return new il8(arrayList);
                }
            }
        }
        String substring3 = str.substring(i);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException unused) {
            }
        }
        return new il8(arrayList);
    }

    public static Matrix n(String str) {
        List<String> list;
        Matrix matrix;
        float floatValue;
        Matrix matrix2;
        Matrix matrix3 = new Matrix();
        if (str == null) {
            list = Collections.EMPTY_LIST;
        } else {
            String trim = str.trim();
            if (trim.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                String[] split = b.split(trim);
                ArrayList arrayList = new ArrayList(split.length);
                for (String str2 : split) {
                    String trim2 = str2.trim();
                    if (!trim2.isEmpty()) {
                        arrayList.add(trim2);
                    }
                }
                list = arrayList;
            }
        }
        for (String str3 : list) {
            if (str3.startsWith("matrix(")) {
                ArrayList arrayList2 = m(str3.substring(7)).a;
                if (arrayList2.size() == 6) {
                    matrix = new Matrix();
                    matrix.setValues(new float[]{((Float) arrayList2.get(0)).floatValue(), ((Float) arrayList2.get(2)).floatValue(), ((Float) arrayList2.get(4)).floatValue(), ((Float) arrayList2.get(1)).floatValue(), ((Float) arrayList2.get(3)).floatValue(), ((Float) arrayList2.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                }
                matrix = null;
            } else if (str3.startsWith("translate(")) {
                ArrayList arrayList3 = m(str3.substring(10)).a;
                if (arrayList3.size() > 0) {
                    float floatValue2 = ((Float) arrayList3.get(0)).floatValue();
                    floatValue = arrayList3.size() > 1 ? ((Float) arrayList3.get(1)).floatValue() : 0.0f;
                    matrix2 = new Matrix();
                    matrix2.postTranslate(floatValue2, floatValue);
                    matrix = matrix2;
                }
                matrix = null;
            } else {
                if (str3.startsWith("scale(")) {
                    ArrayList arrayList4 = m(str3.substring(6)).a;
                    if (arrayList4.size() > 0) {
                        float floatValue3 = ((Float) arrayList4.get(0)).floatValue();
                        floatValue = arrayList4.size() > 1 ? ((Float) arrayList4.get(1)).floatValue() : 0.0f;
                        matrix2 = new Matrix();
                        matrix2.postScale(floatValue3, floatValue);
                        matrix = matrix2;
                    }
                } else if (str3.startsWith("skewX(")) {
                    ArrayList arrayList5 = m(str3.substring(6)).a;
                    if (arrayList5.size() > 0) {
                        float floatValue4 = ((Float) arrayList5.get(0)).floatValue();
                        matrix = new Matrix();
                        matrix.postSkew((float) Math.tan(floatValue4), 0.0f);
                    }
                } else if (str3.startsWith("skewY(")) {
                    ArrayList arrayList6 = m(str3.substring(6)).a;
                    if (arrayList6.size() > 0) {
                        float floatValue5 = ((Float) arrayList6.get(0)).floatValue();
                        matrix = new Matrix();
                        matrix.postSkew(0.0f, (float) Math.tan(floatValue5));
                    }
                } else if (str3.startsWith("rotate(")) {
                    ArrayList arrayList7 = m(str3.substring(7)).a;
                    if (arrayList7.size() > 0) {
                        matrix = new Matrix();
                        float floatValue6 = ((Float) arrayList7.get(0)).floatValue();
                        if (arrayList7.size() > 2) {
                            matrix.postRotate(floatValue6, ((Float) arrayList7.get(1)).floatValue(), ((Float) arrayList7.get(2)).floatValue());
                        } else {
                            matrix.postRotate(floatValue6);
                        }
                    }
                }
                matrix = null;
            }
            if (matrix != null) {
                matrix3.preConcat(matrix);
            }
        }
        return matrix3;
    }
}
