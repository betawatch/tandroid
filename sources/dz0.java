// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public interface dz0 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z);

    float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2);
}
