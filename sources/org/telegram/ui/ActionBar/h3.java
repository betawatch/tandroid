package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public interface h3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z10);

    float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11);
}
