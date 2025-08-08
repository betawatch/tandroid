package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class t3 extends S2 {
    @Override // j$.util.Spliterator
    public final boolean s(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean b = b();
        if (b) {
            N2 n2 = (N2) this.h;
            long j = this.g;
            if (n2.c != 0) {
                if (j >= n2.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
                for (int i = 0; i <= n2.c; i++) {
                    long j2 = n2.d[i];
                    Object[] objArr = n2.f[i];
                    if (j < objArr.length + j2) {
                        obj = objArr[(int) (j - j2)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            if (j < n2.b) {
                obj = n2.e[(int) j];
            } else {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            consumer.r(obj);
        }
        return b;
    }

    @Override // j$.util.stream.S2
    final S2 k(Spliterator spliterator) {
        return new t3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.S2
    final void j() {
        N2 n2 = new N2();
        this.h = n2;
        this.e = this.b.B0(new a(n2, 6));
        this.f = new a(this, 7);
    }

    @Override // j$.util.Spliterator
    public final void a(Consumer consumer) {
        if (this.h == null && !this.i) {
            consumer.getClass();
            h();
            a aVar = new a(consumer, 8);
            this.b.A0(this.d, aVar);
            this.i = true;
            return;
        }
        while (s(consumer)) {
        }
    }
}
