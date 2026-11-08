package oe;

import c8.v9;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class o implements me.d, b {
    public final me.d a;
    public final String b;
    public final Set c;

    public o(me.d original) {
        Set set;
        kotlin.jvm.internal.j.e(original, "original");
        this.a = original;
        this.b = original.a() + '?';
        kotlin.jvm.internal.j.e(original, "<this>");
        if (original instanceof b) {
            set = ((b) original).b();
        } else {
            HashSet hashSet = new HashSet(original.f());
            int f10 = original.f();
            for (int i7 = 0; i7 < f10; i7++) {
                hashSet.add(original.g(i7));
            }
            set = hashSet;
        }
        this.c = set;
    }

    @Override // me.d
    public final String a() {
        return this.b;
    }

    @Override // oe.b
    public final Set b() {
        return this.c;
    }

    @Override // me.d
    public final boolean c() {
        return true;
    }

    @Override // me.d
    public final int d(String name) {
        kotlin.jvm.internal.j.e(name, "name");
        return this.a.d(name);
    }

    @Override // me.d
    public final v9 e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return kotlin.jvm.internal.j.a(this.a, ((o) obj).a);
        }
        return false;
    }

    @Override // me.d
    public final int f() {
        return this.a.f();
    }

    @Override // me.d
    public final String g(int i7) {
        return this.a.g(i7);
    }

    @Override // me.d
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // me.d
    public final List h(int i7) {
        return this.a.h(i7);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // me.d
    public final me.d i(int i7) {
        return this.a.i(i7);
    }

    @Override // me.d
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // me.d
    public final boolean j(int i7) {
        return this.a.j(i7);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.a);
        sb2.append('?');
        return sb2.toString();
    }
}
