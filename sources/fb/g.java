package fb;

import db.u;
import db.v;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import v7.n8;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class g implements v, Cloneable {
    public static final g c = new g();
    public List a;
    public final List b;

    public g() {
        List list = Collections.EMPTY_LIST;
        this.a = list;
        this.b = list;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g clone() {
        try {
            return (g) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean b(Class cls, boolean z10) {
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            n8 n8Var = ib.c.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z10 ? this.a : this.b).iterator();
        while (it.hasNext()) {
            if (((db.a) it.next()).shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // db.v
    public final u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (b10 || b11) {
            return new f(this, b11, b10, gVar, aVar);
        }
        return null;
    }
}
