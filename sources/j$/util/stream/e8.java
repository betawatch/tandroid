package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final /* synthetic */ class e8 implements n5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ e8(Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        byte b = this.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                ((y6) consumer).x(obj);
                break;
            default:
                consumer.x(obj);
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

    @Override // j$.util.stream.n5
    public final boolean q() {
        byte b = this.a;
        return false;
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                w3.k();
                throw null;
            default:
                w3.k();
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

    private final void a(long j) {
    }

    private final void b(long j) {
    }

    private final void c() {
    }

    private final void d() {
    }
}
