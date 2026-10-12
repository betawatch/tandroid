package e9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        u6.p(this.a != 4);
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
                    } while (!((d9.m) this.e).apply(next));
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
    public a1(Iterator it, d9.m mVar) {
        this();
        this.c = 0;
        this.d = it;
        this.e = mVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a1(g2 g2Var) {
        this();
        this.c = 1;
        this.e = g2Var;
        this.d = g2Var.a.iterator();
    }
}
