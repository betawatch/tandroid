package j$.util.function;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class S implements LongConsumer {
    public final /* synthetic */ T a;

    private /* synthetic */ S(T t) {
        this.a = t;
    }

    public static /* synthetic */ LongConsumer a(T t) {
        if (t == null) {
            return null;
        }
        return t instanceof Q ? ((Q) t).a : new S(t);
    }

    @Override // java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        this.a.accept(j);
    }

    @Override // java.util.function.LongConsumer
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return a(this.a.f(Q.a(longConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        T t = this.a;
        if (obj instanceof S) {
            obj = ((S) obj).a;
        }
        return t.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
