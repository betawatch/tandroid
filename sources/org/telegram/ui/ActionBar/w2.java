package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import fi.k8;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class w2 extends h3 {
    public final /* synthetic */ k3 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(k3 k3Var, Context context) {
        super(k3Var, context);
        this.H = k3Var;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.mainContainerDispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.view.ViewGroup
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
        qc.a(this, new k8(5));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        k3 k3Var = this.H;
        k3Var.lastInsets = null;
        k3Var.container.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
    }
}
