package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class i6 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final RadioButton c;
    public boolean d;

    public i6(Context context, boolean z10) {
        super(context);
        RadioButton radioButton = new RadioButton(context);
        this.c = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        if (z10) {
            org.telegram.ui.ActionBar.t6.O(radioButton, org.telegram.ui.ActionBar.m6.D5, org.telegram.ui.ActionBar.m6.E5, null);
        } else {
            org.telegram.ui.ActionBar.t6.O(radioButton, org.telegram.ui.ActionBar.m6.g7, org.telegram.ui.ActionBar.m6.h7, null);
        }
        boolean z11 = hd.a0;
        addView(radioButton, c8.ma.d(22, 22.0f, (z11 ? 5 : 3) | 48, z11 ? 0 : 20, 10.0f, z11 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        if (z10) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, null);
        } else {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
        }
        o10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((hd.a0 ? 5 : 3) | 16);
        boolean z12 = hd.a0;
        addView(textView, c8.ma.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 23 : 61, 10.0f, z12 ? 61 : 23, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        if (z10) {
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.q5, null);
        } else {
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.z6, null);
        }
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(hd.a0 ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(12.0f));
        boolean z13 = hd.a0;
        addView(textView2, c8.ma.d(-2, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 17 : 61, 35.0f, z13 ? 61 : 17, 0.0f));
    }

    public final void a(boolean z10) {
        this.c.a(z10, true);
    }

    public final void b(String str, String str2, boolean z10, boolean z11) {
        this.a.setText(str);
        this.b.setText(str2);
        this.c.a(z11, false);
        this.d = z10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(org.telegram.messenger.g0.L(hd.a0 ? 0.0f : 60.0f), getHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(hd.a0 ? 60.0f : 0.0f), getHeight() - 1, org.telegram.ui.ActionBar.m6.k0);
        }
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
    }
}
