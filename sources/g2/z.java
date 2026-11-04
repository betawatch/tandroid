package g2;

import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z {
    public static final z c = new z(-1, -1);
    public final int a;
    public final int b;

    static {
        new z(0, 0);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public z(int i3, int i10) {
        zb.f((i3 == -1 || i3 >= 0) && (i10 == -1 || i10 >= 0));
        this.a = i3;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.a == zVar.a && this.b == zVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.a;
        return ((i3 >>> 16) | (i3 << 16)) ^ this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
