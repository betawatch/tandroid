package j$.util.stream;

import j$.util.Spliterator;
import java.util.Deque;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class j3 extends k3 {
    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            return;
        }
        Deque b = b();
        while (true) {
            h2 a = k3.a(b);
            if (a == null) {
                this.a = null;
                return;
            }
            a.forEach(consumer);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        h2 a;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = this.d.tryAdvance(consumer);
        if (!tryAdvance) {
            if (this.c == null && (a = k3.a(this.e)) != null) {
                Spliterator spliterator = a.spliterator();
                this.d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.a = null;
        }
        return tryAdvance;
    }
}
