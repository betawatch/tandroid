package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import di.z8;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.sc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class r2 extends c3 {
    public final /* synthetic */ e3 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(e3 e3Var, Context context) {
        super(e3Var, context);
        this.H = e3Var;
    }

    @Override // org.telegram.ui.ActionBar.c3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.mainContainerDispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.c3, android.view.ViewGroup
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
        sc.a(this, new z8(5));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        e3 e3Var = this.H;
        e3Var.lastInsets = null;
        e3Var.container.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sc.h(this);
    }
}
