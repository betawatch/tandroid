package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class zl extends TextView {
    public float a;
    public boolean b;
    public final /* synthetic */ Paint c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl(Context context, Paint paint) {
        super(context);
        this.c = paint;
        this.a = 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.a * 130.0f) + 125.0f);
        Paint paint = this.c;
        paint.setAlpha(i10);
        if (this.b) {
            float f10 = this.a + 0.026666667f;
            this.a = f10;
            if (f10 >= 1.0f) {
                this.a = 1.0f;
                this.b = false;
            }
        } else {
            float f11 = this.a - 0.026666667f;
            this.a = f11;
            if (f11 <= 0.0f) {
                this.a = 0.0f;
                this.b = true;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
