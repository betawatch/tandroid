package c9;

import j7.j5;
import kh.a2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class l {
    public final t a;
    public final int b;
    public final int c;

    public l(int i10, int i11, Class cls) {
        this(t.a(cls), i10, i11);
    }

    public static l a(t tVar) {
        return new l(tVar, 1, 0);
    }

    public static l b(Class cls) {
        return new l(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a.equals(lVar.a) && this.b == lVar.b && this.c == lVar.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i10 = this.b;
        sb.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i11 = this.c;
        if (i11 == 0) {
            str = "direct";
        } else if (i11 == 1) {
            str = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(a2.j(i11, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return android.support.v4.media.a.r(sb, str, "}");
    }

    public l(t tVar, int i10, int i11) {
        j5.a(tVar, "Null dependency anInterface.");
        this.a = tVar;
        this.b = i10;
        this.c = i11;
    }
}
