package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k6 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final RadioButton c;
    public int d;

    public k6(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.d = 50;
        RadioButton radioButton = new RadioButton(context);
        this.c = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.D5, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E5, b6Var));
        boolean z10 = LocaleController.isRTL;
        addView(radioButton, g7.e6.d(22, 22.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 18, 14.0f, z10 ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        ll.n(org.telegram.ui.ActionBar.f6.j5, b6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z11 = LocaleController.isRTL;
        addView(textView, g7.e6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 51, 13.0f, z11 ? 51 : 21, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        ll.n(org.telegram.ui.ActionBar.f6.y6, b6Var, textView2, 1, 14.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setVisibility(8);
        boolean z12 = LocaleController.isRTL;
        addView(textView2, g7.e6.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 21 : 51, 37.0f, z12 ? 51 : 21, 0.0f));
    }

    public final void a(int i9, int i10) {
        this.c.b(i9, i10);
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        TextView textView = this.b;
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(72.0f), TLObject.FLAG_30), i10);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30);
        int dp = AndroidUtilities.dp(this.d);
        if (textView.getVisibility() == 0) {
            i11 = textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        } else {
            i11 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(dp + i11, TLObject.FLAG_30));
    }
}
