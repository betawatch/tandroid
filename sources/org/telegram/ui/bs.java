package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs implements r0.m, org.telegram.ui.Components.hi0 {
    public final /* synthetic */ ns a;

    public /* synthetic */ bs(ns nsVar) {
        this.a = nsVar;
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ boolean E() {
        return false;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        this.a.q = org.telegram.messenger.g0.I0(k1Var, false);
        return k1Var;
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ boolean U() {
        return false;
    }

    @Override // org.telegram.ui.Components.hi0
    public void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        if (o0Var == null) {
            return;
        }
        ns nsVar = this.a;
        ch.b0 reactionsWindow = nsVar.P.getReactionsWindow();
        if (!nsVar.o.contains(o0Var.f)) {
            nsVar.o.add(o0Var.f);
            if (nsVar.o.size() > 7) {
                nsVar.o.remove(0);
            }
        } else if (nsVar.o.size() <= 1) {
            return;
        } else {
            nsVar.o.remove(o0Var.f);
        }
        nsVar.P.setSelectedEmojis(nsVar.o);
        if (reactionsWindow != null) {
            ch.w wVar = reactionsWindow.m;
            nsVar.P.p(null, null, false);
            if (wVar != null) {
                wVar.setSelectedReactions(nsVar.o);
                wVar.setRecentReactions(nsVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ boolean v() {
        return true;
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
