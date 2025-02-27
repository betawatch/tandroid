package j$.util.function;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class Q implements T {
    public final /* synthetic */ LongConsumer a;

    private /* synthetic */ Q(LongConsumer longConsumer) {
        this.a = longConsumer;
    }

    public static /* synthetic */ T a(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return longConsumer instanceof S ? ((S) longConsumer).a : new Q(longConsumer);
    }

    @Override // j$.util.function.T
    public final /* synthetic */ void accept(long j) {
        this.a.accept(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongConsumer longConsumer = this.a;
        if (obj instanceof Q) {
            obj = ((Q) obj).a;
        }
        return longConsumer.equals(obj);
    }

    @Override // j$.util.function.T
    public final /* synthetic */ T f(T t) {
        return a(this.a.andThen(S.a(t)));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
