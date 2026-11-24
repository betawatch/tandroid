package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class v0 extends h5 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(a aVar, n5 n5Var, byte b) {
        super(n5Var);
        this.b = b;
        this.c = aVar;
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i) {
        byte b = this.b;
        a aVar = this.c;
        n5 n5Var = this.a;
        switch (b) {
            case 0:
                n5Var.accept((n5) ((IntFunction) ((s) aVar).m).apply(i));
                break;
            case 1:
                ((IntConsumer) ((w0) aVar).m).accept(i);
                n5Var.accept(i);
                break;
            default:
                n5Var.accept(((IntUnaryOperator) ((w0) aVar).m).applyAsInt(i));
                break;
        }
    }
}
