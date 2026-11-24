package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.tgnet.TLObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ColorPicker$RadioButton extends View {
    public final Paint a;
    public ObjectAnimator b;
    public float c;
    public boolean d;
    public int e;

    public ColorPicker$RadioButton(Context context) {
        super(context);
        this.a = new Paint(1);
    }

    public final void a(int i) {
        this.e = i;
        invalidate();
    }

    public final void b(boolean z) {
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        boolean z2 = this.d;
        if (!z) {
            setCheckedState(z2 ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", z2 ? 1.0f : 0.0f);
        this.b = ofFloat;
        ofFloat.setDuration(200L);
        this.b.start();
    }

    public float getCheckedState() {
        return this.c;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L = gm.L(15.0f);
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        int i = this.e;
        Paint paint = this.a;
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(3.0f));
        paint.setAlpha(Math.round(this.c * 255.0f));
        canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
        paint.setAlpha(nm7.d4);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(measuredWidth, measuredHeight, L - (gm.L(5.0f) * this.c), paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(jb6.M0(2131751952, null));
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.d);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(30.0f), TLObject.FLAG_30));
    }

    public void setCheckedState(float f) {
        this.c = f;
        invalidate();
    }
}
