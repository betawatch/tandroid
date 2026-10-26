package g3;

import c3.d0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
    public final boolean a(p pVar) {
        switch (this.a) {
        }
        return this.b.a(pVar);
    }

    @Override // c3.o
    public final o b() {
        int i10 = this.a;
        return this;
    }

    @Override // c3.o
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

    @Override // c3.o
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
    @Override // c3.o
    public final List e() {
        switch (this.a) {
        }
        g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // c3.o
    public final int f(p pVar, s sVar) {
        switch (this.a) {
        }
        return this.b.f(pVar, sVar);
    }

    @Override // c3.o
    public final void release() {
        int i10 = this.a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
