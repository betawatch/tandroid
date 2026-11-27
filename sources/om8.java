// default package

import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class om8 implements o8a {
    public final String a;
    public final nm8 b;

    public om8(String str, nm8 nm8Var) {
        nm8Var.getClass();
        this.a = str;
        this.b = nm8Var;
    }

    @Override // o8a
    public final String a() {
        return this.a;
    }

    @Override // o8a
    public final boolean c() {
        return false;
    }

    @Override // o8a
    public final int d(String str) {
        str.getClass();
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // o8a
    public final nye e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om8)) {
            return false;
        }
        om8 om8Var = (om8) obj;
        return this.a.equals(om8Var.a) && ur5.a(this.b, om8Var.b);
    }

    @Override // o8a
    public final int f() {
        return 0;
    }

    @Override // o8a
    public final String g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // o8a
    public final List getAnnotations() {
        return x24.a;
    }

    @Override // o8a
    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // o8a
    public final o8a i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // o8a
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.a + ')';
    }
}
