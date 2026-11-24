package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
