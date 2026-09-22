package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ft implements r0.n, org.telegram.ui.Components.ek0 {
    public final /* synthetic */ st a;

    public /* synthetic */ ft(st stVar) {
        this.a = stVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        if (p0Var == null) {
            return;
        }
        st stVar = this.a;
        zg.c0 reactionsWindow = stVar.P.getReactionsWindow();
        if (!stVar.o.contains(p0Var.f)) {
            stVar.o.add(p0Var.f);
            if (stVar.o.size() > 7) {
                stVar.o.remove(0);
            }
        } else if (stVar.o.size() <= 1) {
            return;
        } else {
            stVar.o.remove(p0Var.f);
        }
        stVar.P.setSelectedEmojis(stVar.o);
        if (reactionsWindow != null) {
            zg.y yVar = reactionsWindow.m;
            stVar.P.p(null, null, false);
            if (yVar != null) {
                yVar.setSelectedReactions(stVar.o);
                yVar.setRecentReactions(stVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
