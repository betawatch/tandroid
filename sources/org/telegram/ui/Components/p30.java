package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.TypedValue;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class p30 extends EditTextBoldCursor {
    public final TextPaint b;
    public String c;
    public final Rect d;

    public p30(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        this.d = new Rect();
        textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
    }

    public String getHintText() {
        return this.c;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ot, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.c != null && length() < this.c.length()) {
            int i9 = 0;
            float f10 = 0.0f;
            while (i9 < this.c.length()) {
                int length = length();
                TextPaint textPaint = this.b;
                float measureText = i9 < length ? getPaint().measureText(getText(), i9, i9 + 1) : textPaint.measureText(this.c, i9, i9 + 1);
                if (i9 < length()) {
                    f10 += measureText;
                    canvas2 = canvas;
                } else {
                    int color = textPaint.getColor();
                    canvas.save();
                    String str = this.c;
                    textPaint.getTextBounds(str, 0, str.length(), this.d);
                    i(i9);
                    canvas2 = canvas;
                    canvas2.drawText(this.c, i9, i9 + 1, f10, (r5.height() + getHeight()) / 2.0f, (Paint) textPaint);
                    f10 += measureText;
                    canvas2.restore();
                    textPaint.setColor(color);
                }
                i9++;
                canvas = canvas2;
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ot, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        invalidate();
    }

    public void setHintText(String str) {
        this.c = str;
        invalidate();
        setText(getText());
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView
    public void setTextSize(int i9, float f10) {
        super.setTextSize(i9, f10);
        this.b.setTextSize(TypedValue.applyDimension(i9, f10, getResources().getDisplayMetrics()));
    }

    public void i(int i9) {
    }
}
