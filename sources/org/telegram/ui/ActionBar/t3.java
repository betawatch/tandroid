package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public interface t3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z10);

    float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10);
}
