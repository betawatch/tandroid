package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class n3 extends p3 implements j$.util.G, j$.util.function.G {
    int e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.f(this, consumer);
    }

    @Override // j$.util.function.G
    public final /* synthetic */ j$.util.function.G l(j$.util.function.G g) {
        return j$.com.android.tools.r8.a.b(this, g);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.m(this, consumer);
    }

    @Override // j$.util.stream.s3
    protected final Spliterator u(Spliterator spliterator) {
        return new n3((j$.util.G) spliterator, this);
    }

    @Override // j$.util.stream.p3
    protected final void w(Object obj) {
        ((j$.util.function.G) obj).accept(this.e);
    }

    @Override // j$.util.function.G
    public final void accept(int i) {
        this.e = i;
    }

    @Override // j$.util.stream.p3
    protected final W2 x() {
        return new U2();
    }
}
