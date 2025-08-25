package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
final class n extends i2 {
    public final /* synthetic */ int b;
    Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(b bVar, m2 m2Var, int i) {
        super(m2Var);
        this.b = i;
        this.c = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(m2 m2Var) {
        super(m2Var);
        this.b = 0;
    }

    @Override // j$.util.stream.i2, j$.util.stream.m2
    public void k() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.k();
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // j$.util.stream.i2, j$.util.stream.m2
    public void l(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.l(-1L);
                break;
            case 1:
            default:
                super.l(j);
                break;
            case 2:
                this.a.l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((HashSet) this.c).contains(obj)) {
                    ((HashSet) this.c).add(obj);
                    this.a.accept((m2) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) ((s) this.c).n).accept(obj);
                this.a.accept((m2) obj);
                break;
            case 2:
                if (((Predicate) ((s) this.c).n).test(obj)) {
                    this.a.accept((m2) obj);
                    break;
                }
                break;
            case 3:
                this.a.accept((m2) ((Function) ((s) this.c).n).apply(obj));
                break;
            case 4:
                this.a.accept(((ToIntFunction) ((V) this.c).n).applyAsInt(obj));
                break;
            case 5:
                this.a.accept(((ToLongFunction) ((g0) this.c).n).applyAsLong(obj));
                break;
            default:
                this.a.accept(((ToDoubleFunction) ((x) this.c).n).applyAsDouble(obj));
                break;
        }
    }
}
