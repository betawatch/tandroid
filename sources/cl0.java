// default package

import android.graphics.Color;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class cl0 implements bl0 {
    public final vnb a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;

    public cl0(vnb vnbVar, int i, float f) {
        this.n = -1;
        this.r = yob.b;
        this.a = vnbVar;
        this.b = i;
        this.c = f;
        d();
    }

    @Override // bl0
    public final float B0() {
        if (b()) {
            return hl.N(1.0f);
        }
        return -1.0f;
    }

    @Override // bl0
    public final float D0() {
        if (b()) {
            return hl.N(2.25f);
        }
        return -1.0f;
    }

    @Override // bl0
    public int Q1() {
        a();
        return this.d;
    }

    @Override // bl0
    public int X() {
        a();
        if (!b() || Color.alpha(aob.v0(this.n, this.a)) == 0) {
            return this.f;
        }
        return 0;
    }

    public final void a() {
        if (this.r != yob.b) {
            d();
        }
    }

    public final boolean b() {
        return this.n >= 0 && aob.g1(this.a);
    }

    public boolean c() {
        return hl.B(aob.v0(this.b, this.a)) < 0.721f;
    }

    public final void d() {
        this.r = yob.b;
        this.d = aob.p1(this.c, aob.v0(this.b, this.a));
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

    @Override // bl0
    public final int m0() {
        if (b()) {
            return aob.v0(this.n, this.a);
        }
        return 0;
    }

    @Override // bl0
    public final float m1() {
        return hl.N(0.6f);
    }

    @Override // bl0
    public final int o1() {
        if (b()) {
            return aob.v0(aob.ya, this.a);
        }
        return 0;
    }

    @Override // bl0
    public int x0() {
        a();
        if (!b() || Color.alpha(aob.v0(this.n, this.a)) == 0) {
            return this.h;
        }
        return 0;
    }

    @Override // bl0
    public int x1() {
        a();
        return b() ? aob.v0(aob.xa, this.a) : this.e;
    }

    public cl0(int i, vnb vnbVar) {
        this(vnbVar, i, i86.e(262144) ? 0.85f : 0.76f);
    }
}
