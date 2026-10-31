package e9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a1 extends m2 {
    public int a;
    public Object b;
    public final /* synthetic */ int c;
    public final Iterator d;
    public final /* synthetic */ Object e;

    public a1() {
        this.a = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        t6.p(this.a != 4);
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
                    } while (!((d9.l) this.e).apply(next));
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
                    } while (!((g2) this.e).b.contains(next));
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
    public a1(Iterator it, d9.l lVar) {
        this();
        this.c = 0;
        this.d = it;
        this.e = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a1(g2 g2Var) {
        this();
        this.c = 1;
        this.e = g2Var;
        this.d = g2Var.a.iterator();
    }
}
