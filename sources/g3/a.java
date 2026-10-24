package g3;

import c3.g0;
import c3.q;
import c3.r;
import c3.s;
import c3.u;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a implements q {
    public final /* synthetic */ int a;
    public final g0 b;

    public a(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new g0(35152, 2, "image/png");
                break;
            default:
                this.b = new g0(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // c3.q
    public final boolean a(r rVar) {
        switch (this.a) {
        }
        return this.b.a(rVar);
    }

    @Override // c3.q
    public final q b() {
        int i10 = this.a;
        return this;
    }

    @Override // c3.q
    public final void c(s sVar) {
        switch (this.a) {
            case 0:
                this.b.c(sVar);
                break;
            default:
                this.b.c(sVar);
                break;
        }
    }

    @Override // c3.q
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
    @Override // c3.q
    public final List e() {
        switch (this.a) {
        }
        l0 l0Var = n0.b;
        return x1.e;
    }

    @Override // c3.q
    public final int f(r rVar, u uVar) {
        switch (this.a) {
        }
        return this.b.f(rVar, uVar);
    }

    @Override // c3.q
    public final void release() {
        int i10 = this.a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
