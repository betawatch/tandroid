package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public interface i3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z9);

    float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11);
}
