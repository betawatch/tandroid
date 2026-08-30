package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c9 extends FrameLayout {
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
        new hh.g("animationProgress", 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationProgress(float f10) {
        this.f = f10;
        Math.max(this.h, getMeasuredWidth() - this.h);
        AndroidUtilities.dp(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z4) {
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        this.c.a(false, false);
        this.d = z4;
        textView2.setVisibility(0);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z4);
    }

    public final void c() {
        RadioButton radioButton = this.c;
        TextView textView = this.b;
        TextView textView2 = this.a;
        int i10 = this.r;
        boolean z4 = this.n;
        boolean z10 = LocaleController.isRTL;
        if (z4 == z10) {
            return;
        }
        this.n = z10;
        textView2.setGravity((z10 ? 5 : 3) | 16);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        boolean z11 = LocaleController.isRTL;
        layoutParams.gravity = (z11 ? 5 : 3) | 48;
        layoutParams.leftMargin = AndroidUtilities.dp(z11 ? i10 : 64.0f);
        layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : i10);
        textView2.setLayoutParams(layoutParams);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
        boolean z12 = LocaleController.isRTL;
        layoutParams2.gravity = (z12 ? 5 : 3) | 48;
        layoutParams2.leftMargin = AndroidUtilities.dp(z12 ? i10 : 64.0f);
        layoutParams2.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : i10);
        textView.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams3.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
        radioButton.setLayoutParams(layoutParams3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        TextView textView = this.b;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        RadioButton radioButton = this.c;
        accessibilityNodeInfo.setChecked(radioButton.f);
        accessibilityNodeInfo.setContentDescription(LocaleController.getString(radioButton.f ? R.string.NotificationsOn : R.string.NotificationsOff));
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getText());
        if (!TextUtils.isEmpty(textView.getText())) {
            sb.append("\n");
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.b.getVisibility() == 0 ? 64.0f : this.e) + (this.d ? 1 : 0), TLObject.FLAG_30));
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

    public void setChecked(boolean z4) {
        this.c.a(z4, true);
    }

    public void setHeight(int i10) {
        this.e = i10;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        super.setPressed(z4);
    }

    public void setTypeface(Typeface typeface) {
        this.a.setTypeface(typeface);
    }
}
