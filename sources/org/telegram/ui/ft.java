package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ft implements r0.n, org.telegram.ui.Components.pk0 {
    public final /* synthetic */ st a;

    public /* synthetic */ ft(st stVar) {
        this.a = stVar;
    }

    @Override // r0.n
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        return m1Var;
    }

    @Override // org.telegram.ui.Components.pk0
    public void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        if (o0Var == null) {
            return;
        }
        st stVar = this.a;
        zg.b0 reactionsWindow = stVar.P.getReactionsWindow();
        if (!stVar.o.contains(o0Var.f)) {
            stVar.o.add(o0Var.f);
            if (stVar.o.size() > 7) {
                stVar.o.remove(0);
            }
        } else if (stVar.o.size() <= 1) {
            return;
        } else {
            stVar.o.remove(o0Var.f);
        }
        stVar.P.setSelectedEmojis(stVar.o);
        if (reactionsWindow != null) {
            zg.x xVar = reactionsWindow.m;
            stVar.P.p(null, null, false);
            if (xVar != null) {
                xVar.setSelectedReactions(stVar.o);
                xVar.setRecentReactions(stVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ boolean r() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
