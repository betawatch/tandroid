package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
abstract class h1 extends j1 implements j$.util.M {
    h1(F0 f0) {
        super(f0);
    }

    @Override // j$.util.M
    /* renamed from: forEachRemaining, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void e(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (p(obj)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            ((j$.util.M) spliterator).e(obj);
            return;
        }
        ArrayDeque f = f();
        while (true) {
            F0 f0 = (F0) j1.b(f);
            if (f0 == null) {
                this.a = null;
                return;
            }
            f0.g(obj);
        }
    }

    @Override // j$.util.M
    /* renamed from: tryAdvance, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final boolean p(Object obj) {
        F0 f0;
        if (!h()) {
            return false;
        }
        boolean p = ((j$.util.M) this.d).p(obj);
        if (!p) {
            if (this.c == null && (f0 = (F0) j1.b(this.e)) != null) {
                j$.util.M spliterator = f0.spliterator();
                this.d = spliterator;
                return spliterator.p(obj);
            }
            this.a = null;
        }
        return p;
    }
}
