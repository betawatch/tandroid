package org.telegram.ui;

import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fy extends org.telegram.ui.Components.k5 {
    @Override // org.telegram.ui.Components.k5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
