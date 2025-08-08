package j$.util.function;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements l {
    public final /* synthetic */ DoubleConsumer a;

    private /* synthetic */ j(DoubleConsumer doubleConsumer) {
        this.a = doubleConsumer;
    }

    public static /* synthetic */ l a(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return doubleConsumer instanceof k ? ((k) doubleConsumer).a : new j(doubleConsumer);
    }

    @Override // j$.util.function.l
    public final /* synthetic */ void accept(double d) {
        this.a.accept(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleConsumer doubleConsumer = this.a;
        if (obj instanceof j) {
            obj = ((j) obj).a;
        }
        return doubleConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.function.l
    public final /* synthetic */ l k(l lVar) {
        return a(this.a.andThen(k.a(lVar)));
    }
}
