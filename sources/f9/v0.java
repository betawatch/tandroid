package f9;

import a8.yb;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class v0 extends g2 {
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
        yb.p(this.a != 4);
        int c10 = m1.j.c(this.a);
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
                    } while (!((e9.l) this.e).apply(next));
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
                    } while (!((b2) this.e).b.contains(next));
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
    public v0(Iterator it, e9.l lVar) {
        this();
        this.c = 0;
        this.d = it;
        this.e = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v0(b2 b2Var) {
        this();
        this.c = 1;
        this.e = b2Var;
        this.d = b2Var.a.iterator();
    }
}
