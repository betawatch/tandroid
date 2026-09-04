package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class f7 implements g5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DoubleConsumer b;

    public /* synthetic */ f7(DoubleConsumer doubleConsumer, int i10) {
        this.a = i10;
        this.b = doubleConsumer;
    }

    private final /* synthetic */ void a(long j3) {
    }

    private final /* synthetic */ void b(long j3) {
    }

    private final /* synthetic */ void c() {
    }

    private final /* synthetic */ void d() {
    }

    @Override // j$.util.stream.g5
    public final /* synthetic */ void B(Double d) {
        switch (this.a) {
            case 0:
                t3.D(this, d);
                break;
            default:
                t3.D(this, d);
                break;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.j5
    public final void accept(double d) {
        switch (this.a) {
            case 0:
                this.b.accept(d);
                break;
            default:
                ((m6) this.b).accept(d);
                break;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i10) {
        switch (this.a) {
            case 0:
                t3.J();
                throw null;
            default:
                t3.J();
                throw null;
        }
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(long j3) {
        switch (this.a) {
            case 0:
                t3.K();
                throw null;
            default:
                t3.K();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        switch (this.a) {
            case 0:
                B((Double) obj);
                break;
            default:
                B((Double) obj);
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

    @Override // j$.util.stream.j5
    public final /* synthetic */ void end() {
        int i10 = this.a;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void o(long j3) {
        int i10 = this.a;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean q() {
        switch (this.a) {
        }
        return false;
    }
}
