package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final /* synthetic */ class p7 implements m5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ p7(LongConsumer longConsumer, byte b) {
        this.a = b;
        this.b = longConsumer;
    }

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        byte b = this.a;
        LongConsumer longConsumer = this.b;
        switch (b) {
            case 0:
                longConsumer.accept(j);
                break;
            default:
                ((v6) longConsumer).accept(j);
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

    @Override // j$.util.stream.m5
    public final /* synthetic */ void x(Long l) {
        switch (this.a) {
            case 0:
                w3.i(this, l);
                break;
            default:
                w3.i(this, l);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
        }
        return j$.time.a.c(this, longConsumer);
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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        switch (this.a) {
            case 0:
                x((Long) obj);
                break;
            default:
                x((Long) obj);
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
