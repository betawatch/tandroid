// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class mob extends View {
    public static final /* synthetic */ int c = 0;
    public final Paint a;
    public int[] b;

    public mob(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new int[7];
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        float L = hl.L(5.0f);
        float L2 = hl.L(20.0f) - L;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.a;
        paint.setStyle(style);
        int i = 0;
        paint.setColor(this.b[0]);
        canvas.drawCircle(measuredWidth, measuredHeight, L, paint);
        double d = 0.0d;
        while (i < 6) {
            float sin = (((float) Math.sin(d)) * L2) + measuredWidth;
            float cos = measuredHeight - (((float) Math.cos(d)) * L2);
            i++;
            paint.setColor(this.b[i]);
            canvas.drawCircle(sin, cos, L, paint);
            d += 1.0471975511965976d;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(ob6.M0(2131751980, "ColorPickerMainColor"));
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(62.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(62.0f), TLObject.FLAG_30));
    }
}
