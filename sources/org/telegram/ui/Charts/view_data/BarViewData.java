package org.telegram.ui.Charts.view_data;

import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.data.ChartData;
/* loaded from: classes4.dex */
public class BarViewData extends LineViewData {
    public int blendColor;
    private Theme.ResourcesProvider resourcesProvider;
    public final Paint unselectedPaint;

    public BarViewData(ChartData.Line line, Theme.ResourcesProvider resourcesProvider) {
        super(line, false);
        Paint paint = new Paint();
        this.unselectedPaint = paint;
        this.blendColor = 0;
        this.resourcesProvider = resourcesProvider;
        this.paint.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.STROKE);
        this.paint.setAntiAlias(false);
    }

    @Override // org.telegram.ui.Charts.view_data.LineViewData
    public void updateColors() {
        super.updateColors();
        this.blendColor = ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider), this.lineColor, 0.3f);
    }
}
