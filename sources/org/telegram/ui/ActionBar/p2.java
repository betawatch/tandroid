package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p2 extends w2 {
    public final /* synthetic */ z2 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(z2 z2Var, Context context) {
        super(z2Var, context);
        this.H = z2Var;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.Z(canvas);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        try {
            return super.drawChild(canvas, view, j10);
        } catch (Exception e) {
            f8.g(e, true);
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new mg.u(3));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        z2 z2Var = this.H;
        z2Var.h = null;
        z2Var.c.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }
}
