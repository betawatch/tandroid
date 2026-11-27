package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
