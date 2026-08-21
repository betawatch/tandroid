package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final class l extends c2 {
    public final /* synthetic */ int b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(a aVar, g2 g2Var, int i) {
        super(g2Var);
        this.b = i;
        this.c = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(g2 g2Var) {
        super(g2Var);
        this.b = 0;
    }

    @Override // j$.util.stream.c2, j$.util.stream.g2
    public void x() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.x();
                break;
            default:
                super.x();
                break;
        }
    }

    @Override // j$.util.stream.c2, j$.util.stream.g2
    public void y(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.y(-1L);
                break;
            case 1:
            default:
                super.y(j);
                break;
            case 2:
                this.a.y(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((HashSet) this.c).contains(obj)) {
                    ((HashSet) this.c).add(obj);
                    this.a.accept((g2) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) ((q) this.c).n).accept(obj);
                this.a.accept((g2) obj);
                break;
            case 2:
                if (((Predicate) ((q) this.c).n).test(obj)) {
                    this.a.accept((g2) obj);
                    break;
                }
                break;
            case 3:
                this.a.accept((g2) ((Function) ((q) this.c).n).apply(obj));
                break;
            case 4:
                this.a.accept(((ToIntFunction) ((T) this.c).n).applyAsInt(obj));
                break;
            case 5:
                this.a.accept(((ToLongFunction) ((d0) this.c).n).applyAsLong(obj));
                break;
            default:
                this.a.accept(((ToDoubleFunction) ((v) this.c).n).applyAsDouble(obj));
                break;
        }
    }
}
