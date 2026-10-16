package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class j01 extends i10 {
    @Override // org.telegram.ui.i10, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        canvas.save();
        canvas.translate(AndroidUtilities.dp(2.0f), 0.0f);
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
        canvas.restore();
    }
}
