package j$.util.function;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class C implements E {
    public final /* synthetic */ IntConsumer a;

    private /* synthetic */ C(IntConsumer intConsumer) {
        this.a = intConsumer;
    }

    public static /* synthetic */ E a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof D ? ((D) intConsumer).a : new C(intConsumer);
    }

    @Override // j$.util.function.E
    public final /* synthetic */ void accept(int i) {
        this.a.accept(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntConsumer intConsumer = this.a;
        if (obj instanceof C) {
            obj = ((C) obj).a;
        }
        return intConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.function.E
    public final /* synthetic */ E l(E e) {
        return a(this.a.andThen(D.a(e)));
    }
}
