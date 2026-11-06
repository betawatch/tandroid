package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public interface i3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z9);

    float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11);
}
