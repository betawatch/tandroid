package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt implements r0.n, org.telegram.ui.Components.rk0 {
    public final /* synthetic */ rt a;

    public /* synthetic */ dt(rt rtVar) {
        this.a = rtVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override // org.telegram.ui.Components.rk0
    public void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        if (o0Var == null) {
            return;
        }
        rt rtVar = this.a;
        zg.b0 reactionsWindow = rtVar.P.getReactionsWindow();
        if (!rtVar.o.contains(o0Var.f)) {
            rtVar.o.add(o0Var.f);
            if (rtVar.o.size() > 7) {
                rtVar.o.remove(0);
            }
        } else if (rtVar.o.size() <= 1) {
            return;
        } else {
            rtVar.o.remove(o0Var.f);
        }
        rtVar.P.setSelectedEmojis(rtVar.o);
        if (reactionsWindow != null) {
            zg.x xVar = reactionsWindow.m;
            rtVar.P.p(null, null, false);
            if (xVar != null) {
                xVar.setSelectedReactions(rtVar.o);
                xVar.setRecentReactions(rtVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
