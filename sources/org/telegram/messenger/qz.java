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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class qz {
    public static final double[] a = new double[128];
    public static final Pattern b;

    static {
        int i7 = 0;
        while (true) {
            double[] dArr = a;
            if (i7 >= dArr.length) {
                b = Pattern.compile("(?<=\\))\\s*(?=[A-Za-z])");
                return;
            } else {
                dArr[i7] = Math.pow(10.0d, i7);
                i7++;
            }
        }
    }

    public static String a(byte[] bArr) {
        try {
            StringBuilder sb2 = new StringBuilder(bArr.length * 2);
            sb2.append('M');
            for (byte b10 : bArr) {
                int i7 = b10 & 255;
                if (i7 >= 192) {
                    sb2.append("AACAAAAHAAALMAAAQASTAVAAAZaacaaaahaaalmaaaqastava.az0123456789-,".charAt(i7 - 192));
                } else {
                    if (i7 >= 128) {
                        sb2.append(',');
                    } else if (i7 >= 64) {
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
        char c10;
        float f10;
        int i7;
        lz lzVar;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z10;
        String str2 = str;
        t0.m();
        int length = str2.length();
        lz lzVar2 = new lz();
        lzVar2.b = str2;
        lzVar2.c = 0;
        lzVar2.d = str2.length();
        lzVar2.a = str2.charAt(0);
        lzVar2.d();
        Path path = new Path();
        char c11 = 0;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        while (true) {
            int i10 = lzVar2.c;
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
                case ns.o0 /* 51 */:
                case ns.p0 /* 52 */:
                case ns.q0 /* 53 */:
                case ns.r0 /* 54 */:
                case ns.s0 /* 55 */:
                case ns.t0 /* 56 */:
                case ns.u0 /* 57 */:
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
                    lzVar2.a = lzVar2.b();
                    c11 = charAt;
                    c10 = c11;
                    break;
            }
            boolean z11 = true;
            switch (c11) {
                case 'A':
                case ns.i1 /* 97 */:
                    float a10 = lzVar2.a();
                    float a11 = lzVar2.a();
                    float a12 = lzVar2.a();
                    boolean z12 = ((int) lzVar2.a()) == 1;
                    boolean z13 = ((int) lzVar2.a()) == 1;
                    float a13 = lzVar2.a();
                    float a14 = lzVar2.a();
                    if (c11 == 'a') {
                        f10 = a13 + f16;
                        a14 += f17;
                    } else {
                        f10 = a13;
                    }
                    float f22 = a14;
                    if (f16 == f10 && f17 == f22) {
                        i7 = length;
                        lzVar = lzVar2;
                        f11 = f22;
                        f12 = f18;
                        f13 = f19;
                        f14 = f20;
                        f15 = f21;
                    } else if (a10 == 0.0f || a11 == 0.0f) {
                        i7 = length;
                        lzVar = lzVar2;
                        f11 = f22;
                        f12 = f18;
                        f13 = f19;
                        f14 = f20;
                        f15 = f21;
                        path.lineTo(f10, f11);
                    } else {
                        float abs = Math.abs(a10);
                        float abs2 = Math.abs(a11);
                        i7 = length;
                        lzVar = lzVar2;
                        double radians = Math.toRadians(a12 % 360.0d);
                        double cos = Math.cos(radians);
                        double sin = Math.sin(radians);
                        float f23 = f16;
                        float f24 = f17;
                        double d = (f23 - f10) / 2.0d;
                        double d2 = (f24 - f22) / 2.0d;
                        double d10 = (sin * d2) + (cos * d);
                        f12 = f18;
                        f13 = f19;
                        double d11 = (cos * d2) + ((-sin) * d);
                        double d12 = abs * abs;
                        double d13 = abs2 * abs2;
                        double d14 = d10 * d10;
                        double d15 = d11 * d11;
                        double d16 = (d15 / d13) + (d14 / d12);
                        if (d16 > 0.99999d) {
                            double sqrt = Math.sqrt(d16) * 1.00001d;
                            abs = (float) (abs * sqrt);
                            abs2 = (float) (abs2 * sqrt);
                            d12 = abs * abs;
                            d13 = abs2 * abs2;
                        }
                        double d17 = d12;
                        double d18 = d13;
                        double d19 = z12 == z13 ? -1.0d : 1.0d;
                        double d20 = d17 * d15;
                        double d21 = (d17 * d18) - d20;
                        double d22 = d18 * d14;
                        double d23 = (d21 - d22) / (d20 + d22);
                        if (d23 < 0.0d) {
                            d23 = 0.0d;
                        }
                        double sqrt2 = Math.sqrt(d23) * d19;
                        double d24 = abs;
                        double d25 = d24 * d11;
                        double d26 = abs2;
                        double d27 = (d25 / d26) * sqrt2;
                        double d28 = sqrt2 * (-((d26 * d10) / d24));
                        double d29 = (f24 + f22) / 2.0d;
                        double d30 = ((cos * d27) - (sin * d28)) + ((f23 + f10) / 2.0d);
                        f14 = f20;
                        f15 = f21;
                        double d31 = (cos * d28) + (sin * d27) + d29;
                        double d32 = (d10 - d27) / d24;
                        double d33 = (d11 - d28) / d26;
                        double d34 = ((-d10) - d27) / d24;
                        double d35 = ((-d11) - d28) / d26;
                        double d36 = (d33 * d33) + (d32 * d32);
                        double acos = Math.acos(d32 / Math.sqrt(d36)) * (d33 < 0.0d ? -1.0d : 1.0d);
                        double sqrt3 = ((d33 * d35) + (d32 * d34)) / Math.sqrt(((d35 * d35) + (d34 * d34)) * d36);
                        double acos2 = ((d32 * d35) - (d33 * d34) < 0.0d ? -1.0d : 1.0d) * (sqrt3 < -1.0d ? 3.141592653589793d : sqrt3 > 1.0d ? 0.0d : Math.acos(sqrt3));
                        if (acos2 == 0.0d) {
                            path.lineTo(f10, f22);
                            f11 = f22;
                        } else {
                            if (!z13 && acos2 > 0.0d) {
                                acos2 -= 6.283185307179586d;
                            } else if (z13 && acos2 < 0.0d) {
                                acos2 += 6.283185307179586d;
                            }
                            double d37 = acos2 % 6.283185307179586d;
                            double d38 = acos % 6.283185307179586d;
                            int ceil = (int) Math.ceil((Math.abs(d37) * 2.0d) / 3.141592653589793d);
                            double d39 = d37 / ceil;
                            double d40 = d39 / 2.0d;
                            double sin2 = (Math.sin(d40) * 1.3333333333333333d) / (Math.cos(d40) + 1.0d);
                            int i11 = ceil * 6;
                            float[] fArr = new float[i11];
                            int i12 = 0;
                            int i13 = 0;
                            while (i12 < ceil) {
                                Path path2 = path;
                                double d41 = (i12 * d39) + d38;
                                double cos2 = Math.cos(d41);
                                double sin3 = Math.sin(d41);
                                fArr[i13] = (float) (cos2 - (sin2 * sin3));
                                fArr[i13 + 1] = (float) ((cos2 * sin2) + sin3);
                                double d42 = d41 + d39;
                                double cos3 = Math.cos(d42);
                                double d43 = d39;
                                double sin4 = Math.sin(d42);
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
                                d39 = d43;
                                i11 = i11;
                            }
                            Path path3 = path;
                            float f25 = f22;
                            int i16 = i11;
                            Matrix matrix = new Matrix();
                            matrix.postScale(abs, abs2);
                            matrix.postRotate(a12);
                            matrix.postTranslate((float) d30, (float) d31);
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
                case ns.E0 /* 67 */:
                case ns.k1 /* 99 */:
                    z10 = true;
                    float a15 = lzVar2.a();
                    float a16 = lzVar2.a();
                    float a17 = lzVar2.a();
                    float a18 = lzVar2.a();
                    float a19 = lzVar2.a();
                    float a20 = lzVar2.a();
                    if (c11 == 'c') {
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
                    i7 = length;
                    lzVar = lzVar2;
                    z11 = z10;
                    break;
                case ns.J0 /* 72 */:
                case ns.p1 /* 104 */:
                    float a21 = lzVar2.a();
                    if (c11 == 'h') {
                        path.rLineTo(a21, 0.0f);
                        f16 += a21;
                        i7 = length;
                        lzVar = lzVar2;
                        z11 = false;
                        break;
                    } else {
                        path.lineTo(a21, f17);
                        i7 = length;
                        lzVar = lzVar2;
                        f16 = a21;
                        z11 = false;
                    }
                case ns.N0 /* 76 */:
                case ns.t1 /* 108 */:
                    float a22 = lzVar2.a();
                    float a23 = lzVar2.a();
                    if (c11 == 'l') {
                        path.rLineTo(a22, a23);
                        f16 += a22;
                        f17 += a23;
                        i7 = length;
                        lzVar = lzVar2;
                        z11 = false;
                        break;
                    } else {
                        path.lineTo(a22, a23);
                        i7 = length;
                        lzVar = lzVar2;
                        f16 = a22;
                        f17 = a23;
                        z11 = false;
                    }
                case ns.O0 /* 77 */:
                case ns.u1 /* 109 */:
                    float a24 = lzVar2.a();
                    float a25 = lzVar2.a();
                    if (c11 == 'm') {
                        f20 += a24;
                        f21 += a25;
                        path.rMoveTo(a24, a25);
                        f16 += a24;
                        f17 += a25;
                        i7 = length;
                        lzVar = lzVar2;
                        z11 = false;
                        break;
                    } else {
                        path.moveTo(a24, a25);
                        i7 = length;
                        lzVar = lzVar2;
                        f16 = a24;
                        f20 = f16;
                        f17 = a25;
                        f21 = f17;
                        z11 = false;
                    }
                case ns.S0 /* 81 */:
                case ns.y1 /* 113 */:
                    z10 = true;
                    float a26 = lzVar2.a();
                    float a27 = lzVar2.a();
                    float a28 = lzVar2.a();
                    float a29 = lzVar2.a();
                    if (c11 == 'q') {
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
                    i7 = length;
                    lzVar = lzVar2;
                    z11 = z10;
                    break;
                case ns.U0 /* 83 */:
                case ns.A1 /* 115 */:
                    float a30 = lzVar2.a();
                    float a31 = lzVar2.a();
                    float a32 = lzVar2.a();
                    float a33 = lzVar2.a();
                    if (c11 == 's') {
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
                    i7 = length;
                    lzVar = lzVar2;
                    f18 = f35;
                    f19 = f36;
                    f16 = f37;
                    f17 = f32;
                    z11 = true;
                    break;
                case ns.V0 /* 84 */:
                case ns.B1 /* 116 */:
                    float a34 = lzVar2.a();
                    float a35 = lzVar2.a();
                    if (c11 == 't') {
                        a34 += f16;
                        a35 += f17;
                    }
                    f18 = (f16 * 2.0f) - f18;
                    f19 = (f17 * 2.0f) - f19;
                    path.quadTo(f18, f19, a34, a35);
                    i7 = length;
                    lzVar = lzVar2;
                    f16 = a34;
                    f17 = a35;
                    break;
                case ns.X0 /* 86 */:
                case ns.D1 /* 118 */:
                    float a36 = lzVar2.a();
                    if (c11 == 'v') {
                        path.rLineTo(0.0f, a36);
                        f17 += a36;
                        i7 = length;
                        lzVar = lzVar2;
                        z11 = false;
                        break;
                    } else {
                        path.lineTo(f16, a36);
                        i7 = length;
                        lzVar = lzVar2;
                        f17 = a36;
                        z11 = false;
                    }
                case ns.b1 /* 90 */:
                case ns.G1 /* 122 */:
                    path.close();
                    path.moveTo(f20, f21);
                    i7 = length;
                    lzVar = lzVar2;
                    f16 = f20;
                    f18 = f16;
                    f17 = f21;
                    f19 = f17;
                    break;
                default:
                    i7 = length;
                    lzVar = lzVar2;
                    z11 = false;
                    break;
            }
            if (!z11) {
                f18 = f16;
                f19 = f17;
            }
            lzVar.d();
            str2 = str;
            length = i7;
            lzVar2 = lzVar;
            c11 = c10;
        }
    }

    public static Bitmap c(float f10, int i7, int i10, int i11, int i12, int i13) {
        try {
            InputStream openRawResource = t0.b.getResources().openRawResource(i7);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                nz nzVar = new nz(i10, i11, Integer.valueOf(i12), false, f10, i13);
                xMLReader.setContentHandler(nzVar);
                xMLReader.parse(new InputSource(openRawResource));
                Bitmap bitmap = nzVar.b;
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

    public static Bitmap d(int i7, int i10, int i11, int i12) {
        return c(1.0f, i7, i10, i11, i12, 1);
    }

    public static Bitmap e(int i7, int i10, String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            nz nzVar = new nz(i7, i10, null, false);
            xMLReader.setContentHandler(nzVar);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return nzVar.b;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static Bitmap f(File file, int i7, int i10, int i11) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                nz nzVar = new nz(i7, i10, null, false, 1.0f, i11);
                nzVar.F = true;
                xMLReader.setContentHandler(nzVar);
                xMLReader.parse(new InputSource(fileInputStream));
                Bitmap bitmap = nzVar.b;
                fileInputStream.close();
                return bitmap;
            } finally {
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static Bitmap g(FilterInputStream filterInputStream, int i7, int i10) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            nz nzVar = new nz(i7, i10, null, false);
            xMLReader.setContentHandler(nzVar);
            xMLReader.parse(new InputSource(filterInputStream));
            return nzVar.b;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static pz h(int i7, Integer num) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            nz nzVar = new nz(0, 0, num, true);
            xMLReader.setContentHandler(nzVar);
            xMLReader.parse(new InputSource(t0.b.getResources().openRawResource(i7)));
            return nzVar.c;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static pz i(String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            nz nzVar = new nz(0, 0, null, true);
            xMLReader.setContentHandler(nzVar);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return nzVar.c;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static pz j(int i7, int i10, Path path) {
        try {
            pz pzVar = new pz();
            pzVar.a.add(path);
            pzVar.b.put(path, new Paint(1));
            pzVar.e = i7;
            pzVar.f = i10;
            return pzVar;
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
            l10 = com.google.android.gms.internal.vision.e2.k(l10, 2, 0);
        } else if (l10.endsWith("mm")) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(l10));
    }

    public static String l(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i7 = 0; i7 < length; i7++) {
            if (attributes.getLocalName(i7).equals(str)) {
                return attributes.getValue(i7);
            }
        }
        return null;
    }

    public static nz m(File file, int i7, int i10, boolean z10) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                nz nzVar = new nz(i7, i10, z10 ? -1 : null, false);
                if (!z10) {
                    nzVar.F = true;
                }
                xMLReader.setContentHandler(nzVar);
                xMLReader.parse(new InputSource(fileInputStream));
                fileInputStream.close();
                return nzVar;
            } finally {
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static hi.l0 n(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
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
                            String substring = str.substring(i7, i10);
                            if (substring.trim().length() > 0) {
                                arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                                if (charAt == '-') {
                                    i7 = i10;
                                    break;
                                } else {
                                    i7 = i10 + 1;
                                    z10 = true;
                                    break;
                                }
                            } else {
                                i7++;
                                break;
                            }
                        } else {
                            break;
                        }
                    case ')':
                    case 'A':
                    case ns.E0 /* 67 */:
                    case ns.J0 /* 72 */:
                    case ns.N0 /* 76 */:
                    case ns.O0 /* 77 */:
                    case ns.S0 /* 81 */:
                    case ns.U0 /* 83 */:
                    case ns.V0 /* 84 */:
                    case ns.X0 /* 86 */:
                    case ns.b1 /* 90 */:
                    case ns.i1 /* 97 */:
                    case ns.k1 /* 99 */:
                    case ns.p1 /* 104 */:
                    case ns.t1 /* 108 */:
                    case ns.u1 /* 109 */:
                    case ns.y1 /* 113 */:
                    case ns.A1 /* 115 */:
                    case ns.B1 /* 116 */:
                    case ns.D1 /* 118 */:
                    case ns.G1 /* 122 */:
                        String substring2 = str.substring(i7, i10);
                        if (substring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                        }
                        return new hi.l0(arrayList, 26);
                }
            }
        }
        String substring3 = str.substring(i7);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException unused) {
            }
        }
        return new hi.l0(arrayList, 26);
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
                ArrayList arrayList2 = (ArrayList) n(str3.substring(7)).b;
                if (arrayList2.size() == 6) {
                    matrix = new Matrix();
                    matrix.setValues(new float[]{((Float) arrayList2.get(0)).floatValue(), ((Float) arrayList2.get(2)).floatValue(), ((Float) arrayList2.get(4)).floatValue(), ((Float) arrayList2.get(1)).floatValue(), ((Float) arrayList2.get(3)).floatValue(), ((Float) arrayList2.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                }
                matrix = null;
            } else if (str3.startsWith("translate(")) {
                ArrayList arrayList3 = (ArrayList) n(str3.substring(10)).b;
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
                    ArrayList arrayList4 = (ArrayList) n(str3.substring(6)).b;
                    if (arrayList4.size() > 0) {
                        float floatValue3 = ((Float) arrayList4.get(0)).floatValue();
                        floatValue = arrayList4.size() > 1 ? ((Float) arrayList4.get(1)).floatValue() : 0.0f;
                        matrix2 = new Matrix();
                        matrix2.postScale(floatValue3, floatValue);
                        matrix = matrix2;
                    }
                } else if (str3.startsWith("skewX(")) {
                    ArrayList arrayList5 = (ArrayList) n(str3.substring(6)).b;
                    if (arrayList5.size() > 0) {
                        float floatValue4 = ((Float) arrayList5.get(0)).floatValue();
                        matrix = new Matrix();
                        matrix.postSkew((float) Math.tan(floatValue4), 0.0f);
                    }
                } else if (str3.startsWith("skewY(")) {
                    ArrayList arrayList6 = (ArrayList) n(str3.substring(6)).b;
                    if (arrayList6.size() > 0) {
                        float floatValue5 = ((Float) arrayList6.get(0)).floatValue();
                        matrix = new Matrix();
                        matrix.postSkew(0.0f, (float) Math.tan(floatValue5));
                    }
                } else if (str3.startsWith("rotate(")) {
                    ArrayList arrayList7 = (ArrayList) n(str3.substring(7)).b;
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
