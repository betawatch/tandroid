package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public interface h3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z10);

    float y(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11);
}
