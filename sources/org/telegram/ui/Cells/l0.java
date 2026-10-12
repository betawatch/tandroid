package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class l0 extends FrameLayout {
    public final int a;
    public final ImageView b;
    public final ImageView c;
    public final k0 d;

    public l0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, w7.a6.a(24.0f, 17.0f, 12.0f, 0.0f, 0.0f, 24, 51));
        k0 k0Var = new k0(0, context, null, true);
        this.d = k0Var;
        k0Var.setReportChanges(true);
        k0Var.setDelegate(new l2.f(this, 6));
        k0Var.setImportantForAccessibility(2);
        addView(k0Var, w7.a6.a(38.0f, 54.0f, 5.0f, 54.0f, 0.0f, -1, 51));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        addView(imageView2, w7.a6.a(24.0f, 0.0f, 12.0f, 17.0f, 0.0f, 24, 53));
        imageView.setImageResource(R.drawable.msg_brightness_low);
        imageView2.setImageResource(R.drawable.msg_brightness_high);
        this.a = 48;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = org.telegram.ui.ActionBar.g6.m6;
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.b.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i10, false), mode));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.d.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.a), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.d.getSeekBarAccessibilityDelegate().g(this, i10, bundle);
    }

    public void setProgress(float f7) {
        this.d.setProgress(f7);
    }
}
