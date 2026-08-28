package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public final class j2 extends k2 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(t3 t3Var, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i9) {
        super(t3Var, spliterator, longFunction, binaryOperator);
        this.k = i9;
    }

    @Override // j$.util.stream.k2, j$.util.stream.d
    public final d c(Spliterator spliterator) {
        switch (this.k) {
        }
        return new k2(this, spliterator);
    }

    @Override // j$.util.stream.k2, j$.util.stream.d
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.k) {
        }
        return a();
    }
}
