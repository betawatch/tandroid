package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class z2 extends r2 {
    private ArrayList d;

    @Override // j$.util.stream.Z1, j$.util.stream.d2
    public final void n(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // j$.util.stream.Z1, j$.util.stream.d2
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
        d2 d2Var = this.a;
        d2Var.n(size);
        if (this.c) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (d2Var.q()) {
                    break;
                } else {
                    d2Var.r((d2) next);
                }
            }
        } else {
            Collection.-EL.a(this.d, new a(d2Var, 2));
        }
        d2Var.m();
        this.d = null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void r(Object obj) {
        this.d.add(obj);
    }
}
