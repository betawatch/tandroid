package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class t2 extends e3 {
    public final /* synthetic */ g3 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(g3 g3Var, Context context) {
        super(g3Var, context);
        this.E = g3Var;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.E.mainContainerDispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        try {
            return super.drawChild(canvas, view, j10);
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ic.a(this, new gg.w(4));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        g3 g3Var = this.E;
        g3Var.lastInsets = null;
        g3Var.container.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this);
    }
}
