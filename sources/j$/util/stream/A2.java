package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class A2 extends s2 {
    private ArrayList d;

    A2(e2 e2Var, Comparator comparator) {
        super(e2Var, comparator);
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void r(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.a2, j$.util.stream.e2
    public final void m() {
        List list = this.d;
        boolean z = list instanceof j$.util.List;
        Comparator comparator = this.b;
        if (z) {
            ((j$.util.List) list).sort(comparator);
        } else {
            List.-CC.$default$sort(list, comparator);
        }
        long size = this.d.size();
        e2 e2Var = this.a;
        e2Var.n(size);
        if (this.c) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (e2Var.q()) {
                    break;
                } else {
                    e2Var.r((e2) next);
                }
            }
        } else {
            Collection.-EL.a(this.d, new a(e2Var, 2));
        }
        e2Var.m();
        this.d = null;
    }

    @Override // j$.util.stream.a2, j$.util.stream.e2
    public final void n(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }
}
