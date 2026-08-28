package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class y6 extends View {
    public final String a;
    public final String b;
    public final mi0 c;
    public final Paint d;
    public final TextPaint e;
    public final TextPaint f;
    public final RectF h;
    public float n;
    public final Rect r;

    public y6(Context context, int i9, String str, String str2) {
        super(context);
        this.r = new Rect();
        this.a = str;
        this.b = str2;
        mi0 mi0Var = new mi0(i9, j3.r0.l(i9, ""), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), true, null);
        this.c = mi0Var;
        mi0Var.I(1);
        mi0Var.r0 = this;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int dp = AndroidUtilities.dp(40.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        int dp2 = (int) ((AndroidUtilities.dp(8.0f) * this.n) + AndroidUtilities.dp(36.0f));
        int i9 = dp2 / 2;
        int i10 = dp - i9;
        int i11 = measuredHeight - i9;
        mi0 mi0Var = this.c;
        mi0Var.setBounds(i10, i11, i10 + dp2, dp2 + i11);
        mi0Var.draw(canvas);
        if (this.n > 0.0f) {
            float dpf2 = (1.0f - this.n) * AndroidUtilities.dpf2(4.0f);
            float f10 = dpf2 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f10;
            float measuredHeight2 = getMeasuredHeight() - f10;
            RectF rectF = this.h;
            rectF.set(dpf2, dpf2, measuredWidth, measuredHeight2);
            int i12 = (int) (this.n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i12);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
            canvas.save();
            float f11 = this.n;
            canvas.scale((f11 * 0.05f) + 1.0f, (f11 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.a, AndroidUtilities.dpf2(80.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dpf2(4.0f), this.e);
        canvas.drawText(this.b, AndroidUtilities.dpf2(80.0f), AndroidUtilities.dpf2(18.0f) + (getMeasuredHeight() / 2.0f), this.f);
        if (this.n > 0.0f) {
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int dp = AndroidUtilities.dp(40.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        int dp2 = AndroidUtilities.dp(36.0f);
        int i11 = dp2 / 2;
        int i12 = dp - i11;
        int i13 = measuredHeight - i11;
        this.c.setBounds(i12, i13, i12 + dp2, dp2 + i13);
    }
}
