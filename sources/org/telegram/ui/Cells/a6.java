package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.qc0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a6 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final Switch d;
    public boolean e;
    public boolean f;
    public final org.telegram.ui.ActionBar.e6 h;

    public a6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = e6Var;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.a(28.0f, 18.0f, 16.0f, 18.0f, 9.0f, 28, (LocaleController.isRTL ? 5 : 3) | 48));
        TextView textView = new TextView(context);
        this.a = textView;
        bi.o(org.telegram.ui.ActionBar.i6.G6, e6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        addView(textView, w7.x5.a(-2.0f, z10 ? 66.0f : 64.0f, 8.0f, z10 ? 64.0f : 66.0f, 0.0f, -1, (z10 ? 5 : 3) | 48));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        bi.o(org.telegram.ui.ActionBar.i6.z6, e6Var, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(AndroidUtilities.dp(1.66f), 1.0f);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, w7.x5.a(-2.0f, z11 ? 66.0f : 64.0f, 31.0f, z11 ? 64.0f : 66.0f, 10.0f, -2, (z11 ? 5 : 3) | 48));
        Switch r32 = new Switch(context, e6Var);
        this.d = r32;
        int i10 = org.telegram.ui.ActionBar.i6.M6;
        int i11 = org.telegram.ui.ActionBar.i6.N6;
        int i12 = org.telegram.ui.ActionBar.i6.d6;
        r32.d(i10, i11, i12, i12);
        addView(r32, w7.x5.a(40.0f, 21.0f, 10.0f, 19.0f, 0.0f, 37, (LocaleController.isRTL ? 3 : 5) | 48));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, d50 d50Var, int i10, boolean z10) {
        this.a.setText(str);
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        boolean a2 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.i6.I.q();
        qc0 qc0Var = new qc0(1);
        qc0Var.b(d50Var.a, d50Var.b);
        qc0Var.b = a2;
        ImageView imageView = this.c;
        imageView.setBackground(qc0Var);
        imageView.setImageResource(i10);
        boolean z11 = this.e;
        Switch r02 = this.d;
        r02.b(0, z10, z11);
        this.b.setText(str2);
        r02.setContentDescription(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            org.telegram.ui.ActionBar.e6 e6Var = this.h;
            Paint F = e6Var != null ? e6Var.F("paintDivider") : org.telegram.ui.ActionBar.i6.k0;
            if (F == null) {
                F = org.telegram.ui.ActionBar.i6.k0;
            }
            Paint paint = F;
            if (paint != null) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(19.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(19.0f) : 0), getMeasuredHeight() - 1, paint);
            }
        }
    }

    public Switch getCheckBox() {
        return this.d;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.a.getText());
        TextView textView = this.b;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.e = z10;
    }

    public void setChecked(boolean z10) {
        this.d.b(0, z10, true);
    }

    public void setDivider(boolean z10) {
        this.f = z10;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
