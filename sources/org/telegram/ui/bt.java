package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bt implements r0.o, org.telegram.ui.Components.ok0 {
    public final /* synthetic */ pt a;

    public /* synthetic */ bt(pt ptVar) {
        this.a = ptVar;
    }

    @Override // r0.o
    public r0.m1 N0(View view, r0.m1 m1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        return m1Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public void i(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        if (q0Var == null) {
            return;
        }
        pt ptVar = this.a;
        mg.d0 reactionsWindow = ptVar.P.getReactionsWindow();
        if (!ptVar.o.contains(q0Var.f)) {
            ptVar.o.add(q0Var.f);
            if (ptVar.o.size() > 7) {
                ptVar.o.remove(0);
            }
        } else if (ptVar.o.size() <= 1) {
            return;
        } else {
            ptVar.o.remove(q0Var.f);
        }
        ptVar.P.setSelectedEmojis(ptVar.o);
        if (reactionsWindow != null) {
            mg.z zVar = reactionsWindow.m;
            ptVar.P.p(null, null, false);
            if (zVar != null) {
                zVar.setSelectedReactions(ptVar.o);
                zVar.setRecentReactions(ptVar.P.S);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ void n(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
