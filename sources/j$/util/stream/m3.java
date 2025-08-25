package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class m3 implements k2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ m3(IntConsumer intConsumer, int i) {
        this.a = i;
        this.b = intConsumer;
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.m2, j$.util.stream.j2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                w0.a();
                throw null;
            default:
                w0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.k2, j$.util.stream.m2
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                ((R2) this.b).accept(i);
                break;
            default:
                this.b.accept(i);
                break;
        }
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                w0.l();
                throw null;
            default:
                w0.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        switch (this.a) {
            case 0:
                m((Integer) obj);
                break;
            default:
                m((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void k() {
        int i = this.a;
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void l(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.k2
    public final /* synthetic */ void m(Integer num) {
        switch (this.a) {
            case 0:
                w0.g(this, num);
                break;
            default:
                w0.g(this, num);
                break;
        }
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ boolean n() {
        switch (this.a) {
        }
        return false;
    }
}
