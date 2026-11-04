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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class kz {
    public static final double[] a = new double[128];
    public static final Pattern b;

    static {
        int i3 = 0;
        while (true) {
            double[] dArr = a;
            if (i3 >= dArr.length) {
                b = Pattern.compile("(?<=\\))\\s*(?=[A-Za-z])");
                return;
            } else {
                dArr[i3] = Math.pow(10.0d, i3);
                i3++;
            }
        }
    }

    public static String a(byte[] bArr) {
        try {
            StringBuilder sb2 = new StringBuilder(bArr.length * 2);
            sb2.append('M');
            for (byte b10 : bArr) {
                int i3 = b10 & 255;
                if (i3 >= 192) {
                    sb2.append("AACAAAAHAAALMAAAQASTAVAAAZaacaaaahaaalmaaaqastava.az0123456789-,".charAt(i3 - 192));
                } else {
                    if (i3 >= 128) {
                        sb2.append(',');
                    } else if (i3 >= 64) {
                        sb2.append('-');
                    }
                    sb2.append(b10 & 63);
                }
            }
            sb2.append('z');
            return sb2.toString();
        } catch (Exception e10) {
            a8.g(e10, true);
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
        char c2;
        float f10;
        int i3;
        fz fzVar;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z10;
        String str2 = str;
        t0.m();
        int length = str2.length();
        fz fzVar2 = new fz();
        fzVar2.b = str2;
        fzVar2.c = 0;
        fzVar2.d = str2.length();
        fzVar2.a = str2.charAt(0);
        fzVar2.d();
        Path path = new Path();
        char c10 = 0;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        while (true) {
            int i10 = fzVar2.c;
            if (i10 >= length) {
                return path;
            }
            char charAt = str2.charAt(i10);
            switch (charAt) {
                case '+':
                case '-':
                case '.':
                case '0':
                case '1':
                case '2':
                case hs.o0 /* 51 */:
                case hs.p0 /* 52 */:
                case hs.q0 /* 53 */:
                case hs.r0 /* 54 */:
                case hs.s0 /* 55 */:
                case hs.t0 /* 56 */:
                case hs.u0 /* 57 */:
                    if (c10 != 'm' && c10 != 'M') {
                        if (c10 != 'c') {
                            if (c10 != 'C') {
                                if (c10 != 'l') {
                                    if (c10 != 'L') {
                                        if (c10 != 's') {
                                            if (c10 != 'S') {
                                                if (c10 != 'h') {
                                                    if (c10 != 'H') {
                                                        if (c10 != 'v') {
                                                            if (c10 != 'V') {
                                                                if (c10 != 'q') {
                                                                    if (c10 != 'Q') {
                                                                        if (c10 != 'a') {
                                                                            if (c10 != 'A') {
                                                                                if (c10 != 't') {
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
                        c2 = c10;
                        break;
                    } else {
                        c2 = c10;
                        c10 = (char) (c10 - 1);
                        break;
                    }
                    break;
                case ',':
                case '/':
                default:
                    fzVar2.a = fzVar2.b();
                    c10 = charAt;
                    c2 = c10;
                    break;
            }
            boolean z11 = true;
            switch (c10) {
                case 'A':
                case hs.i1 /* 97 */:
                    float a10 = fzVar2.a();
                    float a11 = fzVar2.a();
                    float a12 = fzVar2.a();
                    boolean z12 = ((int) fzVar2.a()) == 1;
                    boolean z13 = ((int) fzVar2.a()) == 1;
                    float a13 = fzVar2.a();
                    float a14 = fzVar2.a();
                    if (c10 == 'a') {
                        f10 = a13 + f16;
                        a14 += f17;
                    } else {
                        f10 = a13;
                    }
                    float f22 = a14;
                    if (f16 == f10 && f17 == f22) {
                        i3 = length;
                        fzVar = fzVar2;
                        f11 = f22;
                        f12 = f18;
                        f13 = f19;
                        f14 = f20;
                        f15 = f21;
                    } else if (a10 == 0.0f || a11 == 0.0f) {
                        i3 = length;
                        fzVar = fzVar2;
                        f11 = f22;
                        f12 = f18;
                        f13 = f19;
                        f14 = f20;
                        f15 = f21;
                        path.lineTo(f10, f11);
                    } else {
                        float abs = Math.abs(a10);
                        float abs2 = Math.abs(a11);
                        i3 = length;
                        fzVar = fzVar2;
                        double radians = Math.toRadians(a12 % 360.0d);
                        double cos = Math.cos(radians);
                        double sin = Math.sin(radians);
                        float f23 = f16;
                        float f24 = f17;
                        double d = (f23 - f10) / 2.0d;
                        double d10 = (f24 - f22) / 2.0d;
                        double d11 = (sin * d10) + (cos * d);
                        f12 = f18;
                        f13 = f19;
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
                        double d30 = (f24 + f22) / 2.0d;
                        double d31 = ((cos * d28) - (sin * d29)) + ((f23 + f10) / 2.0d);
                        f14 = f20;
                        f15 = f21;
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
                            path.lineTo(f10, f22);
                            f11 = f22;
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
                            int i11 = ceil * 6;
                            float[] fArr = new float[i11];
                            int i12 = 0;
                            int i13 = 0;
                            while (i12 < ceil) {
                                Path path2 = path;
                                double d42 = (i12 * d40) + d39;
                                double cos2 = Math.cos(d42);
                                double sin3 = Math.sin(d42);
                                fArr[i13] = (float) (cos2 - (sin2 * sin3));
                                fArr[i13 + 1] = (float) ((cos2 * sin2) + sin3);
                                double d43 = d42 + d40;
                                double cos3 = Math.cos(d43);
                                double d44 = d40;
                                double sin4 = Math.sin(d43);
                                int i14 = i12;
                                fArr[i13 + 2] = (float) ((sin2 * sin4) + cos3);
                                fArr[i13 + 3] = (float) (sin4 - (sin2 * cos3));
                                int i15 = i13 + 5;
                                fArr[i13 + 4] = (float) cos3;
                                i13 += 6;
                                fArr[i15] = (float) sin4;
                                i12 = i14 + 1;
                                path = path2;
                                f22 = f22;
                                d40 = d44;
                                i11 = i11;
                            }
                            Path path3 = path;
                            float f25 = f22;
                            int i16 = i11;
                            Matrix matrix = new Matrix();
                            matrix.postScale(abs, abs2);
                            matrix.postRotate(a12);
                            matrix.postTranslate((float) d31, (float) d32);
                            matrix.mapPoints(fArr);
                            fArr[i16 - 2] = f10;
                            fArr[i16 - 1] = f25;
                            for (int i17 = 0; i17 < i16; i17 += 6) {
                                path3.cubicTo(fArr[i17], fArr[i17 + 1], fArr[i17 + 2], fArr[i17 + 3], fArr[i17 + 4], fArr[i17 + 5]);
                            }
                            path = path3;
                            f11 = f25;
                        }
                    }
                    f16 = f10;
                    f17 = f11;
                    f20 = f14;
                    f21 = f15;
                    f18 = f12;
                    f19 = f13;
                    z11 = false;
                    break;
                case hs.E0 /* 67 */:
                case hs.k1 /* 99 */:
                    z10 = true;
                    float a15 = fzVar2.a();
                    float a16 = fzVar2.a();
                    float a17 = fzVar2.a();
                    float a18 = fzVar2.a();
                    float a19 = fzVar2.a();
                    float a20 = fzVar2.a();
                    if (c10 == 'c') {
                        a15 += f16;
                        a17 += f16;
                        a19 += f16;
                        a16 += f17;
                        a18 += f17;
                        a20 += f17;
                    }
                    float f26 = a15;
                    float f27 = a16;
                    float f28 = a17;
                    float f29 = a18;
                    float f30 = a19;
                    float f31 = a20;
                    path.cubicTo(f26, f27, f28, f29, f30, f31);
                    f18 = f28;
                    f19 = f29;
                    f16 = f30;
                    f17 = f31;
                    i3 = length;
                    fzVar = fzVar2;
                    z11 = z10;
                    break;
                case hs.J0 /* 72 */:
                case hs.p1 /* 104 */:
                    float a21 = fzVar2.a();
                    if (c10 == 'h') {
                        path.rLineTo(a21, 0.0f);
                        f16 += a21;
                        i3 = length;
                        fzVar = fzVar2;
                        z11 = false;
                        break;
                    } else {
                        path.lineTo(a21, f17);
                        i3 = length;
                        fzVar = fzVar2;
                        f16 = a21;
                        z11 = false;
                    }
                case hs.N0 /* 76 */:
                case hs.t1 /* 108 */:
                    float a22 = fzVar2.a();
                    float a23 = fzVar2.a();
                    if (c10 == 'l') {
                        path.rLineTo(a22, a23);
                        f16 += a22;
                        f17 += a23;
                        i3 = length;
                        fzVar = fzVar2;
                        z11 = false;
                        break;
                    } else {
                        path.lineTo(a22, a23);
                        i3 = length;
                        fzVar = fzVar2;
                        f16 = a22;
                        f17 = a23;
                        z11 = false;
                    }
                case hs.O0 /* 77 */:
                case hs.u1 /* 109 */:
                    float a24 = fzVar2.a();
                    float a25 = fzVar2.a();
                    if (c10 == 'm') {
                        f20 += a24;
                        f21 += a25;
                        path.rMoveTo(a24, a25);
                        f16 += a24;
                        f17 += a25;
                        i3 = length;
                        fzVar = fzVar2;
                        z11 = false;
                        break;
                    } else {
                        path.moveTo(a24, a25);
                        i3 = length;
                        fzVar = fzVar2;
                        f16 = a24;
                        f20 = f16;
                        f17 = a25;
                        f21 = f17;
                        z11 = false;
                    }
                case hs.S0 /* 81 */:
                case hs.y1 /* 113 */:
                    z10 = true;
                    float a26 = fzVar2.a();
                    float a27 = fzVar2.a();
                    float a28 = fzVar2.a();
                    float a29 = fzVar2.a();
                    if (c10 == 'q') {
                        a26 += f16;
                        a27 += f17;
                        a28 += f16;
                        a29 += f17;
                    }
                    f18 = a26;
                    f19 = a27;
                    f16 = a28;
                    f17 = a29;
                    path.quadTo(f18, f19, f16, f17);
                    i3 = length;
                    fzVar = fzVar2;
                    z11 = z10;
                    break;
                case hs.U0 /* 83 */:
                case hs.A1 /* 115 */:
                    float a30 = fzVar2.a();
                    float a31 = fzVar2.a();
                    float a32 = fzVar2.a();
                    float a33 = fzVar2.a();
                    if (c10 == 's') {
                        a30 += f16;
                        a32 += f16;
                        a31 += f17;
                        a33 += f17;
                    }
                    float f32 = a33;
                    float f33 = (f16 * 2.0f) - f18;
                    float f34 = (f17 * 2.0f) - f19;
                    float f35 = a30;
                    float f36 = a31;
                    float f37 = a32;
                    path.cubicTo(f33, f34, f35, f36, f37, f32);
                    i3 = length;
                    fzVar = fzVar2;
                    f18 = f35;
                    f19 = f36;
                    f16 = f37;
                    f17 = f32;
                    z11 = true;
                    break;
                case hs.V0 /* 84 */:
                case hs.B1 /* 116 */:
                    float a34 = fzVar2.a();
                    float a35 = fzVar2.a();
                    if (c10 == 't') {
                        a34 += f16;
                        a35 += f17;
                    }
                    f18 = (f16 * 2.0f) - f18;
                    f19 = (f17 * 2.0f) - f19;
                    path.quadTo(f18, f19, a34, a35);
                    i3 = length;
                    fzVar = fzVar2;
                    f16 = a34;
                    f17 = a35;
                    break;
                case hs.X0 /* 86 */:
                case hs.D1 /* 118 */:
                    float a36 = fzVar2.a();
                    if (c10 == 'v') {
                        path.rLineTo(0.0f, a36);
                        f17 += a36;
                        i3 = length;
                        fzVar = fzVar2;
                        z11 = false;
                        break;
                    } else {
                        path.lineTo(f16, a36);
                        i3 = length;
                        fzVar = fzVar2;
                        f17 = a36;
                        z11 = false;
                    }
                case hs.b1 /* 90 */:
                case hs.G1 /* 122 */:
                    path.close();
                    path.moveTo(f20, f21);
                    i3 = length;
                    fzVar = fzVar2;
                    f16 = f20;
                    f18 = f16;
                    f17 = f21;
                    f19 = f17;
                    break;
                default:
                    i3 = length;
                    fzVar = fzVar2;
                    z11 = false;
                    break;
            }
            if (!z11) {
                f18 = f16;
                f19 = f17;
            }
            fzVar.d();
            str2 = str;
            length = i3;
            fzVar2 = fzVar;
            c10 = c2;
        }
    }

    public static Bitmap c(float f10, int i3, int i10, int i11, int i12, int i13) {
        try {
            InputStream openRawResource = t0.b.getResources().openRawResource(i3);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                hz hzVar = new hz(i10, i11, Integer.valueOf(i12), false, f10, i13);
                xMLReader.setContentHandler(hzVar);
                xMLReader.parse(new InputSource(openRawResource));
                Bitmap bitmap = hzVar.b;
                if (openRawResource != null) {
                    openRawResource.close();
                }
                return bitmap;
            } finally {
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static Bitmap d(int i3, int i10, int i11, int i12) {
        return c(1.0f, i3, i10, i11, i12, 1);
    }

    public static Bitmap e(int i3, int i10, String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            hz hzVar = new hz(i3, i10, null, false);
            xMLReader.setContentHandler(hzVar);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return hzVar.b;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static Bitmap f(File file, int i3, int i10, int i11) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                hz hzVar = new hz(i3, i10, null, false, 1.0f, i11);
                hzVar.F = true;
                xMLReader.setContentHandler(hzVar);
                xMLReader.parse(new InputSource(fileInputStream));
                Bitmap bitmap = hzVar.b;
                fileInputStream.close();
                return bitmap;
            } finally {
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static Bitmap g(FilterInputStream filterInputStream, int i3, int i10) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            hz hzVar = new hz(i3, i10, null, false);
            xMLReader.setContentHandler(hzVar);
            xMLReader.parse(new InputSource(filterInputStream));
            return hzVar.b;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static jz h(int i3, Integer num) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            hz hzVar = new hz(0, 0, num, true);
            xMLReader.setContentHandler(hzVar);
            xMLReader.parse(new InputSource(t0.b.getResources().openRawResource(i3)));
            return hzVar.c;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static jz i(String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            hz hzVar = new hz(0, 0, null, true);
            xMLReader.setContentHandler(hzVar);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return hzVar.c;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static jz j(int i3, int i10, Path path) {
        try {
            jz jzVar = new jz();
            jzVar.a.add(path);
            jzVar.b.put(path, new Paint(1));
            jzVar.e = i3;
            jzVar.f = i10;
            return jzVar;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static Float k(String str, Attributes attributes) {
        String l10 = l(str, attributes);
        if (l10 == null) {
            return null;
        }
        if (l10.endsWith("px")) {
            l10 = com.google.android.recaptcha.internal.a.j(l10, 2, 0);
        } else if (l10.endsWith("mm")) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(l10));
    }

    public static String l(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i3 = 0; i3 < length; i3++) {
            if (attributes.getLocalName(i3).equals(str)) {
                return attributes.getValue(i3);
            }
        }
        return null;
    }

    public static hz m(File file, int i3, int i10, boolean z10) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                hz hzVar = new hz(i3, i10, z10 ? -1 : null, false);
                if (!z10) {
                    hzVar.F = true;
                }
                xMLReader.setContentHandler(hzVar);
                xMLReader.parse(new InputSource(fileInputStream));
                fileInputStream.close();
                return hzVar;
            } finally {
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static mi.z3 n(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        boolean z10 = false;
        for (int i10 = 1; i10 < length; i10++) {
            if (z10) {
                z10 = false;
            } else {
                char charAt = str.charAt(i10);
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                    case '-':
                        if (charAt != '-' || str.charAt(i10 - 1) != 'e') {
                            String substring = str.substring(i3, i10);
                            if (substring.trim().length() > 0) {
                                arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                                if (charAt == '-') {
                                    i3 = i10;
                                    break;
                                } else {
                                    i3 = i10 + 1;
                                    z10 = true;
                                    break;
                                }
                            } else {
                                i3++;
                                break;
                            }
                        } else {
                            break;
                        }
                    case ')':
                    case 'A':
                    case hs.E0 /* 67 */:
                    case hs.J0 /* 72 */:
                    case hs.N0 /* 76 */:
                    case hs.O0 /* 77 */:
                    case hs.S0 /* 81 */:
                    case hs.U0 /* 83 */:
                    case hs.V0 /* 84 */:
                    case hs.X0 /* 86 */:
                    case hs.b1 /* 90 */:
                    case hs.i1 /* 97 */:
                    case hs.k1 /* 99 */:
                    case hs.p1 /* 104 */:
                    case hs.t1 /* 108 */:
                    case hs.u1 /* 109 */:
                    case hs.y1 /* 113 */:
                    case hs.A1 /* 115 */:
                    case hs.B1 /* 116 */:
                    case hs.D1 /* 118 */:
                    case hs.G1 /* 122 */:
                        String substring2 = str.substring(i3, i10);
                        if (substring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                        }
                        return new mi.z3(arrayList);
                }
            }
        }
        String substring3 = str.substring(i3);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException unused) {
            }
        }
        return new mi.z3(arrayList);
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
