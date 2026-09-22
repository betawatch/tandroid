package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ft implements r0.n, org.telegram.ui.Components.rk0 {
    public final /* synthetic */ st a;

    public /* synthetic */ ft(st stVar) {
        this.a = stVar;
    }

    @Override // r0.n
    public r0.l1 P0(View view, r0.l1 l1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override // org.telegram.ui.Components.rk0
    public void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        if (p0Var == null) {
            return;
        }
        st stVar = this.a;
        zg.c0 reactionsWindow = stVar.P.getReactionsWindow();
        if (!stVar.o.contains(p0Var.f)) {
            stVar.o.add(p0Var.f);
            if (stVar.o.size() > 7) {
                stVar.o.remove(0);
            }
        } else if (stVar.o.size() <= 1) {
            return;
        } else {
            stVar.o.remove(p0Var.f);
        }
        stVar.P.setSelectedEmojis(stVar.o);
        if (reactionsWindow != null) {
            zg.y yVar = reactionsWindow.m;
            stVar.P.p(null, null, false);
            if (yVar != null) {
                yVar.setSelectedReactions(stVar.o);
                yVar.setRecentReactions(stVar.P.V);
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
    public /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.rk0
    public /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
