package kb;

import a5.j;
import java.util.Arrays;
import l7.ve;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        j jVar = new j();
        Boolean bool = Boolean.FALSE;
        jVar.a = bool;
        jVar.b = Boolean.valueOf(this.a);
        jVar.c = Boolean.valueOf(this.b);
        jVar.d = bool;
        jVar.e = Boolean.valueOf(this.c);
        return new ve(jVar);
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
