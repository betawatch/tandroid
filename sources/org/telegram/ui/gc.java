package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class gc extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ic f;

    public gc(ic icVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        this.f = icVar;
        this.c = context;
        this.d = f6Var;
        this.e = i7;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
    public final int b() {
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(this.e).q4;
        if (gpVar == null) {
            return 0;
        }
        return gpVar.c.size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        hc hcVar = (hc) d1Var.a;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, hcVar, this.d);
        boolean z9 = i7 == this.f.e;
        hcVar.s = z9;
        hcVar.w.f(z9, true);
        hcVar.invalidate();
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(this.e).q4;
        if (gpVar != null) {
            ArrayList arrayList = gpVar.c;
            if (i7 < 0 || i7 >= arrayList.size()) {
                return;
            }
            hcVar.a((org.telegram.messenger.fp) arrayList.get(i7));
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new org.telegram.ui.Components.xi0(new hc(this.f, this.c));
    }
}
