package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class bt implements r0.n, org.telegram.ui.Components.fk0 {
    public final /* synthetic */ pt a;

    public /* synthetic */ bt(pt ptVar) {
        this.a = ptVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override // org.telegram.ui.Components.fk0
    public void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        if (p0Var == null) {
            return;
        }
        pt ptVar = this.a;
        zg.c0 reactionsWindow = ptVar.P.getReactionsWindow();
        if (!ptVar.o.contains(p0Var.f)) {
            ptVar.o.add(p0Var.f);
            if (ptVar.o.size() > 7) {
                ptVar.o.remove(0);
            }
        } else if (ptVar.o.size() <= 1) {
            return;
        } else {
            ptVar.o.remove(p0Var.f);
        }
        ptVar.P.setSelectedEmojis(ptVar.o);
        if (reactionsWindow != null) {
            zg.y yVar = reactionsWindow.m;
            ptVar.P.p(null, null, false);
            if (yVar != null) {
                yVar.setSelectedReactions(ptVar.o);
                yVar.setRecentReactions(ptVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.fk0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.fk0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.fk0
    public /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.fk0
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.fk0
    public /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
