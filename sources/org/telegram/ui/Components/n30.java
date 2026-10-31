package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.TypedValue;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class n30 extends EditTextBoldCursor {
    public final TextPaint G1;
    public String H1;
    public final Rect I1;

    public n30(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.G1 = textPaint;
        this.I1 = new Rect();
        textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.H6, false));
    }

    public String getHintText() {
        return this.H1;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.H1 != null && length() < this.H1.length()) {
            int i10 = 0;
            float f7 = 0.0f;
            while (i10 < this.H1.length()) {
                int length = length();
                TextPaint textPaint = this.G1;
                float measureText = i10 < length ? getPaint().measureText(getText(), i10, i10 + 1) : textPaint.measureText(this.H1, i10, i10 + 1);
                if (i10 < length()) {
                    f7 += measureText;
                    canvas2 = canvas;
                } else {
                    int color = textPaint.getColor();
                    canvas.save();
                    String str = this.H1;
                    textPaint.getTextBounds(str, 0, str.length(), this.I1);
                    z(i10);
                    canvas2 = canvas;
                    canvas2.drawText(this.H1, i10, i10 + 1, f7, (r5.height() + getHeight()) / 2.0f, (Paint) textPaint);
                    f7 += measureText;
                    canvas2.restore();
                    textPaint.setColor(color);
                }
                i10++;
                canvas = canvas2;
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.qt, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        invalidate();
    }

    public void setHintText(String str) {
        this.H1 = str;
        invalidate();
        setText(getText());
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView
    public void setTextSize(int i10, float f7) {
        super.setTextSize(i10, f7);
        this.G1.setTextSize(TypedValue.applyDimension(i10, f7, getResources().getDisplayMetrics()));
    }

    public void z(int i10) {
    }
}
