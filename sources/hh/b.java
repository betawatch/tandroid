package hh;

import android.graphics.Color;
import gh.e;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b extends e {
    public final /* synthetic */ g6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g6 g6Var, g6 g6Var2) {
        super(g6Var);
        this.s = g6Var2;
    }

    @Override // gh.e, gh.a
    public final int A() {
        int a10 = a(this.c);
        g6 g6Var = this.s;
        if (l6.i1(g6Var) && Color.alpha(l6.w0(l6.wa, g6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override // gh.e, gh.a
    public final int C0() {
        g6 g6Var = this.s;
        if (l6.i1(g6Var)) {
            return l6.w0(l6.ya, g6Var);
        }
        return 0;
    }

    @Override // gh.e, gh.a
    public final int M() {
        g6 g6Var = this.s;
        if (l6.i1(g6Var)) {
            return l6.w0(l6.wa, g6Var);
        }
        return 0;
    }

    @Override // gh.e, gh.a
    public final int O() {
        int a10 = a(this.d);
        g6 g6Var = this.s;
        if (l6.i1(g6Var) && Color.alpha(l6.w0(l6.wa, g6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override // gh.e, gh.a
    public final int R0() {
        g6 g6Var = this.s;
        return l6.i1(g6Var) ? l6.w0(l6.xa, g6Var) : a(this.b);
    }

    @Override // gh.e
    public final float b() {
        return l6.i1(this.s) ? g0.N(1.0f) : this.r;
    }

    @Override // gh.e
    public final float c() {
        return l6.i1(this.s) ? g0.N(2.25f) : this.n;
    }

    @Override // gh.e, gh.a
    public final float v0() {
        return g0.N(0.6f);
    }
}
