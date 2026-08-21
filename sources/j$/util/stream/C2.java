package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class C2 extends u2 {
    public ArrayList d;

    @Override // j$.util.stream.c2, j$.util.stream.g2
    public final void y(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // j$.util.stream.c2, j$.util.stream.g2
    public final void x() {
        List.-EL.sort(this.d, this.b);
        long size = this.d.size();
        g2 g2Var = this.a;
        g2Var.y(size);
        if (!this.c) {
            ArrayList arrayList = this.d;
            Objects.requireNonNull(g2Var);
            Collection.-EL.a(arrayList, new j$.time.t(9, g2Var));
        } else {
            ArrayList arrayList2 = this.d;
            int size2 = arrayList2.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList2.get(i);
                i++;
                if (g2Var.C()) {
                    break;
                } else {
                    g2Var.s((g2) obj);
                }
            }
        }
        g2Var.x();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void s(Object obj) {
        this.d.add(obj);
    }
}
