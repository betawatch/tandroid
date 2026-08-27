package h3;

import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u1 extends g2 {
    public static final String d;
    public static final f9.z e;
    public final float c;

    static {
        int i10 = d5.g0.a;
        d = Integer.toString(1, 36);
        e = new f9.z(25);
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

    public u1(float f10) {
        d5.a.e("percent must be in the range of [0, 100]", f10 >= 0.0f && f10 <= 100.0f);
        this.c = f10;
    }
}
