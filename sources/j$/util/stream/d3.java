package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class d3 implements c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j$.util.function.E b;

    public /* synthetic */ d3(j$.util.function.E e, int i) {
        this.a = i;
        this.b = e;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.e2, j$.util.function.m
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                u0.b();
                throw null;
            default:
                u0.b();
                throw null;
        }
    }

    @Override // j$.util.stream.e2
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                ((J2) this.b).accept(i);
                break;
            default:
                this.b.accept(i);
                break;
        }
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                u0.l();
                throw null;
            default:
                u0.l();
                throw null;
        }
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        switch (this.a) {
            case 0:
                o((Integer) obj);
                break;
            default:
                o((Integer) obj);
                break;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.E
    public final /* synthetic */ j$.util.function.E l(j$.util.function.E e) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.c(this, e);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void m() {
        int i = this.a;
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void n(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.c2
    public final /* synthetic */ void o(Integer num) {
        switch (this.a) {
            case 0:
                u0.g(this, num);
                break;
            default:
                u0.g(this, num);
                break;
        }
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ boolean q() {
        switch (this.a) {
        }
        return false;
    }
}
