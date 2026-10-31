package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a9 extends TextView {
    public final Paint a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.b = p6Var;
        this.a = new Paint(1);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.8f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, this.b));
        Paint paint = this.a;
        paint.setColor(r12);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        Layout layout = getLayout();
        int i10 = 0;
        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
            i10 = Math.max(i10, (int) layout.getLineWidth(i11));
        }
        float f7 = i10 / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f7) - org.telegram.messenger.i0.L(8.0f), height, paint);
        canvas.drawLine((getWidth() / 2.0f) + f7 + org.telegram.messenger.i0.L(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
