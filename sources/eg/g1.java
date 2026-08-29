package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g1 extends nh.d {
    public final RectF d0;
    public boolean e0;
    public float f0;
    public final org.telegram.ui.Components.voip.h g0;

    public g1(Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.d0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.g0 = hVar;
        hVar.n = 1.2f;
        hVar.k = false;
        hVar.m = 4.0f;
    }

    @Override // nh.d, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e0) {
            float f9 = this.f0 + 0.016f;
            this.f0 = f9;
            if (f9 > 3.0f) {
                this.e0 = false;
            }
        } else {
            float f10 = this.f0 - 0.016f;
            this.f0 = f10;
            if (f10 < 1.0f) {
                this.e0 = true;
            }
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.d0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        cg.s1.d().f((-getMeasuredWidth()) * 0.1f * this.f0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), cg.s1.d().e());
        int measuredWidth2 = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.g0;
        hVar.f = measuredWidth2;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
