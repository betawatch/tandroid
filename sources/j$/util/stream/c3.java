package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class c3 implements d2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DoubleConsumer b;

    public /* synthetic */ c3(DoubleConsumer doubleConsumer, int i) {
        this.a = i;
        this.b = doubleConsumer;
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void E(Double d) {
        switch (this.a) {
            case 0:
                r1.e(this, d);
                break;
            default:
                r1.e(this, d);
                break;
        }
    }

    @Override // j$.util.stream.d2, j$.util.stream.g2
    public final void accept(double d) {
        switch (this.a) {
            case 0:
                this.b.accept(d);
                break;
            default:
                ((J2) this.b).accept(d);
                break;
        }
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                r1.k();
                throw null;
            default:
                r1.k();
                throw null;
        }
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                r1.l();
                throw null;
            default:
                r1.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        switch (this.a) {
            case 0:
                E((Double) obj);
                break;
            default:
                E((Double) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void x() {
        int i = this.a;
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void y(long j) {
        int i = this.a;
    }
}
