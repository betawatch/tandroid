package le;

import b8.jd;
import java.util.List;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g implements je.d {
    public final je.d a;
    public final je.d b;

    public g(je.d keyDesc, je.d valueDesc) {
        kotlin.jvm.internal.j.e(keyDesc, "keyDesc");
        kotlin.jvm.internal.j.e(valueDesc, "valueDesc");
        this.a = keyDesc;
        this.b = valueDesc;
    }

    @Override // je.d
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // je.d
    public final boolean c() {
        return false;
    }

    @Override // je.d
    public final int d(String name) {
        kotlin.jvm.internal.j.e(name, "name");
        Integer b10 = ud.k.b(name);
        if (b10 != null) {
            return b10.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // je.d
    public final jd e() {
        return je.f.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.j.a(this.a, gVar.a) && kotlin.jvm.internal.j.a(this.b, gVar.b);
    }

    @Override // je.d
    public final int f() {
        return 2;
    }

    @Override // je.d
    public final String g(int i3) {
        return String.valueOf(i3);
    }

    @Override // je.d
    public final List getAnnotations() {
        return ed.o.a;
    }

    @Override // je.d
    public final List h(int i3) {
        if (i3 >= 0) {
            return ed.o.a;
        }
        throw new IllegalArgumentException(p1.j(i3, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override // je.d
    public final je.d i(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(p1.j(i3, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i10 = i3 % 2;
        if (i10 == 0) {
            return this.a;
        }
        if (i10 == 1) {
            return this.b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // je.d
    public final boolean isInline() {
        return false;
    }

    @Override // je.d
    public final boolean j(int i3) {
        if (i3 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(p1.j(i3, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.a + ", " + this.b + ')';
    }
}
