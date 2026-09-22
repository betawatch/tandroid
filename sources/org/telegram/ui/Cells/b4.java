package org.telegram.ui.Cells;

import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class b4 extends org.telegram.ui.Components.n5 {
    @Override // org.telegram.ui.Components.n5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(0.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
