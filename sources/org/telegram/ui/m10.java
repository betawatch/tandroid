package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m10 extends FrameLayout {
    public TextView a;
    public TextView b;
    public org.telegram.ui.Components.jh0 c;
    public boolean d;
    public TLRPC.TL_dialogFilterSuggested e;

    public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setText(this.c.getText());
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(64.0f));
        measureChildWithMargins(this.c, i9, 0, i10, 0);
        TextView textView = this.a;
        org.telegram.ui.Components.jh0 jh0Var = this.c;
        measureChildWithMargins(textView, i9, jh0Var.getMeasuredWidth(), i10, 0);
        measureChildWithMargins(this.b, i9, jh0Var.getMeasuredWidth(), i10, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
