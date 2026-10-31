package org.telegram.ui.Wallet;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h0 implements AutoCloseable {
    public final byte[] a;
    public boolean b;

    public h0(byte[] bArr) {
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

    public final synchronized boolean d() {
        return g() == 0;
    }

    public final synchronized ArrayList f() {
        ArrayList arrayList;
        try {
            a();
            arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < this.a.length) {
                while (true) {
                    byte[] bArr = this.a;
                    if (i10 >= bArr.length || !e(bArr[i10])) {
                        break;
                    }
                    i10++;
                }
                int i11 = i10;
                while (true) {
                    byte[] bArr2 = this.a;
                    if (i11 >= bArr2.length || e(bArr2[i11])) {
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

    public final synchronized int g() {
        int i10;
        a();
        i10 = 0;
        boolean z10 = false;
        for (byte b10 : this.a) {
            if (e(b10)) {
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
