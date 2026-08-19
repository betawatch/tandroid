package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class g3 implements e2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ g3(LongConsumer longConsumer, int i) {
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

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                q1.k();
                throw null;
            default:
                q1.k();
                throw null;
        }
    }

    @Override // j$.util.stream.e2, j$.util.stream.f2
    public final void accept(long j) {
        switch (this.a) {
            case 0:
                this.b.accept(j);
                break;
            default:
                ((M2) this.b).accept(j);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        switch (this.a) {
            case 0:
                s((Long) obj);
                break;
            default:
                s((Long) obj);
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

    @Override // j$.util.stream.e2
    public final /* synthetic */ void s(Long l) {
        switch (this.a) {
            case 0:
                q1.i(this, l);
                break;
            default:
                q1.i(this, l);
                break;
        }
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
