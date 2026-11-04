package hh;

import android.graphics.Color;
import org.telegram.messenger.g0;
import org.telegram.messenger.lc;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class b implements a {
    public final e6 a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;

    public b(int i3, e6 e6Var) {
        this(e6Var, i3, lc.e(262144) ? 0.85f : 0.76f);
    }

    @Override // hh.a
    public final int F() {
        if (b()) {
            return k6.w0(this.n, this.a);
        }
        return 0;
    }

    @Override // hh.a
    public int M() {
        a();
        if (!b() || Color.alpha(k6.w0(this.n, this.a)) == 0) {
            return this.h;
        }
        return 0;
    }

    @Override // hh.a
    public final float O() {
        if (b()) {
            return g0.N(1.0f);
        }
        return -1.0f;
    }

    @Override // hh.a
    public final float W() {
        if (b()) {
            return g0.N(2.25f);
        }
        return -1.0f;
    }

    public final void a() {
        if (this.r != r6.b) {
            d();
        }
    }

    @Override // hh.a
    public final float a0() {
        return g0.N(0.6f);
    }

    public final boolean b() {
        return this.n >= 0 && k6.i1(this.a);
    }

    public boolean c() {
        return g0.B(k6.w0(this.b, this.a)) < 0.721f;
    }

    @Override // hh.a
    public final int c0() {
        if (b()) {
            return k6.w0(k6.ya, this.a);
        }
        return 0;
    }

    public final void d() {
        this.r = r6.b;
        this.d = k6.r1(this.c, k6.w0(this.b, this.a));
        if (c()) {
            this.f = 687865855;
            this.h = 352321535;
            this.e = 0;
        } else {
            this.f = -1;
            this.h = -1;
            this.e = TLObject.FLAG_29;
        }
    }

    @Override // hh.a
    public int u0() {
        a();
        return b() ? k6.w0(k6.xa, this.a) : this.e;
    }

    @Override // hh.a
    public int w0() {
        a();
        return this.d;
    }

    @Override // hh.a
    public int x() {
        a();
        if (!b() || Color.alpha(k6.w0(this.n, this.a)) == 0) {
            return this.f;
        }
        return 0;
    }

    public b(e6 e6Var, int i3, float f10) {
        this.n = -1;
        this.r = r6.b;
        this.a = e6Var;
        this.b = i3;
        this.c = f10;
        d();
    }
}
