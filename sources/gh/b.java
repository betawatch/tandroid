package gh;

import android.graphics.Color;
import org.telegram.messenger.g0;
import org.telegram.messenger.pc;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class b implements a {
    public final i6 a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;

    public b(int i7, i6 i6Var) {
        this(i6Var, i7, pc.e(262144) ? 0.85f : 0.76f);
    }

    @Override // gh.a
    public final float A1() {
        return g0.N(0.6f);
    }

    @Override // gh.a
    public final int D0() {
        if (b()) {
            return n6.w0(this.n, this.a);
        }
        return 0;
    }

    @Override // gh.a
    public final int D1() {
        if (b()) {
            return n6.w0(n6.ya, this.a);
        }
        return 0;
    }

    @Override // gh.a
    public int Q0() {
        a();
        if (!b() || Color.alpha(n6.w0(this.n, this.a)) == 0) {
            return this.h;
        }
        return 0;
    }

    @Override // gh.a
    public final float T0() {
        if (b()) {
            return g0.N(1.0f);
        }
        return -1.0f;
    }

    @Override // gh.a
    public final float V0() {
        if (b()) {
            return g0.N(2.25f);
        }
        return -1.0f;
    }

    @Override // gh.a
    public int X1() {
        a();
        return b() ? n6.w0(n6.xa, this.a) : this.e;
    }

    public final void a() {
        if (this.r != u6.b) {
            d();
        }
    }

    public final boolean b() {
        return this.n >= 0 && n6.i1(this.a);
    }

    public boolean c() {
        return g0.B(n6.w0(this.b, this.a)) < 0.721f;
    }

    public final void d() {
        this.r = u6.b;
        this.d = n6.r1(this.c, n6.w0(this.b, this.a));
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
    public int i0() {
        a();
        if (!b() || Color.alpha(n6.w0(this.n, this.a)) == 0) {
            return this.f;
        }
        return 0;
    }

    @Override // gh.a
    public int x2() {
        a();
        return this.d;
    }

    public b(i6 i6Var, int i7, float f10) {
        this.n = -1;
        this.r = u6.b;
        this.a = i6Var;
        this.b = i7;
        this.c = f10;
        d();
    }
}
