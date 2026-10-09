package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt implements r0.n, org.telegram.ui.Components.jl0 {
    public final /* synthetic */ rt a;

    public /* synthetic */ dt(rt rtVar) {
        this.a = rtVar;
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        return k1Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        if (n0Var == null) {
            return;
        }
        rt rtVar = this.a;
        zg.a0 reactionsWindow = rtVar.P.getReactionsWindow();
        if (!rtVar.o.contains(n0Var.f)) {
            rtVar.o.add(n0Var.f);
            if (rtVar.o.size() > 7) {
                rtVar.o.remove(0);
            }
        } else if (rtVar.o.size() <= 1) {
            return;
        } else {
            rtVar.o.remove(n0Var.f);
        }
        rtVar.P.setSelectedEmojis(rtVar.o);
        if (reactionsWindow != null) {
            zg.w wVar = reactionsWindow.m;
            rtVar.P.p(null, null, false);
            if (wVar != null) {
                wVar.setSelectedReactions(rtVar.o);
                wVar.setRecentReactions(rtVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean o() {
        return true;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
