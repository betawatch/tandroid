package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mu extends View {
    public Path a;
    public Paint b;
    public boolean c;

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.a, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(13.0f), TLObject.FLAG_30));
        setTop(this.c);
    }

    public void setTop(boolean z10) {
        Path path = this.a;
        path.rewind();
        this.c = z10;
        if (!z10) {
            float dp = AndroidUtilities.dp(8.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, ((-getMeasuredHeight()) * 2) - AndroidUtilities.dp(4.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(4.0f));
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            return;
        }
        float dp2 = AndroidUtilities.dp(14.0f);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, AndroidUtilities.dp(4.0f), getMeasuredWidth(), (getMeasuredHeight() * 2) + AndroidUtilities.dp(4.0f));
        path.addRoundRect(rectF2, dp2, dp2, Path.Direction.CW);
    }
}
