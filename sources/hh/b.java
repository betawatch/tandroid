package hh;

import android.graphics.Color;
import gh.e;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class b extends e {
    public final /* synthetic */ f6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f6 f6Var, f6 f6Var2) {
        super(f6Var);
        this.s = f6Var2;
    }

    @Override // gh.e, gh.a
    public final int A() {
        int a10 = a(this.c);
        f6 f6Var = this.s;
        if (k6.i1(f6Var) && Color.alpha(k6.w0(k6.wa, f6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override // gh.e, gh.a
    public final int C0() {
        f6 f6Var = this.s;
        if (k6.i1(f6Var)) {
            return k6.w0(k6.ya, f6Var);
        }
        return 0;
    }

    @Override // gh.e, gh.a
    public final int M() {
        f6 f6Var = this.s;
        if (k6.i1(f6Var)) {
            return k6.w0(k6.wa, f6Var);
        }
        return 0;
    }

    @Override // gh.e, gh.a
    public final int O() {
        int a10 = a(this.d);
        f6 f6Var = this.s;
        if (k6.i1(f6Var) && Color.alpha(k6.w0(k6.wa, f6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override // gh.e, gh.a
    public final int R0() {
        f6 f6Var = this.s;
        return k6.i1(f6Var) ? k6.w0(k6.xa, f6Var) : a(this.b);
    }

    @Override // gh.e
    public final float b() {
        return k6.i1(this.s) ? g0.N(1.0f) : this.r;
    }

    @Override // gh.e
    public final float c() {
        return k6.i1(this.s) ? g0.N(2.25f) : this.n;
    }

    @Override // gh.e, gh.a
    public final float v0() {
        return g0.N(0.6f);
    }
}
