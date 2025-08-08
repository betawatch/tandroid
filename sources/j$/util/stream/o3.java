package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class o3 extends p3 implements j$.util.J, j$.util.function.Y {
    long e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.h(this, consumer);
    }

    @Override // j$.util.function.Y
    public final /* synthetic */ j$.util.function.Y f(j$.util.function.Y y) {
        return j$.com.android.tools.r8.a.c(this, y);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.n(this, consumer);
    }

    @Override // j$.util.stream.s3
    protected final Spliterator u(Spliterator spliterator) {
        return new o3((j$.util.J) spliterator, this);
    }

    @Override // j$.util.stream.p3
    protected final void w(Object obj) {
        ((j$.util.function.Y) obj).accept(this.e);
    }

    @Override // j$.util.function.Y
    public final void accept(long j) {
        this.e = j;
    }

    @Override // j$.util.stream.p3
    protected final W2 x() {
        return new V2();
    }
}
