package hh;

import android.graphics.Color;
import gh.e;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b extends e {
    public final /* synthetic */ h6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h6 h6Var, h6 h6Var2) {
        super(h6Var);
        this.s = h6Var2;
    }

    @Override // gh.e, gh.a
    public final int A() {
        int a10 = a(this.c);
        h6 h6Var = this.s;
        if (m6.i1(h6Var) && Color.alpha(m6.w0(m6.wa, h6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override // gh.e, gh.a
    public final int C0() {
        h6 h6Var = this.s;
        if (m6.i1(h6Var)) {
            return m6.w0(m6.ya, h6Var);
        }
        return 0;
    }

    @Override // gh.e, gh.a
    public final int M() {
        h6 h6Var = this.s;
        if (m6.i1(h6Var)) {
            return m6.w0(m6.wa, h6Var);
        }
        return 0;
    }

    @Override // gh.e, gh.a
    public final int O() {
        int a10 = a(this.d);
        h6 h6Var = this.s;
        if (m6.i1(h6Var) && Color.alpha(m6.w0(m6.wa, h6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override // gh.e, gh.a
    public final int R0() {
        h6 h6Var = this.s;
        return m6.i1(h6Var) ? m6.w0(m6.xa, h6Var) : a(this.b);
    }

    @Override // gh.e
    public final float b() {
        return m6.i1(this.s) ? g0.N(1.0f) : this.r;
    }

    @Override // gh.e
    public final float c() {
        return m6.i1(this.s) ? g0.N(2.25f) : this.n;
    }

    @Override // gh.e, gh.a
    public final float v0() {
        return g0.N(0.6f);
    }
}
