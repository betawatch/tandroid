package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public interface i3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z9);

    float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11);
}
