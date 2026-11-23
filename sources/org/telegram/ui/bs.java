package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs implements r0.m, org.telegram.ui.Components.wi0 {
    public final /* synthetic */ ns a;

    public /* synthetic */ bs(ns nsVar) {
        this.a = nsVar;
    }

    @Override // org.telegram.ui.Components.wi0
    public void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
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

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ boolean l() {
        return true;
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        this.a.q = org.telegram.messenger.g0.I0(l1Var, false);
        return l1Var;
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ boolean n() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ void q(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
