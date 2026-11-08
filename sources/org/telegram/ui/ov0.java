package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ov0 extends ez {
    @Override // org.telegram.ui.ez, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(2.0f), 0.0f);
        super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
        canvas.restore();
    }
}
