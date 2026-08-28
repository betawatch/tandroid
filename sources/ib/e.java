package ib;

import j7.ve;
import java.util.Arrays;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        b3.b bVar = new b3.b();
        Boolean bool = Boolean.FALSE;
        bVar.a = bool;
        bVar.b = Boolean.valueOf(this.a);
        bVar.c = Boolean.valueOf(this.b);
        bVar.d = bool;
        bVar.e = Boolean.valueOf(this.c);
        return new ve(bVar);
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
