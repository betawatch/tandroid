package hb;

import a8.rd;
import fb.u;
import fb.v;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
            rd rdVar = kb.c.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z10 ? this.a : this.b).iterator();
        while (it.hasNext()) {
            if (((fb.a) it.next()).shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // fb.v
    public final u create(fb.g gVar, mb.a aVar) {
        Class cls = aVar.a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (b10 || b11) {
            return new f(this, b11, b10, gVar, aVar);
        }
        return null;
    }
}
