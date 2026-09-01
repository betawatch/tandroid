package j3;

import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class s1 extends f2 {
    public static final String d;
    public static final q0 e;
    public final float c;

    static {
        int i10 = h5.d0.a;
        d = Integer.toString(1, 36);
        e = new q0(9);
    }

    public s1() {
        this.c = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s1) {
            return this.c == ((s1) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.c)});
    }

    public s1(float f10) {
        h5.a.e("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.c = f10;
    }
}
