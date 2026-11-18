package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class n2 extends u2 {
    public final /* synthetic */ x2 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(x2 x2Var, Context context) {
        super(x2Var, context);
        this.I = x2Var;
    }

    @Override // org.telegram.ui.ActionBar.u2, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.I.Z(canvas);
    }

    @Override // org.telegram.ui.ActionBar.u2, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        try {
            return super.drawChild(canvas, view, j3);
        } catch (Exception e10) {
            a8.g(e10, true);
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new bi.t(7));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        x2 x2Var = this.I;
        x2Var.h = null;
        x2Var.c.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }
}
