package g3;

import c3.d0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a implements o {
    public final /* synthetic */ int a;
    public final d0 b;

    public a(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new d0(35152, 2, "image/png");
                break;
            default:
                this.b = new d0(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // c3.o
    public final boolean b(p pVar) {
        switch (this.a) {
        }
        return this.b.b(pVar);
    }

    @Override // c3.o
    public final o c() {
        int i10 = this.a;
        return this;
    }

    @Override // c3.o
    public final void g(q qVar) {
        switch (this.a) {
            case 0:
                this.b.g(qVar);
                break;
            default:
                this.b.g(qVar);
                break;
        }
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        switch (this.a) {
            case 0:
                this.b.h(j3, j10);
                break;
            default:
                this.b.h(j3, j10);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // c3.o
    public final List i() {
        switch (this.a) {
        }
        g0 g0Var = i0.b;
        return a1.e;
    }

    @Override // c3.o
    public final int m(p pVar, s sVar) {
        switch (this.a) {
        }
        return this.b.m(pVar, sVar);
    }

    @Override // c3.o
    public final void release() {
        int i10 = this.a;
    }

    private final void a() {
    }

    private final void d() {
    }
}
