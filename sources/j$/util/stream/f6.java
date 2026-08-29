package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class f6 extends x5 {
    public ArrayList d;

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final void o(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j10 >= 0 ? new ArrayList((int) j10) : new ArrayList();
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final void end() {
        List.-EL.sort(this.d, this.b);
        long size = this.d.size();
        j5 j5Var = this.a;
        j5Var.o(size);
        if (!this.c) {
            ArrayList arrayList = this.d;
            Objects.requireNonNull(j5Var);
            Collection.-EL.a(arrayList, new j$.time.t(9, j5Var));
        } else {
            ArrayList arrayList2 = this.d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (j5Var.q()) {
                    break;
                } else {
                    j5Var.x((j5) obj);
                }
            }
        }
        j5Var.end();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        this.d.add(obj);
    }
}
