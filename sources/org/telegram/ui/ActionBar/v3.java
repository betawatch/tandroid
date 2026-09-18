package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public interface v3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z10);

    float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10);
}
