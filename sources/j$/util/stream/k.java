package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final class k extends b2 {
    public final /* synthetic */ int b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(a aVar, f2 f2Var, int i) {
        super(f2Var);
        this.b = i;
        this.c = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(f2 f2Var) {
        super(f2Var);
        this.b = 0;
    }

    @Override // j$.util.stream.b2, j$.util.stream.f2
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

    @Override // j$.util.stream.b2, j$.util.stream.f2
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
                    this.a.accept((f2) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) ((p) this.c).n).accept(obj);
                this.a.accept((f2) obj);
                break;
            case 2:
                if (((Predicate) ((p) this.c).n).test(obj)) {
                    this.a.accept((f2) obj);
                    break;
                }
                break;
            case 3:
                this.a.accept((f2) ((Function) ((p) this.c).n).apply(obj));
                break;
            case 4:
                this.a.accept(((ToIntFunction) ((S) this.c).n).applyAsInt(obj));
                break;
            case 5:
                this.a.accept(((ToLongFunction) ((c0) this.c).n).applyAsLong(obj));
                break;
            default:
                this.a.accept(((ToDoubleFunction) ((u) this.c).n).applyAsDouble(obj));
                break;
        }
    }
}
