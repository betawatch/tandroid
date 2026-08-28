package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m1 extends kh.d {
    public final RectF d0;
    public boolean e0;
    public float f0;
    public final org.telegram.ui.Components.voip.h g0;

    public m1(Context context, b6 b6Var) {
        super(context, b6Var, true);
        this.d0 = new RectF();
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.g0 = hVar;
        hVar.n = 1.2f;
        hVar.k = false;
        hVar.m = 4.0f;
    }

    @Override // kh.d, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e0) {
            float f10 = this.f0 + 0.016f;
            this.f0 = f10;
            if (f10 > 3.0f) {
                this.e0 = false;
            }
        } else {
            float f11 = this.f0 - 0.016f;
            this.f0 = f11;
            if (f11 < 1.0f) {
                this.e0 = true;
            }
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.d0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        zf.a1.d().f((-getMeasuredWidth()) * 0.1f * this.f0, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), zf.a1.d().e());
        int measuredWidth2 = getMeasuredWidth();
        org.telegram.ui.Components.voip.h hVar = this.g0;
        hVar.f = measuredWidth2;
        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
