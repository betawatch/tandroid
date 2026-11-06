package h9;

import a8.ia;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class v0 extends h2 {
    public int a;
    public Object b;
    public final /* synthetic */ int c;
    public final Iterator d;
    public final /* synthetic */ Object e;

    public v0() {
        this.a = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        ia.p(this.a != 4);
        int c10 = p1.g.c(this.a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.a = 4;
            switch (this.c) {
                case 0:
                    do {
                        Iterator it = this.d;
                        if (!it.hasNext()) {
                            this.a = 3;
                            next = null;
                            break;
                        } else {
                            next = it.next();
                        }
                    } while (!((g9.m) this.e).apply(next));
                default:
                    do {
                        Iterator it2 = this.d;
                        if (!it2.hasNext()) {
                            this.a = 3;
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                        }
                    } while (!((c2) this.e).b.contains(next));
            }
            this.b = next;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v0(Iterator it, g9.m mVar) {
        this();
        this.c = 0;
        this.d = it;
        this.e = mVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v0(c2 c2Var) {
        this();
        this.c = 1;
        this.e = c2Var;
        this.d = c2Var.a.iterator();
    }
}
