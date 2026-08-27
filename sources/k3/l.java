package k3;

import android.text.TextUtils;
import h3.t0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l {
    public final String a;
    public final t0 b;
    public final t0 c;
    public final int d;
    public final int e;

    public l(String str, t0 t0Var, t0 t0Var2, int i10, int i11) {
        d5.a.f(i10 == 0 || i11 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        t0Var.getClass();
        this.b = t0Var;
        t0Var2.getClass();
        this.c = t0Var2;
        this.d = i10;
        this.e = i11;
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
        return this.c.hashCode() + ((this.b.hashCode() + i0.a.g((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
