package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class u2 extends f3 {
    public final /* synthetic */ h3 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(h3 h3Var, Context context) {
        super(h3Var, context);
        this.E = h3Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.E.mainContainerDispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        try {
            return super.drawChild(canvas, view, j10);
        } catch (Exception e6) {
            FileLog.e(e6);
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ic.a(this, new hg.w(4));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        h3 h3Var = this.E;
        h3Var.lastInsets = null;
        h3Var.container.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this);
    }
}
