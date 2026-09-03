package c9;

import j7.j5;
import kf.k0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m {
    public final u a;
    public final int b;
    public final int c;

    public m(int i10, int i11, Class cls) {
        this(u.a(cls), i10, i11);
    }

    public static m a(u uVar) {
        return new m(uVar, 1, 0);
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
                throw new AssertionError(k0.j(i11, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return android.support.v4.media.a.r(sb, str, "}");
    }

    public m(u uVar, int i10, int i11) {
        j5.a(uVar, "Null dependency anInterface.");
        this.a = uVar;
        this.b = i10;
        this.c = i11;
    }
}
