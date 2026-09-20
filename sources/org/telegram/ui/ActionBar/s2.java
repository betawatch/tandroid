package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import ci.d9;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.pc;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class s2 extends d3 {
    public final /* synthetic */ f3 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(f3 f3Var, Context context) {
        super(f3Var, context);
        this.H = f3Var;
    }

    @Override // org.telegram.ui.ActionBar.d3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.mainContainerDispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.d3, android.view.ViewGroup
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
        pc.a(this, new d9(5));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        f3 f3Var = this.H;
        f3Var.lastInsets = null;
        f3Var.container.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pc.h(this);
    }
}
