package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.View;
import fi.r7;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class l2 extends s2 {
    public final /* synthetic */ v2 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(v2 v2Var, Context context) {
        super(v2Var, context);
        this.H = v2Var;
    }

    @Override // org.telegram.ui.ActionBar.s2, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.Z(canvas);
    }

    @Override // org.telegram.ui.ActionBar.s2, android.view.ViewGroup
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
        v2 v2Var = this.H;
        v2Var.h = null;
        v2Var.c.requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }
}
