package b2;

import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b0 {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        String str = e2.l0.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public b0(String str, String str2) {
        this.a = e2.l0.T(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (Objects.equals(this.a, b0Var.a) && Objects.equals(this.b, b0Var.b)) {
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
