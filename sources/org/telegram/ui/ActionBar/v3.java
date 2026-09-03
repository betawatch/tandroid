package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public interface v3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z4);

    float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11);
}
