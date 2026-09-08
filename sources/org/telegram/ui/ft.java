package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ft implements r0.n, org.telegram.ui.Components.ek0 {
    public final /* synthetic */ st a;

    public /* synthetic */ ft(st stVar) {
        this.a = stVar;
    }

    @Override // org.telegram.ui.Components.ek0
    public void B(View view, ah.j1 j1Var, boolean z10, boolean z11) {
        if (j1Var == null) {
            return;
        }
        st stVar = this.a;
        ah.u0 reactionsWindow = stVar.P.getReactionsWindow();
        if (!stVar.o.contains(j1Var.f)) {
            stVar.o.add(j1Var.f);
            if (stVar.o.size() > 7) {
                stVar.o.remove(0);
            }
        } else if (stVar.o.size() <= 1) {
            return;
        } else {
            stVar.o.remove(j1Var.f);
        }
        stVar.P.setSelectedEmojis(stVar.o);
        if (reactionsWindow != null) {
            ah.o0 o0Var = reactionsWindow.m;
            stVar.P.p(null, null, false);
            if (o0Var != null) {
                o0Var.setSelectedReactions(stVar.o);
                o0Var.setRecentReactions(stVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean n() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
