package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import ei.o8;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class t2 extends e3 {
    public final /* synthetic */ h3 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(h3 h3Var, Context context) {
        super(h3Var, context);
        this.H = h3Var;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.mainContainerDispatchDraw(canvas);
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
        qc.a(this, new o8(5));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        h3 h3Var = this.H;
        h3Var.lastInsets = null;
        h3Var.container.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
    }
}
