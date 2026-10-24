package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class mu extends View implements org.telegram.ui.ActionBar.b6 {
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(13.0f), TLObject.FLAG_30));
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.b.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
