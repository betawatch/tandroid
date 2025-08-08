package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class p3 extends s3 implements j$.util.M {
    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.A.j(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.A.k(this, i);
    }

    protected abstract void w(Object obj);

    protected abstract W2 x();

    @Override // j$.util.M
    /* renamed from: forEachRemaining, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void e(Object obj) {
        obj.getClass();
        W2 w2 = null;
        while (true) {
            r3 v = v();
            if (v == r3.NO_MORE) {
                return;
            }
            r3 r3Var = r3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (v == r3Var) {
                if (w2 == null) {
                    w2 = x();
                } else {
                    w2.b = 0;
                }
                long j = 0;
                while (((j$.util.M) spliterator).p(w2)) {
                    j++;
                    if (j >= 128) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                } else {
                    w2.a(obj, t(j));
                }
            } else {
                ((j$.util.M) spliterator).e(obj);
                return;
            }
        }
    }

    @Override // j$.util.M
    /* renamed from: tryAdvance, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final boolean p(Object obj) {
        obj.getClass();
        while (v() != r3.NO_MORE && ((j$.util.M) this.a).p(this)) {
            if (t(1L) == 1) {
                w(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
