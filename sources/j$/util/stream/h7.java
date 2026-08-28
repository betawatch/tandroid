package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class h7 implements h5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ h7(IntConsumer intConsumer, int i9) {
        this.a = i9;
        this.b = intConsumer;
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

    @Override // j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i9) {
        switch (this.a) {
            case 0:
                this.b.accept(i9);
                break;
            default:
                ((o6) this.b).accept(i9);
                break;
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
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        switch (this.a) {
            case 0:
                p((Integer) obj);
                break;
            default:
                p((Integer) obj);
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

    @Override // j$.util.stream.j5
    public final /* synthetic */ void end() {
        int i9 = this.a;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void o(long j10) {
        int i9 = this.a;
    }

    @Override // j$.util.stream.h5
    public final /* synthetic */ void p(Integer num) {
        switch (this.a) {
            case 0:
                t3.F(this, num);
                break;
            default:
                t3.F(this, num);
                break;
        }
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean q() {
        switch (this.a) {
        }
        return false;
    }
}
