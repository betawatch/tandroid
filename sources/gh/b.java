package gh;

import android.graphics.Color;
import org.telegram.messenger.g0;
import org.telegram.messenger.rc;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class b implements a {
    public final f6 a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;

    public b(int i7, f6 f6Var) {
        this(f6Var, i7, rc.e(262144) ? 0.85f : 0.76f);
    }

    @Override // gh.a
    public int A() {
        a();
        if (!b() || Color.alpha(k6.w0(this.n, this.a)) == 0) {
            return this.f;
        }
        return 0;
    }

    @Override // gh.a
    public final int C0() {
        if (b()) {
            return k6.w0(k6.ya, this.a);
        }
        return 0;
    }

    @Override // gh.a
    public final int M() {
        if (b()) {
            return k6.w0(this.n, this.a);
        }
        return 0;
    }

    @Override // gh.a
    public int O() {
        a();
        if (!b() || Color.alpha(k6.w0(this.n, this.a)) == 0) {
            return this.h;
        }
        return 0;
    }

    @Override // gh.a
    public int R0() {
        a();
        return b() ? k6.w0(k6.xa, this.a) : this.e;
    }

    public final void a() {
        if (this.r != r6.b) {
            d();
        }
    }

    public final boolean b() {
        return this.n >= 0 && k6.i1(this.a);
    }

    public boolean c() {
        return g0.B(k6.w0(this.b, this.a)) < 0.721f;
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

    public b(f6 f6Var, int i7, float f10) {
        this.n = -1;
        this.r = r6.b;
        this.a = f6Var;
        this.b = i7;
        this.c = f10;
        d();
    }
}
