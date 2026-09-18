package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ht implements r0.n, org.telegram.ui.Components.fk0 {
    public final /* synthetic */ ut a;

    public /* synthetic */ ht(ut utVar) {
        this.a = utVar;
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
        ut utVar = this.a;
        zg.c0 reactionsWindow = utVar.P.getReactionsWindow();
        if (!utVar.o.contains(p0Var.f)) {
            utVar.o.add(p0Var.f);
            if (utVar.o.size() > 7) {
                utVar.o.remove(0);
            }
        } else if (utVar.o.size() <= 1) {
            return;
        } else {
            utVar.o.remove(p0Var.f);
        }
        utVar.P.setSelectedEmojis(utVar.o);
        if (reactionsWindow != null) {
            zg.y yVar = reactionsWindow.m;
            utVar.P.p(null, null, false);
            if (yVar != null) {
                yVar.setSelectedReactions(utVar.o);
                yVar.setRecentReactions(utVar.P.V);
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
