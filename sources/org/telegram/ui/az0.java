package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class az0 extends l00 {
    @Override // org.telegram.ui.l00, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        canvas.save();
        canvas.translate(AndroidUtilities.dp(2.0f), 0.0f);
        super.draw(canvas, charSequence, i9, i10, f10, i11, i12, i13, paint);
        canvas.restore();
    }
}
