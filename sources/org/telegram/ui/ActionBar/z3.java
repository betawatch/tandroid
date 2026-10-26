package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public interface z3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z10);

    float y(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10);
}
