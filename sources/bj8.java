// default package

import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class bj8 implements w4a {
    public final String a;
    public final aj8 b;

    public bj8(String str, aj8 aj8Var) {
        aj8Var.getClass();
        this.a = str;
        this.b = aj8Var;
    }

    @Override // w4a
    public final String a() {
        return this.a;
    }

    @Override // w4a
    public final boolean c() {
        return false;
    }

    @Override // w4a
    public final int d(String str) {
        str.getClass();
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // w4a
    public final vte e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj8)) {
            return false;
        }
        bj8 bj8Var = (bj8) obj;
        return this.a.equals(bj8Var.a) && rp5.a(this.b, bj8Var.b);
    }

    @Override // w4a
    public final int f() {
        return 0;
    }

    @Override // w4a
    public final String g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // w4a
    public final List getAnnotations() {
        return c24.a;
    }

    @Override // w4a
    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // w4a
    public final w4a i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // w4a
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.a + ')';
    }
}
