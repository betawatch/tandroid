package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ct;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s extends LinearLayout {
    public static final /* synthetic */ int f = 0;
    public Paint a;
    public Paint b;
    public q c;
    public TextView d;
    public float e;

    public final void a(float f9) {
        this.e = f9;
        TextView textView = this.d;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false);
        int i10 = org.telegram.ui.ActionBar.g6.I6;
        textView.setTextColor(i0.a.d(f9, w02, org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        Paint paint = this.a;
        paint.setColor(i0.a.d(f9, i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.M6, false), 63), org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(AndroidUtilities.lerp(0.5f, 2.0f, f9))));
        invalidate();
    }

    public final void b(boolean z10, boolean z11) {
        float f9 = z10 ? 1.0f : 0.0f;
        float f10 = this.e;
        if (f9 == f10 && z11) {
            return;
        }
        if (!z11) {
            a(f9);
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f9).setDuration(250L);
        duration.setInterpolator(ct.e);
        duration.addUpdateListener(new r(this, 0));
        duration.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Paint paint = this.a;
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = AndroidUtilities.rectTmp;
        q qVar = this.c;
        rectF.set(qVar.getLeft() + strokeWidth, qVar.getTop() + strokeWidth, qVar.getRight() - strokeWidth, qVar.getBottom() - strokeWidth);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.b);
        super.draw(canvas);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
    }
}
