package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class o3 implements l2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ o3(LongConsumer longConsumer, int i) {
        this.a = i;
        this.b = longConsumer;
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.m2, j$.util.stream.j2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                w0.a();
                throw null;
            default:
                w0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                w0.k();
                throw null;
            default:
                w0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.l2, j$.util.stream.m2
    public final void accept(long j) {
        switch (this.a) {
            case 0:
                ((T2) this.b).accept(j);
                break;
            default:
                this.b.accept(j);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        switch (this.a) {
            case 0:
                j((Long) obj);
                break;
            default:
                j((Long) obj);
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
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.l2
    public final /* synthetic */ void j(Long l) {
        switch (this.a) {
            case 0:
                w0.i(this, l);
                break;
            default:
                w0.i(this, l);
                break;
        }
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void k() {
        int i = this.a;
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void l(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ boolean n() {
        switch (this.a) {
        }
        return false;
    }
}
