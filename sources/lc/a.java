package lc;

import java.io.InputStream;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a {
    public static int f;
    public InputStream a;
    public int b;
    public int c;
    public int d;
    public jc.a e;

    public final int a() {
        if (this.d == 8) {
            this.b = this.c;
            this.c = this.a.read();
            this.d = 0;
            if (this.b == -1) {
                return -1;
            }
        }
        int i3 = this.b;
        int i10 = this.d;
        int i11 = (i3 >> (7 - i10)) & 1;
        this.d = i10 + 1;
        jc.a aVar = this.e;
        char c2 = i11 == 0 ? '0' : '1';
        int i12 = aVar.c;
        char[] cArr = aVar.b;
        if (i12 < cArr.length - 1) {
            cArr[i12] = c2;
            aVar.c = i12 + 1;
        }
        f++;
        return i11;
    }

    public final boolean b(String str) {
        boolean z10 = a() != 0;
        f(str, z10 ? "1" : "0");
        return z10;
    }

    public final long c(int i3) {
        if (i3 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j10 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            j10 = (j10 << 1) | a();
        }
        return j10;
    }

    public final long d(int i3, String str) {
        long c2 = c(i3);
        f(str, String.valueOf(c2));
        return c2;
    }

    public final int e(String str) {
        int i3 = 0;
        int i10 = 0;
        while (a() == 0) {
            i10++;
        }
        if (i10 > 0) {
            i3 = (int) (((1 << i10) - 1) + c(i10));
        }
        f(str, String.valueOf(i3));
        return i3;
    }

    public final void f(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int i3 = f;
        jc.a aVar = this.e;
        String valueOf = String.valueOf(i3 - aVar.c);
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
