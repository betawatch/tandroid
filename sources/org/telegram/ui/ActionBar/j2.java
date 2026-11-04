package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j2 extends q2 {
    public final /* synthetic */ t2 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(t2 t2Var, Context context) {
        super(t2Var, context);
        this.I = t2Var;
    }

    @Override // org.telegram.ui.ActionBar.q2, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.I.Z(canvas);
    }

    @Override // org.telegram.ui.ActionBar.q2, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        try {
            return super.drawChild(canvas, view, j10);
        } catch (Exception e10) {
            a8.g(e10, true);
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new ai.y(7));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        t2 t2Var = this.I;
        t2Var.h = null;
        t2Var.c.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }
}
