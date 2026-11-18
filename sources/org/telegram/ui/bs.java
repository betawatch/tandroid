package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs implements r0.m, org.telegram.ui.Components.ui0 {
    public final /* synthetic */ ns a;

    public /* synthetic */ bs(ns nsVar) {
        this.a = nsVar;
    }

    @Override // org.telegram.ui.Components.ui0
    public /* synthetic */ boolean E() {
        return false;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        this.a.q = org.telegram.messenger.g0.I0(l1Var, false);
        return l1Var;
    }

    @Override // org.telegram.ui.Components.ui0
    public void g(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        if (p0Var == null) {
            return;
        }
        ns nsVar = this.a;
        ch.b0 reactionsWindow = nsVar.P.getReactionsWindow();
        if (!nsVar.o.contains(p0Var.f)) {
            nsVar.o.add(p0Var.f);
            if (nsVar.o.size() > 7) {
                nsVar.o.remove(0);
            }
        } else if (nsVar.o.size() <= 1) {
            return;
        } else {
            nsVar.o.remove(p0Var.f);
        }
        nsVar.P.setSelectedEmojis(nsVar.o);
        if (reactionsWindow != null) {
            ch.x xVar = reactionsWindow.m;
            nsVar.P.p(null, null, false);
            if (xVar != null) {
                xVar.setSelectedReactions(nsVar.o);
                xVar.setRecentReactions(nsVar.P.W);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.ui0
    public /* synthetic */ boolean o() {
        return true;
    }

    @Override // org.telegram.ui.Components.ui0
    public /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ui0
    public /* synthetic */ void z() {
    }

    @Override // org.telegram.ui.Components.ui0
    public /* synthetic */ void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
