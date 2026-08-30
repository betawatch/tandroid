package o4;

import j3.o2;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class l extends j3.a {
    public final o2 e;
    public final int f;
    public final int h;
    public final int n;

    public l(o2 o2Var, int i10) {
        super(new p0(i10));
        this.e = o2Var;
        int h = o2Var.h();
        this.f = h;
        this.h = o2Var.o();
        this.n = i10;
        if (h > 0) {
            if (!(i10 <= ConnectionsManager.DEFAULT_DATACENTER_ID / h)) {
                throw new IllegalStateException("LoopingMediaSource contains too many periods");
            }
        }
    }

    @Override // j3.o2
    public final int h() {
        return this.f * this.n;
    }

    @Override // j3.o2
    public final int o() {
        return this.h * this.n;
    }

    @Override // j3.a
    public final int q(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    @Override // j3.a
    public final int r(int i10) {
        return i10 / this.f;
    }

    @Override // j3.a
    public final int s(int i10) {
        return i10 / this.h;
    }

    @Override // j3.a
    public final Object t(int i10) {
        return Integer.valueOf(i10);
    }

    @Override // j3.a
    public final int u(int i10) {
        return i10 * this.f;
    }

    @Override // j3.a
    public final int v(int i10) {
        return i10 * this.h;
    }

    @Override // j3.a
    public final o2 x(int i10) {
        return this.e;
    }
}
