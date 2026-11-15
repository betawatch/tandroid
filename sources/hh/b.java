package hh;

import android.graphics.Color;
import gh.e;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b extends e {
    public final /* synthetic */ e6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e6 e6Var, e6 e6Var2) {
        super(e6Var);
        this.s = e6Var2;
    }

    @Override // gh.e, gh.a
    public final float A1() {
        return g0.N(0.6f);
    }

    @Override // gh.e, gh.a
    public final int D1() {
        e6 e6Var = this.s;
        if (j6.i1(e6Var)) {
            return j6.w0(j6.ya, e6Var);
        }
        return 0;
    }

    @Override // gh.e, gh.a
    public final int M0() {
        e6 e6Var = this.s;
        if (j6.i1(e6Var)) {
            return j6.w0(j6.wa, e6Var);
        }
        return 0;
    }

    @Override // gh.e, gh.a
    public final int U0() {
        int a10 = a(this.d);
        e6 e6Var = this.s;
        if (j6.i1(e6Var) && Color.alpha(j6.w0(j6.wa, e6Var)) != 0) {
            return 0;
        }
        return a10;
    }

    @Override // gh.e, gh.a
    public final int W1() {
        e6 e6Var = this.s;
        return j6.i1(e6Var) ? j6.w0(j6.xa, e6Var) : a(this.b);
    }

    @Override // gh.e
    public final float b() {
        return j6.i1(this.s) ? g0.N(1.0f) : this.r;
    }

    @Override // gh.e
    public final float c() {
        return j6.i1(this.s) ? g0.N(2.25f) : this.n;
    }

    @Override // gh.e, gh.a
    public final int t0() {
        int a10 = a(this.c);
        e6 e6Var = this.s;
        if (j6.i1(e6Var) && Color.alpha(j6.w0(j6.wa, e6Var)) != 0) {
            return 0;
        }
        return a10;
    }
}
