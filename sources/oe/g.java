package oe;

import c8.v9;
import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class g implements me.d {
    public final me.d a;
    public final me.d b;

    public g(me.d keyDesc, me.d valueDesc) {
        kotlin.jvm.internal.j.e(keyDesc, "keyDesc");
        kotlin.jvm.internal.j.e(valueDesc, "valueDesc");
        this.a = keyDesc;
        this.b = valueDesc;
    }

    @Override // me.d
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // me.d
    public final boolean c() {
        return false;
    }

    @Override // me.d
    public final int d(String name) {
        kotlin.jvm.internal.j.e(name, "name");
        Integer b10 = xd.k.b(name);
        if (b10 != null) {
            return b10.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // me.d
    public final v9 e() {
        return me.f.d;
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

    @Override // me.d
    public final int f() {
        return 2;
    }

    @Override // me.d
    public final String g(int i7) {
        return String.valueOf(i7);
    }

    @Override // me.d
    public final List getAnnotations() {
        return hd.n.a;
    }

    @Override // me.d
    public final List h(int i7) {
        if (i7 >= 0) {
            return hd.n.a;
        }
        throw new IllegalArgumentException(jg.g.k(i7, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override // me.d
    public final me.d i(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(jg.g.k(i7, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i10 = i7 % 2;
        if (i10 == 0) {
            return this.a;
        }
        if (i10 == 1) {
            return this.b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // me.d
    public final boolean isInline() {
        return false;
    }

    @Override // me.d
    public final boolean j(int i7) {
        if (i7 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(jg.g.k(i7, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.a + ", " + this.b + ')';
    }
}
