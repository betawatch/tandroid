package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt implements r0.n, org.telegram.ui.Components.rk0 {
    public final /* synthetic */ rt a;

    public /* synthetic */ dt(rt rtVar) {
        this.a = rtVar;
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ boolean B() {
        return true;
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ boolean K() {
        return false;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override // org.telegram.ui.Components.rk0
    public void i(View view, zg.m0 m0Var, boolean z10, boolean z11) {
        if (m0Var == null) {
            return;
        }
        rt rtVar = this.a;
        zg.z reactionsWindow = rtVar.P.getReactionsWindow();
        if (!rtVar.o.contains(m0Var.f)) {
            rtVar.o.add(m0Var.f);
            if (rtVar.o.size() > 7) {
                rtVar.o.remove(0);
            }
        } else if (rtVar.o.size() <= 1) {
            return;
        } else {
            rtVar.o.remove(m0Var.f);
        }
        rtVar.P.setSelectedEmojis(rtVar.o);
        if (reactionsWindow != null) {
            zg.v vVar = reactionsWindow.m;
            rtVar.P.p(null, null, false);
            if (vVar != null) {
                vVar.setSelectedReactions(rtVar.o);
                vVar.setRecentReactions(rtVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ void I() {
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ void H(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
