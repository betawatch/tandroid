package a9;

import j7.l1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m {
    public final v a;
    public final int b;
    public final int c;

    public m(int i10, int i11, Class cls) {
        this(v.a(cls), i10, i11);
    }

    public static m a(v vVar) {
        return new m(vVar, 1, 0);
    }

    public static m b(Class cls) {
        return new m(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a.equals(mVar.a) && this.b == mVar.b && this.c == mVar.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.a);
        sb2.append(", type=");
        int i10 = this.b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i11 = this.c;
        if (i11 == 0) {
            str = "direct";
        } else if (i11 == 1) {
            str = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(l1.k(i11, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return a4.w.q(sb2, str, "}");
    }

    public m(v vVar, int i10, int i11) {
        h7.n.a(vVar, "Null dependency anInterface.");
        this.a = vVar;
        this.b = i10;
        this.c = i11;
    }
}
