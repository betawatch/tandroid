package bg;

import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r1 extends View {
    public TextPaint a;
    public int b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        TextPaint textPaint = this.a;
        canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, textPaint);
        zf.a1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(1.5f), zf.a1.d().e());
        canvas.drawText("+" + this.b, measuredWidth, (int) (measuredHeight - ((textPaint.ascent() + textPaint.descent()) / 2.0f)), textPaint);
    }
}
