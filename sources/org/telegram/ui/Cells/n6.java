package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
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
public final class n6 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final RadioButton c;
    public boolean d;

    public n6(Context context, boolean z10) {
        super(context);
        RadioButton radioButton = new RadioButton(context);
        this.c = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        if (z10) {
            org.telegram.ui.ActionBar.f7.P(radioButton, org.telegram.ui.ActionBar.y6.D5, org.telegram.ui.ActionBar.y6.E5, null);
        } else {
            org.telegram.ui.ActionBar.f7.P(radioButton, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.h7, null);
        }
        boolean z11 = LocaleController.isRTL;
        addView(radioButton, kb1.h(22, 22.0f, (z11 ? 5 : 3) | 48, z11 ? 0 : 20, 10.0f, z11 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        if (z10) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, null);
        } else {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
        }
        wh.r(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z12 = LocaleController.isRTL;
        addView(textView, kb1.h(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 23 : 61, 10.0f, z12 ? 61 : 23, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        if (z10) {
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q5, null);
        } else {
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.z6, null);
        }
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
        boolean z13 = LocaleController.isRTL;
        addView(textView2, kb1.h(-2, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 17 : 61, 35.0f, z13 ? 61 : 17, 0.0f));
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
            canvas.drawLine(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 60.0f), getHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 60.0f : 0.0f), getHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
    }
}
