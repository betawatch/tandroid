package id;

import java.io.Serializable;
import kotlin.jvm.internal.j;
import rd.p;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class b implements h, Serializable {
    public final h a;
    public final f b;

    public b(f element, h left) {
        j.e(left, "left");
        j.e(element, "element");
        this.a = left;
        this.b = element;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i7 = 2;
            b bVar2 = bVar;
            int i10 = 2;
            while (true) {
                h hVar = bVar2.a;
                bVar2 = hVar instanceof b ? (b) hVar : null;
                if (bVar2 == null) {
                    break;
                }
                i10++;
            }
            b bVar3 = this;
            while (true) {
                h hVar2 = bVar3.a;
                bVar3 = hVar2 instanceof b ? (b) hVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i7++;
            }
            if (i10 == i7) {
                b bVar4 = this;
                while (true) {
                    f fVar = bVar4.b;
                    if (!j.a(bVar.get(fVar.getKey()), fVar)) {
                        z9 = false;
                        break;
                    }
                    h hVar3 = bVar4.a;
                    if (!(hVar3 instanceof b)) {
                        j.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f fVar2 = (f) hVar3;
                        z9 = j.a(bVar.get(fVar2.getKey()), fVar2);
                        break;
                    }
                    bVar4 = (b) hVar3;
                }
                if (z9) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // id.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(this.a.fold(obj, pVar), this.b);
    }

    @Override // id.h
    public final f get(g key) {
        j.e(key, "key");
        b bVar = this;
        while (true) {
            f fVar = bVar.b.get(key);
            if (fVar != null) {
                return fVar;
            }
            h hVar = bVar.a;
            if (!(hVar instanceof b)) {
                return hVar.get(key);
            }
            bVar = (b) hVar;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // id.h
    public final h minusKey(g key) {
        j.e(key, "key");
        f fVar = this.b;
        f fVar2 = fVar.get(key);
        h hVar = this.a;
        if (fVar2 != null) {
            return hVar;
        }
        h minusKey = hVar.minusKey(key);
        return minusKey == hVar ? this : minusKey == i.a ? fVar : new b(fVar, minusKey);
    }

    @Override // id.h
    public final h plus(h context) {
        j.e(context, "context");
        return context == i.a ? this : (h) context.fold(this, new b1.e(9));
    }

    public final String toString() {
        return "[" + ((String) fold("", new b1.e(8))) + ']';
    }
}
