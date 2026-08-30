package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hs extends View {
    public final xd.a a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final vp f;

    public hs(Context context) {
        super(context);
        this.a = new xd.a(this, nr.h, 380L);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new vp(this, 5);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false));
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f, 3000L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10 = this.a.e;
        RectF rectF = this.d;
        RectF rectF2 = this.c;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), 0, f10);
        canvas.drawRoundRect(rectF3, lerp, lerp, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, TLObject.FLAG_30));
        this.c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        this.d.set(AndroidUtilities.dp(12.0f), ((currentActionBarHeight / 2) + paddingTop) - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(30.0f) + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(30.0f) + r6);
    }
}
