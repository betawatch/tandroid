package hh;

import android.graphics.Color;
import gh.e;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b extends e {
    public final /* synthetic */ i6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i6 i6Var, i6 i6Var2) {
        super(i6Var);
        this.s = i6Var2;
    }

    @Override // gh.e, gh.a
    public final float A1() {
        return g0.N(0.6f);
    }

    @Override // gh.e, gh.a
    public final int D1() {
        i6 i6Var = this.s;
        if (n6.i1(i6Var)) {
            return n6.w0(n6.ya, i6Var);
        }
        return 0;
    }

    @Override // gh.e, gh.a
    public final int M0() {
        i6 i6Var = this.s;
        if (n6.i1(i6Var)) {
            return n6.w0(n6.wa, i6Var);
        }
        return 0;
    }

    @Override // gh.e, gh.a
    public final int U0() {
        int a10 = a(this.d);
        i6 i6Var = this.s;
        if (n6.i1(i6Var) && Color.alpha(n6.w0(n6.wa, i6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override // gh.e, gh.a
    public final int W1() {
        i6 i6Var = this.s;
        return n6.i1(i6Var) ? n6.w0(n6.xa, i6Var) : a(this.b);
    }

    @Override // gh.e
    public final float b() {
        return n6.i1(this.s) ? g0.N(1.0f) : this.r;
    }

    @Override // gh.e
    public final float c() {
        return n6.i1(this.s) ? g0.N(2.25f) : this.n;
    }

    @Override // gh.e, gh.a
    public final int t0() {
        int a10 = a(this.c);
        i6 i6Var = this.s;
        if (n6.i1(i6Var) && Color.alpha(n6.w0(n6.wa, i6Var)) != 0) {
            return 0;
        }
        return a10;
    }
}
