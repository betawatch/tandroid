package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public interface j3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z9);

    float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11);
}
