package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class m2 extends n2 {
    public final /* synthetic */ byte k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2(a aVar, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, byte b) {
        super(aVar, spliterator, longFunction, binaryOperator);
        this.k = b;
    }

    @Override // j$.util.stream.n2, j$.util.stream.d
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.k) {
        }
        return a();
    }

    @Override // j$.util.stream.n2, j$.util.stream.d
    public final d c(Spliterator spliterator) {
        switch (this.k) {
        }
        return new n2(this, spliterator);
    }
}
