package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
