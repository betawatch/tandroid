package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class m3 extends p3 implements j$.util.D, j$.util.function.l {
    double e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.b(this, consumer);
    }

    @Override // j$.util.function.l
    public final /* synthetic */ j$.util.function.l k(j$.util.function.l lVar) {
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.l(this, consumer);
    }

    @Override // j$.util.stream.s3
    protected final Spliterator u(Spliterator spliterator) {
        return new m3((j$.util.D) spliterator, this);
    }

    @Override // j$.util.stream.p3
    protected final void w(Object obj) {
        ((j$.util.function.l) obj).accept(this.e);
    }

    @Override // j$.util.function.l
    public final void accept(double d) {
        this.e = d;
    }

    @Override // j$.util.stream.p3
    protected final W2 x() {
        return new T2();
    }
}
