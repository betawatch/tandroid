package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs implements r0.m, org.telegram.ui.Components.li0 {
    public final /* synthetic */ ns a;

    public /* synthetic */ bs(ns nsVar) {
        this.a = nsVar;
    }

    @Override // org.telegram.ui.Components.li0
    public /* synthetic */ boolean B() {
        return false;
    }

    @Override // org.telegram.ui.Components.li0
    public /* synthetic */ boolean L() {
        return false;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        this.a.q = org.telegram.messenger.g0.I0(k1Var, false);
        return k1Var;
    }

    @Override // org.telegram.ui.Components.li0
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

    @Override // org.telegram.ui.Components.li0
    public /* synthetic */ boolean r() {
        return true;
    }

    @Override // org.telegram.ui.Components.li0
    public /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.Components.li0
    public /* synthetic */ void J(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
