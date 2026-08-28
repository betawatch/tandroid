package na;

import g7.t6;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import la.u;
import la.v;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean b(Class cls, boolean z10) {
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            t6 t6Var = qa.c.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z10 ? this.a : this.b).iterator();
        while (it.hasNext()) {
            if (((la.a) it.next()).shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // la.v
    public final u create(la.g gVar, sa.a aVar) {
        Class cls = aVar.a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (b10 || b11) {
            return new f(this, b11, b10, gVar, aVar);
        }
        return null;
    }
}
