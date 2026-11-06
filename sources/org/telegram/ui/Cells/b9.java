package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class b9 extends FrameLayout {
    public TextView a;
    public TextView b;
    public RadioButton c;
    public boolean d;
    public int e;
    public float f;
    public float h;
    public boolean n;
    public int r;

    static {
        new o8("animationProgress", 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationProgress(float f10) {
        this.f = f10;
        Math.max(this.h, getMeasuredWidth() - this.h);
        org.telegram.messenger.g0.L(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z9) {
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        this.c.a(false, false);
        this.d = z9;
        textView2.setVisibility(0);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = org.telegram.messenger.g0.L(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z9);
    }

    public final void c() {
        RadioButton radioButton = this.c;
        TextView textView = this.b;
        TextView textView2 = this.a;
        int i7 = this.r;
        boolean z9 = this.n;
        boolean z10 = hd.a0;
        if (z9 == z10) {
            return;
        }
        this.n = z10;
        textView2.setGravity((z10 ? 5 : 3) | 16);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        boolean z11 = hd.a0;
        layoutParams.gravity = (z11 ? 5 : 3) | 48;
        layoutParams.leftMargin = org.telegram.messenger.g0.L(z11 ? i7 : 64.0f);
        layoutParams.rightMargin = org.telegram.messenger.g0.L(hd.a0 ? 64.0f : i7);
        textView2.setLayoutParams(layoutParams);
        textView.setGravity(hd.a0 ? 5 : 3);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
        boolean z12 = hd.a0;
        layoutParams2.gravity = (z12 ? 5 : 3) | 48;
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(z12 ? i7 : 64.0f);
        layoutParams2.rightMargin = org.telegram.messenger.g0.L(hd.a0 ? 64.0f : i7);
        textView.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams3.gravity = (hd.a0 ? 5 : 3) | 16;
        radioButton.setLayoutParams(layoutParams3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? org.telegram.messenger.g0.L(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        TextView textView = this.b;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        RadioButton radioButton = this.c;
        accessibilityNodeInfo.setChecked(radioButton.f);
        accessibilityNodeInfo.setContentDescription(hd.M0(radioButton.f ? 2131747891 : 2131747893, null));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.a.getText());
        if (!TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.b.getVisibility() == 0 ? 64.0f : this.e) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.h = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        clearAnimation();
        super.setBackgroundColor(i7);
    }

    public void setChecked(boolean z9) {
        this.c.a(z9, true);
    }

    public void setHeight(int i7) {
        this.e = i7;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        super.setPressed(z9);
    }

    public void setTypeface(Typeface typeface) {
        this.a.setTypeface(typeface);
    }
}
