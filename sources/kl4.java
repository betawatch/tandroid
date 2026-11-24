// default package

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kl4 extends FrameLayout {
    public dx9 a;
    public float b;
    public float c;
    public float d;
    public ro e;
    public String f;
    public TextPaint h;
    public int n;

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.h;
        textPaint.setColor(cmb.w0(null, cmb.F6, false));
        canvas.drawText(this.f, gm.L(24.0f), gm.L(24.0f), textPaint);
        textPaint.setColor(cmb.w0(null, cmb.H6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - gm.L(8.0f)) - textPaint.measureText(format), this.a.getY() + gm.L(23.0f), textPaint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.n != size) {
            dx9 dx9Var = this.a;
            float floatValue = ((Float) this.e.get(null)).floatValue();
            float f = this.b;
            dx9Var.setProgress((floatValue - f) / (this.c - f));
            this.n = size;
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        return super.performAccessibilityAction(i, bundle) || this.a.getSeekBarAccessibilityDelegate().g(this, i, bundle);
    }
}
