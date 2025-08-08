package j$.util.function;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class W implements Y {
    public final /* synthetic */ LongConsumer a;

    private /* synthetic */ W(LongConsumer longConsumer) {
        this.a = longConsumer;
    }

    public static /* synthetic */ Y a(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return longConsumer instanceof X ? ((X) longConsumer).a : new W(longConsumer);
    }

    @Override // j$.util.function.Y
    public final /* synthetic */ void accept(long j) {
        this.a.accept(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongConsumer longConsumer = this.a;
        if (obj instanceof W) {
            obj = ((W) obj).a;
        }
        return longConsumer.equals(obj);
    }

    @Override // j$.util.function.Y
    public final /* synthetic */ Y f(Y y) {
        return a(this.a.andThen(X.a(y)));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
