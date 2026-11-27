package j$.util.stream;

import j$.util.function.Consumer$-CC;
import j$.util.function.IntConsumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final /* synthetic */ class n7 implements l5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ n7(IntConsumer intConsumer, byte b) {
        this.a = b;
        this.b = intConsumer;
    }

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i) {
        byte b = this.a;
        IntConsumer intConsumer = this.b;
        switch (b) {
            case 0:
                intConsumer.accept(i);
                break;
            default:
                ((t6) intConsumer).accept(i);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final void end() {
        byte b = this.a;
    }

    @Override // j$.util.stream.n5
    public final void n(long j) {
        byte b = this.a;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void o(Integer num) {
        switch (this.a) {
            case 0:
                w3.g(this, num);
                break;
            default:
                w3.g(this, num);
                break;
        }
    }

    @Override // j$.util.stream.n5
    public final boolean q() {
        byte b = this.a;
        return false;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
        }
        return IntConsumer$-CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                w3.d();
                throw null;
            default:
                w3.d();
                throw null;
        }
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                w3.l();
                throw null;
            default:
                w3.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        switch (this.a) {
            case 0:
                o((Integer) obj);
                break;
            default:
                o((Integer) obj);
                break;
        }
    }

    private final void a(long j) {
    }

    private final void b(long j) {
    }

    private final void c() {
    }

    private final void d() {
    }
}
