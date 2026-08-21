package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public final class H0 extends I0 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H0(a aVar, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i) {
        super(aVar, spliterator, longFunction, binaryOperator);
        this.k = i;
    }

    @Override // j$.util.stream.I0, j$.util.stream.d
    public final d c(Spliterator spliterator) {
        switch (this.k) {
        }
        return new I0(this, spliterator);
    }

    @Override // j$.util.stream.I0, j$.util.stream.d
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.k) {
        }
        return a();
    }
}
