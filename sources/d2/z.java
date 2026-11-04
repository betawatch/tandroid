package d2;

import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        String str = g2.n0.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public z(String str, String str2) {
        this.a = g2.n0.T(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (Objects.equals(this.a, zVar.a) && Objects.equals(this.b, zVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
