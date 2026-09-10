package jc;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b {
    public final byte[][] a;
    public final int b;
    public final int c;

    public b(int i10, int i11) {
        this.a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.b = i10;
        this.c = i11;
    }

    public final byte a(int i10, int i11) {
        return this.a[i11][i10];
    }

    public final void b(int i10, int i11, int i12) {
        this.a[i11][i10] = (byte) i12;
    }

    public final String toString() {
        int i10 = this.b;
        int i11 = this.c;
        StringBuilder sb2 = new StringBuilder((i10 * 2 * i11) + 2);
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr = this.a[i12];
            for (int i13 = 0; i13 < i10; i13++) {
                byte b10 = bArr[i13];
                if (b10 == 0) {
                    sb2.append(" 0");
                } else if (b10 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
