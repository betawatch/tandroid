package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sl extends TextView {
    public float a;
    public boolean b;
    public final /* synthetic */ Paint c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(Context context, Paint paint) {
        super(context);
        this.c = paint;
        this.a = 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i9 = (int) ((this.a * 130.0f) + 125.0f);
        Paint paint = this.c;
        paint.setAlpha(i9);
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
