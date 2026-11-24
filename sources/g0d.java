// default package

import android.graphics.Typeface;
import android.provider.Settings;
import android.view.View;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class g0d implements d0d, c0d, tyc {
    public uyc E;
    public View F;
    public int G;
    public int H;
    public final h94 a;
    public final bbc b = new bbc(0.0f);
    public final cbc c = new cbc();
    public final cbc d = new cbc();
    public final po e = new po(null);
    public final sj4 f;
    public final Runnable h;
    public boolean n;
    public wzc r;
    public byte s;
    public int w;
    public int x;
    public final f0d y;

    public g0d(Runnable runnable) {
        byte b = 0;
        e0d e0dVar = new e0d(this, (byte) 0);
        sj4 sj4Var = new sj4();
        sj4Var.c = nx5.a;
        sj4Var.d = new kg5(sj4Var, (byte) 12);
        sj4Var.b = e0dVar;
        Typeface typeface = gm.a;
        float f = 1.0f;
        try {
            f = Settings.Global.getFloat(a.b.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
        }
        sj4Var.a = (long) (f * 250.0f * 1.1f);
        this.f = sj4Var;
        this.s = (byte) 1;
        this.y = new f0d(this, b);
        this.h = runnable;
        this.a = new h94(0, new rhb(this, runnable, (byte) 5), gb.w, 250L);
    }

    @Override // tyc
    public final void P() {
        View view = this.F;
        if (view != null) {
            view.postOnAnimation(new f0d(this, (byte) 1));
        }
    }

    @Override // tyc
    public final View R() {
        return this.F;
    }

    public final void a() {
        boolean z = this.a.h;
        boolean z2 = this.n;
        po poVar = this.e;
        if (!z2 && z) {
            this.n = true;
            poVar.d();
        }
        if (!this.n || z) {
            return;
        }
        this.n = false;
        poVar.e();
    }

    public final float c() {
        uyc uycVar = this.E;
        cbc cbcVar = this.d;
        return (uycVar == null || this.H <= 0) ? cbcVar.d.a : Math.max(this.G, cbcVar.d.a);
    }

    public final float d() {
        uyc uycVar = this.E;
        cbc cbcVar = this.c;
        return (uycVar == null || this.H <= 0) ? cbcVar.d.a : Math.max(this.G, cbcVar.d.a);
    }

    public final int e() {
        return (this.E == null || this.H <= 0) ? Math.max(f(527).d, this.w) : Math.max(this.G, Math.max(f(527).d, this.w));
    }

    public final iq5 f(int i) {
        wzc wzcVar = this.r;
        return wzcVar != null ? wzcVar.a.f(i) : iq5.e;
    }

    public final void g(int i) {
        if (this.w == i && this.s == 0) {
            return;
        }
        gm.r(this.y);
        this.x = Math.max(this.w, i);
        this.w = i;
        this.s = (byte) 0;
        j(this.r);
    }

    public final void h(int i) {
        if (i > 0) {
            g(i + gm.n);
        } else {
            i(true);
        }
    }

    public final void i(boolean z) {
        if (this.w != 0) {
            f0d f0dVar = this.y;
            gm.r(f0dVar);
            this.s = z ? (byte) 3 : (byte) 2;
            j(this.r);
            if (z) {
                gm.d3(f0dVar, 1000L);
            }
        }
    }

    public final void j(wzc wzcVar) {
        k(wzcVar, this.r != null);
    }

    public final void k(wzc wzcVar, boolean z) {
        iq5 iq5Var;
        iq5 iq5Var2;
        int i;
        h94 h94Var;
        wzc b = b(wzcVar);
        this.r = b;
        if (b != null) {
            tzc tzcVar = b.a;
            iq5Var = iq5.a(tzcVar.f(647), tzcVar.g(647));
            iq5Var2 = tzcVar.f(8);
        } else {
            iq5Var = iq5.e;
            iq5Var2 = iq5Var;
        }
        sj4 sj4Var = this.f;
        nx5 nx5Var = (nx5) sj4Var.c;
        boolean z2 = iq5Var2.d > 0;
        nx5 nx5Var2 = !z ? z2 ? nx5.d : nx5.a : z2 ? nx5.c : nx5.b;
        if (nx5Var != nx5Var2) {
            sj4Var.a(nx5Var2, false);
        }
        byte b2 = this.s;
        if (b2 == 2) {
            this.w = 0;
        }
        if (b2 == 3 && iq5Var2.d > 0) {
            this.w = 0;
        }
        iq5 a = iq5.a(iq5Var2, iq5.b(0, 0, 0, this.w));
        int i2 = a.c;
        int i3 = a.b;
        int i4 = a.a;
        int i5 = a.d;
        iq5 a2 = iq5.a(iq5Var, a);
        int i6 = a2.d;
        int i7 = a2.c;
        int i8 = a2.b;
        int i9 = a2.a;
        Runnable runnable = this.h;
        h94 h94Var2 = this.a;
        cbc cbcVar = this.d;
        cbc cbcVar2 = this.c;
        bbc bbcVar = this.b;
        if (z) {
            if (bbcVar.b(i5 > 0 ? 1.0f : 0.0f)) {
                i = i7;
                h94Var = h94Var2;
            } else {
                h94Var = h94Var2;
                i = i7;
                if (!cbcVar2.b(i9, i8, i7, i6) && !cbcVar.b(i4, i3, i2, i5)) {
                    if (nx5Var != nx5Var2) {
                        runnable.run();
                    }
                }
            }
            h94Var.b();
            bbcVar.c(false);
            cbcVar2.c(false);
            cbcVar.c(false);
            bbcVar.c = i5 > 0 ? 1.0f : 0.0f;
            cbcVar2.e(i9, i8, i, i6);
            cbcVar.e(i4, i3, i2, i5);
            h94 h94Var3 = h94Var;
            h94Var3.c(0.0f);
            h94Var3.a(1.0f);
        } else {
            h94Var2.b();
            bbcVar.d(i5 > 0 ? 1.0f : 0.0f);
            cbcVar2.d(i9, i8, i7, i6);
            cbcVar.d(i4, i3, i2, i5);
            runnable.run();
        }
        a();
    }

    @Override // tyc
    public final void o(wzc wzcVar) {
        wzc b = b(wzcVar);
        this.G = b != null ? b.a.f(8).d : 0;
        this.h.run();
    }

    @Override // tyc
    public final void v() {
        this.H++;
    }

    public wzc b(wzc wzcVar) {
        return wzcVar;
    }
}
