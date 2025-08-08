package j$.util.function;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class F implements IntConsumer {
    public final /* synthetic */ G a;

    private /* synthetic */ F(G g) {
        this.a = g;
    }

    public static /* synthetic */ IntConsumer a(G g) {
        if (g == null) {
            return null;
        }
        return g instanceof E ? ((E) g).a : new F(g);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        this.a.accept(i);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return a(this.a.l(E.a(intConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        G g = this.a;
        if (obj instanceof F) {
            obj = ((F) obj).a;
        }
        return g.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
