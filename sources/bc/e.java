package bc;

import com.google.android.gms.internal.cast.z5;
import java.util.Arrays;
import n6.l;
import z7.ve;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class e {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ e(d dVar) {
        this.a = dVar.a;
        this.b = dVar.b;
        this.c = dVar.c;
    }

    public final ve a() {
        z5 z5Var = new z5();
        Boolean bool = Boolean.FALSE;
        z5Var.b = bool;
        z5Var.c = Boolean.valueOf(this.a);
        z5Var.a = Boolean.valueOf(this.b);
        z5Var.d = bool;
        z5Var.e = Boolean.valueOf(this.c);
        return new ve(z5Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && l.l(null, null);
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.a);
        Boolean valueOf2 = Boolean.valueOf(this.b);
        Boolean valueOf3 = Boolean.valueOf(this.c);
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, valueOf, valueOf2, bool, valueOf3, null});
    }
}
