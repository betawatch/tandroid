package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class y7 implements j5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ y7(Consumer consumer, int i9) {
        this.a = i9;
        this.b = consumer;
    }

    private final /* synthetic */ void a(long j10) {
    }

    private final /* synthetic */ void b(long j10) {
    }

    private final /* synthetic */ void c() {
    }

    private final /* synthetic */ void d() {
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                t3.C();
                throw null;
            default:
                t3.C();
                throw null;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i9) {
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
    public final /* synthetic */ void accept(long j10) {
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
    public final void x(Object obj) {
        switch (this.a) {
            case 0:
                ((t6) this.b).x(obj);
                break;
            default:
                this.b.x(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void end() {
        int i9 = this.a;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void o(long j10) {
        int i9 = this.a;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean q() {
        switch (this.a) {
        }
        return false;
    }
}
