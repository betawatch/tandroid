// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class el8 implements y6a {
    public final String a;
    public final dl8 b;

    public el8(String str, dl8 dl8Var) {
        dl8Var.getClass();
        this.a = str;
        this.b = dl8Var;
    }

    @Override // y6a
    public final String a() {
        return this.a;
    }

    @Override // y6a
    public final boolean c() {
        return false;
    }

    @Override // y6a
    public final int d(String str) {
        str.getClass();
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // y6a
    public final yve e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el8)) {
            return false;
        }
        el8 el8Var = (el8) obj;
        return this.a.equals(el8Var.a) && rr5.a(this.b, el8Var.b);
    }

    @Override // y6a
    public final int f() {
        return 0;
    }

    @Override // y6a
    public final String g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // y6a
    public final List getAnnotations() {
        return n34.a;
    }

    @Override // y6a
    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // y6a
    public final y6a i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // y6a
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.a + ')';
    }
}
