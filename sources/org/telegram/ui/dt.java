package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt implements r0.o, org.telegram.ui.Components.ok0 {
    public final /* synthetic */ rt a;

    public /* synthetic */ dt(rt rtVar) {
        this.a = rtVar;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        return m1Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public void j(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        if (q0Var == null) {
            return;
        }
        rt rtVar = this.a;
        mg.d0 reactionsWindow = rtVar.P.getReactionsWindow();
        if (!rtVar.o.contains(q0Var.f)) {
            rtVar.o.add(q0Var.f);
            if (rtVar.o.size() > 7) {
                rtVar.o.remove(0);
            }
        } else if (rtVar.o.size() <= 1) {
            return;
        } else {
            rtVar.o.remove(q0Var.f);
        }
        rtVar.P.setSelectedEmojis(rtVar.o);
        if (reactionsWindow != null) {
            mg.z zVar = reactionsWindow.m;
            rtVar.P.p(null, null, false);
            if (zVar != null) {
                zVar.setSelectedReactions(rtVar.o);
                zVar.setRecentReactions(rtVar.P.S);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ void l(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
