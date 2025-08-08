package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
final class h1 extends i1 {
    @Override // j$.util.Spliterator
    public final boolean s(Consumer consumer) {
        F0 b;
        if (!h()) {
            return false;
        }
        boolean s = this.d.s(consumer);
        if (!s) {
            if (this.c == null && (b = i1.b(this.e)) != null) {
                Spliterator spliterator = b.spliterator();
                this.d = spliterator;
                return spliterator.s(consumer);
            }
            this.a = null;
        }
        return s;
    }

    @Override // j$.util.Spliterator
    public final void a(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            Spliterator spliterator = this.c;
            if (spliterator == null) {
                ArrayDeque f = f();
                while (true) {
                    F0 b = i1.b(f);
                    if (b != null) {
                        b.forEach(consumer);
                    } else {
                        this.a = null;
                        return;
                    }
                }
            } else {
                spliterator.a(consumer);
            }
        } else {
            while (s(consumer)) {
            }
        }
    }
}
