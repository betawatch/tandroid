package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public interface t3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z10);

    float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10);
}
