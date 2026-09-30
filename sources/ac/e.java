package ac;

import java.util.Arrays;
import n6.l;
import z7.ve;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
        cf.c cVar = new cf.c();
        Boolean bool = Boolean.FALSE;
        cVar.a = bool;
        cVar.b = Boolean.valueOf(this.a);
        cVar.c = Boolean.valueOf(this.b);
        cVar.d = bool;
        cVar.e = Boolean.valueOf(this.c);
        return new ve(cVar);
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
