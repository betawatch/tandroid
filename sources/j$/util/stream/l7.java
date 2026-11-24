package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final /* synthetic */ class l7 implements k5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DoubleConsumer b;

    public /* synthetic */ l7(DoubleConsumer doubleConsumer, byte b) {
        this.a = b;
        this.b = doubleConsumer;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void C(Double d) {
        switch (this.a) {
            case 0:
                w3.e(this, d);
                break;
            default:
                w3.e(this, d);
                break;
        }
    }

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        byte b = this.a;
        DoubleConsumer doubleConsumer = this.b;
        switch (b) {
            case 0:
                doubleConsumer.accept(d);
                break;
            default:
                ((r6) doubleConsumer).accept(d);
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

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
        }
        return j$.time.a.b(this, doubleConsumer);
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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        switch (this.a) {
            case 0:
                C((Double) obj);
                break;
            default:
                C((Double) obj);
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
