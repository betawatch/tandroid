package a4;

import e3.d0;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements o {
    public final /* synthetic */ int a;
    public final d0 b;

    public a(int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new d0(16973, 2, "image/bmp");
                break;
            default:
                this.b = new d0(35152, 2, "image/png");
                break;
        }
    }

    @Override // e3.o
    public final o a() {
        int i3 = this.a;
        return this;
    }

    @Override // e3.o
    public final boolean b(p pVar) {
        switch (this.a) {
        }
        return this.b.b(pVar);
    }

    @Override // e3.o
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

    @Override // e3.o
    public final void d(long j10, long j11) {
        switch (this.a) {
            case 0:
                this.b.d(j10, j11);
                break;
            default:
                this.b.d(j10, j11);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // e3.o
    public final List e() {
        switch (this.a) {
        }
        g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // e3.o
    public final int f(p pVar, s sVar) {
        switch (this.a) {
        }
        return this.b.f(pVar, sVar);
    }

    @Override // e3.o
    public final void release() {
        int i3 = this.a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
