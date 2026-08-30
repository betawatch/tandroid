package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nw extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ kz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(kz kzVar, Context context, boolean z4) {
        super(context);
        this.b = kzVar;
        this.a = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        kz kzVar = this.b;
        tw twVar = kzVar.y0;
        pw pwVar = kzVar.A0;
        sw swVar = kzVar.D0;
        if (this.a || !(view == pwVar || view == swVar)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y10 = twVar.getY() + twVar.getMeasuredHeight() + 1.0f;
        if (view == pwVar) {
            y10 = Math.max(y10, swVar.getY() + swVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * kzVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kz kzVar = this.b;
        kzVar.H0 = true;
        kzVar.a0();
        zw zwVar = kzVar.Q0;
        if (zwVar != null) {
            zwVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kz kzVar = this.b;
        kzVar.H0 = false;
        kzVar.a0();
        zw zwVar = kzVar.Q0;
        if (zwVar != null) {
            zwVar.a();
        }
    }
}
