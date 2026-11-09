package oc;

import java.io.InputStream;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class a {
    public static int f;
    public InputStream a;
    public int b;
    public int c;
    public int d;
    public mc.a e;

    public final int a() {
        if (this.d == 8) {
            this.b = this.c;
            this.c = this.a.read();
            this.d = 0;
            if (this.b == -1) {
                return -1;
            }
        }
        int i7 = this.b;
        int i10 = this.d;
        int i11 = (i7 >> (7 - i10)) & 1;
        this.d = i10 + 1;
        mc.a aVar = this.e;
        char c10 = i11 == 0 ? '0' : '1';
        int i12 = aVar.c;
        char[] cArr = aVar.b;
        if (i12 < cArr.length - 1) {
            cArr[i12] = c10;
            aVar.c = i12 + 1;
        }
        f++;
        return i11;
    }

    public final boolean b(String str) {
        boolean z9 = a() != 0;
        f(str, z9 ? "1" : "0");
        return z9;
    }

    public final long c(int i7) {
        if (i7 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j3 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j3 = (j3 << 1) | a();
        }
        return j3;
    }

    public final long d(int i7, String str) {
        long c10 = c(i7);
        f(str, String.valueOf(c10));
        return c10;
    }

    public final int e(String str) {
        int i7 = 0;
        int i10 = 0;
        while (a() == 0) {
            i10++;
        }
        if (i10 > 0) {
            i7 = (int) (((1 << i10) - 1) + c(i10));
        }
        f(str, String.valueOf(i7));
        return i7;
    }

    public final void f(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int i7 = f;
        mc.a aVar = this.e;
        String valueOf = String.valueOf(i7 - aVar.c);
        int length = 8 - valueOf.length();
        sb2.append("@".concat(valueOf));
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(' ');
        }
        sb2.append(str);
        int length2 = (100 - sb2.length()) - aVar.c;
        for (int i11 = 0; i11 < length2; i11++) {
            sb2.append(' ');
        }
        sb2.append(aVar);
        sb2.append(" (" + str2 + ")");
        aVar.c = 0;
    }
}
