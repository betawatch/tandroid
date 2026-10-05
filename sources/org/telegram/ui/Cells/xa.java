package org.telegram.ui.Cells;

import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class xa extends org.telegram.ui.Components.p5 {
    @Override // org.telegram.ui.Components.p5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
