package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pa1 extends View {
    public static final /* synthetic */ int c = 0;
    public final Paint a;
    public int[] b;

    public pa1(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new int[7];
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = AndroidUtilities.dp(20.0f) - dp;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.a;
        paint.setStyle(style);
        int i9 = 0;
        paint.setColor(this.b[0]);
        canvas.drawCircle(measuredWidth, measuredHeight, dp, paint);
        double d = 0.0d;
        while (i9 < 6) {
            float sin = (((float) Math.sin(d)) * dp2) + measuredWidth;
            float cos = measuredHeight - (((float) Math.cos(d)) * dp2);
            i9++;
            paint.setColor(this.b[i9]);
            canvas.drawCircle(sin, cos, dp, paint);
            d += 1.0471975511965976d;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", R.string.ColorPickerMainColor));
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), TLObject.FLAG_30));
    }
}
