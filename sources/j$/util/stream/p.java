package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class p extends g5 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(a aVar, n5 n5Var, byte b) {
        super(n5Var);
        this.b = b;
        this.c = aVar;
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        byte b = this.b;
        n5 n5Var = this.a;
        a aVar = this.c;
        switch (b) {
            case 0:
                n5Var.accept((n5) ((DoubleFunction) ((s) aVar).m).apply(d));
                break;
            default:
                ((DoubleConsumer) ((y) aVar).m).accept(d);
                n5Var.accept(d);
                break;
        }
    }
}
