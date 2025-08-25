package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
final class N0 extends P0 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N0(b bVar, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i) {
        super(bVar, spliterator, longFunction, binaryOperator);
        this.k = i;
    }

    @Override // j$.util.stream.P0, j$.util.stream.e
    protected final e e(Spliterator spliterator) {
        switch (this.k) {
        }
        return new P0(this, spliterator);
    }

    @Override // j$.util.stream.P0, j$.util.stream.e
    protected final /* bridge */ /* synthetic */ Object a() {
        switch (this.k) {
        }
        return a();
    }
}
