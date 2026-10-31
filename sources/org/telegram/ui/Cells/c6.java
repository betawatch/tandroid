package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.va0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c6 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final Switch d;
    public boolean e;
    public boolean f;
    public final org.telegram.ui.ActionBar.p6 h;

    public c6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = p6Var;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.b6.d(28, 28.0f, (cd.X ? 5 : 3) | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((cd.X ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = cd.X;
        addView(textView, w7.b6.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 66.0f : 64.0f, 8.0f, z10 ? 64.0f : 66.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.z6, p6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(cd.X ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(org.telegram.messenger.i0.L(1.66f), 1.0f);
        boolean z11 = cd.X;
        addView(textView2, w7.b6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 66.0f : 64.0f, 31.0f, z11 ? 64.0f : 66.0f, 10.0f));
        Switch r32 = new Switch(context, p6Var);
        this.d = r32;
        int i10 = org.telegram.ui.ActionBar.t6.M6;
        int i11 = org.telegram.ui.ActionBar.t6.N6;
        int i12 = org.telegram.ui.ActionBar.t6.d6;
        r32.d(i10, i11, i12, i12);
        addView(r32, w7.b6.d(37, 40.0f, (cd.X ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, u30 u30Var, int i10, boolean z10) {
        this.a.setText(str);
        org.telegram.ui.ActionBar.p6 p6Var = this.h;
        boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
        va0 va0Var = new va0(1);
        va0Var.b(u30Var.a, u30Var.b);
        va0Var.b = a2;
        ImageView imageView = this.c;
        imageView.setBackground(va0Var);
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
            org.telegram.ui.ActionBar.p6 p6Var = this.h;
            Paint d = p6Var != null ? p6Var.d("paintDivider") : org.telegram.ui.ActionBar.t6.k0;
            if (d == null) {
                d = org.telegram.ui.ActionBar.t6.k0;
            }
            Paint paint = d;
            if (paint != null) {
                canvas.drawLine(cd.X ? 0.0f : org.telegram.messenger.i0.L(19.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(19.0f) : 0), getMeasuredHeight() - 1, paint);
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
