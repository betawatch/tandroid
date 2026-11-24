// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.TypedValue;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class dg5 extends EditTextBoldCursor {
    public final TextPaint M1;
    public String N1;
    public final Rect O1;

    public dg5(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.M1 = textPaint;
        this.O1 = new Rect();
        textPaint.setColor(cmb.w0(null, cmb.G6, false));
    }

    public String getHintText() {
        return this.N1;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.N1 != null && length() < this.N1.length()) {
            int i = 0;
            float f = 0.0f;
            while (i < this.N1.length()) {
                int length = length();
                TextPaint textPaint = this.M1;
                float measureText = i < length ? getPaint().measureText(getText(), i, i + 1) : textPaint.measureText(this.N1, i, i + 1);
                if (i < length()) {
                    f += measureText;
                    canvas2 = canvas;
                } else {
                    int color = textPaint.getColor();
                    canvas.save();
                    String str = this.N1;
                    textPaint.getTextBounds(str, 0, str.length(), this.O1);
                    A(i);
                    canvas2 = canvas;
                    canvas2.drawText(this.N1, i, i + 1, f, (r5.height() + getHeight()) / 2.0f, (Paint) textPaint);
                    f += measureText;
                    canvas2.restore();
                    textPaint.setColor(color);
                }
                i++;
                canvas = canvas2;
            }
        }
        super.onDraw(canvas);
    }

    @Override // vu3, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        invalidate();
    }

    public void setHintText(String str) {
        this.N1 = str;
        invalidate();
        setText(getText());
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.M1.setTextSize(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
    }

    public void A(int i) {
    }
}
