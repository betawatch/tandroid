package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kt implements r0.n, org.telegram.ui.Components.fl0 {
    public final /* synthetic */ xt a;

    public /* synthetic */ kt(xt xtVar) {
        this.a = xtVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public void n(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        if (i1Var == null) {
            return;
        }
        xt xtVar = this.a;
        ah.t0 reactionsWindow = xtVar.P.getReactionsWindow();
        if (!xtVar.o.contains(i1Var.f)) {
            xtVar.o.add(i1Var.f);
            if (xtVar.o.size() > 7) {
                xtVar.o.remove(0);
            }
        } else if (xtVar.o.size() <= 1) {
            return;
        } else {
            xtVar.o.remove(i1Var.f);
        }
        xtVar.P.setSelectedEmojis(xtVar.o);
        if (reactionsWindow != null) {
            ah.n0 n0Var = reactionsWindow.m;
            xtVar.P.p(null, null, false);
            if (n0Var != null) {
                n0Var.setSelectedReactions(xtVar.o);
                n0Var.setRecentReactions(xtVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean z() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ void y() {
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
