package e2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import c2.a1;
import j3.r0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class e {
    public static final wa.a a = new wa.a(5);
    public static final byte[] b = {112, 114, 111, 0};
    public static final byte[] c = {112, 114, 109, 0};
    public static final byte[] d = {48, 49, 53, 0};
    public static final byte[] e = {48, 49, 48, 0};
    public static final byte[] f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(b[] bVarArr, byte[] bArr) {
        int i9 = 0;
        for (b bVar : bVarArr) {
            i9 += ((((bVar.g * 2) + 7) & (-8)) / 8) + (bVar.e * 2) + d(bVar.a, bVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i9);
        if (Arrays.equals(bArr, f)) {
            for (b bVar2 : bVarArr) {
                p(byteArrayOutputStream, bVar2, d(bVar2.a, bVar2.b, bArr));
                r(byteArrayOutputStream, bVar2);
                int[] iArr = bVar2.h;
                int length = iArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = iArr[i10];
                    u(byteArrayOutputStream, i12 - i11);
                    i10++;
                    i11 = i12;
                }
                q(byteArrayOutputStream, bVar2);
            }
        } else {
            for (b bVar3 : bVarArr) {
                p(byteArrayOutputStream, bVar3, d(bVar3.a, bVar3.b, bArr));
            }
            for (b bVar4 : bVarArr) {
                r(byteArrayOutputStream, bVar4);
                int[] iArr2 = bVar4.h;
                int length2 = iArr2.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = iArr2[i13];
                    u(byteArrayOutputStream, i15 - i14);
                    i13++;
                    i14 = i15;
                }
                q(byteArrayOutputStream, bVar4);
            }
        }
        if (byteArrayOutputStream.size() == i9) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i9);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : listFiles) {
            z10 = c(file2) && z10;
        }
        return z10;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g;
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
                return aa.d.r(c.n(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(int i9, InputStream inputStream) {
        byte[] bArr = new byte[i9];
        int i10 = 0;
        while (i10 < i9) {
            int read = inputStream.read(bArr, i10, i9 - i10);
            if (read < 0) {
                throw new IllegalStateException(r0.l(i9, "Not enough bytes to read: "));
            }
            i10 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i9) {
        int[] iArr = new int[i9];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 += (int) m(2, byteArrayInputStream);
            iArr[i11] = i10;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] h(FileInputStream fileInputStream, int i9, int i10) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[2048];
            int i11 = 0;
            int i12 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i11 < i9) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i9 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i12 += inflater.inflate(bArr, i12, i10 - i12);
                    i11 += read;
                } catch (DataFormatException e10) {
                    throw new IllegalStateException(e10.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i9 + " actual=" + i11);
        } finally {
            inflater.end();
        }
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m10 = (int) m(2, fileInputStream);
            byte[] h10 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
            try {
                b[] k10 = k(byteArrayInputStream, bArr2, m10, bVarArr);
                byteArrayInputStream.close();
                return k10;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m11 = (int) m(1, fileInputStream);
        byte[] h11 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h11);
        try {
            b[] j10 = j(byteArrayInputStream2, m11, bVarArr);
            byteArrayInputStream2.close();
            return j10;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i9, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i9 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i9];
        int[] iArr = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            int m10 = (int) m(2, byteArrayInputStream);
            iArr[i10] = (int) m(2, byteArrayInputStream);
            strArr[i10] = new String(f(m10, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i11 = 0; i11 < i9; i11++) {
            b bVar = bVarArr[i11];
            if (!bVar.b.equals(strArr[i11])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i12 = iArr[i11];
            bVar.e = i12;
            bVar.h = g(byteArrayInputStream, i12);
        }
        return bVarArr;
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i9, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i9 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i10 = 0; i10 < i9; i10++) {
            m(2, byteArrayInputStream);
            String str = new String(f((int) m(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long m10 = m(4, byteArrayInputStream);
            int m11 = (int) m(2, byteArrayInputStream);
            b bVar = null;
            if (bVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i11].b.equals(substring)) {
                        bVar = bVarArr[i11];
                        break;
                    }
                    i11++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.d = m10;
            int[] g10 = g(byteArrayInputStream, m11);
            if (Arrays.equals(bArr, h)) {
                bVar.e = m11;
                bVar.h = g10;
            }
        }
        return bVarArr;
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m10 = (int) m(1, fileInputStream);
        byte[] h10 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
        try {
            b[] n10 = n(byteArrayInputStream, str, m10);
            byteArrayInputStream.close();
            return n10;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(int i9, InputStream inputStream) {
        byte[] f10 = f(i9, inputStream);
        long j10 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j10 += (f10[i10] & 255) << (i10 * 8);
        }
        return j10;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i9) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            int m10 = (int) m(2, byteArrayInputStream);
            int m11 = (int) m(2, byteArrayInputStream);
            bVarArr[i10] = new b(str, new String(f(m10, byteArrayInputStream), StandardCharsets.UTF_8), m(4, byteArrayInputStream), m11, (int) m(4, byteArrayInputStream), (int) m(4, byteArrayInputStream), new int[m11], new TreeMap());
        }
        int i11 = 0;
        while (i11 < i9) {
            b bVar = bVarArr[i11];
            int available = byteArrayInputStream.available();
            int i12 = bVar.f;
            int i13 = bVar.g;
            TreeMap treeMap = bVar.i;
            int i14 = available - i12;
            int i15 = 0;
            while (byteArrayInputStream.available() > i14) {
                i15 += (int) m(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(i15), 1);
                int m12 = (int) m(2, byteArrayInputStream);
                while (m12 > 0) {
                    m(2, byteArrayInputStream);
                    int m13 = (int) m(1, byteArrayInputStream);
                    if (m13 != 6 && m13 != 7) {
                        while (m13 > 0) {
                            m(1, byteArrayInputStream);
                            int i16 = i11;
                            for (int m14 = (int) m(1, byteArrayInputStream); m14 > 0; m14--) {
                                m(2, byteArrayInputStream);
                            }
                            m13--;
                            i11 = i16;
                        }
                    }
                    m12--;
                    i11 = i11;
                }
            }
            int i17 = i11;
            if (byteArrayInputStream.available() != i14) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.h = g(byteArrayInputStream, bVar.e);
            BitSet valueOf = BitSet.valueOf(f((((i13 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i18 = 0; i18 < i13; i18++) {
                int i19 = valueOf.get(i18) ? 2 : 0;
                if (valueOf.get(i18 + i13)) {
                    i19 |= 4;
                }
                if (i19 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i18));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i18), Integer.valueOf(i19 | num.intValue()));
                }
            }
            i11 = i17 + 1;
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        long j10;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = d;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b10 = b(bVarArr, bArr3);
                t(byteArrayOutputStream, bVarArr.length, 1);
                t(byteArrayOutputStream, b10.length, 4);
                byte[] a2 = a(b10);
                t(byteArrayOutputStream, a2.length, 4);
                byteArrayOutputStream.write(a2);
                return true;
            }
            byte[] bArr4 = g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.i.size() * 4;
                    String d9 = d(bVar.a, bVar.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d9.getBytes(charset).length);
                    u(byteArrayOutputStream, bVar.h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, bVar.c, 4);
                    byteArrayOutputStream.write(d9.getBytes(charset));
                    Iterator it = bVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i9 : bVar.h) {
                        u(byteArrayOutputStream, i9);
                    }
                }
                return true;
            }
            byte[] bArr5 = f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b11 = b(bVarArr, bArr5);
                t(byteArrayOutputStream, bVarArr.length, 1);
                t(byteArrayOutputStream, b11.length, 4);
                byte[] a3 = a(b11);
                t(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr6 = h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String str = bVar2.a;
                TreeMap treeMap = bVar2.i;
                String d10 = d(str, bVar2.b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d10.getBytes(charset2).length);
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, bVar2.h.length);
                t(byteArrayOutputStream, bVar2.c, 4);
                byteArrayOutputStream.write(d10.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i10 : bVar2.h) {
                    u(byteArrayOutputStream, i10);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, bVarArr.length);
            int i11 = 2;
            for (b bVar3 : bVarArr) {
                t(byteArrayOutputStream2, bVar3.c, 4);
                t(byteArrayOutputStream2, bVar3.d, 4);
                t(byteArrayOutputStream2, bVar3.g, 4);
                String d11 = d(bVar3.a, bVar3.b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d11.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i11 = i11 + 14 + length2;
                byteArrayOutputStream2.write(d11.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i11 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray.length);
            }
            l lVar = new l(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(lVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < bVarArr.length; i13++) {
                try {
                    b bVar4 = bVarArr[i13];
                    u(byteArrayOutputStream3, i13);
                    u(byteArrayOutputStream3, bVar4.e);
                    i12 = i12 + 4 + (bVar4.e * 2);
                    int[] iArr = bVar4.h;
                    int length3 = iArr.length;
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < length3) {
                        int i16 = iArr[i14];
                        u(byteArrayOutputStream3, i16 - i15);
                        i14++;
                        i15 = i16;
                    }
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray2.length);
            }
            l lVar2 = new l(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(lVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i17 = 0;
            int i18 = 0;
            while (i17 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i17];
                    Iterator it3 = bVar5.i.entrySet().iterator();
                    int i19 = 0;
                    while (it3.hasNext()) {
                        i19 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i17);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i20 = i18 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i19);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i18 = i20 + length4;
                            i17++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i18 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i18 + ", does not match actual size " + byteArray5.length);
            }
            l lVar3 = new l(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(lVar3);
            long j11 = 4;
            long size2 = j11 + j11 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i21 = 0;
            while (i21 < arrayList2.size()) {
                l lVar4 = (l) arrayList2.get(i21);
                int i22 = lVar4.a;
                byte[] bArr7 = lVar4.b;
                if (i22 == 1) {
                    j10 = 0;
                } else if (i22 == 2) {
                    j10 = 1;
                } else if (i22 == 3) {
                    j10 = 2;
                } else if (i22 == 4) {
                    j10 = 3;
                } else {
                    if (i22 != 5) {
                        throw null;
                    }
                    j10 = 4;
                }
                t(byteArrayOutputStream, j10, 4);
                t(byteArrayOutputStream, size2, 4);
                if (lVar4.c) {
                    long length5 = bArr7.length;
                    byte[] a10 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a10);
                    t(byteArrayOutputStream, a10.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a10.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i21++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i23));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, bVar.e);
        t(byteArrayOutputStream, bVar.f, 4);
        t(byteArrayOutputStream, bVar.c, 4);
        t(byteArrayOutputStream, bVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        byte[] bArr = new byte[(((bVar.g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i9 = intValue / 8;
                bArr[i9] = (byte) (bArr[i9] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i10 = intValue + bVar.g;
                int i11 = i10 / 8;
                bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i9 = 0;
        for (Map.Entry entry : bVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i9);
                u(byteArrayOutputStream, 0);
                i9 = intValue;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Executor executor, d dVar, boolean z10) {
        FileInputStream fileInputStream;
        byte[] bArr;
        b[] bVarArr;
        b[] bVarArr2;
        b[] bVarArr3;
        byte[] bArr2;
        boolean z11;
        FileOutputStream fileOutputStream;
        boolean z12;
        ByteArrayOutputStream byteArrayOutputStream;
        int i9;
        a1 a1Var;
        FileInputStream a2;
        boolean z13;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z13 = readLong == packageInfo.lastUpdateTime;
                            if (z13) {
                                dVar.g(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z13) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        k.c(context, false);
                        return;
                    }
                }
                z13 = false;
                if (z13) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i10 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            a1 a1Var2 = new a1(assets, executor, dVar, name, file2);
            byte[] bArr3 = (byte[]) a1Var2.d;
            if (bArr3 == null) {
                a1Var2.b(3, Integer.valueOf(i10));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        a1Var2.b(4, null);
                    }
                } else if (!file2.canWrite()) {
                    a1Var2.b(4, null);
                }
                a1Var2.a = true;
                try {
                    try {
                        fileInputStream = a1Var2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e10) {
                        dVar.g(6, e10);
                        fileInputStream = null;
                        bArr = b;
                        if (fileInputStream != null) {
                        }
                        bVarArr2 = (b[]) a1Var2.g;
                        if (bVarArr2 != null) {
                        }
                        d dVar2 = (d) a1Var2.c;
                        bVarArr3 = (b[]) a1Var2.g;
                        byte[] bArr4 = (byte[]) a1Var2.d;
                        if (bVarArr3 != null) {
                        }
                        bArr2 = (byte[]) a1Var2.h;
                        if (bArr2 == null) {
                        }
                        if (z11) {
                        }
                        z12 = z11;
                        k.c(context, !z12 && z10);
                    } catch (IOException e11) {
                        dVar.g(7, e11);
                        fileInputStream = null;
                        bArr = b;
                        if (fileInputStream != null) {
                        }
                        bVarArr2 = (b[]) a1Var2.g;
                        if (bVarArr2 != null) {
                        }
                        d dVar22 = (d) a1Var2.c;
                        bVarArr3 = (b[]) a1Var2.g;
                        byte[] bArr42 = (byte[]) a1Var2.d;
                        if (bVarArr3 != null) {
                        }
                        bArr2 = (byte[]) a1Var2.h;
                        if (bArr2 == null) {
                        }
                        if (z11) {
                        }
                        z12 = z11;
                        k.c(context, !z12 && z10);
                    }
                    if (fileInputStream != null) {
                        try {
                            try {
                            } catch (IllegalStateException e12) {
                                dVar.g(8, e12);
                                try {
                                    fileInputStream.close();
                                } catch (IOException e13) {
                                    dVar.g(7, e13);
                                }
                                bVarArr = null;
                                a1Var2.g = bVarArr;
                                bVarArr2 = (b[]) a1Var2.g;
                                if (bVarArr2 != null) {
                                    if (i9 != 24) {
                                        switch (i9) {
                                        }
                                    }
                                    try {
                                        a2 = a1Var2.a(assets, "dexopt/baseline.profm");
                                        if (a2 == null) {
                                        }
                                    } catch (FileNotFoundException e14) {
                                        dVar.g(9, e14);
                                    } catch (IOException e15) {
                                        dVar.g(7, e15);
                                    } catch (IllegalStateException e16) {
                                        a1Var2.g = null;
                                        dVar.g(8, e16);
                                    }
                                }
                                d dVar222 = (d) a1Var2.c;
                                bVarArr3 = (b[]) a1Var2.g;
                                byte[] bArr422 = (byte[]) a1Var2.d;
                                if (bVarArr3 != null) {
                                    if (a1Var2.a) {
                                    }
                                }
                                bArr2 = (byte[]) a1Var2.h;
                                if (bArr2 == null) {
                                }
                                if (z11) {
                                }
                                z12 = z11;
                                k.c(context, !z12 && z10);
                            }
                        } catch (IOException e17) {
                            dVar.g(7, e17);
                            fileInputStream.close();
                            bVarArr = null;
                            a1Var2.g = bVarArr;
                            bVarArr2 = (b[]) a1Var2.g;
                            if (bVarArr2 != null) {
                            }
                            d dVar2222 = (d) a1Var2.c;
                            bVarArr3 = (b[]) a1Var2.g;
                            byte[] bArr4222 = (byte[]) a1Var2.d;
                            if (bVarArr3 != null) {
                            }
                            bArr2 = (byte[]) a1Var2.h;
                            if (bArr2 == null) {
                            }
                            if (z11) {
                            }
                            z12 = z11;
                            k.c(context, !z12 && z10);
                        }
                        if (!Arrays.equals(bArr, f(4, fileInputStream))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        bVarArr = l(fileInputStream, f(4, fileInputStream), (String) a1Var2.f);
                        try {
                            fileInputStream.close();
                        } catch (IOException e18) {
                            dVar.g(7, e18);
                        }
                        a1Var2.g = bVarArr;
                    }
                    bVarArr2 = (b[]) a1Var2.g;
                    if (bVarArr2 != null && (i9 = Build.VERSION.SDK_INT) >= 24 && i9 <= 34) {
                        if (i9 != 24 && i9 != 25) {
                            switch (i9) {
                            }
                        }
                        a2 = a1Var2.a(assets, "dexopt/baseline.profm");
                        if (a2 == null) {
                            try {
                                if (!Arrays.equals(c, f(4, a2))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                a1Var2.g = i(a2, f(4, a2), bArr3, bVarArr2);
                                a2.close();
                                a1Var = a1Var2;
                                if (a1Var != null) {
                                    a1Var2 = a1Var;
                                }
                            } finally {
                            }
                        } else {
                            if (a2 != null) {
                                a2.close();
                            }
                            a1Var = null;
                            if (a1Var != null) {
                            }
                        }
                    }
                    d dVar22222 = (d) a1Var2.c;
                    bVarArr3 = (b[]) a1Var2.g;
                    byte[] bArr42222 = (byte[]) a1Var2.d;
                    if (bVarArr3 != null && bArr42222 != null) {
                        if (a1Var2.a) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr42222);
                            } finally {
                            }
                        } catch (IOException e19) {
                            dVar22222.g(7, e19);
                        } catch (IllegalStateException e20) {
                            dVar22222.g(8, e20);
                        }
                        if (o(byteArrayOutputStream, bArr42222, bVarArr3)) {
                            a1Var2.h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            a1Var2.g = null;
                        } else {
                            dVar22222.g(5, null);
                            a1Var2.g = null;
                            byteArrayOutputStream.close();
                        }
                    }
                    bArr2 = (byte[]) a1Var2.h;
                    if (bArr2 == null) {
                        z11 = false;
                    } else {
                        try {
                            if (!a1Var2.a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        fileOutputStream = new FileOutputStream((File) a1Var2.e);
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                    try {
                                        try {
                                            byte[] bArr5 = new byte[512];
                                            while (true) {
                                                int read = byteArrayInputStream.read(bArr5);
                                                if (read > 0) {
                                                    fileOutputStream.write(bArr5, 0, read);
                                                } else {
                                                    try {
                                                        a1Var2.b(1, null);
                                                        fileOutputStream.close();
                                                        byteArrayInputStream.close();
                                                        a1Var2.h = null;
                                                        a1Var2.g = null;
                                                        z11 = true;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        Throwable th3 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th3;
                                                        } catch (Throwable th4) {
                                                            th3.addSuppressed(th4);
                                                            throw th3;
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        Throwable th7 = th;
                                        try {
                                            byteArrayInputStream.close();
                                            throw th7;
                                        } catch (Throwable th8) {
                                            th7.addSuppressed(th8);
                                            throw th7;
                                        }
                                    }
                                } catch (FileNotFoundException e21) {
                                    e = e21;
                                    a1Var2.b(6, e);
                                    z11 = false;
                                    if (z11) {
                                    }
                                    z12 = z11;
                                    k.c(context, !z12 && z10);
                                } catch (IOException e22) {
                                    e = e22;
                                    a1Var2.b(7, e);
                                    z11 = false;
                                    if (z11) {
                                    }
                                    z12 = z11;
                                    k.c(context, !z12 && z10);
                                }
                            } catch (FileNotFoundException e23) {
                                e = e23;
                                a1Var2.b(6, e);
                                z11 = false;
                                if (z11) {
                                }
                                z12 = z11;
                                k.c(context, !z12 && z10);
                            } catch (IOException e24) {
                                e = e24;
                                a1Var2.b(7, e);
                                z11 = false;
                                if (z11) {
                                }
                                z12 = z11;
                                k.c(context, !z12 && z10);
                            }
                        } finally {
                            a1Var2.h = null;
                            a1Var2.g = null;
                        }
                    }
                    if (z11) {
                        e(packageInfo, filesDir);
                    }
                    z12 = z11;
                    k.c(context, !z12 && z10);
                } finally {
                }
                bArr = b;
            }
            z12 = false;
            k.c(context, !z12 && z10);
        } catch (PackageManager.NameNotFoundException e25) {
            dVar.g(7, e25);
            k.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j10, int i9) {
        byte[] bArr = new byte[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            bArr[i10] = (byte) ((j10 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i9) {
        t(byteArrayOutputStream, i9, 2);
    }
}
