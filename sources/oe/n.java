package oe;

import c8.v9;
import java.util.List;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class n implements me.d {
    public final String a;
    public final me.c b;

    public n(String str, me.c kind) {
        kotlin.jvm.internal.j.e(kind, "kind");
        this.a = str;
        this.b = kind;
    }

    @Override // me.d
    public final String a() {
        return this.a;
    }

    @Override // me.d
    public final boolean c() {
        return false;
    }

    @Override // me.d
    public final int d(String name) {
        kotlin.jvm.internal.j.e(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // me.d
    public final v9 e() {
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

    @Override // me.d
    public final int f() {
        return 0;
    }

    @Override // me.d
    public final String g(int i7) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // me.d
    public final List getAnnotations() {
        return hd.n.a;
    }

    @Override // me.d
    public final List h(int i7) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // me.d
    public final me.d i(int i7) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // me.d
    public final boolean isInline() {
        return false;
    }

    @Override // me.d
    public final boolean j(int i7) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.a + ')';
    }
}
