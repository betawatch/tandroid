package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class j6 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final RadioButton c;
    public int d;

    public j6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = 50;
        RadioButton radioButton = new RadioButton(context);
        this.c = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.D5, org.telegram.ui.ActionBar.k6.E5, f6Var);
        boolean z9 = hd.a0;
        addView(radioButton, c8.ha.d(22, 22.0f, (z9 ? 5 : 3) | 48, z9 ? 0 : 18, 14.0f, z9 ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, f6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((hd.a0 ? 5 : 3) | 16);
        boolean z10 = hd.a0;
        addView(textView, c8.ha.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 51, 13.0f, z10 ? 51 : 21, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.y6, f6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((hd.a0 ? 5 : 3) | 16);
        textView2.setVisibility(8);
        boolean z11 = hd.a0;
        addView(textView2, c8.ha.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 51, 37.0f, z11 ? 51 : 21, 0.0f));
    }

    public final void a(int i7, int i10) {
        this.c.b(i7, i10);
    }

    public final void b(CharSequence charSequence, boolean z9) {
        this.a.setText(charSequence);
        this.b.setVisibility(8);
        this.c.a(z9, false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.c.f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        TextView textView = this.b;
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(72.0f), TLObject.FLAG_30), i10);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30);
        int L = org.telegram.messenger.g0.L(this.d);
        if (textView.getVisibility() == 0) {
            i11 = textView.getMeasuredHeight() + org.telegram.messenger.g0.L(4.0f);
        } else {
            i11 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(L + i11, TLObject.FLAG_30));
    }
}
