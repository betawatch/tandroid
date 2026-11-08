package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
class ColorPicker$RadioButton extends View {
    public final Paint a;
    public ObjectAnimator b;
    public float c;
    public boolean d;
    public int e;

    public ColorPicker$RadioButton(Context context) {
        super(context);
        this.a = new Paint(1);
    }

    public final void a(int i7) {
        this.e = i7;
        invalidate();
    }

    public final void b(boolean z9) {
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z9) {
            setCheckedState(this.d ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", this.d ? 1.0f : 0.0f);
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
        float L = org.telegram.messenger.g0.L(15.0f);
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        int i7 = this.e;
        Paint paint = this.a;
        paint.setColor(i7);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setAlpha(Math.round(this.c * 255.0f));
        canvas.drawCircle(measuredWidth, measuredHeight, L - (paint.getStrokeWidth() * 0.5f), paint);
        paint.setAlpha(org.telegram.messenger.qs.e4);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(measuredWidth, measuredHeight, L - (org.telegram.messenger.g0.L(5.0f) * this.c), paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(org.telegram.messenger.id.M0(2131752015, null));
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.d);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
    }

    public void setCheckedState(float f10) {
        this.c = f10;
        invalidate();
    }
}
