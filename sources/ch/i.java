package ch;

import android.view.View;
import cg.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.r1;
import r0.m1;
import xd.k;
import xd.l;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class i implements g, f, d {
    public View B;
    public int C;
    public int D;
    public final xd.c a;
    public final Runnable h;
    public boolean n;
    public m1 r;
    public int v;
    public int w;
    public e y;
    public final k b = new k(0.0f);
    public final l c = new l();
    public final l d = new l();
    public final AnimationNotificationsLocker e = new AnimationNotificationsLocker();
    public final c f = new c(new h0(this, 1));
    public int s = 1;
    public final h x = new h(this, 0);

    /* JADX WARN: Multi-variable type inference failed */
    public i(Runnable runnable) {
        this.h = runnable;
        this.a = new xd.c(0, new bf.b(this, runnable, 0 == true ? 1 : 0, 20), r1.w, 250L);
    }

    @Override // ch.d
    public final void J() {
        View view = this.B;
        if (view != null) {
            view.postOnAnimation(new h(this, 1));
        }
    }

    @Override // ch.d
    public final View N() {
        return this.B;
    }

    public final void a() {
        boolean z4 = this.a.g;
        boolean z10 = this.n;
        AnimationNotificationsLocker animationNotificationsLocker = this.e;
        if (!z10 && z4) {
            this.n = true;
            animationNotificationsLocker.lock();
        }
        if (!this.n || z4) {
            return;
        }
        this.n = false;
        animationNotificationsLocker.unlock();
    }

    public final float b() {
        e eVar = this.y;
        l lVar = this.d;
        return (eVar == null || this.D <= 0) ? lVar.d.a : Math.max(this.C, lVar.d.a);
    }

    public final float c() {
        e eVar = this.y;
        l lVar = this.c;
        return (eVar == null || this.D <= 0) ? lVar.d.a : Math.max(this.C, lVar.d.a);
    }

    public final int d() {
        return (this.y == null || this.D <= 0) ? Math.max(e(527).d, this.v) : Math.max(this.C, Math.max(e(527).d, this.v));
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

    public final void h(boolean z4) {
        if (this.v == 0) {
            return;
        }
        h hVar = this.x;
        AndroidUtilities.cancelRunOnUIThread(hVar);
        this.s = z4 ? 3 : 2;
        i(this.r);
        if (z4) {
            AndroidUtilities.runOnUIThread(hVar, 1000L);
        }
    }

    public final void i(m1 m1Var) {
        j(m1Var, this.r != null);
    }

    public final void j(m1 m1Var, boolean z4) {
        int i10;
        xd.c cVar;
        this.r = m1Var;
        i0.b bVar = i0.b.e;
        i0.b g10 = m1Var != null ? m1Var.a.g(647) : bVar;
        if (m1Var != null) {
            bVar = m1Var.a.f(8);
        }
        c cVar2 = this.f;
        b bVar2 = cVar2.c;
        boolean z10 = bVar.d > 0;
        b bVar3 = !z4 ? z10 ? b.d : b.a : z10 ? b.c : b.b;
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
        xd.c cVar3 = this.a;
        l lVar = this.d;
        l lVar2 = this.c;
        k kVar = this.b;
        if (z4) {
            if (kVar.b(i15 > 0 ? 1.0f : 0.0f)) {
                i10 = i17;
                cVar = cVar3;
            } else {
                cVar = cVar3;
                i10 = i17;
                if (!lVar2.b(i19, i18, i17, i16) && !lVar.b(i14, i13, i12, i15)) {
                    if (bVar2 != bVar3) {
                        runnable.run();
                    }
                }
            }
            cVar.b();
            kVar.c(false);
            lVar2.c(false);
            lVar.c(false);
            kVar.c = i15 > 0 ? 1.0f : 0.0f;
            lVar2.e(i19, i18, i10, i16);
            lVar.e(i14, i13, i12, i15);
            xd.c cVar4 = cVar;
            cVar4.c(0.0f);
            cVar4.a(1.0f);
        } else {
            cVar3.b();
            kVar.d(i15 > 0 ? 1.0f : 0.0f);
            lVar2.d(i19, i18, i17, i16);
            lVar.d(i14, i13, i12, i15);
            runnable.run();
        }
        a();
    }

    @Override // ch.d
    public final void k(m1 m1Var) {
        this.C = m1Var.a.f(8).d;
        this.h.run();
    }

    @Override // ch.d
    public final void t() {
        this.D++;
    }
}
