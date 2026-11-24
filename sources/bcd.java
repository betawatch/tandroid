// default package

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class bcd {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static byte[] a(fe3[] fe3VarArr, byte[] bArr) {
        int i = 0;
        for (fe3 fe3Var : fe3VarArr) {
            i += ((((fe3Var.g << 1) + 7) & (-8)) / 8) + b(bArr, fe3Var.a, fe3Var.b).getBytes(StandardCharsets.UTF_8).length + 16 + (fe3Var.e << 1) + fe3Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        if (Arrays.equals(bArr, icd.c)) {
            for (fe3 fe3Var2 : fe3VarArr) {
                j(byteArrayOutputStream, fe3Var2, b(bArr, fe3Var2.a, fe3Var2.b));
                l(byteArrayOutputStream, fe3Var2);
                int[] iArr = fe3Var2.h;
                int length = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = iArr[i2];
                    kfe.f(byteArrayOutputStream, i4 - i3);
                    i2++;
                    i3 = i4;
                }
                k(byteArrayOutputStream, fe3Var2);
            }
        } else {
            for (fe3 fe3Var3 : fe3VarArr) {
                j(byteArrayOutputStream, fe3Var3, b(bArr, fe3Var3.a, fe3Var3.b));
            }
            for (fe3 fe3Var4 : fe3VarArr) {
                l(byteArrayOutputStream, fe3Var4);
                int[] iArr2 = fe3Var4.h;
                int length2 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    int i7 = iArr2[i5];
                    kfe.f(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                k(byteArrayOutputStream, fe3Var4);
            }
        }
        if (byteArrayOutputStream.size() == i) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i);
    }

    public static String b(byte[] bArr, String str, String str2) {
        byte[] bArr2 = icd.e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = icd.d;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return b00.j(new StringBuilder(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) kfe.d(2, byteArrayInputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static fe3[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, fe3[] fe3VarArr) {
        byte[] bArr3 = icd.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, icd.g)) {
                sc8.j("Unsupported meta version");
                return null;
            }
            int d = (int) kfe.d(2, fileInputStream);
            byte[] c = kfe.c(fileInputStream, (int) kfe.d(4, fileInputStream), (int) kfe.d(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                sc8.j("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
            try {
                fe3[] f = f(byteArrayInputStream, bArr2, d, fe3VarArr);
                byteArrayInputStream.close();
                return f;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(icd.a, bArr2)) {
            sc8.j("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            sc8.j("Unsupported meta version");
            return null;
        }
        int d2 = (int) kfe.d(1, fileInputStream);
        byte[] c2 = kfe.c(fileInputStream, (int) kfe.d(4, fileInputStream), (int) kfe.d(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            sc8.j("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(c2);
        try {
            fe3[] e = e(byteArrayInputStream2, d2, fe3VarArr);
            byteArrayInputStream2.close();
            return e;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static fe3[] e(ByteArrayInputStream byteArrayInputStream, int i, fe3[] fe3VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new fe3[0];
        }
        if (i != fe3VarArr.length) {
            sc8.j("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int d = (int) kfe.d(2, byteArrayInputStream);
            iArr[i2] = (int) kfe.d(2, byteArrayInputStream);
            strArr[i2] = new String(kfe.b(d, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            fe3 fe3Var = fe3VarArr[i3];
            if (!fe3Var.b.equals(strArr[i3])) {
                sc8.j("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            fe3Var.e = i4;
            fe3Var.h = c(byteArrayInputStream, i4);
        }
        return fe3VarArr;
    }

    public static fe3[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, fe3[] fe3VarArr) {
        fe3 fe3Var;
        if (byteArrayInputStream.available() == 0) {
            return new fe3[0];
        }
        if (i != fe3VarArr.length) {
            sc8.j("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            kfe.d(2, byteArrayInputStream);
            String str = new String(kfe.b((int) kfe.d(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long d = kfe.d(4, byteArrayInputStream);
            int d2 = (int) kfe.d(2, byteArrayInputStream);
            if (fe3VarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i3 = 0; i3 < fe3VarArr.length; i3++) {
                    if (fe3VarArr[i3].b.equals(substring)) {
                        fe3Var = fe3VarArr[i3];
                        break;
                    }
                }
            }
            fe3Var = null;
            if (fe3Var == null) {
                sc8.j("Missing profile key: ".concat(str));
                return null;
            }
            fe3Var.d = d;
            int[] c = c(byteArrayInputStream, d2);
            if (Arrays.equals(bArr, icd.e)) {
                fe3Var.e = d2;
                fe3Var.h = c;
            }
        }
        return fe3VarArr;
    }

    public static fe3[] g(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, icd.b)) {
            sc8.j("Unsupported version");
            return null;
        }
        int d = (int) kfe.d(1, fileInputStream);
        byte[] c = kfe.c(fileInputStream, (int) kfe.d(4, fileInputStream), (int) kfe.d(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            sc8.j("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
        try {
            fe3[] h = h(byteArrayInputStream, str, d);
            byteArrayInputStream.close();
            return h;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static fe3[] h(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new fe3[0];
        }
        fe3[] fe3VarArr = new fe3[i];
        for (int i3 = 0; i3 < i; i3++) {
            int d = (int) kfe.d(2, byteArrayInputStream);
            int d2 = (int) kfe.d(2, byteArrayInputStream);
            fe3VarArr[i3] = new fe3(str, new String(kfe.b(d, byteArrayInputStream), StandardCharsets.UTF_8), kfe.d(4, byteArrayInputStream), d2, (int) kfe.d(4, byteArrayInputStream), (int) kfe.d(4, byteArrayInputStream), new int[d2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            fe3 fe3Var = fe3VarArr[i4];
            int available = byteArrayInputStream.available();
            int i5 = fe3Var.f;
            int i6 = fe3Var.g;
            TreeMap treeMap = fe3Var.i;
            int i7 = available - i5;
            int i8 = i2;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) kfe.d(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(i8), 1);
                int d3 = (int) kfe.d(2, byteArrayInputStream);
                while (d3 > 0) {
                    kfe.d(2, byteArrayInputStream);
                    int d4 = (int) kfe.d(1, byteArrayInputStream);
                    if (d4 != 6 && d4 != 7) {
                        while (d4 > 0) {
                            kfe.d(1, byteArrayInputStream);
                            int i9 = i2;
                            int i10 = i4;
                            for (int d5 = (int) kfe.d(1, byteArrayInputStream); d5 > 0; d5--) {
                                kfe.d(2, byteArrayInputStream);
                            }
                            d4--;
                            i2 = i9;
                            i4 = i10;
                        }
                    }
                    d3--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i11 = i2;
            int i12 = i4;
            if (byteArrayInputStream.available() != i7) {
                sc8.j("Read too much data during profile line parse");
                return null;
            }
            fe3Var.h = c(byteArrayInputStream, fe3Var.e);
            BitSet valueOf = BitSet.valueOf(kfe.b((((i6 << 1) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i13 = i11; i13 < i6; i13++) {
                int i14 = valueOf.get(i13) ? 2 : i11;
                if (valueOf.get(i13 + i6)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(num.intValue() | i14));
                }
            }
            i4 = i12 + 1;
            i2 = i11;
        }
        return fe3VarArr;
    }

    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, fe3[] fe3VarArr) {
        int i;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = icd.a;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = icd.b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] a2 = a(fe3VarArr, bArr3);
                kfe.e(byteArrayOutputStream, fe3VarArr.length, 1);
                kfe.e(byteArrayOutputStream, a2.length, 4);
                byte[] a3 = kfe.a(a2);
                kfe.e(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr4 = icd.d;
            if (Arrays.equals(bArr, bArr4)) {
                kfe.e(byteArrayOutputStream, fe3VarArr.length, 1);
                for (fe3 fe3Var : fe3VarArr) {
                    int size = fe3Var.i.size() << 2;
                    String b2 = b(bArr4, fe3Var.a, fe3Var.b);
                    Charset charset = StandardCharsets.UTF_8;
                    kfe.f(byteArrayOutputStream, b2.getBytes(charset).length);
                    kfe.f(byteArrayOutputStream, fe3Var.h.length);
                    kfe.e(byteArrayOutputStream, size, 4);
                    kfe.e(byteArrayOutputStream, fe3Var.c, 4);
                    byteArrayOutputStream.write(b2.getBytes(charset));
                    Iterator it = fe3Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        kfe.f(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        kfe.f(byteArrayOutputStream, 0);
                    }
                    for (int i3 : fe3Var.h) {
                        kfe.f(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = icd.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] a4 = a(fe3VarArr, bArr5);
                kfe.e(byteArrayOutputStream, fe3VarArr.length, 1);
                kfe.e(byteArrayOutputStream, a4.length, 4);
                byte[] a5 = kfe.a(a4);
                kfe.e(byteArrayOutputStream, a5.length, 4);
                byteArrayOutputStream.write(a5);
                return true;
            }
            byte[] bArr6 = icd.e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            kfe.f(byteArrayOutputStream, fe3VarArr.length);
            for (fe3 fe3Var2 : fe3VarArr) {
                String str = fe3Var2.a;
                TreeMap treeMap = fe3Var2.i;
                String b3 = b(bArr6, str, fe3Var2.b);
                Charset charset2 = StandardCharsets.UTF_8;
                kfe.f(byteArrayOutputStream, b3.getBytes(charset2).length);
                kfe.f(byteArrayOutputStream, treeMap.size());
                kfe.f(byteArrayOutputStream, fe3Var2.h.length);
                kfe.e(byteArrayOutputStream, fe3Var2.c, 4);
                byteArrayOutputStream.write(b3.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    kfe.f(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : fe3Var2.h) {
                    kfe.f(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            kfe.f(byteArrayOutputStream2, fe3VarArr.length);
            int i5 = 2;
            for (fe3 fe3Var3 : fe3VarArr) {
                kfe.e(byteArrayOutputStream2, fe3Var3.c, 4);
                kfe.e(byteArrayOutputStream2, fe3Var3.d, 4);
                kfe.e(byteArrayOutputStream2, fe3Var3.g, 4);
                String b4 = b(bArr2, fe3Var3.a, fe3Var3.b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = b4.getBytes(charset3).length;
                kfe.f(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(b4.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            tyc tycVar = new tyc(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(tycVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < fe3VarArr.length) {
                try {
                    fe3 fe3Var4 = fe3VarArr[i6];
                    kfe.f(byteArrayOutputStream3, i6);
                    kfe.f(byteArrayOutputStream3, fe3Var4.e);
                    i7 = i7 + 4 + (fe3Var4.e << 1);
                    int[] iArr = fe3Var4.h;
                    int length3 = iArr.length;
                    int i8 = i2;
                    while (i2 < length3) {
                        int i9 = iArr[i2];
                        kfe.f(byteArrayOutputStream3, i9 - i8);
                        i2++;
                        i8 = i9;
                    }
                    i6++;
                    i2 = 0;
                } finally {
                }
            }
            int i10 = 2;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            tyc tycVar2 = new tyc(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(tycVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < fe3VarArr.length) {
                try {
                    fe3 fe3Var5 = fe3VarArr[i11];
                    Iterator it3 = fe3Var5.i.entrySet().iterator();
                    int i13 = 0;
                    while (it3.hasNext()) {
                        i13 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        k(byteArrayOutputStream4, fe3Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            l(byteArrayOutputStream4, fe3Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            kfe.f(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            kfe.e(byteArrayOutputStream3, length4, 4);
                            kfe.f(byteArrayOutputStream3, i13);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i14 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            tyc tycVar3 = new tyc(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(tycVar3);
            long size2 = 12 + (arrayList2.size() << 4);
            kfe.e(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                tyc tycVar4 = (tyc) arrayList2.get(i15);
                int i16 = tycVar4.a;
                byte[] bArr7 = tycVar4.b;
                if (i16 == 1) {
                    i = 0;
                } else if (i16 == i10) {
                    i = 1;
                } else if (i16 == 3) {
                    i = 2;
                } else if (i16 == 4) {
                    i = 3;
                } else {
                    if (i16 != 5) {
                        throw null;
                    }
                    i = 4;
                }
                kfe.e(byteArrayOutputStream, i, 4);
                kfe.e(byteArrayOutputStream, size2, 4);
                if (tycVar4.c) {
                    long length5 = bArr7.length;
                    byte[] a6 = kfe.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a6);
                    kfe.e(byteArrayOutputStream, a6.length, 4);
                    kfe.e(byteArrayOutputStream, length5, 4);
                    length = a6.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    kfe.e(byteArrayOutputStream, bArr7.length, 4);
                    kfe.e(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i15++;
                arrayList5 = arrayList;
                i10 = 2;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
            }
            return true;
        } finally {
            try {
                byteArrayOutputStream2.close();
                throw th;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, fe3 fe3Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        kfe.f(byteArrayOutputStream, str.getBytes(charset).length);
        kfe.f(byteArrayOutputStream, fe3Var.e);
        kfe.e(byteArrayOutputStream, fe3Var.f, 4);
        kfe.e(byteArrayOutputStream, fe3Var.c, 4);
        kfe.e(byteArrayOutputStream, fe3Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, fe3 fe3Var) {
        byte[] bArr = new byte[(((fe3Var.g << 1) + 7) & (-8)) / 8];
        for (Map.Entry entry : fe3Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i = intValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i2 = intValue + fe3Var.g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (i2 % 8)));
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, fe3 fe3Var) {
        int i = 0;
        for (Map.Entry entry : fe3Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                kfe.f(byteArrayOutputStream, intValue - i);
                kfe.f(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }
}
