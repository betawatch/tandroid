package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n6 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final RadioButton c;
    public int d;

    public n6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.d = 50;
        RadioButton radioButton = new RadioButton(context);
        this.c = radioButton;
        radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
        org.telegram.ui.ActionBar.a7.P(radioButton, org.telegram.ui.ActionBar.t6.D5, org.telegram.ui.ActionBar.t6.E5, p6Var);
        boolean z10 = cd.X;
        addView(radioButton, w7.b6.d(22, 22.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 18, 14.0f, z10 ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, p6Var);
        z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((cd.X ? 5 : 3) | 16);
        boolean z11 = cd.X;
        addView(textView, w7.b6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 51, 13.0f, z11 ? 51 : 21, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.y6, p6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((cd.X ? 5 : 3) | 16);
        textView2.setVisibility(8);
        boolean z12 = cd.X;
        addView(textView2, w7.b6.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 21 : 51, 37.0f, z12 ? 51 : 21, 0.0f));
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
            textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(72.0f), TLObject.FLAG_30), i11);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        int L = org.telegram.messenger.i0.L(this.d);
        if (textView.getVisibility() == 0) {
            i12 = textView.getMeasuredHeight() + org.telegram.messenger.i0.L(4.0f);
        } else {
            i12 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(L + i12, TLObject.FLAG_30));
    }
}
