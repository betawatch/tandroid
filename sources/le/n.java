package le;

import b8.jd;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n implements je.d {
    public final String a;
    public final je.c b;

    public n(String str, je.c kind) {
        kotlin.jvm.internal.j.e(kind, "kind");
        this.a = str;
        this.b = kind;
    }

    @Override // je.d
    public final String a() {
        return this.a;
    }

    @Override // je.d
    public final boolean c() {
        return false;
    }

    @Override // je.d
    public final int d(String name) {
        kotlin.jvm.internal.j.e(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // je.d
    public final jd e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.j.a(this.a, nVar.a) && kotlin.jvm.internal.j.a(this.b, nVar.b);
    }

    @Override // je.d
    public final int f() {
        return 0;
    }

    @Override // je.d
    public final String g(int i3) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // je.d
    public final List getAnnotations() {
        return ed.o.a;
    }

    @Override // je.d
    public final List h(int i3) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // je.d
    public final je.d i(int i3) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // je.d
    public final boolean isInline() {
        return false;
    }

    @Override // je.d
    public final boolean j(int i3) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.a + ')';
    }
}
