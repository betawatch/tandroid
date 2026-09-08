package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class e01 extends d10 {
    @Override // org.telegram.ui.d10, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        canvas.save();
        canvas.translate(AndroidUtilities.dp(2.0f), 0.0f);
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
        canvas.restore();
    }
}
