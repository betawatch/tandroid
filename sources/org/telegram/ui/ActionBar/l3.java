package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public interface l3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z10);

    float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11);
}
