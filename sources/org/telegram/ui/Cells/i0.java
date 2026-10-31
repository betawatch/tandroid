package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class i0 extends FrameLayout {
    public final int a;
    public final ImageView b;
    public final ImageView c;
    public final h0 d;

    public i0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, w7.b6.d(24, 24.0f, 51, 17.0f, 12.0f, 0.0f, 0.0f));
        h0 h0Var = new h0(0, context, null, true);
        this.d = h0Var;
        h0Var.setReportChanges(true);
        h0Var.setDelegate(new k2.m0(this));
        h0Var.setImportantForAccessibility(2);
        addView(h0Var, w7.b6.d(-1, 38.0f, 51, 54.0f, 5.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        addView(imageView2, w7.b6.d(24, 24.0f, 53, 0.0f, 12.0f, 17.0f, 0.0f));
        imageView.setImageResource(R.drawable.msg_brightness_low);
        imageView2.setImageResource(R.drawable.msg_brightness_high);
        this.a = 48;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = org.telegram.ui.ActionBar.t6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(this.b, i10, null, mode);
        org.telegram.ui.ActionBar.a7.t(this.c, i10, null, mode);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.d.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.a), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.d.getSeekBarAccessibilityDelegate().g(this, i10, bundle);
    }

    public void setProgress(float f7) {
        this.d.setProgress(f7);
    }
}
