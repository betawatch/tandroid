package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class a5 extends j5 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a5(a aVar, n5 n5Var, byte b) {
        super(n5Var);
        this.b = b;
        this.c = aVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte b = this.b;
        a aVar = this.c;
        n5 n5Var = this.a;
        switch (b) {
            case 0:
                ((Consumer) ((s) aVar).m).accept(obj);
                n5Var.accept((n5) obj);
                break;
            case 1:
                if (((Predicate) ((s) aVar).m).test(obj)) {
                    n5Var.accept((n5) obj);
                    break;
                }
                break;
            case 2:
                n5Var.accept((n5) ((Function) ((s) aVar).m).apply(obj));
                break;
            case 3:
                n5Var.accept(((ToIntFunction) ((w0) aVar).m).applyAsInt(obj));
                break;
            case 4:
                n5Var.accept(((ToLongFunction) ((h1) aVar).m).applyAsLong(obj));
                break;
            default:
                n5Var.accept(((ToDoubleFunction) ((y) aVar).m).applyAsDouble(obj));
                break;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void n(long j) {
        switch (this.b) {
            case 1:
                this.a.n(-1L);
                break;
            default:
                super.n(j);
                break;
        }
    }
}
