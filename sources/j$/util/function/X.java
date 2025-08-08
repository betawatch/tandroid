package j$.util.function;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class X implements LongConsumer {
    public final /* synthetic */ Y a;

    private /* synthetic */ X(Y y) {
        this.a = y;
    }

    public static /* synthetic */ LongConsumer a(Y y) {
        if (y == null) {
            return null;
        }
        return y instanceof W ? ((W) y).a : new X(y);
    }

    @Override // java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        this.a.accept(j);
    }

    @Override // java.util.function.LongConsumer
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return a(this.a.f(W.a(longConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Y y = this.a;
        if (obj instanceof X) {
            obj = ((X) obj).a;
        }
        return y.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
