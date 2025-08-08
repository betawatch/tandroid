package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.LongFunction;
import j$.util.function.Supplier;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Supplier, LongFunction, Consumer, d2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.d2, j$.util.function.l
    public /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 6:
                t0.b();
                throw null;
            default:
                t0.b();
                throw null;
        }
    }

    @Override // j$.util.stream.d2
    public /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 6:
                t0.k();
                throw null;
            default:
                t0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.d2
    public /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 6:
                t0.l();
                throw null;
            default:
                t0.l();
                throw null;
        }
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public void r(Object obj) {
        switch (this.a) {
            case 2:
                ((d2) this.b).r((d2) obj);
                break;
            case 6:
                ((N2) this.b).r(obj);
                break;
            case 8:
                ((Consumer) this.b).r(obj);
                break;
            default:
                ((ArrayList) this.b).add(obj);
                break;
        }
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 2:
                break;
            case 6:
                break;
            case 8:
                break;
        }
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 0:
                return ((b) this.b).r0();
            default:
                return (Spliterator) this.b;
        }
    }

    @Override // j$.util.stream.d2
    public /* synthetic */ void m() {
        int i = this.a;
    }

    @Override // j$.util.stream.d2
    public /* synthetic */ void n(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.d2
    public /* synthetic */ boolean q() {
        switch (this.a) {
        }
        return false;
    }

    @Override // j$.util.function.LongFunction
    public Object apply(long j) {
        return t0.D(j, (IntFunction) this.b);
    }
}
