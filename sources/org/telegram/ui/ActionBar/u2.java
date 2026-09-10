package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import bi.fa;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.pc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class u2 extends f3 {
    public final /* synthetic */ h3 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(h3 h3Var, Context context) {
        super(h3Var, context);
        this.H = h3Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.mainContainerDispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.view.ViewGroup
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
        pc.a(this, new fa(5));
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
        pc.h(this);
    }
}
