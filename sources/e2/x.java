package e2;

import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class x {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        String str = h2.m0.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public x(String str, String str2) {
        this.a = h2.m0.T(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (Objects.equals(this.a, xVar.a) && Objects.equals(this.b, xVar.b)) {
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
