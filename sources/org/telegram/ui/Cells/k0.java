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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class k0 extends FrameLayout {
    public final int a;
    public final ImageView b;
    public final ImageView c;
    public final j0 d;

    public k0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, w7.x5.d(24, 24.0f, 51, 17.0f, 12.0f, 0.0f, 0.0f));
        j0 j0Var = new j0(0, context, null, true);
        this.d = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new ji.u4(this, 9));
        j0Var.setImportantForAccessibility(2);
        addView(j0Var, w7.x5.d(-1, 38.0f, 51, 54.0f, 5.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        addView(imageView2, w7.x5.d(24, 24.0f, 53, 0.0f, 12.0f, 17.0f, 0.0f));
        imageView.setImageResource(R.drawable.msg_brightness_low);
        imageView2.setImageResource(R.drawable.msg_brightness_high);
        this.a = 48;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = org.telegram.ui.ActionBar.j6.m6;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.b.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), mode));
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
