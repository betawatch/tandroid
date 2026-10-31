package e9;

import java.io.Serializable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f2 extends v1 implements Serializable {
    public final v1 a;

    public f2(v1 v1Var) {
        this.a = v1Var;
    }

    @Override // e9.v1
    public final v1 a() {
        return this.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            return this.a.equals(((f2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a + ".reverse()";
    }
}
