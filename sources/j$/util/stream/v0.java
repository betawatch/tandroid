package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
