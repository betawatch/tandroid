package j4;

import h3.s2;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r extends h3.a {
    public final s2 e;
    public final int f;
    public final int h;
    public final int n;

    public r(s2 s2Var, int i10) {
        super(new f1(i10));
        this.e = s2Var;
        int h = s2Var.h();
        this.f = h;
        this.h = s2Var.o();
        this.n = i10;
        if (h > 0) {
            if (!(i10 <= ConnectionsManager.DEFAULT_DATACENTER_ID / h)) {
                throw new IllegalStateException("LoopingMediaSource contains too many periods");
            }
        }
    }

    @Override // h3.s2
    public final int h() {
        return this.f * this.n;
    }

    @Override // h3.s2
    public final int o() {
        return this.h * this.n;
    }

    @Override // h3.a
    public final int q(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    @Override // h3.a
    public final int r(int i10) {
        return i10 / this.f;
    }

    @Override // h3.a
    public final int s(int i10) {
        return i10 / this.h;
    }

    @Override // h3.a
    public final Object t(int i10) {
        return Integer.valueOf(i10);
    }

    @Override // h3.a
    public final int u(int i10) {
        return i10 * this.f;
    }

    @Override // h3.a
    public final int v(int i10) {
        return i10 * this.h;
    }

    @Override // h3.a
    public final s2 x(int i10) {
        return this.e;
    }
}
