// default package

import android.graphics.Color;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class bl0 implements al0 {
    public final wjb a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;

    public bl0(wjb wjbVar, int i, float f) {
        this.n = -1;
        this.r = zkb.b;
        this.a = wjbVar;
        this.b = i;
        this.c = f;
        d();
    }

    @Override // al0
    public int K() {
        a();
        if (!b() || Color.alpha(bkb.v0(this.n, this.a)) == 0) {
            return this.f;
        }
        return 0;
    }

    @Override // al0
    public final float U0() {
        return gl.N(0.6f);
    }

    public final void a() {
        if (this.r != zkb.b) {
            d();
        }
    }

    @Override // al0
    public final int a1() {
        if (b()) {
            return bkb.v0(bkb.xa, this.a);
        }
        return 0;
    }

    public final boolean b() {
        return this.n >= 0 && bkb.g1(this.a);
    }

    @Override // al0
    public final int b0() {
        if (b()) {
            return bkb.v0(this.n, this.a);
        }
        return 0;
    }

    public boolean c() {
        return gl.B(bkb.v0(this.b, this.a)) < 0.721f;
    }

    public final void d() {
        this.r = zkb.b;
        this.d = bkb.p1(this.c, bkb.v0(this.b, this.a));
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

    @Override // al0
    public int d1() {
        a();
        return b() ? bkb.v0(bkb.wa, this.a) : this.e;
    }

    @Override // al0
    public int k0() {
        a();
        if (!b() || Color.alpha(bkb.v0(this.n, this.a)) == 0) {
            return this.h;
        }
        return 0;
    }

    @Override // al0
    public final float p0() {
        if (b()) {
            return gl.N(1.0f);
        }
        return -1.0f;
    }

    @Override // al0
    public final float q0() {
        if (b()) {
            return gl.N(2.25f);
        }
        return -1.0f;
    }

    @Override // al0
    public int t1() {
        a();
        return this.d;
    }

    public bl0(int i, wjb wjbVar) {
        this(wjbVar, i, e66.e(262144) ? 0.85f : 0.76f);
    }
}
