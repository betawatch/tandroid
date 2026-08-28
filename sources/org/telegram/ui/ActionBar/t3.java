package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public interface t3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z10);

    float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11);
}
