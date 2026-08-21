package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class v3 implements g2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ v3(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
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

    @Override // j$.util.stream.g2
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                r1.a();
                throw null;
            default:
                r1.a();
                throw null;
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
    public final void s(Object obj) {
        switch (this.a) {
            case 0:
                ((Q2) this.b).s(obj);
                break;
            default:
                this.b.s(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$-CC.$default$andThen(this, consumer);
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
