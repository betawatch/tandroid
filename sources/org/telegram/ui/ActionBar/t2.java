package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import ci.d9;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t2 extends e3 {
    public final /* synthetic */ g3 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(g3 g3Var, Context context) {
        super(g3Var, context);
        this.H = g3Var;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.mainContainerDispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        try {
            return super.drawChild(canvas, view, j3);
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        oc.a(this, new d9(5));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        g3 g3Var = this.H;
        g3Var.lastInsets = null;
        g3Var.container.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oc.h(this);
    }
}
