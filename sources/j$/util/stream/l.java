package j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final class l extends f5 {
    public final /* synthetic */ int b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(a aVar, j5 j5Var, int i9) {
        super(j5Var);
        this.b = i9;
        this.c = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(j5 j5Var) {
        super(j5Var);
        this.b = 0;
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public void end() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public void o(long j10) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.o(-1L);
                break;
            case 1:
            default:
                super.o(j10);
                break;
            case 2:
                this.a.o(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((Set) this.c).contains(obj)) {
                    ((Set) this.c).add(obj);
                    this.a.accept((j5) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) ((q) this.c).t).accept(obj);
                this.a.accept((j5) obj);
                break;
            case 2:
                if (((Predicate) ((q) this.c).t).test(obj)) {
                    this.a.accept((j5) obj);
                    break;
                }
                break;
            case 3:
                this.a.accept((j5) ((Function) ((q) this.c).t).apply(obj));
                break;
            case 4:
                this.a.accept(((ToIntFunction) ((t0) this.c).t).applyAsInt(obj));
                break;
            case 5:
                this.a.accept(((ToLongFunction) ((e1) this.c).t).applyAsLong(obj));
                break;
            default:
                this.a.accept(((ToDoubleFunction) ((v) this.c).t).applyAsDouble(obj));
                break;
        }
    }
}
