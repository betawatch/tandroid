package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f1 extends qh.d {
    public final RectF e0;
    public boolean f0;
    public float g0;
    public final org.telegram.ui.Components.voip.h h0;

    public f1(Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.e0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.h0 = hVar;
        hVar.n = 1.2f;
        hVar.k = false;
        hVar.m = 4.0f;
    }

    @Override // qh.d, android.view.View
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
        fg.q1.d().f((-getMeasuredWidth()) * 0.1f * this.g0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), fg.q1.d().e());
        int measuredWidth2 = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.h0;
        hVar.f = measuredWidth2;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
