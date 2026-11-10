package ec;

import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a {
    public static final a h;
    public final int[] a;
    public final int[] b;
    public final b c;
    public final b d;
    public final int e;
    public final int f;
    public final int g;

    static {
        new a(4201, TLObject.FLAG_12, 1);
        new a(1033, 1024, 1);
        new a(67, 64, 1);
        new a(19, 16, 1);
        h = new a(qs.I4, 256, 0);
        new a(qs.Y4, 256, 1);
    }

    public a(int i7, int i10, int i11) {
        this.f = i7;
        this.e = i10;
        this.g = i11;
        this.a = new int[i10];
        this.b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.a[i13] = i12;
            i12 *= 2;
            if (i12 >= i10) {
                i12 = (i12 ^ i7) & (i10 - 1);
            }
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.b[this.a[i14]] = i14;
        }
        this.c = new b(this, new int[]{0});
        this.d = new b(this, new int[]{1});
    }

    public final b a(int i7, int i10) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 == 0) {
            return this.c;
        }
        int[] iArr = new int[i7 + 1];
        iArr[0] = i10;
        return new b(this, iArr);
    }

    public final int b(int i7) {
        if (i7 == 0) {
            throw new ArithmeticException();
        }
        return this.a[(this.e - this.b[i7]) - 1];
    }

    public final int c(int i7, int i10) {
        if (i7 == 0 || i10 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i7] + iArr[i10]) % (this.e - 1)];
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f) + ',' + this.e + ')';
    }
}
