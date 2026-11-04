package le;

import b8.jd;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o implements je.d, b {
    public final je.d a;
    public final String b;
    public final Set c;

    public o(je.d original) {
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
            for (int i3 = 0; i3 < f10; i3++) {
                hashSet.add(original.g(i3));
            }
            set = hashSet;
        }
        this.c = set;
    }

    @Override // je.d
    public final String a() {
        return this.b;
    }

    @Override // le.b
    public final Set b() {
        return this.c;
    }

    @Override // je.d
    public final boolean c() {
        return true;
    }

    @Override // je.d
    public final int d(String name) {
        kotlin.jvm.internal.j.e(name, "name");
        return this.a.d(name);
    }

    @Override // je.d
    public final jd e() {
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

    @Override // je.d
    public final int f() {
        return this.a.f();
    }

    @Override // je.d
    public final String g(int i3) {
        return this.a.g(i3);
    }

    @Override // je.d
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // je.d
    public final List h(int i3) {
        return this.a.h(i3);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // je.d
    public final je.d i(int i3) {
        return this.a.i(i3);
    }

    @Override // je.d
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // je.d
    public final boolean j(int i3) {
        return this.a.j(i3);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.a);
        sb2.append('?');
        return sb2.toString();
    }
}
