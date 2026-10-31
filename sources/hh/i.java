package hh;

import ag.l;
import android.graphics.Typeface;
import android.provider.Settings;
import android.view.View;
import fe.n;
import fe.o;
import org.telegram.messenger.i0;
import org.telegram.messenger.w0;
import org.telegram.ui.ActionBar.m1;
import r0.g1;
import r0.j1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class i implements g, f, d {
    public e D;
    public View E;
    public int F;
    public int G;
    public final fe.f a;
    public final n b = new n(0.0f);
    public final o c = new o();
    public final o d = new o();
    public final e2.f e = new e2.f(null);
    public final c f;
    public final Runnable h;
    public boolean n;
    public j1 r;
    public int s;
    public int w;
    public int x;
    public final h y;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Runnable runnable) {
        l lVar = new l(this, 10);
        c cVar = new c();
        cVar.c = b.a;
        cVar.d = new gg.c(cVar, 2);
        cVar.b = lVar;
        Typeface typeface = i0.a;
        float f7 = 1.0f;
        try {
            f7 = Settings.Global.getFloat(w0.b.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
        }
        cVar.a = (long) (f7 * 250.0f * 1.1f);
        this.f = cVar;
        this.s = 1;
        this.y = new h(this, 0);
        this.h = runnable;
        this.a = new fe.f(0, new hf.b(this, runnable, 0 == true ? 1 : 0, 22), m1.w, 250L);
    }

    @Override // hh.d
    public final void P() {
        View view = this.E;
        if (view != null) {
            view.postOnAnimation(new h(this, 1));
        }
    }

    @Override // hh.d
    public final View R() {
        return this.E;
    }

    public final void a() {
        boolean z10 = this.a.h;
        boolean z11 = this.n;
        e2.f fVar = this.e;
        if (!z11 && z10) {
            this.n = true;
            fVar.d();
        }
        if (!this.n || z10) {
            return;
        }
        this.n = false;
        fVar.e();
    }

    public final float c() {
        e eVar = this.D;
        o oVar = this.d;
        return (eVar == null || this.G <= 0) ? oVar.d.a : Math.max(this.F, oVar.d.a);
    }

    public final float d() {
        e eVar = this.D;
        o oVar = this.c;
        return (eVar == null || this.G <= 0) ? oVar.d.a : Math.max(this.F, oVar.d.a);
    }

    public final int e() {
        return (this.D == null || this.G <= 0) ? Math.max(f(527).d, this.w) : Math.max(this.F, Math.max(f(527).d, this.w));
    }

    public final i0.c f(int i10) {
        j1 j1Var = this.r;
        return j1Var != null ? j1Var.a.f(i10) : i0.c.e;
    }

    public final void g(int i10) {
        if (this.w == i10 && this.s == 0) {
            return;
        }
        i0.r(this.y);
        this.x = Math.max(this.w, i10);
        this.w = i10;
        this.s = 0;
        j(this.r);
    }

    public final void h(int i10) {
        if (i10 > 0) {
            g(i10 + i0.n);
        } else {
            i(true);
        }
    }

    public final void i(boolean z10) {
        if (this.w == 0) {
            return;
        }
        h hVar = this.y;
        i0.r(hVar);
        this.s = z10 ? 3 : 2;
        j(this.r);
        if (z10) {
            i0.h3(hVar, 1000L);
        }
    }

    public final void j(j1 j1Var) {
        k(j1Var, this.r != null);
    }

    public final void k(j1 j1Var, boolean z10) {
        i0.c cVar;
        int i10;
        fe.f fVar;
        j1 b10 = b(j1Var);
        this.r = b10;
        i0.c cVar2 = i0.c.e;
        if (b10 != null) {
            g1 g1Var = b10.a;
            cVar = i0.c.a(g1Var.f(647), g1Var.g(647));
        } else {
            cVar = cVar2;
        }
        if (b10 != null) {
            cVar2 = b10.a.f(8);
        }
        c cVar3 = this.f;
        b bVar = (b) cVar3.c;
        boolean z11 = cVar2.d > 0;
        b bVar2 = !z10 ? z11 ? b.d : b.a : z11 ? b.c : b.b;
        if (bVar != bVar2) {
            cVar3.a(bVar2, false);
        }
        int i11 = this.s;
        if (i11 == 2) {
            this.w = 0;
        }
        if (i11 == 3 && cVar2.d > 0) {
            this.w = 0;
        }
        i0.c a2 = i0.c.a(cVar2, i0.c.b(0, 0, 0, this.w));
        int i12 = a2.c;
        int i13 = a2.b;
        int i14 = a2.a;
        int i15 = a2.d;
        i0.c a10 = i0.c.a(cVar, a2);
        int i16 = a10.d;
        int i17 = a10.c;
        int i18 = a10.b;
        int i19 = a10.a;
        Runnable runnable = this.h;
        fe.f fVar2 = this.a;
        o oVar = this.d;
        o oVar2 = this.c;
        n nVar = this.b;
        if (z10) {
            if (nVar.b(i15 > 0 ? 1.0f : 0.0f)) {
                i10 = i17;
                fVar = fVar2;
            } else {
                fVar = fVar2;
                i10 = i17;
                if (!oVar2.b(i19, i18, i17, i16) && !oVar.b(i14, i13, i12, i15)) {
                    if (bVar != bVar2) {
                        runnable.run();
                    }
                }
            }
            fVar.b();
            nVar.c(false);
            oVar2.c(false);
            oVar.c(false);
            nVar.c = i15 > 0 ? 1.0f : 0.0f;
            oVar2.e(i19, i18, i10, i16);
            oVar.e(i14, i13, i12, i15);
            fe.f fVar3 = fVar;
            fVar3.c(0.0f);
            fVar3.a(1.0f);
        } else {
            fVar2.b();
            nVar.d(i15 > 0 ? 1.0f : 0.0f);
            oVar2.d(i19, i18, i17, i16);
            oVar.d(i14, i13, i12, i15);
            runnable.run();
        }
        a();
    }

    @Override // hh.d
    public final void l(j1 j1Var) {
        j1 b10 = b(j1Var);
        this.F = b10 != null ? b10.a.f(8).d : 0;
        this.h.run();
    }

    @Override // hh.d
    public final void w() {
        this.G++;
    }

    public j1 b(j1 j1Var) {
        return j1Var;
    }
}
