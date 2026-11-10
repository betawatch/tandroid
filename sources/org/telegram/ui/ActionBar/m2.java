package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import fi.r7;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m2 extends t2 {
    public final /* synthetic */ w2 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(w2 w2Var, Context context) {
        super(w2Var, context);
        this.H = w2Var;
    }

    @Override // org.telegram.ui.ActionBar.t2, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.Z(canvas);
    }

    @Override // org.telegram.ui.ActionBar.t2, android.view.ViewGroup
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
        setTag(R.id.bulletin_delegate_tag, new r7(6));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        w2 w2Var = this.H;
        w2Var.h = null;
        w2Var.c.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }
}
