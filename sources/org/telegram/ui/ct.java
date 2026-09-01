package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ct implements r0.o, org.telegram.ui.Components.qk0 {
    public final /* synthetic */ qt a;

    public /* synthetic */ ct(qt qtVar) {
        this.a = qtVar;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        return m1Var;
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.qk0
    public void o(View view, ng.q0 q0Var, boolean z4, boolean z10) {
        if (q0Var == null) {
            return;
        }
        qt qtVar = this.a;
        ng.d0 reactionsWindow = qtVar.P.getReactionsWindow();
        if (!qtVar.o.contains(q0Var.f)) {
            qtVar.o.add(q0Var.f);
            if (qtVar.o.size() > 7) {
                qtVar.o.remove(0);
            }
        } else if (qtVar.o.size() <= 1) {
            return;
        } else {
            qtVar.o.remove(q0Var.f);
        }
        qtVar.P.setSelectedEmojis(qtVar.o);
        if (reactionsWindow != null) {
            ng.z zVar = reactionsWindow.m;
            qtVar.P.p(null, null, false);
            if (zVar != null) {
                zVar.setSelectedReactions(qtVar.o);
                zVar.setRecentReactions(qtVar.P.S);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
