package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public interface u3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z10);

    float z(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10);
}
