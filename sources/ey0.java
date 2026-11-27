// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public interface ey0 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z);

    float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2);
}
