package j3;

import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u1 extends g2 {
    public static final String d;
    public static final d0 e;
    public final float c;

    static {
        int i10 = f5.d0.a;
        d = Integer.toString(1, 36);
        e = new d0(8);
    }

    public u1() {
        this.c = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u1) {
            return this.c == ((u1) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.c)});
    }

    public u1(float f9) {
        f5.a.e("percent must be in the range of [0, 100]", f9 >= 0.0f && f9 <= 100.0f);
        this.c = f9;
    }
}
