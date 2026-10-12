package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class z7 extends x6 {
    @Override // j$.util.stream.x6
    public final x6 e(Spliterator spliterator) {
        return new z7(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.x6
    public final void d() {
        t6 t6Var = new t6();
        this.h = t6Var;
        Objects.requireNonNull(t6Var);
        this.e = this.b.G0(new y7(t6Var, 0));
        this.f = new j$.time.t(15, this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a2 = a();
        if (!a2) {
            return a2;
        }
        t6 t6Var = (t6) this.h;
        long j10 = this.g;
        if (t6Var.c != 0) {
            if (j10 >= t6Var.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j10));
            }
            for (int i10 = 0; i10 <= t6Var.c; i10++) {
                long j11 = t6Var.d[i10];
                Object[] objArr = t6Var.f[i10];
                if (j10 < objArr.length + j11) {
                    obj = objArr[(int) (j10 - j11)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
        if (j10 < t6Var.b) {
            obj = t6Var.e[(int) j10];
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
        consumer.x(obj);
        return a2;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(consumer);
            c();
            Objects.requireNonNull(consumer);
            y7 y7Var = new y7(consumer, 1);
            this.b.F0(this.d, y7Var);
            this.i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
