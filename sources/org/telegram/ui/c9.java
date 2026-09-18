package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class c9 extends TextView {
    public final Paint a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.b = f6Var;
        this.a = new Paint(1);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.8f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, this.b));
        Paint paint = this.a;
        paint.setColor(l1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        Layout layout = getLayout();
        int i10 = 0;
        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
            i10 = Math.max(i10, (int) layout.getLineWidth(i11));
        }
        float f7 = i10 / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f7) - AndroidUtilities.dp(8.0f), height, paint);
        canvas.drawLine((getWidth() / 2.0f) + f7 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
