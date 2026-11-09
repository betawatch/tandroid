package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class as implements r0.m, org.telegram.ui.Components.ii0 {
    public final /* synthetic */ ms a;

    public /* synthetic */ as(ms msVar) {
        this.a = msVar;
    }

    @Override // org.telegram.ui.Components.ii0
    public /* synthetic */ boolean E() {
        return false;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        this.a.q = org.telegram.messenger.g0.I0(k1Var, false);
        return k1Var;
    }

    @Override // org.telegram.ui.Components.ii0
    public /* synthetic */ boolean U() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii0
    public void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        if (o0Var == null) {
            return;
        }
        ms msVar = this.a;
        ch.b0 reactionsWindow = msVar.P.getReactionsWindow();
        if (!msVar.o.contains(o0Var.f)) {
            msVar.o.add(o0Var.f);
            if (msVar.o.size() > 7) {
                msVar.o.remove(0);
            }
        } else if (msVar.o.size() <= 1) {
            return;
        } else {
            msVar.o.remove(o0Var.f);
        }
        msVar.P.setSelectedEmojis(msVar.o);
        if (reactionsWindow != null) {
            ch.w wVar = reactionsWindow.m;
            msVar.P.p(null, null, false);
            if (wVar != null) {
                wVar.setSelectedReactions(msVar.o);
                wVar.setRecentReactions(msVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.ii0
    public /* synthetic */ boolean v() {
        return true;
    }

    @Override // org.telegram.ui.Components.ii0
    public /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Components.ii0
    public /* synthetic */ void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
