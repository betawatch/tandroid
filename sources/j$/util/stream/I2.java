package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class I2 extends A2 {
    private ArrayList d;

    @Override // j$.util.stream.i2, j$.util.stream.m2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // j$.util.stream.i2, j$.util.stream.m2
    public final void k() {
        List.-EL.sort(this.d, this.b);
        long size = this.d.size();
        m2 m2Var = this.a;
        m2Var.l(size);
        if (!this.c) {
            ArrayList arrayList = this.d;
            Objects.requireNonNull(m2Var);
            Collection.-EL.a(arrayList, new a(2, m2Var));
        } else {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (m2Var.n()) {
                    break;
                } else {
                    m2Var.accept((m2) next);
                }
            }
        }
        m2Var.k();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d.add(obj);
    }
}
