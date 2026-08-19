package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class w3 extends U2 {
    @Override // j$.util.stream.U2
    public final U2 e(Spliterator spliterator) {
        return new w3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.U2
    public final void d() {
        P2 p2 = new P2();
        this.h = p2;
        Objects.requireNonNull(p2);
        this.e = this.b.R(new v3(p2, 0));
        this.f = new j$.time.t(15, this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a = a();
        if (!a) {
            return a;
        }
        P2 p2 = (P2) this.h;
        long j = this.g;
        if (p2.c != 0) {
            if (j >= p2.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= p2.c; i++) {
                long j2 = p2.d[i];
                Object[] objArr = p2.f[i];
                if (j < objArr.length + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j < p2.b) {
            obj = p2.e[(int) j];
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        consumer.s(obj);
        return a;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(consumer);
            c();
            Objects.requireNonNull(consumer);
            v3 v3Var = new v3(consumer, 1);
            this.b.Q(this.d, v3Var);
            this.i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
