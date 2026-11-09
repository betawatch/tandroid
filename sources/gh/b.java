package gh;

import android.graphics.Color;
import org.telegram.messenger.g0;
import org.telegram.messenger.sc;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class b implements a {
    public final g6 a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;

    public b(int i7, g6 g6Var) {
        this(g6Var, i7, sc.e(262144) ? 0.85f : 0.76f);
    }

    @Override // gh.a
    public int A() {
        a();
        if (!b() || Color.alpha(l6.w0(this.n, this.a)) == 0) {
            return this.f;
        }
        return 0;
    }

    @Override // gh.a
    public final int C0() {
        if (b()) {
            return l6.w0(l6.ya, this.a);
        }
        return 0;
    }

    @Override // gh.a
    public final int M() {
        if (b()) {
            return l6.w0(this.n, this.a);
        }
        return 0;
    }

    @Override // gh.a
    public int O() {
        a();
        if (!b() || Color.alpha(l6.w0(this.n, this.a)) == 0) {
            return this.h;
        }
        return 0;
    }

    @Override // gh.a
    public int R0() {
        a();
        return b() ? l6.w0(l6.xa, this.a) : this.e;
    }

    public final void a() {
        if (this.r != s6.b) {
            d();
        }
    }

    public final boolean b() {
        return this.n >= 0 && l6.i1(this.a);
    }

    public boolean c() {
        return g0.B(l6.w0(this.b, this.a)) < 0.721f;
    }

    public final void d() {
        this.r = s6.b;
        this.d = l6.r1(this.c, l6.w0(this.b, this.a));
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

    @Override // gh.a
    public int e1() {
        a();
        return this.d;
    }

    @Override // gh.a
    public final float j0() {
        if (b()) {
            return g0.N(1.0f);
        }
        return -1.0f;
    }

    @Override // gh.a
    public final float o0() {
        if (b()) {
            return g0.N(2.25f);
        }
        return -1.0f;
    }

    @Override // gh.a
    public final float v0() {
        return g0.N(0.6f);
    }

    public b(g6 g6Var, int i7, float f10) {
        this.n = -1;
        this.r = s6.b;
        this.a = g6Var;
        this.b = i7;
        this.c = f10;
        d();
    }
}
