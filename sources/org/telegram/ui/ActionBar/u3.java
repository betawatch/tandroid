package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public interface u3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z10);

    float y(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10);
}
