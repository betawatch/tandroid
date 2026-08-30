package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f1 extends ph.d {
    public final RectF e0;
    public boolean f0;
    public float g0;
    public final org.telegram.ui.Components.voip.h h0;

    public f1(Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.e0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.h0 = hVar;
        hVar.n = 1.2f;
        hVar.k = false;
        hVar.m = 4.0f;
    }

    @Override // ph.d, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f0) {
            float f10 = this.g0 + 0.016f;
            this.g0 = f10;
            if (f10 > 3.0f) {
                this.f0 = false;
            }
        } else {
            float f11 = this.g0 - 0.016f;
            this.g0 = f11;
            if (f11 < 1.0f) {
                this.f0 = true;
            }
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.e0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        eg.r1.d().f((-getMeasuredWidth()) * 0.1f * this.g0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), eg.r1.d().e());
        int measuredWidth2 = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.h0;
        hVar.f = measuredWidth2;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
