package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class cx extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ wz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(wz wzVar, Context context, boolean z10) {
        super(context);
        this.b = wzVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wz wzVar = this.b;
        ix ixVar = wzVar.B0;
        ex exVar = wzVar.D0;
        hx hxVar = wzVar.G0;
        if (this.a || !(view == exVar || view == hxVar)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y3 = ixVar.getY() + ixVar.getMeasuredHeight() + 1.0f;
        if (view == exVar) {
            y3 = Math.max(y3, hxVar.getY() + hxVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * wzVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wz wzVar = this.b;
        wzVar.K0 = true;
        wzVar.Y();
        hg.f1 f1Var = wzVar.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wz wzVar = this.b;
        wzVar.K0 = false;
        wzVar.Y();
        hg.f1 f1Var = wzVar.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }
}
