package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public interface u3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z4);

    float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11);
}
