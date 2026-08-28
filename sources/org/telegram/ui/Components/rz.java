package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rz extends vk0 {
    public final Context c;
    public final /* synthetic */ vz d;

    public rz(vz vzVar, Context context) {
        this.d = vzVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.h.size();
    }

    @Override // f2.r0
    public final long i(int i9) {
        return this.d.g0.get(i9);
    }

    @Override // f2.r0
    public final int j(int i9) {
        return 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        tz tzVar = (tz) q1Var.a;
        int id2 = tzVar.b != null ? tzVar.getId() : -1;
        sz szVar = (sz) this.d.h.get(i9);
        tzVar.b = szVar;
        tzVar.e = i9;
        tzVar.setContentDescription(szVar.b);
        tzVar.requestLayout();
        boolean z10 = tzVar.n;
        sz szVar2 = tzVar.b;
        if (z10 != (szVar2 != null && szVar2.g)) {
            t5.release(tzVar, tzVar.r);
            t5.release(tzVar, tzVar.K);
            t5.release(tzVar, tzVar.M);
            t5.release(tzVar, tzVar.O);
            if (tzVar.h0) {
                tzVar.r = t5.update(tzVar.b.g ? 26 : 0, tzVar, tzVar.r, tzVar.s);
                tzVar.K = t5.update(tzVar.b.g ? 26 : 0, tzVar, tzVar.K, tzVar.L);
                tzVar.M = t5.update(tzVar.b.g ? 26 : 0, tzVar, tzVar.M, tzVar.N);
                tzVar.O = t5.update(tzVar.b.g ? 26 : 0, tzVar, tzVar.O, tzVar.P);
            }
            tzVar.n = tzVar.b.g;
        }
        if (id2 != tzVar.getId()) {
            tzVar.g0 = tzVar.b.f ? 1.0f : 0.0f;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new ik0(new tz(this.d, this.c));
    }
}
