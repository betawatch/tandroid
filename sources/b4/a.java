package b4;

import f3.d0;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import h9.g0;
import h9.i0;
import h9.s1;
import java.util.List;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class a implements o {
    public final /* synthetic */ int a;
    public final d0 b;

    public a(int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.b = new d0(16973, 2, "image/bmp");
                break;
            default:
                this.b = new d0(35152, 2, "image/png");
                break;
        }
    }

    @Override // f3.o
    public final o a() {
        int i7 = this.a;
        return this;
    }

    @Override // f3.o
    public final boolean b(p pVar) {
        switch (this.a) {
        }
        return this.b.b(pVar);
    }

    @Override // f3.o
    public final void c(q qVar) {
        switch (this.a) {
            case 0:
                this.b.c(qVar);
                break;
            default:
                this.b.c(qVar);
                break;
        }
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        switch (this.a) {
            case 0:
                this.b.d(j3, j10);
                break;
            default:
                this.b.d(j3, j10);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // f3.o
    public final List e() {
        switch (this.a) {
        }
        g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // f3.o
    public final int f(p pVar, s sVar) {
        switch (this.a) {
        }
        return this.b.f(pVar, sVar);
    }

    @Override // f3.o
    public final void release() {
        int i7 = this.a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
