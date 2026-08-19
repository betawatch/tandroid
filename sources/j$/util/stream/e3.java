package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class e3 implements d2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ e3(IntConsumer intConsumer, int i) {
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

    @Override // j$.util.stream.d2
    public final /* synthetic */ void A(Integer num) {
        switch (this.a) {
            case 0:
                q1.g(this, num);
                break;
            default:
                q1.g(this, num);
                break;
        }
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ boolean C() {
        switch (this.a) {
        }
        return false;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                q1.a();
                throw null;
            default:
                q1.a();
                throw null;
        }
    }

    @Override // j$.util.stream.d2, j$.util.stream.f2
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                this.b.accept(i);
                break;
            default:
                ((K2) this.b).accept(i);
                break;
        }
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                q1.l();
                throw null;
            default:
                q1.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        switch (this.a) {
            case 0:
                A((Integer) obj);
                break;
            default:
                A((Integer) obj);
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
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void x() {
        int i = this.a;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void y(long j) {
        int i = this.a;
    }
}
