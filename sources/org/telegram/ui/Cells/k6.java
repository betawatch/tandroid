package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class k6 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final RadioButton c;
    public int d;

    public k6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = 50;
        RadioButton radioButton = new RadioButton(context);
        this.c = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.D5, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E5, f6Var));
        boolean z10 = LocaleController.isRTL;
        addView(radioButton, w7.x5.d(22, 22.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 18, 14.0f, z10 ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        wl.n(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z11 = LocaleController.isRTL;
        addView(textView, w7.x5.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 51, 13.0f, z11 ? 51 : 21, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        wl.n(org.telegram.ui.ActionBar.j6.y6, f6Var, textView2, 1, 14.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setVisibility(8);
        boolean z12 = LocaleController.isRTL;
        addView(textView2, w7.x5.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 21 : 51, 37.0f, z12 ? 51 : 21, 0.0f));
    }

    public final void a(int i10, int i11) {
        this.c.b(i10, i11);
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.a.setText(charSequence);
        this.b.setVisibility(8);
        this.c.a(z10, false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.c.f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        TextView textView = this.b;
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(72.0f), TLObject.FLAG_30), i11);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        int dp = AndroidUtilities.dp(this.d);
        if (textView.getVisibility() == 0) {
            i12 = textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        } else {
            i12 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(dp + i12, TLObject.FLAG_30));
    }
}
