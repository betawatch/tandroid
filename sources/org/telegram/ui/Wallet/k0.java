package org.telegram.ui.Wallet;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class k0 implements AutoCloseable {
    public final byte[] a;
    public boolean b;

    public k0(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Missing recovery phrase");
        }
        this.a = (byte[]) bArr.clone();
    }

    public static boolean e(byte b10) {
        return b10 == 32 || b10 == 9 || b10 == 10 || b10 == 13 || b10 == 12 || b10 == 11;
    }

    public final void a() {
        if (this.b) {
            throw new IllegalStateException("Recovery phrase is closed");
        }
    }

    public final synchronized k0 b() {
        a();
        return new k0(this.a);
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

    public final synchronized boolean d() {
        return g() == 0;
    }

    public final synchronized ArrayList f() {
        ArrayList arrayList;
        try {
            a();
            arrayList = new ArrayList();
            int i7 = 0;
            while (i7 < this.a.length) {
                while (true) {
                    byte[] bArr = this.a;
                    if (i7 >= bArr.length || !e(bArr[i7])) {
                        break;
                    }
                    i7++;
                }
                int i10 = i7;
                while (true) {
                    byte[] bArr2 = this.a;
                    if (i10 >= bArr2.length || e(bArr2[i10])) {
                        break;
                    }
                    i10++;
                }
                if (i10 > i7) {
                    arrayList.add(new String(this.a, i7, i10 - i7, StandardCharsets.UTF_8));
                }
                i7 = i10;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized int g() {
        int i7;
        a();
        i7 = 0;
        boolean z9 = false;
        for (byte b10 : this.a) {
            if (e(b10)) {
                z9 = false;
            } else if (!z9) {
                i7++;
                z9 = true;
            }
        }
        return i7;
    }

    public final String toString() {
        return "SecretPhrase[redacted]";
    }
}
