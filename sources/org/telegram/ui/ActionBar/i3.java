package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public interface i3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z9);

    float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11);
}
