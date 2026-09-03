package i5;

import h5.d0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class y implements j3.g {
    public static final y e = new y(0, 0, 1.0f, 0);
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    static {
        int i10 = d0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public y(int i10, int i11, float f10, int i12) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.a == yVar.a && this.b == yVar.b && this.c == yVar.c && this.d == yVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31);
    }
}
