package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt implements r0.n, org.telegram.ui.Components.ok0 {
    public final /* synthetic */ tt a;

    public /* synthetic */ gt(tt ttVar) {
        this.a = ttVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public void l(View view, yg.p0 p0Var, boolean z10, boolean z11) {
        if (p0Var == null) {
            return;
        }
        tt ttVar = this.a;
        yg.c0 reactionsWindow = ttVar.P.getReactionsWindow();
        if (!ttVar.o.contains(p0Var.f)) {
            ttVar.o.add(p0Var.f);
            if (ttVar.o.size() > 7) {
                ttVar.o.remove(0);
            }
        } else if (ttVar.o.size() <= 1) {
            return;
        } else {
            ttVar.o.remove(p0Var.f);
        }
        ttVar.P.setSelectedEmojis(ttVar.o);
        if (reactionsWindow != null) {
            yg.y yVar = reactionsWindow.m;
            ttVar.P.p(null, null, false);
            if (yVar != null) {
                yVar.setSelectedReactions(ttVar.o);
                yVar.setRecentReactions(ttVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
