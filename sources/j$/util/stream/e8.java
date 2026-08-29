package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class e8 extends z4 implements n8 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Predicate t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e8(b5 b5Var, int i10, Predicate predicate, int i11) {
        super(b5Var, i10);
        this.s = i11;
        this.t = predicate;
    }

    @Override // j$.util.stream.a
    public final Spliterator O0(a aVar, Spliterator spliterator) {
        switch (this.s) {
            case 0:
                return v6.ORDERED.m(aVar.m) ? N0(aVar, spliterator, new a1(12)).spliterator() : new u8(aVar.H0(spliterator), this.t, 1);
            default:
                return v6.ORDERED.m(aVar.m) ? N0(aVar, spliterator, new a1(12)).spliterator() : new u8(aVar.H0(spliterator), this.t, 0);
        }
    }

    @Override // j$.util.stream.a
    public final e2 N0(t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        switch (this.s) {
            case 0:
                return (e2) new q8(this, t3Var, spliterator, intFunction).invoke();
            default:
                return (e2) new p8(this, t3Var, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final j5 Q0(int i10, j5 j5Var) {
        switch (this.s) {
            case 0:
                return new k(this, j5Var);
            default:
                return new f8(this, j5Var, false);
        }
    }

    @Override // j$.util.stream.n8
    public o8 h(w1 w1Var, boolean z10) {
        return new f8(this, w1Var, z10);
    }
}
