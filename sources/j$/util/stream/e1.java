package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class e1 extends h1 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(a aVar, int i10, Object obj, int i11) {
        super(aVar, i10);
        this.s = i11;
        this.t = obj;
    }

    @Override // j$.util.stream.a
    public final j5 Q0(int i10, j5 j5Var) {
        switch (this.s) {
            case 0:
                return new d1(this, j5Var);
            case 1:
                return new b1(this, j5Var, 5);
            case 2:
                return new w4(this, j5Var);
            default:
                return new l(this, j5Var, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(i1 i1Var, LongConsumer longConsumer) {
        super(i1Var, 0);
        this.s = 1;
        this.t = longConsumer;
    }
}
