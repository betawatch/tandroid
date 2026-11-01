package fg;

import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.on0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class k extends FrameLayout {
    public on0 a;
    public float b;
    public float c;
    public float d;
    public h6 e;
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
        textPaint.setColor(t6.x0(null, t6.G6, false));
        canvas.drawText(this.f, i0.L(24.0f), i0.L(24.0f), textPaint);
        textPaint.setColor(t6.x0(null, t6.I6, false));
        String format = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.d));
        canvas.drawText(format, (getMeasuredWidth() - i0.L(8.0f)) - textPaint.measureText(format), this.a.getY() + i0.L(23.0f), textPaint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.n != size) {
            on0 on0Var = this.a;
            float floatValue = ((Float) this.e.get(null)).floatValue();
            float f7 = this.b;
            on0Var.setProgress((floatValue - f7) / (this.c - f7));
            this.n = size;
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.a.getSeekBarAccessibilityDelegate().g(this, i10, bundle);
    }
}
