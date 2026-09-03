package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public interface u3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z4);

    float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11);
}
