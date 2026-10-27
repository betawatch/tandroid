package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public interface z3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z10);

    float y(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10);
}
