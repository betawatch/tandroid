package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class j6 extends b6 {
    public ArrayList d;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void end() {
        List.-EL.sort(this.d, this.b);
        long size = this.d.size();
        n5 n5Var = this.a;
        n5Var.n(size);
        boolean z = this.c;
        ArrayList arrayList = this.d;
        if (z) {
            int size2 = arrayList.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                if (n5Var.q()) {
                    break;
                } else {
                    n5Var.x((n5) obj);
                }
            }
        } else {
            Objects.requireNonNull(n5Var);
            Collection.-EL.a(arrayList, new j$.time.v((byte) 8, n5Var));
        }
        n5Var.end();
        this.d = null;
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void n(long j) {
        if (j < 2147483639) {
            this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
        } else {
            j$.time.g.c("Stream size exceeds max array size");
        }
    }
}
