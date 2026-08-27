package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ec;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r2 extends c3 {
    public final /* synthetic */ e3 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(e3 e3Var, Context context) {
        super(e3Var, context);
        this.D = e3Var;
    }

    @Override // org.telegram.ui.ActionBar.c3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.D.mainContainerDispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.c3, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        try {
            return super.drawChild(canvas, view, j10);
        } catch (Exception e9) {
            FileLog.e(e9);
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ec.a(this, new cg.w(9));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        e3 e3Var = this.D;
        e3Var.lastInsets = null;
        e3Var.container.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ec.h(this);
    }
}
