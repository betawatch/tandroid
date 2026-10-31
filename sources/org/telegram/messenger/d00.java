package org.telegram.messenger;

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
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class d00 {
    public static final double[] a = new double[128];
    public static final Pattern b;

    static {
        int i10 = 0;
        while (true) {
            double[] dArr = a;
            if (i10 >= dArr.length) {
                b = Pattern.compile("(?<=\\))\\s*(?=[A-Za-z])");
                return;
            } else {
                dArr[i10] = Math.pow(10.0d, i10);
                i10++;
            }
        }
    }

    public static String a(byte[] bArr) {
        try {
            StringBuilder sb2 = new StringBuilder(bArr.length * 2);
            sb2.append('M');
            for (byte b10 : bArr) {
                int i10 = b10 & 255;
                if (i10 >= 192) {
                    sb2.append("AACAAAAHAAALMAAAQASTAVAAAZaacaaaahaaalmaaaqastava.az0123456789-,".charAt(i10 - 192));
                } else {
                    if (i10 >= 128) {
                        sb2.append(',');
                    } else if (i10 >= 64) {
                        sb2.append('-');
                    }
                    sb2.append(b10 & 63);
                }
            }
            sb2.append('z');
            return sb2.toString();
        } catch (Exception e) {
            f8.g(e, true);
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r6 != 'T') goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Path b(String str) {
        char c10;
        float f7;
        int i10;
        yz yzVar;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z10;
        String str2 = str;
        w0.m();
        int length = str2.length();
        yz yzVar2 = new yz();
        yzVar2.b = str2;
        yzVar2.c = 0;
        yzVar2.d = str2.length();
        yzVar2.a = str2.charAt(0);
        yzVar2.d();
        Path path = new Path();
        char c11 = 0;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        while (true) {
            int i11 = yzVar2.c;
            if (i11 >= length) {
                return path;
            }
            char charAt = str2.charAt(i11);
            switch (charAt) {
                case '+':
                case '-':
                case '.':
                case '0':
                case '1':
                case '2':
                case zs.o0 /* 51 */:
                case zs.p0 /* 52 */:
                case zs.q0 /* 53 */:
                case zs.r0 /* 54 */:
                case zs.s0 /* 55 */:
                case zs.t0 /* 56 */:
                case zs.u0 /* 57 */:
                    if (c11 != 'm' && c11 != 'M') {
                        if (c11 != 'c') {
                            if (c11 != 'C') {
                                if (c11 != 'l') {
                                    if (c11 != 'L') {
                                        if (c11 != 's') {
                                            if (c11 != 'S') {
                                                if (c11 != 'h') {
                                                    if (c11 != 'H') {
                                                        if (c11 != 'v') {
                                                            if (c11 != 'V') {
                                                                if (c11 != 'q') {
                                                                    if (c11 != 'Q') {
                                                                        if (c11 != 'a') {
                                                                            if (c11 != 'A') {
                                                                                if (c11 != 't') {
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
                        c10 = c11;
                        break;
                    } else {
                        c10 = c11;
                        c11 = (char) (c11 - 1);
                        break;
                    }
                    break;
                case ',':
                case '/':
                default:
                    yzVar2.a = yzVar2.b();
                    c11 = charAt;
                    c10 = c11;
                    break;
            }
            boolean z11 = true;
            switch (c11) {
                case 'A':
                case zs.i1 /* 97 */:
                    float a2 = yzVar2.a();
                    float a10 = yzVar2.a();
                    float a11 = yzVar2.a();
                    boolean z12 = ((int) yzVar2.a()) == 1;
                    boolean z13 = ((int) yzVar2.a()) == 1;
                    float a12 = yzVar2.a();
                    float a13 = yzVar2.a();
                    if (c11 == 'a') {
                        f7 = a12 + f15;
                        a13 += f16;
                    } else {
                        f7 = a12;
                    }
                    float f21 = a13;
                    if (f15 == f7 && f16 == f21) {
                        i10 = length;
                        yzVar = yzVar2;
                        f10 = f21;
                        f11 = f17;
                        f12 = f18;
                        f13 = f19;
                        f14 = f20;
                    } else if (a2 == 0.0f || a10 == 0.0f) {
                        i10 = length;
                        yzVar = yzVar2;
                        f10 = f21;
                        f11 = f17;
                        f12 = f18;
                        f13 = f19;
                        f14 = f20;
                        path.lineTo(f7, f10);
                    } else {
                        float abs = Math.abs(a2);
                        float abs2 = Math.abs(a10);
                        i10 = length;
                        yzVar = yzVar2;
                        double radians = Math.toRadians(a11 % 360.0d);
                        double cos = Math.cos(radians);
                        double sin = Math.sin(radians);
                        float f22 = f15;
                        float f23 = f16;
                        double d = (f22 - f7) / 2.0d;
                        double d10 = (f23 - f21) / 2.0d;
                        double d11 = (sin * d10) + (cos * d);
                        f11 = f17;
                        f12 = f18;
                        double d12 = (cos * d10) + ((-sin) * d);
                        double d13 = abs * abs;
                        double d14 = abs2 * abs2;
                        double d15 = d11 * d11;
                        double d16 = d12 * d12;
                        double d17 = (d16 / d14) + (d15 / d13);
                        if (d17 > 0.99999d) {
                            double sqrt = Math.sqrt(d17) * 1.00001d;
                            abs = (float) (abs * sqrt);
                            abs2 = (float) (abs2 * sqrt);
                            d13 = abs * abs;
                            d14 = abs2 * abs2;
                        }
                        double d18 = d13;
                        double d19 = d14;
                        double d20 = z12 == z13 ? -1.0d : 1.0d;
                        double d21 = d18 * d16;
                        double d22 = (d18 * d19) - d21;
                        double d23 = d19 * d15;
                        double d24 = (d22 - d23) / (d21 + d23);
                        if (d24 < 0.0d) {
                            d24 = 0.0d;
                        }
                        double sqrt2 = Math.sqrt(d24) * d20;
                        double d25 = abs;
                        double d26 = d25 * d12;
                        double d27 = abs2;
                        double d28 = (d26 / d27) * sqrt2;
                        double d29 = sqrt2 * (-((d27 * d11) / d25));
                        double d30 = (f23 + f21) / 2.0d;
                        double d31 = ((cos * d28) - (sin * d29)) + ((f22 + f7) / 2.0d);
                        f13 = f19;
                        f14 = f20;
                        double d32 = (cos * d29) + (sin * d28) + d30;
                        double d33 = (d11 - d28) / d25;
                        double d34 = (d12 - d29) / d27;
                        double d35 = ((-d11) - d28) / d25;
                        double d36 = ((-d12) - d29) / d27;
                        double d37 = (d34 * d34) + (d33 * d33);
                        double acos = Math.acos(d33 / Math.sqrt(d37)) * (d34 < 0.0d ? -1.0d : 1.0d);
                        double sqrt3 = ((d34 * d36) + (d33 * d35)) / Math.sqrt(((d36 * d36) + (d35 * d35)) * d37);
                        double acos2 = ((d33 * d36) - (d34 * d35) < 0.0d ? -1.0d : 1.0d) * (sqrt3 < -1.0d ? 3.141592653589793d : sqrt3 > 1.0d ? 0.0d : Math.acos(sqrt3));
                        if (acos2 == 0.0d) {
                            path.lineTo(f7, f21);
                            f10 = f21;
                        } else {
                            if (!z13 && acos2 > 0.0d) {
                                acos2 -= 6.283185307179586d;
                            } else if (z13 && acos2 < 0.0d) {
                                acos2 += 6.283185307179586d;
                            }
                            double d38 = acos2 % 6.283185307179586d;
                            double d39 = acos % 6.283185307179586d;
                            int ceil = (int) Math.ceil((Math.abs(d38) * 2.0d) / 3.141592653589793d);
                            double d40 = d38 / ceil;
                            double d41 = d40 / 2.0d;
                            double sin2 = (Math.sin(d41) * 1.3333333333333333d) / (Math.cos(d41) + 1.0d);
                            int i12 = ceil * 6;
                            float[] fArr = new float[i12];
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < ceil) {
                                Path path2 = path;
                                double d42 = (i13 * d40) + d39;
                                double cos2 = Math.cos(d42);
                                double sin3 = Math.sin(d42);
                                fArr[i14] = (float) (cos2 - (sin2 * sin3));
                                fArr[i14 + 1] = (float) ((cos2 * sin2) + sin3);
                                double d43 = d42 + d40;
                                double cos3 = Math.cos(d43);
                                double d44 = d40;
                                double sin4 = Math.sin(d43);
                                int i15 = i13;
                                fArr[i14 + 2] = (float) ((sin2 * sin4) + cos3);
                                fArr[i14 + 3] = (float) (sin4 - (sin2 * cos3));
                                int i16 = i14 + 5;
                                fArr[i14 + 4] = (float) cos3;
                                i14 += 6;
                                fArr[i16] = (float) sin4;
                                i13 = i15 + 1;
                                path = path2;
                                f21 = f21;
                                d40 = d44;
                                i12 = i12;
                            }
                            Path path3 = path;
                            float f24 = f21;
                            int i17 = i12;
                            Matrix matrix = new Matrix();
                            matrix.postScale(abs, abs2);
                            matrix.postRotate(a11);
                            matrix.postTranslate((float) d31, (float) d32);
                            matrix.mapPoints(fArr);
                            fArr[i17 - 2] = f7;
                            fArr[i17 - 1] = f24;
                            for (int i18 = 0; i18 < i17; i18 += 6) {
                                path3.cubicTo(fArr[i18], fArr[i18 + 1], fArr[i18 + 2], fArr[i18 + 3], fArr[i18 + 4], fArr[i18 + 5]);
                            }
                            path = path3;
                            f10 = f24;
                        }
                    }
                    f15 = f7;
                    f16 = f10;
                    f19 = f13;
                    f20 = f14;
                    f17 = f11;
                    f18 = f12;
                    z11 = false;
                    break;
                case zs.E0 /* 67 */:
                case zs.k1 /* 99 */:
                    z10 = true;
                    float a14 = yzVar2.a();
                    float a15 = yzVar2.a();
                    float a16 = yzVar2.a();
                    float a17 = yzVar2.a();
                    float a18 = yzVar2.a();
                    float a19 = yzVar2.a();
                    if (c11 == 'c') {
                        a14 += f15;
                        a16 += f15;
                        a18 += f15;
                        a15 += f16;
                        a17 += f16;
                        a19 += f16;
                    }
                    float f25 = a14;
                    float f26 = a15;
                    float f27 = a16;
                    float f28 = a17;
                    float f29 = a18;
                    float f30 = a19;
                    path.cubicTo(f25, f26, f27, f28, f29, f30);
                    f17 = f27;
                    f18 = f28;
                    f15 = f29;
                    f16 = f30;
                    i10 = length;
                    yzVar = yzVar2;
                    z11 = z10;
                    break;
                case zs.J0 /* 72 */:
                case zs.p1 /* 104 */:
                    float a20 = yzVar2.a();
                    if (c11 == 'h') {
                        path.rLineTo(a20, 0.0f);
                        f15 += a20;
                        i10 = length;
                        yzVar = yzVar2;
                        z11 = false;
                        break;
                    } else {
                        path.lineTo(a20, f16);
                        i10 = length;
                        yzVar = yzVar2;
                        f15 = a20;
                        z11 = false;
                    }
                case zs.N0 /* 76 */:
                case zs.t1 /* 108 */:
                    float a21 = yzVar2.a();
                    float a22 = yzVar2.a();
                    if (c11 == 'l') {
                        path.rLineTo(a21, a22);
                        f15 += a21;
                        f16 += a22;
                        i10 = length;
                        yzVar = yzVar2;
                        z11 = false;
                        break;
                    } else {
                        path.lineTo(a21, a22);
                        i10 = length;
                        yzVar = yzVar2;
                        f15 = a21;
                        f16 = a22;
                        z11 = false;
                    }
                case zs.O0 /* 77 */:
                case zs.u1 /* 109 */:
                    float a23 = yzVar2.a();
                    float a24 = yzVar2.a();
                    if (c11 == 'm') {
                        f19 += a23;
                        f20 += a24;
                        path.rMoveTo(a23, a24);
                        f15 += a23;
                        f16 += a24;
                        i10 = length;
                        yzVar = yzVar2;
                        z11 = false;
                        break;
                    } else {
                        path.moveTo(a23, a24);
                        i10 = length;
                        yzVar = yzVar2;
                        f15 = a23;
                        f19 = f15;
                        f16 = a24;
                        f20 = f16;
                        z11 = false;
                    }
                case zs.S0 /* 81 */:
                case zs.y1 /* 113 */:
                    z10 = true;
                    float a25 = yzVar2.a();
                    float a26 = yzVar2.a();
                    float a27 = yzVar2.a();
                    float a28 = yzVar2.a();
                    if (c11 == 'q') {
                        a25 += f15;
                        a26 += f16;
                        a27 += f15;
                        a28 += f16;
                    }
                    f17 = a25;
                    f18 = a26;
                    f15 = a27;
                    f16 = a28;
                    path.quadTo(f17, f18, f15, f16);
                    i10 = length;
                    yzVar = yzVar2;
                    z11 = z10;
                    break;
                case zs.U0 /* 83 */:
                case zs.A1 /* 115 */:
                    float a29 = yzVar2.a();
                    float a30 = yzVar2.a();
                    float a31 = yzVar2.a();
                    float a32 = yzVar2.a();
                    if (c11 == 's') {
                        a29 += f15;
                        a31 += f15;
                        a30 += f16;
                        a32 += f16;
                    }
                    float f31 = a32;
                    float f32 = (f15 * 2.0f) - f17;
                    float f33 = (f16 * 2.0f) - f18;
                    float f34 = a29;
                    float f35 = a30;
                    float f36 = a31;
                    path.cubicTo(f32, f33, f34, f35, f36, f31);
                    i10 = length;
                    yzVar = yzVar2;
                    f17 = f34;
                    f18 = f35;
                    f15 = f36;
                    f16 = f31;
                    z11 = true;
                    break;
                case zs.V0 /* 84 */:
                case zs.B1 /* 116 */:
                    float a33 = yzVar2.a();
                    float a34 = yzVar2.a();
                    if (c11 == 't') {
                        a33 += f15;
                        a34 += f16;
                    }
                    f17 = (f15 * 2.0f) - f17;
                    f18 = (f16 * 2.0f) - f18;
                    path.quadTo(f17, f18, a33, a34);
                    i10 = length;
                    yzVar = yzVar2;
                    f15 = a33;
                    f16 = a34;
                    break;
                case zs.X0 /* 86 */:
                case zs.D1 /* 118 */:
                    float a35 = yzVar2.a();
                    if (c11 == 'v') {
                        path.rLineTo(0.0f, a35);
                        f16 += a35;
                        i10 = length;
                        yzVar = yzVar2;
                        z11 = false;
                        break;
                    } else {
                        path.lineTo(f15, a35);
                        i10 = length;
                        yzVar = yzVar2;
                        f16 = a35;
                        z11 = false;
                    }
                case zs.b1 /* 90 */:
                case zs.G1 /* 122 */:
                    path.close();
                    path.moveTo(f19, f20);
                    i10 = length;
                    yzVar = yzVar2;
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    break;
                default:
                    i10 = length;
                    yzVar = yzVar2;
                    z11 = false;
                    break;
            }
            if (!z11) {
                f17 = f15;
                f18 = f16;
            }
            yzVar.d();
            str2 = str;
            length = i10;
            yzVar2 = yzVar;
            c11 = c10;
        }
    }

    public static Bitmap c(float f7, int i10, int i11, int i12, int i13, int i14) {
        try {
            InputStream openRawResource = w0.b.getResources().openRawResource(i10);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                a00 a00Var = new a00(i11, i12, Integer.valueOf(i13), false, f7, i14);
                xMLReader.setContentHandler(a00Var);
                xMLReader.parse(new InputSource(openRawResource));
                Bitmap bitmap = a00Var.b;
                if (openRawResource != null) {
                    openRawResource.close();
                }
                return bitmap;
            } finally {
            }
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static Bitmap d(int i10, int i11, int i12, int i13) {
        return c(1.0f, i10, i11, i12, i13, 1);
    }

    public static Bitmap e(int i10, int i11, String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            a00 a00Var = new a00(i10, i11, null, false);
            xMLReader.setContentHandler(a00Var);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return a00Var.b;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static Bitmap f(File file, int i10, int i11, int i12) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                a00 a00Var = new a00(i10, i11, null, false, 1.0f, i12);
                a00Var.E = true;
                xMLReader.setContentHandler(a00Var);
                xMLReader.parse(new InputSource(fileInputStream));
                Bitmap bitmap = a00Var.b;
                fileInputStream.close();
                return bitmap;
            } finally {
            }
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static Bitmap g(FilterInputStream filterInputStream, int i10, int i11) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            a00 a00Var = new a00(i10, i11, null, false);
            xMLReader.setContentHandler(a00Var);
            xMLReader.parse(new InputSource(filterInputStream));
            return a00Var.b;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static c00 h(int i10, Integer num) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            a00 a00Var = new a00(0, 0, num, true);
            xMLReader.setContentHandler(a00Var);
            xMLReader.parse(new InputSource(w0.b.getResources().openRawResource(i10)));
            return a00Var.c;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static c00 i(String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            a00 a00Var = new a00(0, 0, null, true);
            xMLReader.setContentHandler(a00Var);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return a00Var.c;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static c00 j(int i10, int i11, Path path) {
        try {
            c00 c00Var = new c00();
            c00Var.a.add(path);
            c00Var.b.put(path, new Paint(1));
            c00Var.e = i10;
            c00Var.f = i11;
            return c00Var;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static Float k(String str, Attributes attributes) {
        String l4 = l(str, attributes);
        if (l4 == null) {
            return null;
        }
        if (l4.endsWith("px")) {
            l4 = c3.i0.m(2, 0, l4);
        } else if (l4.endsWith("mm")) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(l4));
    }

    public static String l(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            if (attributes.getLocalName(i10).equals(str)) {
                return attributes.getValue(i10);
            }
        }
        return null;
    }

    public static a00 m(File file, int i10, int i11, boolean z10) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                a00 a00Var = new a00(i10, i11, z10 ? -1 : null, false);
                if (!z10) {
                    a00Var.E = true;
                }
                xMLReader.setContentHandler(a00Var);
                xMLReader.parse(new InputSource(fileInputStream));
                fileInputStream.close();
                return a00Var;
            } finally {
            }
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static c5.k n(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 1; i11 < length; i11++) {
            if (z10) {
                z10 = false;
            } else {
                char charAt = str.charAt(i11);
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                    case '-':
                        if (charAt != '-' || str.charAt(i11 - 1) != 'e') {
                            String substring = str.substring(i10, i11);
                            if (substring.trim().length() > 0) {
                                arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                                if (charAt == '-') {
                                    i10 = i11;
                                    break;
                                } else {
                                    i10 = i11 + 1;
                                    z10 = true;
                                    break;
                                }
                            } else {
                                i10++;
                                break;
                            }
                        } else {
                            break;
                        }
                    case ')':
                    case 'A':
                    case zs.E0 /* 67 */:
                    case zs.J0 /* 72 */:
                    case zs.N0 /* 76 */:
                    case zs.O0 /* 77 */:
                    case zs.S0 /* 81 */:
                    case zs.U0 /* 83 */:
                    case zs.V0 /* 84 */:
                    case zs.X0 /* 86 */:
                    case zs.b1 /* 90 */:
                    case zs.i1 /* 97 */:
                    case zs.k1 /* 99 */:
                    case zs.p1 /* 104 */:
                    case zs.t1 /* 108 */:
                    case zs.u1 /* 109 */:
                    case zs.y1 /* 113 */:
                    case zs.A1 /* 115 */:
                    case zs.B1 /* 116 */:
                    case zs.D1 /* 118 */:
                    case zs.G1 /* 122 */:
                        String substring2 = str.substring(i10, i11);
                        if (substring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                        }
                        return new c5.k(arrayList);
                }
            }
        }
        String substring3 = str.substring(i10);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException unused) {
            }
        }
        return new c5.k(arrayList);
    }

    public static Matrix o(String str) {
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
                ArrayList arrayList2 = n(str3.substring(7)).a;
                if (arrayList2.size() == 6) {
                    matrix = new Matrix();
                    matrix.setValues(new float[]{((Float) arrayList2.get(0)).floatValue(), ((Float) arrayList2.get(2)).floatValue(), ((Float) arrayList2.get(4)).floatValue(), ((Float) arrayList2.get(1)).floatValue(), ((Float) arrayList2.get(3)).floatValue(), ((Float) arrayList2.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                }
                matrix = null;
            } else if (str3.startsWith("translate(")) {
                ArrayList arrayList3 = n(str3.substring(10)).a;
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
                    ArrayList arrayList4 = n(str3.substring(6)).a;
                    if (arrayList4.size() > 0) {
                        float floatValue3 = ((Float) arrayList4.get(0)).floatValue();
                        floatValue = arrayList4.size() > 1 ? ((Float) arrayList4.get(1)).floatValue() : 0.0f;
                        matrix2 = new Matrix();
                        matrix2.postScale(floatValue3, floatValue);
                        matrix = matrix2;
                    }
                } else if (str3.startsWith("skewX(")) {
                    ArrayList arrayList5 = n(str3.substring(6)).a;
                    if (arrayList5.size() > 0) {
                        float floatValue4 = ((Float) arrayList5.get(0)).floatValue();
                        matrix = new Matrix();
                        matrix.postSkew((float) Math.tan(floatValue4), 0.0f);
                    }
                } else if (str3.startsWith("skewY(")) {
                    ArrayList arrayList6 = n(str3.substring(6)).a;
                    if (arrayList6.size() > 0) {
                        float floatValue5 = ((Float) arrayList6.get(0)).floatValue();
                        matrix = new Matrix();
                        matrix.postSkew(0.0f, (float) Math.tan(floatValue5));
                    }
                } else if (str3.startsWith("rotate(")) {
                    ArrayList arrayList7 = n(str3.substring(7)).a;
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
