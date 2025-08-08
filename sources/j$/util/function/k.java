package j$.util.function;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements DoubleConsumer {
    public final /* synthetic */ l a;

    private /* synthetic */ k(l lVar) {
        this.a = lVar;
    }

    public static /* synthetic */ DoubleConsumer a(l lVar) {
        if (lVar == null) {
            return null;
        }
        return lVar instanceof j ? ((j) lVar).a : new k(lVar);
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        this.a.accept(d);
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return a(this.a.k(j.a(doubleConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        l lVar = this.a;
        if (obj instanceof k) {
            obj = ((k) obj).a;
        }
        return lVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
