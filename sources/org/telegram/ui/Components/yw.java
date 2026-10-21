package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class yw extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ tz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(tz tzVar, Context context, boolean z10) {
        super(context);
        this.b = tzVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        tz tzVar = this.b;
        ex exVar = tzVar.B0;
        ax axVar = tzVar.D0;
        dx dxVar = tzVar.G0;
        if (this.a || !(view == axVar || view == dxVar)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y3 = exVar.getY() + exVar.getMeasuredHeight() + 1.0f;
        if (view == axVar) {
            y3 = Math.max(y3, dxVar.getY() + dxVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * tzVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tz tzVar = this.b;
        tzVar.K0 = true;
        tzVar.Y();
        hg.f1 f1Var = tzVar.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tz tzVar = this.b;
        tzVar.K0 = false;
        tzVar.Y();
        hg.f1 f1Var = tzVar.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }
}
