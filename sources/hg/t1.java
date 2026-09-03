package hg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t1 extends View {
    public Paint a;
    public Drawable b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, this.a);
        fg.q1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), fg.q1.d().e());
        float dp = AndroidUtilities.dp(18.0f) / 2.0f;
        Drawable drawable = this.b;
        drawable.setBounds((int) (measuredWidth - dp), (int) (measuredHeight - dp), (int) (measuredWidth + dp), (int) (measuredHeight + dp));
        drawable.draw(canvas);
    }
}
