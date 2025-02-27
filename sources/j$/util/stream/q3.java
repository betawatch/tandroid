package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class q3 extends t3 implements j$.util.M {
    q3(j$.util.M m, long j, long j2) {
        super(m, j, j2);
    }

    q3(j$.util.M m, q3 q3Var) {
        super(m, q3Var);
    }

    @Override // j$.util.M
    /* renamed from: forEachRemaining, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void e(Object obj) {
        obj.getClass();
        X2 x2 = null;
        while (true) {
            s3 v = v();
            if (v == s3.NO_MORE) {
                return;
            }
            s3 s3Var = s3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (v != s3Var) {
                ((j$.util.M) spliterator).e(obj);
                return;
            }
            if (x2 == null) {
                x2 = x();
            } else {
                x2.b = 0;
            }
            long j = 0;
            while (((j$.util.M) spliterator).p(x2)) {
                j++;
                if (j >= 128) {
                    break;
                }
            }
            if (j == 0) {
                return;
            } else {
                x2.a(obj, t(j));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.A.j(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.A.k(this, i);
    }

    @Override // j$.util.M
    /* renamed from: tryAdvance, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final boolean p(Object obj) {
        obj.getClass();
        while (v() != s3.NO_MORE && ((j$.util.M) this.a).p(this)) {
            if (t(1L) == 1) {
                w(obj);
                return true;
            }
        }
        return false;
    }

    protected abstract void w(Object obj);

    protected abstract X2 x();
}
