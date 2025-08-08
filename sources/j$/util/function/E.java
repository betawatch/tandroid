package j$.util.function;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class E implements G {
    public final /* synthetic */ IntConsumer a;

    private /* synthetic */ E(IntConsumer intConsumer) {
        this.a = intConsumer;
    }

    public static /* synthetic */ G a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof F ? ((F) intConsumer).a : new E(intConsumer);
    }

    @Override // j$.util.function.G
    public final /* synthetic */ void accept(int i) {
        this.a.accept(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntConsumer intConsumer = this.a;
        if (obj instanceof E) {
            obj = ((E) obj).a;
        }
        return intConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.function.G
    public final /* synthetic */ G l(G g) {
        return a(this.a.andThen(F.a(g)));
    }
}
