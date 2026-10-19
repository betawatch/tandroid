package org.telegram.ui.Cells;

import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ta extends org.telegram.ui.Components.q5 {
    @Override // org.telegram.ui.Components.q5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
