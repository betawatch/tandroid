package j4;

import h3.r2;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s extends h3.a {
    public final r2 e;
    public final int f;
    public final int h;
    public final int n;

    public s(r2 r2Var, int i9) {
        super(new f1(i9));
        this.e = r2Var;
        int h = r2Var.h();
        this.f = h;
        this.h = r2Var.o();
        this.n = i9;
        if (h > 0) {
            if (!(i9 <= ConnectionsManager.DEFAULT_DATACENTER_ID / h)) {
                throw new IllegalStateException("LoopingMediaSource contains too many periods");
            }
        }
    }

    @Override // h3.r2
    public final int h() {
        return this.f * this.n;
    }

    @Override // h3.r2
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
    public final int r(int i9) {
        return i9 / this.f;
    }

    @Override // h3.a
    public final int s(int i9) {
        return i9 / this.h;
    }

    @Override // h3.a
    public final Object t(int i9) {
        return Integer.valueOf(i9);
    }

    @Override // h3.a
    public final int u(int i9) {
        return i9 * this.f;
    }

    @Override // h3.a
    public final int v(int i9) {
        return i9 * this.h;
    }

    @Override // h3.a
    public final r2 x(int i9) {
        return this.e;
    }
}
