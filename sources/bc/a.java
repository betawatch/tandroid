package bc;

import java.io.InputStream;
import p2.v;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a {
    public static int f;
    public InputStream a;
    public int b;
    public int c;
    public int d;
    public v e;

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
        v vVar = this.e;
        char c3 = i12 == 0 ? '0' : '1';
        int i13 = vVar.b;
        char[] cArr = (char[]) vVar.c;
        if (i13 < cArr.length - 1) {
            cArr[i13] = c3;
            vVar.b = i13 + 1;
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
        v vVar = this.e;
        String valueOf = String.valueOf(i10 - vVar.b);
        int length = 8 - valueOf.length();
        sb.append("@".concat(valueOf));
        for (int i11 = 0; i11 < length; i11++) {
            sb.append(' ');
        }
        sb.append(str);
        int length2 = (100 - sb.length()) - vVar.b;
        for (int i12 = 0; i12 < length2; i12++) {
            sb.append(' ');
        }
        sb.append(vVar);
        sb.append(" (" + str2 + ")");
        vVar.b = 0;
    }
}
