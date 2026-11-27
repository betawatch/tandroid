// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public interface ey0 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z);

    float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2);
}
