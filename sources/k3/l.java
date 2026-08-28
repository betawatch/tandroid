package k3;

import android.text.TextUtils;
import h3.t0;
import j3.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l {
    public final String a;
    public final t0 b;
    public final t0 c;
    public final int d;
    public final int e;

    public l(String str, t0 t0Var, t0 t0Var2, int i9, int i10) {
        d5.a.f(i9 == 0 || i10 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        t0Var.getClass();
        this.b = t0Var;
        t0Var2.getClass();
        this.c = t0Var2;
        this.d = i9;
        this.e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.d == lVar.d && this.e == lVar.e && this.a.equals(lVar.a) && this.b.equals(lVar.b) && this.c.equals(lVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + r0.f((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
