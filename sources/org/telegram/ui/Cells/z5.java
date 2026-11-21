package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.ra0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class z5 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final Switch d;
    public boolean e;
    public boolean f;
    public final org.telegram.ui.ActionBar.h6 h;

    public z5(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = h6Var;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ma.d(28, 28.0f, (gd.a0 ? 5 : 3) | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        n10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((gd.a0 ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = gd.a0;
        addView(textView, c8.ma.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 66.0f : 64.0f, 8.0f, z10 ? 64.0f : 66.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.z6, h6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(gd.a0 ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(1.66f), 1.0f);
        boolean z11 = gd.a0;
        addView(textView2, c8.ma.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 66.0f : 64.0f, 31.0f, z11 ? 64.0f : 66.0f, 10.0f));
        Switch r32 = new Switch(context, h6Var);
        this.d = r32;
        int i7 = org.telegram.ui.ActionBar.m6.M6;
        int i10 = org.telegram.ui.ActionBar.m6.N6;
        int i11 = org.telegram.ui.ActionBar.m6.d6;
        r32.d(i7, i10, i11, i11);
        addView(r32, c8.ma.d(37, 40.0f, (gd.a0 ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, q30 q30Var, int i7, boolean z10) {
        this.a.setText(str);
        org.telegram.ui.ActionBar.h6 h6Var = this.h;
        boolean d = h6Var != null ? h6Var.d() : org.telegram.ui.ActionBar.m6.I.q();
        ra0 ra0Var = new ra0(1);
        ra0Var.b(q30Var.a, q30Var.b);
        ra0Var.b = d;
        ImageView imageView = this.c;
        imageView.setBackground(ra0Var);
        imageView.setImageResource(i7);
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
            org.telegram.ui.ActionBar.h6 h6Var = this.h;
            Paint g10 = h6Var != null ? h6Var.g("paintDivider") : org.telegram.ui.ActionBar.m6.k0;
            if (g10 == null) {
                g10 = org.telegram.ui.ActionBar.m6.k0;
            }
            Paint paint = g10;
            if (paint != null) {
                canvas.drawLine(gd.a0 ? 0.0f : org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (gd.a0 ? org.telegram.messenger.g0.L(19.0f) : 0), getMeasuredHeight() - 1, paint);
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
