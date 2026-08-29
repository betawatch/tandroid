package ah;

import ag.i0;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.q1;
import r0.m1;
import vd.l;
import vd.m;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i implements g, f, d {
    public View A;
    public int B;
    public int C;
    public final vd.c a;
    public final Runnable h;
    public boolean n;
    public m1 r;
    public int v;
    public int w;
    public e y;
    public final l b = new l(0.0f);
    public final m c = new m();
    public final m d = new m();
    public final AnimationNotificationsLocker e = new AnimationNotificationsLocker();
    public final c f = new c(new i0(this, 1));
    public int s = 1;
    public final h x = new h(this, 0);

    public i(Runnable runnable) {
        this.h = runnable;
        this.a = new vd.c(0, new ze.b(this, runnable, false), q1.w, 250L);
    }

    @Override // ah.d
    public final void I() {
        View view = this.A;
        if (view != null) {
            view.postOnAnimation(new h(this, 1));
        }
    }

    @Override // ah.d
    public final View M() {
        return this.A;
    }

    public final void a() {
        boolean z10 = this.a.g;
        boolean z11 = this.n;
        AnimationNotificationsLocker animationNotificationsLocker = this.e;
        if (!z11 && z10) {
            this.n = true;
            animationNotificationsLocker.lock();
        }
        if (!this.n || z10) {
            return;
        }
        this.n = false;
        animationNotificationsLocker.unlock();
    }

    public final float b() {
        e eVar = this.y;
        m mVar = this.d;
        return (eVar == null || this.C <= 0) ? mVar.d.a : Math.max(this.B, mVar.d.a);
    }

    public final float c() {
        e eVar = this.y;
        m mVar = this.c;
        return (eVar == null || this.C <= 0) ? mVar.d.a : Math.max(this.B, mVar.d.a);
    }

    public final int d() {
        return (this.y == null || this.C <= 0) ? Math.max(e(527).d, this.v) : Math.max(this.B, Math.max(e(527).d, this.v));
    }

    public final i0.b e(int i10) {
        m1 m1Var = this.r;
        return m1Var != null ? m1Var.a.f(i10) : i0.b.e;
    }

    public final void f(int i10) {
        if (this.v == i10 && this.s == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.x);
        this.w = Math.max(this.v, i10);
        this.v = i10;
        this.s = 0;
        i(this.r);
    }

    public final void g(int i10) {
        if (i10 > 0) {
            f(i10 + AndroidUtilities.navigationBarHeight);
        } else {
            h(true);
        }
    }

    public final void h(boolean z10) {
        if (this.v == 0) {
            return;
        }
        h hVar = this.x;
        AndroidUtilities.cancelRunOnUIThread(hVar);
        this.s = z10 ? 3 : 2;
        i(this.r);
        if (z10) {
            AndroidUtilities.runOnUIThread(hVar, 1000L);
        }
    }

    public final void i(m1 m1Var) {
        j(m1Var, this.r != null);
    }

    public final void j(m1 m1Var, boolean z10) {
        int i10;
        vd.c cVar;
        this.r = m1Var;
        i0.b bVar = i0.b.e;
        i0.b g10 = m1Var != null ? m1Var.a.g(647) : bVar;
        if (m1Var != null) {
            bVar = m1Var.a.f(8);
        }
        c cVar2 = this.f;
        b bVar2 = cVar2.c;
        boolean z11 = bVar.d > 0;
        b bVar3 = !z10 ? z11 ? b.d : b.a : z11 ? b.c : b.b;
        if (bVar2 != bVar3) {
            cVar2.a(bVar3, false);
        }
        int i11 = this.s;
        if (i11 == 2) {
            this.v = 0;
        }
        if (i11 == 3 && bVar.d > 0) {
            this.v = 0;
        }
        i0.b a2 = i0.b.a(bVar, i0.b.b(0, 0, 0, this.v));
        int i12 = a2.c;
        int i13 = a2.b;
        int i14 = a2.a;
        int i15 = a2.d;
        i0.b a10 = i0.b.a(g10, a2);
        int i16 = a10.d;
        int i17 = a10.c;
        int i18 = a10.b;
        int i19 = a10.a;
        Runnable runnable = this.h;
        vd.c cVar3 = this.a;
        m mVar = this.d;
        m mVar2 = this.c;
        l lVar = this.b;
        if (z10) {
            if (lVar.b(i15 > 0 ? 1.0f : 0.0f)) {
                i10 = i17;
                cVar = cVar3;
            } else {
                cVar = cVar3;
                i10 = i17;
                if (!mVar2.b(i19, i18, i17, i16) && !mVar.b(i14, i13, i12, i15)) {
                    if (bVar2 != bVar3) {
                        runnable.run();
                    }
                }
            }
            cVar.b();
            lVar.c(false);
            mVar2.c(false);
            mVar.c(false);
            lVar.c = i15 > 0 ? 1.0f : 0.0f;
            mVar2.e(i19, i18, i10, i16);
            mVar.e(i14, i13, i12, i15);
            vd.c cVar4 = cVar;
            cVar4.c(0.0f);
            cVar4.a(1.0f);
        } else {
            cVar3.b();
            lVar.d(i15 > 0 ? 1.0f : 0.0f);
            mVar2.d(i19, i18, i17, i16);
            mVar.d(i14, i13, i12, i15);
            runnable.run();
        }
        a();
    }

    @Override // ah.d
    public final void k(m1 m1Var) {
        this.B = m1Var.a.f(8).d;
        this.h.run();
    }

    @Override // ah.d
    public final void t() {
        this.C++;
    }
}
