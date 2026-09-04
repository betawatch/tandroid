package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class j7 implements i5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ j7(LongConsumer longConsumer, int i10) {
        this.a = i10;
        this.b = longConsumer;
    }

    private final /* synthetic */ void a(long j3) {
    }

    private final /* synthetic */ void b(long j3) {
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

    @Override // j$.util.stream.i5, j$.util.stream.j5
    public final void accept(long j3) {
        switch (this.a) {
            case 0:
                this.b.accept(j3);
                break;
            default:
                ((q6) this.b).accept(j3);
                break;
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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.d(this, longConsumer);
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

    @Override // j$.util.stream.i5
    public final /* synthetic */ void x(Long l4) {
        switch (this.a) {
            case 0:
                t3.H(this, l4);
                break;
            default:
                t3.H(this, l4);
                break;
        }
    }
}
