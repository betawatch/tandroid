package ih;

import android.graphics.Color;
import hh.e;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b extends e {
    public final /* synthetic */ e6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e6 e6Var, e6 e6Var2) {
        super(e6Var);
        this.s = e6Var2;
    }

    @Override // hh.e, hh.a
    public final int F() {
        e6 e6Var = this.s;
        if (k6.i1(e6Var)) {
            return k6.w0(k6.wa, e6Var);
        }
        return 0;
    }

    @Override // hh.e, hh.a
    public final int M() {
        int a10 = a(this.d);
        e6 e6Var = this.s;
        if (k6.i1(e6Var) && Color.alpha(k6.w0(k6.wa, e6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override // hh.e, hh.a
    public final float a0() {
        return g0.N(0.6f);
    }

    @Override // hh.e
    public final float b() {
        return k6.i1(this.s) ? g0.N(1.0f) : this.r;
    }

    @Override // hh.e
    public final float c() {
        return k6.i1(this.s) ? g0.N(2.25f) : this.n;
    }

    @Override // hh.e, hh.a
    public final int c0() {
        e6 e6Var = this.s;
        if (k6.i1(e6Var)) {
            return k6.w0(k6.ya, e6Var);
        }
        return 0;
    }

    @Override // hh.e, hh.a
    public final int u0() {
        e6 e6Var = this.s;
        return k6.i1(e6Var) ? k6.w0(k6.xa, e6Var) : a(this.b);
    }

    @Override // hh.e, hh.a
    public final int x() {
        int a10 = a(this.c);
        e6 e6Var = this.s;
        if (k6.i1(e6Var) && Color.alpha(k6.w0(k6.wa, e6Var)) != 0) {
            return 0;
        }
        return a10;
    }
}
