package j$.util.function;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class D implements IntConsumer {
    public final /* synthetic */ E a;

    private /* synthetic */ D(E e) {
        this.a = e;
    }

    public static /* synthetic */ IntConsumer a(E e) {
        if (e == null) {
            return null;
        }
        return e instanceof C ? ((C) e).a : new D(e);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        this.a.accept(i);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return a(this.a.l(C.a(intConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        E e = this.a;
        if (obj instanceof D) {
            obj = ((D) obj).a;
        }
        return e.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
