package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q71 extends View {
    public static final /* synthetic */ int c = 0;
    public final Paint a;
    public int[] b;

    public q71(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new int[7];
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        float L = org.telegram.messenger.i0.L(5.0f);
        float L2 = org.telegram.messenger.i0.L(20.0f) - L;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.a;
        paint.setStyle(style);
        int i10 = 0;
        paint.setColor(this.b[0]);
        canvas.drawCircle(measuredWidth, measuredHeight, L, paint);
        double d = 0.0d;
        while (i10 < 6) {
            float sin = (((float) Math.sin(d)) * L2) + measuredWidth;
            float cos = measuredHeight - (((float) Math.cos(d)) * L2);
            i10++;
            paint.setColor(this.b[i10]);
            canvas.drawCircle(sin, cos, L, paint);
            d += 1.0471975511965976d;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(org.telegram.messenger.cd.L0(2131752015, "ColorPickerMainColor"));
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(62.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(62.0f), TLObject.FLAG_30));
    }
}
