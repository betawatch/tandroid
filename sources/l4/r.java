package l4;

import j3.r2;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r extends j3.a {
    public final r2 e;
    public final int f;
    public final int h;
    public final int n;

    public r(r2 r2Var, int i10) {
        super(new g1(i10));
        this.e = r2Var;
        int h = r2Var.h();
        this.f = h;
        this.h = r2Var.o();
        this.n = i10;
        if (h > 0) {
            if (!(i10 <= ConnectionsManager.DEFAULT_DATACENTER_ID / h)) {
                throw new IllegalStateException("LoopingMediaSource contains too many periods");
            }
        }
    }

    @Override // j3.r2
    public final int h() {
        return this.f * this.n;
    }

    @Override // j3.r2
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
    public final r2 x(int i10) {
        return this.e;
    }
}
