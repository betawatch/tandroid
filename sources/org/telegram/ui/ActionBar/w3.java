package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public interface w3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z10);

    float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10);
}
