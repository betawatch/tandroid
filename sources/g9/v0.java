package g9;

import b8.zb;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        zb.p(this.a != 4);
        int c2 = o1.g.c(this.a);
        if (c2 == 0) {
            return true;
        }
        if (c2 != 2) {
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
                    } while (!((f9.l) this.e).apply(next));
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
    public v0(Iterator it, f9.l lVar) {
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
