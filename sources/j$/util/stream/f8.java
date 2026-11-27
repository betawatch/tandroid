package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class f8 extends d7 {
    @Override // j$.util.stream.d7
    public final void d() {
        y6 y6Var = new y6();
        this.h = y6Var;
        Objects.requireNonNull(y6Var);
        this.e = this.b.R(new e8(y6Var, (byte) 0));
        this.f = new j$.time.v((byte) 12, this);
    }

    @Override // j$.util.stream.d7
    public final d7 e(Spliterator spliterator) {
        return new f8(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Objects.requireNonNull(consumer);
        c();
        Objects.requireNonNull(consumer);
        e8 e8Var = new e8(consumer, (byte) 1);
        this.b.Q(this.d, e8Var);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a = a();
        if (!a) {
            return a;
        }
        y6 y6Var = (y6) this.h;
        long j = this.g;
        if (y6Var.c != 0) {
            if (j >= y6Var.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= y6Var.c; i++) {
                long j2 = y6Var.d[i];
                Object[] objArr = y6Var.f[i];
                if (j < objArr.length + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= y6Var.b) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        obj = y6Var.e[(int) j];
        consumer.x(obj);
        return a;
    }
}
