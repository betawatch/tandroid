package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d9 extends FrameLayout {
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
        new mh.g("animationProgress", 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationProgress(float f7) {
        this.f = f7;
        Math.max(this.h, getMeasuredWidth() - this.h);
        org.telegram.messenger.i0.L(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z10) {
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        this.c.a(false, false);
        this.d = z10;
        textView2.setVisibility(0);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = org.telegram.messenger.i0.L(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z10);
    }

    public final void c() {
        RadioButton radioButton = this.c;
        TextView textView = this.b;
        TextView textView2 = this.a;
        int i10 = this.r;
        boolean z10 = this.n;
        boolean z11 = cd.X;
        if (z10 == z11) {
            return;
        }
        this.n = z11;
        textView2.setGravity((z11 ? 5 : 3) | 16);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        boolean z12 = cd.X;
        layoutParams.gravity = (z12 ? 5 : 3) | 48;
        layoutParams.leftMargin = org.telegram.messenger.i0.L(z12 ? i10 : 64.0f);
        layoutParams.rightMargin = org.telegram.messenger.i0.L(cd.X ? 64.0f : i10);
        textView2.setLayoutParams(layoutParams);
        textView.setGravity(cd.X ? 5 : 3);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
        boolean z13 = cd.X;
        layoutParams2.gravity = (z13 ? 5 : 3) | 48;
        layoutParams2.leftMargin = org.telegram.messenger.i0.L(z13 ? i10 : 64.0f);
        layoutParams2.rightMargin = org.telegram.messenger.i0.L(cd.X ? 64.0f : i10);
        textView.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams3.gravity = (cd.X ? 5 : 3) | 16;
        radioButton.setLayoutParams(layoutParams3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(cd.X ? 0.0f : org.telegram.messenger.i0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        TextView textView = this.b;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        RadioButton radioButton = this.c;
        accessibilityNodeInfo.setChecked(radioButton.f);
        accessibilityNodeInfo.setContentDescription(cd.L0(radioButton.f ? 2131747908 : 2131747910, null));
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.b.getVisibility() == 0 ? 64.0f : this.e) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.h = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        clearAnimation();
        super.setBackgroundColor(i10);
    }

    public void setChecked(boolean z10) {
        this.c.a(z10, true);
    }

    public void setHeight(int i10) {
        this.e = i10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.a.setTypeface(typeface);
    }
}
