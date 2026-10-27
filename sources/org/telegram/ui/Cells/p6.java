package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p6 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final RadioButton c;
    public int d;

    public p6(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = 50;
        RadioButton radioButton = new RadioButton(context);
        this.c = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.f7.P(radioButton, org.telegram.ui.ActionBar.y6.D5, org.telegram.ui.ActionBar.y6.E5, u6Var);
        boolean z10 = LocaleController.isRTL;
        addView(radioButton, kb1.h(22, 22.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 18, 14.0f, z10 ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, u6Var);
        wh.r(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z11 = LocaleController.isRTL;
        addView(textView, kb1.h(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 51, 13.0f, z11 ? 51 : 21, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.y6, u6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setVisibility(8);
        boolean z12 = LocaleController.isRTL;
        addView(textView2, kb1.h(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 21 : 51, 37.0f, z12 ? 51 : 21, 0.0f));
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
