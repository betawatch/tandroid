package bc;

import java.io.InputStream;
import p2.w;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a {
    public static int f;
    public InputStream a;
    public int b;
    public int c;
    public int d;
    public w e;

    public final int a() {
        if (this.d == 8) {
            this.b = this.c;
            this.c = this.a.read();
            this.d = 0;
            if (this.b == -1) {
                return -1;
            }
        }
        int i10 = this.b;
        int i11 = this.d;
        int i12 = (i10 >> (7 - i11)) & 1;
        this.d = i11 + 1;
        w wVar = this.e;
        char c3 = i12 == 0 ? '0' : '1';
        int i13 = wVar.b;
        char[] cArr = (char[]) wVar.c;
        if (i13 < cArr.length - 1) {
            cArr[i13] = c3;
            wVar.b = i13 + 1;
        }
        f++;
        return i12;
    }

    public final boolean b(String str) {
        boolean z4 = a() != 0;
        f(str, z4 ? "1" : "0");
        return z4;
    }

    public final long c(int i10) {
        if (i10 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 1) | a();
        }
        return j10;
    }

    public final long d(int i10, String str) {
        long c3 = c(i10);
        f(str, String.valueOf(c3));
        return c3;
    }

    public final int e(String str) {
        int i10 = 0;
        int i11 = 0;
        while (a() == 0) {
            i11++;
        }
        if (i11 > 0) {
            i10 = (int) (((1 << i11) - 1) + c(i11));
        }
        f(str, String.valueOf(i10));
        return i10;
    }

    public final void f(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int i10 = f;
        w wVar = this.e;
        String valueOf = String.valueOf(i10 - wVar.b);
        int length = 8 - valueOf.length();
        sb.append("@".concat(valueOf));
        for (int i11 = 0; i11 < length; i11++) {
            sb.append(' ');
        }
        sb.append(str);
        int length2 = (100 - sb.length()) - wVar.b;
        for (int i12 = 0; i12 < length2; i12++) {
            sb.append(' ');
        }
        sb.append(wVar);
        sb.append(" (" + str2 + ")");
        wVar.b = 0;
    }
}
