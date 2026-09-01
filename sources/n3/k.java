package n3;

import android.text.TextUtils;
import j3.n0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k {
    public final String a;
    public final n0 b;
    public final n0 c;
    public final int d;
    public final int e;

    public k(String str, n0 n0Var, n0 n0Var2, int i10, int i11) {
        h5.a.f(i10 == 0 || i11 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        n0Var.getClass();
        this.b = n0Var;
        n0Var2.getClass();
        this.c = n0Var2;
        this.d = i10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.d == kVar.d && this.e == kVar.e && this.a.equals(kVar.a) && this.b.equals(kVar.b) && this.c.equals(kVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + l.d.e((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
