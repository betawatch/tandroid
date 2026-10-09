package org.telegram.ui.Wallet;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class h0 implements AutoCloseable {
    public final byte[] a;
    public boolean b;

    public h0(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Missing recovery phrase");
        }
        this.a = (byte[]) bArr.clone();
    }

    public static h0 d(ArrayList arrayList) {
        int max = Math.max(0, arrayList.size() - 1);
        ArrayList arrayList2 = new ArrayList();
        try {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                arrayList2.add(((String) obj).getBytes(StandardCharsets.UTF_8));
                long length = max + r5.length;
                max = (int) length;
                if (length != max) {
                    throw new ArithmeticException();
                }
            }
            byte[] bArr = new byte[max];
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                try {
                    if (i12 > 0) {
                        bArr[i11] = 32;
                        i11++;
                    }
                    byte[] bArr2 = (byte[]) arrayList2.get(i12);
                    System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                    i11 += bArr2.length;
                } finally {
                    Arrays.fill(bArr, (byte) 0);
                }
            }
            h0 h0Var = new h0(bArr);
            Arrays.fill(bArr, (byte) 0);
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                Arrays.fill((byte[]) obj2, (byte) 0);
            }
            return h0Var;
        } catch (Throwable th2) {
            int size3 = arrayList2.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList2.get(i14);
                i14++;
                Arrays.fill((byte[]) obj3, (byte) 0);
            }
            throw th2;
        }
    }

    public static boolean f(byte b10) {
        return b10 == 32 || b10 == 9 || b10 == 10 || b10 == 13 || b10 == 12 || b10 == 11;
    }

    public final void a() {
        if (this.b) {
            throw new IllegalStateException("Recovery phrase is closed");
        }
    }

    public final synchronized h0 b() {
        a();
        return new h0(this.a);
    }

    public final synchronized byte[] c() {
        a();
        return (byte[]) this.a.clone();
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        Arrays.fill(this.a, (byte) 0);
        this.b = true;
    }

    public final synchronized boolean e() {
        return h() == 0;
    }

    public final synchronized ArrayList g() {
        ArrayList arrayList;
        try {
            a();
            arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < this.a.length) {
                while (true) {
                    byte[] bArr = this.a;
                    if (i10 >= bArr.length || !f(bArr[i10])) {
                        break;
                    }
                    i10++;
                }
                int i11 = i10;
                while (true) {
                    byte[] bArr2 = this.a;
                    if (i11 >= bArr2.length || f(bArr2[i11])) {
                        break;
                    }
                    i11++;
                }
                if (i11 > i10) {
                    arrayList.add(new String(this.a, i10, i11 - i10, StandardCharsets.UTF_8));
                }
                i10 = i11;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized int h() {
        int i10;
        a();
        i10 = 0;
        boolean z10 = false;
        for (byte b10 : this.a) {
            if (f(b10)) {
                z10 = false;
            } else if (!z10) {
                i10++;
                z10 = true;
            }
        }
        return i10;
    }

    public final String toString() {
        return "SecretPhrase[redacted]";
    }
}
